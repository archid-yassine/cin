package cinema;

import cinema.entities.Salle;
import cinema.enume.Status;
import cinema.enume.Type;
import cinema.repositories.SalleRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

   @Autowired
    private SalleRepos salleRepos;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       for(int i=1;i<11;i++){
                 salleRepos.save((
                         new Salle(null,"salle:"+i,"adresse:"+i,new Date(),15+i,
                                 (i%2 ==0) ? Status.Fermer :Status.Ouverte,
                                 (i%2 ==0) ? Type.Standart :Type.Vr))

                         );
        }
    }
}
