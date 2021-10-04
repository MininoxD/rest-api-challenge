package dev.lu.restapichallenge.dao;

import dev.lu.restapichallenge.model.Administrator;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AdministratorJdbcDAO implements LOG<Administrator> {
    private JdbcTemplate jdbcTemplate;

    public AdministratorJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    RowMapper<Administrator> rowMapper =  (rs, rowNum)->{
      Administrator administrator =  new Administrator();
      administrator.setId(rs.getString("id"));
      administrator.setEmployeeCode(rs.getString("employeeCode"));
      return  administrator;
    };

    @Override
    public Optional<Administrator> get(Administrator administrator) {
        String sql = "SELECT id, employeeCode FROM Administrator WHERE email = ? and password = ?";
        Administrator returadmin = null;
        try{
            returadmin = jdbcTemplate.queryForObject(sql, new Object[]{administrator.getEmail(), administrator.getPassword()},rowMapper);
        }catch (DataAccessException ex){
            System.out.println(ex);
        }
        System.out.println(returadmin);
        return Optional.ofNullable(returadmin);
    }
}
