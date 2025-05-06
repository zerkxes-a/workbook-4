package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department ;
    private double payRate;
    private double hoursWorked;
    private double inTime;


    public Employee(int employeeId, double hoursWorked, double payRate, String name, String department) {
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    //set upper bounds of what reg hours can be
    public double getRegularHours(){
        return Math.min(40, hoursWorked);
    }
    //set lowest number for what overtime can be
    public double getOvertimeHours(){
        return Math.max(0, hoursWorked -40);
    }
    public double getTotalPay(){
        return ((payRate * getRegularHours()) + ((payRate * 1.5) * getOvertimeHours()));
    }
//todO WHAT AM I DOING HERE SYNTAX GODS PLEASE HELP ME
    public void punchIn(double time){
         this.inTime = time;
    }
    public void punchIn(){
        time = LocalDateTime.time();
    }

//TODO AGAIN ANNA W H A T
    public void punchOut(double time){
        hoursWorked += time - inTime;
    }
    public void punchOut(){

    }
}
