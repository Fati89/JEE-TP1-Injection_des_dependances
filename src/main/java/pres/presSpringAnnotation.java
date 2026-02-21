package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    static void main(String[] args) {
        /*
        * on dit a spring créer les objets en se basant sur les annotations
        * il vas chercher les classes qui utilise l'Annotation component et les instancier
        * */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("dao", "metier"); // ici on le specifie les pakages ou il vas chercher
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES = "+metier.calcul());
    }
}
