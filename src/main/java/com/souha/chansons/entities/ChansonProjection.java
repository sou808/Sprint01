package com.souha.chansons.entities;
import org.springframework.data.rest.core.config.Projection;
public interface ChansonProjection {

    @Projection(name = "nomProd", types = { Chanson.class })
    public interface chansonProjection {
        public String getTitreChanson();
    }

}
