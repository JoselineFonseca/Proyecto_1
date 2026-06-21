/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Modelo.*;
import Negocio.*;
import Excepciones.DatoInvalidoException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MatriculaPanel extends javax.swing.JPanel {

    private MatriculaNegocio negocio = new MatriculaNegocio();
    private EstudianteNegocio estNegocio = new EstudianteNegocio();
    private CursoNegocio cursoNegocio = new CursoNegocio();

    private JTextField txtId;
    private JTextField txtFecha;

    private JComboBox<Estudiante> cboEstudiante;
    private JComboBox<Curso> cboCurso;
    private JComboBox<String> cboEstado;

    private JTable tblMatriculas;

    public MatriculaPanel() {
        initComponents();
        cargarCombos();
        cargarTabla();
    }

    private void cargarCombos() {

        for (Estudiante e : estNegocio.listar()) {
            cboEstudiante.addItem(e);
        }

        for (Curso c : cursoNegocio.listar()) {
            cboCurso.addItem(c);
        }
    }

    private void cargarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) tblMatriculas.getModel();
        modelo.setRowCount(0);

        for (Matricula m : negocio.listar()) {

            modelo.addRow(new Object[]{
                    m.getId(),
                    m.getEstudiante().getnombre(),
                    m.getCurso().getNombre(),
                    m.getFecha(),
                    m.getEstado()
            });
        }
    }

    private void initComponents() {

        txtId = new JTextField();
        txtFecha = new JTextField();

        cboEstudiante = new JComboBox<>();
        cboCurso = new JComboBox<>();
        cboEstado = new JComboBox<>();

        cboEstado.addItem("Activa");
        cboEstado.addItem("Cancelada");

        JButton btnGuardar = new JButton("Guardar");
        JButton btnEliminar = new JButton("Eliminar");

        tblMatriculas = new JTable(new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Estudiante", "Curso", "Fecha", "Estado"}
        ));

        setLayout(new java.awt.BorderLayout());

        JPanel form = new JPanel(new java.awt.GridLayout(5,2));

        form.add(new JLabel("ID"));
        form.add(txtId);

        form.add(new JLabel("Estudiante"));
        form.add(cboEstudiante);

        form.add(new JLabel("Curso"));
        form.add(cboCurso);

        form.add(new JLabel("Fecha"));
        form.add(txtFecha);

        form.add(new JLabel("Estado"));
        form.add(cboEstado);

        add(form, java.awt.BorderLayout.NORTH);
        add(new JScrollPane(tblMatriculas), java.awt.BorderLayout.CENTER);

        JPanel botones = new JPanel();

        btnGuardar.addActionListener(e -> guardar());
        btnEliminar.addActionListener(e -> eliminar());

        botones.add(btnGuardar);
        botones.add(btnEliminar);

        add(botones, java.awt.BorderLayout.SOUTH);
    }

    private void guardar() {

        try {

            Matricula m = new Matricula(
                    Integer.parseInt(txtId.getText()),
                    (Estudiante) cboEstudiante.getSelectedItem(),
                    (Curso) cboCurso.getSelectedItem(),
                    txtFecha.getText(),
                    cboEstado.getSelectedItem().toString()
            );

            negocio.registrar(m);
            cargarTabla();

            JOptionPane.showMessageDialog(this, "Matrícula registrada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void eliminar() {

        int id = Integer.parseInt(txtId.getText());

        negocio.eliminar(id);
        cargarTabla();

        JOptionPane.showMessageDialog(this, "Matrícula eliminada");
    }
}