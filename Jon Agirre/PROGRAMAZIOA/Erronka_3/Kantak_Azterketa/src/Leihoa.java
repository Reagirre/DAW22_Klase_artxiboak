import javax.swing.*;

import nu.xom.Text;

import java.sql.*;
import java.awt.event.*;

public class Leihoa extends JFrame{

    private JLabel lId;
    private JLabel lIzenburua;
    private JLabel lEgilea;
    private JLabel lUrtea;
    private JLabel lMinutuak;
    private JLabel lSegunduak;
    private JLabel lFitxategia;
    private JLabel lMezua;
    private JTextField tId;
    private JTextField tIzenburua;
    private JTextField tEgilea;
    private JTextField tUrtea;
    private JTextField tMinutuak;
    private JTextField tSegunduak;
    private JTextField tFitxategia;
    private JButton bAurrekoa;
    private JButton bHurrengoa;
    private JButton bGehitu;
    private JButton bBilatu;
    private JButton bAldatu;
    private JButton bEzabatu;
    private JButton bAdos;
    private JButton bUtzi;
    private JPanel p;
    private final int GEHITU = 1;
    private final int BILATU = 2;
    private final int ALDATU = 3;
    private final int EZABATU = 4;
    private int ekintza;
    private Connection konexioa;
    private Statement kontsulta;
    private ResultSet erregistroak;
    private String url;
    private String erabiltzailea;
    private String pasahitza;
    private String sql;
    private Boolean ezDuTopatu = false;


    public Leihoa() {
        
        
        setTitle("Kantak");
        
        setBounds(0, 0, 490,460);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lId = new JLabel("Id");
        lIzenburua = new JLabel("Izenburua");
        lEgilea = new JLabel("Egilea");
        lUrtea = new JLabel("Urtea");
        lMinutuak = new JLabel("Minutuak");
        lSegunduak = new JLabel("Segunduak");
        lFitxategia = new JLabel("Fitxategia");
        lMezua = new JLabel();

        tId = new JTextField();
        tId.setEditable(false);
        tIzenburua = new JTextField();
        tIzenburua.setEditable(false);
        tEgilea = new JTextField();
        tEgilea.setEditable(false);
        tUrtea = new JTextField();
        tUrtea.setEditable(false);
        tMinutuak = new JTextField();
        tMinutuak.setEditable(false);
        tSegunduak = new JTextField();
        tSegunduak.setEditable(false);
        tFitxategia= new JTextField();
        tFitxategia.setEditable(false);

        bAurrekoa = new JButton("<");
        bHurrengoa = new JButton(">");
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
        p.add(lId);
        p.add(lIzenburua);
        p.add(lEgilea);
        p.add(lUrtea);
        p.add(lMinutuak);
        p.add(lSegunduak);
        p.add(lFitxategia);
        p.add(lMezua);
        // testu-koadroak ere gehitu
        p.add(tId);
        p.add(tIzenburua);
        p.add(tEgilea);
        p.add(tUrtea);
        p.add(tMinutuak);
        p.add(tSegunduak);
        p.add(tFitxategia);
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
        lId.setBounds (30,65, 100,25);
        lIzenburua.setBounds (30,100, 100, 25);
        lEgilea.setBounds (30, 135, 100, 25);
        lUrtea.setBounds (30, 170, 100, 25);
        lMinutuak.setBounds (30,205, 100, 25);
        lSegunduak.setBounds (30,240, 100, 25);
        lFitxategia.setBounds (30,275, 100,25);
        tId.setBounds(120, 65,60,25);
        tIzenburua.setBounds(120,100,200,25);
        tEgilea.setBounds(120,135,200,25);
        tUrtea.setBounds(120, 170,60,25);
        tMinutuak.setBounds(120,205,60,25);
        tSegunduak.setBounds(120,240,60,25);
        tFitxategia.setBounds(120,275,200,25);
        bAurrekoa.setBounds(120,310, 60,25);
        bHurrengoa.setBounds (190, 310,60,25);
        bGehitu.setBounds (340, 65,110,25);
        bBilatu.setBounds (340, 100,110,25);
        bAldatu.setBounds (340, 135,110,25);
        bEzabatu.setBounds(340, 170, 110,25);
        bAdos.setBounds (340, 240,100,25);
        bUtzi.setBounds (340, 275,100,25);

        getContentPane().add(p);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            url = "jdbc:mysql://localhost:3306/kantak";
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
                sql = "select * from kantak";
                kontsulta = konexioa.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                erregistroak = kontsulta.executeQuery(sql);

                if(erregistroak.next()){
                    tId.setText(String.valueOf(erregistroak.getInt("id")));
                    tIzenburua.setText(erregistroak.getString("izenburua"));
                    tEgilea.setText (erregistroak.getString("egilea"));
                    tUrtea.setText (String.valueOf(erregistroak.getInt("urtea")));
                    tMinutuak.setText(String.valueOf(erregistroak.getInt("minutuak")));
                    tSegunduak.setText(String.valueOf(erregistroak.getInt("segunduak")));
                    tFitxategia.setText(erregistroak.getString("fitxategia"));

                    bAurrekoa.setEnabled(false);

                    if (erregistroak.isLast())
                    {
                        bHurrengoa.setEnabled(false);
                    }
                }
                else{
                    lMezua.setText("Oharra: ez dago kantarik datu-basearkin");
                    bAurrekoa.setEnabled(false);
                    bHurrengoa.setEnabled(false);
                    bAdos.setEnabled(false);
                    bUtzi.setEnabled(false);
                    bBilatu.setEnabled(false);
                    bAldatu.setEnabled(false);
                    bEzabatu.setEnabled(false);

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
                    tId.setText(String.valueOf(erregistroak.getInt("id")));
                    tIzenburua.setText(erregistroak.getString("izenburua"));
                    tEgilea.setText (erregistroak.getString("egilea"));
                    tUrtea.setText (String.valueOf(erregistroak.getInt("urtea")));
                    tMinutuak.setText(String.valueOf(erregistroak.getInt("minutuak")));
                    tSegunduak.setText(String.valueOf(erregistroak.getInt("segunduak")));
                    tFitxategia.setText(erregistroak.getString("fitxategia"));
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
                    tId.setText(String.valueOf(erregistroak.getInt("id")));
                    tIzenburua.setText(erregistroak.getString("izenburua"));
                    tEgilea.setText (erregistroak.getString("egilea"));
                    tUrtea.setText (String.valueOf(erregistroak.getInt("urtea")));
                    tMinutuak.setText(String.valueOf(erregistroak.getInt("minutuak")));
                    tSegunduak.setText(String.valueOf(erregistroak.getInt("segunduak")));
                    tFitxategia.setText(erregistroak.getString("fitxategia"));

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
        
        tIzenburua.setEditable(true);
        tIzenburua.setText("");
        tEgilea.setEditable(true);
        tEgilea.setText("");
        tUrtea.setEditable(true);
        tUrtea.setText("");
        tMinutuak.setEditable(true);
        tMinutuak.setText("");
        tSegunduak.setEditable(true);
        tSegunduak.setText("");
        tFitxategia.setEditable(true);
        tFitxategia.setText("");
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        lMezua.setText("Ekintza: kanta gehitu");
        tId.requestFocusInWindow();
        ekintza = GEHITU;
    }



    private void klikBilatu() {
        tId.setEditable(true);
        tId.setText("");
        tIzenburua.setText("");
        tEgilea.setText("");
        tUrtea.setText("");
        tMinutuak.setText("");
        tSegunduak.setText("");
        tFitxategia.setText("");
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        
        lMezua.setText("Ekintza: kanta bilatu");
        tId.requestFocusInWindow();
        ekintza = BILATU;
    }




    private void klikAldatu(){
        tIzenburua.setEditable(true);
        tEgilea.setEditable(true);
        tUrtea.setEditable(true);
        tMinutuak.setEditable(true);
        tSegunduak.setEditable(true);
        tFitxategia.setEditable(true);
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        
        lMezua.setText("Ekintza: kanta aldatu");
        tId.requestFocusInWindow();
        ekintza = ALDATU;
        
    }




    private void klikEzabatu() {
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(true);
        bUtzi.setEnabled(true);
        bGehitu.setEnabled(false);
        bBilatu.setEnabled(false);
        bAldatu.setEnabled(false);
        bEzabatu.setEnabled(false);
        
        lMezua.setText("Ekintza: kanta ezabatu");

        ekintza = EZABATU;
    }




    private void klikAdos() {
        if(ekintza == GEHITU)
            gehitu();
        else if(ekintza == BILATU)
            bilatu();
        else if(ekintza == ALDATU)
            aldatu();
        else if(ekintza == EZABATU)
            ezabatu();
            
    }




    private void klikUtzi() {
        tId.setEditable(false);
        tIzenburua.setEditable(false);
        tEgilea.setEditable(false);
        tUrtea.setEditable(false);
        tMinutuak.setEditable(false);
        tSegunduak.setEditable(false);
        tFitxategia.setEditable(false);
        bAurrekoa.setEnabled(false);
        bHurrengoa.setEnabled(false);
        bAdos.setEnabled(false);
        bUtzi.setEnabled(false);
        bGehitu.setEnabled(true);
        try {
            erregistroak.first();
            if (!erregistroak.next()) {
                bBilatu.setEnabled(false);
                bAldatu.setEnabled(false);
                bEzabatu.setEnabled(false);
            }
            else{
                bBilatu.setEnabled(true);
                bAldatu.setEnabled(true);
                bEzabatu.setEnabled(true);
                if(ekintza == GEHITU){
                    erregistroak.first();
                    tId.setText(String.valueOf(erregistroak.getInt("id")));
                    tIzenburua.setText(erregistroak.getString("izenburua"));
                    tEgilea.setText (erregistroak.getString("egilea"));
                    tUrtea.setText (String.valueOf(erregistroak.getInt("urtea")));
                    tMinutuak.setText(String.valueOf(erregistroak.getInt("minutuak")));
                    tSegunduak.setText(String.valueOf(erregistroak.getInt("segunduak")));
                    tFitxategia.setText(erregistroak.getString("fitxategia"));
    
                }
            
                if(ekintza == BILATU){
                    erregistroak.first();
                    tId.setText(String.valueOf(erregistroak.getInt("id")));
                    tIzenburua.setText(erregistroak.getString("izenburua"));
                    tEgilea.setText (erregistroak.getString("egilea"));
                    tUrtea.setText (String.valueOf(erregistroak.getInt("urtea")));
                    tMinutuak.setText(String.valueOf(erregistroak.getInt("minutuak")));
                    tSegunduak.setText(String.valueOf(erregistroak.getInt("segunduak")));
                    tFitxategia.setText(erregistroak.getString("fitxategia"));
    
                }
                if(erregistroak.isFirst())
                    bAurrekoa.setEnabled(false);
                else
                    bAurrekoa.setEnabled(true);
                
                if(erregistroak.isLast())
                    bHurrengoa.setEnabled(false);
                else
                    bHurrengoa.setEnabled(true);
                
                lMezua.setText("");
            }
            
            

        } catch (SQLException e) {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
    }




    private void gehitu() {
        
        if(!tIzenburua.getText().equals("") && !tEgilea.getText().equals("") && !tUrtea.getText().equals("")
        && !tMinutuak.getText().equals("") && !tSegunduak.getText().equals("") && !tFitxategia.getText().equals(""))
        {
            try {
                erregistroak.afterLast();
                erregistroak.moveToInsertRow();
                erregistroak.updateString("izenburua",tIzenburua.getText());
                erregistroak.updateString("egilea",tEgilea.getText());
                erregistroak.updateInt("urtea",Integer.parseInt(tUrtea.getText()));
                erregistroak.updateInt("minutuak",Integer.parseInt(tMinutuak.getText()));
                erregistroak.updateInt("segunduak",Integer.parseInt(tSegunduak.getText()));
                erregistroak.updateString("fitxategia",tFitxategia.getText());
                erregistroak.insertRow();
                lMezua.setText("Kanta gehitu da!");
                tId.setEditable(false);
                tIzenburua.setEditable(false);
                tEgilea.setEditable(false);
                tUrtea.setEditable(false);
                tMinutuak.setEditable(false);
                tSegunduak.setEditable(false);
                tFitxategia.setEditable(false);
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
                    bHurrengoa.setEnabled(false);
                else
                    bHurrengoa.setEnabled(true);
                
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
        if(!tId.getText().equals(""))
        {
            try {
                erregistroak.first();
                while(!erregistroak.isLast())
                {
                    if(tId.getText().equals(String.valueOf(erregistroak.getInt("id"))))
                        break;
                    else 
                        erregistroak.next();
                        if(erregistroak.isLast())
                        {
                            ezDuTopatu = true;
                        }
                }
                if(ezDuTopatu)
                {
                    bBilatu.setEnabled(true);
                    bAdos.setEnabled(false);
                    bUtzi.setEnabled(false);
                    tId.setText("");
                    tId.setEditable(false);
                    lMezua.setText("Ez da kanta aurkitu");
                }
                else{
                    tId.setText(String.valueOf(erregistroak.getInt("id")));
                    tIzenburua.setText(erregistroak.getString("izenburua"));
                    tEgilea.setText (erregistroak.getString("egilea"));
                    tUrtea.setText (String.valueOf(erregistroak.getInt("urtea")));
                    tMinutuak.setText(String.valueOf(erregistroak.getInt("minutuak")));
                    tSegunduak.setText(String.valueOf(erregistroak.getInt("segunduak")));
                    tFitxategia.setText(erregistroak.getString("fitxategia"));
                    tId.setEditable(false);
                    bGehitu.setEnabled(false);
                    bBilatu.setEnabled(true);
                    bAldatu.setEnabled(true);
                    bEzabatu.setEnabled(true);
                    bAdos.setEnabled(false);
                    bUtzi.setEnabled(false);
                    
                    lMezua.setText("");
                }
                
            
            } catch (IllegalArgumentException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
            catch (SQLException e) {
                lMezua.setText("Salbuespena: " + e.getMessage());
            }
        }
        else
        {
            lMezua.setText("id sartu behar da!");
        }
    }


    private void aldatu() {
        if(!tId.getText().equals("") &&!tIzenburua.getText().equals("") && !tEgilea.getText().equals("") && !tUrtea.getText().equals("")
        && !tMinutuak.getText().equals("") && !tSegunduak.getText().equals("") && !tFitxategia.getText().equals(""))
        {
            try {
                erregistroak.updateString("izenburua",tIzenburua.getText());
                erregistroak.updateString("egilea",tEgilea.getText());
                erregistroak.updateString("urtea",tUrtea.getText());
                erregistroak.updateInt("minutuak",Integer.parseInt(tMinutuak.getText()));
                erregistroak.updateInt("segunduak",Integer.parseInt(tSegunduak.getText()));
                erregistroak.updateString("fitxategia",tFitxategia.getText());
                erregistroak.updateRow();
                tId.setEditable(false);
                tIzenburua.setEditable(false);
                tEgilea.setEditable(false);
                tUrtea.setEditable(false);
                tMinutuak.setEditable(false);
                tSegunduak.setEditable(false);
                tFitxategia.setEditable(false);
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
                    bHurrengoa.setEnabled(false);
                }
                else
                {
                    bHurrengoa.setEnabled(true);
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
        
        try {
            erregistroak.deleteRow();
            erregistroak.first();
            if(!erregistroak.next())
            {
                tId.setEditable(false);
                tIzenburua.setEditable(false);
                tEgilea.setEditable(false);
                tUrtea.setEditable(false);
                tMinutuak.setEditable(false);
                tSegunduak.setEditable(false);
                tFitxategia.setEditable(false);
                bGehitu.setEnabled(true);
                bBilatu.setEnabled(false);
                bAldatu.setEnabled(false);
                bEzabatu.setEnabled(false);
                bAdos.setEnabled(false);
                bUtzi.setEnabled(false);
                tId.setText("");
                tIzenburua.setText("");
                tEgilea.setText ("");
                tUrtea.setText ("");
                tMinutuak.setText("");
                tSegunduak.setText("");
                tFitxategia.setText("");
            }
            else{
                
                tId.setEditable(false);
                tIzenburua.setEditable(false);
                tEgilea.setEditable(false);
                tUrtea.setEditable(false);
                tMinutuak.setEditable(false);
                tSegunduak.setEditable(false);
                tFitxategia.setEditable(false);
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
                    bHurrengoa.setEnabled(false);
                }else
                {
                    bHurrengoa.setEnabled(true);
                }
                
                lMezua.setText("");
            }
            

        }catch (IllegalArgumentException e) {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
        catch (SQLException e) {
            lMezua.setText("Salbuespena: " + e.getMessage());
        }
    }
}
