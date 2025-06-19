package EXERCISE;

public class DipendeteFullTime extends Dipendente {

    private double stipendioMensile;

    public DipendeteFullTime(int matricola, double stipendioMensile, Dipartimento dipartimento) {
        super(matricola, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
