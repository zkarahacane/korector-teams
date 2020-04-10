package org.parisnanterre.korector.teams.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String mail;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "users_projets",
            joinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "projet_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<Projet> projets;
    @ManyToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private Set<Groupe> groupes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Set<Projet> getProjets() {
        return projets;
    }

    public void setProjets(Set<Projet> projets) {
        this.projets = projets;
    }
}
