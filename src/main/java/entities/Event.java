package entities;

import enums.TipoEvento;
import org.hibernate.type.DateType;

import javax.persistence.*;

@Entity
@Table(name = "evento")
public class Event {
    @Id
    @GeneratedValue
    private long eventId;
    private String titolo;
    private DateType dataEvento;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private int numeroMassimoPartecipanti;

}
