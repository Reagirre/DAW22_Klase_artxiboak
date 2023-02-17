public class Publikazioa
{
    int id;
    String izenburua;

    public Publikazioa() {
        
    }

    public Publikazioa(int id, String izenburua) {
        this.id = id;
        this.izenburua = izenburua;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setIzenburua(String izenburua) {
        this.izenburua = izenburua;
    }
    public String getIzenburua() {
        return izenburua;
    }
}