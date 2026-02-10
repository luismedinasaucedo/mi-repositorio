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
JButton botonRFC=new JButton("RFC");
JTextField txt1=new JTextField();
JLabel ResultadoRFC=new JLabel("su rfc es: ");

void metodo(){
    frame.add(botonRFC);
    frame.add(txt1);
    frame.add(ResultadoRFC);

    botonRFC.setBounds(0,0,300,80);
    txt1.setBounds(301,0,300,80);
    ResultadoRFC.setBounds(601,0,300,80);

    botonRFC.setForeground(Color.BLACK);
    txt1.setForeground(Color.BLACK);
    ResultadoRFC.setForeground(Color.BLACK);

    botonRFC.setFont(new java.awt.Font("Arial",1,30));
    txt1.setFont(new java.awt.Font("Arial",1,30));
    ResultadoRFC.setFont(new java.awt.Font("Arial",1,30));

    frame.setVisible(true);
}

}
void main() {

    RFC a=new RFC();
    a.metodo();
}
