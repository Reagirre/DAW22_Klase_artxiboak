import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Leihoa extends JFrame{

    private JLabel lKodea;
    private JLabel lFabrikatzailea;
    private JLabel lModeloa;
    private JLabel lKolorea;
    private JLabel lZaldiak;
    private JLabel lPrezioa;
    private JLabel lDeskontua;
    private JLabel lMezua;
    private JLabel lEzabatu;
    private JTextField tKodea;
    private JTextField tFabrikatzailea;
    private JTextField tModeloa;
    private JTextField tKolorea;
    private JTextField tZaldiak;
    private JTextField tPrezioa;
    private JTextField tDeskontua;
    private JButton bAurrekoa;
    private JButton bHurrengoa;
    private JButton bGehitu;
    private JButton bBilatu;
    private JButton bAldatu;
    private JButton bEzabatu;
    private JButton bAdos;
    private JButton bUtzi;
    private JPanel p;
    private JPanel pEzabatu;
    private final int GEHITU = 1;
    private final int BILATU = 2;
    private final int ALDATU = 3;
    private int ekintza;
    private Connection konexioa;
    private Statement kontsulta;
    private ResultSet erregistroak;
    private String url;
    private String erabiltzailea;
    private String pasahitza;
    private String sql;


    public Leihoa() {
        
        
        setTitle("Kotxeak!");
        
        setBounds(0, 0, 490,460);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lKodea = new JLabel("Kodea");
        lFabrikatzailea = new JLabel("Fabrikatzailea");
        lModeloa = new JLabel("Modeloa");
        lKolorea = new JLabel("Kolorea");
        lZaldiak = new JLabel("Zaldiak");
        lPrezioa = new JLabel("Prezioa");
        lDeskontua = new JLabel("Deskontua");
        lMezua = new JLabel();

        tKodea = new JTextField();
        tKodea.setEditable(false);
        tFabrikatzailea = new JTextField();
        tFabrikatzailea.setEditable(false);
        tModeloa = new JTextField();
        tModeloa.setEditable(false);
        tKolorea = new JTextField();
        tKolorea.setEditable(false);
        tZaldiak = new JTextField();
        tZaldiak.setEditable(false);
        tPrezioa = new JTextField();
        tPrezioa.setEditable(false);
        tDeskontua= new JTextField();
        tDeskontua.setEditable(false);

        bAurrekoa = new JButton("Aurrekoa");
        bHurrengoa = new JButton("Hurrengoa");
        bGehitu = new JButton("Gehitu");
        bBilatu = new JButton("Bilatu");
        bAldatu = new JButton("Aldatu");
        bEzabatu = new JButton("Ezabatu");
        bAdos = new JButton("Ados");
        bAdos.setEnabled(false);
        bUtzi = new JButton("Utzi");
        bUtzi.setEnabled(false);

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

        bGehitu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikGehitu();
            }
        });

        bAldatu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikAldatu();
            }
        });

        bBilatu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikBilatu();
            }
        });

        bEzabatu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikEzabatu();
            }
        });

        bAdos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikAdos();
            }
        });

        bUtzi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                klikUtzi();
            }
        });

        p = new JPanel();

        // etiketak bitarteko kontenedorean gehitu
        p.add(lKodea);
        p.add(lFabrikatzailea);
        p.add(lModeloa);
        p.add(lKolorea);
        p.add(lZaldiak);
        p.add(lPrezioa);
        p.add(lDeskontua);
        p.add(lMezua);
        // testu-koadroak ere gehitu
        p.add(tKodea);
        p.add(tFabrikatzailea);
        p.add(tModeloa);
        p.add(tKolorea);
        p.add(tZaldiak);
        p.add(tPrezioa);
        p.add(tDeskontua);
        // eta botoiak
        p.add(bAurrekoa);
        p.add(bHurrengoa);
        p.add(bGehitu);
        p.add(bBilatu);
        p.add(bAldatu);
        p.add(bEzabatu);
        p.add(bAdos);
        p.add(bUtzi);

        p.setLayout(null);
        lMezua.setBounds (30,20,500,25);
        lKodea.setBounds (30,65, 100,25);
        lFabrikatzailea.setBounds (30,100, 100, 25);
        lModeloa.setBounds (30, 135, 100, 25);
        lKolorea.setBounds (30, 170, 100, 25);
        lZaldiak.setBounds (30,205, 100, 25);
        lPrezioa.setBounds (30,240, 100, 25);
        lDeskontua.setBounds (30,275, 100,25);
        tKodea.setBounds(120, 65,200,25);
        tFabrikatzailea.setBounds(120,100,200,25);
        tModeloa.setBounds(120,135,200,25);
        tKolorea.setBounds(120, 170,200,25);
        tZaldiak.setBounds(120,205,200,25);
        tPrezioa.setBounds(120,240,200,25);
        tDeskontua.setBounds(120,275,200,25);
        bAurrekoa.setBounds(340,65, 110,25);
        bHurrengoa.setBounds (340, 100,110,25);
        bGehitu.setBounds (340, 135,110,25);
        bBilatu.setBounds (340, 170,110,25);
        bAldatu.setBounds (340, 205,110,25);
        bEzabatu.setBounds(340, 240, 110,25);
        bAdos.setBounds (340, 310,100,25);
        bUtzi.setBounds (340, 340,100,25);

        getContentPane().add(p);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            url = "jdbc:mysql://localhost:3306/erronka";
            erabiltzailea = "root";
            pasahitza = "1230";
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
                sql = "select * from kotxeak";
                kontsulta = konexioa.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                erregistroak = kontsulta.executeQuery(sql);

                if(erregistroak.next()){
                    tKodea.setText(erregistroak.getString("kodea"));
                    tFabrikatzailea.setText(erregistroak.getString("fabrikatzailea"));
                    tModeloa.setText (erregistroak.getString("modeloa"));
                    tKolorea.setText (erregistroak.getString("kolorea"));
                    tZaldiak.setText(String.valueOf(erregistroak.getDouble("zaldiak")));
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
                    tFabrikatzailea.setText(erregistroak.getString("fabrikatzailea"));
                    tModeloa.setText(erregistroak.getString("modeloa"));
                    tKolorea.setText(erregistroak.getString("kolorea"));
                    tZaldiak.setText(String.valueOf(erregistroak.getDouble("zaldiak")));
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
                if(erregistroak.next()){
                    tKodea.setText(erregistroak.getString("kodea"));
                    tFabrikatzailea.setText(erregistroak.getString("fabrikatzailea"));
                    tModeloa.setText(erregistroak.getString("modeloa"));
                    tKolorea.setText(erregistroak.getString("kolorea"));
                    tZaldiak.setText(String.valueOf(erregistroak.getDouble("zaldiak")));
                    tPrezioa.setText(String.valueOf(erregistroak.getDouble("prezioa")));
                    tDeskontua.setText(String.valueOf(erregistroak.getDouble("deskontua")));

                    bAurrekoa.setEnabled(true);

                    if(erregistroak.isLast()){
                        bHurrengoa.setEnabled(false);
                    }
                }
            } catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
    }



    
    private void klikGehitu(){
        
        tKodea.setEditable(true);
        tKodea.setText("");
        tFabrikatzailea.setEditable(true);
        tFabrikatzailea.setText("");
        tModeloa.setEditable(true);
        tModeloa.setText("");
        tKolorea.setEditable(true);
        tKolorea.setText("");
        tZaldiak.setEditable(true);
        tZaldiak.setText("");
        tPrezioa.setEditable(true);
        tPrezioa.setText("");
        tDeskontua.setEditable(true);
        tDeskontua.setText("");
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        lMezua.setText("Ekintza: kotxea gehitu");
        tKodea.requestFocusInWindow();
        ekintza = GEHITU;
    }



    private void klikBilatu() {
        tKodea.setEditable(true);
        tKodea.setText("");
        tFabrikatzailea.setText("");
        tModeloa.setText("");
        tKolorea.setText("");
        tZaldiak.setText("");
        tPrezioa.setText("");
        tDeskontua.setText("");
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        
        lMezua.setText("Ekintza: kotxea bilatu");
        tKodea.requestFocusInWindow();
        ekintza = BILATU;
    }




    private void klikAldatu(){
        tKodea.setEditable(true);
        tFabrikatzailea.setEditable(true);
        tModeloa.setEditable(true);
        tKolorea.setEditable(true);
        tZaldiak.setEditable(true);
        tPrezioa.setEditable(true);
        tDeskontua.setEditable(true);
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        
        lMezua.setText("Ekintza: kotxea aldatu");
        tKodea.requestFocusInWindow();
        ekintza = ALDATU;
        
    }




    private void klikEzabatu() {
        
        
        lMezua.setText("Ekintza: kotxea ezabatu");
        tKodea.requestFocusInWindow();

        // pEzabatu = new JPanel();

        // lEzabatu.setText("Kotxea ezabatu nahi duzu. Zihur zaude?");
        // pEzabatu.add(bAdos);
        // pEzabatu.add(bUtzi);



        // bAdos.setBounds (340, 310,100,25);
        // bUtzi.setBounds (340, 340,100,25);
        ezabatu();
    }




    private void klikAdos() {
        if(ekintza == GEHITU)
            gehitu();
        
        if(ekintza == BILATU)
            bilatu();
        
        if(ekintza == ALDATU)
            aldatu();
            
    }




    private void klikUtzi() {
        tKodea.setEditable(false);
        tFabrikatzailea.setEditable(false);
        tModeloa.setEditable(false);
        tKolorea.setEditable(false);
        tZaldiak.setEditable(false);
        tPrezioa.setEditable(false);
        tDeskontua.setEditable(false);
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(false);
        bUtzi.setEnabled(false);
        bGehitu.setEnabled(true);
        bBilatu.setEnabled(true);
        bAldatu.setEnabled(true);
        bEzabatu.setEnabled(true);

        try {
            if(ekintza == GEHITU){
                erregistroak.first();
                tKodea.setText(erregistroak.getString("kodea"));
                tFabrikatzailea.setText(erregistroak.getString("fabrikatzailea"));
                tModeloa.setText(erregistroak.getString("modeloa"));
                tKolorea.setText(erregistroak.getString("kolorea"));
                tZaldiak.setText(String.valueOf(erregistroak.getDouble("zaldiak")));
                tPrezioa.setText(String.valueOf(erregistroak.getDouble("prezioa")));
                tDeskontua.setText(String.valueOf(erregistroak.getDouble("deskontua")));

            }

            if(erregistroak.isFirst())
                bAurrekoa.setEnabled(false);
            else
                bAurrekoa.setEnabled(true);
            
            if(erregistroak.isLast())
                bAurrekoa.setEnabled(false);
            else
                bHurrengoa.setEnabled(true);
            
            lMezua.setText("");

        } catch (SQLException e) {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
    }




    private void gehitu() {
        if(!tKodea.getText().equals("") && !tFabrikatzailea.getText().equals("") && !tModeloa.getText().equals("") && !tKolorea.getText().equals("")
        && !tZaldiak.getText().equals("") && !tPrezioa.getText().equals("") && !tDeskontua.getText().equals(""))
        {
            try {
                erregistroak.afterLast();
                erregistroak.moveToInsertRow();
                erregistroak.updateString("kodea", tKodea.getText());
                erregistroak.updateString("fabrikatzailea",tFabrikatzailea.getText());
                erregistroak.updateString("modeloa",tModeloa.getText());
                erregistroak.updateString("kolorea",tKolorea.getText());
                erregistroak.updateDouble("zaldiak",Double.parseDouble(tZaldiak.getText()));
                erregistroak.updateDouble("prezioa",Double.parseDouble(tPrezioa.getText()));
                erregistroak.updateDouble("deskontua",Double.parseDouble(tDeskontua.getText()));
                erregistroak.insertRow();
                lMezua.setText("Mikroprozesadorea gehitu da!");
                tKodea.setEditable(false);
                tFabrikatzailea.setEditable(false);
                tModeloa.setEditable(false);
                tKolorea.setEditable(false);
                tZaldiak.setEditable(false);
                tPrezioa.setEditable(false);
                tDeskontua.setEditable(false);
                bGehitu.setEnabled(true);
                bBilatu.setEnabled(true);
                bAldatu.setEnabled(true);
                bEzabatu.setEnabled(true);
                bAdos.setEnabled(false);
                bUtzi.setEnabled(false);

                if(erregistroak.isFirst())
                    bAurrekoa.setEnabled(false);
                else
                    bAurrekoa.setEnabled(true);
                
                if(erregistroak.isLast())
                    bAurrekoa.setEnabled(true);
                else
                    bHurrengoa.setEnabled(false);
                
                lMezua.setText("");

            }catch (IllegalArgumentException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
            catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
        else
            lMezua.setText("Oharra: eremu guztiak bete behar dira");
    }


    private void bilatu() {
        
    }


    private void aldatu() {
        if(!tKodea.getText().equals("") && !tFabrikatzailea.getText().equals("") && !tModeloa.getText().equals("") && !tKolorea.getText().equals("")
        && !tZaldiak.getText().equals("") && !tPrezioa.getText().equals("") && !tDeskontua.getText().equals(""))
        {
            try {
                erregistroak.moveToCurrentRow();
                erregistroak.updateString("kodea", tKodea.getText());
                erregistroak.updateString("fabrikatzailea",tFabrikatzailea.getText());
                erregistroak.updateString("modeloa",tModeloa.getText());
                erregistroak.updateString("kolorea",tKolorea.getText());
                erregistroak.updateDouble("zaldiak",Double.parseDouble(tZaldiak.getText()));
                erregistroak.updateDouble("prezioa",Double.parseDouble(tPrezioa.getText()));
                erregistroak.updateDouble("deskontua",Double.parseDouble(tDeskontua.getText()));
                erregistroak.updateRow();
                lMezua.setText("Mikroprozesadorea gehitu da!");
                tKodea.setEditable(false);
                tFabrikatzailea.setEditable(false);
                tModeloa.setEditable(false);
                tKolorea.setEditable(false);
                tZaldiak.setEditable(false);
                tPrezioa.setEditable(false);
                tDeskontua.setEditable(false);
                bGehitu.setEnabled(true);
                bBilatu.setEnabled(true);
                bAldatu.setEnabled(true);
                bEzabatu.setEnabled(true);
                bAdos.setEnabled(false);
                bUtzi.setEnabled(false);

                if(erregistroak.isFirst())
                {
                    bAurrekoa.setEnabled(false);
                }
                    
                else
                {
                    bAurrekoa.setEnabled(true);
                }
                    
                
                if(erregistroak.isLast())
                {
                    bAurrekoa.setEnabled(true);
                }
                else
                {
                    bHurrengoa.setEnabled(false);
                }
                
                lMezua.setText("");

            }catch (IllegalArgumentException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
            catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
        else
            lMezua.setText("Oharra: eremu guztiak bete behar dira");
    }

    private void ezabatu() {
        if(!tKodea.getText().equals("") && !tFabrikatzailea.getText().equals("") && !tModeloa.getText().equals("") && !tKolorea.getText().equals("")
        && !tZaldiak.getText().equals("") && !tPrezioa.getText().equals("") && !tDeskontua.getText().equals(""))
        {
            try {
                erregistroak.moveToCurrentRow();
                tKodea.setText("");
                tFabrikatzailea.setText("");
                tModeloa.setText("");
                tKolorea.setText("");
                tZaldiak.setText("");
                tPrezioa.setText("");
                tDeskontua.setText("");
                erregistroak.deleteRow();
                lMezua.setText("Mikroprozesadorea ezabatu da!");
                tKodea.setEditable(false);
                tFabrikatzailea.setEditable(false);
                tModeloa.setEditable(false);
                tKolorea.setEditable(false);
                tZaldiak.setEditable(false);
                tPrezioa.setEditable(false);
                tDeskontua.setEditable(false);
                bGehitu.setEnabled(true);
                bBilatu.setEnabled(true);
                bAldatu.setEnabled(true);
                bEzabatu.setEnabled(true);
                bAdos.setEnabled(false);
                bUtzi.setEnabled(false);

                if(erregistroak.isFirst())
                {
                    bAurrekoa.setEnabled(false);
                }else
                {
                    bAurrekoa.setEnabled(true);
                }
                
                if(erregistroak.isLast())
                {
                    bAurrekoa.setEnabled(true);
                }else
                {
                    bHurrengoa.setEnabled(false);
                }
                
                lMezua.setText("");

            }catch (IllegalArgumentException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
            catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
        else
            lMezua.setText("Oharra: eremu guztiak bete behar dira");
    }
}