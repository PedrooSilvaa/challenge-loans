package tech.silvaph.loans.dto;

import tech.silvaph.loans.domain.LoanType;

public record LoanResponse (LoanType type, Double interestRate){
}
