/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.usuario;

import com.postgrado.postgradosistema.logic.UsuarioLogic;
import com.postgrado.postgradosistema.modelo.Usuario;

import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */
public class FrmRegistrarUsuario extends javax.swing.JDialog {
int xMouse, yMouse;
    /**
     * Creates new form FrmRegistrarUsuario
     */
    public FrmRegistrarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtNombreUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtPasswordUsuario = new javax.swing.JTextField();
        jtxtDniUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtRolUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtnRegistrarUsuario = new javax.swing.JButton();
        jbtnSalirRegistrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR USUARIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 287, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel3.setText("DNI");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel4.setText("NOMBRE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));
        jPanel2.add(jtxtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 270, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));
        jPanel2.add(jtxtPasswordUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 270, 43));
        jPanel2.add(jtxtDniUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 270, 40));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel6.setText("ROL");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jtxtRolUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtRolUsuarioKeyReleased(evt);
            }
        });
        jPanel2.add(jtxtRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 270, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar023.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 39));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, 480));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jbtnRegistrarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jbtnRegistrarUsuario.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jbtnRegistrarUsuario.setText("Registrar");
        jbtnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarUsuarioActionPerformed(evt);
            }
        });

        jbtnSalirRegistrarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jbtnSalirRegistrarUsuario.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnSalirRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbtnSalirRegistrarUsuario.setText("Salir");
        jbtnSalirRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirRegistrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jbtnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jbtnSalirRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalirRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1200, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRolUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRolUsuarioKeyReleased

    }//GEN-LAST:event_jtxtRolUsuarioKeyReleased

    private void jbtnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarUsuarioActionPerformed
            String dni = jtxtDniUsuario.getText();
            String nombre = jtxtNombreUsuario.getText();
            String contraseña = jtxtPasswordUsuario.getText();
            String rol = jtxtRolUsuario.getText();

            if (!dni.isEmpty() && !nombre.isEmpty() && !contraseña .isEmpty() && !rol.isEmpty()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(nombre);
                usuario.setContraseña(contraseña);
                usuario.setRol(rol);
                usuario.setDni(Integer.parseInt(dni));
                UsuarioLogic usuarioLogic = new UsuarioLogic();
                if (usuarioLogic.registrarUsuario(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado");
                    jtxtDniUsuario.setText("");
                    jtxtNombreUsuario.setText("");
                    jtxtPasswordUsuario.setText("");
                    jtxtRolUsuario.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
    }//GEN-LAST:event_jbtnRegistrarUsuarioActionPerformed

    private void jbtnSalirRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirRegistrarUsuarioActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbtnSalirRegistrarUsuarioActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

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
            java.util.logging.Logger.getLogger(FrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistrarUsuario dialog = new FrmRegistrarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnRegistrarUsuario;
    private javax.swing.JButton jbtnSalirRegistrarUsuario;
    private javax.swing.JTextField jtxtDniUsuario;
    private javax.swing.JTextField jtxtNombreUsuario;
    private javax.swing.JTextField jtxtPasswordUsuario;
    private javax.swing.JTextField jtxtRolUsuario;
    // End of variables declaration//GEN-END:variables
}
