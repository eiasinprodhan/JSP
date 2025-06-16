package model;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String designation;
    private float salary;

    public Employee() {
    }

    public Employee(String name, String email, String phone, String gender, String designation, float salary) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(int id, String name, String email, String phone, String gender, String designation, float salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
