package dev.lu.restapichallenge.model;

public class Registration {

    private String id;
    private String entry_date;
    private String entry_time;
    private String departure_time;
    private String employeeCode;

    public Registration() {
    }

    public Registration(String id, String entry_date, String entry_time, String departure_time, String employeeCode) {
        this.id = id;
        this.entry_date = entry_date;
        this.entry_time = entry_time;
        this.departure_time = departure_time;
        this.employeeCode = employeeCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(String entry_date) {
        this.entry_date = entry_date;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id='" + id + '\'' +
                ", entry_date='" + entry_date + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", departure_time='" + departure_time + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
