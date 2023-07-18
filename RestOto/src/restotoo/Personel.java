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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.text.DateFormat;




public class Personel extends javax.swing.JFrame {

String kullad = "root";
    String parola = "";
    String db_name = "restoto";
    String host = "localhost"; 
    int port = 3306;
    Connection con = null;
    Statement statement = null;
    ResultSet rs = null;  
    DefaultTableModel model; // burada model oluşturdum
    public Personel () {
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

//HESAPLAMA İÇİN TARİH
private Date getGirisTarihiFromDatabase(int personelId) {
    Date girisTarihi = null;

    try {
        // Veritabanı bağlantısı için gerekli bilgiler
        String url = "jdbc:mysql://localhost:3306/restoto"; // Veritabanı URL'si
        String kullaniciAdi = "root";
        String sifre = "";

        // Veritabanı bağlantısı oluştur
        Connection connection = DriverManager.getConnection(url, kullaniciAdi, sifre);

        // Sorgu hazırlama
        String sorgu = "SELECT personelgiristarihi FROM personel WHERE personelid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sorgu);
        preparedStatement.setInt(1, personelId);

        // Sorguyu çalıştırma ve sonuçları alıp işleme
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            girisTarihi = resultSet.getDate("personelgiristarihi");
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return girisTarihi;
}



 // Zam oranını hesapla
private double calculateZamOrani(Date girisTarihi) {
   
    double zamOrani = 0;

    // Şu anki tarih
    Date simdikiTarih = new Date();

    // Çalışma yılını hesapla
    long calismaGunleri = (simdikiTarih.getTime() - girisTarihi.getTime()) / (1000 * 60 * 60 * 24);
    int calismaYili = (int) (calismaGunleri / 365);

    // Zam oranını belirle
    if (calismaYili >= 1 && calismaYili < 2) {
        zamOrani = 10;
    } else if (calismaYili >= 2 && calismaYili < 3) {
        zamOrani = 15;
    } else if (calismaYili >= 3 && calismaYili < 5) {
        zamOrani = 20;
    } else if (calismaYili >= 5 && calismaYili <= 10) {
        zamOrani = 25;
    } else if (calismaYili > 10) {
        zamOrani = 30;
    }
    return zamOrani;
}
 
 
 
 //ZAM ALACAKLAR METODU
 public void zamAlacakPersonelleriListele() {
    try {
        statement = con.createStatement();
        String query = "SELECT * FROM personel";
        ResultSet resultSet = statement.executeQuery(query);

        DefaultTableModel model = (DefaultTableModel) tablo.getModel();
        model.setRowCount(0); // Tabloyu temizle

        while (resultSet.next()) {
            int personelID = resultSet.getInt("personelid");
            String personelAdSoyad = resultSet.getString("personeladisoyadi");
            BigDecimal personelMaas = resultSet.getBigDecimal("personelmaasi");
            java.sql.Date girisTarihi = resultSet.getDate("personelgiristarihi");
            String personelpozisyonu = resultSet.getString("personelpozisyonu");

            // Giriş tarihini LocalDate formatına dönüştür
            LocalDate girisTarihiLD = girisTarihi.toLocalDate();

            // Şu anki tarih
            LocalDate simdikiTarih = LocalDate.now();

            // Zam yapılacak tarihi hesapla (giriş tarihinden 1 yıl sonrası)&
            LocalDate zamYapilacakTarih = girisTarihiLD.plusYears(1);

            // Zam yapılacak tarihe 30 gün veya daha az bir süre kaldıysa
            if (zamYapilacakTarih.minusDays(30).isBefore(simdikiTarih)) {
                // Personeli tabloya ekle
                model.addRow(new Object[]{personelID, personelAdSoyad, personelMaas, girisTarihi, personelpozisyonu });
            }
        }
        resultSet.close();
    } catch (SQLException ex) {
        Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personeladisoyadilbl = new javax.swing.JLabel();
        personellistelebtn = new javax.swing.JButton();
        personelmaasilbl = new javax.swing.JLabel();
        personelgiristarihilbl = new javax.swing.JLabel();
        personelpozisyonulbl = new javax.swing.JLabel();
        personelidtbox = new javax.swing.JTextField();
        personeladisoyaditbox = new javax.swing.JTextField();
        personelmaasitbox = new javax.swing.JTextField();
        personelgiristarihitbox = new javax.swing.JTextField();
        personelpozisyonutbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        personelidlbl = new javax.swing.JLabel();
        personelanasayfabtn = new javax.swing.JButton();
        personelkaydetbtn = new javax.swing.JButton();
        personelsilbtn = new javax.swing.JButton();
        personelguncellebtn = new javax.swing.JButton();
        personelzamalacaklarbtn = new javax.swing.JButton();
        personeltelefonutbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personelgidertbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personeladisoyadilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personeladisoyadilbl.setText("Personel Adı/Soyadı:");
        getContentPane().add(personeladisoyadilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 67, 184, -1));

        personellistelebtn.setBackground(new java.awt.Color(255, 255, 0));
        personellistelebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personellistelebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/list.png"))); // NOI18N
        personellistelebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personellistelebtnActionPerformed(evt);
            }
        });
        getContentPane().add(personellistelebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 92, -1));

        personelmaasilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelmaasilbl.setText("Personel Maaşı:");
        getContentPane().add(personelmaasilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 184, -1));

        personelgiristarihilbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelgiristarihilbl.setText("Personel Giriş Tarihi:");
        getContentPane().add(personelgiristarihilbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 184, -1));

        personelpozisyonulbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelpozisyonulbl.setText("Personel Pozisyonu:");
        getContentPane().add(personelpozisyonulbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 113, -1));

        personelidtbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personelidtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 15, 190, -1));

        personeladisoyaditbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personeladisoyaditbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 64, 190, -1));

        personelmaasitbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personelmaasitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 190, -1));

        personelgiristarihitbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personelgiristarihitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, -1));

        personelpozisyonutbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personelpozisyonutbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 190, -1));

        tablo.setBackground(new java.awt.Color(255, 204, 204));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Personel İd", "Personel Adı/Soyadı", "Personel Giriş Tarihi", "Personel Pozisyonu", "Personel Telefonu", "Personel Maaşı", "Zam Oranı", "Zamlı Maaş"
            }
        ));
        jScrollPane1.setViewportView(tablo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 930, 288));

        personelidlbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelidlbl.setText("Personel İd:");
        getContentPane().add(personelidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 184, -1));

        personelanasayfabtn.setBackground(new java.awt.Color(153, 255, 255));
        personelanasayfabtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelanasayfabtn.setText("ANA SAYFA");
        personelanasayfabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelanasayfabtnActionPerformed(evt);
            }
        });
        getContentPane().add(personelanasayfabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 104, 41));

        personelkaydetbtn.setBackground(new java.awt.Color(255, 255, 0));
        personelkaydetbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelkaydetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/save.png"))); // NOI18N
        personelkaydetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelkaydetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(personelkaydetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 92, -1));

        personelsilbtn.setBackground(new java.awt.Color(255, 255, 0));
        personelsilbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelsilbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/delete.png"))); // NOI18N
        personelsilbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelsilbtnActionPerformed(evt);
            }
        });
        getContentPane().add(personelsilbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 92, -1));

        personelguncellebtn.setBackground(new java.awt.Color(255, 255, 0));
        personelguncellebtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelguncellebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restotoo/update.png"))); // NOI18N
        personelguncellebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelguncellebtnActionPerformed(evt);
            }
        });
        getContentPane().add(personelguncellebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 92, -1));

        personelzamalacaklarbtn.setBackground(new java.awt.Color(255, 255, 0));
        personelzamalacaklarbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personelzamalacaklarbtn.setText("ZAM ALACAKLAR");
        personelzamalacaklarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelzamalacaklarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(personelzamalacaklarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 200, -1));

        personeltelefonutbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personeltelefonutbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Personel Telefonu:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 113, -1));

        personelgidertbox.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(personelgidertbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 190, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("PERSONEL GİDER HESAPLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //PERSONEL LİSTELEME METODU
    private void personellistelebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personellistelebtnActionPerformed

    // Veritabanına bağlan
    String url = "jdbc:mysql://localhost:3306/restoto"; // Veritabanı URL'si
    String kullaniciAdi = "root";
    String sifre = "";

    try (Connection baglanti = DriverManager.getConnection(url, kullaniciAdi, sifre)) {
        // SQL sorgusunu oluştur ve çalıştır
        String sql = "SELECT * FROM personel";
        try (PreparedStatement statement = baglanti.prepareStatement(sql)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Personel ID");
                model.addColumn("Ad Soyad");
                model.addColumn("Giriş Tarihi");
                model.addColumn("Pozisyon");
                model.addColumn("Telefon");
                model.addColumn("Maaş");
                model.addColumn("ZamOranı");
                model.addColumn("YeniMaaş");

                while (resultSet.next()) {
    int id = resultSet.getInt("personelid");
    String adSoyad = resultSet.getString("personeladisoyadi");
    String girisTarihi = resultSet.getString("personelgiristarihi");
    String pozisyon = resultSet.getString("personelpozisyonu");
    String telefon = resultSet.getString("personeltel");
    BigDecimal maas = resultSet.getBigDecimal("personelmaasi");
    // Zam oranını hesapla
    Date girisTarihiDate = new SimpleDateFormat("yyyy-MM-dd").parse(girisTarihi);
    double zamOrani = calculateZamOrani(girisTarihiDate);
    double yeniMaas = maas.doubleValue() * (1 + zamOrani / 100);

    Object[] row = {id, adSoyad, girisTarihi, pozisyon, telefon, maas, zamOrani + "%", yeniMaas};
    model.addRow(row);
}

tablo.setModel(model);
            }
        }
    } catch (SQLException | ParseException e) {
        // SQL hatası veya tarih dönüşüm hatası oluştu
        e.printStackTrace();
    }
         personelidtbox.setText("");
         personeladisoyaditbox.setText("");
         personelmaasitbox.setText("");
         personelgiristarihitbox.setText("");
         personelpozisyonutbox.setText("");
         personeltelefonutbox.setText("");
         personelgidertbox.setText("");
    }//GEN-LAST:event_personellistelebtnActionPerformed

    
    //ANA SAYFA YÖNLENDİRME
    private void personelanasayfabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelanasayfabtnActionPerformed
        anaform anaform = new anaform();
anaform.setVisible(true);
dispose();
    }//GEN-LAST:event_personelanasayfabtnActionPerformed

    
    
    
    //PERSONEL KAYDETME
    private void personelkaydetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelkaydetbtnActionPerformed
int yeniid;
try {
    yeniid = Integer.parseInt(personelidtbox.getText());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Lütfen geçerli bir personel ID girin.", "Hata", JOptionPane.ERROR_MESSAGE);
    return;
}
String yeniad = personeladisoyaditbox.getText();
java.sql.Date yenipersonelgiristarihi = null;
try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date parsedDate = dateFormat.parse(personelgiristarihitbox.getText());
    yenipersonelgiristarihi = new java.sql.Date(parsedDate.getTime());
} catch (ParseException e) {
    e.printStackTrace();
}
String yenipozisyon = personelpozisyonutbox.getText();
String yenitel = personeltelefonutbox.getText();
String yenimaas = personelmaasitbox.getText();
double yenimaasDouble = Double.parseDouble(yenimaas);

try {
    statement = con.createStatement();
    String query = "SELECT * FROM personel WHERE personelid = ?";
    PreparedStatement checkStatement = con.prepareStatement(query);
    checkStatement.setInt(1, yeniid);
    ResultSet resultSet = checkStatement.executeQuery();

    if (resultSet.next()) {
        JOptionPane.showMessageDialog(this, "Bu personel ID zaten kayıtlıdır.", "Hata", JOptionPane.ERROR_MESSAGE);
    } else {
        String insertQuery = "INSERT INTO personel (personelid, personeladisoyadi, personelgiristarihi, personelpozisyonu, personeltel, personelmaasi, personelzamorani) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStatement = con.prepareStatement(insertQuery);
        insertStatement.setInt(1, yeniid);
        insertStatement.setString(2, yeniad);
        insertStatement.setDate(3, yenipersonelgiristarihi);
        insertStatement.setString(4, yenipozisyon);
        insertStatement.setString(5, yenitel);
        insertStatement.setDouble(6, yenimaasDouble);
        insertStatement.setDouble(7, 0.0); // Set the value for the personelzamorani field
        int rowCount = insertStatement.executeUpdate();

        if (rowCount > 0) {
            JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklendi.");

            DefaultTableModel model = (DefaultTableModel) tablo.getModel();
            model.addRow(new Object[]{yeniid, yeniad, yenipersonelgiristarihi, yenipozisyon, yenitel, yenimaas});

            personelidtbox.setText("");
            personeladisoyaditbox.setText("");
            personelmaasitbox.setText("");
            personelgiristarihitbox.setText("");
            personelpozisyonutbox.setText("");
            personeltelefonutbox.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Kayıt eklenirken bir hata oluştu.");
        }
    }
    resultSet.close();
} catch (SQLException ex) {
    Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
}
personellistelebtn.doClick();


    }//GEN-LAST:event_personelkaydetbtnActionPerformed


    
    
    //PERSONEL SİLME    
    private void personelsilbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelsilbtnActionPerformed
          int personelID = Integer.parseInt(personelidtbox.getText()); // personel ID'sini al
          
    try {
        statement = con.createStatement();
        String query = "SELECT * FROM personel WHERE personelid = " + personelID;
        ResultSet resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Personel'i silmek istediğinize emin misiniz?", "Silme Onayı", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String deleteQuery = "DELETE FROM personel WHERE personelid = " + personelID;
                int rowCount = statement.executeUpdate(deleteQuery);

                if (rowCount > 0) {
                    JOptionPane.showMessageDialog(null, "Personel başarıyla silindi.");

                    DefaultTableModel model = (DefaultTableModel) tablo.getModel();
                    int selectedRow = tablo.getSelectedRow();
                    if (selectedRow != -1) {
                        model.removeRow(selectedRow);
                    }

                    personelidtbox.setText("");
                    personeladisoyaditbox.setText("");
                    personelmaasitbox.setText("");
                    personelgiristarihitbox.setText("");
                    personelpozisyonutbox.setText("");
                    personeltelefonutbox.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Personel silinirken bir hata oluştu.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bu personelin ID'sine sahip bir personel bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
        }

        resultSet.close();
    } catch (SQLException ex) {
        Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
    }
personellistelebtn.doClick();
    }//GEN-LAST:event_personelsilbtnActionPerformed

    
    
    
    //personel güncelleme
    private void personelguncellebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelguncellebtnActionPerformed
int personelID = Integer.parseInt(personelidtbox.getText()); // personel ID'sini al

try {
    statement = con.createStatement();
    StringBuilder queryBuilder = new StringBuilder("UPDATE personel SET");

    if (!personeladisoyaditbox.getText().isEmpty()) {
        String yeniAd = personeladisoyaditbox.getText(); // Yeni ürün adını al
        queryBuilder.append(" personeladisoyadi = '").append(yeniAd).append("',");
    }

    

    if (!personelgiristarihitbox.getText().isEmpty()) {
    String tarihStr = personelgiristarihitbox.getText(); // Tarih metin değerini al

    try {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Tarih formatı belirle
        Date tarih = new Date(dateFormat.parse(tarihStr).getTime()); // Tarihi formatlamak için SimpleDateFormat kullan

        queryBuilder.append(" personelgiristarihi = '").append(dateFormat.format(tarih)).append("',");

        // Daha fazla işlem yapabilirsiniz...

    } catch (ParseException e) {
        e.printStackTrace();
    }
}

       

  
    if (!personelpozisyonutbox.getText().isEmpty()) {
        String yeniKategori = personelpozisyonutbox.getText(); // Yeni ürün kategorisini al
        queryBuilder.append(" personelpozisyonu = '").append(yeniKategori).append("',");
    }
    if (!personeltelefonutbox.getText().isEmpty()) {
        String yeniTel = personeltelefonutbox.getText(); // Yeni ürün tel al
        queryBuilder.append(" personeltel = '").append(yeniTel).append("',");
    }
if (!personelmaasitbox.getText().isEmpty()) {
        BigDecimal yeniMiktar = new BigDecimal(personelmaasitbox.getText()); // Yeni ürün miktarını al
        queryBuilder.append(" personelmaasi = ").append(yeniMiktar).append(",");
    }
    // Query'in sonundaki gereksiz virgülü kaldırma
    queryBuilder.deleteCharAt(queryBuilder.length() - 1);

    String query = queryBuilder.append(" WHERE personelid = ").append(personelID).toString();
    int rowCount = statement.executeUpdate(query);

    if (rowCount > 0) {
        JOptionPane.showMessageDialog(null, "Personel başarıyla güncellendi.");
        
        // Verileri güncelledikten sonra metin alanlarını temizleme
        personelidtbox.setText("");
        personeladisoyaditbox.setText("");
        personelmaasitbox.setText("");
        personelgiristarihitbox.setText("");
        personelpozisyonutbox.setText("");
        personeltelefonutbox.setText("");
    } else {
        JOptionPane.showMessageDialog(null, "Personel güncellenirken bir hata oluştu.");
    }
} catch (SQLException ex) {
    Logger.getLogger(Urunler.class.getName()).log(Level.SEVERE, null, ex);
}
personellistelebtn.doClick();     
    }//GEN-LAST:event_personelguncellebtnActionPerformed

    
    
    //yukarıdaki zam alacaklar metodunu buraya çağırıyorum
    private void personelzamalacaklarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelzamalacaklarbtnActionPerformed
 zamAlacakPersonelleriListele();        
    }//GEN-LAST:event_personelzamalacaklarbtnActionPerformed

    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Veritabanına bağlan
    String url = "jdbc:mysql://localhost:3306/restoto"; // Veritabanı URL'si
    String kullaniciAdi = "root";
    String sifre = "";
    try {
    // Bağlantıyı oluştur
    Connection con = DriverManager.getConnection(url, kullaniciAdi, sifre);

    // Veritabanı sorgusu
    String query = "SELECT SUM(personelmaasi) AS toplamMaas FROM personel";

    // Sorguyu çalıştır ve sonuçları al
    Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery(query);

    if (resultSet.next()) {
        // Sonucu al
        BigDecimal toplamMaas = resultSet.getBigDecimal("toplamMaas");

        // Sonucu göster
        personelgidertbox.setText(toplamMaas.toString());
    } else {
        // Kayıt bulunamadı
        JOptionPane.showMessageDialog(this, "Kayıt bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel personeladisoyadilbl;
    private javax.swing.JTextField personeladisoyaditbox;
    private javax.swing.JButton personelanasayfabtn;
    private javax.swing.JTextField personelgidertbox;
    private javax.swing.JLabel personelgiristarihilbl;
    private javax.swing.JTextField personelgiristarihitbox;
    private javax.swing.JButton personelguncellebtn;
    private javax.swing.JLabel personelidlbl;
    private javax.swing.JTextField personelidtbox;
    private javax.swing.JButton personelkaydetbtn;
    private javax.swing.JButton personellistelebtn;
    private javax.swing.JLabel personelmaasilbl;
    private javax.swing.JTextField personelmaasitbox;
    private javax.swing.JLabel personelpozisyonulbl;
    private javax.swing.JTextField personelpozisyonutbox;
    private javax.swing.JButton personelsilbtn;
    private javax.swing.JTextField personeltelefonutbox;
    private javax.swing.JButton personelzamalacaklarbtn;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
