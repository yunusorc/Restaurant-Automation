/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restotoo;

import javax.swing.JOptionPane;


public class anaform extends javax.swing.JFrame {

    
    public anaform() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anaformurunlerbtn = new javax.swing.JButton();
        anaformpersonelbtn = new javax.swing.JButton();
        anaformcikisbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        anaformkullanicibtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anaformurunlerbtn.setBackground(new java.awt.Color(204, 204, 204));
        anaformurunlerbtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        anaformurunlerbtn.setText("ÜRÜNLER");
        anaformurunlerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaformurunlerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(anaformurunlerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 100));

        anaformpersonelbtn.setBackground(new java.awt.Color(204, 204, 204));
        anaformpersonelbtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        anaformpersonelbtn.setText("PERSONEL");
        anaformpersonelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaformpersonelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(anaformpersonelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 158, -1, 100));

        anaformcikisbtn.setBackground(new java.awt.Color(204, 204, 204));
        anaformcikisbtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        anaformcikisbtn.setText("ÇIKIŞ");
        anaformcikisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaformcikisbtnActionPerformed(evt);
            }
        });
        getContentPane().add(anaformcikisbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 130, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rest");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, -1, 104));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Oto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 48, 204, 76));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RESTORAN OTOMASYONU");
        jLabel3.setMaximumSize(new java.awt.Dimension(152, 9));
        jLabel3.setPreferredSize(new java.awt.Dimension(152, 10));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 131, 188, -1));

        anaformkullanicibtn.setBackground(new java.awt.Color(204, 204, 204));
        anaformkullanicibtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        anaformkullanicibtn.setText("KULLANICI");
        anaformkullanicibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaformkullanicibtnActionPerformed(evt);
            }
        });
        getContentPane().add(anaformkullanicibtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/arabic-round-ornate-geometric-pattern-ornament_36073-87.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 530, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anaformurunlerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaformurunlerbtnActionPerformed
        Urunler urunlerForm = new Urunler();
       urunlerForm.setVisible(true);
       dispose();
    }//GEN-LAST:event_anaformurunlerbtnActionPerformed

    private void anaformpersonelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaformpersonelbtnActionPerformed
       Personel personelForm = new Personel();
     personelForm.setVisible(true); 
     dispose();
    }//GEN-LAST:event_anaformpersonelbtnActionPerformed

    private void anaformcikisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaformcikisbtnActionPerformed
       int cevap = JOptionPane.showConfirmDialog(this, "Çıkmak istediğinize emin misiniz?", "Uyarı", JOptionPane.YES_NO_OPTION);
    if (cevap == JOptionPane.YES_OPTION) {
        System.exit(0); // Uygulamayı kapat
    }
    }//GEN-LAST:event_anaformcikisbtnActionPerformed

    private void anaformkullanicibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaformkullanicibtnActionPerformed
 kullanici kullaniciForm = new kullanici();
     kullaniciForm.setVisible(true); 
     dispose();
    }//GEN-LAST:event_anaformkullanicibtnActionPerformed

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
            java.util.logging.Logger.getLogger(anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anaform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anaform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anaformcikisbtn;
    private javax.swing.JButton anaformkullanicibtn;
    private javax.swing.JButton anaformpersonelbtn;
    private javax.swing.JButton anaformurunlerbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
