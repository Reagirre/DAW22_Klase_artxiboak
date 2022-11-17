import java.util.Scanner;

public class ArrayBat
{
    public static void main (String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        int kont = 0;

        int Array[];
        Array = new int[10];
        
        while(kont < 10)
        {
            Array[kont] = kont + 1;
            kont++;
        }

        kont = 0;
        
        while(kont < 10)
        {
            System.out.println(Array[kont]);
            kont++;
        }
        
        sarrera.close();
    }
}