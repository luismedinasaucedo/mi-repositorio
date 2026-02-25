import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

//<<Creación de la Clase>>

class FrameInicio extends JFrame{
    JFrame FrameInicio = new JFrame(); //--> Telar Incial, esta tela se mostrará primero, si se ingresa bien, abrirá otro telar ("frame").
    static String Usuario = ""; //--> agregamos el static para seguridad, esto hará la variable de forma global.
    JButton botonEntrar = new JButton("Entrar");
    JLabel EtiquetaClave = new JLabel("Ingresar Clave de Acceso");
    JTextField CajaTextoClave = new JTextField("");
    JLabel EtiquetaTitulo = new JLabel("SISTEMA");

    //<<Constructor>>

    FrameInicio(){
        FrameInicio.setTitle("Frame1");
        FrameInicio.getContentPane().setBackground(Color.gray); // Se usa getContentPane para el fondo
        FrameInicio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        FrameInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrameInicio.setLocationRelativeTo(null);
        FrameInicio.setLayout(null);
    }

    //<<Método: Agregamos los componentes de arriba>>

    void MetodoFrameInicio(){
        FrameInicio.add(EtiquetaTitulo);
        FrameInicio.add(EtiquetaClave);
        FrameInicio.add(CajaTextoClave);
        FrameInicio.add(botonEntrar);

        //<<Coordenadas de Diseño: Etiquetas>>

        // CORREGIDO: Cambiamos WIDTH/HEIGHT por números para que sean visibles
        EtiquetaTitulo.setBounds(550, 100, 300, 50);
        EtiquetaClave.setBounds(550, 200, 300, 30);

        //<<Coordenadas de Diseño: Botones>>

        botonEntrar.setBounds(550, 300, 200, 50);

        //<<Coordenadas de Diseño: Cajas de Texto>>

        CajaTextoClave.setBounds(550, 240, 200, 40);

        //<<Tamaño y Fuente para Texto>>
        EtiquetaTitulo.setFont(new java.awt.Font("Arial",1,40));
        EtiquetaClave.setFont(new java.awt.Font("Arial",1,18));
        CajaTextoClave.setFont(new java.awt.Font("Arial",1,20));
        botonEntrar.setFont(new java.awt.Font("Arial",1,20));

        //<<Colores Para Texto>>

        EtiquetaTitulo.setForeground(Color.red);
        EtiquetaClave.setForeground(Color.red);
        CajaTextoClave.setForeground(Color.red);
        botonEntrar.setForeground(Color.red);

        //<<Hacemos visible el Frame>>

        FrameInicio.setVisible(true);
        int intetnos = 0; //--> Esto agrega el intento de entradas.

        //<<Confirguración de los Botones>>

        botonEntrar.addActionListener(new ActionListener(){
                                          public void actionPerformed(ActionEvent e){

                                              Usuario = CajaTextoClave.getText(); //Aqui ya usamos la variable usuario.
                                              if(Usuario.contentEquals("123")){ //Cuando agreguemos 123 en la caja de texto, entrará al segundo telar.
                                                  JOptionPane.showMessageDialog(null, "CLAVE CORRECTA!"); //JOPTION mostrara el mensaje con ventana emergente.
                                                  FrameInicio.setVisible(false); // Cerramos el inicial
                                                  Empleado objeto = new Empleado("","","","","","","","","");
                                                  objeto.Metodo();
                                              }
                                              else {
                                                  JOptionPane.showMessageDialog(null, "CLAVE INCORRECTA");
                                                  System.exit(0);
                                                  dispose();
                                              }
                                          }
                                      }
        ); //<<Fin del Botón Entrar.
    }

}

public class Empleado extends FrameInicio{ //<-- Aqui con esto traeremos tooodo lo de arriba y haremos un nuevo telar o la parte 2.

    JFrame Frame2 = new JFrame(); //<-- "Frame2" por que es nuestro segundo lienzo.
    String Nombre;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String NumTarjeta;
    String RFC;
    String FechaNacimiento;
    String Puesto;
    String Sueldo;
    String Imagen ="";

    //<<Creamos el Array List>>

    static int i = 0;
    static ArrayList <Empleado> Lista = new ArrayList(); //Empleados que es la -> "Lista" los guardará en el array list.

    //<<Creamos Los Botones>>

    JButton botonRFC = new JButton("RFC");
    JButton botonSalir = new JButton("Salir");
    JButton botonIzquierda = new JButton("<<<");
    JButton botonDerecha = new JButton(">>>");
    JButton botonRegistrar = new JButton("Registrar"); //Registrar / guardar...
    JButton botonLimpiar = new JButton("Limpiar");
    JButton botonModificar = new JButton("Modificar");
    JButton botonInFoto = new JButton("Ingresar Foto");
    JButton botonEliminar = new JButton("Eliminar");

    //<<Etiquetas>>

    JFileChooser CarpetaImagen = new JFileChooser("/Vienres"); //Esto sirve como para abrir autoamaticamente la carpeta de las fotos que tengas. solo cambia la direccion de viernes
    JLabel Foto = new JLabel();

    JLabel EtiquetaNum = new JLabel("Num. Tarjeta");
    JLabel EtiquetaRFC = new JLabel("Num. RFC");
    JLabel EtiquetaNombre = new JLabel("Nombre");
    JLabel EtiquetaFechaNacimiento = new JLabel("Fecha de Nacimiento DD/MM/AA");
    JLabel EtiquetaApellido1 = new JLabel("Apellido Paterno");
    JLabel EtiquetaApellido2 = new JLabel("Apellido Materno");
    JLabel EtiquetaPuesto = new JLabel("Puesto");
    JLabel EtiquetaSueldo = new JLabel("Sueldo");

    //<<Cajas de Texto>>

    JTextField CajaTextoRFC = new JTextField();
    JTextField CajaTextoNombre = new JTextField();
    JTextField CajaTextoApellido1 = new JTextField();
    JTextField CajaTextoApellido2 = new JTextField();
    JTextField CajaTextoTarjeta = new JTextField();
    JTextField CajaTextoFechaNacimiento = new JTextField();
    JTextField CajaTextoPuesto = new JTextField();
    JTextField CajaTextoSueldo = new JTextField();

    JTextField CajaTextoResultadoRFC = new JTextField();

    Empleado(String Nombre, String ApellidoPaterno, String ApellidoMaterno, String Puesto, String Sueldo, String Imagen, String NumTarjeta, String RFC, String FechaNacimiento){ //Constructor

        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.NumTarjeta = NumTarjeta;
        this.RFC = RFC;
        this.FechaNacimiento = FechaNacimiento;
        this.Puesto = Puesto;
        this.Sueldo = Sueldo;
        this.Imagen = Imagen;

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
    } //<<Aqui termina el Constructor>>

    //<<Insertamos Una Imagen>>
    ImageIcon Imagen1 = new ImageIcon("Agrega aqui la ruta de acceso");
    JLabel EtiquetaImagen = new JLabel(Imagen1);
    JComboBox ComboBoxPuesto = new JComboBox(); //Esto es lo que hace que tú selecciones y te salgan una pestañita con varias opciones
    void Metodo(){

        //<<Crear caja con multiple selección>>
        ComboBoxPuesto.removeAllItems();
        ComboBoxPuesto.addItem("Docente");
        ComboBoxPuesto.addItem("Administrador");
        ComboBoxPuesto.addItem("Directivo");

        //<<Coordenada para la etiqueta imagen>>
        EtiquetaImagen.setBounds(700, 40, 300, 300);

        //<<Agregamos etiqueta y la imagen al frame>>
        add(EtiquetaImagen);

        //<<Agregamos los componentes de Botones, Etiquetas y Cajas de Texto>>
        add(botonModificar); add(botonIzquierda); add(botonDerecha);
        add(botonInFoto); add(botonSalir); add(botonRegistrar);
        add(botonRFC); add(botonLimpiar); add(botonEliminar);

        //<<Etiquetas>>
        add(EtiquetaNombre); add(EtiquetaRFC); add(EtiquetaNum);
        add(EtiquetaApellido1); add(EtiquetaApellido2);
        add(EtiquetaFechaNacimiento); add(EtiquetaPuesto); add(EtiquetaSueldo);
        add(Foto);

        //<<Cajas de Texto
        add(CajaTextoNombre); add(CajaTextoApellido1); add(CajaTextoApellido2);
        add(CajaTextoFechaNacimiento); add(CajaTextoTarjeta); add(CajaTextoRFC);
        add(CajaTextoPuesto); add(CajaTextoSueldo); add(CajaTextoResultadoRFC);
        add(ComboBoxPuesto);

        //<<Agregamos el Borde para la Imagen>>
        Border Borde = BorderFactory.createLineBorder(Color.yellow,2);
        Foto.setBounds(700, 60, 250, 280);
        Foto.setBorder(Borde);

        //<<Coordenadas de Diseño: Botones>>
        botonRegistrar.setBounds(50, 550, 150, 40);
        botonModificar.setBounds(210, 550, 150, 40);
        botonEliminar.setBounds(370, 550, 150, 40);
        botonLimpiar.setBounds(530, 550, 150, 40);
        botonRFC.setBounds(690, 550, 150, 40);

        botonIzquierda.setBounds(50, 610, 100, 40);
        botonDerecha.setBounds(160, 610, 100, 40);
        botonInFoto.setBounds(700, 350, 200, 40);
        botonSalir.setBounds(850, 550, 150, 40);

        //Coordenadas de Diseño: Etiquetas>>
        EtiquetaNombre.setBounds(50, 50, 250, 30);
        EtiquetaApellido1.setBounds(50, 100, 250, 30);
        EtiquetaApellido2.setBounds(50, 150, 250, 30);
        EtiquetaFechaNacimiento.setBounds(50, 200, 250, 30);
        EtiquetaNum.setBounds(50, 250, 250, 30);
        EtiquetaSueldo.setBounds(50, 300, 250, 30);
        EtiquetaPuesto.setBounds(50, 350, 250, 30);
        EtiquetaRFC.setBounds(50, 400, 250, 30);

        //<<Coordenadas de Diseño: Cajas de Texto>>
        CajaTextoNombre.setBounds(310, 50, 300, 30);
        CajaTextoApellido1.setBounds(310, 100, 300, 30);
        CajaTextoApellido2.setBounds(310, 150, 300, 30);
        CajaTextoFechaNacimiento.setBounds(310, 200, 300, 30);
        CajaTextoTarjeta.setBounds(310, 250, 300, 30);
        CajaTextoSueldo.setBounds(310, 300, 300, 30);
        CajaTextoRFC.setBounds(310, 400, 300, 30);
        CajaTextoPuesto.setBounds(310, 450, 300, 30);
        CajaTextoResultadoRFC.setBounds(310, 500, 300, 35);

        //<<Coordenadas de Diseño: Combo Box>>
        ComboBoxPuesto.setBounds(310, 350, 300, 30);

        //<<Fuente y Tamaño para Texto>>
        ComboBoxPuesto.setFont(new java.awt.Font("Arial",1,20));
        botonInFoto.setFont(new java.awt.Font("Arial",1,20));
        botonDerecha.setFont(new java.awt.Font("Arial",1,20));
        botonIzquierda.setFont(new java.awt.Font("Arial",1,20));
        botonSalir.setFont(new java.awt.Font("Arial",1,20));
        botonRegistrar.setFont(new java.awt.Font("Arial",1,20));
        botonRFC.setFont(new java.awt.Font("Arial",1,20));
        botonLimpiar.setFont(new java.awt.Font("Arial",1,20));
        botonEliminar.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaNombre.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaApellido1.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaApellido2.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaFechaNacimiento.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaRFC.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaNum.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaSueldo.setFont(new java.awt.Font("Arial",1,20));
        EtiquetaPuesto.setFont(new java.awt.Font("Arial",1,20));

        //<<Configuración de la caja de resultado
        CajaTextoResultadoRFC.setFont(new java.awt.Font("Arial",1,20));
        CajaTextoResultadoRFC.setForeground(Color.BLACK);
        CajaTextoResultadoRFC.setEditable(false);

        //<<Colores para Texto>>
        botonInFoto.setForeground(Color.BLACK);
        botonDerecha.setForeground(Color.BLACK);
        botonIzquierda.setForeground(Color.BLACK);
        botonSalir.setForeground(Color.BLACK);
        botonRegistrar.setForeground(Color.BLACK);
        botonRFC.setForeground(Color.BLACK);
        botonLimpiar.setForeground(Color.BLACK);
        botonEliminar.setForeground(Color.BLACK);

        //<<Configuración de los botones y sus acciones>>
        botonSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        botonRegistrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Lista.add(new Empleado(
                        CajaTextoNombre.getText(), CajaTextoApellido1.getText(), CajaTextoApellido2.getText(),
                        ComboBoxPuesto.getSelectedItem().toString(), CajaTextoSueldo.getText(), Imagen,
                        CajaTextoTarjeta.getText(), CajaTextoRFC.getText(), CajaTextoFechaNacimiento.getText()));
                JOptionPane.showMessageDialog(null, "Registrado!");
            }
        });

        botonModificar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Lista.get(i).Nombre = CajaTextoNombre.getText();
                Lista.get(i).ApellidoPaterno = CajaTextoApellido1.getText();
                Lista.get(i).ApellidoMaterno = CajaTextoApellido2.getText();
                Lista.get(i).Puesto = ComboBoxPuesto.getSelectedItem().toString();
                Lista.get(i).Sueldo = CajaTextoSueldo.getText();
                Lista.get(i).NumTarjeta = CajaTextoTarjeta.getText();
                Lista.get(i).RFC = CajaTextoRFC.getText();
                Lista.get(i).FechaNacimiento = CajaTextoFechaNacimiento.getText();
                Lista.get(i).Imagen = Imagen;
                JOptionPane.showMessageDialog(null, "Registro Modificado: " + i);
            }
        });

        botonEliminar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Lista.remove(i);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        });

        botonInFoto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg" , "gif", "png");
                CarpetaImagen.setFileFilter(filtro);
                if(CarpetaImagen.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                    Imagen = CarpetaImagen.getSelectedFile().getPath();
                    Image img = new ImageIcon(Imagen).getImage();
                    Foto.setIcon(new ImageIcon(img.getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH)));
                }
            }
        });

        botonDerecha.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    i++;
                    if(i >= Lista.size()) i = 0;
                    actualizarCampos();
                }catch(Exception x){}
            }
        });

        botonIzquierda.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    i--;
                    if(i < 0) i = Lista.size() - 1;
                    actualizarCampos();
                }catch(Exception x){}
            }
        });

        botonLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CajaTextoNombre.setText(""); CajaTextoApellido1.setText(""); CajaTextoApellido2.setText("");
                CajaTextoFechaNacimiento.setText(""); CajaTextoTarjeta.setText(""); CajaTextoRFC.setText("");
                CajaTextoPuesto.setText(""); CajaTextoSueldo.setText(""); CajaTextoResultadoRFC.setText("");
                Foto.setIcon(null);
            }
        });

        botonRFC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String Ape1 = CajaTextoApellido1.getText();
                String Ape2 = CajaTextoApellido2.getText();
                Nombre = CajaTextoNombre.getText();
                String Ap1 = Ape1.substring(0,2);
                String Ap2 = Ape2.substring(0,1);
                String Nom = Nombre.substring(0,1);
                String Fecha1 = CajaTextoFechaNacimiento.getText().substring(0,2);
                String Fecha2 = CajaTextoFechaNacimiento.getText().substring(3,5);
                String Fecha3 = CajaTextoFechaNacimiento.getText().substring(8,10);
                CajaTextoResultadoRFC.setText((Ap1 + Ap2 + Nom + Fecha1 + Fecha2 + Fecha3).toUpperCase());
            }
        });

        setVisible(true);
    }

    void actualizarCampos(){
        CajaTextoNombre.setText(Lista.get(i).Nombre);
        CajaTextoApellido1.setText(Lista.get(i).ApellidoPaterno);
        CajaTextoApellido2.setText(Lista.get(i).ApellidoMaterno);
        CajaTextoTarjeta.setText(Lista.get(i).NumTarjeta);
        CajaTextoRFC.setText(Lista.get(i).RFC);
        CajaTextoFechaNacimiento.setText(Lista.get(i).FechaNacimiento);
        CajaTextoPuesto.setText(Lista.get(i).Puesto);
        CajaTextoSueldo.setText(Lista.get(i).Sueldo);
        Foto.setIcon(new ImageIcon(new ImageIcon(Lista.get(i).Imagen).getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH)));
    }

    public static void main(String[] args) {
        FrameInicio inicio = new FrameInicio();
        inicio.MetodoFrameInicio();
    }
}