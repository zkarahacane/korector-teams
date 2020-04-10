package org.parisnanterre.korector.teams.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomProjet;
    @ManyToMany(mappedBy = "projets", fetch = FetchType.LAZY)
    private Set<User> users;
    @ManyToOne
    @JoinColumn(name="groupe_id", nullable=true)
    private Groupe groupe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
}
