import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Leihoa extends JFrame{

    private JLabel lKodea;
    private JLabel lEkoizlea;
    private JLabel lModeloa;
    private JLabel lSocketa;
    private JLabel lFrekuentzia;
    private JLabel lPrezioa;
    private JLabel lDeskontua;
    private JLabel lMezua;
    private JTextField tKodea;
    private JTextField tEkoizlea;
    private JTextField tModeloa;
    private JTextField tSocketa;
    private JTextField tFrekuentzia;
    private JTextField tPrezioa;
    private JTextField tDeskontua;
    private JButton bAurrekoa;
    private JButton bHurrengoa;
    private JPanel p;
    private Connection konexioa;
    private Statement kontsulta;
    private ResultSet erregistroak;
    private String url;
    private String erabiltzailea;
    private String pasahitza;
    private String sql;


    public Leihoa() {
        
        
        setTitle("Mikroprozesadoreak!");
        
        setBounds(0, 0, 490,460);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lKodea = new JLabel("Kodea");
        lEkoizlea = new JLabel("Ekoizlea");
        lModeloa = new JLabel("Modeloa");
        lSocketa = new JLabel("Socketa");
        lFrekuentzia = new JLabel("Frekuentzia");
        lPrezioa = new JLabel("Prezioa");
        lDeskontua = new JLabel("Deskontua");
        lMezua = new JLabel();

        tKodea = new JTextField();
        tKodea.setEditable(false);
        tEkoizlea = new JTextField();
        tEkoizlea.setEditable(false);
        tModeloa = new JTextField();
        tModeloa.setEditable(false);
        tSocketa = new JTextField();
        tSocketa.setEditable(false);
        tFrekuentzia = new JTextField();
        tFrekuentzia.setEditable(false);
        tPrezioa = new JTextField();
        tPrezioa.setEditable(false);
        tDeskontua= new JTextField();
        tDeskontua.setEditable(false);

        bAurrekoa = new JButton("Aurrekoa");
        bHurrengoa = new JButton("Hurrengoa");

        bAurrekoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikAurrekoa();
            }
        });

        bHurrengoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikHurrengoa();
            }
        });

        p = new JPanel();

        // etiketak bitarteko kontenedorean gehitu
        p.add(lKodea);
        p.add(lEkoizlea);
        p.add(lModeloa);
        p.add(lSocketa);
        p.add(lFrekuentzia);
        p.add(lPrezioa);
        p.add(lDeskontua);
        p.add(lMezua);
        // testu-koadroak ere gehitu
        p.add(tKodea);
        p.add(tEkoizlea);
        p.add(tModeloa);
        p.add(tSocketa);
        p.add(tFrekuentzia);
        p.add(tPrezioa);
        p.add(tDeskontua);
        // eta botoiak
        p.add(bAurrekoa);
        p.add(bHurrengoa);

        p.setLayout(null);
        lMezua.setBounds (30,20,500,25);
        lKodea.setBounds (30,65, 100,25);
        lEkoizlea.setBounds (30,100, 100, 25);
        lModeloa.setBounds (30, 135, 100, 25);
        lSocketa.setBounds (30, 170, 100, 25);
        lFrekuentzia.setBounds (30,205, 100, 25);
        lPrezioa.setBounds (30,240, 100, 25);
        lDeskontua.setBounds (30,275, 100,25);
        tKodea.setBounds(120, 65,200,25);
        tEkoizlea.setBounds(120,100,200,25);
        tModeloa.setBounds(120,135,200,25);
        tSocketa.setBounds(120, 170,200,25);
        tFrekuentzia.setBounds(120,205,200,25);
        tPrezioa.setBounds(120,240,200,25);
        tDeskontua.setBounds(120,275,200,25);
        bAurrekoa.setBounds(340,65, 110,25);
        bHurrengoa.setBounds (340, 100,110,25);

        getContentPane().add(p);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "1230";
            konexioa = DriverManager.getConnection(url,erabiltzailea,pasahitza);
        } catch (ClassNotFoundException e) {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
        // catch(InstantiationException e){
        //     lMezua.setText("Salbuespena: " + e.getMessage());
        // }
        // catch(IllegalAccessException e)
        // {
        //     lMezua.setText("Salbuespena: " + e.getMessage());
        // }
        catch(SQLException e){
            lMezua.setText("Salbuespena: " + e.getMessage());
        }

        if(konexioa != null)
        {
            try {
                sql = "select * from mikroprozesadoreak";
                kontsulta = konexioa.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                erregistroak = kontsulta.executeQuery(sql);

                if(erregistroak.next()){
                    tKodea.setText(erregistroak.getString("kodea"));
                    tEkoizlea.setText(erregistroak.getString("ekoizlea"));
                    tModeloa.setText (erregistroak.getString("modeloa"));
                    tSocketa.setText (erregistroak.getString("socketa"));
                    tFrekuentzia.setText(String.valueOf(erregistroak.getDouble("frekuentzia")));
                    tPrezioa.setText(String.valueOf(erregistroak.getDouble("prezioa")));
                    tDeskontua.setText(String.valueOf(erregistroak.getDouble("deskontua")));

                    bAurrekoa.setEnabled(false);

                    if (erregistroak.isLast())
                    {
                        bHurrengoa.setEnabled(false);
                    }
                }
                else{
                    lMezua.setText("Oharra: ez dago konexiorik datu-basearkin");
                }
            } catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
        else{
            lMezua.setText("Oharra: ez dago konexiorik datu-basearkin");
        }
    }
    private void klikAurrekoa(){
        if(erregistroak != null)
        {
            try {
                if(erregistroak.previous()){
                    tKodea.setText(erregistroak.getString("kodea"));
                    tEkoizlea.setText(erregistroak.getString("ekoizlea"));
                    tModeloa.setText(erregistroak.getString("modeloa"));
                    tSocketa.setText(erregistroak.getString("socketa"));
                    tFrekuentzia.setText(String.valueOf(erregistroak.getDouble("frekuentzia")));
                    tPrezioa.setText(String.valueOf(erregistroak.getDouble("prezioa")));
                    tDeskontua.setText(String.valueOf(erregistroak.getDouble("deskontua")));
                    if(erregistroak.isFirst()){
                        bAurrekoa.setEnabled(false);
                    }
                    bHurrengoa.setEnabled(true);
                }
            } catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
    }

    private void klikHurrengoa(){
        if(erregistroak != null)
        {
            try {
                if(erregistroak.previous()){
                    tKodea.setText(erregistroak.getString("kodea"));
                    tEkoizlea.setText(erregistroak.getString("ekoizlea"));
                    tModeloa.setText(erregistroak.getString("modeloa"));
                    tSocketa.setText(erregistroak.getString("socketa"));
                    tFrekuentzia.setText(String.valueOf(erregistroak.getDouble("frekuentzia")));
                    tPrezioa.setText(String.valueOf(erregistroak.getDouble("prezioa")));
                    tDeskontua.setText(String.valueOf(erregistroak.getDouble("deskontua")));
                    if(erregistroak.isFirst()){
                        bAurrekoa.setEnabled(false);
                    }
                    bHurrengoa.setEnabled(true);
                }
            } catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
    }
}