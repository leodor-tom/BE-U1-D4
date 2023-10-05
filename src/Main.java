import dipendente.Dipendente;

import static dipendente.Dipendente.calcolaPaga;

public class Main {
    public static void main(String[] args) {

        Dipendente claudio = new Dipendente(333, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente fabio = new Dipendente(345, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente luigi = new Dipendente(879, 2000, 15, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente forest = new Dipendente(001, 3000, 45, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);

        claudio.promuovi();
        luigi.promuovi();

        claudio.stampaDatiDipendente();
        fabio.stampaDatiDipendente();
        luigi.stampaDatiDipendente();
        forest.stampaDatiDipendente();

        double costoDipendenti = calcolaPaga(claudio, 5) + calcolaPaga(fabio, 5) + calcolaPaga(luigi, 5) + calcolaPaga(forest, 5);

        System.out.println(costoDipendenti);
    }
}