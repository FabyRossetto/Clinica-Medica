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
public class RegistrarMedico extends javax.swing.JDialog {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        docuEntrada = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        documento = new javax.swing.JTextField();
        especialidad = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        nombreEntrada = new javax.swing.JTextField();
        emailEntrada = new javax.swing.JTextField();
        telefonoEntrada = new javax.swing.JTextField();
        calleEntrada = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        provinciaEntrada = new javax.swing.JTextField();
        ciudadEntrada = new javax.swing.JTextField();
        complementoEntrada = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        cancelarRegistro = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        Registrar1 = new javax.swing.JButton();
        docuEntrda = new javax.swing.JTextField();
        numEntrada = new javax.swing.JTextField();
        paisEntrada = new javax.swing.JTextField();

        button1.setLabel("button1");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        docuEntrada.setBackground(new java.awt.Color(51, 102, 255));
        docuEntrada.setDesktopManager(null);
        docuEntrada.setPreferredSize(new java.awt.Dimension(1077, 644));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 102, 255));
        jTextField1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("REGISTRO DE UN MEDICO");
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

        especialidad.setBackground(new java.awt.Color(51, 102, 255));
        especialidad.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        especialidad.setForeground(new java.awt.Color(255, 255, 255));
        especialidad.setText("ESPECIALIDAD");
        especialidad.setBorder(null);

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

        calleEntrada.setBackground(new java.awt.Color(51, 102, 255));
        calleEntrada.setForeground(new java.awt.Color(204, 204, 204));
        calleEntrada.setBorder(null);
        calleEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calleEntradaActionPerformed(evt);
            }
        });

        calle.setEditable(false);
        calle.setBackground(new java.awt.Color(51, 102, 255));
        calle.setForeground(new java.awt.Color(255, 255, 255));
        calle.setText("calle");
        calle.setBorder(null);

        ciudad.setEditable(false);
        ciudad.setBackground(new java.awt.Color(51, 102, 255));
        ciudad.setForeground(new java.awt.Color(255, 255, 255));
        ciudad.setText("ciudad");
        ciudad.setBorder(null);
        ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadActionPerformed(evt);
            }
        });

        provincia.setEditable(false);
        provincia.setBackground(new java.awt.Color(51, 102, 255));
        provincia.setForeground(new java.awt.Color(255, 255, 255));
        provincia.setText("provincia");
        provincia.setBorder(null);

        numero.setEditable(false);
        numero.setBackground(new java.awt.Color(51, 102, 255));
        numero.setForeground(new java.awt.Color(255, 255, 255));
        numero.setText("numero");
        numero.setBorder(null);
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        pais.setEditable(false);
        pais.setBackground(new java.awt.Color(51, 102, 255));
        pais.setForeground(new java.awt.Color(255, 255, 255));
        pais.setText("pais");
        pais.setBorder(null);
        pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisActionPerformed(evt);
            }
        });

        provinciaEntrada.setBackground(new java.awt.Color(51, 102, 255));
        provinciaEntrada.setForeground(new java.awt.Color(204, 204, 204));
        provinciaEntrada.setBorder(null);

        ciudadEntrada.setBackground(new java.awt.Color(51, 102, 255));
        ciudadEntrada.setForeground(new java.awt.Color(204, 204, 204));
        ciudadEntrada.setBorder(null);

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

        jRadioButton1.setBackground(new java.awt.Color(51, 102, 255));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("ORTOPEDIA");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(51, 102, 255));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("CARDIOLOGIA");

        jRadioButton3.setBackground(new java.awt.Color(51, 102, 255));
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("GINECOLOGIA");

        jRadioButton4.setBackground(new java.awt.Color(51, 102, 255));
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("PEDIATRIA");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med/voll/api/imagenes/image (3).png"))); // NOI18N

        Registrar1.setBackground(new java.awt.Color(102, 204, 255));
        Registrar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Registrar1.setForeground(new java.awt.Color(255, 255, 255));
        Registrar1.setText("REGISTRAR");

        docuEntrda.setBackground(new java.awt.Color(51, 102, 255));
        docuEntrda.setForeground(new java.awt.Color(255, 255, 255));
        docuEntrda.setBorder(null);

        numEntrada.setBackground(new java.awt.Color(51, 102, 255));
        numEntrada.setForeground(new java.awt.Color(255, 255, 255));
        numEntrada.setBorder(null);

        paisEntrada.setBackground(new java.awt.Color(51, 102, 255));
        paisEntrada.setForeground(new java.awt.Color(255, 255, 255));
        paisEntrada.setBorder(null);

        docuEntrada.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(telefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(documento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(especialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(nombreEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(emailEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(telefonoEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(calleEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(calle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(ciudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(provincia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(numero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(pais, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(provinciaEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(ciudadEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(complementoEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(Registrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(cancelarRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(jSeparator15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(Registrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(docuEntrda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(numEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        docuEntrada.setLayer(paisEntrada, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout docuEntradaLayout = new javax.swing.GroupLayout(docuEntrada);
        docuEntrada.setLayout(docuEntradaLayout);
        docuEntradaLayout.setHorizontalGroup(
            docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docuEntradaLayout.createSequentialGroup()
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                                .addGap(207, 207, 207)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ciudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(provinciaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createSequentialGroup()
                                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12))
                                    .addGroup(docuEntradaLayout.createSequentialGroup()
                                        .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(emailEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3)
                                    .addComponent(nombreEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator5)
                                    .addComponent(telefonoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(docuEntrda, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(docuEntradaLayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, docuEntradaLayout.createSequentialGroup()
                                            .addGap(197, 197, 197)
                                            .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(docuEntradaLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(paisEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(docuEntradaLayout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(docuEntradaLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ciudadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(calleEntrada)
                                                .addComponent(numEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))))))
                        .addGap(455, 455, 455))
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(cancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createSequentialGroup()
                                        .addComponent(complementoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        docuEntradaLayout.setVerticalGroup(
            docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docuEntradaLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarRegistro)
                    .addComponent(Registrar1))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calleEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docuEntradaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(provinciaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paisEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(docuEntrda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(docuEntradaLayout.createSequentialGroup()
                                .addComponent(telefonoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ciudadEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(complementoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(docuEntradaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(docuEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(docuEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(docuEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
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

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoActionPerformed

    private void nombreEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEntradaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadActionPerformed

    private void calleEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calleEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calleEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Registrar1;
    private java.awt.Button button1;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField calleEntrada;
    private javax.swing.JButton cancelarRegistro;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField ciudadEntrada;
    private javax.swing.JTextField complementoEntrada;
    private javax.swing.JTextField direccion;
    private javax.swing.JDesktopPane docuEntrada;
    private javax.swing.JTextField docuEntrda;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emailEntrada;
    private javax.swing.JTextField especialidad;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombreEntrada;
    private javax.swing.JTextField numEntrada;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField pais;
    private javax.swing.JTextField paisEntrada;
    private javax.swing.JTextField provincia;
    private javax.swing.JTextField provinciaEntrada;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefonoEntrada;
    // End of variables declaration//GEN-END:variables

    private String token;
    private ListadoMedicos listado;

    public RegistrarMedico(String token) {
        this.token = token;
        initComponents();
       this.listado= new ListadoMedicos(token);
        setupActionListeners();
    }

    public RegistrarMedico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        // Inicializar la clase ListadoMedicos
        this.listado= new ListadoMedicos(token);
       
        setupActionListeners();
    }

    private void setupActionListeners() {
        Registrar1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMedico(evt);
            }
        });

        cancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRegistro(evt);
            }
        });
    }

    private void registrarMedico(java.awt.event.ActionEvent evt) {
        
        try {

            System.out.println("Botón Registrar clickeado");
            // Capturando los datos del formulario
            String nombreMedico = nombreEntrada.getText();
            String emailMedico = emailEntrada.getText();
            String telefonoMedico = telefonoEntrada.getText();
            String dniMedico = docuEntrda.getText();

            // Obtener la especialidad seleccionada
            String especialidadMedico = null;
            if (jRadioButton1.isSelected()) {
                especialidadMedico = "ORTOPEDIA";
            } else if (jRadioButton2.isSelected()) {
                especialidadMedico = "CARDIOLOGIA";
            } else if (jRadioButton3.isSelected()) {
                especialidadMedico = "GINECOLOGIA";
            } else if (jRadioButton4.isSelected()) {
                especialidadMedico = "PEDIATRIA";
            } else {
                // Manejo de error si no se selecciona ninguna especialidad
                JOptionPane.showMessageDialog(this, "Debe seleccionar una especialidad", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si no se seleccionó ninguna especialidad
            }

            String calleMedico = calleEntrada.getText();
            String numeroMedico = numEntrada.getText();
            String ciudadMedico = ciudadEntrada.getText();
            String provinciaMedico = provinciaEntrada.getText();
            String paisMedico = paisEntrada.getText();

            // Creando el JSON del médico
            String jsonMedico = String.format(
                    "{\"nombre\":\"%s\",\"email\":\"%s\",\"telefono\":\"%s\",\"documento\":\"%s\",\"especialidad\":\"%s\",\"direccion\":{\"calle\":\"%s\",\"numero\":\"%s\",\"ciudad\":\"%s\",\"provincia\":\"%s\",\"pais\":\"%s\"}}",
                    nombreMedico, emailMedico, telefonoMedico, dniMedico, especialidadMedico, calleMedico, numeroMedico, ciudadMedico, provinciaMedico, paisMedico
            );

            //  solicitud HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/medicos"))
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
                            // Recargar los médicos después de registrar uno nuevo
                            listado.cargarMedicos();  // Actualiza el listado de médicos en la tabla
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
