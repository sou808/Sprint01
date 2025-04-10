package com.souha.chansons.repos;

import com.souha.chansons.entities.Chanson;
import com.souha.chansons.entities.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "rest")
public interface ChansonRepository extends JpaRepository<Chanson, Long> {

    // Recherche exacte par titre
    List<Chanson> findByTitreChanson(String titre);

    // Recherche par titre contenant un mot clé
    List<Chanson> findByTitreChansonContains(String titre);

    // Recherche par titre contenant un mot-clé et type spécifique
    @Query("select c from Chanson c where c.titreChanson like %:titre and c.type = :type")
    List<Chanson> findByTitreAndType(@Param("titre") String titre, @Param("type") String type);

    // Recherche par catégorie
    @Query("select c from Chanson c where c.categorie = ?1")
    List<Chanson> findByCategorie(Categorie categorie);
    List<Chanson> findByCategorieIdCat(Long id);
    List<Chanson> findByOrderByTitreChansonAsc(); // ✅ "Asc" avec seulement A majuscule
    @Query("select c from Chanson c order by c.titreChanson ASC, c.dateSortie DESC")
    List<Chanson> trierChansonsTitreDate();

}
