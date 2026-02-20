package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Pres1 {
    static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        // metier.setDao(d); // Injection via setter

        System.out.println("RES = "+metier.calcul());
    }
}
