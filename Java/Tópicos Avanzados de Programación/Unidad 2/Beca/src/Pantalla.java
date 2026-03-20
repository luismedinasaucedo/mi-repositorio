
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pantalla extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pantalla.class.getName());
    int i=-1,beca=0,mostrar=-1;
    String [] Nombre=new String[5];
    String [] NC=new String[5];
    String [] Beca=new String[5];
    DefaultTableModel tabla1;
    Object [] objeto=new Object[3];
    
    public Pantalla() {
        initComponents();
        tabla1=(DefaultTableModel)jtabla1.getModel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        BotonR = new javax.swing.JRadioButton();
        LabelBeca = new javax.swing.JLabel();
        botonregistrar = new javax.swing.JButton();
        botonlimpiar = new javax.swing.JButton();
        botonsig = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        jLabel1.setText("Numero de control");

        jLabel2.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");

        jtabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de control", "Nombre", "Beca"
            }
        ));
        jScrollPane1.setViewportView(jtabla1);

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        BotonR.setText("Zona rural");
        BotonR.addActionListener(this::BotonRActionPerformed);

        LabelBeca.setText("Beca");
        LabelBeca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonregistrar.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        botonregistrar.setText("Registrar");
        botonregistrar.addActionListener(this::botonregistrarActionPerformed);

        botonlimpiar.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        botonlimpiar.setText("Limpiar");
        botonlimpiar.addActionListener(this::botonlimpiarActionPerformed);

        botonsig.setFont(new java.awt.Font("Adwaita Sans", 0, 24)); // NOI18N
        botonsig.setText("<<>>");
        botonsig.addActionListener(this::botonsigActionPerformed);

        jLabel3.setFont(new java.awt.Font("Adwaita Sans", 0, 36)); // NOI18N
        jLabel3.setText("Tec de Colima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(61, 61, 61))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotonR)
                                        .addGap(110, 110, 110)
                                        .addComponent(LabelBeca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2))
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4))
                                    .addComponent(botonlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonsig, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(302, 302, 302))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonregistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2)
                            .addComponent(botonlimpiar))
                        .addGap(1, 1, 1))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonsig))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonR)
                            .addComponent(LabelBeca))))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void botonregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistrarActionPerformed
        try{i++;
            if (jTextField1.getText().equals("")||jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Capturar datos");
            }else{
                if (BotonR.isSelected()==true) {
                    beca=15000;
                }else{
                    beca=9000;
                }
            }
            NC[i]=jTextField1.getText();
            Nombre[i]=jTextField2.getText();
            Beca[i]=String.valueOf(beca);
            objeto[0]=jTextField1.getText();
            objeto[1]=jTextField2.getText();
            objeto[2]=beca;
            tabla1.addRow(objeto);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Exedio los datos");
            i=4;
        }
    }//GEN-LAST:event_botonregistrarActionPerformed

    private void botonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlimpiarActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");

    }//GEN-LAST:event_botonlimpiarActionPerformed

    private void botonsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsigActionPerformed
        i++;
        if (i>=NC.length) {
            i=0;
        }
        jTextField1.setText(NC[i]);
        jTextField2.setText(Nombre[i]);
    }//GEN-LAST:event_botonsigActionPerformed

    private void BotonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Pantalla().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonR;
    private javax.swing.JLabel LabelBeca;
    private javax.swing.JButton botonlimpiar;
    private javax.swing.JButton botonregistrar;
    private javax.swing.JButton botonsig;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable jtabla1;
    // End of variables declaration//GEN-END:variables
}
