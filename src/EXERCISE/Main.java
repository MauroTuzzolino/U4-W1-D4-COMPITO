package EXERCISE;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendete1 = new Dipendente(33333, 375.50, Dipartimento.PRODUZIONE);
        Dipendente dipendete2 = new Dipendente(33555, 400, Dipartimento.VENDITE);
        Dipendente dipendete3 = new Dipendente(33444, 650.50, Dipartimento.AMMISTRAZIONE);

        Dipendente[] arrayDipendenti = {dipendete1, dipendete2, dipendete3};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            System.out.println("Matricola del dipendente " + (i + 1) + " :" + arrayDipendenti[i].getMatricola());
        }
    }
}
