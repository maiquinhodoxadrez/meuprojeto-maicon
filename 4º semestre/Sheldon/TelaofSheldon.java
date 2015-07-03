/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonecosdosheldon;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaofSheldon extends javax.swing.JFrame {

    /**
     * Creates new form TelaofSheldon
     */
    int posicao = 0;
    List<InformacoesBonecos> lista;

    public TelaofSheldon() {
        initComponents();
        lista = new ArrayList<InformacoesBonecos>();
    }

    private void Limpar() {
        txtnome.setText("");
        txteditora.setText("");
        txtdata.setText("");
        txtpoder.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        botlimpar = new javax.swing.JButton();
        botconsultar = new javax.swing.JButton();
        botexcluir = new javax.swing.JButton();
        botcadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txteditora = new javax.swing.JTextField();
        txtdata = new javax.swing.JTextField();
        txtpoder = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        botprimeiro = new javax.swing.JButton();
        botanterior = new javax.swing.JButton();
        botproximo = new javax.swing.JButton();
        botultimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botlimpar.setText("LIMPAR");
        botlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botlimparActionPerformed(evt);
            }
        });

        botconsultar.setText("CONSULTAR");
        botconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botconsultarActionPerformed(evt);
            }
        });

        botexcluir.setText("EXCLUIR");
        botexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botexcluirActionPerformed(evt);
            }
        });

        botcadastrar.setText("CADASTRAR");
        botcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botcadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botlimpar)
                .addGap(46, 46, 46)
                .addComponent(botconsultar)
                .addGap(47, 47, 47)
                .addComponent(botexcluir)
                .addGap(43, 43, 43)
                .addComponent(botcadastrar)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botlimpar)
                    .addComponent(botconsultar)
                    .addComponent(botexcluir)
                    .addComponent(botcadastrar))
                .addGap(34, 34, 34))
        );

        jLabel1.setText("       BONECO");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("NOME:");

        jLabel3.setText("EDITORA:");

        jLabel4.setText("DATA DE APARIÇÃO:");

        jLabel5.setText("SUPER PODER:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnome)
                    .addComponent(txteditora)
                    .addComponent(txtdata)
                    .addComponent(txtpoder, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txteditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtpoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botprimeiro.setText("PRIMEIRO");
        botprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botprimeiroActionPerformed(evt);
            }
        });

        botanterior.setText("ANTERIOR");
        botanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botanteriorActionPerformed(evt);
            }
        });

        botproximo.setText("PRÓXIMO");
        botproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botproximoActionPerformed(evt);
            }
        });

        botultimo.setText("ÚLTIMO");
        botultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botprimeiro)
                .addGap(46, 46, 46)
                .addComponent(botanterior)
                .addGap(47, 47, 47)
                .addComponent(botproximo)
                .addGap(43, 43, 43)
                .addComponent(botultimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botprimeiro)
                    .addComponent(botanterior)
                    .addComponent(botproximo)
                    .addComponent(botultimo))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botlimparActionPerformed
        Limpar();
    }//GEN-LAST:event_botlimparActionPerformed

    private void botconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botconsultarActionPerformed
        Boolean encontrou = true;
        Integer posicaoachou = 0;
        String nome = JOptionPane.showInputDialog("Dgite o nome a ser pesquisado:");
        for (InformacoesBonecos boneco : lista) {
            if (nome.equals(boneco.getNome_boneco())) {

                posicao = posicaoachou;
                encontrou = true;
                txtnome.setText(boneco.getNome_boneco());
                txteditora.setText(boneco.getEdit_boneco());
                txtdata.setText(boneco.getData_pri_apa());
                txtpoder.setText(boneco.getSuper_poder());
            } else {
                JOptionPane.showMessageDialog(this, "Dados não cadastrados!");
            }
        }
    }//GEN-LAST:event_botconsultarActionPerformed

    private void botexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botexcluirActionPerformed
        lista.remove(lista.get(posicao)); //pega o objeto da posicao
        Limpar();
    }//GEN-LAST:event_botexcluirActionPerformed

    private void botcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botcadastrarActionPerformed
        InformacoesBonecos info = new InformacoesBonecos();
        info.setNome_boneco(txtnome.getText());
        info.setEdit_boneco(txteditora.getText());
        info.setData_pri_apa(txtdata.getText());
        info.setSuper_poder(txtpoder.getText());

        lista.add(info);
        if (txtnome.equals("") || txteditora.equals("") || txtdata.equals("") || txtpoder.equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todas os espaços!");
        } else {
            JOptionPane.showMessageDialog(this, "Dados cadastrados com sucesso!");
        }
        Limpar();
    }//GEN-LAST:event_botcadastrarActionPerformed

    private void botprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botprimeiroActionPerformed
        posicao = 0;
        //pegar o primeiro boneco da lista:
        InformacoesBonecos boneco = lista.get(0);
        if (lista.size() > 0) {

            txtnome.setText(boneco.getNome_boneco());
            txteditora.setText(boneco.getEdit_boneco());
            txtdata.setText(boneco.getData_pri_apa());
            txtpoder.setText(boneco.getSuper_poder());

        }
    }//GEN-LAST:event_botprimeiroActionPerformed

    private void botanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botanteriorActionPerformed
        botprimeiro.setEnabled(true);
        botanterior.setEnabled(true);
        botproximo.setEnabled(true);
        botultimo.setEnabled(true);

        if (posicao > 0) {
            posicao = posicao - 1;

            InformacoesBonecos boneco = lista.get(posicao);

            txtnome.setText(boneco.getNome_boneco());
            txteditora.setText(boneco.getEdit_boneco());
            txtdata.setText(boneco.getData_pri_apa());
            txtpoder.setText(boneco.getSuper_poder());

        }
        /*if (posicao > 0) {
         if (lista.size() > 0) {
         InformacoesBonecos boneco = lista.get(posicao - 1);

         txtnome.setText(boneco.getNome_boneco());
         txteditora.setText(boneco.getEdit_boneco());
         txtdata.setText(boneco.getData_pri_apa());
         txtpoder.setText(boneco.getSuper_poder());

         } else {
         InformacoesBonecos boneco = lista.get(0);
         if (lista.size() > 0) {
         txtnome.setText(boneco.getNome_boneco());
         txteditora.setText(boneco.getEdit_boneco());
         txtdata.setText(boneco.getData_pri_apa());
         txtpoder.setText(boneco.getSuper_poder());
         }
         }
         }
         */
    }//GEN-LAST:event_botanteriorActionPerformed

    private void botproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botproximoActionPerformed
        posicao = lista.size() + 1;
        if (posicao > 0) {
            if (lista.size() > 0) {
                InformacoesBonecos boneco = lista.get(+1);
                txtnome.setText(boneco.getNome_boneco());
                txteditora.setText(boneco.getEdit_boneco());
                txtdata.setText(boneco.getData_pri_apa());
                txtpoder.setText(boneco.getSuper_poder());

            } else {
                InformacoesBonecos boneco = lista.get(0);
                if (lista.size() > 0) {
                    txtnome.setText(boneco.getNome_boneco());
                    txteditora.setText(boneco.getEdit_boneco());
                    txtdata.setText(boneco.getData_pri_apa());
                    txtpoder.setText(boneco.getSuper_poder());
                }
            }
        }
    }//GEN-LAST:event_botproximoActionPerformed

    private void botultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botultimoActionPerformed
        posicao = lista.size() - 1;

        InformacoesBonecos boneco = lista.get(posicao);

        txtnome.setText(boneco.getNome_boneco());
        txteditora.setText(boneco.getEdit_boneco());
        txtdata.setText(boneco.getData_pri_apa());
        txtpoder.setText(boneco.getSuper_poder());

    }//GEN-LAST:event_botultimoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaofSheldon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaofSheldon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaofSheldon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaofSheldon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaofSheldon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botanterior;
    private javax.swing.JButton botcadastrar;
    private javax.swing.JButton botconsultar;
    private javax.swing.JButton botexcluir;
    private javax.swing.JButton botlimpar;
    private javax.swing.JButton botprimeiro;
    private javax.swing.JButton botproximo;
    private javax.swing.JButton botultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txteditora;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpoder;
    // End of variables declaration//GEN-END:variables
}
