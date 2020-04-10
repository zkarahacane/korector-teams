package org.parisnanterre.korector.teams.repository;

import org.parisnanterre.korector.teams.entity.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
}
