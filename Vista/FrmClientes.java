package Vista;
import Modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FrmClientes extends javax.swing.JFrame {
private ArrayList<Cliente> clientes;
    private  void cerrar(){

        String botones[]={"cerrar","cancelar"};
        int eleccion=JOptionPane.showOptionDialog(this,"¿Desea cerrar la aplicacion?","Titulo",0,0,null,botones,this);
        if(eleccion==JOptionPane.YES_OPTION){

     
            System.exit(0);  
        }
        else if(eleccion==JOptionPane.NO_OPTION){
            System.out.println("se canceló el cierre");
        }
    }
    
    public FrmClientes() {
        initComponents();
        cargarInterfaz();
        cargardatos();
         setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    DefaultTableModel modelo;
    public void cargarInterfaz(){
         this.clientes = new ArrayList<>();
        String datos[][]={};
        String columna[]={ "ID", "NOMBRE", "APELLIDO M.", "APELIIDO P.", "RFC"};
        modelo= new DefaultTableModel(datos, columna);
        tabla.setModel(modelo);

//guardar
     String Au = "clientes.txt";
        Scanner linea = null;
        File doc = new File(Au);
        try {

            linea = new Scanner(doc);
            while (linea.hasNextLine()) {
                StringTokenizer token = new StringTokenizer(linea.nextLine(), ",");
                Cliente cliente = new Cliente(token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken(), token.nextToken()); 
                this.clientes.add(cliente); 
                modelo.addRow(new Object[] {cliente.getCodCliente(), cliente.getNombre(), cliente.getApPat(), cliente.getApMat(), cliente.getRfc()});
            }
        }

        catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Error");
        }
      
    }
    
    public void cargardatos(){
       /*
        Cliente a;
        for (int i=0; i<RegistroClientes.contenedor.size(); i++){
            a=(Cliente)RegistroClientes.contenedor.get(i);
            modelo.insertRow(contador, new Object[]{});
            modelo.setValueAt(a.getCodCliente().trim(),contador,0);
            modelo.setValueAt(a.getNombre().trim(),contador,1);
            modelo.setValueAt(a.getApPat().trim(),contador,2);
            modelo.setValueAt(a.getApMat().trim(),contador,3);
            modelo.setValueAt(a.getRfc().trim(),contador,4);
  
        }
  */       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        BotAñadir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMenu = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tabla);

        BotAñadir.setText("+");
        BotAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAñadirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel8.setText("Clientes");

        txtMenu.setText("Menu");
        txtMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMenuMouseClicked(evt);
            }
        });
        txtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecciona una linea para eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75)
                                .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAñadirActionPerformed
         
        RegistroClientes v1 = new RegistroClientes();
       
        v1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotAñadirActionPerformed

    private void txtMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMenuMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtMenuMouseClicked

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
try{
    

DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        int fila = tabla.getSelectedRow(); 
        this.clientes.remove(fila); 
        dtm.removeRow(fila);

        try{
         
            FileWriter bw= new FileWriter("clientes.txt");
            PrintWriter pw=  new  PrintWriter(bw);
            
            for(Cliente cliente: this.clientes){
                pw.format("%s,%s, %s, %s, %s\n", cliente.getCodCliente(), cliente.getNombre(),cliente.getApPat(),cliente.getApMat(),cliente.getRfc());
            }
            
            pw.close();
         }
          catch(Exception x){
             JOptionPane.showMessageDialog(null, "Generando nuevo archivo");
         } 
    } 
//exception
catch(IndexOutOfBoundsException e){
    JOptionPane.showMessageDialog(null, "Debes seleccionar una linea");
}

//IndexOutOfBoundsException
    }//GEN-LAST:event_eliminarActionPerformed

    private void txtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuActionPerformed
        
        
       FrmMenu mostrar= new FrmMenu();
       mostrar.setVisible(true);
      this.dispose();
        
         
      
      
    }//GEN-LAST:event_txtMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       cerrar();

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

            
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

     
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAñadir;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabla;
    private javax.swing.JButton txtMenu;
    // End of variables declaration//GEN-END:variables
}
