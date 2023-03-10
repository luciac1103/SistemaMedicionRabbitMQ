/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.sistemamedicion.microkernel.core.presentation;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Milthon Caicedo, Yazmin Gutierrez, Erica Camacho, Brandon Bohórquez, Juan Medicis
 */
public class GUIMenu extends javax.swing.JFrame {
    /**
     * Creates new form GUIMenu
     */
    public GUIMenu() {
        this.setLocationRelativeTo(this);
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

        jDesktopEscritorio = new javax.swing.JDesktopPane();
        jLabeltTitulo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemIniciarSimulacion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeltTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltTitulo.setText("SIMULACIÓN DE UN SISTEMA DE MEDICIÓN DE PRODUCTOS");

        jDesktopEscritorio.setLayer(jLabeltTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopEscritorioLayout = new javax.swing.GroupLayout(jDesktopEscritorio);
        jDesktopEscritorio.setLayout(jDesktopEscritorioLayout);
        jDesktopEscritorioLayout.setHorizontalGroup(
            jDesktopEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopEscritorioLayout.setVerticalGroup(
            jDesktopEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltTitulo)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopEscritorio, java.awt.BorderLayout.CENTER);

        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu3.setText("Opciones");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItemIniciarSimulacion.setText("Simulación");
        jMenuItemIniciarSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarSimulacionActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemIniciarSimulacion);
        jMenu3.add(jSeparator1);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemSalir);

        jMenuBar2.add(jMenu3);

        jMenu6.setText("Ayuda");

        jMenuItemAyuda.setText("Ayuda");
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemAyuda);

        jMenuBar2.add(jMenu6);

        jMenu1.setText("Salir");

        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed
    /**
     * accion para iniciar la simulacion 
     * @param evt 
     */
    private void jMenuItemIniciarSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarSimulacionActionPerformed
        // TODO add your handling code here:
        GUIItemMedicion objGUIItemMedicion = new GUIItemMedicion();
        objGUIItemMedicion.setMaximizable(true);
        objGUIItemMedicion.setLocation(60, 50);
        this.jDesktopEscritorio.add(objGUIItemMedicion);
        objGUIItemMedicion.show();                             
        
    }//GEN-LAST:event_jMenuItemIniciarSimulacionActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed
        // TODO add your handling code here:
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Porfavor rellene los campos de medición para realizar\nla consulta");
    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopEscritorio;
    private javax.swing.JLabel jLabeltTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemIniciarSimulacion;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
