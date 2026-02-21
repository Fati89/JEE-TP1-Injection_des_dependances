package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXML {
    static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");

        // cherche moi un bean qui implimente l'interface IMetier et dont le nom = metier
        // IMetier metier = (IMetier) springContext.getBean("metier");

        // cherche moi un bean qui implimente l'interface IMetier
        // avec EXEPTION si il trouve 2 objet qui implementent la meme interface
        IMetier metier = springContext.getBean(IMetier.class);
        System.out.println("RES = "+metier.calcul());
    }
}
