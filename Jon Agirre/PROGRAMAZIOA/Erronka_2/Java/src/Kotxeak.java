import java.util.*;
public class Kotxeak
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int aukera;
        
        System.out.print("- Kotxeak -\n---------\n");
        System.out.print("1. Kotxea gehitu\n\n");
        System.out.print("2. Kotxea bilatu\n\n");
        System.out.print("3. Kotxea aldatu\n\n");
        System.out.print("4. Kotxea ezabatu\n\n");
        System.out.print("5. Irten\n\n");
        System.out.print("Aukeratu bat: ");
        aukera = sarrera.nextInt();
        
        switch (aukera)
        {
            case 1:
                Kotxea_Gehitu.gehitu();
                break;
            case 2:
                Kotxea_Bilatu.bilatu();
                break;
            case 3:
                Kotxea_Aldatu.aldatu();
                break;
            case 4:
                Kotxea_Ezabatu.ezabatu();
                break;
            case 5:
                ProbaKanta.proba();
                break;
            default:
                System.out.print("\nAukera ez da zuzena, mesedez sartu 1-etik 10-erako zenbaki bat\n\n");
                break;
        }

        sarrera.close();
    }
}