import java.sql.*;

public class SelectBat {
    public static void main(String[] args) {
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
            kontsulta = konexioa.prepareStatement("{call mikroprozesadoreak_bilatu_parametroa_ekoizlea(?)}");
            kontsulta.setString(1,"Intel");
            erregistroak = kontsulta.executeQuery();

            // emaitzak erakutsi
            if (erregistroak.next())
            {
                System.out.printf("+-------+----------+---------------------+---------+-------------+---------+-----------+\n");
                System.out.printf("| %-6s| %-9s| %-20s| %-8s| %-12s| %-8s| %-10s|\n",
                "Kodea",
                "Ekoizlea",
                "Modeloa",
                "Socketa",
                "Frekuentzia",
                "Prezioa",
                "Deskontua");
                System.out.printf("+-------+----------+---------------------+---------+-------------+---------+-----------+\n");
                do
                {
                    System.out.printf("| %-6s| %-9s| %-20s| %-8s| %-12s| %-8s| %-10s|\n",
                    erregistroak.getString("kodea"),
                    erregistroak.getString("ekoizlea"),
                    erregistroak.getString("modeloa"),
                    erregistroak.getString("socketa"),
                    erregistroak.getDouble("frekuentzia"),
                    erregistroak.getDouble("prezioa"),
                    erregistroak.getInt("deskontua"));
                }
                while (erregistroak.next());
                System.out.printf("+-------+----------+---------------------+---------+-------------+---------+-----------+\n");
            }
            else
            {
                System.out.println("Ez da aurkitu mirkoprozesadorerik datu-basean");
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
    }
}