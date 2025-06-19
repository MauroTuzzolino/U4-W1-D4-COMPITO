package EXERCISE;

public class Volontario implements WorkStart {

    private String nome;
    private int età;
    private String CV;

    public Volontario(String nome, int età, String CV) {
        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    public String getCV() {
        return CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + nome + " ha iniziato il turno.");
    }
}
