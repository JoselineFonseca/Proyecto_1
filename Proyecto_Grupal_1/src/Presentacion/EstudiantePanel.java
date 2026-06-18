
package Presentacion;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
import javax.swing.*;
import Negocio.EstudianteNegocio;
import Modelo.Estudiante;
import Excepciones.*;

public class EstudiantePanel extends JPanel {
    private EstudianteNegocio negocio= new EstudianteNegocio ();
    public EstudiantePanel (){
        
        //boton para registar estudiante
        JButton btnRegistrar = new JButton ("Registrar");
        btnRegistrar.addActionListener (e -> {
            try {
                Estudiante est = new Estudiante (
                        1, 20,true ,"M","juan@correo.com", "Juan Pérez","Ingenería","88888888", "Ninguna"
                );
                negocio.registrar(est);
                JOptionPane.showMessageDialog(this,"Estudiante registrado correctamente");
            }catch (DatoInvalidoException | RegistrosDuplicadosException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        //agregar el boton al panel
        add(btnRegistrar);
}
}
