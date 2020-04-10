package org.parisnanterre.korector.teams;

import org.parisnanterre.korector.teams.entity.Groupe;
import org.parisnanterre.korector.teams.repository.GroupeRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestData {

    private final GroupeRepository groupeRepository;

    public TestData(GroupeRepository groupeRepository){
        this.groupeRepository = groupeRepository;
    }

    @PostConstruct
    public void init(){
        Groupe groupe = new Groupe();
        groupe.setNom("Zaklebg");
        groupeRepository.save(groupe);
    }

}
