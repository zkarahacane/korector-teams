package org.parisnanterre.korector.teams.repository;

import org.parisnanterre.korector.teams.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
