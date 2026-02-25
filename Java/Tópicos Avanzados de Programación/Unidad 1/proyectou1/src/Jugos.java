import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Jugos{
    JFrame pantallaJ=new JFrame();
    int i;
    static ArrayList<Pedido> Orden = new ArrayList<>();
    void pantallaJ() {
        pantallaJ.setTitle("Inicio de sesion");
        pantallaJ.getContentPane().setBackground(Color.black);
        pantallaJ.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pantallaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantallaJ.setLocationRelativeTo(null);
        pantallaJ.setLayout(null);

        Txt TxtCliente=(Txt) pantallaJ.add(new Txt("Cliente",0,180));
        Txt TxtPedido=(Txt) pantallaJ.add(new Txt("pedido",0,260));
        Txt TxtCosto=(Txt) pantallaJ.add(new Txt("costo",0,340));
        Txt TxtIva=(Txt) pantallaJ.add(new Txt("Iva",0,420));
        Txt TxtFlex=(Txt) pantallaJ.add(new Txt("",0,500));
        Txt MueFlex=(Txt) pantallaJ.add(new Txt("",200,500));


        Campo CamCliente=(Campo) pantallaJ.add(new Campo(200,180));
        Campo CamPedido=(Campo) pantallaJ.add(new Campo(200,260));
        Campo CamCosto=(Campo) pantallaJ.add(new Campo(200,340));
        Campo CamIva=(Campo) pantallaJ.add(new Campo(200,420));

        Boton botonIva=(Boton)pantallaJ.add(new Boton("Calcular Iva",0,800));
        Boton botonSalir=(Boton)pantallaJ.add(new Boton("Salir",200,800));
        Boton botonModificar=(Boton)pantallaJ.add(new Boton("Modificar",400,800));
        Boton botonEliminar=(Boton)pantallaJ.add(new Boton("Eliminar",600,800));
        Boton botonRegistrar=(Boton)pantallaJ.add(new Boton("Registrar",800,800));

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
                Orden.add(new Pedido(Integer.parseInt(CamCosto.getText()),Integer.parseInt(CamIva.getText()),Integer.parseInt(MueFlex.getText()),CamCliente.getText(),CamPedido.getText()));
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
                int suma=0;
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

                }
            }
        });

    }



}
