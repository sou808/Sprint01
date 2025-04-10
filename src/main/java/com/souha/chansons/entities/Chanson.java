 package com.souha.chansons.entities;

import java.util.Date;
import jakarta.persistence.*;

@Entity
public class Chanson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChanson;

    private String titreChanson;
    private String type;
    private Date dateSortie;

    public Chanson() {
        super();
    }

    public Chanson(String titreChanson, String type, Date dateSortie) {
        this.titreChanson = titreChanson;
        this.type = type;
        this.dateSortie = dateSortie;
    }

    public Long getIdChanson() {
        return idChanson;
    }

    public void setIdChanson(Long idChanson) {
        this.idChanson = idChanson;
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
    @ManyToOne
    private Categorie categorie;
    public Categorie getCategorie() {
    	return categorie;
    	}
    	public void setCategorie(Categorie categorie) {
    	this.categorie = categorie;
    	}

    @Override
    public String toString() {
        return "Chanson [idChanson=" + idChanson + ", titreChanson=" + titreChanson +
               ", type=" + type + ", dateSortie=" + dateSortie + "]";
    }  
}
