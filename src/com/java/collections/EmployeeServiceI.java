package com.java.collections;

public interface EmployeeServiceI {
    public void addEmpDetails(Employee employee);
    public void inqEmpDetails();
    public void updEmpDetails(int id);
    public void deleteEmpDetails(int id);

    int inqEmpById(int id);
}
