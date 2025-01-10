package Comparable;

public class Analfabetos implements Comparable<Analfabetos> {
    private String pais;
    private int cantidad;

    public Analfabetos(String pais, int cantidad) {
        this.pais = pais;
        this.cantidad = cantidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return getPais() + " - " + getCantidad();
    }
    @Override
    public int compareTo(Analfabetos other) {
        return other.cantidad - this.cantidad;
    }


}
