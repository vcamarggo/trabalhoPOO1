/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author F.Carvalho / M. Hirose / V.Camargo
 */
public class SecretariaView extends javax.swing.JFrame {

    public JButton getBtnAlterarConsulta() {
        return btnAlterarConsulta;
    }

    public JButton getBtnAlterarPaciente() {
        return btnAlterarPaciente;
    }

    public JButton getBtnDetalhesPaciente() {
        return btnDetalhesPaciente;
    }

    public JButton getBtnNovaConsulta() {
        return btnNovaConsulta;
    }

    public JButton getBtnNovoPaciente() {
        return btnNovoPaciente;
    }

    public JButton getBtnRemoverConsulta() {
        return btnRemoverConsulta;
    }

    public JButton getBtnRemoverPaciente() {
        return btnRemoverPaciente;
    }

    public JButton getBtnConsultasDiaSeguinteEmail() {
        return btnConsultasDiaSeguinteEmail;
    }

    public JButton getBtnConsultasDiaSeguinteSMS() {
        return btnConsultasDiaSeguinteSMS;
    }

    public JTable getTabelaConsultas() {
        return tabelaConsultas;
    }

    public JTable getTabelaPacientes() {
        return tabelaPacientes;
    }

    /**
     * Creates new form SecretariaView2
     */
    public SecretariaView() {
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

        panelHeader = new javax.swing.JPanel();
        lblSaudeCIA = new javax.swing.JLabel();
        btnVoltarSelecaoPerfil = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        abasSecretaria = new javax.swing.JTabbedPane();
        pacientePanel = new javax.swing.JPanel();
        scrollPaciente = new javax.swing.JScrollPane();
        tabelaPacientes = new javax.swing.JTable();
        opcoesPaciente = new javax.swing.JPanel();
        btnDetalhesPaciente = new javax.swing.JButton();
        btnAlterarPaciente = new javax.swing.JButton();
        btnRemoverPaciente = new javax.swing.JButton();
        btnNovoPaciente = new javax.swing.JButton();
        lblNovoPaciente = new javax.swing.JLabel();
        consultaPanel = new javax.swing.JPanel();
        opcoesConsulta = new javax.swing.JPanel();
        btnAlterarConsulta = new javax.swing.JButton();
        btnRemoverConsulta = new javax.swing.JButton();
        btnNovaConsulta = new javax.swing.JButton();
        lblNovaConsulta = new javax.swing.JLabel();
        scrollConsulta = new javax.swing.JScrollPane();
        tabelaConsultas = new javax.swing.JTable();
        relatorioPanel = new javax.swing.JPanel();
        btnConsultasDiaSeguinteSMS = new javax.swing.JButton();
        btnConsultasDiaSeguinteEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblSaudeCIA.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblSaudeCIA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icone-consultorio.png"))); // NOI18N
        lblSaudeCIA.setText("Saude & CIA");

        btnVoltarSelecaoPerfil.setText("Voltar a Seleção de Perfis");
        btnVoltarSelecaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarSelecaoPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaudeCIA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarSelecaoPerfil)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaudeCIA)
                    .addComponent(btnVoltarSelecaoPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perfil Secretaria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tabelaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RG", "Nome", "Data nascimento", "Celular", "Email", "Convênio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaciente.setViewportView(tabelaPacientes);

        opcoesPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opcoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        btnDetalhesPaciente.setText("Detalhes do Paciente");

        btnAlterarPaciente.setText("Alterar Dados Paciente");

        btnRemoverPaciente.setText("Remover Paciente");

        btnNovoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/add-paciente.png"))); // NOI18N
        btnNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPacienteActionPerformed(evt);
            }
        });

        lblNovoPaciente.setText("Novo Paciente");

        javax.swing.GroupLayout opcoesPacienteLayout = new javax.swing.GroupLayout(opcoesPaciente);
        opcoesPaciente.setLayout(opcoesPacienteLayout);
        opcoesPacienteLayout.setHorizontalGroup(
            opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcoesPacienteLayout.createSequentialGroup()
                .addGroup(opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opcoesPacienteLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNovoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovoPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opcoesPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(btnDetalhesPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        opcoesPacienteLayout.setVerticalGroup(
            opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcoesPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDetalhesPaciente)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarPaciente)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovoPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNovoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pacientePanelLayout = new javax.swing.GroupLayout(pacientePanel);
        pacientePanel.setLayout(pacientePanelLayout);
        pacientePanelLayout.setHorizontalGroup(
            pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientePanelLayout.createSequentialGroup()
                .addComponent(scrollPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcoesPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pacientePanelLayout.setVerticalGroup(
            pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(opcoesPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasSecretaria.addTab("Pacientes Cadastrados", pacientePanel);

        opcoesConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opcoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnAlterarConsulta.setText("Alterar Dados da Consulta");
        btnAlterarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarConsultaActionPerformed(evt);
            }
        });

        btnRemoverConsulta.setText("Remover Consulta");

        btnNovaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/nova-consulta.png"))); // NOI18N
        btnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaConsultaActionPerformed(evt);
            }
        });

        lblNovaConsulta.setText("Nova Consulta");

        javax.swing.GroupLayout opcoesConsultaLayout = new javax.swing.GroupLayout(opcoesConsulta);
        opcoesConsulta.setLayout(opcoesConsultaLayout);
        opcoesConsultaLayout.setHorizontalGroup(
            opcoesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcoesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcoesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNovaConsulta)
                    .addComponent(btnRemoverConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        opcoesConsultaLayout.setVerticalGroup(
            opcoesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcoesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterarConsulta)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverConsulta)
                .addGap(18, 18, 18)
                .addComponent(btnNovaConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNovaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Data", "Horario", "Paciente", "Medico", "Tipo de Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollConsulta.setViewportView(tabelaConsultas);

        javax.swing.GroupLayout consultaPanelLayout = new javax.swing.GroupLayout(consultaPanel);
        consultaPanel.setLayout(consultaPanelLayout);
        consultaPanelLayout.setHorizontalGroup(
            consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaPanelLayout.createSequentialGroup()
                .addComponent(scrollConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcoesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        consultaPanelLayout.setVerticalGroup(
            consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(opcoesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        abasSecretaria.addTab("Consultas Agendadas", consultaPanel);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abasSecretaria)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abasSecretaria)
        );

        relatorioPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        btnConsultasDiaSeguinteSMS.setText("Consultas do dia seguinte - SMS");
        btnConsultasDiaSeguinteSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasDiaSeguinteSMSActionPerformed(evt);
            }
        });

        btnConsultasDiaSeguinteEmail.setText("Consultas do dia seguinte - Email\n");

        javax.swing.GroupLayout relatorioPanelLayout = new javax.swing.GroupLayout(relatorioPanel);
        relatorioPanel.setLayout(relatorioPanelLayout);
        relatorioPanelLayout.setHorizontalGroup(
            relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnConsultasDiaSeguinteSMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultasDiaSeguinteEmail)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        relatorioPanelLayout.setVerticalGroup(
            relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultasDiaSeguinteSMS)
                    .addComponent(btnConsultasDiaSeguinteEmail))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(relatorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatorioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarSelecaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarSelecaoPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarSelecaoPerfilActionPerformed

    private void btnNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoPacienteActionPerformed

    private void btnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovaConsultaActionPerformed

    private void btnAlterarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarConsultaActionPerformed

    private void btnConsultasDiaSeguinteSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasDiaSeguinteSMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasDiaSeguinteSMSActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasSecretaria;
    private javax.swing.JButton btnAlterarConsulta;
    private javax.swing.JButton btnAlterarPaciente;
    private javax.swing.JButton btnConsultasDiaSeguinteEmail;
    private javax.swing.JButton btnConsultasDiaSeguinteSMS;
    private javax.swing.JButton btnDetalhesPaciente;
    private javax.swing.JButton btnNovaConsulta;
    private javax.swing.JButton btnNovoPaciente;
    private javax.swing.JButton btnRemoverConsulta;
    private javax.swing.JButton btnRemoverPaciente;
    private javax.swing.JButton btnVoltarSelecaoPerfil;
    private javax.swing.JPanel consultaPanel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel lblNovaConsulta;
    private javax.swing.JLabel lblNovoPaciente;
    private javax.swing.JLabel lblSaudeCIA;
    private javax.swing.JPanel opcoesConsulta;
    private javax.swing.JPanel opcoesPaciente;
    private javax.swing.JPanel pacientePanel;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel relatorioPanel;
    private javax.swing.JScrollPane scrollConsulta;
    private javax.swing.JScrollPane scrollPaciente;
    private javax.swing.JTable tabelaConsultas;
    private javax.swing.JTable tabelaPacientes;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnVoltarSelecaoPerfil() {
        return btnVoltarSelecaoPerfil;
    }
}
