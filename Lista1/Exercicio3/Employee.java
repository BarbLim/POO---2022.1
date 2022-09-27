package Exercicio3;

public class Employee {
    String name;
    double tax;
    double grossSalary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    
    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
   

    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    
    public Double netSalary(){

        double netSalary = grossSalary - tax;

        return netSalary;
    }

    public void increaseSalary(double percentagem){
        
        grossSalary = grossSalary + grossSalary*(percentagem/100);
    }

    @Override
    public String toString() {
        return name + ", " + "$ " + netSalary();
    }
}
