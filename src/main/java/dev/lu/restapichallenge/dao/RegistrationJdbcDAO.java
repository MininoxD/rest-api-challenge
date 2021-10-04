package dev.lu.restapichallenge.dao;

import dev.lu.restapichallenge.model.Employee;
import dev.lu.restapichallenge.model.Registration;
import org.springframework.dao.DataAccessException;
import org.springframework.data.annotation.Reference;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class RegistrationJdbcDAO implements DAO<Registration> {
    private JdbcTemplate jdbcTemplate;

    RowMapper<Registration> rowMapper = (rs, rowNum)->{
        Registration registration =  new Registration();
        registration.setId(rs.getString("id"));
        registration.setEntry_date(rs.getString("entry_date"));
        registration.setEntry_time(rs.getString("entry_time"));
        registration.setDeparture_time(rs.getString("departure_time"));
        registration.setEmployeeCode(rs.getString("employeeCode"));
        return registration;
    };

    public RegistrationJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }




    @Override
    public List<Registration> list() {
        String sql = "SELECT * FROM Registration";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create(Registration registration) {
        String sql = "INSERT INTO Registration(id,entry_date,entry_time,employeeCode) values(?,?,?,?)";
        int insert = jdbcTemplate.update(sql,
                registration.getId(),
                registration.getEntry_date(),
                registration.getEntry_time(),
                registration.getEmployeeCode());
        if(insert == 1){
            System.out.println("se inserto");
        }
    }

    @Override
    public Optional<Registration> get(String id) {
        String sql = "SELECT * FROM Registration WHERE departure_time is NULL and employeeCode = ? and entry_date = ?";
        Registration registration = null;
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        try{
            registration = jdbcTemplate.queryForObject(sql, new Object[]{id,date.toString()}, rowMapper);
        }catch (DataAccessException ex){
            System.out.println(ex);
        }
        return Optional.ofNullable(registration);
    }

    @Override
    public void update(Registration registration, String id) {
        String sql  = "UPDATE Registration set departure_time = ? WHERE id = ?";
        int update = jdbcTemplate.update(sql, registration.getDeparture_time(), id);
        if(update == 1){
            System.out.println("se cambio los datos");
        }
    }

    @Override
    public Optional<Registration> getExist(String id) {
        String sql = "SELECT * FROM Registration WHERE departure_time is not NULL and employeeCode = ? and entry_date = ?";
        Registration registration = null;
        LocalDate date = LocalDate.now();
        System.out.println(date.toString());
        try{
            registration = jdbcTemplate.queryForObject(sql, new Object[]{id,date.toString()}, rowMapper);
        }catch (DataAccessException ex){
            System.out.println(ex);
        }
        return Optional.ofNullable(registration);
    }

    @Override
    public void delete(String id) {

    }
}
