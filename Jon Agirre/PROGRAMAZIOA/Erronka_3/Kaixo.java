public class Kaixo {
    public static void main(String[] args) {
        
        Leihoa l = new Leihoa();

        LeihoEntzulea le = new LeihoEntzulea();

        l.addWindowListener(le);

        l.setVisible(true);
    }
}
