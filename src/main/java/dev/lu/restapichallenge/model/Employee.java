package dev.lu.restapichallenge.model;

public class Employee {
    private String code;
    private String name;
    private String last_name_f;
    private String last_name_m;
    private String payroll;
    private String modality;

    public Employee() {
    }

    public Employee(String code, String name, String last_name_f, String last_name_m, String payroll, String modality) {
        this.code = code;
        this.name = name;
        this.last_name_f = last_name_f;
        this.last_name_m = last_name_m;
        this.payroll = payroll;
        this.modality = modality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getPayroll() {
        return payroll;
    }

    public void setPayroll(String payroll) {
        this.payroll = payroll;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", last_name_f='" + last_name_f + '\'' +
                ", last_name_m='" + last_name_m + '\'' +
                ", payroll='" + payroll + '\'' +
                ", modality='" + modality + '\'' +
                '}';
    }
}
