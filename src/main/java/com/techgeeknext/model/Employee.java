package com.techgeeknext.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends PanacheEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
