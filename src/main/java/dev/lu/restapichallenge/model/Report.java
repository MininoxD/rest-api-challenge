package dev.lu.restapichallenge.model;

public class Report {
    private String id;
    private String entry_date;
    private String entry_time;
    private String departure_time;
    private String name;
    private String last_name_f;
    private String last_name_m;
    private String name_payroll;
    private String name_modality;

    public Report() {
    }

    public Report(String id, String entry_date, String entry_time, String departure_time, String name, String last_name_f, String last_name_m, String name_payroll, String name_modality) {
        this.id = id;
        this.entry_date = entry_date;
        this.entry_time = entry_time;
        this.departure_time = departure_time;
        this.name = name;
        this.last_name_f = last_name_f;
        this.last_name_m = last_name_m;
        this.name_payroll = name_payroll;
        this.name_modality = name_modality;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name_f() {
        return last_name_f;
    }

    public void setLast_name_f(String last_name_f) {
        this.last_name_f = last_name_f;
    }

    public String getLast_name_m() {
        return last_name_m;
    }

    public void setLast_name_m(String last_name_m) {
        this.last_name_m = last_name_m;
    }

    public String getName_payroll() {
        return name_payroll;
    }

    public void setName_payroll(String name_payroll) {
        this.name_payroll = name_payroll;
    }

    public String getName_modality() {
        return name_modality;
    }

    public void setName_modality(String name_modality) {
        this.name_modality = name_modality;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id='" + id + '\'' +
                ", entry_date='" + entry_date + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", departure_time='" + departure_time + '\'' +
                ", name='" + name + '\'' +
                ", last_name_f='" + last_name_f + '\'' +
                ", last_name_m='" + last_name_m + '\'' +
                ", name_payroll='" + name_payroll + '\'' +
                ", name_modality='" + name_modality + '\'' +
                '}';
    }
}
