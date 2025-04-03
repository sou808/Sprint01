package com.souha.chansons.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.souha.chansons.entities.Chanson;
import com.souha.chansons.repos.ChansonRepository;

@Service
public class ChansonServiceImpl implements ChansonService {
    
    @Autowired
    private ChansonRepository chansonRepository;

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
}
