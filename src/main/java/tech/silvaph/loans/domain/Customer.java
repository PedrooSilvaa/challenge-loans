package tech.silvaph.loans.domain;

public class Customer {

    private Integer age;
    private String cpf;
    private String name;
    private double income;
    private String location;

    public Customer(Integer age, String cpf, String name, double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public boolean isIncomeEqualOrLowerThan(double value) {
        return income <= value;
    }

    public boolean isIncomeEqualOrGreaterThan(double value) {
        return income >= value;
    }

    public boolean isIncomeBetween(double minValue, double maxValue){
        return income >= minValue && income <= maxValue;
    }

    public boolean isAgeLowerThan(int value){
        return  age < value;
    }

    public boolean isFromLocation(String location){
        return this.location.equalsIgnoreCase(location);
    }
}
