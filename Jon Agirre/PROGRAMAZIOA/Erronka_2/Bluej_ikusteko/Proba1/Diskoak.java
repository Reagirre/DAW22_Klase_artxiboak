import java.util.Scanner;
public class Diskoak
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        int aukera;
        int irteera;
        irteera = 1;
        
        while(irteera == 1)
        {
            System.out.print("- Diskoak -\n---------\n");
            System.out.print("1. Diskoa gehitu\n");
            System.out.print("2. Diskoa bilatu");
            System.out.print("3. Diskoa aldatu");
            System.out.print("4. Diskoa ezabatu");
            System.out.print("5. Irten");
            
            
            System.out.print("Aukeratu bat: ");
            aukera = sarrera.nextInt();
            
            switch (aukera)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.print("\nAukera ez da zuzena, mesedez sartu 1-etik 10-erako zenbaki bat\n\n");
                    break;
            }
        }
        sarrera.close();
    }
}