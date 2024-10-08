/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package med.voll.api.GUI;

import java.awt.Color;
import java.awt.Font;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Faby
 */
public class ActualizarMedico extends javax.swing.JDialog {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        textId = new javax.swing.JTextField();
        textDoc = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        idMedico = new javax.swing.JTextField();
        nombreMedico = new javax.swing.JTextField();
        docuMedico = new javax.swing.JTextField();
        textCiudad = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        textCalle = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        textProvincia = new javax.swing.JTextField();
        textNumero = new javax.swing.JTextField();
        textPais = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 102, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1077, 644));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("ACTUALIZACION DE DATOS DEL MEDICO");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        textId.setEditable(false);
        textId.setBackground(new java.awt.Color(51, 102, 255));
        textId.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        textId.setForeground(new java.awt.Color(255, 255, 255));
        textId.setText("ID DEL MEDICO");
        textId.setBorder(null);

        textDoc.setEditable(false);
        textDoc.setBackground(new java.awt.Color(51, 102, 255));
        textDoc.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        textDoc.setForeground(new java.awt.Color(255, 255, 255));
        textDoc.setText("DNI");
        textDoc.setBorder(null);

        textName.setEditable(false);
        textName.setBackground(new java.awt.Color(51, 102, 255));
        textName.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        textName.setForeground(new java.awt.Color(255, 255, 255));
        textName.setText("NOMBRE");
        textName.setBorder(null);

        textDireccion.setEditable(false);
        textDireccion.setBackground(new java.awt.Color(51, 102, 255));
        textDireccion.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        textDireccion.setForeground(new java.awt.Color(255, 255, 255));
        textDireccion.setText("DIRECCION");
        textDireccion.setBorder(null);

        idMedico.setBackground(new java.awt.Color(51, 102, 255));
        idMedico.setForeground(new java.awt.Color(204, 204, 204));
        idMedico.setBorder(null);

        nombreMedico.setBackground(new java.awt.Color(51, 102, 255));
        nombreMedico.setForeground(new java.awt.Color(204, 204, 204));
        nombreMedico.setBorder(null);

        docuMedico.setBackground(new java.awt.Color(51, 102, 255));
        docuMedico.setForeground(new java.awt.Color(204, 204, 204));
        docuMedico.setBorder(null);

        textCiudad.setEditable(false);
        textCiudad.setBackground(new java.awt.Color(51, 102, 255));
        textCiudad.setForeground(new java.awt.Color(255, 255, 255));
        textCiudad.setText("ciudad");
        textCiudad.setBorder(null);

        ciudad.setBackground(new java.awt.Color(51, 102, 255));
        ciudad.setForeground(new java.awt.Color(204, 204, 204));
        ciudad.setBorder(null);

        textCalle.setEditable(false);
        textCalle.setBackground(new java.awt.Color(51, 102, 255));
        textCalle.setForeground(new java.awt.Color(255, 255, 255));
        textCalle.setText("calle");
        textCalle.setBorder(null);

        calle.setBackground(new java.awt.Color(51, 102, 255));
        calle.setForeground(new java.awt.Color(204, 204, 204));
        calle.setBorder(null);

        textProvincia.setEditable(false);
        textProvincia.setBackground(new java.awt.Color(51, 102, 255));
        textProvincia.setForeground(new java.awt.Color(255, 255, 255));
        textProvincia.setText("provincia");
        textProvincia.setBorder(null);

        textNumero.setEditable(false);
        textNumero.setBackground(new java.awt.Color(51, 102, 255));
        textNumero.setForeground(new java.awt.Color(255, 255, 255));
        textNumero.setText("numero");
        textNumero.setBorder(null);

        textPais.setEditable(false);
        textPais.setBackground(new java.awt.Color(51, 102, 255));
        textPais.setForeground(new java.awt.Color(255, 255, 255));
        textPais.setText("pais");
        textPais.setBorder(null);

        provincia.setBackground(new java.awt.Color(51, 102, 255));
        provincia.setForeground(new java.awt.Color(204, 204, 204));
        provincia.setBorder(null);

        numero.setBackground(new java.awt.Color(51, 102, 255));
        numero.setForeground(new java.awt.Color(204, 204, 204));
        numero.setBorder(null);

        pais.setBackground(new java.awt.Color(51, 102, 255));
        pais.setForeground(new java.awt.Color(204, 204, 204));
        pais.setBorder(null);

        cancelar.setBackground(new java.awt.Color(255, 51, 0));
        cancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("CANCELAR");

        actualizar.setBackground(new java.awt.Color(102, 204, 255));
        actualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("ACTUALIZAR");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med/voll/api/imagenes/image (3).png"))); // NOI18N

        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textDoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(idMedico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombreMedico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(docuMedico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textCiudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ciudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textCalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(calle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textProvincia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textPais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(provincia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(numero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(actualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(docuMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualizar))
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textDireccion)
                            .addComponent(textName)
                            .addComponent(textId, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(textDoc))
                        .addGap(81, 81, 81)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(493, 493, 493))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(docuMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(textDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar)
                            .addComponent(actualizar))))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField calle;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField docuMedico;
    private javax.swing.JTextField idMedico;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombreMedico;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField pais;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField textCalle;
    private javax.swing.JTextField textCiudad;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textDoc;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textPais;
    private javax.swing.JTextField textProvincia;
    // End of variables declaration//GEN-END:variables
private String token;

    public ActualizarMedico(String token) {
        this.token = token;
        initComponents();
        setupActionListeners();
    }

    public ActualizarMedico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setupActionListeners();
    }

    private void setupActionListeners() {
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMedico(evt);
            }
        });

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });
    }

    private void actualizarMedico(java.awt.event.ActionEvent evt) {
        if (token == null || token.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Token no válido. Por favor, inicia sesión nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            System.out.println("Botón Actualizar clickeado");
            // Capturando los datos del formulario
            String idDelMedico = idMedico.getText();
            String nombreDelMedico = nombreMedico.getText();
            String docuDelMedico = docuMedico.getText();

            String calleMedico = calle.getText();
            String numeroMedico = numero.getText();
            String ciudadMedico = ciudad.getText();
            String provinciaMedico = provincia.getText();
            String paisMedico = pais.getText();

            // Creando el JSON del médico
            String jsonMedico = String.format(
                    "{\"id\":\"%s\",\"nombre\":\"%s\",\"documento\":\"%s\",\"direccion\":{\"calle\":\"%s\",\"numero\":\"%s\",\"ciudad\":\"%s\",\"provincia\":\"%s\",\"pais\":\"%s\"}}",
                    idDelMedico, nombreDelMedico, docuDelMedico, calleMedico, numeroMedico, ciudadMedico, provinciaMedico, paisMedico
            );

            //  solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/medicos"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + token)
                    .PUT(HttpRequest.BodyPublishers.ofString(jsonMedico))
                    .build();

            System.out.println("URL de solicitud: " + request.uri());
            // Enviar la solicitud y manejar la respuesta
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(response -> {
                        // Procesar la respuesta aquí
                        if (response.statusCode() >= 200 && response.statusCode() < 300) {
                              mostrarMensaje("Actualizacion exitosa!" + response.body(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            // Solicitud exitosa
                            System.out.println("Respuesta: " + response.body());
                            SwingUtilities.invokeLater(() -> {
                                MenuVentana menuVentana = new MenuVentana(token);
                                menuVentana.setLocationRelativeTo(null); // Esto lo centra en la pantalla
                                menuVentana.setVisible(true);
                                this.dispose();
                            });
                        } else {
                            mostrarMensaje("Fallo la actualizacion: " + response.body(), "Error", JOptionPane.ERROR_MESSAGE);
                            // Manejar el caso de error
                            System.out.println("Error: " + response.statusCode());
                        }
                        return response;
                    })
                    .exceptionally(e -> {
                        // Manejar excepciones
                        mostrarMensaje("No se pudo actualizar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        return null;
                    });

        } catch (Exception e) {
            mostrarMensaje("No se pudo actualizar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     private void mostrarMensaje(String mensaje, String titulo, int messageType) {
       
        UIManager.put("OptionPane.background", new Color(102, 204, 255));
        UIManager.put("Panel.background", new Color(51,102 ,255));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

        JOptionPane.showMessageDialog(this, mensaje, titulo, messageType);
    }

    private void cancelar(java.awt.event.ActionEvent evt) {
        
        System.out.println("Botón Cancelar clickeado");  // Log para verificar
         this.dispose();
        // Crear y mostrar la ventana de MenuVentana
        MenuVentana menuVentana = new MenuVentana(token);
        menuVentana.setLocationRelativeTo(null);
        menuVentana.setVisible(true);
    }
}
