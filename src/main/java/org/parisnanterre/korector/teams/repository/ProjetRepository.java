package org.parisnanterre.korector.teams.repository;

import org.parisnanterre.korector.teams.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
