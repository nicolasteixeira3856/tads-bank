/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.DataController;
import entidades.Cliente;
import entidades.ContaCorrente;
import entidades.ContaInvestimento;
import java.util.List;
import javax.swing.JOptionPane;
import ui.TableModel;
import utils.Validator;
import utils.Filter;

import javax.swing.text.PlainDocument;
import javax.swing.JPanel;

/**
 *
 * @author Vitor
 */
public class JFrameTelaInicial extends javax.swing.JFrame {
    private List<Cliente> clientes;
    public List<ContaInvestimento> contasInvestimento;
    public List<ContaCorrente> contasCorrente;
    public ContaInvestimento contaInvestimento;
    public ContaCorrente contaCorrente;
    public DataController dados;
    TableModel modelo;
    
    /**
     * Creates new form JFrameTelaInicial
     */
    public JFrameTelaInicial() {
        initComponents();
        dados = DataController.getInstance();
        clientes = dados.getClientesList();
        contasInvestimento = dados.getContaInvestimentoList();
        contasCorrente = dados.getContaCorrenteList();
        modelo = new TableModel(clientes);
        tableClientes.setAutoCreateRowSorter(true);
        tableClientes.setModel(modelo);
        tableClientes.setRowHeight(60);
        tableClientes.setAutoCreateColumnsFromModel(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        manejaConta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        textoSobrenome = new javax.swing.JTextField();
        textoRg = new javax.swing.JTextField();
        textoCpf = new javax.swing.JTextField();
        textoEndereco = new javax.swing.JTextField();
        textoSalario = new javax.swing.JTextField(20);
        inserirCliente = new javax.swing.JButton();
        vinculaConta = new javax.swing.JButton();
        excluirCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableClientes.setBorder(new javax.swing.border.MatteBorder(null));
        tableClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableClientes.setName("TabelaClientes"); // NOI18N
        tableClientes.setShowGrid(false);
        tableClientes.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tableClientes);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setText("HalfJComp Banking co.");

        manejaConta.setText("Manejar Contas");
        manejaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setText("Sobrenome");

        jLabel4.setText("RG");

        jLabel5.setText("CPF");

        jLabel6.setText("Endereço");

        jLabel7.setText("Salário");

        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });

        textoSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSobrenomeActionPerformed(evt);
            }
        });

        panel.add(textoRg);
        PlainDocument newRg = (PlainDocument) textoRg.getDocument();
        newRg.setDocumentFilter(new Filter());
        textoRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRgActionPerformed(evt);
            }
        });

        panel.add(textoCpf);
        PlainDocument newCpf = (PlainDocument) textoCpf.getDocument();
        newCpf.setDocumentFilter(new Filter());

        panel.add(textoSalario);
        PlainDocument doc = (PlainDocument) textoSalario.getDocument();
        doc.setDocumentFilter(new Filter());

        inserirCliente.setText("Inserir Cliente");
        inserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirClienteActionPerformed(evt);
            }
        });

        vinculaConta.setText("Vincular contas");
        vinculaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinculaContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(256, 256, 256)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(290, 290, 290)
                                        .addComponent(jLabel4)))
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 274, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoSobrenome)
                            .addComponent(textoNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoRg)
                            .addComponent(textoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inserirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(vinculaConta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(manejaConta)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manejaConta, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(vinculaConta, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        excluirCliente.setBackground(new java.awt.Color(238, 75, 43));
        excluirCliente.setForeground(new java.awt.Color(255, 255, 255));
        excluirCliente.setText("Excluir");
        excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(excluirCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(excluirCliente)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetarCampos() {
        textoNome.setText("");
        textoSobrenome.setText("");
        textoRg.setText("");
        textoCpf.setText("");
        textoEndereco.setText("");
        textoSalario.setText("");
    }
    
    // Botao de manejar contas
    private void manejarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejarActionPerformed
        TelaManejarContas tela = new TelaManejarContas();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_manejarActionPerformed
    
    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed

    }//GEN-LAST:event_textoNomeActionPerformed

    private void textoSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSobrenomeActionPerformed

    private void textoRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoRgActionPerformed
    
    // Botao de adicionar cliente
    private void inserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirClienteActionPerformed
        String nome = textoNome.getText();
        String sobrenome = textoSobrenome.getText();
        String rg = textoRg.getText();
        String cpf = textoCpf.getText();
        String endereco = textoEndereco.getText();
        String salario = textoSalario.getText();
        
        
        if ("".equals(nome) || "".equals(sobrenome) || "".equals(rg) || "".equals(cpf) || "".equals(endereco) || "".equals(salario)) {
            resetarCampos();
            JOptionPane.showMessageDialog(rootPane, "Valores inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if (!Validator.ValidateLong(rg) || !Validator.ValidateLong(salario)) {
            resetarCampos();
            return;
        }
        if (Validator.isCPF(cpf)) {
            Cliente novoCliente = new Cliente(nome, sobrenome, rg,cpf, endereco, salario);
            dados.insertClient(novoCliente);
            clientes = dados.getClientesList();
            resetarCampos();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(rootPane, "CPF inválido", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_inserirClienteActionPerformed

    
    private void vinculaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinculaContaActionPerformed
        TelaVincularContaCliente tela = new TelaVincularContaCliente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_vinculaContaActionPerformed

    private void excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteActionPerformed
        int rowList = tableClientes.convertRowIndexToModel(tableClientes.getSelectedRow());
        if (tableClientes.getSelectedRow() != -1) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja proceder? \n Todas as contas do cliente serão apagadas.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                if (tableClientes.getRowCount() == 1) {
                    dados.setTudoDeletado(true);
                }
                Cliente clienteDeletado = modelo.getValueAtRow(rowList);
                for(int i = 0; i < contasInvestimento.size(); i++) {
                    if (contasInvestimento.get(i).getDono().getCpf().equals(clienteDeletado.getCpf())) {
                        contasInvestimento.remove(i);
                        JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                for(int i = 0; i < contasCorrente.size(); i++) {
                    if (contasCorrente.get(i).getDono().getCpf().equals(clienteDeletado.getCpf())) {
                        contasCorrente.remove(i);
                        JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                modelo.removeRow(tableClientes.getSelectedRow(), rowList);
            }
        }
    }//GEN-LAST:event_excluirClienteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton excluirCliente;
    private javax.swing.JButton inserirCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manejaConta;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField textoCpf;
    private javax.swing.JTextField textoEndereco;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoRg;
    private javax.swing.JTextField textoSalario;
    JPanel panel = new JPanel();
    private javax.swing.JTextField textoSobrenome;
    private javax.swing.JButton vinculaConta;
    // End of variables declaration//GEN-END:variables
}
