package Comparable;

public class Human implements Comparable<Human> {
    private String firstName;
    private Double salario;

    public Human(String firstName, Double salario) {
        this.firstName = firstName;
        this.salario = salario;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return firstName + ": " + salario;
    }

    @Override
    public int compareTo(Human otro) {
        if(this.salario == otro.salario){
            return 0;
        } else if(this.salario > otro.salario){
            return 1;
        } else {
            return -1;
        }
    }

}
