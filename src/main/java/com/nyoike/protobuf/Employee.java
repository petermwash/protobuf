package com.nyoike.protobuf;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private List<Department> departments;
    private Map<String, String> addressMap;
    private boolean isActive;
    private byte[] profilePicture;
    private Instant joinDate;

    public Employee() {
    }

    public Employee(int id, String name, double salary,
                    List<Department> departments,
                    Map<String, String> addressMap,
                    boolean isActive,
                    byte[] profilePicture,
                    Instant joinDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departments = departments;
        this.addressMap = addressMap;
        this.isActive = isActive;
        this.profilePicture = profilePicture;
        this.joinDate = joinDate;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) { this.departments = departments; }

    public Map<String, String> getAddressMap() { return addressMap; }
    public void setAddressMap(Map<String, String> addressMap) { this.addressMap = addressMap; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public byte[] getProfilePicture() { return profilePicture; }
    public void setProfilePicture(byte[] profilePicture) { this.profilePicture = profilePicture; }

    public Instant getJoinDate() { return joinDate; }
    public void setJoinDate(Instant joinDate) { this.joinDate = joinDate; }
}
