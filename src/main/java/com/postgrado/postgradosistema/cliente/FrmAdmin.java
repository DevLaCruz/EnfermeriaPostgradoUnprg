 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package com.postgrado.postgradosistema.cliente;

 import com.postgrado.postgradosistema.cliente.ingresante.FrmIngresante;
 import com.postgrado.postgradosistema.cliente.proyecto.FrmProyecto;
 import login.FrmLogin1;

 import javax.swing.*;

 /**
  * @author ESTUDIANTE-WALTHER GALAN VITE
  */
 public class FrmAdmin extends javax.swing.JFrame {
     int xMouse, yMouse;

     /**
      * Creates new form FrmPrincipal
      */
     public FrmAdmin() {
         initComponents();
         setLocationRelativeTo(null);
         setIconImage(new ImageIcon(getClass().getResource("/imagenes/enfermeria.png")).getImage());

     }

     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

         jPanel3 = new javax.swing.JPanel();
         cambiar_usuario = new javax.swing.JLabel();
         jLabel1 = new javax.swing.JLabel();
         jMenuBar1 = new javax.swing.JMenuBar();
         jMenu1 = new javax.swing.JMenu();
         jMenu3 = new javax.swing.JMenu();
         jMenuItemProyecto = new javax.swing.JMenuItem();
         jMenuItemIngresante = new javax.swing.JMenuItem();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         setResizable(false);

         jPanel3.setBackground(new java.awt.Color(255, 255, 255));
         jPanel3.setForeground(new java.awt.Color(255, 255, 255));
         jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
             public void mouseDragged(java.awt.event.MouseEvent evt) {
                 jPanel3MouseDragged(evt);
             }
         });
         jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mousePressed(java.awt.event.MouseEvent evt) {
                 jPanel3MousePressed(evt);
             }
         });
         jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

         cambiar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambiar_usuario.png"))); // NOI18N
         cambiar_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         cambiar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseExited(java.awt.event.MouseEvent evt) {
                 cambiar_usuarioMouseExited(evt);
             }

             public void mousePressed(java.awt.event.MouseEvent evt) {
                 cambiar_usuarioMousePressed(evt);
             }
         });
         jPanel3.add(cambiar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 32, 32));

         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoprincipal.png"))); // NOI18N
         jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

         jMenuBar1.setBorder(null);

         jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
         jMenu1.setText("Inicio");
         jMenu1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
         jMenuBar1.add(jMenu1);

         jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyectos.png"))); // NOI18N
         jMenu3.setText("Proyectos");
         jMenu3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

         jMenuItemProyecto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
         jMenuItemProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-proyecto.png"))); // NOI18N
         jMenuItemProyecto.setText("Proyecto");
         jMenuItemProyecto.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jMenuItemProyectoActionPerformed(evt);
             }
         });
         jMenu3.add(jMenuItemProyecto);

         jMenuItemIngresante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
         jMenuItemIngresante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
         jMenuItemIngresante.setText("Estudiante");
         jMenuItemIngresante.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jMenuItemIngresanteActionPerformed(evt);
             }
         });
         jMenu3.add(jMenuItemIngresante);

         jMenuBar1.add(jMenu3);

         setJMenuBar(jMenuBar1);

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );
         layout.setVerticalGroup(
                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );

         pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jMenuItemProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProyectoActionPerformed

         this.setVisible(false);
         FrmProyecto e = new FrmProyecto();
         e.setVisible(true);
         // TODO add your handling code here:
     }//GEN-LAST:event_jMenuItemProyectoActionPerformed

     private void jMenuItemIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresanteActionPerformed

         this.setVisible(false);
         FrmIngresante i = new FrmIngresante();
         i.setVisible(true);

     }//GEN-LAST:event_jMenuItemIngresanteActionPerformed

     private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

         int x = evt.getXOnScreen();
         int y = evt.getYOnScreen();
         this.setLocation(x - xMouse, y - yMouse);
     }//GEN-LAST:event_jPanel3MouseDragged

     private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

         xMouse = evt.getX();
         yMouse = evt.getY();
     }//GEN-LAST:event_jPanel3MousePressed

     private void cambiar_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiar_usuarioMouseExited
         // TODO add your handling code here:
     }//GEN-LAST:event_cambiar_usuarioMouseExited

     private void cambiar_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiar_usuarioMousePressed
         // TODO add your handling code here:
         FrmLogin1 frmLogin1 = new FrmLogin1();
         frmLogin1.setVisible(true);
         dispose();
     }//GEN-LAST:event_cambiar_usuarioMousePressed

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
             java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new FrmAdmin().setVisible(true);
             }
         });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel cambiar_usuario;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenu jMenu3;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JMenuItem jMenuItemIngresante;
     private javax.swing.JMenuItem jMenuItemProyecto;
     private javax.swing.JPanel jPanel3;
     // End of variables declaration//GEN-END:variables
 }
