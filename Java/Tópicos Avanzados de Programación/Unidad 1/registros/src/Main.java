import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.ActiveEvent;
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
    }
}

void main() {

}
