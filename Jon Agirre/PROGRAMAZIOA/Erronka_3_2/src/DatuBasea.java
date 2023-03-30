import java.sql.*;

public class DatuBasea
{
    public static Kotxea bilatu(String kodea) {
        Kotxea kotxea = null;
        
        Connection konexioa;
        PreparedStatement kontsulta;
        ResultSet erregistroak;
        String url;
        String erabiltzailea;
        String pasahitza;

        try {
            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            kontsulta = konexioa.prepareStatement("select * from kotxeak where kodea=?");
            kontsulta.setString(1, kodea);
            erregistroak = kontsulta.executeQuery();

            if (erregistroak.next())
            {
                kotxea = new Kotxea();
                kotxea.setKodea(erregistroak.getString("kodea"));
                kotxea.setFabrikatzailea(erregistroak.getString("fabrikatzailea"));
                kotxea.setModeloa(erregistroak.getString("modeloa"));
                kotxea.setKolorea(erregistroak.getString("kolorea"));
                kotxea.setZaldiak(erregistroak.getDouble("zaldiak"));
                kotxea.setPrezioa(erregistroak.getDouble("prezioa"));
                kotxea.setDeskontua(erregistroak.getInt("deskontua"));
                
            }
            else
            {
                System.out.println("Ez da aurkitu mikroprozesadorerik datu-basean");
            }
            
            erregistroak.close();
            kontsulta.close();
            konexioa.close();
            

        } catch (ClassNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (InstantiationException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (IllegalAccessException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (SQLException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        return kotxea;
    }



    public static int ezabatu(String kodea) {
        
        Connection konexioa;
        PreparedStatement kontsulta;
        String url;
        String erabiltzailea;
        String pasahitza;
        int emaitza = 0;
        
        try {
            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            kontsulta = konexioa.prepareStatement("delete from osagaiak.kotxeak where kodea=?");
            kontsulta.setString(1, kodea);
            emaitza = kontsulta.executeUpdate();

            
            kontsulta.close();
            konexioa.close();

        } catch (ClassNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (InstantiationException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (IllegalAccessException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (SQLException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        return emaitza;
    }

    
    public static int aldatu(Kotxea kotxea) {

        Connection konexioa;
        PreparedStatement kontsulta;
        String url;
        String erabiltzailea;
        String pasahitza;
        String sql;
        int emaitza = 0;


        try {
            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            sql = "update kotxeak set fabrikatzailea=?, modeloa=?, kolorea=?, zaldiak=?, prezioa=?, deskontua=? where kodea=?";
            kontsulta = konexioa.prepareStatement(sql);
            kontsulta.setString(1, kotxea.getFabrikatzailea());
            kontsulta.setString(2, kotxea.getModeloa());
            kontsulta.setString(3, kotxea.getKolorea());
            kontsulta.setDouble(4, kotxea.getZaldiak());
            kontsulta.setDouble(5, kotxea.getPrezioa());
            kontsulta.setInt(6, kotxea.getDeskontua());
            kontsulta.setString(7,kotxea.getKodea());
            emaitza = kontsulta.executeUpdate();

            System.out.printf("Eguneratutako erregistro kopurua: %d\n", emaitza);

            kontsulta.close();
            konexioa.close();

        } catch (ClassNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (InstantiationException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (IllegalAccessException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (SQLException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }

        return emaitza;
    }



    public static int gehitu(Kotxea kotxea) {

        Connection konexioa;
        PreparedStatement kontsulta;
        String url;
        String erabiltzailea;
        String pasahitza;
        String sql;
        int emaitza = 0;
        
        try {

            
            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            sql = "insert into kotxeak (kodea, fabrikatzailea, modeloa, kolorea, zaldiak, prezioa, deskontua) values (?,?,?,?,?,?,?)";
            kontsulta = konexioa.prepareStatement(sql);
            kontsulta.setString(1,kotxea.getKodea());
            kontsulta.setString(2, kotxea.getFabrikatzailea());
            kontsulta.setString(3, kotxea.getModeloa());
            kontsulta.setString(4, kotxea.getKolorea());
            kontsulta.setDouble(5, kotxea.getZaldiak());
            kontsulta.setDouble(6, kotxea.getPrezioa());
            kontsulta.setInt(7, kotxea.getDeskontua());
            emaitza = kontsulta.executeUpdate();

            System.out.printf("Txertatutako erregistro kopurua: %d\n", emaitza);

            kontsulta.close();
            konexioa.close();
            

        } catch (ClassNotFoundException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (InstantiationException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (IllegalAccessException e) {
            System.out.printf("Salbuespena: %s\n", e);
        } catch (SQLException e) {
            System.out.printf("Salbuespena: %s\n", e);
        }
        return emaitza;
    }
}