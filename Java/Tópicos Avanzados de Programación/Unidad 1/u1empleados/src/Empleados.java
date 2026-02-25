import java.awt.Button;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;//activa el metodo
import java.awt.event.ActionListener;//espera un click
import javax.swing.*;//Es toda la clase que me permite realizar una interfaz grafica
import javax.swing.border.Border;
class FrameInicio extends JFrame{
    JFrame frameInicio = new JFrame();
    static  String usuario="";
    JButton botonEntrar= new JButton("Entrar");
    JLabel ETQclave= new JLabel("CAPTURAR CLAVE DE ACCESO");
    JTextField txtClave = new JTextField();
    JLabel Titulo = new JLabel("EMPLEADOS");
    FrameInicio(){
        frameInicio.setTitle("FRAME1");
        frameInicio.setBackground(Color.yellow);
        frameInicio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para que se salga con la x
        frameInicio.setLocationRelativeTo(null);//para los click
        frameInicio.setLayout(null);//nos permite administrar la distribucion
    }//constructor
    void metodoFrameInicio(){
        frameInicio.add(Titulo);
        frameInicio.add(ETQclave);
        frameInicio.add(txtClave);
        frameInicio.add(botonEntrar);
        Titulo.setBounds(70, 70, 1500,80);
        Titulo.setFont(new java.awt.Font("Aial",2,30));
        ETQclave.setBounds(200,160 ,1300 ,80 );
        ETQclave.setFont(new java.awt.Font("Arial",1,30));
        ETQclave.setForeground(Color.BLUE);
        txtClave.setBounds(200,250,300,80);
        txtClave.setFont(new java.awt.Font("Arial",2,30));
        botonEntrar.setBounds(300, 450, 300, 80);
        botonEntrar.setFont(new java.awt.Font ("Arial",1,30));
        botonEntrar.setForeground(Color.red);
        frameInicio.setVisible(true);
        int intentos=0;
        botonEntrar.addActionListener(new ActionListener (){
                                          public void actionPerformed(ActionEvent e){
                                              usuario = txtClave.getText();
                                              if(usuario.equals("123")){
                                                  JOptionPane.showMessageDialog(null,"CLAVE CORRECTA");
                                                  Empleados objeto= new Empleados("","","","","","","","","");
                                                  objeto.metodo();
                                              }
                                              else{
                                                  JOptionPane.showMessageDialog(null, "CLAVE INCORRECTA");
                                                  frameInicio.setVisible(false);
                                                  dispose();
                                              }
                                          }
                                      }
        );
    }//metodoFrameInicio

}
public class Empleados extends JFrame{
    JFrame frame = new JFrame();
    String nombre;
    String ApellidoPat;
    String ApellidoMat;
    String numTarjeta;
    String rfc;
    String FechaNac;
    String Puesto;
    String sueldo;
    String imagen;
    static int i;
    static ArrayList <Empleados> lista= new ArrayList();
    JButton botonRFC= new JButton("RFC");
    JButton botonSALIR= new JButton("SALIR");
    JButton botoDERC= new JButton(">>>>>");
    JButton botonIZQ= new JButton("<<<<<");
    JButton botonREGISTRAR= new JButton("REGISTRAR");
    JButton botonNUEVO= new JButton("LIMPIAR");
    JButton botonMODIFICAR= new JButton("MODIFICAR");
    JButton botonIngresarFoto= new JButton("INGRESAR FOTO");
    JButton botonELIMINAR= new JButton("ELIMINAR");
    JFileChooser carpetaImagenes= new JFileChooser("");//carpetra imagen

    JLabel foto= new JLabel(new ImageIcon("Foto"));
    JLabel etiquetaNum = new JLabel("Num. tarjeta: ");
    JLabel etiqueta1= new JLabel("RFC ");
    JLabel etiqueta2 = new JLabel("Nombre: ");
    JLabel fechaNac = new JLabel("Fecha Nacimiento dd/mm/aaaa: ");
    JLabel etiqueta3 = new JLabel("Apellido: ");
    JLabel etiqueta4 = new JLabel("Apellido m ");
    JLabel JLABELpuesto = new JLabel("Puesto: ");
    JLabel Sueldo = new JLabel("Sueldo: ");

    JTextField etiquetaRFC= new JTextField();
    JTextField txtnombre= new JTextField();
    JTextField txtapemat= new JTextField();
    JTextField txtapepat= new JTextField();
    JTextField txtnumtar= new JTextField();
    JTextField fecha= new JTextField();
    JTextField txtpuesto= new JTextField();
    JTextField txtsueldo= new JTextField();
    JTextField resultadoRFC= new JTextField();

    Empleados(String nombre, String ApellidoPat,String ApellidoMat,String numTarjeta,
              String rfc, String FechaNac, String Puesto,String sueldo, String imagen){
        this.nombre=nombre;
        this.ApellidoPat=ApellidoPat;
        this.ApellidoMat=ApellidoMat;
        this.numTarjeta=numTarjeta;
        this.rfc=rfc;
        this.FechaNac=FechaNac;
        this.Puesto=Puesto;
        this.sueldo=sueldo;
        this.imagen=imagen;
        setBackground(Color.yellow);
        setTitle("EMPLEADOS");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para que se salga con la x
        setLocationRelativeTo(null);//para los click
        setLayout(null);

    }
    ImageIcon imagen1= new ImageIcon("");
    JLabel etiquetaImagen = new JLabel(imagen1);
    JComboBox COMBOBOXPUESTO = new JComboBox();

    void metodo(){
        //para dar opciones o una lista de ellos
        COMBOBOXPUESTO.removeAllItems();
        COMBOBOXPUESTO.addItem("DOCENTE");
        COMBOBOXPUESTO.addItem("ADMINISTRATIVO");
        COMBOBOXPUESTO.addItem("DIRECTIVO");
        etiquetaImagen.setBounds(1500, 10, 400, 800);
        frame.add(etiquetaImagen);
        frame.setBackground(Color.BLUE);
        add(botonMODIFICAR);
        add(resultadoRFC);
        add(botoDERC);
        add(botonIZQ);
        add(botonIngresarFoto);
        add(etiquetaNum);
        add(etiqueta1);
        add(etiqueta2);
        add(etiqueta3);
        add(etiquetaRFC);
        add(fecha);
        add(txtapemat);
        add(txtapepat);
        add(botonSALIR);
        add(txtnombre);
        add(txtsueldo);
        add(txtpuesto);
        add(Sueldo);
        add(JLABELpuesto);
        add(COMBOBOXPUESTO);
        add(txtnumtar);
        add(botonREGISTRAR);
        add(botonELIMINAR);
        add(botonNUEVO);
        add(fechaNac);
        add(foto);
        Border borde=BorderFactory.createLineBorder(Color.yellow, 1);
        botonIngresarFoto.setBounds(750, 500, 400, 80);
        foto.setBounds(750, 1, 400, 500);
        foto.setBorder(borde);
        etiqueta1.setBounds(100, 500, 300, 80);
        etiqueta2.setBounds(130, 100, 200, 80);
        etiqueta3.setBounds(100, 260, 200, 80);
        etiqueta4.setBounds(100, 180, 200, 80);
        resultadoRFC.setBounds(100,840, 800, 60);
        txtnombre.setBounds(300, 100, 300, 60);
        txtapepat.setBounds(300, 180, 300, 60);
        txtapemat.setBounds(300, 260, 300, 60);
        etiquetaNum.setBounds(100, 340, 300, 60);
        txtnumtar.setBounds(300, 340, 300, 60);
        fechaNac.setBounds(100, 420, 300, 60);
        fecha.setBounds(300, 420, 300, 60);
        etiqueta1.setBounds(100, 500, 300, 80);
        etiquetaRFC.setBounds(300, 500, 200, 60);
        JLABELpuesto.setBounds(100, 580, 300, 60);
        txtpuesto.setBounds(300, 580, 300, 60);
        COMBOBOXPUESTO.setBounds(300, 500, 300, 60);
        COMBOBOXPUESTO.setFont(new java.awt.Font("Arial",1,20));
        Sueldo.setBounds(100, 660, 300, 60);
        txtsueldo.setBounds(300, 660, 300, 60);

        botonELIMINAR.setBounds(900, 640, 300, 80);
        botonMODIFICAR.setBounds(1200, 640, 300, 80);
        botonREGISTRAR.setBounds(600, 640, 300, 80);
        botonNUEVO.setBounds(600, 720, 300, 80);
        botonSALIR.setBounds(900, 720, 300, 80);

        botonSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });


        setVisible(true);
        botonELIMINAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtnombre.setText("");
                txtapemat.setText("");
                etiqueta1.setText("");
            }
        });
        botonMODIFICAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.get(i).nombre=txtnombre.getText();
                lista.get(i).ApellidoMat=txtapemat.getText();
                lista.get(i).ApellidoPat=txtapepat.getText();
                lista.get(i).rfc=etiquetaRFC.getText();
                lista.get(i).numTarjeta=txtnumtar.getText();
                lista.get(i).FechaNac=fecha.getText();
                lista.get(i).Puesto=txtpuesto.getText();
                lista.get(i).sueldo=txtsueldo.getText();
                lista.get(i).imagen=imagen;



            }
        });
    }


    public static void main(String[] args) {
        FrameInicio objetoFrameInicio = new FrameInicio();
        objetoFrameInicio.metodoFrameInicio();
    }
}