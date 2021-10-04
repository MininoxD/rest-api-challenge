package dev.lu.restapichallenge.controller;

import dev.lu.restapichallenge.dao.DAO;
import dev.lu.restapichallenge.model.Report;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RestReport {

    private static DAO<Report> dao;

    public RestReport(DAO<Report> dao) {
        this.dao = dao;
    }

    @GetMapping("/report")
    public List<Report> getMessage(){
        List<Report> reports = dao.list();
        return reports;
    }
}
