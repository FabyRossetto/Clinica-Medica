/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package med.voll.api.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Faby
 */
public class MenuVentana extends javax.swing.JDialog {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        actualizarPaciente = new javax.swing.JButton();
        registrarMedico = new javax.swing.JButton();
        agendarConsulta = new javax.swing.JButton();
        listadoDePacientes = new javax.swing.JButton();
        borrarPaciente = new javax.swing.JButton();
        buscarPaciente = new javax.swing.JButton();
        registrarPaciente = new javax.swing.JButton();
        actualizarMedico = new javax.swing.JButton();
        buscarMedico = new javax.swing.JButton();
        borrarMedico = new javax.swing.JButton();
        listadoDeMedicos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1077, 644));

        actualizarPaciente.setBackground(new java.awt.Color(102, 204, 255));
        actualizarPaciente.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        actualizarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        actualizarPaciente.setText("ACTUALIZAR PACIENTE");
        actualizarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPacienteActionPerformed(evt);
            }
        });

        registrarMedico.setBackground(new java.awt.Color(102, 204, 255));
        registrarMedico.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        registrarMedico.setForeground(new java.awt.Color(255, 255, 255));
        registrarMedico.setText("REGISTRAR MEDICO");
        registrarMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        agendarConsulta.setBackground(new java.awt.Color(102, 204, 255));
        agendarConsulta.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        agendarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        agendarConsulta.setText("AGENDAR TURNO");
        agendarConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listadoDePacientes.setBackground(new java.awt.Color(102, 204, 255));
        listadoDePacientes.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        listadoDePacientes.setForeground(new java.awt.Color(255, 255, 255));
        listadoDePacientes.setText("LISTADO DE PACIENTES");
        listadoDePacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrarPaciente.setBackground(new java.awt.Color(102, 204, 255));
        borrarPaciente.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        borrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        borrarPaciente.setText("BORRAR UN PACIENTE");
        borrarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarPacienteActionPerformed(evt);
            }
        });

        buscarPaciente.setBackground(new java.awt.Color(102, 204, 255));
        buscarPaciente.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        buscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        buscarPaciente.setText("BUSCAR UN PACIENTE");
        buscarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        registrarPaciente.setBackground(new java.awt.Color(102, 204, 255));
        registrarPaciente.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        registrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        registrarPaciente.setText("REGISTRAR PACIENTE");
        registrarPaciente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        actualizarMedico.setBackground(new java.awt.Color(102, 204, 255));
        actualizarMedico.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        actualizarMedico.setForeground(new java.awt.Color(255, 255, 255));
        actualizarMedico.setText("ACTUALIZAR MEDICO");
        actualizarMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buscarMedico.setBackground(new java.awt.Color(102, 204, 255));
        buscarMedico.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        buscarMedico.setForeground(new java.awt.Color(255, 255, 255));
        buscarMedico.setText("BUSCAR MEDICO");
        buscarMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrarMedico.setBackground(new java.awt.Color(102, 204, 255));
        borrarMedico.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        borrarMedico.setForeground(new java.awt.Color(255, 255, 255));
        borrarMedico.setText("BORRAR MEDICO");
        borrarMedico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        listadoDeMedicos.setBackground(new java.awt.Color(102, 204, 255));
        listadoDeMedicos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        listadoDeMedicos.setForeground(new java.awt.Color(255, 255, 255));
        listadoDeMedicos.setText("LISTADO DE MEDICOS");
        listadoDeMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/med/voll/api/imagenes/image (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listadoDeMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(buscarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualizarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listadoDePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(actualizarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(borrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualizarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listadoDeMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listadoDePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(agendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarPacienteActionPerformed

    private void borrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarMedico;
    private javax.swing.JButton actualizarPaciente;
    private javax.swing.JButton agendarConsulta;
    private javax.swing.JButton borrarMedico;
    private javax.swing.JButton borrarPaciente;
    private javax.swing.JButton buscarMedico;
    private javax.swing.JButton buscarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listadoDeMedicos;
    private javax.swing.JButton listadoDePacientes;
    private javax.swing.JButton registrarMedico;
    private javax.swing.JButton registrarPaciente;
    // End of variables declaration//GEN-END:variables
      private String token;

    public MenuVentana() {
        initComponents();
        setupActionListeners();
    }

    public MenuVentana(String token) {
        this.token = token;
        initComponents();
        setupActionListeners();
    }

    public MenuVentana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setupActionListeners();
    }

    private void setupActionListeners() {
        registrarMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirRegistroMedico();
            }
        });
        actualizarMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirActualizarMedico();
            }
        });
        borrarMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirBorrarMedico();
            }
        });
        buscarMedico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirBuscarMedico();
            }
        });
        listadoDeMedicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirListadoMedico();
            }
        });
        registrarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirRegistrarPaciente();
            }
        });
        actualizarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirActualizarPaciente();
            }
        });
        buscarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirBuscarPaciente();
            }
        });
        borrarPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirBorrarPaciente();
            }
        });
        listadoDePacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirListadoPacientes();
            }
        });
        agendarConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirAgendarCita();
            }
        });
    }

    private void abrirRegistroMedico() {
        // Abre la ventana de registro de médicos
        this.dispose();//cierra la ventana anterior
        RegistrarMedico registrarMedicoDialog = new RegistrarMedico(token);
        registrarMedicoDialog.setLocationRelativeTo(null);
        registrarMedicoDialog.setVisible(true);
        System.out.println("probando abrir ventana de registro");
    }

    private void abrirActualizarMedico() {
        // Abre la ventana de actualizacion de médicos
        this.dispose();
        System.out.println("probando abrir ventana de actualizar");
        ActualizarMedico actualizarMedicoDialog = new ActualizarMedico(token);
        actualizarMedicoDialog.setLocationRelativeTo(null);
        actualizarMedicoDialog.setVisible(true);

    }

    private void abrirBorrarMedico() {
        // Abre la ventana para borrar médicos
        this.dispose();
        BorrarMedico borrarMedicoDialog = new BorrarMedico(token);
        borrarMedicoDialog.setLocationRelativeTo(null);
        borrarMedicoDialog.setVisible(true);
        System.out.println("probando abrir ventana de borrar");
    }

    private void abrirBuscarMedico() {
        // Abre la ventana para buscar un medico
        this.dispose();
        BuscarMedico buscarMedicoDialog = new BuscarMedico(token);
        buscarMedicoDialog.setLocationRelativeTo(null);
        buscarMedicoDialog.setVisible(true);
        System.out.println("probando abrir ventana de buscar por Id");
    }

    private void abrirListadoMedico() {
        // Abre la ventana de listado medico
        this.dispose();
        ListadoMedicos listado = new ListadoMedicos(token);
        listado.setLocationRelativeTo(null);
        listado.setVisible(true);
        System.out.println("probando abrir listado medico");
    }

    private void abrirRegistrarPaciente() {
        // Abre la ventana para registrar un paciente
        this.dispose();
        RegistrarPaciente registro = new RegistrarPaciente(token);
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);
        System.out.println("probando abrir ventana de registrar paciente");
    }

    private void abrirActualizarPaciente() {
        // Abre la ventana para actualizar datos de paciente
        this.dispose();
        ActualizarPaciente actual = new ActualizarPaciente(token);
        actual.setLocationRelativeTo(null);
        actual.setVisible(true);
        System.out.println("probando abrir ventana de actualizar paciente");
    }

    private void abrirBuscarPaciente() {
        // Abre la ventana para buscar paciente
        this.dispose();
        BuscarPaciente paciente = new BuscarPaciente(token);
        paciente.setLocationRelativeTo(null);
        paciente.setVisible(true);
        System.out.println("probando abrir ventana de buscar paciente");
    }

    private void abrirBorrarPaciente() {
        // Abre la ventana para borrar paciente
        this.dispose();
        BorrarPaciente pac = new BorrarPaciente(token);
        pac.setLocationRelativeTo(null);
        pac.setVisible(true);
        System.out.println("probando abrir ventana de borrar paciente");
    }
    private void abrirListadoPacientes() {
        // Abre la ventana de listado de pacientes
        this.dispose();
        ListadoPacientes listado = new ListadoPacientes(token);
        listado.setLocationRelativeTo(null);
        listado.setVisible(true);
        System.out.println("probando abrir listado de pacientes");
    }

    private void abrirAgendarCita() {
        // Abre la ventana para agendar citas
        this.dispose();
        AgendarCita cita = new AgendarCita(token);
        cita.setLocationRelativeTo(null);
        cita.setVisible(true);
        System.out.println("probando abrir ventana de agendar consulta");
    }
}
