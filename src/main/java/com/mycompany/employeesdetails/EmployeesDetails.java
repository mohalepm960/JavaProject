/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeesdetails;

/**
 *
 * @author Mohale PM
 */
public class EmployeesDetails
{
private int empNum;
private String empLastName;
private String empFirstName;
private double empSalary;
public int getEmpNum()
{
return empNum;
}
public void setEmpNum(int emp)
{
empNum = emp;
}
public String getEmpLastName()
{
return empLastName;
}
public void setEmpLastName(String name)
{
empLastName = name;
}
public String getEmpFirstName()
{
return empFirstName;
}
public void setEmpFirstName(String name)
{
empFirstName = name;
}
public double getEmpSalary()
{
return empSalary;
}
public void setEmpSalary(double sal)
{
empSalary = sal;
}
public static void main(String[] args)
{
EmployeesDetails clerk = new EmployeesDetails();
EmployeesDetails driver = new EmployeesDetails();
clerk.setEmpNum(345);
driver.setEmpNum(567);
clerk.setEmpSalary(700);
driver.setEmpSalary(800);
System.out.println("The clerk's number is " +
clerk.getEmpNum() + " and the driver's number is " +
driver.getEmpNum());
System.out.println("The clerk's Salary is " +
clerk.getEmpSalary() + " and the driver's Salary is " +
driver.getEmpSalary());
}
}

