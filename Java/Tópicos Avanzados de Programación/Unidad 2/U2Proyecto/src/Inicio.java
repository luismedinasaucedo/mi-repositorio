
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

 public class Inicio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Inicio.class.getName());
 
    public Inicio() {
        

        initComponents();
    }

        class Moto{
    String Color,Marca,Modelo,Origen;
    double precio;

        public Moto(String Color, String Marca, String Modelo, String Origen, double precio) {
            this.Color = Color;
            this.Marca = Marca;
            this.Modelo = Modelo;
            this.Origen = Origen;
            this.precio = precio;
        }
    
      
    }//
     static ArrayList<Moto> Lista = new ArrayList<>();
    static int i = 0;
    
     public boolean validarDatos(String texto, int tipo) {
        for (int j = 0; j < texto.length(); j++) {
            char c = texto.charAt(j);
            int ascii = (int) c;
            if (tipo == 1) {  
                if (!((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || ascii == 32)) {
                    return false;
                }
            } else if (tipo == 2) { // Rango para números (0-9)
                if (!(ascii >= 48 && ascii <= 57)) {
                    return false;
                }
            }
        }
        return true;  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Aumento = new javax.swing.JButton();
        Derec = new javax.swing.JButton();
        Izq = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        z = new javax.swing.JButton();
        A = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TMarca = new javax.swing.JTextField();
        TModelo = new javax.swing.JTextField();
        TColor = new javax.swing.JTextField();
        TOrigen = new javax.swing.JTextField();
        TPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motocicletas");
        setBackground(new java.awt.Color(102, 102, 102));

        Aumento.setBackground(new java.awt.Color(0, 0, 0));
        Aumento.setForeground(new java.awt.Color(255, 255, 255));
        Aumento.setText("Aumentar precio");
        Aumento.setOpaque(true);
        Aumento.addActionListener(this::AumentoActionPerformed);

        Derec.setBackground(new java.awt.Color(0, 0, 0));
        Derec.setForeground(new java.awt.Color(255, 255, 255));
        Derec.setText(">>>");
        Derec.setOpaque(true);
        Derec.addActionListener(this::DerecActionPerformed);

        Izq.setBackground(new java.awt.Color(0, 0, 0));
        Izq.setForeground(new java.awt.Color(255, 255, 255));
        Izq.setText("<<<");
        Izq.setOpaque(true);
        Izq.addActionListener(this::IzqActionPerformed);

        Salir.setBackground(new java.awt.Color(51, 0, 0));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setOpaque(true);
        Salir.addActionListener(this::SalirActionPerformed);

        z.setBackground(new java.awt.Color(0, 0, 0));
        z.setForeground(new java.awt.Color(255, 255, 255));
        z.setText("Buscar terminacion Z");
        z.setOpaque(true);
        z.addActionListener(this::zActionPerformed);

        A.setBackground(new java.awt.Color(0, 0, 0));
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("Buscar por A");
        A.setOpaque(true);
        A.addActionListener(this::AActionPerformed);

        Guardar.setBackground(new java.awt.Color(0, 0, 0));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("Guardar");
        Guardar.setOpaque(true);
        Guardar.addActionListener(this::GuardarActionPerformed);

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.setOpaque(true);
        Modificar.addActionListener(this::ModificarActionPerformed);

        Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.setOpaque(true);
        Eliminar.addActionListener(this::EliminarActionPerformed);

        Nuevo.setBackground(new java.awt.Color(0, 0, 0));
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.setOpaque(true);
        Nuevo.addActionListener(this::NuevoActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Izq, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Derec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Salir, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Aumento)
                                    .addGap(21, 21, 21))
                                .addComponent(z))
                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Izq)
                    .addComponent(Derec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(z)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Aumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Color");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modelo");

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Origen");

        TMarca.setBackground(new java.awt.Color(255, 255, 255));
        TMarca.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        TMarca.setForeground(new java.awt.Color(0, 0, 0));
        TMarca.setText(" ");
        TMarca.setOpaque(true);

        TModelo.setBackground(new java.awt.Color(255, 255, 255));
        TModelo.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        TModelo.setForeground(new java.awt.Color(0, 0, 0));
        TModelo.setText(" ");
        TModelo.setOpaque(true);

        TColor.setBackground(new java.awt.Color(255, 255, 255));
        TColor.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        TColor.setForeground(new java.awt.Color(0, 0, 0));
        TColor.setText(" ");
        TColor.setOpaque(true);

        TOrigen.setBackground(new java.awt.Color(255, 255, 255));
        TOrigen.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        TOrigen.setForeground(new java.awt.Color(0, 0, 0));
        TOrigen.setText(" ");
        TOrigen.setOpaque(true);

        TPrecio.setBackground(new java.awt.Color(255, 255, 255));
        TPrecio.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        TPrecio.setForeground(new java.awt.Color(0, 0, 0));
        TPrecio.setText(" ");
        TPrecio.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TColor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/122.png"))); // NOI18N
        jLabel6.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
         double precio = Double.parseDouble(TPrecio.getText());
        Lista.add(new Moto(TColor.getText(),TMarca.getText(),TModelo.getText()
        ,TOrigen.getText(),precio));
        Nuevo();
        
         JOptionPane.showMessageDialog(null, "Registro almacenado " + "CON EXITO ");        
    }//GEN-LAST:event_GuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0);
       dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (Lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros existentes ");   
        }
      TModelo.setText("");
      TColor.setText("");
      TMarca.setText("");
      TOrigen.setText("");
      TPrecio.setText("");
      Lista.remove(i);
      JOptionPane.showMessageDialog(null, "Registro ELIMINADO " + "CON EXITO ");   
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if (Lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros existentes ");   
        }
        double precio = Double.parseDouble(TPrecio.getText());
      
        Lista.set(i,new Moto(TColor.getText(),TMarca.getText(),TModelo.getText()
        ,TOrigen.getText(),precio));
         JOptionPane.showMessageDialog(null, "Registro modificado " + "CON EXITO ");       
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void IzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzqActionPerformed
              
try {
    if (Lista.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay registros guardados");
        return;
    }
    i--;
    if (i < 0) {
        i = Lista.size() - 1;
    }
    String precioS = String.valueOf(Lista.get(i).precio);
    TMarca.setText(Lista.get(i).Marca);    
    TModelo.setText(Lista.get(i).Modelo); 
    TColor.setText(Lista.get(i).Color);    
    TOrigen.setText(Lista.get(i).Origen);    
    TPrecio.setText(precioS);    
 

} catch (Exception x) {
    JOptionPane.showMessageDialog(null, "Error al retroceder: " + x.getMessage());
}
    }//GEN-LAST:event_IzqActionPerformed

    private void DerecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerecActionPerformed
                 
try {
    if (Lista.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay registros guardados");
        return;
    }
    i++;
    if (i >= Lista.size()) {
        i = 0;
    }
    String precioS = String.valueOf(Lista.get(i).precio);
    TMarca.setText(Lista.get(i).Marca);    
    TModelo.setText(Lista.get(i).Modelo); 
    TColor.setText(Lista.get(i).Color);    
    TOrigen.setText(Lista.get(i).Origen);    
    TPrecio.setText(precioS);    
 

} catch (Exception x) {
    JOptionPane.showMessageDialog(null, "Error al retroceder: " + x.getMessage());
}
    }//GEN-LAST:event_DerecActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
       Nuevo();
    }//GEN-LAST:event_NuevoActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        if (Lista.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay motos en el inventario.");
                    return;
                }
                String resultados = "Motos cuyo modelo termina con 'Z':\n\n";
                boolean encontro = false;
                for (Moto moto : Lista) {
                    if (moto.Modelo.toLowerCase().endsWith("z")) {
                        resultados += "- " + moto.Marca + " " + moto.Modelo + " ($" + moto.precio + ")\n";
                        encontro = true;
                    }
                }
                if (encontro) {                    
                    JOptionPane.showMessageDialog(null, resultados, "Filtro de Modelos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron modelos que inicien con la letra 'Z'.");
                }
    }//GEN-LAST:event_zActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
      if (Lista.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay motos en el inventario.");
                    return;
                }
                String resultados = "Motos cuyo modelo empieza con 'A':\n\n";
                boolean encontro = false;
                for (Moto moto : Lista) {
                    if (moto.Modelo.toLowerCase().startsWith("a")) {
                        resultados += "- " + moto.Marca + " " + moto.Modelo + " ($" + moto.precio + ")\n";
                        encontro = true;
                    }
                }
                if (encontro) {                    
                    JOptionPane.showMessageDialog(null, resultados, "Filtro de Modelos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron modelos que inicien con la letra 'A'.");
                }
    }//GEN-LAST:event_AActionPerformed

    private void AumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AumentoActionPerformed
 if (Lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros existentes ");   
        }
        double precio = Double.parseDouble(TPrecio.getText());
        precio = precio*1.10;
        Lista.set(i,new Moto(TColor.getText(),TMarca.getText(),TModelo.getText()
        ,TOrigen.getText(),precio));
         JOptionPane.showMessageDialog(null, "Registro modificado " + "CON EXITO ");       
              
    }//GEN-LAST:event_AumentoActionPerformed
 
    public void Nuevo(){
      TModelo.setText("");
      TColor.setText("");
      TMarca.setText("");
      TOrigen.setText("");
      TPrecio.setText("");
      i++;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Inicio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton Aumento;
    private javax.swing.JButton Derec;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Izq;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField TColor;
    private javax.swing.JTextField TMarca;
    private javax.swing.JTextField TModelo;
    private javax.swing.JTextField TOrigen;
    private javax.swing.JTextField TPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables
}
