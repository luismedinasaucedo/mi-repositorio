import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Jugos{
    JFrame pantallaJ=new JFrame();
    int i;
    String Imagen;
    static ArrayList<Pedido> Orden = new ArrayList<>();
    void pantallaJ() {
        pantallaJ.setTitle("Inicio de sesion");
        pantallaJ.getContentPane().setBackground(Color.white);
        pantallaJ.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pantallaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaJ.setLocationRelativeTo(null);
        pantallaJ.setLayout(null);

        ImageIcon iconoOriginal = new ImageIcon("img/jugos.jpg");

        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        ImageIcon iconoFinal = new ImageIcon(imagenEscalada);

        JLabel etiquetaImagen = new JLabel(iconoFinal);

        etiquetaImagen.setBounds(850, 350, 200, 400);

        pantallaJ.add(etiquetaImagen);
        Txt TxtCliente=(Txt) pantallaJ.add(new Txt("Cliente",0,180));
        Txt TxtPedido=(Txt) pantallaJ.add(new Txt("pedido",0,260));
        Txt TxtCosto=(Txt) pantallaJ.add(new Txt("costo",0,340));
        Txt TxtIva=(Txt) pantallaJ.add(new Txt("Iva",0,420));
        Txt TxtFlex=(Txt) pantallaJ.add(new Txt("",0,500));
        Txt MueFlex=(Txt) pantallaJ.add(new Txt("",200,500));
        Txt tit=(Txt)pantallaJ.add(new Txt("Orden",0,100));
        Txt foto=(Txt)pantallaJ.add(new Txt("",0,100));

        ImageIcon Imagen1 = new ImageIcon("Agrega aqui la ruta de acceso");
        JLabel EtiquetaImagen = new JLabel(Imagen1);
        Border Borde = BorderFactory.createLineBorder(Color.yellow,2);
        EtiquetaImagen.setBounds(700, 40, 300, 300);
        pantallaJ.add(EtiquetaImagen);
        pantallaJ.add(foto);
        foto.setBounds(700, 60, 250, 280);
        foto.setBorder(Borde);


        Campo CamCliente=(Campo) pantallaJ.add(new Campo(200,180));
        Campo CamPedido=(Campo) pantallaJ.add(new Campo(200,260));
        Campo CamCosto=(Campo) pantallaJ.add(new Campo(200,340));
        Campo CamIva=(Campo) pantallaJ.add(new Campo(200,420));

        Boton botonIva=(Boton)pantallaJ.add(new Boton("Calcular Iva",0,800));
        Boton botonSalir=(Boton)pantallaJ.add(new Boton("Salir",200,800));
        Boton botonModificar=(Boton)pantallaJ.add(new Boton("Modificar",400,800));
        Boton botonEliminar=(Boton)pantallaJ.add(new Boton("Eliminar",600,800));
        Boton botonRegistrar=(Boton)pantallaJ.add(new Boton("Registrar",800,800));
        Boton botonInFoto=(Boton)pantallaJ.add(new Boton("ingresar foto",1000,800));

        JFileChooser CarpetaImagen = new JFileChooser("/Vienres"); //Esto sirve como para abrir autoamaticamente la carpeta de las fotos que tengas. solo cambia la direccion de viernes

        Boton botonSumar=(Boton)pantallaJ.add(new Boton("Sumar",800,880));
        Boton boton10=(Boton)pantallaJ.add(new Boton("+10%",1000,880));
        Boton botonNombresConA=(Boton)pantallaJ.add(new Boton("Nombres con A",600,880));
        Boton botonLimpiar=(Boton)pantallaJ.add(new Boton("Limpiar",400,880));
        Boton BotonIzq=(Boton)pantallaJ.add(new Boton("<<<",0,880));
        Boton BotonDer=(Boton)pantallaJ.add(new Boton(">>>",200,880));
        pantallaJ.setVisible(true);

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        botonIva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int iva=(Integer.parseInt(CamCosto.getText())/100)*18;
                CamIva.setText(String.valueOf(iva));
                int Total=Integer.parseInt(CamCosto.getText())+(Integer.parseInt(CamIva.getText()));
                TxtFlex.setText("Costo total");
                MueFlex.setText(String.valueOf(Total));
            }
        });

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Orden.add(new Pedido(Integer.parseInt(CamCosto.getText()),Integer.parseInt(CamIva.getText()),Integer.parseInt(MueFlex.getText()),CamCliente.getText(),CamPedido.getText(),Imagen));
                JOptionPane.showMessageDialog(null,"Se registro");
            }
        });

        botonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Orden.get(i).Cliente=CamCliente.getText();
                Orden.get(i).Costo=Integer.parseInt(CamCosto.getText());
                Orden.get(i).Iva=Integer.parseInt(CamIva.getText());
                Orden.get(i).Total=Integer.parseInt(MueFlex.getText());
                Orden.get(i).pedido=CamPedido.getText();
                JOptionPane.showMessageDialog(null,"Se modifico");
            }
        });

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Orden.remove(i);
                JOptionPane.showMessageDialog(null,"se elimino");
            }
        });

        BotonIzq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    i--;
                    if (i<0){i=Orden.size()-1;}
                    CamCliente.setText(Orden.get(i).Cliente);
                    CamPedido.setText(Orden.get(i).pedido);
                    CamCosto.setText(String.valueOf(Orden.get(i).Costo));
                    CamIva.setText(String.valueOf(Orden.get(i).Iva));
                    MueFlex.setText(String.valueOf(Orden.get(i).Total));
                    foto.setIcon(new ImageIcon(new ImageIcon(Orden.get(i).Imagen).getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH)));

                } catch (Exception x) {}
            }
        });
        BotonDer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    i++;
                    if (i>=Orden.size()){i=0;}
                    CamCliente.setText(Orden.get(i).Cliente);
                    CamPedido.setText(Orden.get(i).pedido);
                    CamCosto.setText(String.valueOf(Orden.get(i).Costo));
                    CamIva.setText(String.valueOf(Orden.get(i).Iva));
                    MueFlex.setText(String.valueOf(Orden.get(i).Total));
                    foto.setIcon(new ImageIcon(new ImageIcon(Orden.get(i).Imagen).getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH)));
                } catch (Exception x) {}
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CamCliente.setText("");
                CamPedido.setText("");
                CamCosto.setText("");
                CamIva.setText("");
                MueFlex.setText("");
            }
        });

        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double suma=0;
                for (int j = 0; j < Orden.size(); j++) {
                    suma=Orden.get(j).Total+suma;
                }
                TxtFlex.setText("La suma es:");
                MueFlex.setText(String.valueOf(suma));
            }
        });

        boton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int j = 0; j < Orden.size(); j++) {
                    Pedido a=Orden.get(j);
                    a.setTotal(a.getTotal()*1.1);
                }
            }
        });
        botonNombresConA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean tiene=false;
                for (int j = 0; j < Orden.size(); j++) {
                    Pedido a=Orden.get(j);
                    if (a.Cliente.startsWith("a")){tiene=true;}
                }
                if (tiene==false){
                    JOptionPane.showMessageDialog(null,"NO Tiene A ");
                    return;}
                for (int j = 0; j < Orden.size(); j++) {
                    Pedido a=Orden.get(j);
                    if (a.Cliente.startsWith("a")){i=j;}
                }
                CamCliente.setText(Orden.get(i).Cliente);
                CamPedido.setText(Orden.get(i).pedido);
                CamCosto.setText(String.valueOf(Orden.get(i).Costo));
                CamIva.setText(String.valueOf(Orden.get(i).Iva));
                MueFlex.setText(String.valueOf(Orden.get(i).Total));

            }
        });
        botonInFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg" , "gif", "png");
                CarpetaImagen.setFileFilter(filtro);
                if(CarpetaImagen.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                    Imagen = CarpetaImagen.getSelectedFile().getPath();
                    Image img = new ImageIcon(Imagen).getImage();
                    foto.setIcon(new ImageIcon(img.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH)));
                }
            }
        });





    }



}
