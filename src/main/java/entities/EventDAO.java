package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Event evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(evento);
        transaction.commit();
        System.out.println("Nuovo studente salvato correttamente");
    }


}
