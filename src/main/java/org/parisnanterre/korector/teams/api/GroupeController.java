package org.parisnanterre.korector.teams.api;

import org.parisnanterre.korector.teams.payload.response.GroupeResponse;
import org.parisnanterre.korector.teams.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/v1")
public class GroupeController {

    @Autowired
    private GroupeRepository groupeRepository;

    @RequestMapping(path = "/groupes", method = RequestMethod.GET)
    public ResponseEntity<List<GroupeResponse>> getGroupes(){
        List<GroupeResponse> groupes = new ArrayList<>();
        groupeRepository.findAll()
                .forEach(groupe -> {
            GroupeResponse groupeResponse = new GroupeResponse();
            groupeResponse.setId(groupe.getId());
            groupeResponse.setNom(groupe.getNom());
            groupes.add(groupeResponse);
        });
        return new ResponseEntity<>(groupes, HttpStatus.OK);
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test(){
        return "OK de teams";
    }
}
