public class Produktua 
{   
    protected String izena;
    protected String fabrikatzailea;
    protected String produkzio_eguna;
    protected int id;
    protected int prezioa;
    
    
    public Produktua()
    {
        
    }
    public Produktua(int id, String izena, String fabrikatzailea, String produkzio_eguna, int prezioa)
    {   
        this.prezioa = prezioa;
        this.izena = izena;
        this.fabrikatzailea = fabrikatzailea;
        this.produkzio_eguna = produkzio_eguna;
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
    public String getProdukzio_eguna() {
        return produkzio_eguna;
    }
    public void setProdukzio_eguna(String produkzio_eguna) {
        this.produkzio_eguna = produkzio_eguna;
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