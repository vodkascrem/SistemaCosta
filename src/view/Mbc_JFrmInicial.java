/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author vodka
 */
public class Mbc_JFrmInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public Mbc_JFrmInicial() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Tela Inicial");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuCliente = new javax.swing.JMenuItem();
        jMnuFornecedor = new javax.swing.JMenuItem();
        jMnuMusica = new javax.swing.JMenuItem();
        jMnuAlbum = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        jMnuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-users-15.png"))); // NOI18N
        jMnuCliente.setText("Clientes");
        jMnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuCliente);

        jMnuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-gestão-de-cliente-15.png"))); // NOI18N
        jMnuFornecedor.setText("Usuarios");
        jMnuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuFornecedor);

        jMnuMusica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jMnuMusica.setText("Musica");
        jMnuMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuMusicaActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuMusica);

        jMnuAlbum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-categories-15.png"))); // NOI18N
        jMnuAlbum.setText("Album");
        jMnuAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuAlbumActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuAlbum);
        jMenu1.add(jSeparator1);

        jMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-saída-de-incêndio-15.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimento");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-categories-15.png"))); // NOI18N
        jMenuItem1.setText("Pedidos");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/produto.png"))); // NOI18N
        jMenuItem2.setText("Produtos");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedorActionPerformed
        // TODO add your handling code here:
        new Mbc_JDlgUsuarios().setVisible (true);
    }//GEN-LAST:event_jMnuFornecedorActionPerformed

    private void jMnuAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuAlbumActionPerformed
        // TODO add your handling code here:
        new Mbc_JDlgAlbum().setVisible(true);
    }//GEN-LAST:event_jMnuAlbumActionPerformed

    private void jMnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClienteActionPerformed
        // TODO add your handling code here:
        new Mbc_JDlgClientes().setVisible (true);
    }//GEN-LAST:event_jMnuClienteActionPerformed

    private void jMnuMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuMusicaActionPerformed
        // TODO add your handling code here:
        new Mbc_JDlgMusica().setVisible (true);
    }//GEN-LAST:event_jMnuMusicaActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(Mbc_JFrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mbc_JFrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mbc_JFrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mbc_JFrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mbc_JFrmInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMnuAlbum;
    private javax.swing.JMenuItem jMnuCliente;
    private javax.swing.JMenuItem jMnuFornecedor;
    private javax.swing.JMenuItem jMnuMusica;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
