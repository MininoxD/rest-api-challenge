package dev.lu.restapichallenge.model;

public class Administrator {
    private String id;
    private String email;
    private String password;
    private String employeeCode;

    public Administrator() {

    }

    public Administrator(String id, String email, String password, String employeeCode) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.employeeCode = employeeCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
