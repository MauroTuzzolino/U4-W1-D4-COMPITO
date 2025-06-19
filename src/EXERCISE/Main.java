package EXERCISE;

public class Main {
    public static void main(String[] args) {
        /* PARTE 1

        Dipendente dipendete1 = new Dipendente(33333, 375.50, Dipartimento.PRODUZIONE);
        Dipendente dipendete2 = new Dipendente(33555, 400, Dipartimento.VENDITE);
        Dipendente dipendete3 = new Dipendente(33444, 650.50, Dipartimento.AMMISTRAZIONE);

        Dipendente[] arrayDipendenti = {dipendete1, dipendete2, dipendete3};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            System.out.println("Matricola del dipendente " + (i + 1) + " :" + arrayDipendenti[i].getMatricola());
        }
        */

        Dipendente fullTime = new DipendeteFullTime(1, 2000, Dipartimento.VENDITE);
        Dipendente partTime = new DipendentePartTime(15.5, 80, 2, Dipartimento.PRODUZIONE);
        Dipendente dirigente = new Dirigente(3, Dipartimento.AMMISTRAZIONE, 3000, 800);

        Dipendente[] arrayDipendenti = {fullTime, partTime, dirigente};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            System.out.println("Matricola: " + arrayDipendenti[i].getMatricola() +
                    ", Dipartimento: " + arrayDipendenti[i].getDipartimento() +
                    ", Paga Mensile: " + arrayDipendenti[i].calculateSalary());
        }
    }
}
