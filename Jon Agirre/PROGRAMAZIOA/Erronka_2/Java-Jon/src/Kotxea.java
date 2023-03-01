import java.util.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
public class Kotxea extends Produktua
{
    String modeloa;
    String kolorea;
    int id_kotxea;
    String tipoa;
    String motorea;
    
    public Kotxea()
    {
        super();
    }
    public Kotxea(int id, String izena, String fabrikatzailea, String produkzio_data, int prezioa, int id_kotxea,String modeloa,
     String kolorea, String tipoa, String motorea)
    {
        super(id, izena, fabrikatzailea, produkzio_data, prezioa);
        this.id_kotxea = id_kotxea;
        this.modeloa = modeloa;
        this.kolorea = kolorea;
        this.tipoa = tipoa;
        this.motorea = motorea;
    }

    public String getModeloa() {
        return modeloa;
    }
    public void setModeloa(String modeloa) {
        this.modeloa = modeloa;
    }

    public String getKolorea() {
        return kolorea;
    }
    public void setKolorea(String kolorea) {
        this.kolorea = kolorea;
    }

    public int getId_kotxea() {
        return id_kotxea;
    }
    public void setId_kotxea(int id_kotxea) {
        this.id_kotxea = id_kotxea;
    }

    public String getTipoa() {
        return tipoa;
    }
    public void setTipoa(String tipoa) {
        this.tipoa = tipoa;
    }
    
    public String getMotorea() {
        return motorea;
    }
    public void setMotorea(String motorea) {
        this.motorea = motorea;
    }
    public String idatzi() {
        return getId() + "," + getIzena() + "," + getFabrikatzailea() + "," + getProdukzio_data() + "," + getPrezioa() + "," + id_kotxea
        + "," + modeloa + "," + kolorea + "," + tipoa + "," + motorea + ",";
    }
    public static boolean konprobatu(int x, int zein) 
    {
        boolean result = false;
        String kotxeak = "lib/Kotxeak.csv";
        String y;
        String x_x;
        x_x = Integer.toString(x);
        try {
            File kotxeakIra = new File(kotxeak);
            Scanner reader = new Scanner(kotxeakIra);
            String strin;
            while(reader.hasNextLine())
            {
                strin = reader.nextLine();
                int index = strin.indexOf(",");
                y = strin.substring(zein, index);
                if(x_x.equals(y))
                {
                    result = true;
                }
            }
            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public static void erakutsiKotxea(int x, int zein) throws FileNotFoundException 
    {
        ArrayList<Kotxea> kotxeak = new ArrayList<Kotxea>();
        String path = "lib/Kotxeak.csv";
        File file = new File(path);
        CSVReader csvReader = new CSVReader(new FileReader(path));
        String y;
        String x_x;
        x_x = Integer.toString(x);
        try {
            File kotxeakIra = new File(path);
            Scanner reader = new Scanner(kotxeakIra);
            String strin;
            String[] tokens = null;
            // while(reader.hasNextLine())
            while((tokens = csvReader.readNext()) != null)
            {
                Kotxea kotxe = new Kotxea();
                kotxe.setId(Integer.parseInt(tokens[0]));
                kotxe.setIzena(tokens[1]);
                kotxe.setFabrikatzailea(tokens[2]);

                kotxeak.add(kotxe);

                //codigo para buscar
                strin = reader.nextLine();
                int index = strin.indexOf(",");
                y = strin.substring(zein, index);
                if(x_x.equals(y))
                {
                    System.out.println("Kotxea fIND");
                    System.out.print(kotxe.idatzi());


                    // ------------------------------------------------ cambiar
                    Scanner in = new Scanner(System.in);
                    System.out.print("\nQue valor desea cambiar? \n");
                    String[] cambios = { "id", "IZENA"};
                    for (int j = 0; j < cambios.length; j++) {
                        System.out.printf("%d - %s:\n", j + 1, cambios[j]);
                    }
                    int op = in.nextInt();
                    String keychange;

                    switch (op) {
                        case 1: // ID
                            System.out.printf("\nValor anterior: %s", kotxe.getId());
                            System.out.print("\nIngrese nuevo valor: ");
                            keychange = in.next();
                            kotxe.setId(Integer.parseInt(keychange));
                            System.out.printf("\nValor Nuevo: %s", kotxe.getId());
                            kotxe.idatzi();
                            break;
                        case 2: // IZENA
                            System.out.printf("\nValor anterior: %s", kotxe.getIzena());
                            System.out.print("\nIngrese nuevo valor: ");
                            keychange = in.next();
                            kotxe.setIzena(keychange);
                            System.out.printf("\nValor Nuevo: %s", kotxe.getIzena());
                            kotxe.idatzi();
                            break;
                }

                // Scanner in = new Scanner(System.in);
                System.out.print("\nDesea grabar la informacion en el Fichero CSV?:\n- Presione S para grabar\n- Presione otra tecla para ingresar los valores nuevamente\n- Presione N para No Guardar y SALIR: ");
                String key = in.next();
    
                if (key.equalsIgnoreCase("s")) {
                    // if(loop == "S" || loop == "s"){
                    try {
                                    //-------------------------------------------PARA BORRAR EL ITEM
                        CSVReader reader2 = new CSVReader(new FileReader(path));
                        List<String[]> allElements = reader2.readAll();
                        // allElements.remove(i);
                        FileWriter sw = new FileWriter(path);
                        CSVWriter writer = new CSVWriter(sw);
                        writer.writeAll(allElements, false);
                        writer.close();
    
    
                        FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        // bw.write("\n"+tecladoFind.toString()); este es otro
                        bw.write(kotxe.idatzi());
                        bw.close();
                        System.out.printf("\nInformación guardada satisfactoriamente en: %s\n", path);
    
                    } catch (IOException e) {
                        System.out.println(e);
    
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                } else if (key.equalsIgnoreCase("n")) {
    
                    Kotxeak.main(null);
                } else {
                    Kotxeak.main(null);
                    // Kotxeak.funcionActualizar(path);
                }
    
            }
        }

        // imprimir en consola
            System.out.println("\nLista de kotxeak");
            for (int i = 0; i < kotxeak.size(); i++) {
                System.out.println(kotxeak.get(i).idatzi());
            }




            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
