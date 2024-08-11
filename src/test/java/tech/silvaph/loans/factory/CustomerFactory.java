package tech.silvaph.loans.factory;

import tech.silvaph.loans.domain.Customer;

public class CustomerFactory {

    public static Customer build(){
        return new Customer(25, "123.456.789-10", "name", 5000.00, "SP");
    }

    public static Customer build(Double income){
        return new Customer(25, "123.456.789-10", "name", income, "SP");
    }
}
