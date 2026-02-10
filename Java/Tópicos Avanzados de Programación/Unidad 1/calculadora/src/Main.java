import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class calculadora extends JFrame {
    JFrame frame = new JFrame();

    calculadora() {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

    }
    JButton botoSumar=new JButton("sumar");
    JButton botoRestar=new JButton("Restar");//1 a
    JButton botoMultiplicar=new JButton("Multiplicar");
    JButton botoDividir=new JButton("Dividir");//2
    JButton botoFactorial=new JButton("Factorial");
    JButton botoPotencia=new JButton("Potencia");
    JButton botoPorcecntaje=new JButton("Porcecntaje");
    JButton botoRaiz=new JButton("raiz");
    JButton botoLimpiar=new JButton("limpiar");
    JButton botoSalir=new JButton("salir");

    JLabel etuquetamun1=new JLabel("num 1");
    JLabel etuquetamun2=new JLabel("num 2");
    JLabel ETQResultado=new JLabel("Resultado 1");
    JLabel ETQResultado2=new JLabel("resultado 2");
    JTextField txtf_1=new JTextField();
    JTextField txtf_2=new JTextField();

    double [] vector =new double[3];
    int ind = 0;

    void metodo(){
        frame.add(etuquetamun1);
        frame.add(etuquetamun2);
        frame.add(ETQResultado);
        frame.add(ETQResultado2);
        frame.add(txtf_1);
        frame.add(txtf_2);
        frame.add(botoSumar);
        frame.add(botoRaiz);
        frame.add(botoLimpiar);
        frame.add(botoSalir);
        frame.add(botoRestar);
        frame.add(botoMultiplicar);
        frame.add(botoDividir);
        frame.add(botoFactorial);
        frame.add(botoPotencia);
        frame.add(botoPorcecntaje);

        etuquetamun1.setBounds(70,150,350,80);
        txtf_1.setBounds(440,150,300,80);
        etuquetamun2.setBounds(70,230,350,80);
        txtf_2.setBounds(440,230,300,80);
        ETQResultado.setBounds(70,400,800,80);
        ETQResultado2.setBounds(70,480,800,80);
        botoSumar.setBounds(70,650,300,80);
        botoRaiz.setBounds(370,650,300,80);
        botoLimpiar.setBounds(70,731,300,80);
        botoSalir.setBounds(370,731,300,80);
        botoRestar.setBounds(370,811,300,80);
        botoMultiplicar.setBounds(70,811,300,80);
        botoDividir.setBounds(670,811,300,80);
        botoFactorial.setBounds(670,731,300,80);
        botoPotencia.setBounds(670,651,300,80);
        botoPorcecntaje.setBounds(370,891,300,80);


        etuquetamun1.setForeground(Color.BLACK);
        etuquetamun2.setForeground(Color.BLACK);
        ETQResultado.setForeground(Color.blue);
        ETQResultado2.setForeground(Color.BLUE);
        botoSalir.setForeground(Color.RED);
        botoSumar.setForeground(Color.BLACK);
        botoRestar.setForeground(Color.BLACK);
        botoMultiplicar.setForeground(Color.BLACK);
        botoDividir.setForeground(Color.BLACK);
        botoFactorial.setForeground(Color.BLACK);
        botoPotencia.setForeground(Color.BLACK);
        botoPorcecntaje.setForeground(Color.BLACK);

        botoSumar.setFont(new java.awt.Font("Arial",1,30));
        botoRaiz.setFont(new java.awt.Font("Arial",1,30));
        botoLimpiar.setFont(new java.awt.Font("Calibri",1,30));
        botoSalir.setFont(new java.awt.Font("Calibri",1,30));
        etuquetamun1.setFont(new java.awt.Font("Calibri",3,25));
        etuquetamun2.setFont(new java.awt.Font("Calibri",3,25));
        txtf_1.setFont(new java.awt.Font("Arial",1,30));
        txtf_2.setFont(new java.awt.Font("Arial",1,30));
        ETQResultado.setFont(new java.awt.Font("Arial",1,30));
        ETQResultado2.setFont(new java.awt.Font("Arial",1,30));
        botoRestar.setFont(new java.awt.Font("Arial",1,30));
        botoMultiplicar.setFont(new java.awt.Font("Arial",1,30));
        botoDividir.setFont(new java.awt.Font("Arial",1,30));
        botoFactorial.setFont(new java.awt.Font("Arial",1,30));
        botoPotencia.setFont(new java.awt.Font("Arial",1,30));
        botoPorcecntaje.setFont(new java.awt.Font("Arial",1,30));



        frame.setVisible(true);
        botoSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double suma=0;
                double n1,n2;
                n1=Double.parseDouble(txtf_1.getText());
                n2=Double.parseDouble(txtf_2.getText());
                suma=n1+n2;
                vector[ind]=suma;
                if (ind <4){
                    ind++;
                    String cadena=" ";
                    for (int j = 0; j < ind; j++) {
                        cadena = cadena+vector[j]+" ";
                    }
                }
                ETQResultado.setText("la suma es suma "+suma);
            }
        });
        botoRaiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double raiz1,raiz2,n1,n2;
                n1=Double.parseDouble(txtf_1.getText());
                n2=Double.parseDouble(txtf_2.getText());
                raiz1=Math.sqrt(n1);
                raiz2=Math.sqrt(n2);
                ETQResultado.setText("Raiz 1: "+raiz1);
                ETQResultado2.setText("Raiz 2: "+raiz2);
            }
        });
        botoLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtf_1.setText("");
                txtf_2.setText("");
                ETQResultado.setText("");
                ETQResultado2.setText("");
            }
        });
        botoSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });

    }
}

void main() {
    calculadora a=new calculadora();
    a.metodo();


}
