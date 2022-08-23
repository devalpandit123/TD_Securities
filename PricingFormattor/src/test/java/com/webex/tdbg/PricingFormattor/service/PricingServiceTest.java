package com.webex.tdbg.PricingFormattor.service;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PricingServiceTest {

    
    @Test
    void dollarPriceConvertor_checkPositiveExecution_Success() {

        String expectedOutput = "9-01";

        String actualOutput = PricingService.dollarPriceConvertor(9.03125d);

        assertEquals(actualOutput, expectedOutput);

    }

    @Test
    void dollarPriceConvertor_checkNegativeExecution_Sucess(){
        String expectedOutput = "105-03";

        String actualOutput = PricingService.dollarPriceConvertor(105.24d);

        assertNotEquals(actualOutput, expectedOutput);
    }

    @Test
    void dollarPriceConvertor_checkSingleDigit_Sucess(){
        String expectedOutput = "99-06";

        String actualOutput = PricingService.dollarPriceConvertor(99.21d);

        // Validate if single digit 6 gets prefixed with "0"

        assertEquals(actualOutput, expectedOutput);
    }
}