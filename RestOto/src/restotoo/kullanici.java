/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restotoo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class kullanici extends javax.swing.JFrame {

  String kullad = "root";
    String parola = "";
    String db_name = "restoto";
    String host = "localhost"; 
    int port = 3306;
    Connection con = null;
    Statement statement = null;
    ResultSet rs = null;  
    DefaultTableModel model; // burada model oluşturdum  
    public kullanici() {
        initComponents();
        Baglanti();
    }
public void Baglanti(){
    String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name + "?characterEncoding=utf8";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, kullad, parola);
        System.out.println("Bağlantı Başarılı");
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver Bulunamadı");
    } catch (SQLException ex) {
        System.out.println("Bağlantı Hatası");
    }
}

public void BaglantiKapat(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        kullanicikaydetbtn = new javax.swing.JButton();
        kullanicisilbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullaniciaditbox = new javax.swing.JTextField();
        parolatbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo1 = new javax.swing.JTable();
        kullanicianasayfabtn = new javax.swing.JButton();
        kullanicilistelebtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullanicikaydetbtn.setBackground(new java.awt.Color(255, 255, 0));
        kullanicikaydetbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kullanicikaydetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/save.png"))); // NOI18N
        kullanicikaydetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicikaydetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(kullanicikaydetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, -1));

        kullanicisilbtn.setBackground(new java.awt.Color(255, 255, 0));
        kullanicisilbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kullanicisilbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/delete.png"))); // NOI18N
        kullanicisilbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicisilbtnActionPerformed(evt);
            }
        });
        getContentPane().add(kullanicisilbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 105, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Parola:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 77, -1));

        kullaniciaditbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(kullaniciaditbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 107, -1));

        parolatbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(parolatbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 107, -1));

        tablo1.setBackground(new java.awt.Color(255, 204, 204));
        tablo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kullanıcı İd", "Kullanıcı Adı", "Parola"
            }
        ));
        jScrollPane1.setViewportView(tablo1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 320, 170));

        kullanicianasayfabtn.setBackground(new java.awt.Color(153, 255, 255));
        kullanicianasayfabtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kullanicianasayfabtn.setText("ANA SAYFA");
        kullanicianasayfabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicianasayfabtnActionPerformed(evt);
            }
        });
        getContentPane().add(kullanicianasayfabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 100, -1));

        kullanicilistelebtn.setBackground(new java.awt.Color(255, 255, 0));
        kullanicilistelebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kullanicilistelebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/list.png"))); // NOI18N
        kullanicilistelebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicilistelebtnActionPerformed(evt);
            }
        });
        getContentPane().add(kullanicilistelebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 102, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Kuulanıcı İd:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kullanicianasayfabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicianasayfabtnActionPerformed
        anaform anaform = new anaform();
anaform.setVisible(true);
dispose();
    }//GEN-LAST:event_kullanicianasayfabtnActionPerformed

    private void kullanicilistelebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicilistelebtnActionPerformed
  DefaultTableModel model = (DefaultTableModel) tablo1.getModel();
    model.setRowCount(0);

    try (Statement statement = con.createStatement()) {
        ResultSet rs = statement.executeQuery("SELECT * FROM giris");
        while (rs.next()) {
            int kullaniciid = rs.getInt("kullaniciid");
            String kullaniciadi = rs.getString("kullaniciadi");
            String parola = rs.getString("parola");

            model.addRow(new Object[]{kullaniciid, kullaniciadi, parola});
        }
    } catch (SQLException ex) {
        Logger.getLogger(kullanici.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    tablo1.setModel(model);
    jTextField3.setText("");
              kullaniciaditbox.setText("");
              parolatbox.setText("");
    }//GEN-LAST:event_kullanicilistelebtnActionPerformed

    
    
    private void kullanicikaydetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicikaydetbtnActionPerformed
        try {
        int kullaniciid = Integer.parseInt(jTextField3.getText());
        String kullaniciadi = kullaniciaditbox.getText();
        String parola = parolatbox.getText();

        statement = con.createStatement();
        String query = "INSERT INTO giris (kullaniciid, kullaniciadi, parola) VALUES ('" + kullaniciid + "', '" + kullaniciadi + "', '" + parola + "')";
        int rowCount = statement.executeUpdate(query);

        if (rowCount > 0) {
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklendi.");
            // Text alanlarını temizlemek için
            kullaniciaditbox.setText("");
            parolatbox.setText("");
            jTextField3.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Kayıt eklenirken bir hata oluştu.");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Kullanıcı ID'si tamsayı olmalıdır.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Bir veritabanı hatası oluştu: " + ex.toString());
    } 
        kullanicilistelebtn.doClick();
    }//GEN-LAST:event_kullanicikaydetbtnActionPerformed

    private void kullanicisilbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicisilbtnActionPerformed
        int kullaniciid = Integer.parseInt(jTextField3.getText()); // kullanıcı ID'sini al
          
    try {
        statement = con.createStatement();
        String query = "SELECT * FROM giris WHERE kullaniciid = " + kullaniciid;
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Kullanıcı'yı silmek istediğinize emin misiniz?", "Silme Onayı", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String deleteQuery = "DELETE FROM giris WHERE kullaniciid = " + kullaniciid;
                int rowCount = statement.executeUpdate(deleteQuery);

                if (rowCount > 0) {
                    JOptionPane.showMessageDialog(null, "Kullanıcı başarıyla silindi.");

                    DefaultTableModel model = (DefaultTableModel) tablo1.getModel();
                    int selectedRow = tablo1.getSelectedRow();
                    if (selectedRow != -1) {
                        model.removeRow(selectedRow);
                    }

                    jTextField3.setText("");
                    kullaniciaditbox.setText("");
                    parolatbox.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Kullanıcı silinirken bir hata oluştu.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bu Kullanıcı ID'sine sahip bir Kullanıcı bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
        }

        resultSet.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Bir veritabanı hatası oluştu: " + ex.toString());
    }
    
    kullanicilistelebtn.doClick();
    }//GEN-LAST:event_kullanicisilbtnActionPerformed

    /**   VALUES ('" + kullaniciad + "', '" + parola + "')";
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
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField kullaniciaditbox;
    private javax.swing.JButton kullanicianasayfabtn;
    private javax.swing.JButton kullanicikaydetbtn;
    private javax.swing.JButton kullanicilistelebtn;
    private javax.swing.JButton kullanicisilbtn;
    private javax.swing.JTextField parolatbox;
    private javax.swing.JTable tablo1;
    // End of variables declaration//GEN-END:variables
}
