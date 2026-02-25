import javax.swing.*;
import java.awt.*;

public class RFC extends JFrame {
    JFrame frame=new JFrame();

    RFC(){
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }

    JLabel ResultadoRFC=new JLabel("hola mundo ");

    void metodo(){

        frame.add(ResultadoRFC);

        ResultadoRFC.setBounds(601,0,300,80);

        ResultadoRFC.setForeground(Color.BLACK);

        ResultadoRFC.setFont(new java.awt.Font("Arial",1,30));

        frame.setVisible(true);
    }

}
void main() {

    RFC a=new RFC();
    a.metodo();
}

