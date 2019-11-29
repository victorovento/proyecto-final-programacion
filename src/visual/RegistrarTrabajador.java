/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import fabrica.de.bebidas.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LukeSkywalker
 */
public class RegistrarTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form Empresa_1
     */
    FabricaBebidas fb = new FabricaBebidas();

    public RegistrarTrabajador() {
        initComponents();
        obrero.setSelected(true);
        jCate.removeAllItems();

            jCate.addItem("1");
            jCate.addItem("2");
            jCate.addItem("3");
            dirigente.setSelected(false);
            jLabel5.setText("Categoria");
            jLabel5.setVisible(true);
            jTextNombre.setVisible(true);
        jLabel5.setText("Categoria");
        jLabel5.setVisible(true);
        jTextNombre.setVisible(true);
        try {
            fb.CargarTrabajadores();
        } catch (IOException ex) {
            Logger.getLogger(RegistrarTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BorderLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextDireccion = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextCI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCateNombre = new javax.swing.JLabel();
        obrero = new javax.swing.JRadioButton();
        dirigente = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jCate = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextAnnos = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        BorderLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(BorderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 0, 0));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel14.setText("Registro:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 50));

        jButton1.setText("Agregar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 110, 40));

        jTextDireccion.setFont(new java.awt.Font("Gadugi", 0, 22)); // NOI18N
        jTextDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 190, 30));

        jTextNombre.setFont(new java.awt.Font("Gadugi", 0, 22)); // NOI18N
        jTextNombre.setToolTipText("");
        jTextNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 190, 30));

        jTextCI.setFont(new java.awt.Font("Gadugi", 0, 22)); // NOI18N
        jTextCI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCIActionPerformed(evt);
            }
        });
        jTextCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCIKeyTyped(evt);
            }
        });
        jPanel1.add(jTextCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 190, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("CI:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jCateNombre.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jCateNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jCateNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, 30));

        obrero.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(obrero);
        obrero.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        obrero.setText("Obrero");
        obrero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obreroMouseClicked(evt);
            }
        });
        obrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obreroActionPerformed(evt);
            }
        });
        jPanel1.add(obrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        dirigente.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(dirigente);
        dirigente.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        dirigente.setText("Dirigente");
        dirigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirigenteActionPerformed(evt);
            }
        });
        jPanel1.add(dirigente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 120, 40));

        jCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCateActionPerformed(evt);
            }
        });
        jPanel1.add(jCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 110, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Años de Experiencia:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextAnnos.setFont(new java.awt.Font("Gadugi", 0, 22)); // NOI18N
        jTextAnnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextAnnos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAnnosKeyTyped(evt);
            }
        });
        jPanel1.add(jTextAnnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 190, 30));

        jButton3.setText("Atrás");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cloce.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 20, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        setOpacity((float) 1);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
        setOpacity((float) 0.8);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCateActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Trabajadores t1 = new Trabajadores();
        t1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void dirigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirigenteActionPerformed
        // TODO add your handling code here:
        if (dirigente.isSelected()) {
            jCate.removeAllItems();
            jCate.addItem("1");
            jCate.addItem("2");
            obrero.setSelected(false);
            jLabel5.setText("Nivel");
            jLabel5.setVisible(true);

        } else {
            jLabel5.setVisible(false);

        }
    }//GEN-LAST:event_dirigenteActionPerformed

    private void obreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obreroActionPerformed
        // TODO add your handling code here:
        if (obrero.isSelected()) {
            jCate.removeAllItems();

            jCate.addItem("1");
            jCate.addItem("2");
            jCate.addItem("3");
            dirigente.setSelected(false);
            jLabel5.setText("Categoria");
            jLabel5.setVisible(true);
            jTextNombre.setVisible(true);
        } else {
            jLabel5.setVisible(false);
            jTextNombre.setVisible(false);
        }
    }//GEN-LAST:event_obreroActionPerformed

    private void obreroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obreroMouseClicked

    }//GEN-LAST:event_obreroMouseClicked

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Trabajadores emp = new Trabajadores();
        emp.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Estás seguro de que deseas salir", "Salir", dialog);
        if (result == 0) {
            System.exit(0);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        char typed = evt.getKeyChar();
        if ((typed >= '0' && typed <= '9') || jTextNombre.getText().length() > 99) {
            evt.consume();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCIKeyTyped
        char typed = evt.getKeyChar();
        if (!(typed >= '0' && typed <= '9') || jTextCI.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextCIKeyTyped

    private void jTextAnnosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAnnosKeyTyped
        char typed = evt.getKeyChar();
        if (!(typed >= '0' && typed <= '9') || jTextAnnos.getText().length() > 1) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAnnosKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a, b, c, d;
        a = jTextNombre.getText();
        b = jTextAnnos.getText();
        c = jTextCI.getText();
        d = jTextDireccion.getText();

        if (!a.equals("") && !b.equals("") && !c.equals("") && !d.equals("")) {
            if (c.length() == 11) {

                try {
                    if (obrero.isSelected()) {
                        fb.AddTrabajador(new Obrero(Integer.parseInt(jCate.getSelectedItem().toString()), jTextNombre.getText(),
                                jTextCI.getText(), jTextDireccion.getText(), Integer.parseInt(jTextAnnos.getText())));
                        System.out.println("Obrero Añadido Correctamente");
                        JOptionPane.showMessageDialog(rootPane, "Obrero añadido correctamente");
                        System.out.println(fb.getListaTrabajadores().size());
                        jTextNombre.setText("");
                        jTextAnnos.setText("");
                        jTextCI.setText("");
                        jTextDireccion.setText("");
                    } else if (dirigente.isSelected()) {
                        fb.AddTrabajador(new Dirigente(Integer.parseInt(jCate.getSelectedItem().toString()), jTextNombre.getText(),
                                jTextCI.getText(), jTextDireccion.getText(), Integer.parseInt(jTextAnnos.getText())));
                        System.out.println("Dirigente Añadido Correctamente");
                        JOptionPane.showMessageDialog(rootPane, "Trabajador añadido correctamente");
                        System.out.println(fb.getListaTrabajadores().size());
                        jTextNombre.setText("");
                        jTextAnnos.setText("");
                        jTextCI.setText("");
                        jTextDireccion.setText("");
                        obrero.setSelected(true);
                    }
                    fb.GuardarListTrabajadores();
                } catch (IOException ex) {
                    Logger.getLogger(RegistrarTrabajador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Faltan numeros en el Carnet de Identidad");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Faltan Parametros por LLenar");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCIActionPerformed
    int xy, xx;
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BorderLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dirigente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCate;
    private javax.swing.JLabel jCateNombre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextAnnos;
    private javax.swing.JTextField jTextCI;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JRadioButton obrero;
    // End of variables declaration//GEN-END:variables
}