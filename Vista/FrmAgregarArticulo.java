package Vista;

import Inicio.InicioFerreteria;
import Modelo.Articulo;


public class FrmAgregarArticulo extends javax.swing.JFrame {

    public FrmAgregarArticulo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbCodArt = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        lbPrecioUnitario = new javax.swing.JLabel();
        lbCant = new javax.swing.JLabel();
        txtCodArt = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitulo.setText("Nuevo Artículo");

        lbCodArt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbCodArt.setText("Código de Artículo:");

        lbDesc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbDesc.setText("Descripción:");

        lbPrecioUnitario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbPrecioUnitario.setText("Precio Unitario:");

        lbCant.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbCant.setText("Cantidad:");

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDesc)
                            .addComponent(lbCodArt)
                            .addComponent(lbCant)
                            .addComponent(lbPrecioUnitario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCant, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCodArt, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lbTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCodArt)
                    .addComponent(txtCodArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDesc)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecioUnitario)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCant)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        String codArticulo = this.txtCodArt.getText();
        String desc = this.txtDesc.getText();
        double precioUnitario = Double.parseDouble(this.txtPrecioUnitario.getText());
        int cant = (int) Double.parseDouble(this.txtCant.getText());
        
        Articulo unArticulo = new Articulo(codArticulo, desc, precioUnitario, cant);
        
        InicioFerreteria.listaInventario.add(unArticulo);
        
        this.txtCodArt.setText("");
        this.txtDesc.setText("");
        this.txtPrecioUnitario.setText("");
        this.txtCant.setText("");
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        new FrmInventario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lbCant;
    private javax.swing.JLabel lbCodArt;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbPrecioUnitario;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodArt;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
