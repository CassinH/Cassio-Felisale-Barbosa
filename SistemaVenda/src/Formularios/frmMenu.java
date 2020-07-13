
package Formularios;

import Classes.Dados;


public class frmMenu extends javax.swing.JFrame {
    private Dados clsdados;
      

   public void setDados(Dados clsdados){
       this.clsdados=clsdados;

   }
    public frmMenu() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        DesktopMenu = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Produtos = new javax.swing.JMenuItem();
        Usuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        AlterarSenha = new javax.swing.JMenuItem();
        AlterarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenuItem();
        mnMovimentos = new javax.swing.JMenu();
        Vendas = new javax.swing.JMenuItem();
        RVendas = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        DesktopMenu.setBackground(new java.awt.Color(204, 204, 204));
        DesktopMenu.setForeground(new java.awt.Color(255, 255, 255));
        DesktopMenu.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone Principal.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema PlaneT");

        DesktopMenu.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DesktopMenu.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopMenuLayout = new javax.swing.GroupLayout(DesktopMenu);
        DesktopMenu.setLayout(DesktopMenuLayout);
        DesktopMenuLayout.setHorizontalGroup(
            DesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopMenuLayout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DesktopMenuLayout.setVerticalGroup(
            DesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopMenuLayout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addGroup(DesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jDesktopPane1.setLayer(DesktopMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopMenu)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopMenu)
        );

        mnArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produto.png"))); // NOI18N
        mnArquivo.setText("Arquivos");

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cliente.png"))); // NOI18N
        Cliente.setText("Clientes");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        mnArquivo.add(Cliente);

        Produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produtos.png"))); // NOI18N
        Produtos.setText("Produtos");
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        mnArquivo.add(Produtos);

        Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuario.png"))); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        mnArquivo.add(Usuarios);
        mnArquivo.add(jSeparator1);

        AlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Senha.png"))); // NOI18N
        AlterarSenha.setText("Alterar Senha");
        AlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarSenhaActionPerformed(evt);
            }
        });
        mnArquivo.add(AlterarSenha);

        AlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar Usuario.png"))); // NOI18N
        AlterarUsuario.setText("Alterar Usuario");
        AlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarUsuarioActionPerformed(evt);
            }
        });
        mnArquivo.add(AlterarUsuario);
        mnArquivo.add(jSeparator2);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        mnArquivo.add(Sair);

        jMenuBar1.add(mnArquivo);

        mnMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MVendas.png"))); // NOI18N
        mnMovimentos.setText("Movimentos");

        Vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Vendas.png"))); // NOI18N
        Vendas.setText("Vendas");
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });
        mnMovimentos.add(Vendas);

        RVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RVenda.png"))); // NOI18N
        RVendas.setText("Relatorios de Vendas");
        RVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVendasActionPerformed(evt);
            }
        });
        mnMovimentos.add(RVendas);

        jMenuBar1.add(mnMovimentos);

        mnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AjudaPrincipal.png"))); // NOI18N
        mnAjuda.setText("Ajuda");

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sobre.png"))); // NOI18N
        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        mnAjuda.add(Sobre);

        Ajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ajuda.png"))); // NOI18N
        Ajuda.setText("Ajuda");
        Ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjudaActionPerformed(evt);
            }
        });
        mnAjuda.add(Ajuda);

        jMenuBar1.add(mnAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        frmUsuarios frmuser=new frmUsuarios();
        frmuser.setDados(clsdados);
        DesktopMenu.add(frmuser);
        frmuser.show();
    }//GEN-LAST:event_UsuariosActionPerformed

    private void AlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarUsuarioActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
         this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void AlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarSenhaActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutosActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SobreActionPerformed

    private void AjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AjudaActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendasActionPerformed

    private void RVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RVendasActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajuda;
    private javax.swing.JMenuItem AlterarSenha;
    private javax.swing.JMenuItem AlterarUsuario;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JDesktopPane DesktopMenu;
    private javax.swing.JMenuItem Produtos;
    private javax.swing.JMenuItem RVendas;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JMenuItem Vendas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenu mnMovimentos;
    // End of variables declaration//GEN-END:variables
}
