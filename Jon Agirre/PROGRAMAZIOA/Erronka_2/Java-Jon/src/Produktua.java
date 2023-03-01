// import java.sql.Date;

public class Produktua 
{   
    protected String izena;
    protected String fabrikatzailea;
    protected String produkzio_data;
    protected int id;
    protected int prezioa;
    
    
    public Produktua()
    {
        
    }
    public Produktua(int id, String izena, String fabrikatzailea, String produkzio_data, int prezioa)
    {   
        this.prezioa = prezioa;
        this.izena = izena;
        this.fabrikatzailea = fabrikatzailea;
        this.produkzio_data = produkzio_data;
        this.id = id;
    }
    public String getIzena() {
        return izena;
    }
    public void setIzena(String izena) {
        this.izena = izena;
    }
    public String getFabrikatzailea() {
        return fabrikatzailea;
    }
    public void setFabrikatzailea(String fabrikatzailea) {
        this.fabrikatzailea = fabrikatzailea;
    }
    public String getProdukzio_data() {
        return produkzio_data;
    }
    public void setProdukzio_data(String produkzio_data) {
        this.produkzio_data = produkzio_data;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrezioa() {
        return prezioa;
    }
    public void setPrezioa(int prezioa) {
        this.prezioa = prezioa;
    }
}