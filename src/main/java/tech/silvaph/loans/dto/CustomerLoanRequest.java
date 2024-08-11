package tech.silvaph.loans.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import tech.silvaph.loans.domain.Customer;

public record CustomerLoanRequest(@Min (value = 18)@NotNull(message = "Age invalid") Integer age,
                                  @CPF String cpf,
                                  @NotBlank String name,
                                  @Min(value = 1000)@NotNull double income,
                                  @NotBlank String location) {

    public Customer toCustomer(){
        return new Customer(
                age,
                cpf,
                name,
                income,
                location
        );
    }
}
