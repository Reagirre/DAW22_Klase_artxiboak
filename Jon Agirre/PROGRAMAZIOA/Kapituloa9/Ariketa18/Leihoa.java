import javax.swing.*;
import java.sql.*;
import java.awt.*;

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
    private ResultSet erregristroak;
    private String url;
    private String erabiltzailea;
    private String pasahitza;
    private String sql;


    public Leihoa() {
        
        setBounds(0, 0, 490,460);

        setTitle("mikroprozesadoreak!");

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
            public void actionPerformed (ActionEvent evt) {
                klikAurrekoa();
            }
        });
        bHurrengoa.addActionListener(new ActionListener(){
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
        lKodea.setBounds (30,65, l00,25);
        lEkoizlea.setBounds (30,l00,l00,25);
        lModeloa.setBounds (30,l35,l00,25);
        lSocketa.setBounds (30,l70,l00,25);
        lFrekuentzia.setBounds (30,205,l00,25);
        lPrezioa.setBounds (30,240,l00,25);
        lDeskontua.setBounds (30,275,l00,25);
        tKodea.setBounds(l20,65,200,25);
        tEkoizlea.setBounds(l20,l00,200,25);
        tModeloa.setBounds(l20,l35,200,25);
        tSocketa.setBounds(l20,l70,200,25);
        tFrekuentzia.setBounds(l20,205,200,25);
        tPrezioa.setBounds(l20,240,200,25);
        tDeskontua.setBounds(l20,275,200,25);
        bAurrekoa.setBounds(340,65,ll0,25);
        bHurrengoa.setBounds (340,l00,ll0,25);

        getContentPane().add(p);

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            url = "jdbc:mysql://localhost:3306/osagaiak";
            erabiltzailea = "root";
            pasahitza = "programazioa";
            konexioa = DriverManager.getConnection(url,erabiltzailea,pasahitza);
        } catch (ClassNotFoundException e) {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
        catch(InstantiationException e){
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
        catch(IllegalAccessException e)
        {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
        catch(SQLException e){
            lMezua.setText("Salbuespena: " + e.getMessage());
        }

        if(konexioa != null)
        {
            try {
                sql = "select * from mikroprozesadoreak";
                kontsulta = konexioa.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                erregristroak = kontsulta.executeQuery(sql);

                if(erregristroak.next()){

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
        if(erregristroak != null)
        {
            try {
                if(erregristroak.previous()){
                    tKodea.setText(erregristroak.getString("kodea"));
                    tEkoizlea.setText(erregristroak.getString("ekoizlea"));
                    tModeloa.setText(erregristroak.getString("modeloa"));
                    tSocketa.setText(erregristroak.getString("socketa"));
                    tFrekuentzia.setText(String.valueOf(erregristroak.getDouble("frekuentzia")));
                    tPrezioa.setText(String.valueOf(erregristroak.getDouble("prezioa")));
                    tDeskontua.setText(String.valueOf(erregristroak.getDouble("deskontua")));
                    if(erregristroak.isFirst()){
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
        if(erregristroak != null)
        {
            try {
                if(erregristroak.previous()){
                    tKodea.setText(erregristroak.getString("kodea"));
                    tEkoizlea.setText(erregristroak.getString("ekoizlea"));
                    tModeloa.setText(erregristroak.getString("modeloa"));
                    tSocketa.setText(erregristroak.getString("socketa"));
                    tFrekuentzia.setText(String.valueOf(erregristroak.getDouble("frekuentzia")));
                    tPrezioa.setText(String.valueOf(erregristroak.getDouble("prezioa")));
                    tDeskontua.setText(String.valueOf(erregristroak.getDouble("deskontua")));
                    if(erregristroak.isFirst()){
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