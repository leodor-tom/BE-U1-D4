import dipendente.Dipartimento;
import dipendente.Dipendente;
import dipendente.Livello;

import static dipendente.Dipendente.calcolaPaga;

public class Main {
    public static void main(String[] args) {

        Dipendente claudio = new Dipendente(333, Dipartimento.PRODUZIONE);
        Dipendente fabio = new Dipendente(345, Dipartimento.PRODUZIONE);
        Dipendente luigi = new Dipendente(879, 2000, 15, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente forest = new Dipendente(001, 3000, 45, Livello.DIRIGENTE, Dipartimento.VENDITE);

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