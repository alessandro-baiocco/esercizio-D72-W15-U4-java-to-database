package entities;

import javax.persistence.EntityManager;

public class EventDAO {
    private EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }


}
