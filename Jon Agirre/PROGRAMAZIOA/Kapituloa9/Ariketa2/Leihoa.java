import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Leihoa extends JFrame{

    private JPanel p;
    private JLabel l;

    private Leihoa() {
        
        setBounds(0,0,300,100);

        setTitle("Kaixo Mundua!");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Kaixo Mundua!");


        p = new JPanel();

        p.add(l);

        getContentPane().add(p);
    }
}