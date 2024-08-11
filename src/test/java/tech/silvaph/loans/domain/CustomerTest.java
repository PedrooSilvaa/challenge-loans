package tech.silvaph.loans.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.silvaph.loans.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Nested
    class isIncomeEqualOrLowerThan{
        @Test
        void shouldBeTrueWhenIncomeIsEqual(){
            var customer = CustomerFactory.build(5000.00);
            assertTrue(customer.isIncomeEqualOrLowerThan(5000.0));
        }

        @Test
        void shouldBeFalseWhenIncomeIsLowerThan(){
            var customer = CustomerFactory.build(5000.00);
            assertTrue(customer.isIncomeEqualOrLowerThan(9000.0));
        }

        @Test
        void shouldBeFalseWhenIncomeIsGreaterThanValue(){
            var customer = CustomerFactory.build(5000.00);
            assertTrue(customer.isIncomeEqualOrLowerThan(8000.0));
        }
    }

}