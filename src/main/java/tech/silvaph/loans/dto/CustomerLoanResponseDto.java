package tech.silvaph.loans.dto;

import java.util.List;

public record CustomerLoanResponseDto(String customer, List<LoanResponse> loans) {
}
