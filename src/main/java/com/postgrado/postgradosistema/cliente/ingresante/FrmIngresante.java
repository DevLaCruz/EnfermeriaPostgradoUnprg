/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgrado.postgradosistema.cliente.ingresante;

import com.postgrado.postgradosistema.cliente.FrmAdmin;
import com.postgrado.postgradosistema.cliente.FrmMantenimiento;
import com.postgrado.postgradosistema.cliente.area.FrmArea;
import com.postgrado.postgradosistema.cliente.ciclo.FrmCiclo;
import com.postgrado.postgradosistema.cliente.especialidad.FrmEspecialidad;
import com.postgrado.postgradosistema.cliente.proyecto.FrmProyecto;
import com.postgrado.postgradosistema.cliente.sede.FrmSede;
import com.postgrado.postgradosistema.logic.IngresanteLogic;
import com.postgrado.postgradosistema.modelo.Ingresante;
import login.FrmLogin1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.List;

/**
 * @author ESTUDIANTE-WALTHER GALAN VITE
 */
public class FrmIngresante extends javax.swing.JFrame {

    IngresanteLogic ingresanteLogic = new IngresanteLogic();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form FrmIngresante
     */
    public FrmIngresante() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtBuscarPorNombreIngresante = new javax.swing.JTextField();
        jbtnMostrarTablaIngresante = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnRegistrarIngresante = new javax.swing.JButton();
        jbtnModificarIngresante = new javax.swing.JButton();
        jbtnEliminarIngresante = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();
        jTableEspecialidad = new javax.swing.JScrollPane();
        jTableIngresante = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemArea = new javax.swing.JMenuItem();
        jMenuItemCiclo = new javax.swing.JMenuItem();
        jMenuItemEspecialidad = new javax.swing.JMenuItem();
        jMenuItemSede = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemProyecto = new javax.swing.JMenuItem();
        jMenuItemIngresante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 60));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jLabel1.setText("ESTUDIANTE");

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel2.setText("BUSCAR");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jtxtBuscarPorNombreIngresante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarPorNombreIngresanteKeyReleased(evt);
            }
        });

        jbtnMostrarTablaIngresante.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMostrarTablaIngresante.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnMostrarTablaIngresante.setText("Mostrar");
        jbtnMostrarTablaIngresante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarTablaIngresanteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante02.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(516, 516, 516))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 256, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(31, 31, 31)
                                                .addComponent(jtxtBuscarPorNombreIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addComponent(jbtnMostrarTablaIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(245, 245, 245))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtxtBuscarPorNombreIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jbtnMostrarTablaIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1270, 210));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jbtnRegistrarIngresante.setBackground(new java.awt.Color(204, 204, 204));
        jbtnRegistrarIngresante.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnRegistrarIngresante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jbtnRegistrarIngresante.setText("Registrar");
        jbtnRegistrarIngresante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarIngresanteActionPerformed(evt);
            }
        });

        jbtnModificarIngresante.setBackground(new java.awt.Color(204, 204, 204));
        jbtnModificarIngresante.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnModificarIngresante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        jbtnModificarIngresante.setText("Modificar");
        jbtnModificarIngresante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarIngresanteActionPerformed(evt);
            }
        });

        jbtnEliminarIngresante.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarIngresante.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnEliminarIngresante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jbtnEliminarIngresante.setText("Eliminar");
        jbtnEliminarIngresante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarIngresanteActionPerformed(evt);
            }
        });

        jbtnMenu.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMenu.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jbtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jbtnMenu.setText("Menú Principal");
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jbtnRegistrarIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(jbtnModificarIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(jbtnEliminarIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnEliminarIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnModificarIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnRegistrarIngresante, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1270, 80));

        jTableEspecialidad.setBackground(new java.awt.Color(255, 255, 255));

        jTableIngresante.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "DNI", "NOMBRE", "CODIGO UNI", "CICLO", "ESPECIALIDAD", "SEDE", "PROYECTO", "ESTADO"
                }
        ));
        jTableEspecialidad.setViewportView(jTableIngresante);
        if (jTableIngresante.getColumnModel().getColumnCount() > 0) {
            jTableIngresante.getColumnModel().getColumn(0).setMinWidth(15);
            jTableIngresante.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableIngresante.getColumnModel().getColumn(1).setMinWidth(80);
            jTableIngresante.getColumnModel().getColumn(1).setMaxWidth(130);
            jTableIngresante.getColumnModel().getColumn(2).setMinWidth(220);
            jTableIngresante.getColumnModel().getColumn(2).setMaxWidth(300);
            jTableIngresante.getColumnModel().getColumn(3).setMinWidth(50);
            jTableIngresante.getColumnModel().getColumn(3).setMaxWidth(80);
            jTableIngresante.getColumnModel().getColumn(4).setMinWidth(50);
            jTableIngresante.getColumnModel().getColumn(4).setMaxWidth(70);
            jTableIngresante.getColumnModel().getColumn(6).setMinWidth(140);
            jTableIngresante.getColumnModel().getColumn(6).setMaxWidth(230);
            jTableIngresante.getColumnModel().getColumn(8).setMinWidth(50);
            jTableIngresante.getColumnModel().getColumn(8).setMaxWidth(80);
        }

        jPanel1.add(jTableEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1270, 330));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        jMenu2.setText("Mantenimiento");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        jMenuItemArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/area.png"))); // NOI18N
        jMenuItemArea.setText("Área");
        jMenuItemArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAreaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemArea);

        jMenuItemCiclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciclo.png"))); // NOI18N
        jMenuItemCiclo.setText("Ciclo");
        jMenuItemCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCicloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCiclo);

        jMenuItemEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/especialidad.png"))); // NOI18N
        jMenuItemEspecialidad.setText("Especialidad");
        jMenuItemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEspecialidadActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEspecialidad);

        jMenuItemSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sede.png"))); // NOI18N
        jMenuItemSede.setText("Sede");
        jMenuItemSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSedeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSede);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proyectos.png"))); // NOI18N
        jMenu3.setText("Proyecto");
        jMenu3.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N

        jMenuItemProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-proyecto.png"))); // NOI18N
        jMenuItemProyecto.setText("Proyecto");
        jMenuItemProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProyectoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemProyecto);

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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarIngresanteActionPerformed

        FrmRegistrarIngresante regisingresante = new FrmRegistrarIngresante(this, true);
        regisingresante.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistrarIngresanteActionPerformed

    private void jbtnModificarIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarIngresanteActionPerformed
        int filaSeleccionada = jTableIngresante.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableIngresante.getValueAt(filaSeleccionada, 8).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede modificar un Estudiante inactivo");
            } else {
                int id = Integer.parseInt(jTableIngresante.getValueAt(filaSeleccionada, 0).toString());
                String dni = jTableIngresante.getValueAt(filaSeleccionada, 1).toString();
                String nombre = jTableIngresante.getValueAt(filaSeleccionada, 2).toString();
                String codigoUni = jTableIngresante.getValueAt(filaSeleccionada, 3).toString();
                String ciclo = jTableIngresante.getValueAt(filaSeleccionada, 4).toString();
                String especialidad = jTableIngresante.getValueAt(filaSeleccionada, 5).toString();
                String sede = jTableIngresante.getValueAt(filaSeleccionada, 6).toString();
                String proyecto = jTableIngresante.getValueAt(filaSeleccionada, 7).toString();

                FrmModificarIngresante modiingresante = new FrmModificarIngresante(this, true);
                modiingresante.setDatos(id, dni, nombre, codigoUni, ciclo, especialidad, sede, proyecto);
                modiingresante.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbtnModificarIngresanteActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        this.setVisible(false);
        if (FrmLogin1.tipoUsuario.equals("Administrador")) {
            FrmAdmin frmAdmin = new FrmAdmin();
            frmAdmin.setVisible(true);
        } else {
            FrmMantenimiento frmMantenimiento = new FrmMantenimiento();
            frmMantenimiento.setVisible(true);
        }
    }//GEN-LAST:event_jbtnMenuActionPerformed

    private void jMenuItemAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAreaActionPerformed
        this.setVisible(false);
        FrmArea a = new FrmArea();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItemAreaActionPerformed

    private void jMenuItemCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCicloActionPerformed

        this.setVisible(false);
        FrmCiclo c = new FrmCiclo();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemCicloActionPerformed

    private void jMenuItemEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEspecialidadActionPerformed
        this.setVisible(false);
        FrmEspecialidad e = new FrmEspecialidad();
        e.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEspecialidadActionPerformed

    private void jMenuItemSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSedeActionPerformed
        this.setVisible(false);
        FrmSede s = new FrmSede();
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSedeActionPerformed

    private void jMenuItemProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProyectoActionPerformed
        this.setVisible(false);
        FrmProyecto e = new FrmProyecto();
        e.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProyectoActionPerformed

    private void jMenuItemIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresanteActionPerformed

        this.setVisible(false);
        FrmIngresante i = new FrmIngresante();
        i.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemIngresanteActionPerformed

    private void jbtnMostrarTablaIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarTablaIngresanteActionPerformed
        listarTablaIngresante();
    }//GEN-LAST:event_jbtnMostrarTablaIngresanteActionPerformed

    private void jtxtBuscarPorNombreIngresanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarPorNombreIngresanteKeyReleased
        String nombre = jtxtBuscarPorNombreIngresante.getText();
        List<Ingresante> ingresantes = ingresanteLogic.buscaringresantePorNombre(nombre);
        modelo = (DefaultTableModel) jTableIngresante.getModel();
        modelo.setRowCount(0); // Limpiar filas existentes en la tabla
        Object[] ob = new Object[9];
        for (int i = ingresantes.size() - 1; i >= 0; i--) {
            ob[0] = ingresantes.get(i).getId();
            ob[1] = ingresantes.get(i).getDni();
            ob[2] = ingresantes.get(i).getNombre();
            ob[3] = ingresantes.get(i).getCodigo();
            ob[4] = ingresantes.get(i).getCiclo().getNombre();
            ob[5] = ingresantes.get(i).getEspecialidad().getNombre();
            ob[6] = ingresantes.get(i).getSede().getNombre();
            ob[7] = ingresantes.get(i).getProyecto().getTitulo();
            ob[8] = ingresantes.get(i).getEs_ingresante();
            modelo.addRow(ob);
        }
    }//GEN-LAST:event_jtxtBuscarPorNombreIngresanteKeyReleased

    private void jbtnEliminarIngresanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarIngresanteActionPerformed
        int filaSeleccionada = jTableIngresante.getSelectedRow();
        if (filaSeleccionada != -1) {
            if (jTableIngresante.getValueAt(filaSeleccionada, 8).toString().equals("I")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar un Estudiante inactivo");
            } else {
                int id = Integer.parseInt(jTableIngresante.getValueAt(filaSeleccionada, 0).toString());

                Ingresante ingresante = new Ingresante();
                ingresante.setId(id);
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el ingresante?");
                if (confirmacion == JOptionPane.YES_OPTION) {
                    if (ingresanteLogic.eliminarIngresante(ingresante)) {
                        JOptionPane.showMessageDialog(null, "Ingresante eliminado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar ingresante");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino el ingresante");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbtnEliminarIngresanteActionPerformed

    private void listarTablaIngresante() {
        List<Ingresante> ingresantes = ingresanteLogic.listaIngresantes();
        modelo = (DefaultTableModel) jTableIngresante.getModel();
        modelo.setRowCount(0); // Limpiar filas existentes en la tabla
        Object[] ob = new Object[9];
        for (int i = ingresantes.size() - 1; i >= 0; i--) {
            ob[0] = ingresantes.get(i).getId();
            ob[1] = ingresantes.get(i).getDni();
            ob[2] = ingresantes.get(i).getNombre();
            ob[3] = ingresantes.get(i).getCodigo();
            ob[4] = ingresantes.get(i).getCiclo().getNombre();
            ob[5] = ingresantes.get(i).getEspecialidad().getNombre();
            ob[6] = ingresantes.get(i).getSede().getNombre();
            ob[7] = ingresantes.get(i).getProyecto().getTitulo();
            ob[8] = ingresantes.get(i).getEs_ingresante();
            modelo.addRow(ob); // Agregar fila con los datos del ingresante
        }
        jTableIngresante.setModel(modelo);
        JTableHeader header = jTableIngresante.getTableHeader();
        header.setOpaque(false);
    }

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
            java.util.logging.Logger.getLogger(FrmIngresante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngresante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemArea;
    private javax.swing.JMenuItem jMenuItemCiclo;
    private javax.swing.JMenuItem jMenuItemEspecialidad;
    private javax.swing.JMenuItem jMenuItemIngresante;
    private javax.swing.JMenuItem jMenuItemProyecto;
    private javax.swing.JMenuItem jMenuItemSede;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jTableEspecialidad;
    private javax.swing.JTable jTableIngresante;
    private javax.swing.JButton jbtnEliminarIngresante;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnModificarIngresante;
    private javax.swing.JButton jbtnMostrarTablaIngresante;
    private javax.swing.JButton jbtnRegistrarIngresante;
    private javax.swing.JTextField jtxtBuscarPorNombreIngresante;
    // End of variables declaration//GEN-END:variables
}
