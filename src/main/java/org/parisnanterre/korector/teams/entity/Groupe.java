package org.parisnanterre.korector.teams.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "groupes_users",
            joinColumns = {
                    @JoinColumn(name = "groupe_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<User> users;

    @OneToMany(mappedBy="groupe")
    private Set<Projet> projets;

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

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Projet> getProjets() {
        return projets;
    }

    public void setProjets(Set<Projet> projets) {
        this.projets = projets;
    }
}
