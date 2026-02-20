package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        // IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        // Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class); // nom de mathode + types des parametres
        // setDao.invoke(metier, dao); // on appel la methode setDao de l'objet metier et on la transmis le parametre dao
        // // ceci s'appel la programmation dynamique

        System.out.println("RES = "+metier.calcul());
    }
}
