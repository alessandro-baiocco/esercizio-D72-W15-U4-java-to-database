package coso;

import entities.EventDAO;
import utils.JPAutil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Application {
    private static final EntityManagerFactory emf = JPAutil.emfCreate();

    public static void main(String[] args) {

        try {
            EntityManager em = emf.createEntityManager();
            EventDAO eventDAO = new EventDAO(em);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }


        System.out.println("Hello World!");
    }
}