package coso;

import entities.Event;
import entities.EventDAO;
import utils.JPAutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = JPAutil.emfCreate();

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        LocalDate data = LocalDate.now();

        try {
            EventDAO eD = new EventDAO(em);

//            Event test = new Event("test", data, TipoEvento.PRIVATO, 20);
//            eD.save(test);

            Event findTest = eD.findById(3);
            if (findTest != null) System.out.println(findTest);

            eD.delete(3);
            Event event4 = eD.findById(4);
            if (event4 != null) {
                System.out.println("--------------------------");
                event4.setTitolo("Ajeje");
                System.out.println(event4);
                eD.refresh(event4);
                System.out.println("------------------");
                System.out.println(event4);
            }


        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            em.close();
            emf.close();
        }


    }
}