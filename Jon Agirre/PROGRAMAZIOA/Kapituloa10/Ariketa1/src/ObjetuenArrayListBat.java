// ObjetuenArrayListBat.java
// Objetuen arrayList bat sortzeko eta manipulatzeko programa
import java.util.*;

public class ObjetuenArrayListBat
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        Mikroprozesadorea mikroprozesadorea; // Mikroprozesadorea tipoko mikroprozesadore bariablea;
        String kodea;
        String ekoizlea;
        String modeloa;
        String socketa;
        double frekuentzia;
        double prezioa;
        int deskontua;
        int aukera;
        
        String datua;
        
        
        // amaigabeko buklea (erabiltzaileak irtetzea erabakitzen duen arte)
        while (true)
        {
            // menua erakutsi eta aukera jaso
            System.out.println("\n- Menua -");
            System.out.println("---------");
            System.out.println("1. Mikroprozesadorea gehitu");
            System.out.println("2. Mikroprozesadorea bilatu");
            System.out.println("3. Mikroprozesadorea aldatu");
            System.out.println("4. Mikroprozesadorea ezabatu");
            System.out.println("5. Irten");

            while(true)
            {
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
            
            // tratamendua aukeraren arabera egin
            switch (aukera)
            {
                case 1:

                    // mikroprozesadorearen datuak jaso eta array-an gorde
                    System.out.println("\n- Mikroprozesadorea gehitu -");
                    System.out.println("----------------------------");
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Kodea: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                kodea = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Kodea sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Ekoizlea: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                ekoizlea = datua;
                                break;
                            }
                            else 
                            {
                                throw new IllegalArgumentException("Ekoizlea sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Modeloa: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                modeloa = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Modeloa sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Socketa: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                socketa = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Socketa sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Frekuentzia: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                try{
                                    frekuentzia = Double.parseDouble(datua);
                                }
                                catch(NumberFormatException e)
                                {
                                    throw new IllegalArgumentException("Frekuentzia zenbaki bat izan behar da. Saiatu berriro.");
                                }
                                
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Frekuentzia sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Prezioa: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                try
                                {
                                    prezioa = Double.parseDouble(datua);
                                }
                                catch(NumberFormatException e)
                                {
                                    throw new IllegalArgumentException("Prezioa zenbaki bat izan behar da. Saiatu berriro.");
                                }
                                
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Prezioa sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    
                    while (true)
                    {  
                        try
                        {
                            System.out.print("% deskontua: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                try
                                {
                                    deskontua = Integer.parseInt(datua);
                                }
                                catch(NumberFormatException e)
                                {
                                    throw new IllegalArgumentException("Prezioa zenbaki bat izan behar da. Saiatu berriro.");
                                }
                                
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Deskontua sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    DatuBasea.gehitu(new Mikroprozesadorea(kodea, ekoizlea, modeloa, socketa, frekuentzia, prezioa, deskontua));
                    
                    break;

                case 2:
                    
                    System.out.println("\n- Mikroprozesadorea bilatu -");
                    System.out.println("----------------------------");
                    System.out.print("Kodea: ");
                    datua = sarrera.nextLine();
                    
                    while (true)
                    {  
                        try
                        {
                            
                            if(!datua.equals(""))
                            {
                                kodea = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Kodea sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    mikroprozesadorea = DatuBasea.bilatu(kodea);
                    if(mikroprozesadorea == null)
                        System.out.println("Mikroprozesadorea ez da aurkitu");
                    else
                        mikroprozesadorea.erakutsi();
                    break;

                case 3:

                    // mikroprozesadore baten datuak array-an aldatu
                    System.out.println("\n- Mikroprozesadorea aldatu -");
                    System.out.println("----------------------------");
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Kodea: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                kodea = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Kodea sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    mikroprozesadorea = DatuBasea.bilatu(kodea);

                    if (mikroprozesadorea == null)
                    {
                        System.out.println("Mikroprozesadorea ez da aurkitu");
                    }
                    else 
                    {
                        
                        
                        // while(true)
                        // {
                        //     try
                        //     {
                        //         System.out.print("Kodea[" + mikroprozesadorea.getKodea() + "]: ");
                        //         datua = sarrera.nextLine();

                        //         if(!datua.equals(""))
                        //         {
                        //             kodea = datua;
                        //             mikroprozesadorea.setKodea(kodea);                               
                                            
                        //         }
                        //         else
                        //         {
                        //             break;
                        //         }
                        //     }
                        //     catch(IllegalArgumentException e)
                        //     {
                        //         System.out.println(e.getMessage());
                        //     }
                        // }
                        
                        while(true)
                        {
                            try
                            {
                                System.out.print("Ekoizlea[" + mikroprozesadorea.getEkoizlea() + "]: ");
                                datua = sarrera.nextLine();

                                if(!datua.equals(""))
                                {
                                    ekoizlea = datua;
                                    mikroprozesadorea.setEkoizlea(ekoizlea);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Ekoizle berria sartu behar da");
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
                                System.out.print("Modeloa[" + mikroprozesadorea.getModeloa() + "]: ");
                                datua = sarrera.nextLine();

                                if(!datua.equals(""))
                                {
                                    modeloa = datua;
                                    mikroprozesadorea.setModeloa(modeloa);    
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Modelo berria sartu behar da");
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
                                System.out.print("Socketa[" + mikroprozesadorea.getSocketa() + "]: ");
                                datua = sarrera.nextLine();
                                if(!datua.equals(""))
                                {
                                    socketa = datua;
                                    mikroprozesadorea.setSocketa(socketa);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Socket berria sartu behar da");
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
                                System.out.print("Frekuentzia[" + mikroprozesadorea.getFrekuentzia() + "]: ");
                                datua = sarrera.nextLine();
                                if(!datua.equals(""))
                                {
                                    try
                                    {
                                        frekuentzia = Double.parseDouble(datua);
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        throw new IllegalArgumentException("Frekuentzia zenbaki bat izan behar da. Saiatu berriro."); 
                                    }
                                    mikroprozesadorea.setFrekuentzia(frekuentzia);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Frekuentzia berria sartzea falta da. Saiatu berriro.");
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
                                System.out.print("Prezioa[" + mikroprozesadorea.getPrezioa() + "]: ");
                                datua = sarrera.nextLine();
                                if(!datua.equals(""))
                                {
                                    try
                                    {
                                        prezioa = Double.parseDouble(datua);
                                        
                                    }
                                    catch (NumberFormatException e)
                                    {
                                        throw new IllegalArgumentException("Prezioa zenbaki bat izan behar da. Saiatu berriro.");
                                    }
                                    mikroprozesadorea.setPrezioa(prezioa);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Prezio berria sartzea falta da. Saiatu berriro.");
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
                                System.out.print("% deskontua[" + mikroprozesadorea.getDeskontua() + "]: ");
                                datua = sarrera.nextLine();
                                if(!datua.equals(""))
                                {
                                    try
                                    {
                                    deskontua = Integer.parseInt(datua);
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        throw new IllegalArgumentException("Deskontua zenbaki oso bat izan behar da. Saiatu berriro.");
                                    }
                                    mikroprozesadorea.setPrezioa(deskontua);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Deskontu berria sartzea falta da. Saiatu berriro.");
                                }
                            }
                            catch(IllegalArgumentException e)
                            {
                                System.out.println(e.getMessage());
                            }
                        }
                        DatuBasea.aldatu(mikroprozesadorea);
                    }
                    
                    break;
                    
                case 4: 
                    
                    // Kasu honetan, case 2-ko kodigoa hartu dugu, eta mikroprozesadoreak.get(i) barik, .remove(i) egin diogu
                     
                    System.out.println("\n- Mikroprozesadorea ezabatu -");
                    System.out.println("----------------------------");
                    while (true)
                    {  
                        try
                        {
                            System.out.print("Kodea: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                kodea = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Kodea sartzea falta da. Saiatu berriro.");
                            }
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    mikroprozesadorea = DatuBasea.bilatu(kodea);
                    
                    if (mikroprozesadorea == null)
                    {
                        System.out.println("Mikroprozesadorea ez da aurkitu");
                    }
                    else 
                    {
                        mikroprozesadorea.erakutsi();
                        while (true)
                        {
                            try
                            {
                                System.out.print("Ziur zaude (bai(1)/ez(2))? ");
                                datua = sarrera.nextLine();

                                if (!datua.equals(""))
                                {
                                    try
                                    {
                                        aukera = Integer.parseInt(datua);
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        throw new IllegalArgumentException("Aukera zenbaki bat izan behar da. Saiatu berriro.");
                                    }

                                    if (aukera < 1 || aukera > 2)
                                    {
                                        throw new IllegalArgumentException("Aukera 1 zenbakia edo 2 zenbakia izan behar da. Saiatu berriro.");
                                    }

                                    if (aukera == 1)
                                    {
                                        DatuBasea.ezabatu(kodea);
                                        System.out.println("Mikroprozesadorea ezabatu da");
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Mikroprozesadorea ez da ezabatu");
                                        break;
                                    }
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
                    }
                    break;
                                 
                case 5:  
                    
                    return; // main metodotik irtetzeko eta programaren ejekuzioa bukatzeko

            }
        }
    } // main metodoaren bukaera
} // ObjetuenArrayBat klasearen bukaera
