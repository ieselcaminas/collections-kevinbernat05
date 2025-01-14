package aceptaElReto.Tutankamon;

public class Tesoro implements Comparable<Tesoro> {
    private String nombre;
    private int valor;
    private int peso;

    public Tesoro(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
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
        if (this.valor == other.valor) {
            return this.peso - other.peso;
        } else{
            return other.valor - this.valor;
        }
    }

}
