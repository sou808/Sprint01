package com.souha.chansons;

import java.util.Date;
import java.util.List;

import com.souha.chansons.entities.Chanson;
import com.souha.chansons.entities.Categorie;
import com.souha.chansons.repos.ChansonRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChansonsApplicationTests {

    @Autowired
    private ChansonRepository chansonRepository;

    @Test
    public void testCreateChanson() {
        Chanson chanson = new Chanson("Lila wil Mizwed khadem", "Mizwed", new Date());
        chansonRepository.save(chanson);
    }

    @Test
    public void testFindChanson() {
        List<Chanson> chansons = chansonRepository.findByTitreChanson("Mani Nessi");
        for (Chanson c : chansons) {
            System.out.println(c);
        }
    }

    @Test
    public void testUpdateChanson() {
        Chanson chanson = chansonRepository.findById(1L).orElse(null);
        if (chanson != null) {
            chanson.setType("Reggae");
            chansonRepository.save(chanson);
            System.out.println(chanson);
        }
    }

    @Test
    public void testDeleteChanson() {
        chansonRepository.deleteById(1L);
    }

    @Test
    public void testListerToutesChansons() {
        List<Chanson> chansons = chansonRepository.findAll();
        for (Chanson chanson : chansons) {
            System.out.println(chanson);
        }
    }

    @Test
    public void testFindByTitreAndType() {
        String titre = "Love";
        String type = "Pop";

        List<Chanson> chansons = chansonRepository.findByTitreAndType(titre, type);
        for (Chanson chanson : chansons) {
            System.out.println(chanson);
        }
    }

    @Test
    public void testFindByCategorie() {
        Categorie categorie = new Categorie();
        categorie.setIdCat(1L); // Remplacer par un ID existant

        List<Chanson> chansons = chansonRepository.findByCategorie(categorie);
        for (Chanson chanson : chansons) {
            System.out.println(chanson);
        }
    }
    @Test
    public void findByCategorieIdCat()
    {
    List<Chanson> chanson = chansonRepository.findByCategorieIdCat(1L);
    for (Chanson c : chanson)
    {
    System.out.println(c);
    }
     }
    @Test
    public void testfindByOrderByTitreChansonAsc() {
        List<Chanson> chansons = chansonRepository.findByOrderByTitreChansonAsc();
        for (Chanson c : chansons) {
            System.out.println(c);
        }
    }
    @Test
    public void testTrierChansonsTitreDate() {
        List<Chanson> chansons = chansonRepository.trierChansonsTitreDate();
        for (Chanson c : chansons) {
            System.out.println(c);
        }
    }


    }
    
    
    
    
    
    
    
    
    
    
    
    
    


