
import javax.swing.JOptionPane;

public class Jugo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Jugo.class.getName());
    Bebida Orden[]=new Bebida[5];
    int contador=0;
    int max=0;
    public Jugo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoCliente = new javax.swing.JTextField();
        CampoBebida = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        BotonSig = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LContador = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jugos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Jugos");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Bebida");

        CampoCliente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        CampoBebida.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        CampoBebida.addActionListener(this::CampoBebidaActionPerformed);

        BotonRegistrar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(this::BotonRegistrarActionPerformed);

        BotonLimpiar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(this::BotonLimpiarActionPerformed);

        BotonSig.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonSig.setText("<<<>>>");
        BotonSig.addActionListener(this::BotonSigActionPerformed);

        BotonEliminar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(this::BotonEliminarActionPerformed);

        BotonModificar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(this::BotonModificarActionPerformed);

        BotonSuma.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        BotonSuma.setText("Suma de precios");
        BotonSuma.addActionListener(this::BotonSumaActionPerformed);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Mango-300x300.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Costo");

        CampoPrecio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Numero de Cliente:");

        LContador.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        LContador.setText("0");

        BotonSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(this::BotonSalirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoBebida)
                                    .addComponent(CampoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(CampoPrecio)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(LContador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonLimpiar)
                            .addComponent(jLabel6)
                            .addComponent(LContador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonSig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonModificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CampoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonSuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonSalir))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(532, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoBebidaActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        if (contador<=0) {
            contador=0;
        }
        if (CampoCliente.getText().isEmpty()||CampoPrecio.getText().isEmpty()||CampoBebida.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vacio");
            return;
        }
        if (contador>=Orden.length){
            JOptionPane.showMessageDialog(null, "Maximo de clientes alcanzado");
            return;}
        Orden[contador]=new Bebida();
        Orden[contador].Cliente=CampoCliente.getText();
        Orden[contador].Precio=Integer.parseInt(CampoPrecio.getText());
        Orden[contador].Bebida=CampoBebida.getText();
        JOptionPane.showMessageDialog(null, "se regsitro cliente "+contador);
        contador++;
        max++;
        LContador.setText(String.valueOf(contador));
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        CampoCliente.setText("");
        CampoPrecio.setText("");
        CampoBebida.setText("");
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSigActionPerformed
        if (max==0) {
            JOptionPane.showMessageDialog(null, " Aun no se registra ningun dato ");
            return;
        }
        if (contador>=Orden.length-1||contador>=max-1) {
            contador=-1;
        }
        contador++;
        LContador.setText(String.valueOf(contador));
        CampoCliente.setText(Orden[contador].Cliente);
        CampoPrecio.setText(String.valueOf(Orden[contador].Precio));
        CampoBebida.setText(Orden[contador].Bebida);
    }//GEN-LAST:event_BotonSigActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        int suma=0;
        for (int i = 0; i < max; i++) {
            suma=suma+Orden[i].Precio;
        }
        JOptionPane.showMessageDialog(null, " la suma es "+suma);
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        if (max==0) {
            return;
        }
        Orden[contador]=new Bebida();
        Orden[contador].Cliente=CampoCliente.getText();
        Orden[contador].Precio=Integer.parseInt(CampoPrecio.getText());
        Orden[contador].Bebida=CampoBebida.getText();
        JOptionPane.showMessageDialog(null, "se modifco cliente "+contador);
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (max<=0) {
            JOptionPane.showMessageDialog(null, "no hay datos para eliminar");
            return;
        }
        
        Orden[max-1].Cliente="";
        Orden[max-1].Precio=0;
        Orden[max-1].Bebida="";
        JOptionPane.showMessageDialog(null, "se elimino el cliente " +max);
        max--;
        contador--;
        
    }//GEN-LAST:event_BotonEliminarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Jugo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSig;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JTextField CampoBebida;
    private javax.swing.JTextField CampoCliente;
    private javax.swing.JTextField CampoPrecio;
    private javax.swing.JLabel LContador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
