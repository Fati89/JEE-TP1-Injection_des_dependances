package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier") // créer un objet de cette classe avec le nom mitier, si on precise psa le nom il vas lui donner par défaut le meme nom de la classe
public class MetierImpl implements IMetier {
    @Autowired // injection automatique d'un objet idao
    @Qualifier("d") // on utilise cette methode ou l'autre de constructeur
    private IDao dao;

    /*
     * pour injecter dans l'attribut dao
     * un OBJET qui implémente l'interface IDao
     * au moment de l'instantiation
     * */
    public MetierImpl(/*@Qualifier("dv2")*/ IDao dao) { // Qualifier pour preciser quelle objet IDao a injecter
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
