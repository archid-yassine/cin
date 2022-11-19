package cinema.Services;

import cinema.entities.Salle;
import cinema.repositories.SalleRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleService {
    @Autowired
    private SalleRepos salleRepos;

    public List<Salle> getAllSalles() {
        return salleRepos.findAll();
    }

    public Salle findSalleById(Long id) {
            return salleRepos.getById(id);
    }

    public Salle findSalleByName(String nom) {
        return salleRepos.getSalleByNom(nom);
    }

    public Salle getSalleByAdresse(String adresse) {
        return salleRepos.getSalleByAdresse(adresse);
    }

    public Salle getSalleByType(String type) {
        return salleRepos.getSalleByType(type);
    }

    public Salle getSalleByStatus(String status) {
        return salleRepos.getSalleByStatus(status);
    }
}
