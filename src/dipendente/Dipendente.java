package dipendente;

public class Dipendente {

    private final long stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;

    ;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {

        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;

    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public static double calcolaPaga(Dipendente dipendente) {
        System.out.println("la paga è di: " + dipendente.stipendio);
        return dipendente.stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente, double ore) {
        double stipendio = dipendente.stipendio + (ore * dipendente.importoOrarioStraordinario);
        System.out.println("la paga è di: " + stipendio);
        return stipendio;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola dipendente: " + this.matricola + ", livello: " + this.livello + ", dipartimento: " + this.dipartimento + ", stipendio: " + this.stipendio + ", importo orario straordinario: " + this.importoOrarioStraordinario);
    }

    public double stipendio(Livello livello) {
        if (this.livello.equals(Livello.IMPIEGATO)) {
            return this.stipendio = stipendioBase * 1.2;
        } else if (this.livello.equals(Livello.QUADRO)) {
            return this.stipendio = stipendioBase * 1.5;
        } else if (this.livello.equals(Livello.DIRIGENTE)) {
            return this.stipendio = stipendioBase * 2;
        } else {
            System.err.println("nessun aumento disponibile");
            return 0;
        }
    }

    public double promuovi() {
        if (this.livello.equals(Livello.OPERAIO)) {

            this.livello = Livello.IMPIEGATO;
            return stipendio(this.livello);
        } else if (this.livello.equals(Livello.IMPIEGATO)) {

            this.livello = Livello.QUADRO;
            return stipendio(this.livello);
        } else if (this.livello.equals(Livello.QUADRO)) {
            this.livello = Livello.DIRIGENTE;
            return stipendio(this.livello);

        } else {
            System.err.println("un dirigente non può essere promosso ad un livello superiore");
            return 0;
        }

    }

    public long getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


}
