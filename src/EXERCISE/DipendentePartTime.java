package EXERCISE;

public class DipendentePartTime extends Dipendente {
    private double pagaOraria;
    private int oreLavoro;

    public DipendentePartTime(double pagaOraria, int oreLavoro, int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavoro = oreLavoro;
    }

    @Override
    public double calculateSalary() {
        return oreLavoro * pagaOraria;
    }
}
