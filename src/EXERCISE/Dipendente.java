package EXERCISE;

public abstract class Dipendente implements WorkStart {

    private int matricola;
    //private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, /*double stipendio,*/ Dipartimento dipartimento) {
        this.matricola = matricola;
        //this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

//    public double getStipendio() {
//        return stipendio;
//    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + matricola + " ha iniziato il turno.");
    }
}
