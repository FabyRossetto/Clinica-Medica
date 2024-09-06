/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package med.voll.api.GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class ListadoPacientes extends javax.swing.JDialog {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1077, 644));

        tabla.setBackground(new java.awt.Color(102, 204, 255));
        tabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tabla.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Email", "Documento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setInheritsPopupMenu(true);
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(0, 51, 204));
        tabla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabla.setShowGrid(true);
        jScrollPane1.setViewportView(tabla);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med/voll/api/imagenes/image (3).png"))); // NOI18N

        atras.setBackground(new java.awt.Color(102, 204, 255));
        atras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("ATRAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
   private String token;  // Atributo para almacenar el token
    private DefaultTableModel tableModel;

    public ListadoPacientes(String token) {
        this.token = token;
        initComponents();  // Inicializa los componentes predefinidos por NetBeans
        configurarTabla();  // Configura el modelo de la tabla
        cargarPacientes();  // Carga los datos de los pacientes al iniciar
        setupActionListeners();
    }

    private void setupActionListeners() {

        atras.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras(evt);
            }
        });
    }

    private void configurarTabla() {
        // Asignar el modelo de la tabla existente
        tableModel = (DefaultTableModel) tabla.getModel();
    }

    public void cargarPacientes() {
        String apiUrl = "http://localhost:8080/pacientes";
        try {
            // Crear conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + token);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response = new StringBuilder();
                try (Scanner scanner = new Scanner(connection.getInputStream())) {
                    while (scanner.hasNext()) {
                        response.append(scanner.nextLine());
                    }
                }

                // Parsear respuesta JSON
                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONArray contentArray = jsonResponse.getJSONArray("content");

                // Limpiar tabla antes de cargar nuevos datos
                tableModel.setRowCount(0);

                // Cargar datos en la tabla
                for (int i = 0; i < contentArray.length(); i++) {
                    JSONObject paciente = contentArray.getJSONObject(i);
                    Object[] rowData = {
                        paciente.getLong("id"),
                        paciente.getString("nombre"),
                        paciente.getString("email"),
                        paciente.getString("documento")

                    };
                    tableModel.addRow(rowData);
                }
            } else {
                 mostrarMensaje("Error al cargar los pacientes: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException e) {
            mostrarMensaje("Error al conectar con el servidor " , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void mostrarMensaje(String mensaje, String titulo, int messageType) {
        UIManager.put("OptionPane.background", new Color(102, 204, 255));
        UIManager.put("Panel.background", new Color(51,102 ,255));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));

        JOptionPane.showMessageDialog(this, mensaje, titulo, messageType);
    }

    private void atras(java.awt.event.ActionEvent evt) {

        this.dispose();
        // Crear y mostrar la ventana de MenuVentana
        MenuVentana menuVentana = new MenuVentana(token);
        menuVentana.setLocationRelativeTo(null);
        menuVentana.setVisible(true);
        
    }
}
