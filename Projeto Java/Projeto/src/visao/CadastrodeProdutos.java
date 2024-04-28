/*
 * Para alterar este cabeçalho de licença, escolha Cabeçalhos de Licença nas Propriedades do Projeto.
 * Para alterar este arquivo de modelo, escolha Ferramentas | Modelos
 * e abra o modelo no editor.
 */
package visao;

import modelo.Categoria;
import javax.swing.JOptionPane;
import modelo.Produto;
import repositorio.Repositorio;
import static repositorio.Repositorio.produtos;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriella
 */
public final class CadastrodeProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CadastrodeProdutos
     */
    public CadastrodeProdutos() {
        initComponents();
        carregarCategorias();
        carregarProdutos();
        adicionarSelecaoTabela();

    }

    public void carregarCategorias() {
        for (Categoria c : Repositorio.categorias) {
            boxcategoria.addItem(c);
        }
    }

    public void carregarProdutos() {
        DefaultTableModel model = (DefaultTableModel) telaresultado.getModel();
        model.setRowCount(0); // Limpar os produtos exibidos na tabela

        for (Produto produto : Repositorio.produtos) {
            Object[] rowData = {
                produto.getIdProduto(),
                produto.getNome(),
                produto.getCategoria().getNome(),
                produto.getCor(),
                produto.getEstoque(),
                produto.getTamanho(),
                "R$" + produto.getValor(),
                produto.getDescricao(),};
            model.addRow(rowData);
        }
    }

    // Adicionar evento para seleção de linhas
    private void adicionarSelecaoTabela() {
        telaresultado.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = telaresultado.getSelectedRow();
                    if (selectedRow != -1) {
                        // Obtém os valores das células selecionadas
                        Object idProduto = telaresultado.getValueAt(selectedRow, 0);
                        Object nome = telaresultado.getValueAt(selectedRow, 1);
                        Object categoria = telaresultado.getValueAt(selectedRow, 2);
                        Object cor = telaresultado.getValueAt(selectedRow, 3);
                        Object estoque = telaresultado.getValueAt(selectedRow, 4);
                        Object tamanho = telaresultado.getValueAt(selectedRow, 5);
                        Object valor = telaresultado.getValueAt(selectedRow, 6);
                        Object descricao = telaresultado.getValueAt(selectedRow, 7);

                        // Preenche os campos de destino com os valores do produto selecionado
                        txtnome.setText(nome.toString());
                        txtcod.setText(idProduto.toString());
                        boxcategoria.setSelectedItem(categoria.toString());
                        txtcor.setText(cor.toString());
                        txtestoque.setText(estoque.toString());
                        boxtamanho.setSelectedItem(tamanho.toString());
                        txtpreco.setText(valor.toString());
                        txtdescricao.setText(descricao.toString());
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        boxtamanho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxcategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        txtdescricao = new javax.swing.JTextField();
        txtestoque = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botaoEditar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        telaresultado = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cod:");

        txtcod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        boxtamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG" }));
        boxtamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtamanhoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamanho:");

        jLabel5.setText("Categoria:");

        jLabel6.setText("Estoque:");

        jLabel7.setText("Descrição:");

        jLabel8.setText("Cor:");

        jLabel9.setText("Preço: R$");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        txtestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestoqueActionPerformed(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
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
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(boxtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telaresultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Categoria", "Cor", "Estoque", "Tamanho", "Preço", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(telaresultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(836, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // Botão "Cancelar" pressionado
        limparCampos();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void boxtamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxtamanhoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_boxtamanhoActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed


    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // Botão "Salvar" pressionado
        salvarProduto();
        telaresultado(produtos);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // Botão "Pesquisar" pressionado
        pesquisarProduto();
        telaresultado(produtos);
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // Botão "Sair" pressionado
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        //Botão "Editar" pressionado
        editarProduto();
        /*
         Para funcionar o metodo editarProduto antes de apertar em editar, voce tem que colocar o valor do produto
        sem "," 
        Ex.: Quano produto for selecionado o valor vai aparecer assim: Preço: R$20,52
            Então tera que mudar o valor para Preço: R$20.52 e fazer todas as modificações necessarias.
         */

        telaresultado(produtos);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // Botão "Excluir" pressionado
        excluirProduto();
        telaresultado(produtos);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void txtestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestoqueActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrodeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodeProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<Object> boxcategoria;
    private javax.swing.JComboBox<String> boxtamanho;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable telaresultado;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtcor;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtestoque;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables

    ///////////////////////////////////////////////////////////////
    //METODOS
    //limpar os campos do formulário
    public void limparCampos() {
        txtcod.setText("");
        txtnome.setText("");
        boxtamanho.setSelectedIndex(0);
        boxcategoria.setSelectedIndex(0);
        txtestoque.setText("");
        txtdescricao.setText("");
        txtcor.setText("");
        txtpreco.setText("");
    }

    // Salvar um novo produto
    public void salvarProduto() {
        int cod = Integer.parseInt(this.txtcod.getText());
        String nome = this.txtnome.getText();
        String tamanho = boxtamanho.getSelectedItem().toString();
        Categoria categoria = (Categoria) this.boxcategoria.getSelectedItem();
        int estoque = Integer.parseInt(this.txtestoque.getText());
        String descricao = this.txtdescricao.getText();
        String cor = this.txtcor.getText();
        double preco = Double.parseDouble(this.txtpreco.getText());

        // Verificar se o produto já existe com os mesmos parâmetros
        for (Produto produto : Repositorio.produtos) {
            if (produto.getIdProduto() == cod && produto.getCor().equalsIgnoreCase(cor)) {
                JOptionPane.showMessageDialog(this, "Não é possível salvar. Já existe um produto com esse dados");
                return;
            }
        }

        //salvar o novo produto
        Produto produto = new Produto(cod, nome, descricao, tamanho, estoque, preco, cor, categoria);
        Repositorio.produtos.add(produto);

        JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");

        // Limpar os campos
        limparCampos();
    }

    // Método para excluir um produto
    public void excluirProduto() {
        int cod = Integer.parseInt(this.txtcod.getText());

        // Buscar o produto na lista
        Produto produtoParaRemover = null;
        for (Produto produto : Repositorio.produtos) {
            if (produto.getIdProduto() == cod) {
                produtoParaRemover = produto;
                break;
            }
        }

        // Remover o produto da lista
        if (produtoParaRemover != null) {
            Repositorio.produtos.remove(produtoParaRemover);
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível encontrar o produto para remoção.");
        }
    }

    public void editarProduto() {
        List<Produto> produtos = Repositorio.produtos;
        int linhaSelecionada = telaresultado.getSelectedRow();
        if (linhaSelecionada != -1) {
            String cod = telaresultado.getValueAt(linhaSelecionada, 0).toString();
            String produtoNome = txtnome.getText();
            String tamanho = boxtamanho.getSelectedItem().toString();
            Categoria categoria = (Categoria) boxcategoria.getSelectedItem();
            int estoque = Integer.parseInt(txtestoque.getText());
            String descricao = txtdescricao.getText();
            String cor = txtcor.getText();
            double preco = Double.parseDouble(txtpreco.getText());

            // Encontrar o produto correspondente na lista de produtos
            for (Produto produto : produtos) {
                if (String.valueOf(produto.getIdProduto()).equals(cod)) {
                    // Atualizar o produto na lista com os novos valores
                    produto.setNome(produtoNome);
                    produto.setTamanho(tamanho);
                    produto.setCategoria(categoria); // Atualizar a categoria completa
                    produto.setEstoque(estoque);
                    produto.setDescricao(descricao);
                    produto.setCor(cor);
                    produto.setValor(preco);
                    break; // Parar o loop após encontrar o produto correspondente
                }
            }
        }
    }

public void pesquisarProduto() {
    boolean produtoEncontrado = false;

    String termoNome = txtnome.getText();
    String termoId = txtcod.getText();
    Categoria termoCategoria = (Categoria) boxcategoria.getSelectedItem();
    String termoCategoriaStr = termoCategoria != null ? termoCategoria.toString() : "";
    String termoTamanho = (String) boxtamanho.getSelectedItem();
    String termoCor = txtcor.getText();
    String termoValor = txtpreco.getText();

    JOptionPane.showMessageDialog(this, "Exibindo resultados da pesquisa...");

    List<Produto> produtos = Repositorio.produtos;

    List<Produto> resultados = new ArrayList<>();

    for (Produto produto : produtos) {
        if (produto.getNome().equalsIgnoreCase(termoNome)
                || produto.getCategoria().getNome().equalsIgnoreCase(termoCategoriaStr)
                || produto.getTamanho().equalsIgnoreCase(termoTamanho)
                || String.valueOf(produto.getIdProduto()).equalsIgnoreCase(termoId)
                || produto.getCor().equalsIgnoreCase(termoCor)
                || String.valueOf(produto.getValor()).equalsIgnoreCase(termoValor)) {

            txtnome.setText(produto.getNome());
            txtcod.setText(String.valueOf(produto.getIdProduto()));
            boxcategoria.setSelectedItem(produto.getCategoria());
            boxtamanho.setSelectedItem(produto.getTamanho());
            txtcor.setText(produto.getCor());
            txtpreco.setText(String.valueOf(produto.getValor()));

            produtoEncontrado = true;
            resultados.add(produto);
        }
    }

    if (!produtoEncontrado) {
        JOptionPane.showMessageDialog(this, "Produto não encontrado.");
        telaresultado(new ArrayList<>()); 
        return; 
    }

    telaresultado(resultados);
}


public void telaresultado(List<Produto> produtos) {
    DefaultTableModel model = (DefaultTableModel) telaresultado.getModel();
    model.setRowCount(0); // Limpar o conteúdo existente no JTable

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    boolean produtoEncontrado = false;

    for (Produto produto : produtos) {
        Object[] rowData = {
            produto.getIdProduto(),
            produto.getNome(),
            produto.getCategoria().getNome(),
            produto.getCor(),
            produto.getEstoque(),
            produto.getTamanho(),
            currencyFormat.format(produto.getValor()), // Formata o valor como moeda
            produto.getDescricao()
        };
        model.addRow(rowData);

        if (produto.getNome().equalsIgnoreCase(txtnome.getText())) {
            // Atualiza os campos de pesquisa com os valores do produto encontrado
            txtnome.setText(produto.getNome());
            txtcod.setText(String.valueOf(produto.getIdProduto()));
            boxcategoria.setSelectedItem(produto.getCategoria());
            boxtamanho.setSelectedItem(produto.getTamanho());
            txtcor.setText(produto.getCor());
            txtpreco.setText(String.valueOf(produto.getValor()));
            txtestoque.setText(String.valueOf(produto.getEstoque()));
            txtdescricao.setText(produto.getDescricao());

            produtoEncontrado = true;
        }
    }

    // Limpar os campos de pesquisa se o produto não foi encontrado
    if (!produtoEncontrado) {
        limparCampos();
    }

    // Atualizar o JTable para exibir os novos dados
    telaresultado.revalidate();
    telaresultado.repaint();
}

}
