package com.pluralsight;

public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee(1, 0, 15, "Judy Lopez", "Front Desk");
        employee.punchIn(10);
        employee.punchOut(20);
        System.out.println(employee.getTotalPay());
    }
    public static void test(String x){
        System.out.println(x);
    }
}
