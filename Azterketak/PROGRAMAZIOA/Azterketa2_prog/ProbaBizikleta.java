import java.util.Scanner;//Datuak jasotzeko funtzioaren liburutegia
public class ProbaBizikleta
{
    public static void main(String[] args)
    {
        Bizikleta bizi1 = new Bizikleta("Orbea", "Orca 2003", 876, 20);//Objetu berri bat sortu balore batzuekin
        
        System.out.printf("\nSortutako bizikletak (bizi1.getKontadorea() metodoa erabiliz): %d\n",bizi1.getKontadorea());
        
        bizi1.erakutsi();//Metodo desberdinak bizikletaren ezaugarriak erakusteko pantailatik
        bizi1.erakutsi("EN");
        bizi1.erakutsi("ES");
        System.out.printf("\nBizikletaren ekoizlea, modeloa, prezioa eta deskontua: %s %s %.2f€ %d\n",bizi1.getEkoizlea(), bizi1.getModeloa(), bizi1.getPrezioa(), bizi1.getDeskontua());
        
        //Bizikletaren prezioa pantailaratu
        System.out.printf("\nBizikletaren azken prezioa: %.2f\n\n",bizi1.salmentaPrezioa());
        System.out.printf("\nSortutako bizikletak (bizi1.getKontadorea() metodoa erabiliz): %d\n",bizi1.getKontadorea());
        //--------------------------------------------------------------------------------------------------------------//
        
        Bizikleta bizi2 = new Bizikleta();//Beste objetu ba sortu hutsik balioak sartzea probatzeko
        
        bizi2.setEkoizlea("BH");//Ekoizlea esleitu
        bizi2.setModeloa("475.X");//Modeloa esleitu
        bizi2.setPrezioa(589);//Prezioa esleitu
        bizi2.setDeskontua(10);//Deskontua esleitu
        
        bizi2.erakutsi();//bizikletaaren ezaugarriak erakutsi
        
        //bizikletaren azken prezioa pantailaratu
        System.out.printf("\nBizikletaren azken prezioa: %.2f€\n\n",bizi2.salmentaPrezioa());
        System.out.printf("\nSortutako bizikletak (bizi1.getKontadorea() metodoa erabiliz): %d\n",bizi1.getKontadorea());
        System.out.printf("\nSortutako bizikletak (bizi2.getKontadorea() metodoa erabiliz): %d\n",bizi2.getKontadorea());
        //--------------------------------------------------------------------------------------------------------------//
        
        Bizikleta bizi3 = new Bizikleta();//Azken objetua ezaugarriak teklatutik sartzea probatzeko
        
        String eko;//Deklaratu bariableak
        String mod;
        double pre;
        int des;
        
        Scanner sarrera = new Scanner(System.in);//Datuak jasotzeko funtzioarei izena jarri
        
        System.out.print("\nSartu bizikletaren ekoizlea: ");//Pantailatik eskatu Ekoizlea
        eko = sarrera.next();//Jaso Ekoizlea
        bizi3.setEkoizlea(eko);//Gorde objetuaren balioetan
        
        System.out.print("Sartu bizikletaren modeloa: ");//Pantailatik eskatu Modeloa
        mod = sarrera.next();//Jaso Modeloa
        bizi3.setModeloa(mod);//Gorde objetuaren balioetan
        
        System.out.print("Sartu bizikletaren prezioa: ");//Pantailatik eskatu Prezioa
        pre = sarrera.nextDouble();//Jaso Prezioa
        bizi3.setPrezioa(pre);//Gorde objetuaren balioetan
        
        System.out.print("Sartu bizikletaren deskontua: ");//Pantailatik eskatu Deskontua
        des = sarrera.nextInt();//Jaso Deskontua
        bizi3.setDeskontua(des);//Gorde objetuaren balioetan
        
        bizi3.erakutsi();//bizikletaaren ezaugarriak erakutsi
        
        //bizikletaaren azken prezioa pantailaratu
        System.out.printf("\nBizikletaren azken prezioa: %.2f€\n\n",bizi3.salmentaPrezioa());
        System.out.printf("\nSortutako bizikletak (bizi1.getKontadorea() metodoa erabiliz): %d\n",bizi1.getKontadorea());
        System.out.printf("\nSortutako bizikletak (bizi2.getKontadorea() metodoa erabiliz): %d\n",bizi2.getKontadorea());
        System.out.printf("\nSortutako bizikletak (bizi3.getKontadorea() metodoa erabiliz): %d\n",bizi3.getKontadorea());
    }
}
