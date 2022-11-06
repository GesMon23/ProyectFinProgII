
package modelo;


public class Producto {
    private int codigo;
    private String nombre;
    private int stckInicial;
    private int Entradas;
    private int Salidas;
    private int Total=Entradas-Salidas;
 
    public Producto(){
        
    }

    public Producto(String nombre, int stckInicial, int Entradas, int Salidas) {
        this.nombre = nombre;
        this.stckInicial = stckInicial;
        this.Entradas = Entradas;
        this.Salidas = Salidas;
        this.Total = Entradas-Salidas;
    }

    public Producto(int codigo, String nombre, int stckInicial, int Entradas, int Salidas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stckInicial = stckInicial;
        this.Entradas = Entradas;
        this.Salidas = Salidas;
        this.Total = Entradas-Salidas;
    }

    public int getEntradas() {
        return Entradas;
    }

    public void setEntradas(int Entradas) {
        this.Entradas = Entradas;
    }

    public int getSalidas() {
        return Salidas;
    }

    public void setSalidas(int Salidas) {
        this.Salidas = Salidas;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStckInicial() {
        return stckInicial;
    }

    public void setStckInicial(int stckInicial) {
        this.stckInicial = stckInicial;
    }
    
}
