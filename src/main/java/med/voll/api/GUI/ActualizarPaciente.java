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
public class ActualizarPaciente extends javax.swing.JDialog {

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
        id = new javax.swing.JTextField();
        nombrePaciente = new javax.swing.JTextField();
        telPaciente = new javax.swing.JTextField();
        textCiudad = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        textCalle = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        textProvincia = new javax.swing.JTextField();
        textNumero = new javax.swing.JTextField();
        textPais = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
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
        jTextField1.setText("ACTUALIZACION DE DATOS DEL PACIENTE");
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
        textId.setText("ID DEL PACIENTE");
        textId.setBorder(null);

        textDoc.setEditable(false);
        textDoc.setBackground(new java.awt.Color(51, 102, 255));
        textDoc.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        textDoc.setForeground(new java.awt.Color(255, 255, 255));
        textDoc.setText("TEL");
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

        id.setBackground(new java.awt.Color(51, 102, 255));
        id.setForeground(new java.awt.Color(204, 204, 204));
        id.setBorder(null);

        nombrePaciente.setBackground(new java.awt.Color(51, 102, 255));
        nombrePaciente.setForeground(new java.awt.Color(204, 204, 204));
        nombrePaciente.setBorder(null);

        telPaciente.setBackground(new java.awt.Color(51, 102, 255));
        telPaciente.setForeground(new java.awt.Color(204, 204, 204));
        telPaciente.setBorder(null);

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
        textProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProvinciaActionPerformed(evt);
            }
        });

        textNumero.setEditable(false);
        textNumero.setBackground(new java.awt.Color(51, 102, 255));
        textNumero.setForeground(new java.awt.Color(255, 255, 255));
        textNumero.setText("numero");
        textNumero.setBorder(null);
        textNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroActionPerformed(evt);
            }
        });

        textPais.setEditable(false);
        textPais.setBackground(new java.awt.Color(51, 102, 255));
        textPais.setForeground(new java.awt.Color(255, 255, 255));
        textPais.setText("pais");
        textPais.setBorder(null);

        provincia.setBackground(new java.awt.Color(51, 102, 255));
        provincia.setForeground(new java.awt.Color(204, 204, 204));
        provincia.setBorder(null);

        pais.setBackground(new java.awt.Color(51, 102, 255));
        pais.setForeground(new java.awt.Color(204, 204, 204));
        pais.setBorder(null);

        numero.setBackground(new java.awt.Color(51, 102, 255));
        numero.setForeground(new java.awt.Color(204, 204, 204));
        numero.setBorder(null);

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
        jDesktopPane1.setLayer(id, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombrePaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(telPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textCiudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ciudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textCalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(calle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textProvincia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(textPais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(provincia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(numero, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(609, 801, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizar)
                .addGap(26, 26, 26))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(532, 532, 532)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(532, 532, 532)
                                .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(532, 532, 532)
                        .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(telPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31)
                .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizar)
                            .addComponent(cancelar)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void textProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProvinciaActionPerformed

    private void textNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField calle;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField id;
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
    private javax.swing.JTextField nombrePaciente;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField pais;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField telPaciente;
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

    public ActualizarPaciente(String token) {
        this.token = token;
        initComponents();
        setupActionListeners();
    }

    public ActualizarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setupActionListeners();
    }

    private void setupActionListeners() {
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPaciente(evt);
            }
        });

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });
    }

    private void actualizarPaciente(java.awt.event.ActionEvent evt) {
        if (token == null || token.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Token no válido. Por favor, inicia sesión nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            System.out.println("Botón Actualizar clickeado");
            // Capturando los datos del formulario
            String idDelPaciente = id.getText();
            String nombreDelPaciente = nombrePaciente.getText();
            String telDelPaciente = telPaciente.getText();

            String callePaciente = calle.getText();
            String numeroPaciente = numero.getText();
            String ciudadPaciente = ciudad.getText();
            String provinciaPaciente = provincia.getText();
            String paisPaciente = pais.getText();

            // Creando el JSON del médico
            String jsonMedico = String.format(
                    "{\"id\":\"%s\",\"nombre\":\"%s\",\"telefono\":\"%s\",\"direccion\":{\"calle\":\"%s\",\"numero\":\"%s\",\"ciudad\":\"%s\",\"provincia\":\"%s\",\"pais\":\"%s\"}}",
                    idDelPaciente, nombreDelPaciente, telDelPaciente, callePaciente, numeroPaciente, ciudadPaciente, provinciaPaciente, paisPaciente
            );

            //  solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/pacientes"))
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
                            mostrarMensaje("Actualizacion exitosa! " + response.body(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            // Solicitud exitosa
                            System.out.println("Respuesta: " + response.body());
                            SwingUtilities.invokeLater(() -> {
                                MenuVentana menuVentana = new MenuVentana(token);
                                menuVentana.setLocationRelativeTo(null); // Esto lo centra en la pantalla
                                menuVentana.setVisible(true);
                                this.dispose();
                            });
                        } else {
                            mostrarMensaje("Fallo la actualizacion: " + response.statusCode(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        return response;
                    })
                    .exceptionally(e -> {
                        mostrarMensaje("Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        return null;
                    });

        } catch (Exception e) {
            mostrarMensaje("Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        
        MenuVentana menuVentana = new MenuVentana(token);
        menuVentana.setLocationRelativeTo(null);
        menuVentana.setVisible(true);
    }
}
