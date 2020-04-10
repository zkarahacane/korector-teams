package org.parisnanterre.korector.teams.payload.response;

import java.io.Serializable;

public class GroupeResponse implements Serializable {

    private Long id;

    private String nom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
