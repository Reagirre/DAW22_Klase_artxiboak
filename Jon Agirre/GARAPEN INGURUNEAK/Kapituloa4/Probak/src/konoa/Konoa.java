package konoa;
import java.util.*;
public class Konoa {
    public static void main(String[] args) throws Exception {
        Scanner sarrera = new Scanner(System.in);
        double radio;
        double height;
        double area;
        double volum;

        System.out.print("Sartu konoaren erradioa: ");
        radio = sarrera.nextDouble();

        System.out.print("Sartu konoaren altuera: ");
        height = sarrera.nextDouble();

        area = Math.PI * radio * radio + Math.PI * radio * Math.sqrt(height*height+radio*radio);
        volum = Math.PI * radio * radio * height / 3;

        System.out.printf("Azalera = %.2f\n", area);
        System.out.printf("Bolumena = %.2f\n", volum);

        sarrera.close();
    }
}
