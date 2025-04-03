package com.souha.chansons.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chanson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeChanson;
    private String titreChanson;
    private String type;
    private Date dateSortie;

    public Chanson() {
        super();
    }

    public Chanson(String titreChanson, String type, Date dateSortie) {
        super();
        this.titreChanson = titreChanson;
        this.type = type;
        this.dateSortie = dateSortie;
    }

    public Long getCodeChanson() {
        return codeChanson;
    }

    public void setCodeChanson(Long codeChanson) {
        this.codeChanson = codeChanson;
    }

    public String getTitreChanson() {
        return titreChanson;
    }

    public void setTitreChanson(String titreChanson) {
        this.titreChanson = titreChanson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Override
    public String toString() {
        return "Chanson [codeChanson=" + codeChanson + ", titreChanson=" + titreChanson + ", type=" + type
                + ", dateSortie=" + dateSortie + "]";
    }
}
