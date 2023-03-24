import java.sql.*;

public class DatuBasea
{
    public static Mikroprozesadorea bilatu(String kodea) {
        Mikroprozesadorea mikroprozesadorea = null;
        try {
            
            Connection konexioa;
            PreparedStatement kontsulta;
            ResultSet erregistroak;
            String url;
            String erabiltzailea;
            String pasahitza;

            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            kontsulta = konexioa.prepareStatement("select * from mikroprozesadoreak where kodea=?");
            kontsulta.setString(1, kodea);
            erregistroak = kontsulta.executeQuery();

            if (erregistroak.next())
            {
                mikroprozesadorea = new Mikroprozesadorea();
                mikroprozesadorea.setKodea(erregistroak.getString("kodea"));
                mikroprozesadorea.setEkoizlea(erregistroak.getString("ekoizlea"));
                mikroprozesadorea.setModeloa(erregistroak.getString("modeloa"));
                mikroprozesadorea.setSocketa(erregistroak.getString("socketa"));
                mikroprozesadorea.setFrekuentzia(erregistroak.getDouble("frekuentzia"));
                mikroprozesadorea.setPrezioa(erregistroak.getDouble("prezioa"));
                mikroprozesadorea.setDeskontua(erregistroak.getInt("deskontua"));
                
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
        return mikroprozesadorea;
    }



    public static Mikroprozesadorea ezabatu(String kodea) {
        try {

            Connection konexioa;
            PreparedStatement kontsulta;
            ResultSet erregistroak;
            String url;
            String erabiltzailea;
            String pasahitza;

            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            kontsulta = konexioa.prepareStatement("delete from osagaiak.mikroprozesadoreak where kodea=?");
            kontsulta.setString(1, kodea);
            erregistroak = kontsulta.executeQuery();

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
        return null;
    }

    
    public static Mikroprozesadorea aldatu(Mikroprozesadorea mikroprozesadorea) {
        return null;
    }


    
    public static Mikroprozesadorea gehitu(Mikroprozesadorea mikroprozesadorea) {

        try {

            Connection konexioa;
            PreparedStatement kontsulta;
            String url;
            String erabiltzailea;
            String pasahitza;
            String sql;
            int emaitza;
            // mysql datu-basearen kontroladorea kargatu
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            // datu-basera konektatu
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea, pasahitza);

            // kontsulta sortu eta exekutatu
            sql = "insert into mikroprozesadoreak (kodea, ekoizlea, modeloa, socketa, frekuentzia, prezioa, deskontua) values (?,?,?,?,?,?,?)";
            kontsulta = konexioa.prepareStatement(sql);
            kontsulta.setString(1,mikroprozesadorea.getKodea());
            kontsulta.setString(2, mikroprozesadorea.getEkoizlea());
            kontsulta.setString(3, mikroprozesadorea.getModeloa());
            kontsulta.setString(4, mikroprozesadorea.getSocketa());
            kontsulta.setDouble(5, mikroprozesadorea.getFrekuentzia());
            kontsulta.setDouble(6, mikroprozesadorea.getPrezioa());
            kontsulta.setDouble(7, mikroprozesadorea.getDeskontua());
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

        return null;
    }
}