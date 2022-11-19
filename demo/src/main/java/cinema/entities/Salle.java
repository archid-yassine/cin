package cinema.entities;

import ch.qos.logback.core.status.Status;
import cinema.enume.Status;
import cinema.enume.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nom;
    @Column(nullable = false)
    private String adresse;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date_de_creation;
    @Column(nullable = false)
    private int nbr_chaises;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type type;

}
