import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

public class Aldizkariak
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        ArrayList<Aldizkaria> aldizkariak = new ArrayList<Aldizkaria>();
        Aldizkaria aldizkaria; 
        int id;
        String izenburua;
        String gaia;
        String maiztasuna;
        String url;
        int aukera;
        int i = 0;
        int j;
        boolean aurkitu;
        int kontadorea;

        String artxibo_izena = "aldizkari.csv";
        
        File f;
        FileReader fr;
        BufferedReader br;
        String lerroa;
        FileWriter fw;
        BufferedWriter bw;
        
        String[] datuak;
        
        String datua;
        try {
            f = new File(artxibo_izena);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            lerroa = br.readLine();

            while(lerroa != null)
            {
                datuak = lerroa.split(";;");
                id = Integer.parseInt(datuak[0]);
                izenburua = datuak[1];
                gaia = datuak[2];
                maiztasuna = datuak[3];
                url = datuak[4];


                aldizkaria = new Aldizkaria();
                aldizkaria.setId(id);
                aldizkaria.setIzenburua(izenburua);
                aldizkaria.setGaia(gaia);
                aldizkaria.setMaiztasuna(maiztasuna);
                aldizkaria.setUrl(url);

                aldizkariak.add(aldizkaria);

                lerroa = br.readLine();
            }
            br.close();
        } catch(FileNotFoundException e)
        {
            System.out.printf("Salbuespena: %s\n",e);
        }
        catch(IOException e)
        {
            System.out.printf("Salbuespena: %s\n",e);
        }


        while(true)
        {

            System.out.println("\n- Menua -");
            System.out.println("---------");
            System.out.println("1. Aldizkaria gehitu");
            System.out.println("2. Aldizkaria bilatu");
            System.out.println("3. Aldizkaria aldatu");
            System.out.println("4. Aldizkaria ezabatu");
            System.out.println("5. Irten");

            try{
                System.out.println("Aukeratu bat: ");
                datua = sarrera.nextLine();
                
                if(!datua.equals(""))
                {
                    try
                    {
                        aukera = Integer.parseInt(datua);
                    }
                    catch(NumberFormatException e)
                    {
                        //System.out.println("Sartutako datua ez da zuzena. Saiatu berriro");
                        throw new IllegalArgumentException("Sartutako datua zenbaki oso bat izan behar da. Saiatu berrriro.");
                    }
                    
                    if(aukera < 1 || aukera > 5)
                    {
                        throw new IllegalArgumentException("Aukera 1 eta 5 zenbaki bitartekoa izan behar da. Saiatu berriro.");
                    }
                    break;
                }
                else
                {
                    throw new IllegalArgumentException("Aukera sartzea falta da. Saiatu berriro.");
                }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }

        switch (aukera) {
            case 1:
            System.out.println("\n- Aldizkaria gehitu -");
            System.out.println("----------------------------");
            
            while(true)
            {
                try {
                    System.out.print("Id-a: ");
                    datua = sarrera.nextLine();

                    if(!datua.equals(""))
                    {
                        id = Integer.parseInt(datua);
                        aurkitu = false;
                        i = 0;
                        while(i < aldizkariak.size() && aurkitu == false)
                        {
                            if(aldizkariak.get(i).getId() == id)
                            {
                                aurkitu = true;
                            }
                            else{
                                i++;
                            }
                        }
                        if(aurkitu == false)
                        {
                            break;
                        }
                        else
                        {
                            throw new IllegalArgumentException("Id hau jadanik existitzen da. Saiatu berrriro:");
                        }
                    }
                    else
                    {
                        throw new IllegalArgumentException("Id-a sartzea falta da. Saiatu berriro.");
                    }
                } catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }

            while(true)
            {
                try {
                    System.out.print("Izenburua: ");
                    datua = sarrera.nextLine();
                    if(!datua.equals(""))
                    {
                        izenburua = datua;
                        break;
                    }
                    else 
                    {
                        throw new IllegalArgumentException("Izenburua sartzea falta da. Saiatu berriro.");
                    }
                } catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }

            while(true)
            {
                try {
                    System.out.print("Gaia: ");
                    datua = sarrera.nextLine();
                    if(!datua.equals(""))
                    {
                        gaia = datua;
                        break;
                    }
                    else 
                    {
                        throw new IllegalArgumentException("Gaia sartzea falta da. Saiatu berriro.");
                    }
                } catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            while(true)
            {
                try {
                    System.out.print("Maiztasuna: ");
                    datua = sarrera.nextLine();
                    if(!datua.equals(""))
                    {
                        maiztasuna = datua;
                        break;
                    }
                    else 
                    {
                        throw new IllegalArgumentException("Maiztasuna sartzea falta da. Saiatu berriro.");
                    }
                } catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            while(true)
            {
                try {
                    System.out.print("Url: ");
                    datua = sarrera.nextLine();
                    if(!datua.equals(""))
                    {
                        url = datua;
                        break;
                    }
                    else 
                    {
                        throw new IllegalArgumentException("Url-a sartzea falta da. Saiatu berriro.");
                    }
                } catch(IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
            }
            aldizkariak.add(new Aldizkaria(id, izenburua, gaia, maiztasuna, url));
            i++;
            break;

            case 2:

            System.out.println("\n- Aldizkaria bilatu -");
            System.out.println("----------------------------");
            System.out.print("Id-a: ");
            id = sarrera.nextInt();

            aurkitu = false;
            i = 0;
            while(i < aldizkariak.size() && aurkitu == false)
            {
                if(aldizkariak.get(i).getId() == id)
                {
                    aurkitu = true;
                }
                else{
                    i++;
                }
            }
            if(aurkitu == false)
            {
                System.out.println("Ez da id hori daukan aldizkaririk aurkitu");
            }
            else{
                aldizkariak.get(i).erakutsi();
            }

            break;


            case 3:

            System.out.println("\n- Aldizkaria aldatu -");
            System.out.println("----------------------------");
            System.out.print("Id-a: ");
            id = sarrera.nextInt();

            aurkitu = false;
            i = 0;
            while(i < aldizkariak.size() && aurkitu == false)
            {
                if(aldizkariak.get(i).getId() == id)
                {
                    aurkitu = true;
                }
                else{
                    i++;
                }
            }
            if(aurkitu == false)
            {
                System.out.println("Ez da id hori daukan aldizkaririk aurkitu");
            }
            else{
                System.out.println("\n- Aldizkaria aldatu -");
                System.out.println("----------------------------");

                while(true)
                {
                    try {
                        System.out.print("Id-a[" + aldizkariak.get(i).getId() + "]: ");
                        datua = sarrera.nextLine();
                        if(!datua.equals(""))
                        {
                            id = Integer.parseInt(datua);
                            aurkitu = false;
                            i = 0;
                            while(i < aldizkariak.size() && aurkitu == false)
                            {
                                if(aldizkariak.get(i).getId() == id)
                                {
                                    aurkitu = true;
                                }
                                else{
                                    i++;
                                }
                            }
                            if(aurkitu == false)
                            {
                                if(!datua.equals(""))
                                {                              
                                    id = Integer.parseInt(datua);
                                    aldizkariak.get(i).setId(id);                               
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Id berria sartu behar da");
                                }
                            }
                            else 
                            {
                                throw new IllegalArgumentException("Id hau jadanik existitzen da. Saiatu berrriro:");
                            }
                        }
                        else
                        {
                            throw new IllegalArgumentException("Id-a sartzea falta da. Saiatu berriro.");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                while(true)
                {
                    try {
                        System.out.print("Izenburua[" + aldizkariak.get(i).getIzenburua() + "]: ");
                        datua = sarrera.nextLine();
                        if(!datua.equals(""))
                        {
                            izenburua = datua;
                            aldizkariak.get(i).setIzenburua(izenburua);
                            break;
                        }
                        else 
                        {
                            throw new IllegalArgumentException("Izenburua sartu behar da.");
                        }
                    } catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                while(true)
                {
                    try
                    {
                        System.out.print("Gaia[" + aldizkariak.get(i).getGaia() + "]: ");
                        datua = sarrera.nextLine();
                        if(!datua.equals(""))
                        {
                            gaia = datua;
                            aldizkariak.get(i).setGaia(gaia);
                            break;
                        }
                        else
                        {
                            throw new IllegalArgumentException("Gai berria sartu behar da");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                while(true)
                {
                    try
                    {
                        System.out.print("Maiztasuna[" + aldizkariak.get(i).getMaiztasuna() + "]: ");
                        datua = sarrera.nextLine();
                        if(!datua.equals(""))
                        {
                            maiztasuna = datua;
                            aldizkariak.get(i).setMaiztasuna(maiztasuna);
                            break;
                        }
                        else
                        {
                            throw new IllegalArgumentException("Maiztasun berria sartu behar da");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                while(true)
                {
                    try
                    {
                        System.out.print("Url[" + aldizkariak.get(i).getUrl() + "]: ");
                        datua = sarrera.nextLine();
                        if(!datua.equals(""))
                        {
                            url = datua;
                            aldizkariak.get(i).setUrl(url);
                            break;
                        }
                        else
                        {
                            throw new IllegalArgumentException("Url berria sartu behar da");
                        }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
            break;

            case 4:
            System.out.println("\n- Aldizkaria ezabatu -");
            System.out.println("----------------------------");
            System.out.print("Id-a: ");
            id = sarrera.nextInt();

            aurkitu = false;
            i = 0;
            while(i < aldizkariak.size() && aurkitu == false)
            {
                if(aldizkariak.get(i).getId() == id)
                {
                    aurkitu = true;
                }
                else{
                    i++;
                }
            }
            if(aurkitu == false)
            {
                System.out.println("Ez da id hori daukan aldizkaririk aurkitu");
            }
            else{
                aldizkariak.get(i).erakutsi();
                System.out.println("Ziur zaude ezabatu nahi duzula? [Bai(1) / Ez(2)]");
                aukera = sarrera.nextInt();

                if (aukera == 1)
                {
                    aldizkariak.remove(i);
                    System.out.println("Aldizkaria ezabatu da");
                }
                else 
                {
                    System.out.println("Ez da aldizkaririk ezabatuko");
                }
            }

            break;

            case 5:

            try
            {
                f = new File(artxibo_izena);
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                i = 0;
                
                Collections.sort(aldizkariak);
            
                while (i < aldizkariak.size()) // .size metodoak, array-aren luzera neurtzen du. Zenbat elementu dituen jakiteko. 
                {
                    lerroa = aldizkariak.get(i).getId() + ";;";
                    lerroa = aldizkariak.get(i).getIzenburua();
                    lerroa = lerroa + ";;" + aldizkariak.get(i).getGaia();
                    lerroa = lerroa + ";;" + aldizkariak.get(i).getMaiztasuna();
                    lerroa = lerroa + ";;" + aldizkariak.get(i).getUrl() + "\r\n";
                    
                    bw.write(lerroa);
                    
                    i = i + 1;
                }
                bw.close();  
            }
            catch(IOException e)
            {
                System.out.printf("Salbuespena: %s\n",e);
            }    
            
            return; 
        }


    }
}