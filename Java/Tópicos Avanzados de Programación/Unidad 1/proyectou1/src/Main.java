import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class pantallaInicio extends JFrame {
static JFrame pantalla=new JFrame();
    pantallaInicio(){
    pantalla.setTitle("Inicio de sesion");
    pantalla.getContentPane().setBackground(Color.gray); // Se usa getContentPane para el fondo
    pantalla.setExtendedState(JFrame.MAXIMIZED_BOTH);
    pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pantalla.setLocationRelativeTo(null);
    pantalla.setLayout(null);
}
    void Inicio(){
        Campo contra=new Campo(960,80);
        Boton boto1=new Boton("Entrar",880,160);
        Txt labe=new Txt("Contraseña",800,80);
        Txt sis= (Txt) pantalla.add(new Txt("Sistema",900,0));

        pantalla.add(labe);
        pantalla.add(contra);
        pantalla.add(boto1);




        boto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Usuario = contra.getText(); //Aqui ya usamos la variable usuario.
                if(Usuario.contentEquals("123")){ //Cuando agreguemos 123 en la caja de texto, entrará al segundo telar.
                    JOptionPane.showMessageDialog(null, "CLAVE CORRECTA!"); //JOPTION mostrara el mensaje con ventana emergente.
                    pantalla.setVisible(false); // Cerramos el inicial
                    Jugos objeto = new Jugos();
                    objeto.pantallaJ();
                }
                else {
                    JOptionPane.showMessageDialog(null, "CLAVE INCORRECTA");
                    System.exit(0);
                    dispose();
                }
            }
        });


        pantalla.setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        pantallaInicio a=new pantallaInicio();
        a.Inicio();
    }
}