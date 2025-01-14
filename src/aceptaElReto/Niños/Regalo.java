package aceptaElReto.Niños;

public class Regalo implements Comparable<Regalo> {
    private int rank;
    private int peso;

    public Regalo(int rank, int peso) {
        this.rank = rank;
        this.peso = peso;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return this.rank + " " + this.peso;
    }
    @Override
    public int compareTo(Regalo other){
        if(this.rank == other.getRank()){
            return this.peso - other.getPeso();
        } else {
            return other.rank - this.getRank();
        }
    }
}
