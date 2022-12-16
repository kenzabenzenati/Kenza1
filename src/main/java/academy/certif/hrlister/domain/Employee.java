package academy.certif.hrlister.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
    private String firstname;
    private String lastname;
    private float salary;

    Employee() {}

    Employee(String firstname, String lastname, float salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public Long getId() {
        return this.id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}