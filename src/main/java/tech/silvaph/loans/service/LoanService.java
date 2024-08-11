package tech.silvaph.loans.service;

import org.springframework.stereotype.Service;
import tech.silvaph.loans.domain.Loan;
import tech.silvaph.loans.domain.LoanType;
import tech.silvaph.loans.dto.CustomerLoanRequest;
import tech.silvaph.loans.dto.CustomerLoanResponseDto;
import tech.silvaph.loans.dto.LoanResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponseDto checkLoanAvailability(CustomerLoanRequest loanRequest){

        var customer = loanRequest.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();
        if (loan.isPersonalLoanAvailable()){
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isConsigmentLoanAvailable()){
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsigmentLoanInterestRate()));
        }

        if (loan.isGuaranteedLoanAvailable()){
        loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }

        return new CustomerLoanResponseDto(loanRequest.name(), loans);
    }

}
