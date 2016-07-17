/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author mayza
 */
public class MedicoView extends javax.swing.JFrame {

    /**
     * Creates new form MedicoView2
     */
    public MedicoView() {
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
        jLabel1 = new javax.swing.JLabel();
        btnVoltarSelecaoPerfil = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        abasSecretaria = new javax.swing.JTabbedPane();
        pacientePanel = new javax.swing.JPanel();
        scrollPaciente = new javax.swing.JScrollPane();
        tabelaPacientes = new javax.swing.JTable();
        opcoesPaciente = new javax.swing.JPanel();
        btnDetalhesPaciente = new javax.swing.JButton();
        btnInserirDadosAdicionais = new javax.swing.JButton();
        btnAlterarDadosAdicionais = new javax.swing.JButton();
        btnRemoverDadosAdicionais = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCadastrarProntuario = new javax.swing.JButton();
        btnAlterarProntuario = new javax.swing.JButton();
        btnRemoverProntuario = new javax.swing.JButton();
        relatorioPanel = new javax.swing.JPanel();
        btnGerarReceita = new javax.swing.JButton();
        btnGerarAtestado = new javax.swing.JButton();
        btnGerarDeclaracaoAcompanhamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/icone-consultorio.png"))); // NOI18N
        jLabel1.setText("Saude & CIA");

        btnVoltarSelecaoPerfil.setText("Voltar a Selecao de Perfis");
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarSelecaoPerfil)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVoltarSelecaoPerfil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perfil Medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        tabelaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"aa", null, null, null},
                {"bbb", null, null, null},
                {"cccc", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {"ddddd", null, null, null}
            },
            new String [] {
                "Nome do Paciente", "Celular", "Email", "Tipo de Convenio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaciente.setViewportView(tabelaPacientes);

        opcoesPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opcoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnDetalhesPaciente.setText("Detalhes do Paciente");

        btnInserirDadosAdicionais.setText("Inserir Dados Adicionais");
        btnInserirDadosAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirDadosAdicionaisActionPerformed(evt);
            }
        });

        btnAlterarDadosAdicionais.setText("Alterar Dados Adicionais");
        btnAlterarDadosAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosAdicionaisActionPerformed(evt);
            }
        });

        btnRemoverDadosAdicionais.setText("Remover Dados Adicionais");
        btnRemoverDadosAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDadosAdicionaisActionPerformed(evt);
            }
        });

        btnCadastrarProntuario.setText("Cadastrar Prontuario");
        btnCadastrarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProntuarioActionPerformed(evt);
            }
        });

        btnAlterarProntuario.setText("Alterar Prontuario");
        btnAlterarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProntuarioActionPerformed(evt);
            }
        });

        btnRemoverProntuario.setText("Remover Prontuario");
        btnRemoverProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProntuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcoesPacienteLayout = new javax.swing.GroupLayout(opcoesPaciente);
        opcoesPaciente.setLayout(opcoesPacienteLayout);
        opcoesPacienteLayout.setHorizontalGroup(
            opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(opcoesPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetalhesPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(btnInserirDadosAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarDadosAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverDadosAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        opcoesPacienteLayout.setVerticalGroup(
            opcoesPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcoesPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDetalhesPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserirDadosAdicionais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarDadosAdicionais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoverDadosAdicionais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarProntuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarProntuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverProntuario)
                .addGap(4, 4, 4))
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

        btnGerarReceita.setText("Gerar Receita Medica");
        btnGerarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarReceitaActionPerformed(evt);
            }
        });

        btnGerarAtestado.setText("Gerar Atestado Medico");
        btnGerarAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarAtestadoActionPerformed(evt);
            }
        });

        btnGerarDeclaracaoAcompanhamento.setText("Gerar Declaracao de Acompanhamento");
        btnGerarDeclaracaoAcompanhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarDeclaracaoAcompanhamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout relatorioPanelLayout = new javax.swing.GroupLayout(relatorioPanel);
        relatorioPanel.setLayout(relatorioPanelLayout);
        relatorioPanelLayout.setHorizontalGroup(
            relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGerarReceita)
                .addGap(18, 18, 18)
                .addComponent(btnGerarAtestado)
                .addGap(18, 18, 18)
                .addComponent(btnGerarDeclaracaoAcompanhamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        relatorioPanelLayout.setVerticalGroup(
            relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(relatorioPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(relatorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarReceita)
                    .addComponent(btnGerarAtestado)
                    .addComponent(btnGerarDeclaracaoAcompanhamento))
                .addContainerGap(29, Short.MAX_VALUE))
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
                    .addComponent(relatorioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatorioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarSelecaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarSelecaoPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarSelecaoPerfilActionPerformed

    private void btnGerarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarReceitaActionPerformed

    private void btnGerarAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarAtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarAtestadoActionPerformed

    private void btnGerarDeclaracaoAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarDeclaracaoAcompanhamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGerarDeclaracaoAcompanhamentoActionPerformed

    private void btnCadastrarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarProntuarioActionPerformed

    private void btnAlterarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarProntuarioActionPerformed

    private void btnRemoverProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProntuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProntuarioActionPerformed

    private void btnInserirDadosAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosAdicionaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirDadosAdicionaisActionPerformed

    private void btnAlterarDadosAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosAdicionaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarDadosAdicionaisActionPerformed

    private void btnRemoverDadosAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDadosAdicionaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverDadosAdicionaisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasSecretaria;
    private javax.swing.JButton btnAlterarDadosAdicionais;
    private javax.swing.JButton btnAlterarProntuario;
    private javax.swing.JButton btnCadastrarProntuario;
    private javax.swing.JButton btnDetalhesPaciente;
    private javax.swing.JButton btnGerarAtestado;
    private javax.swing.JButton btnGerarDeclaracaoAcompanhamento;
    private javax.swing.JButton btnGerarReceita;
    private javax.swing.JButton btnInserirDadosAdicionais;
    private javax.swing.JButton btnRemoverDadosAdicionais;
    private javax.swing.JButton btnRemoverProntuario;
    private javax.swing.JButton btnVoltarSelecaoPerfil;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel opcoesPaciente;
    private javax.swing.JPanel pacientePanel;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel relatorioPanel;
    private javax.swing.JScrollPane scrollPaciente;
    private javax.swing.JTable tabelaPacientes;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnVoltarSelecaoPerfil() {
        return btnVoltarSelecaoPerfil;
    }
}
