package cinema.repositories;

import cinema.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Enumerated;
import java.util.List;


@RepositoryRestResource
public interface SalleRepos extends JpaRepository<Salle, Long> {
     Salle getSalleByNom(String nom);
     Salle getSalleByAdresse(String adresse);

     Salle getSalleByType(String type);
     Salle getSalleByStatus(String status);

}


