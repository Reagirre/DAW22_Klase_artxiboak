import java.util.*;

public class BiDimentsiokoArrayBat1
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        int kont = 0;

        int Array[][] = {{1,2,3,4,5,6,7,8,9,10}};
        
        while(kont < 10)
        {
            System.out.println(Array[0][kont]);
            kont++;
        }
        
        sarrera.close();
    }
}