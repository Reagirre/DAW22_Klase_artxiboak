import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Kaixo {
    public static void main(String[] args) {
        
        JFrame leihoa;
        JPanel panela;
        JLabel labela;

        leihoa = new JFrame();

        leihoa.setBounds(0,0,300,100);

        leihoa.setTitle("Kaixo Mundua!");

        leihoa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labela = new JLabel("Kaixo Mundua!");


        panela = new JPanel();

        panela.add(labela);

        leihoa.getContentPane().add(panela);

        leihoa.setVisible(true);
    }
}
