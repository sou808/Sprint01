package com.souha.chansons.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.souha.chansons.entities.Chanson;
import com.souha.chansons.entities.Categorie;
import com.souha.chansons.repos.ChansonRepository;

@Service
public class ChansonServiceImpl implements ChansonService {

    @Autowired
    ChansonRepository chansonRepository;

    @Override
    public Chanson saveChanson(Chanson c) {
        return chansonRepository.save(c);
    }

    @Override
    public Chanson updateChanson(Chanson c) {
        return chansonRepository.save(c);
    }

    @Override
    public void deleteChanson(Chanson c) {
        chansonRepository.delete(c);
    }

    @Override
    public void deleteChansonById(Long id) {
        chansonRepository.deleteById(id);
    }

    @Override
    public Chanson getChanson(Long id) {
        return chansonRepository.findById(id).orElse(null);
    }

    @Override
    public List<Chanson> getAllChansons() {
        return chansonRepository.findAll();
    }

    @Override
    public Page<Chanson> getAllChansonsParPage(int page, int size) {
        return chansonRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public List<Chanson> findByTitreChanson(String titre) {
        return chansonRepository.findByTitreChanson(titre);
    }

    @Override
    public List<Chanson> findByTitreChansonContains(String titre) {
        return chansonRepository.findByTitreChansonContains(titre);
    }

    @Override
    public List<Chanson> findByTitreAndType(String titre, String type) {
        return chansonRepository.findByTitreAndType(titre, type);
    }

    @Override
    public List<Chanson> findByCategorie(Categorie categorie) {
        return chansonRepository.findByCategorie(categorie);
    }

    @Override
    public List<Chanson> findByCategorieIdCat(Long id) {
        return chansonRepository.findByCategorieIdCat(id);
    }

    @Override
    public List<Chanson> findByOrderByTitreChansonASC() {
        return chansonRepository.findByOrderByTitreChansonAsc();
    }

    @Override
    public List<Chanson> trierChansonsTitreDate() {
        return chansonRepository.trierChansonsTitreDate();
    }
}
