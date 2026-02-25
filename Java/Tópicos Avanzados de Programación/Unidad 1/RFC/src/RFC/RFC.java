package RFC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RFC {

    public class datosRFC{
        String nombre;
        String apellidoP;
        String apellidoM;
        int dia;
        int mes;
        int año;
        String rfc;

        datosRFC(String nombre, String apellidoP, String apellidoM, int dia, int mes, int año){
            this.nombre=nombre;
            this.apellidoP=apellidoP;
            this.apellidoM=apellidoM;
            this.dia=dia;
            this.mes=mes;
            this.año=año;
        }
    }

    datosRFC[] datos = new datosRFC[5];
    int i=0;

    JFrame frame = new JFrame();

    RFC(){
        frame.setTitle("Calculador de RFC");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        ImageIcon logoTec = new ImageIcon("C:\\Users\\urini\\OneDrive\\Documentos\\ImagenesProgramas\\Logo-TecNM.png");
        //Escalar la imagen
        Image logoEscalado = logoTec.getImage().getScaledInstance(200,100,Image.SCALE_SMOOTH);
        ImageIcon logoEscalonado = new ImageIcon(logoEscalado);

        JLabel Eimagen = new JLabel(logoEscalonado);
        Eimagen.setBounds(-7,0,200,100);
        frame.add(Eimagen);
    }

    //Botones
    JButton BTNcalcular = new JButton("Calcular RFC");
    JButton BTNlimpiar = new JButton("Limpiar");
    JButton BTNsalir = new JButton("Salir");

    //Etiquetas
    JLabel etqNombre = new JLabel("Nombre:");
    JLabel etqApellidoP = new JLabel("Apellido Paterno:");
    JLabel etqApellidoM = new JLabel("Apellido Materno:");
    JLabel etqFechaN = new JLabel("Fecha de nacimiento:");
    JLabel etqDia = new JLabel("Dia:");
    JLabel etqMes = new JLabel("Mes:");
    JLabel etqAño = new JLabel("Año:");
    JLabel etqResultadoRFC = new JLabel("");

    //TextFields
    JTextField TFnombre = new JTextField();
    JTextField TFapellidoP = new JTextField();
    JTextField TFapellidoM = new JTextField();
    JTextField TFdia = new JTextField();
    JTextField TFmes = new JTextField();
    JTextField TFaño = new JTextField();

    void metodo(){
        //Colores
        Color   Cfondo = new Color(0xFFFDF1),
                Clabels = new Color(0x562F00),
                Cbotones = new Color(0xFF9644),
                CtextFields = new Color(0xFFCE99);

        //Cambiar el color del fondo
        frame.getContentPane().setBackground(Cfondo);

        // Agregar los botones
        frame.add(BTNcalcular);
        frame.add(BTNlimpiar);
        frame.add(BTNsalir);

        //Agregar las etiquetas
        frame.add(etqNombre);
        frame.add(etqApellidoP);
        frame.add(etqApellidoM);
        frame.add(etqFechaN);
        frame.add(etqDia);
        frame.add(etqMes);
        frame.add(etqAño);
        frame.add(etqResultadoRFC);

        //Agregar los TextFields
        frame.add(TFnombre);
        frame.add(TFapellidoP);
        frame.add(TFapellidoM);
        frame.add(TFdia);
        frame.add(TFmes);
        frame.add(TFaño);

        //Etiquetas
        //Asignar y acomodar
        etqNombre.setBounds(370,100,200,50);
        etqApellidoP.setBounds(370,155,300,50);
        etqApellidoM.setBounds(370,210,300,50);
        etqFechaN.setBounds(470,300,500,50);
        etqDia.setBounds(370,400,70,50);
        etqMes.setBounds(570,400,70,50);
        etqAño.setBounds(770,400,70,50);
        etqResultadoRFC.setBounds(500,600,500,50);
        //Cambiar la fuente
        etqNombre.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        etqApellidoP.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        etqApellidoM.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        etqFechaN.setFont(new java.awt.Font("Britannic Bold",1,40));
        etqDia.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        etqMes.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        etqAño.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        etqResultadoRFC.setFont(new java.awt.Font("Britannic Bold",1,40));
        //Cambiar el color
        etqNombre.setForeground(Clabels);
        etqApellidoP.setForeground(Clabels);
        etqApellidoM.setForeground(Clabels);
        etqFechaN.setForeground(Clabels);
        etqDia.setForeground(Clabels);
        etqMes.setForeground(Clabels);
        etqAño.setForeground(Clabels);
        etqResultadoRFC.setForeground(Clabels);

        //TextFields
        //Aignar y acomodar
        TFnombre.setBounds(700,100,300,50);
        TFapellidoP.setBounds(700,155,300,50);
        TFapellidoM.setBounds(700,210,300,50);
        TFdia.setBounds(450,400,70,50);
        TFmes.setBounds(650,400,70,50);
        TFaño.setBounds(850,400,148,50);
        //Cambiar la fuente
        TFnombre.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        TFapellidoM.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        TFapellidoP.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        TFdia.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        TFmes.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        TFaño.setFont(new java.awt.Font("Arial Rounded MT Bold",0,30));
        //Cambiar el color
        TFnombre.setBackground(CtextFields);
        TFnombre.setForeground(Clabels);
        TFapellidoP.setBackground(CtextFields);
        TFapellidoP.setForeground(Clabels);
        TFapellidoM.setBackground(CtextFields);
        TFapellidoM.setForeground(Clabels);
        TFdia.setBackground(CtextFields);
        TFdia.setForeground(Clabels);
        TFmes.setBackground(CtextFields);
        TFmes.setForeground(Clabels);
        TFaño.setBackground(CtextFields);
        TFaño.setForeground(Clabels);

        //Botones
        //Asignar y acomodar
        BTNcalcular.setBounds(570,500, 200,50);
        BTNlimpiar.setBounds(1200,600, 200,50);
        BTNsalir.setBounds(1200,660, 200,50);
        //Cambiar el tipo de letra
        BTNcalcular.setFont(new java.awt.Font("Berlin Sans FB",0,25));
        BTNlimpiar.setFont(new java.awt.Font("Berlin Sans FB",0,25));
        BTNsalir.setFont(new java.awt.Font("Berlin Sans FB",0,25));
        //Cambiar el color
        BTNcalcular.setForeground(Clabels);
        BTNcalcular.setBackground(Cbotones);
        BTNlimpiar.setForeground(Clabels);
        BTNlimpiar.setBackground(Cbotones);
        BTNsalir.setForeground(Clabels);
        BTNsalir.setBackground(Cbotones);

        //Acciones de los botones
        BTNcalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (i<datos.length){
                    datos[i]= new datosRFC(
                            TFnombre.getText(),
                            TFapellidoP.getText(),
                            TFapellidoM.getText(),
                            Integer.parseInt(TFdia.getText()),
                            Integer.parseInt(TFmes.getText()),
                            Integer.parseInt(TFaño.getText())
                    );

                    //nombre 1 caracter
                    char n = datos[i].nombre.charAt(0);
                    //apellido1 dos caracteres
                    String ap1 = datos[i].apellidoP.substring(0,2);
                    //apellido2 un caracter
                    char ap2 = datos[i].apellidoM.charAt(0);
                    //año ultimos 2 caracteres
                    int añoC = datos[i].año%100;

                    //Definir 2 caracteres para dia, mes y año
                    String diaF = String.format("%02d",datos[i].dia);
                    String mesF = String.format("%02d",datos[i].mes);
                    String añoF = String.format("%02d",añoC);

                    //ArmarRFC
                    datos[i].rfc="RFC: "+ap1.toUpperCase()+Character.toUpperCase(ap2)+Character.toUpperCase(n)+añoF+mesF+diaF;

                    //MostrarRFC
                    etqResultadoRFC.setText(datos[i].rfc);
                    i++;
                }else{
                    etqResultadoRFC.setText("Vector lleno");
                }
            }//void
        });//ActionListener

        BTNlimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TFnombre.setText("");
                TFapellidoP.setText("");
                TFapellidoM.setText("");
                TFdia.setText("");
                TFmes.setText("");
                TFaño.setText("");
                etqResultadoRFC.setText("");
            }
        });

        BTNsalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Hacer visible la ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        RFC obj = new RFC();
        obj.metodo();
    }
}
