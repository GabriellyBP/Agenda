package br.com.gabrielly.aula.gui;

import br.com.gabrielly.aula.bd.InicializaBD;
import br.com.gabrielly.aula.bd.OperacaoBD;
import br.com.gabrielly.aula.dao.ConhecidoDAO;
import br.com.gabrielly.aula.dao.ContatoDAO;
import br.com.gabrielly.aula.entidade.Conhecido;
import br.com.gabrielly.aula.entidade.Contato;
import br.com.gabrielly.aula.enums.Referencia;
import br.com.gabrielly.aula.enums.TipoContato;
import br.com.gabrielly.aula.util.Base;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AgendaGUI extends javax.swing.JFrame {

    /**
     * Creates new form AgendaGUI
     */
    public AgendaGUI() {
        initComponents();
        InicializaBD.inicializarBD();
        mostraRegistros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jtpAbas = new javax.swing.JTabbedPane();
        jpConhecidos = new javax.swing.JPanel();
        jscpConhecidos = new javax.swing.JScrollPane();
        jtConhecidos = new javax.swing.JTable();
        botaoNovo = new javax.swing.JButton();
        botaoEditar1 = new javax.swing.JButton();
        botaoExcluir1 = new javax.swing.JButton();
        jpContatos = new javax.swing.JPanel();
        jscpContatos = new javax.swing.JScrollPane();
        jtContatos = new javax.swing.JTable();
        jpCadastro = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLContato = new javax.swing.JLabel();
        jTextContato = new javax.swing.JTextField();
        jLReferencia = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        botaoVT = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        jcbRef = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtConhecidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtConhecidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtConhecidosKeyReleased(evt);
            }
        });
        jscpConhecidos.setViewportView(jtConhecidos);

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar1.setText("Editar");
        botaoEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditar1ActionPerformed(evt);
            }
        });

        botaoExcluir1.setText("Excluir");
        botaoExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConhecidosLayout = new javax.swing.GroupLayout(jpConhecidos);
        jpConhecidos.setLayout(jpConhecidosLayout);
        jpConhecidosLayout.setHorizontalGroup(
            jpConhecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConhecidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConhecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscpConhecidos, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addGroup(jpConhecidosLayout.createSequentialGroup()
                        .addComponent(botaoNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpConhecidosLayout.setVerticalGroup(
            jpConhecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConhecidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscpConhecidos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConhecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConhecidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoEditar1)
                        .addComponent(botaoExcluir1))
                    .addComponent(botaoNovo))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jtpAbas.addTab("Conhecido", jpConhecidos);

        jtContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtContatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtContatosFocusGained(evt);
            }
        });
        jscpContatos.setViewportView(jtContatos);

        javax.swing.GroupLayout jpContatosLayout = new javax.swing.GroupLayout(jpContatos);
        jpContatos.setLayout(jpContatosLayout);
        jpContatosLayout.setHorizontalGroup(
            jpContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscpContatos, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
        );
        jpContatosLayout.setVerticalGroup(
            jpContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscpContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpAbas.addTab("Contato", jpContatos);

        jLNome.setText("Nome:");

        jTextNome.setText("Nome");
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jLContato.setText("Contato:");

        jTextContato.setText("Contato");

        jLReferencia.setText("Refer??ncia:");

        jLTipo.setText("Tipo:");

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(TipoContato.values()));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        botaoVT.setText("Visualizar Todos");
        botaoVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVTActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jcbRef.setModel(new javax.swing.DefaultComboBoxModel(Referencia.values()));

        javax.swing.GroupLayout jpCadastroLayout = new javax.swing.GroupLayout(jpCadastro);
        jpCadastro.setLayout(jpCadastroLayout);
        jpCadastroLayout.setHorizontalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVT))
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLContato, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroLayout.createSequentialGroup()
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbTipo, 0, 149, Short.MAX_VALUE)
                            .addComponent(jcbRef, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jpCadastroLayout.setVerticalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoVT))
                .addContainerGap())
        );

        jtpAbas.addTab("Cadastro", jpCadastro);

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jtpAbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jtpAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostraRegistros() {
        String[] camposConhecido = {"ID", "Nome", "Referencia"};
        List<Conhecido> conhecidos = ConhecidoDAO.selecionarTodos();
        String[][] dadosConhecidos;
        dadosConhecidos = new String[conhecidos.size()][3];
        int posicao = 0;
        for (Conhecido c : conhecidos) {
            String[] umConhecido = new String[3];
            umConhecido[0] = String.valueOf(c.getId());
            umConhecido[1] = c.getNome();
            umConhecido[2] = c.getReferencia().getReferencia();
            dadosConhecidos[posicao++] = umConhecido;
        }
        DefaultTableModel modelo = new DefaultTableModel(
                dadosConhecidos, camposConhecido);
        jtConhecidos.setModel(modelo);
    }

    private void jtContatosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtContatosFocusGained
        int selecionado = jtConhecidos.getSelectedRow();
        if (selecionado >= 0) {
            String idString = (String) jtConhecidos.getValueAt(
                    selecionado, 0);
            int id = Integer.parseInt(idString);
            String[] camposContato = {"Tipo", "Contato"};
            List<Contato> contatos
                    = ContatoDAO.selecionarPorConhecido(id);
            String[][] dadosContatos = new String[contatos.size()][2];
            int posicao = 0;
            for (Contato cont : contatos) {
                String[] umContato = new String[2];
                umContato[0] = cont.getTipo().getTipoContato();
                umContato[1] = cont.getIdentificacao();
                dadosContatos[posicao++] = umContato;
            }
            DefaultTableModel modelo = new DefaultTableModel(
                    dadosContatos, camposContato);
            jtContatos.setModel(modelo);
        } else {
            jtpAbas.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jtContatosFocusGained

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        jtpAbas.setSelectedIndex(2);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed

        String nome = jTextNome.getText();
        String tipo = jcbTipo.getSelectedItem().toString();
        String cont = jTextContato.getText();
        String ref = jcbRef.getSelectedItem().toString();
        Conhecido conhecido = new Conhecido(nome, Referencia.getReferenciaPorNome(ref));
        ConhecidoDAO.inserir(conhecido);
        List<Conhecido> listaConhecidos = ConhecidoDAO.selecionarTodos();
        for (Conhecido cnh : listaConhecidos) {
            if (nome.equals(cnh.getNome())) {
                int id = cnh.getId();
                Contato contato = new Contato(cnh, TipoContato.getTipoContatoPorNome(tipo), cont);
                ContatoDAO.inserir(contato);
                mostraRegistros();
                Base.mensagem("Contato salvo com sucesso:\n" + nome);
            }
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVTActionPerformed
        jtpAbas.setSelectedIndex(0);
    }//GEN-LAST:event_botaoVTActionPerformed

    private void botaoEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditar1ActionPerformed
        int selecionado = jtConhecidos.getSelectedRow();
        if (selecionado >= 0) {
            jtpAbas.setSelectedIndex(2);
            String idString = (String) jtConhecidos.getValueAt(selecionado, 0);
            int id = Integer.parseInt(idString);
            List<Contato> contatos = ContatoDAO.selecionarPorConhecido(id);
            Conhecido conhe = ConhecidoDAO.getConhecidoPorId(id);
            String[][] dadosContatos = new String[contatos.size()][2];
            int posicao = 0;
            for (Contato cont : contatos) {
                String[] umContato = new String[2];
                umContato[0] = cont.getTipo().getTipoContato();
                umContato[1] = cont.getIdentificacao();
                dadosContatos[posicao++] = umContato;

                jTextContato.setText(umContato[1]);
                jcbTipo.getModel().setSelectedItem(umContato[0]);
                jcbRef.getModel().setSelectedItem(conhe.getReferencia());
                jTextNome.setText(conhe.getNome());
            }      
        } else {
            Base.mensagem("Selecionar algum conhecido:\n" );
        }
    }//GEN-LAST:event_botaoEditar1ActionPerformed

    private void botaoExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluir1ActionPerformed

        int selecionado = jtConhecidos.getSelectedRow();
        if (selecionado >= 0) {
            String idString = (String) jtConhecidos.getValueAt(selecionado, 0);
            int id = Integer.parseInt(idString);
            List<Contato> contatos = ContatoDAO.selecionarPorConhecido(id);
            String[][] dadosContatos = new String[contatos.size()][2];
            int posicao = 0;
            for (Contato cont : contatos) {
                ContatoDAO.apagar(cont);
                Conhecido conhe = ConhecidoDAO.getConhecidoPorId(id);
                ConhecidoDAO.apagar(conhe);
                mostraRegistros();
            }
        } else {
            Base.mensagem("Selecionar algum conhecido\n");
        }

    }//GEN-LAST:event_botaoExcluir1ActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed

    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed

    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jtConhecidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtConhecidosKeyReleased
        //  if (jtConhecidos.getSelectedRow() != -1){
        //     jTextNome.setText(jtConhecidos.setValueAt(jtConhecidos.getSelectedRow(),0).toString());
        //    jTextContato.setText(jtConhecidos.setValueAt(jtConhecidos.getSelectedRow(),1).toString());
        //   jtConhecidos
        //  }
    }//GEN-LAST:event_jtConhecidosKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AgendaGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar1;
    private javax.swing.JButton botaoExcluir1;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVT;
    private javax.swing.JLabel jLContato;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLReferencia;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JTextField jTextContato;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JComboBox<String> jcbRef;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JPanel jpCadastro;
    private javax.swing.JPanel jpConhecidos;
    private javax.swing.JPanel jpContatos;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JScrollPane jscpConhecidos;
    private javax.swing.JScrollPane jscpContatos;
    private javax.swing.JTable jtConhecidos;
    private javax.swing.JTable jtContatos;
    private javax.swing.JTabbedPane jtpAbas;
    // End of variables declaration//GEN-END:variables
}
