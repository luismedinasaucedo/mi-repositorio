import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pantallaInicio extends JFrame {
static JFrame pantalla=new JFrame();
    pantallaInicio(){
    pantalla.setTitle("Jugos");
    pantalla.getContentPane().setBackground(Color.gray); // Se usa getContentPane para el fondo
    pantalla.setExtendedState(JFrame.MAXIMIZED_BOTH);
    pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pantalla.setLocationRelativeTo(null);
    pantalla.setLayout(null);
}
    static void Inicio(){

        Boton boto1=new Boton("Entrar",10,10);
        Txt labe=new Txt("Contraseña",80,80);
        pantalla.add(labe);
        Campo contra=new Campo(160,160);
        pantalla.add(contra);

        pantalla.add(boto1);
        boto1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Acción ejecutada");
            }
        });

        pantalla.setVisible(true);
    }
}
public class Main {

    public static void main(String[] args) {
        pantallaInicio a=new pantallaInicio();
        pantallaInicio.Inicio();
    }
}