import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RFCRegistros extends JFrame{
    String nombre1,apellido1,apellido2,año1,dia1,mes1,RFC;
    static String rfc,ap1,ap2,nom,año2,mes2,dia2,rfc1,rfc2,rfc3;
JFrame frame =new JFrame();
double resultado=0;
static int i=0;

    RFCRegistros(){
        frame.setBackground(Color.YELLOW);
        frame.setTitle("RFC");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ImageIcon Fondo=new ImageIcon("C:\\");
        JLabel EImagen=new JLabel(Fondo);
        frame.add(EImagen);
        EImagen.setBounds(0,0,300,80);
        frame.setLayout(null);





    }
    JTextField txtAP1=new JTextField();
    JTextField txtAP2=new JTextField();
    JTextField txtNOM=new JTextField();
    JTextField txtAPE1=new JTextField();
    JTextField txtEDAD=new JTextField();
    JTextField txtAÑO=new JTextField();
    JTextField txtMES=new JTextField();
    JTextField txtDIA=new JTextField();

    JLabel ETQ0=new JLabel("apellido 1");
    JLabel ETQ1=new JLabel("apellido 2");
    JLabel ETQ2=new JLabel("nombre");
    JLabel ETQ3=new JLabel("año");
    JLabel ETQ4=new JLabel("mes");
    JLabel ETQ5=new JLabel("dia");
    JLabel ETQResultado=new JLabel("resultado");
    JButton MostrarRFC=new JButton("mostrar rfc");
    JButton MostrarCalcularRFC=new JButton("calcular rfc");
    JButton BotonSalir=new JButton("Salir");
    JButton BotonLimpiar=new JButton("Limpiar");
    ImageIcon Imagen=new ImageIcon();//ubicacion en sistema
    JLabel etiquetaImagen=new JLabel(Imagen);

    JTextArea textoArea=new JTextArea();
    String cadena=" ";


    void metodos(){
        frame.add(textoArea);
        textoArea.setBounds(70,800,400,200);
        etiquetaImagen.setBounds(1000,10,1400,1000);
        frame.add(etiquetaImagen);
        frame.add(BotonSalir);
        frame.add(MostrarRFC);
        frame.add(txtAP1);
        frame.add(txtAP2);
        frame.add(txtNOM);
        frame.add(txtAÑO);
        frame.add(txtDIA);
        frame.add(txtMES);
        frame.add(ETQ0);
        frame.add(ETQ1);
        frame.add(ETQ2);
        frame.add(ETQ3);
        frame.add(ETQ4);
        frame.add(ETQ5);
        frame.add(MostrarCalcularRFC);
        frame.add(ETQResultado);
        frame.add(BotonLimpiar);

        ETQ0.setBounds(70,70,300,80);
        ETQ0.setFont(new Font("arial",1,30));
        ETQ1.setBounds(0,70,300,80);
        ETQ1.setFont(new Font("arial",1,30));
        ETQ2.setBounds(70,70,300,80);
        ETQ2.setFont(new Font("arial",1,30));
        ETQ3.setBounds(70,70,300,80);
        ETQ3.setFont(new Font("arial",1,30));
        ETQ4.setBounds(70,70,300,80);
        ETQ4.setFont(new Font("arial",1,30));
        ETQ5.setBounds(70,70,300,80);
        ETQ5.setFont(new Font("arial",1,30));
        txtAP1.setBounds(70,70,300,80);
        txtAP1.setFont(new Font("arial",1,30));
        txtAP2.setBounds(70,70,300,80);
        txtAP2.setFont(new Font("arial",1,30));
        txtNOM.setBounds(70,70,300,80);
        txtNOM.setFont(new Font("arial",1,30));
        txtAÑO.setBounds(70,70,300,80);
        txtAÑO.setFont(new Font("arial",1,30));

        frame.setVisible(true);
    }
}

void main() {

    RFCRegistros obj=new RFCRegistros();
    obj.metodos();
}
