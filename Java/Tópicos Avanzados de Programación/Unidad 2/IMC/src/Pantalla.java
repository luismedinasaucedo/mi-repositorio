
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Pantalla extends javax.swing.JFrame {
    double Hombre[]=new double[3];
    double Mujer[]=new double[3];
    int conH=0,conM=0;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pantalla.class.getName());

    public Pantalla() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoIMC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampoIdeal = new javax.swing.JLabel();
        CampoEstatura = new javax.swing.JTextField();
        CampoPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EsHombre = new javax.swing.JRadioButton();
        EsMujer = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BotonPromedio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mujer");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Estatura (M)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Peso");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("IMC");

        CampoIMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Peso Ideal");

        CampoIdeal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N

        EsHombre.setText("EsHombre");

        EsMujer.setText("EsMujer");
        EsMujer.addActionListener(this::EsMujerActionPerformed);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton1.setText("Calcular");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        BotonGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(this::BotonGuardarActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setText("Calculadora IMC");

        BotonPromedio.setFont(new java.awt.Font("Adwaita Sans", 0, 18)); // NOI18N
        BotonPromedio.setText("Promedio");
        BotonPromedio.addActionListener(this::BotonPromedioActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EsHombre)
                                    .addComponent(jLabel1))
                                .addGap(205, 205, 205)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EsMujer)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel9)
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CampoIMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CampoPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoEstatura, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonPromedio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonGuardar))))))
                .addContainerGap(1146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CampoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(CampoIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CampoIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(BotonGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(BotonPromedio))))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EsHombre)
                    .addComponent(EsMujer))
                .addContainerGap(488, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EsMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsMujerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        double a,b,c;
        a = Double.parseDouble(CampoEstatura.getText());
        b = Double.parseDouble(CampoPeso.getText());
        double imc = b / (a * a);

        String imcFormateado = String.format("%.2f", imc);
        double ideal = (a*100-100)-((a*100-150)/4);
        CampoIdeal.setText(String.valueOf(ideal));
        CampoIMC.setText(String.valueOf(imc));
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null,"IMC: " + imcFormateado + " SUFRE BAJO PESO\n"+ "Peso Ideal: "+ideal );
            
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null,"IMC: " + imcFormateado + "\n"+ "Peso Ideal: "+ideal);
            
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null,"IMC: " + imcFormateado + " SUFRE SOBREPESO"+ "\nPeso Ideal: "+ideal);
        } else {
            JOptionPane.showMessageDialog(null,"IMC: " + imcFormateado + " SUFRE OBESIDAD"+ "\nPeso Ideal: "+ideal);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if (EsHombre.isSelected()) {
            if (conH>=Mujer.length) {
                JOptionPane.showMessageDialog(null,"Maximo de datos guardados");
                return;
            }
            JOptionPane.showMessageDialog(null,"Es Hombre y su imc es de "+CampoIMC.getText());
            Hombre[conH++]=Double.parseDouble(CampoIMC.getText());
        }
        else if(EsMujer.isSelected()){
            if (conM>=Mujer.length) {
                JOptionPane.showMessageDialog(null,"Maximo de datos guardados");
                return;
            }
            
            JOptionPane.showMessageDialog(null,"Es Mujer y su imc es de "+CampoIMC.getText());
            Mujer[conM++]=Double.parseDouble(CampoIMC.getText());
            
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPromedioActionPerformed
        double promH=0;
        if (conH==0) {
            JOptionPane.showMessageDialog(null,"No hay datos");
            return;
        }
        for (int i = 0; i < conH; i++) {
            promH=promH+Hombre[i];
        }
        promH=promH/conH;
        JOptionPane.showMessageDialog(null,"El Promedio es: "+promH);

    }//GEN-LAST:event_BotonPromedioActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Pantalla().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonPromedio;
    private javax.swing.JTextField CampoEstatura;
    private javax.swing.JLabel CampoIMC;
    private javax.swing.JLabel CampoIdeal;
    private javax.swing.JTextField CampoPeso;
    private javax.swing.JRadioButton EsHombre;
    private javax.swing.JRadioButton EsMujer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
