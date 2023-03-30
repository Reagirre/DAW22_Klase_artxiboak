// ObjetuenArrayListBat.java
// Objetuen arrayList bat sortzeko eta manipulatzeko programa
import java.util.*;

public class Kotxeak
{
    public static void main(String[] args)
    {
        Scanner sarrera = new Scanner(System.in);
        
        Kotxea kotxea; // Kotxea tipoko mikroprozesadore bariablea;
        String kodea;
        String fabrikatzailea;
        String modeloa;
        String kolorea;
        double zaldiak;
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
            System.out.println("1. Kotxea gehitu");
            System.out.println("2. Kotxea bilatu");
            System.out.println("3. Kotxea aldatu");
            System.out.println("4. Kotxea ezabatu");
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

                    // Kotxearen datuak jaso eta array-an gorde
                    System.out.println("\n- Kotxea gehitu -");
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
                            System.out.print("Fabrikatzailea: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                fabrikatzailea = datua;
                                break;
                            }
                            else 
                            {
                                throw new IllegalArgumentException("Fabrikatzailea sartzea falta da. Saiatu berriro.");
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
                            System.out.print("Kolorea: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                kolorea = datua;
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Kolorea sartzea falta da. Saiatu berriro.");
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
                            System.out.print("Zaldiak: ");
                            datua = sarrera.nextLine();
                            
                            if(!datua.equals(""))
                            {
                                try{
                                    zaldiak = Double.parseDouble(datua);
                                }
                                catch(NumberFormatException e)
                                {
                                    throw new IllegalArgumentException("Zaldiak zenbaki bat izan behar da. Saiatu berriro.");
                                }
                                
                                break;
                            }
                            else
                            {
                                throw new IllegalArgumentException("Zaldiak sartzea falta da. Saiatu berriro.");
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
                    DatuBasea.gehitu(new Kotxea(kodea, fabrikatzailea, modeloa, kolorea, zaldiak, prezioa, deskontua));
                    
                    break;

                case 2:
                    
                    System.out.println("\n- Kotxea bilatu -");
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
                    
                    kotxea = DatuBasea.bilatu(kodea);
                    if(kotxea == null)
                        System.out.println("Kotxea ez da aurkitu");
                    else
                        kotxea.erakutsi();
                    break;

                case 3:

                    // mikroprozesadore baten datuak array-an aldatu
                    System.out.println("\n- Kotxea aldatu -");
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
                    
                    kotxea = DatuBasea.bilatu(kodea);

                    if (kotxea == null)
                    {
                        System.out.println("Kotxea ez da aurkitu");
                    }
                    else 
                    {
                        
                        
                        // while(true)
                        // {
                        //     try
                        //     {
                        //         System.out.print("Kodea[" + Kotxea.getKodea() + "]: ");
                        //         datua = sarrera.nextLine();

                        //         if(!datua.equals(""))
                        //         {
                        //             kodea = datua;
                        //             Kotxea.setKodea(kodea);                               
                                            
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
                                System.out.print("Fabrikatzailea[" + kotxea.getFabrikatzailea() + "]: ");
                                datua = sarrera.nextLine();

                                if(!datua.equals(""))
                                {
                                    fabrikatzailea = datua;
                                    kotxea.setFabrikatzailea(fabrikatzailea);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Fabrikatzaile berria sartu behar da");
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
                                System.out.print("Modeloa[" + kotxea.getModeloa() + "]: ");
                                datua = sarrera.nextLine();

                                if(!datua.equals(""))
                                {
                                    modeloa = datua;
                                    kotxea.setModeloa(modeloa);    
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
                                System.out.print("Kolorea[" + kotxea.getKolorea() + "]: ");
                                datua = sarrera.nextLine();
                                if(!datua.equals(""))
                                {
                                    kolorea = datua;
                                    kotxea.setKolorea(kolorea);
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
                                System.out.print("Zaldiak[" + kotxea.getZaldiak() + "]: ");
                                datua = sarrera.nextLine();
                                if(!datua.equals(""))
                                {
                                    try
                                    {
                                        zaldiak = Double.parseDouble(datua);
                                    }
                                    catch(NumberFormatException e)
                                    {
                                        throw new IllegalArgumentException("Zaldiak zenbaki bat izan behar da. Saiatu berriro."); 
                                    }
                                    kotxea.setZaldiak(zaldiak);
                                    break;
                                }
                                else
                                {
                                    throw new IllegalArgumentException("Zaldiak berria sartzea falta da. Saiatu berriro.");
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
                                System.out.print("Prezioa[" + kotxea.getPrezioa() + "]: ");
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
                                    kotxea.setPrezioa(prezioa);
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
                                System.out.print("% deskontua[" + kotxea.getDeskontua() + "]: ");
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
                                    kotxea.setPrezioa(deskontua);
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
                        DatuBasea.aldatu(kotxea);
                    }
                    
                    break;
                    
                case 4: 
                    
                    // Kasu honetan, case 2-ko kodigoa hartu dugu, eta Kotxeak.get(i) barik, .remove(i) egin diogu
                     
                    System.out.println("\n- Kotxea ezabatu -");
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
                    
                    kotxea = DatuBasea.bilatu(kodea);
                    
                    if (kotxea == null)
                    {
                        System.out.println("Kotxea ez da aurkitu");
                    }
                    else 
                    {
                        kotxea.erakutsi();
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
                                        System.out.println("Kotxea ezabatu da");
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Kotxea ez da ezabatu");
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
