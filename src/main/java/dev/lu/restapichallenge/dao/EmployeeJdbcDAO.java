package dev.lu.restapichallenge.dao;

import dev.lu.restapichallenge.model.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeJdbcDAO implements DAO<Employee> {

    private JdbcTemplate jdbcTemplate;

    RowMapper<Employee> rowMapper = (rs, rowNum)->{
        Employee employee = new Employee();
        employee.setCode(rs.getString("code"));
        employee.setName(rs.getString("name"));
        employee.setLast_name_f(rs.getString("last_name_f"));
        employee.setLast_name_m(rs.getString("last_name_m"));
        employee.setPayroll(rs.getString("payroll"));
        employee.setModality(rs.getString("modality"));
        return employee;
    };

    public EmployeeJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Employee> list() {
        String sql = "SELECT * FROM Employee";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void create(Employee employee) {
        String sql = "INSERT INTO Employee(code,name,last_name_f,last_name_m,payroll,modality) values(?,?,?,?,?,?)";
        int insert = jdbcTemplate.update(sql,
                employee.getCode(),
                employee.getName(),
                employee.getLast_name_f(),
                employee.getLast_name_m(),
                employee.getPayroll(),
                employee.getModality());
        if(insert == 1){
            System.out.println("se inserto");
        }
    }

    @Override
    public Optional<Employee> get(String id) {
        String sql = "SELECT * FROM Employee WHERE code = ?";
        Employee employee = null;
        try{
            employee = jdbcTemplate.queryForObject(sql, new Object[]{id},rowMapper);
        }catch (DataAccessException ex){
            System.out.println(ex);
        }
        return Optional.ofNullable(employee);
    }

    @Override
    public void update(Employee employee, String id) {
        String sql = "UPDATE Employee set name = ?, last_name_f = ?, last_name_m = ?, payroll = ?, modality = ? WHERE code = ?";
        int update =  jdbcTemplate.update(sql, employee.getName(), employee.getLast_name_f(), employee.getLast_name_m(), employee.getPayroll(), employee.getModality(), id);
        if(update == 1){
            System.out.println("se cambio los datos");
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM Employee WHERE code = ?";
        int update = jdbcTemplate.update(sql, id);
        if(update == 1){
            System.out.println("se elimino los datos");
        }
    }
}
