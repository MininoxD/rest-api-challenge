package dev.lu.restapichallenge.controller;

import dev.lu.restapichallenge.dao.LOG;
import dev.lu.restapichallenge.model.Administrator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
public class RestAdministrator {
    private LOG<Administrator> log;

    public RestAdministrator(LOG<Administrator> log) {
        this.log = log;
    }

    @PostMapping("/login")
    public Administrator login(@RequestBody Administrator administrator){
        Optional<Administrator> returnadmin = log.get(administrator);
        return returnadmin.get();
    }
}
