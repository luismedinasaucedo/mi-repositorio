import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RFC extends JFrame {
    JFrame frame=new JFrame();

    RFC(){
        frame.setTitle("Calculador de IMC");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }

    JLabel resultadoimc=new JLabel("");
    JLabel valoracion=new JLabel("");
    JButton botonimc=new JButton("Calcular imc");
    JButton salir=new JButton("Salir");
    JButton vector=new JButton("Almacenar");
    JLabel etq1=new JLabel("Peso");
    JLabel etq2=new JLabel("Altura");
    JTextField txt2=new JTextField();
    JTextField txt1=new JTextField();


    void metodo(){

        frame.add(resultadoimc);
        frame.add(vector);
        frame.add(salir);
        frame.add(valoracion);
        frame.add(botonimc);
        frame.add(etq1);
        frame.add(etq2);
        frame.add(txt2);
        frame.add(txt1);

        resultadoimc.setBounds(0,161,350,80);
        vector.setBounds(0,900,300,80);
        salir.setBounds(300,900,300,80);
        valoracion.setBounds(0,241,350,80);
        botonimc.setBounds(601,900,300,80);
        etq1.setBounds(0,0,300,80);
        etq2.setBounds(0,80,300,80);
        txt2.setBounds(301,80,300,80);
        txt1.setBounds(301,0,300,80);

        resultadoimc.setForeground(Color.BLACK);
        vector.setForeground(Color.BLACK);
        salir.setForeground(Color.BLACK);
        valoracion.setForeground(Color.BLACK);
        botonimc.setForeground(Color.BLACK);
        etq1.setForeground(Color.BLACK);
        etq2.setForeground(Color.BLACK);
        txt2.setForeground(Color.BLACK);
        txt1.setForeground(Color.BLACK);

        resultadoimc.setFont(new java.awt.Font("Arial",1,30));
        vector.setFont(new java.awt.Font("Arial",1,30));
        salir.setFont(new java.awt.Font("Arial",1,30));
        valoracion.setFont(new java.awt.Font("Arial",1,30));
        botonimc.setFont(new java.awt.Font("Arial",1,30));
        etq1.setFont(new java.awt.Font("Arial",1,30));
        etq2.setFont(new java.awt.Font("Arial",1,30));
        txt2.setFont(new java.awt.Font("Arial",1,30));
        txt1.setFont(new java.awt.Font("Arial",1,30));

        botonimc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1,n2,imc;
                n1=Double.parseDouble(txt1.getText());
                n2=Double.parseDouble(txt2.getText());
                n2=Math.pow(n2,2);
                imc=n1/n2;
                resultadoimc.setText("Su IMC es de: "+imc);
                if (imc<17){
                    valoracion.setText("peso bajo");
                }
                if (imc>17&imc<25){
                    valoracion.setText("peso normal");
                }
                if (imc>25&imc<30){
                    valoracion.setText("sobrepeso");
                }
                if (imc>30&imc<35){
                    valoracion.setText("obesidad 1");
                }
                if (imc>35&imc<40){
                    valoracion.setText("obesidad 2");
                }
                if (imc>40){
                    valoracion.setText("obesidad 3");
                }

            }
        });
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        vector.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] vector=new String[3];
                int i=0;
                vector[i]=resultadoimc.getText();
            }
        });
        frame.setVisible(true);
    }

}
void main() {

    RFC a=new RFC();
    a.metodo();
}

