package com.souha.chansons.Service;


import java.util.List;
import com.souha.chansons.entities.Chanson;
import com.souha.chansons.entities.Categorie;
import org.springframework.data.domain.Page;


public interface ChansonService {
    Chanson saveChanson(Chanson c);
    Chanson updateChanson(Chanson c);
    void deleteChanson(Chanson c);
    void deleteChansonById(Long id);
    Chanson getChanson(Long id);
    List<Chanson> getAllChansons();
    Page<Chanson> getAllChansonsParPage(int page, int size);

    List<Chanson> findByTitreChanson(String titre);
    List<Chanson> findByTitreChansonContains(String titre);
    List<Chanson> findByTitreAndType(String titre, String type);
    List<Chanson> findByCategorie(Categorie categorie);
    List<Chanson> findByCategorieIdCat(Long id);
    List<Chanson> findByOrderByTitreChansonASC();
    List<Chanson> trierChansonsTitreDate();
    
}
