package cinema.Controllers;

import cinema.Services.SalleService;
import cinema.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(produces = "application/json", path ="/cinema")
public class SalleController {


    @Autowired
    private SalleService salleService;

    @GetMapping("/afficherSalles")
    public List<Salle> getAll(){
        return salleService.getAllSalles();
    }

    @GetMapping("/afficherById/Id")
    public Salle getSalleById(@PathVariable Long id){
        return salleService.findSalleById(id);
    }

    @GetMapping("/afficherByName/nom")
    public Salle getSalleByName(@PathVariable String nom){
        return salleService.findSalleByName(nom);
    }

    @GetMapping("/afficherByAdresse/adresse")
    public Salle getSalleByAdresse(@PathVariable String adresse){
        return salleService.getSalleByAdresse(adresse);
    }

    @GetMapping("/afficherByType/type")
    public Salle getSalleByType(@PathVariable String type){
        return salleService.getSalleByType(type);
    }

    @GetMapping("/afficherByStatus/status")
    public Salle getSalleByStatus(@PathVariable String status){
        return salleService.getSalleByStatus(status);
    }



}
