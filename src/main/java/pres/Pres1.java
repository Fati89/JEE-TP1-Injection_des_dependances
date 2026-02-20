package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        // metier.setDao(d); // Injection via setter

        System.out.println("RES = "+metier.calcul());
    }
}
