package restotoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {

    static Connection getBaglanti() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    String kullad = "root";
    String parola = "";
    String db_name = "restoto";
    String host = "localhost";
    int port = 3306;
    Connection con = null;
    Statement statement = null;
    ResultSet rs = null;

    public baglanti() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name + "?characterEncoding=utf8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, kullad, parola);
            System.out.println("Baglanti Basarili");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadi");
        } catch (SQLException ex) {
            System.out.println("Baglanti Hatasi");
        }
    }

    public static void main(String[] args) {
        baglanti baglan = new baglanti();
        baglan.urungetir();
    }
    
    public void urungetir() {
        String sorgu = "SELECT * FROM urunler";
        try {
            statement = con.createStatement();
            rs = statement.executeQuery(sorgu);
            String urunadi, urunmiktari, urunfiyati, urunkategorisi;
            int urunid;
            while (rs.next()) {
                urunid = rs.getInt("urunid");
                urunadi = rs.getString("urunadi");
                urunmiktari = rs.getString("urunmiktari");
                urunfiyati = rs.getString("urunfiyati");
                urunkategorisi = rs.getString("urunkategorisi");
                System.out.println("Urun ID: " + urunid);
                System.out.println("Urun Adi: " + urunadi);
                System.out.println("Urun Miktari: " + urunmiktari);
                System.out.println("Urun Fiyati: " + urunfiyati);
                System.out.println("Urun Kategorisi: " + urunkategorisi);
                System.out.println("--------------------------");
            }
        } catch (SQLException ex) {
            System.out.println("Hata");
        }
    }
}
