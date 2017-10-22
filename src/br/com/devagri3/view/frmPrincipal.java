/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.view;


import java.awt.event.KeyEvent;
import br.com.devagri3.utils.Data;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import br.com.devagri3.view.Estimativa_Ha;
import java.awt.BorderLayout;
       
/**
 *
 * @author Willyan
 */
public class frmPrincipal extends javax.swing.JFrame {
    
 
    
    Data data = new Data();
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH); //Inicia tela maximizada
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); 

        lbData.setText(data.dataAtual());
        //System.out.println(data.dataAtual());
        
        lbUsuario.setText(frmLogin.getLogado());
        System.out.println(frmLogin.getLogado());
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painel = new javax.swing.JPanel();
        lbData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        menu_config = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_calc_ppbc = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menu_sobre = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 20));

        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 880, 510));

        lbData.setText("Data:");
        getContentPane().add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 260, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/devagri3/assets/2background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 570));

        menu_config.setText("Configurações");

        jMenuItem2.setText("Parâmetros Evapotranspiração");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu_config.add(jMenuItem2);

        jMenu.add(menu_config);

        menu_calc_ppbc.setText("Calcular");

        jMenuItem3.setText("Potencial de Produção");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_calc_ppbc.add(jMenuItem3);

        jMenuItem4.setText("Estimativa de Produção");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_calc_ppbc.add(jMenuItem4);

        jMenuItem5.setText("Área Plantada (Imagem Satélite)");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_calc_ppbc.add(jMenuItem5);

        jMenuItem6.setText("Estimativa Total de Produção");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu_calc_ppbc.add(jMenuItem6);

        jMenu.add(menu_calc_ppbc);

        menu_sobre.setText("Sobre");

        jMenuItem1.setText("Versão");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_sobre.add(jMenuItem1);

        jMenu.add(menu_sobre);

        setJMenuBar(jMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      new Sobre().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Evapotranspiracao evp = new Evapotranspiracao();
        evp.setSize(700,400);
        evp.setLocation(1,1);
        painel.removeAll();
        painel.add(evp,BorderLayout.CENTER);
        painel.revalidate();
        painel.repaint();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            painel.removeAll();
            painel.repaint();
        }      
    }//GEN-LAST:event_formKeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Potencial_de_producao est = new Potencial_de_producao();
        est.setSize(880,530);
        est.setLocation(0,0);
        painel.removeAll();
        painel.add(est,BorderLayout.CENTER);
        painel.revalidate();
        painel.repaint();         
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Estimativa_Ha est = new Estimativa_Ha();
        est.setSize(710,432);
        est.setLocation(5,5);
        painel.removeAll();
        painel.add(est,BorderLayout.CENTER);
        painel.revalidate();
        painel.repaint();      
      
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new abrirImagem().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new Total().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new frmPrincipal().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JMenu menu_calc_ppbc;
    private javax.swing.JMenu menu_config;
    private javax.swing.JMenu menu_sobre;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables

  
}
