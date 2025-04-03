package com.souha.chansons.Service;


import java.util.List;
import com.souha.chansons.entities.Chanson;

public interface ChansonService {
    Chanson saveChanson(Chanson c);
    Chanson updateChanson(Chanson c);
    void deleteChanson(Chanson c);
    void deleteChansonById(Long id);
    Chanson getChanson(Long id);
    List<Chanson> getAllChansons();
}
