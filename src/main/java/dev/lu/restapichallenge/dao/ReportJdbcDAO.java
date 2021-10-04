package dev.lu.restapichallenge.dao;


import dev.lu.restapichallenge.model.Report;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ReportJdbcDAO implements  DAO<Report> {
    private JdbcTemplate jdbcTemplate;

    public ReportJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    RowMapper<Report> rowMapper = (rs, rowNum)->{
        Report report = new Report();
        report.setId(rs.getString("id"));
        report.setEntry_date(rs.getString("entry_date"));
        report.setEntry_time(rs.getString("entry_time"));
        report.setDeparture_time(rs.getString("departure_time"));
        report.setName(rs.getString("name_employee"));
        report.setLast_name_f(rs.getString("last_name_f"));
        report.setLast_name_m(rs.getString("last_name_m"));
        report.setName_payroll(rs.getString("name_payroll"));
        report.setName_modality(rs.getString("name_modality"));
        return report;
    };

    @Override
    public List<Report> list() {
        String sql = "SELECT * FROM report";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create(Report report) {

    }

    @Override
    public Optional<Report> get(String id) {
        return Optional.empty();
    }

    @Override
    public void update(Report report, String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Optional<Report> getExist(String id) {
        return Optional.empty();
    }


}
