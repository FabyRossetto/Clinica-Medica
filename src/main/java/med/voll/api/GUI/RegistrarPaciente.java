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
public class RegistrarPaciente extends javax.swing.JDialog {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jSeparator10 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        nombreEntrada = new javax.swing.JTextField();
        emailEntrada = new javax.swing.JTextField();
        telefonoEntrada = new javax.swing.JTextField();
        dniEntrada = new javax.swing.JTextField();
        calleEntrada = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        distrito = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        complemento = new javax.swing.JTextField();
        numeroEntrada = new javax.swing.JTextField();
        ciudadEntrada = new javax.swing.JTextField();
        distritoEntrada = new javax.swing.JTextField();
        complementoEntrada = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        cancelarRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        compl = new javax.swing.JTextField();

        button1.setLabel("button1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(51, 102, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1077, 644));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("REGISTRO DE UN PACIENTE");
        jTextField1.setActionCommand("<Not Set>");
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(51, 102, 255));
        nombre.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("NOMBRE");
        nombre.setBorder(null);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        email.setEditable(false);
        email.setBackground(new java.awt.Color(51, 102, 255));
        email.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("EMAIL");
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        telefono.setEditable(false);
        telefono.setBackground(new java.awt.Color(51, 102, 255));
        telefono.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setText("TEL");
        telefono.setBorder(null);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        documento.setEditable(false);
        documento.setBackground(new java.awt.Color(51, 102, 255));
        documento.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        documento.setForeground(new java.awt.Color(255, 255, 255));
        documento.setText("DNI");
        documento.setBorder(null);
        documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoActionPerformed(evt);
            }
        });

        direccion.setEditable(false);
        direccion.setBackground(new java.awt.Color(51, 102, 255));
        direccion.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(255, 255, 255));
        direccion.setText("DIRECCION");
        direccion.setBorder(null);

        nombreEntrada.setBackground(new java.awt.Color(51, 102, 255));
        nombreEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreEntrada.setForeground(new java.awt.Color(204, 204, 204));
        nombreEntrada.setBorder(null);
        nombreEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEntradaActionPerformed(evt);
            }
        });

        emailEntrada.setBackground(new java.awt.Color(51, 102, 255));
        emailEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailEntrada.setForeground(new java.awt.Color(204, 204, 204));
        emailEntrada.setBorder(null);
        emailEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailEntradaActionPerformed(evt);
            }
        });

        telefonoEntrada.setBackground(new java.awt.Color(51, 102, 255));
        telefonoEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoEntrada.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEntrada.setBorder(null);

        dniEntrada.setBackground(new java.awt.Color(51, 102, 255));
        dniEntrada.setForeground(new java.awt.Color(204, 204, 204));
        dniEntrada.setBorder(null);

        calleEntrada.setBackground(new java.awt.Color(51, 102, 255));
        calleEntrada.setForeground(new java.awt.Color(204, 204, 204));
        calleEntrada.setBorder(null);

        calle.setEditable(false);
        calle.setBackground(new java.awt.Color(51, 102, 255));
        calle.setForeground(new java.awt.Color(255, 255, 255));
        calle.setText("calle");
        calle.setBorder(null);

        distrito.setEditable(false);
        distrito.setBackground(new java.awt.Color(51, 102, 255));
        distrito.setForeground(new java.awt.Color(255, 255, 255));
        distrito.setText("distrito");
        distrito.setBorder(null);

        ciudad.setEditable(false);
        ciudad.setBackground(new java.awt.Color(51, 102, 255));
        ciudad.setForeground(new java.awt.Color(255, 255, 255));
        ciudad.setText("ciudad");
        ciudad.setBorder(null);

        numero.setEditable(false);
        numero.setBackground(new java.awt.Color(51, 102, 255));
        numero.setForeground(new java.awt.Color(255, 255, 255));
        numero.setText("numero");
        numero.setBorder(null);

        complemento.setEditable(false);
        complemento.setBackground(new java.awt.Color(51, 102, 255));
        complemento.setForeground(new java.awt.Color(255, 255, 255));
        complemento.setText("complemento");
        complemento.setBorder(null);

        numeroEntrada.setBackground(new java.awt.Color(51, 102, 255));
        numeroEntrada.setForeground(new java.awt.Color(204, 204, 204));
        numeroEntrada.setBorder(null);

        ciudadEntrada.setBackground(new java.awt.Color(51, 102, 255));
        ciudadEntrada.setForeground(new java.awt.Color(204, 204, 204));
        ciudadEntrada.setBorder(null);

        distritoEntrada.setBackground(new java.awt.Color(51, 102, 255));
        distritoEntrada.setForeground(new java.awt.Color(204, 204, 204));
        distritoEntrada.setBorder(null);

        complementoEntrada.setBackground(new java.awt.Color(51, 102, 255));
        complementoEntrada.setForeground(new java.awt.Color(204, 204, 204));
        complementoEntrada.setBorder(null);

        Registrar.setBackground(new java.awt.Color(102, 204, 255));
        Registrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("REGISTRAR");

        cancelarRegistro.setBackground(new java.awt.Color(255, 51, 0));
        cancelarRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        cancelarRegistro.setText("CANCELAR");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med/voll/api/imagenes/image (3).png"))); // NOI18N

        compl.setBackground(new java.awt.Color(51, 102, 255));
        compl.setForeground(new java.awt.Color(255, 255, 255));
        compl.setBorder(null);

        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(telefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(documento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombreEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(emailEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(telefonoEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(dniEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(calleEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(calle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(distrito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ciudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(numero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(complemento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(numeroEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ciudadEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(distritoEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(complementoEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelarRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(compl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(emailEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dniEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(telefonoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombreEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(distritoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(compl, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                                    .addComponent(jSeparator8))
                                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(cancelarRegistro)
                                                .addGap(46, 46, 46)
                                                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(numeroEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(227, 227, 227)
                                        .addComponent(complementoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ciudadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calleEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calleEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciudadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(distritoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(compl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(complementoEntrada)
                            .addComponent(jSeparator8)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dniEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar)
                    .addComponent(cancelarRegistro))
                .addContainerGap(50, Short.MAX_VALUE))
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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void emailEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailEntradaActionPerformed

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoActionPerformed

    private void nombreEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private java.awt.Button button1;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField calleEntrada;
    private javax.swing.JButton cancelarRegistro;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField ciudadEntrada;
    private javax.swing.JTextField compl;
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField complementoEntrada;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField distrito;
    private javax.swing.JTextField distritoEntrada;
    private javax.swing.JTextField dniEntrada;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailEntrada;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreEntrada;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField numeroEntrada;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefonoEntrada;
    // End of variables declaration//GEN-END:variables

    private String token;
    private ListadoPacientes listado;

    public RegistrarPaciente(String token) {
        this.token = token;
        initComponents();
        // Inicializar la clase ListadoPacientes
        this.listado= new ListadoPacientes(token);
       
        setupActionListeners();
    }

    public RegistrarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Inicializar la clase ListadoPacientes
        this.listado= new ListadoPacientes(token);
       
        setupActionListeners();
    }

    private void setupActionListeners() {
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPaciente(evt);
            }
        });

        cancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRegistro(evt);
            }
        });
    }

    private void registrarPaciente(java.awt.event.ActionEvent evt) {
        
        try {

            System.out.println("Botón Registrar clickeado");
            // Capturando los datos del formulario
            String nombrePaciente = nombreEntrada.getText();
            String emailPaciente= emailEntrada.getText();
            String telefonoPaciente = telefonoEntrada.getText();
            String dniPaciente = dniEntrada.getText();

            

            String callePaciente = calleEntrada.getText();
            String distritoPaciente = numeroEntrada.getText();
            String ciudadPaciente = ciudadEntrada.getText();
            String numeroPaciente = distritoEntrada.getText();
            String complementoPaciente = compl.getText();

            // Creando el JSON del médico
            String jsonMedico = String.format(
                    "{\"nombre\":\"%s\",\"email\":\"%s\",\"telefono\":\"%s\",\"documento\":\"%s\",\"direccion\":{\"calle\":\"%s\",\"distrito\":\"%s\",\"ciudad\":\"%s\",\"numero\":\"%s\",\"complemento\":\"%s\"}}",
                    nombrePaciente, emailPaciente, telefonoPaciente, dniPaciente,  callePaciente, distritoPaciente, ciudadPaciente, numeroPaciente, complementoPaciente
            );

            //  solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/pacientes"))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + token)
                    .POST(HttpRequest.BodyPublishers.ofString(jsonMedico))
                    .build();

            // Enviar la solicitud y manejar la respuesta
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(response -> {
                        // Procesar la respuesta aquí
                        if (response.statusCode() >= 200 && response.statusCode() < 300) {
                           mostrarMensaje("Registro exitoso!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            // Solicitud exitosa
                            System.out.println("Respuesta: " + response.body());
                            listado.cargarPacientes(); // Actualiza el listado de médicos en la tabla
                            SwingUtilities.invokeLater(() -> {
                                MenuVentana menuVentana = new MenuVentana(token);
                                menuVentana.setLocationRelativeTo(null); // Esto lo centra en la pantalla
                                menuVentana.setVisible(true);
                                this.dispose();
                            });
                        } else {
                            mostrarMensaje("Fallo el registro: " + response.statusCode(), "Error", JOptionPane.ERROR_MESSAGE);
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
    private void cancelarRegistro(java.awt.event.ActionEvent evt) {
        // Cierra la ventana de registro y regresa a la anterior
        System.out.println("Botón Cancelar clickeado");  // Log para verificar
         this.dispose();
        // Crear y mostrar la ventana de MenuVentana
        MenuVentana menuVentana = new MenuVentana(token);
        menuVentana.setLocationRelativeTo(null);
        menuVentana.setVisible(true);
    }
}
