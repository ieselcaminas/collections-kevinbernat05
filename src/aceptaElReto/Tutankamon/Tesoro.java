package aceptaElReto.Tutankamon;

public class Tesoro implements Comparable<Tesoro> {
    private String nombre;
    private int valor;
    private int peso;
    private int orden;

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Tesoro(String nombre, int valor, int peso, int orden) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return nombre + " ";
    }
    @Override
    public int compareTo(Tesoro other) {
        if (this.valor == other.valor && this.peso == other.peso) {
            return this.orden - other.orden;
        } else if (this.valor == other.valor) {
            return other.peso - this.peso;
        } else {
            return this.valor - other.valor;
        }
    }

}
