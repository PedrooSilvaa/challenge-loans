package tech.silvaph.loans.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.silvaph.loans.dto.CustomerLoanRequest;
import tech.silvaph.loans.dto.CustomerLoanResponseDto;
import tech.silvaph.loans.service.LoanService;

@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLoanResponseDto> customerLoan(@RequestBody @Valid CustomerLoanRequest loanRequest){
        var loanResponse = loanService.checkLoanAvailability(loanRequest);
        return ResponseEntity.ok(loanResponse);

    }

}
