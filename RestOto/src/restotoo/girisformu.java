/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restotoo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class girisformu extends javax.swing.JFrame {
String kullad = "root";
    String parola = "";
    String db_name = "restoto";
    String host = "localhost"; 
    int port = 3306;
    Connection con = null;
    Statement statement = null;
    ResultSet rs = null;  
    DefaultTableModel model; // burada model oluşturdum
    public girisformu () {
        initComponents();
        Baglanti();
    }
    
    
     //baglanti metodu
public void Baglanti() {
    String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name + "?characterEncoding=utf8";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, kullad, parola);
        System.out.println("Bağlantı Başarılı");
    } catch (ClassNotFoundException ex) {
        System.out.println("Driver Bulunamadı");
        ex.printStackTrace();
    } catch (SQLException ex) {
        System.out.println("Bağlantı Hatası");
        ex.printStackTrace();
    }
}

public void BaglantiKapat() {
    try {
        if (con != null && !con.isClosed()) {
            con.close();
            System.out.println("Bağlantı Kapatıldı");
        }
    } catch (SQLException ex) {
        System.out.println("Bağlantı Kapatma Hatası");
        ex.printStackTrace();
    }
}



private boolean kontrolEtKullanici(String kullaniciadi, String parola) {
    try {
        String query = "SELECT * FROM giris WHERE kullaniciadi = ? AND parola = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, kullaniciadi);
        statement.setString(2, parola);
        ResultSet rs = statement.executeQuery();
        

        return rs.next(); // Eğer sonuç kümesi boş değilse (kullanıcı adı ve şifre doğru ise) true döner
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;   
    }   
}


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisgirisbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        giriskullaniciaditbox = new javax.swing.JTextField();
        girisparolatbox = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        girisgirisbtn.setBackground(new java.awt.Color(255, 255, 153));
        girisgirisbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/icons8-login-64.png"))); // NOI18N
        girisgirisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisgirisbtnActionPerformed(evt);
            }
        });
        getContentPane().add(girisgirisbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("KULLANICI ADI:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("PAROLA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 82, -1));

        giriskullaniciaditbox.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(giriskullaniciaditbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 100, -1));

        girisparolatbox.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(girisparolatbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, -1));

        jCheckBox1.setBackground(new java.awt.Color(153, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jCheckBox1.setText("Şifreyi Göster");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/foto1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void girisgirisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisgirisbtnActionPerformed
        String kullaniciadi = giriskullaniciaditbox.getText();
    String parola = new String(girisparolatbox.getPassword());
    

    // Veritabanında kullanıcıları kontrol et
    boolean dogruBilgiler = kontrolEtKullanici(kullaniciadi, parola);

    if (dogruBilgiler) {
        // Kullanıcı adı ve şifre doğru ise AnaForm'u aç
        anaform anaform = new anaform();
        anaform.setVisible(true);
        dispose(); // Kullanıcı girişi formunu kapat
        String mesaj = giriskullaniciaditbox.getText() + " Hesabıyla Sisteme Giriş Yapıldı."; // Mesajı oluştur
        JOptionPane.showMessageDialog(null, mesaj, "HOŞGELDİNİZ", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Geçersiz kullanıcı adı veya şifre!", "Hata", JOptionPane.ERROR_MESSAGE);
    } giriskullaniciaditbox.setText("");
      girisparolatbox.setText("");
    }//GEN-LAST:event_girisgirisbtnActionPerformed

    
    
    
//checkbox parola gösterme
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if (jCheckBox1.isSelected()) {
       girisparolatbox.setEchoChar ((char) 0);
}
else {
       girisparolatbox.setEchoChar('*' ) ;
}
    }//GEN-LAST:event_jCheckBox1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(girisformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisformu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisgirisbtn;
    private javax.swing.JTextField giriskullaniciaditbox;
    private javax.swing.JPasswordField girisparolatbox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
