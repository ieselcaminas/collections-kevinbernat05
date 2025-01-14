package aceptaElReto.Felipe;

public class Felipe implements Comparable<Felipe> {
    private int tarea;

    public Felipe(int tarea, int duracion) {
        this.tarea = tarea;
        this.duracion = duracion;
    }

    private int duracion;

    public int getTarea() {
        return tarea;
    }

    public void setTarea(int tarea) {
        this.tarea = tarea;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int compareTo(Felipe other) {
        if (this.tarea == other.tarea) {
            return this.duracion - other.duracion;
        } else {
            return other.tarea - this.tarea;
        }
    }
    @Override
    public String toString() {
        return this.tarea + " " + this.duracion;
    }
}
