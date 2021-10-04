package dev.lu.restapichallenge.controller;

import dev.lu.restapichallenge.dao.DAO;
import dev.lu.restapichallenge.model.Registration;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RestRegistration {
    private static DAO<Registration> dao;

    public RestRegistration(DAO<Registration> dao) {
        this.dao = dao;
    }

    @GetMapping("/registration")
    public List<Registration> getRegistration(){
        List<Registration> registrations =  dao.list();
        return registrations;
    }
    @GetMapping("/registration/{code}")
    public Registration getExistRegistration(@PathVariable("code") String code){
        Optional<Registration> registration =  dao.get(code);
        return registration.get();
    }


    @PostMapping("/registration/{code}")
    public void setRegistration(@PathVariable("code") String code){
        String uuid = java.util.UUID.randomUUID().toString();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Registration registrationcreate = new Registration();
        registrationcreate.setId(uuid);
        registrationcreate.setEntry_date(date.toString());
        registrationcreate.setEntry_time(time.toString());
        registrationcreate.setEmployeeCode(code);
        dao.create(registrationcreate);
    }

    @PutMapping("/registration/{id}")
    public void departureTime(@PathVariable("id") String id){
        LocalTime time = LocalTime.now();
        Registration registration = new Registration();
        registration.setDeparture_time(time.toString());
        dao.update(registration, id);
    }

}
