
package modelo;

public class Inventario {
    private int id;
    private String Fech_in;
    private String Fech_fin;

    public Inventario(){
        
    }

    public Inventario(int id, String Fech_in, String Fech_fin) {
        this.id = id;
        this.Fech_in = Fech_in;
        this.Fech_fin = Fech_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFech_in() {
        return Fech_in;
    }

    public void setFech_in(String Fech_in) {
        this.Fech_in = Fech_in;
    }

    public String getFech_fin() {
        return Fech_fin;
    }

    public void setFech_fin(String Fech_fin) {
        this.Fech_fin = Fech_fin;
    }
    
    
}
