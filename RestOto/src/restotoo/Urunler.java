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
import java.sql.PreparedStatement;



public class Urunler extends javax.swing.JFrame {

String kullad = "root";
    String parola = "";
    String db_name = "restoto";
    String host = "localhost"; 
    int port = 3306;
    Connection con = null;
    Statement statement = null;
    ResultSet rs = null;  
    DefaultTableModel model; // burada model oluşturdum
    public Urunler() {
        initComponents();
        Baglanti();
    }
    
    //baglanti metodu
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

        urunidlbl = new javax.swing.JLabel();
        urunadilbl = new javax.swing.JLabel();
        urunmiktarilbl = new javax.swing.JLabel();
        urunfiyatilbl = new javax.swing.JLabel();
        urunkategorisilbl = new javax.swing.JLabel();
        urunidtbox = new javax.swing.JTextField();
        urunaditbox = new javax.swing.JTextField();
        urunmiktaritbox = new javax.swing.JTextField();
        urunfiyatitbox = new javax.swing.JTextField();
        urunkategorisitbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        urunlerlistelebtn = new javax.swing.JButton();
        urunleranasayfabtn = new javax.swing.JButton();
        urungüncellebtn = new javax.swing.JButton();
        urunlerkayıteklebtn = new javax.swing.JButton();
        urunlersilbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        urunaciklamasitbox = new javax.swing.JTextField();
        urungidertbox = new javax.swing.JTextField();
        urungiderbtn = new javax.swing.JButton();
        urunaraptb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        urunalıistarihitbox = new javax.swing.JTextField();
        uruntotalmiktarbtn = new javax.swing.JButton();
        uruntotalmiktartbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        urunidlbl.setBackground(new java.awt.Color(255, 255, 0));
        urunidlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunidlbl.setText("Ürün İd:");
        getContentPane().add(urunidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 147, -1));
        urunidlbl.getAccessibleContext().setAccessibleName("urunidlbl");

        urunadilbl.setBackground(new java.awt.Color(255, 255, 0));
        urunadilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunadilbl.setText("Ürün Adı:");
        getContentPane().add(urunadilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 147, -1));
        urunadilbl.getAccessibleContext().setAccessibleName("urunadilbl");

        urunmiktarilbl.setBackground(new java.awt.Color(255, 255, 0));
        urunmiktarilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunmiktarilbl.setText("Ürün Miktarı:");
        getContentPane().add(urunmiktarilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, 147, -1));
        urunmiktarilbl.getAccessibleContext().setAccessibleName("urunmiktarilbl");

        urunfiyatilbl.setBackground(new java.awt.Color(255, 255, 0));
        urunfiyatilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunfiyatilbl.setText("Ürün Fiyatı:");
        getContentPane().add(urunfiyatilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 139, 147, -1));
        urunfiyatilbl.getAccessibleContext().setAccessibleName("urunfiyatilbl");

        urunkategorisilbl.setBackground(new java.awt.Color(255, 255, 0));
        urunkategorisilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunkategorisilbl.setText("Ürün Kategorisi:");
        getContentPane().add(urunkategorisilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 173, 147, -1));
        urunkategorisilbl.getAccessibleContext().setAccessibleName("urunkategorisilbl");

        urunidtbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunidtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 15, 150, -1));
        urunidtbox.getAccessibleContext().setAccessibleName("urunidtbox");

        urunaditbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunaditbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 49, 150, -1));
        urunaditbox.getAccessibleContext().setAccessibleName("urunaditbox");

        urunmiktaritbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunmiktaritbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 95, 150, -1));
        urunmiktaritbox.getAccessibleContext().setAccessibleName("urunmiktaritbox");

        urunfiyatitbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunfiyatitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 129, 150, -1));
        urunfiyatitbox.getAccessibleContext().setAccessibleName("urunfiyatitbox");

        urunkategorisitbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunkategorisitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 169, 150, -1));
        urunkategorisitbox.getAccessibleContext().setAccessibleName("urungategorisitbox");

        tablo.setBackground(new java.awt.Color(255, 204, 204));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün İd", "Ürün Adı", "Ürün Miktarı", "Ürün Fiyatı", "Ürün Kategorisi", "Ürün Açıklaması", "Ürün Alış Tarihi"
            }
        ));
        jScrollPane1.setViewportView(tablo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 660, 262));

        urunlerlistelebtn.setBackground(new java.awt.Color(255, 255, 0));
        urunlerlistelebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunlerlistelebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/list.png"))); // NOI18N
        urunlerlistelebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunlerlistelebtnActionPerformed(evt);
            }
        });
        getContentPane().add(urunlerlistelebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 88, -1));
        urunlerlistelebtn.getAccessibleContext().setAccessibleName("urunsiralabtn");

        urunleranasayfabtn.setBackground(new java.awt.Color(153, 255, 255));
        urunleranasayfabtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunleranasayfabtn.setText("ANA SAYFA");
        urunleranasayfabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunleranasayfabtnActionPerformed(evt);
            }
        });
        getContentPane().add(urunleranasayfabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 41));

        urungüncellebtn.setBackground(new java.awt.Color(255, 255, 0));
        urungüncellebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urungüncellebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/update.png"))); // NOI18N
        urungüncellebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urungüncellebtnActionPerformed(evt);
            }
        });
        getContentPane().add(urungüncellebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 92, -1));

        urunlerkayıteklebtn.setBackground(new java.awt.Color(255, 255, 0));
        urunlerkayıteklebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunlerkayıteklebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/save.png"))); // NOI18N
        urunlerkayıteklebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunlerkayıteklebtnActionPerformed(evt);
            }
        });
        getContentPane().add(urunlerkayıteklebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 92, -1));

        urunlersilbtn.setBackground(new java.awt.Color(255, 255, 0));
        urunlersilbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunlersilbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/delete.png"))); // NOI18N
        urunlersilbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunlersilbtnActionPerformed(evt);
            }
        });
        getContentPane().add(urunlersilbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 90, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ürün Açıklaması:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, 122, -1));

        urunaciklamasitbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunaciklamasitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 209, 150, -1));

        urungidertbox.setBackground(new java.awt.Color(255, 204, 204));
        urungidertbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urungidertboxActionPerformed(evt);
            }
        });
        getContentPane().add(urungidertbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 110, -1));

        urungiderbtn.setBackground(new java.awt.Color(255, 255, 0));
        urungiderbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urungiderbtn.setText("ÜRÜN GİDER HESAPLA");
        urungiderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urungiderbtnActionPerformed(evt);
            }
        });
        getContentPane().add(urungiderbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 170, -1));

        urunaraptb.setBackground(new java.awt.Color(255, 255, 0));
        urunaraptb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        urunaraptb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/sourche.png"))); // NOI18N
        urunaraptb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunaraptbActionPerformed(evt);
            }
        });
        getContentPane().add(urunaraptb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Ürün Alış Tarihi:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        urunalıistarihitbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(urunalıistarihitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, -1));

        uruntotalmiktarbtn.setBackground(new java.awt.Color(255, 255, 0));
        uruntotalmiktarbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uruntotalmiktarbtn.setText("TOTAL MİKTAR HESAPLA");
        uruntotalmiktarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uruntotalmiktarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(uruntotalmiktarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        uruntotalmiktartbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(uruntotalmiktartbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 90, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //LİSTELEME METODU
    private void urunlerlistelebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunlerlistelebtnActionPerformed
DefaultTableModel model = (DefaultTableModel) tablo.getModel();
model.setRowCount(0);

try {
    statement = con.createStatement();
    rs = statement.executeQuery("SELECT * FROM urunler");
    while (rs.next()) {
        int urunid = rs.getInt("urunid");
        String urunadi = rs.getString("urunadi");
        BigDecimal urunmiktari = rs.getBigDecimal("urunmiktari");
        BigDecimal urunfiyati = rs.getBigDecimal("urunfiyati");
        String urunkategorisi = rs.getString("urunkategorisi");
        String urunaciklama = rs.getString("urunaciklama");
        String urunalistarihi = rs.getString("urunalistarihi");
        model.addRow(new Object[]{urunid, urunadi, urunmiktari,urunfiyati, urunkategorisi, urunaciklama, urunalistarihi});
    }
    tablo.setModel(model);
    
} catch (SQLException ex) {
    Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
}
  urunidtbox.setText("");
        urunaditbox.setText("");
        urunmiktaritbox.setText("");
        urunfiyatitbox.setText("");
        urunkategorisitbox.setText("");
        urungidertbox.setText("");
        urunaciklamasitbox.setText("");
       
    }//GEN-LAST:event_urunlerlistelebtnActionPerformed

    
    
    //ÜRÜN GÜNCELLEME
    private void urungüncellebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urungüncellebtnActionPerformed
    int urunID = Integer.parseInt(urunidtbox.getText()); // Ürün ID'sini al

try {
    statement = con.createStatement();
    StringBuilder queryBuilder = new StringBuilder("UPDATE urunler SET");

    if (!urunaditbox.getText().isEmpty()) {
        String yeniAd = urunaditbox.getText(); // Yeni ürün adını al
        queryBuilder.append(" urunadi = '").append(yeniAd).append("',");
    }

    if (!urunmiktaritbox.getText().isEmpty()) {
        BigDecimal yeniMiktar = new BigDecimal(urunmiktaritbox.getText()); // Yeni ürün miktarını al
        queryBuilder.append(" urunmiktari = ").append(yeniMiktar).append(",");
    }

    if (!urunfiyatitbox.getText().isEmpty()) {
        BigDecimal yeniFiyat = new BigDecimal(urunfiyatitbox.getText()); // Yeni ürün fiyatını al
        queryBuilder.append(" urunfiyati = ").append(yeniFiyat).append(",");
    }

    if (!urunkategorisitbox.getText().isEmpty()) {
        String yeniKategori = urunkategorisitbox.getText(); // Yeni ürün kategorisini al
        queryBuilder.append(" urunkategorisi = '").append(yeniKategori).append("',");
    }
    
    if (!urunaciklamasitbox.getText().isEmpty()) {
        String yeniAciklama = urunaciklamasitbox.getText(); // Yeni ürün açıklamasını al
        queryBuilder.append(" urunaciklama = '").append(yeniAciklama).append("',");
    } 
    
    if (!urunalıistarihitbox.getText().isEmpty()) {
        String yeniAlisTarihi = urunalıistarihitbox.getText(); // Yeni ürün alış tarihini al
        queryBuilder.append(" urunalistarihi = '").append(yeniAlisTarihi).append("',");
    }

    // Query'in sonundaki gereksiz virgülü kaldırma
    queryBuilder.deleteCharAt(queryBuilder.length() - 1);

    String query = queryBuilder.append(" WHERE urunid = ").append(urunID).toString();
    int rowCount = statement.executeUpdate(query);

    if (rowCount > 0) {
        JOptionPane.showMessageDialog(null, "Ürün başarıyla güncellendi.");
        
        // Verileri güncelledikten sonra metin alanlarını temizleme
        urunidtbox.setText("");
        urunaditbox.setText("");
        urunmiktaritbox.setText("");
        urunfiyatitbox.setText("");
        urunkategorisitbox.setText("");
        urunalıistarihitbox.setText("");
    } else {
        JOptionPane.showMessageDialog(null, "Ürün güncellenirken bir hata oluştu.");
    }
} catch (SQLException ex) {
    Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
}
urunlerlistelebtn.doClick();

   
    }//GEN-LAST:event_urungüncellebtnActionPerformed

    
    
    //ÜRÜN KAYDETME
    private void urunlerkayıteklebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunlerkayıteklebtnActionPerformed
      int urunID = Integer.parseInt(urunidtbox.getText());
String yeniAd = urunaditbox.getText();
BigDecimal yeniMiktar = new BigDecimal(urunmiktaritbox.getText());
BigDecimal yeniFiyat = new BigDecimal(urunfiyatitbox.getText());
String yeniKategori = urunkategorisitbox.getText();
String yeniAciklama = urunaciklamasitbox.getText();
String yeniAlistarihi = urunalıistarihitbox.getText();

if (yeniAciklama.isEmpty()) {
    yeniAciklama = ""; // Varsayılan olarak boş bir değer atadık
}

try {
    statement = con.createStatement();
    String query = "SELECT * FROM urunler WHERE urunid = " + urunID;
    ResultSet resultSet = statement.executeQuery(query);

    if (resultSet.next()) {
        JOptionPane.showMessageDialog(this, "Bu ürün ID zaten kayıtlıdır.", "Hata", JOptionPane.ERROR_MESSAGE);
    } else {
String insertQuery = "INSERT INTO urunler (urunid, urunadi, urunmiktari, urunfiyati, urunkategorisi, urunaciklama, urunalistarihi) "
        + "             VALUES (" + urunID + ", '" + yeniAd + "', " + yeniMiktar + ", " + yeniFiyat + ", '" + yeniKategori + "', '" + yeniAciklama + "', '" + yeniAlistarihi + "')";
        int rowCount = statement.executeUpdate(insertQuery);

        if (rowCount > 0) {
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklendi.");

            DefaultTableModel model = (DefaultTableModel) tablo.getModel();
            model.addRow(new Object[]{urunID, yeniAd, yeniMiktar, yeniFiyat, yeniKategori, yeniAciklama, yeniAlistarihi});

            urunidtbox.setText("");
            urunaditbox.setText("");
            urunmiktaritbox.setText("");
            urunfiyatitbox.setText("");
            urunkategorisitbox.setText("");
            urunaciklamasitbox.setText("");
            urunalıistarihitbox.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Kayıt eklenirken bir hata oluştu.");
        }
    }
    resultSet.close();
} catch (SQLException ex) {
    Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
}
urunlerlistelebtn.doClick();
    }//GEN-LAST:event_urunlerkayıteklebtnActionPerformed

    
    //ÜRÜN LİSTELE
    private void urunlersilbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunlersilbtnActionPerformed
        int urunID = Integer.parseInt(urunidtbox.getText()); // Ürün ID'sini al

    try {
        statement = con.createStatement();
        String query = "SELECT * FROM urunler WHERE urunid = " + urunID;
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Ürünü silmek istediğinize emin misiniz?", "Silme Onayı", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String deleteQuery = "DELETE FROM urunler WHERE urunid = " + urunID;
                int rowCount = statement.executeUpdate(deleteQuery);

                if (rowCount > 0) {
                    JOptionPane.showMessageDialog(null, "Ürün başarıyla silindi.");

                    DefaultTableModel model = (DefaultTableModel) tablo.getModel();
                    int selectedRow = tablo.getSelectedRow();
                    if (selectedRow != -1) {
                        model.removeRow(selectedRow);
                    }

                    urunidtbox.setText("");
                    urunaditbox.setText("");
                    urunmiktaritbox.setText("");
                    urunfiyatitbox.setText("");
                    urunkategorisitbox.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ürün silinirken bir hata oluştu.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bu ürün ID'sine sahip bir ürün bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
        }

        resultSet.close();
    } catch (SQLException ex) {
        Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
    }
urunlerlistelebtn.doClick();
    }//GEN-LAST:event_urunlersilbtnActionPerformed

    
    //ANA SAYFA YÖNLENDİRME
    private void urunleranasayfabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunleranasayfabtnActionPerformed
           anaform anaform = new anaform();
            anaform.setVisible(true);
            dispose();
    }//GEN-LAST:event_urunleranasayfabtnActionPerformed

    
    
    
    
    private void urungiderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urungiderbtnActionPerformed
    // Veritabanına bağlan
String url = "jdbc:mysql://localhost:3306/restoto"; // Veritabanı URL'si
String kullaniciAdi = "root";
String sifre = "";

try {
    // Bağlantıyı oluştur
    Connection con = DriverManager.getConnection(url, kullaniciAdi, sifre);

    // Ürün adını al
    String urunadi = urunaditbox.getText();

    // Veritabanı sorgusu
    String query = "SELECT urunid, urunadi, urunmiktari, urunfiyati, urunkategorisi, urunaciklama, urunalistarihi FROM urunler WHERE urunadi = '" + urunadi + "'";

    // Sorguyu çalıştır ve sonuçları al
    Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery(query);

    BigDecimal toplamUrunGideri = BigDecimal.ZERO; // Toplam ürün giderini saklamak için değişken

    DefaultTableModel model = (DefaultTableModel) tablo.getModel();
    model.setRowCount(0); // Tabloyu temizle

    while (resultSet.next()) {
        // Sonuçları al
        String urunID = resultSet.getString("urunid");
        String urunAdi = resultSet.getString("urunadi");
        BigDecimal urunMiktari = resultSet.getBigDecimal("urunmiktari");
        BigDecimal urunFiyati = resultSet.getBigDecimal("urunfiyati");
        String urunKategorisi = resultSet.getString("urunkategorisi");
        String urunAciklama = resultSet.getString("urunaciklama");
        String urunAlistarihi = resultSet.getString("urunalistarihi");
        // Çarpma işlemi
        BigDecimal urunGideri = urunMiktari.multiply(urunFiyati);

        // Toplam ürün giderine ekle
        toplamUrunGideri = toplamUrunGideri.add(urunGideri);

        // Tabloya verileri ekle
        model.addRow(new Object[]{urunID, urunAdi, urunMiktari, urunFiyati, urunKategorisi, urunAciklama, urunAlistarihi});
    }

    if (!toplamUrunGideri.equals(BigDecimal.ZERO)) {
        // Toplam ürün giderini göster
        urungidertbox.setText(toplamUrunGideri.toString());
    } else {
        // Ürün bulunamadı
        JOptionPane.showMessageDialog(this, "Ürün bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
    }

    // Kaynakları kapat
    resultSet.close();
    statement.close();
    con.close();
} catch (SQLException ex) {
    // Hata durumunda
    ex.printStackTrace();
    JOptionPane.showMessageDialog(this, "Veritabanına bağlanırken bir hata oluştu.", "Hata", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_urungiderbtnActionPerformed

    
    
    
    private void urunaraptbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunaraptbActionPerformed
      try {
    statement = con.createStatement();
    String urunadi = urunaditbox.getText(); 
    String urunkategorisi = urunkategorisitbox.getText(); 

    String query = "SELECT * FROM urunler WHERE urunadi = '" + urunadi + "' OR urunkategorisi = '" + urunkategorisi + "'";
    rs = statement.executeQuery(query);

    model = (DefaultTableModel) tablo.getModel();
    model.setRowCount(0); // Tabloyu temizle

    while (rs.next()) {
        String urunid  = rs.getString("urunid");
        String ad  = rs.getString("urunadi");
        String urunmiktari = rs.getString("urunmiktari");
        String 	urunfiyati = rs.getString("urunfiyati");
        String kategori = rs.getString("urunkategorisi");
        String urunaciklama = rs.getString("urunaciklama");
        String urunalistarihi = rs.getString("urunalistarihi");

        model.addRow(new Object[]{urunid, ad , urunmiktari, urunfiyati, kategori, urunaciklama, urunalistarihi});
    }

    tablo.setModel(model);
} catch (SQLException ex) {
    ex.printStackTrace();
}
    }//GEN-LAST:event_urunaraptbActionPerformed

    
    
    private void urungidertboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urungidertboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urungidertboxActionPerformed

    
    
    
    
    private void uruntotalmiktarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uruntotalmiktarbtnActionPerformed
 String url = "jdbc:mysql://localhost:3306/restoto"; // Veritabanı URL'si
String kullaniciAdi = "root";
String sifre = "";

try {
    // Bağlantıyı oluştur
    Connection con = DriverManager.getConnection(url, kullaniciAdi, sifre);
    Statement stmt = con.createStatement();

    // urunaditbox metin kutusundan veriyi al
    String urunadi = urunaditbox.getText();

    // SQL sorgusunu oluştur
    String sql = "SELECT SUM(urunmiktari) FROM urunler WHERE urunadi='" + urunadi + "'";

    // Sorguyu çalıştır ve sonucu al
    ResultSet rs = stmt.executeQuery(sql);
    if (rs.next()) {
        int totalMiktar = rs.getInt(1);
        // Sonucu uruntotalmiktartbox metin kutusuna yazdır
        uruntotalmiktartbox.setText(String.valueOf(totalMiktar));
    }

    String query = "SELECT * FROM urunler WHERE urunadi = '" + urunadi + "'";
    rs = stmt.executeQuery(query);

    DefaultTableModel model = (DefaultTableModel) tablo.getModel();
    model.setRowCount(0); // Tabloyu temizle

    while (rs.next()) {
        String urunid  = rs.getString("urunid");
        String ad  = rs.getString("urunadi");
        String urunmiktari = rs.getString("urunmiktari");
        String urunfiyati = rs.getString("urunfiyati");
        String kategori = rs.getString("urunkategorisi");
        String urunaciklama = rs.getString("urunaciklama");
        String urunalistarihi = rs.getString("urunalistarihi");

        model.addRow(new Object[]{urunid, ad , urunmiktari, urunfiyati, kategori, urunaciklama, urunalistarihi});
    }
    tablo.setModel(model);
    con.close();
} catch (SQLException e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_uruntotalmiktarbtnActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Urunler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Urunler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo;
    private javax.swing.JTextField urunaciklamasitbox;
    private javax.swing.JLabel urunadilbl;
    private javax.swing.JTextField urunaditbox;
    private javax.swing.JTextField urunalıistarihitbox;
    private javax.swing.JButton urunaraptb;
    private javax.swing.JLabel urunfiyatilbl;
    private javax.swing.JTextField urunfiyatitbox;
    private javax.swing.JButton urungiderbtn;
    private javax.swing.JTextField urungidertbox;
    private javax.swing.JButton urungüncellebtn;
    private javax.swing.JLabel urunidlbl;
    private javax.swing.JTextField urunidtbox;
    private javax.swing.JLabel urunkategorisilbl;
    private javax.swing.JTextField urunkategorisitbox;
    private javax.swing.JButton urunleranasayfabtn;
    private javax.swing.JButton urunlerkayıteklebtn;
    private javax.swing.JButton urunlerlistelebtn;
    private javax.swing.JButton urunlersilbtn;
    private javax.swing.JLabel urunmiktarilbl;
    private javax.swing.JTextField urunmiktaritbox;
    private javax.swing.JButton uruntotalmiktarbtn;
    private javax.swing.JTextField uruntotalmiktartbox;
    // End of variables declaration//GEN-END:variables

    private static class PreparedStatement {

        public PreparedStatement() {
        }
    }
}
