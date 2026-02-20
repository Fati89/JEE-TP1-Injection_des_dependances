package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    /*
     * pour injecter dans l'attribut dao
     * un OBJET qui implémente l'interface IDao
     * au moment de l'instantiation
     * */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    //  à utiliser avec setter
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*10;
        return res;
    }

    /*
    * pour injecter dans l'attribut dao
    * un OBJET qui implémente l'interface IDao
    * apres instantiation
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
