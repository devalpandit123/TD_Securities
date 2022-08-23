package com.webex.tdbg.PricingFormattor.service;


import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class PricingService {
    public static final int PRICING_CONSTANT = 32;
    private static Logger logger = LoggerFactory.getLogger(PricingService.class);

    public static String dollarPriceConvertor(double dollar) {
        String finalConvertedValue = "";
        String newConvention;
        String newConventionSubString;

        // Solution:

        try {
            //Step 1: received dollar to be divided into number and decimal format

            BigDecimal bigDecimal = new BigDecimal(String.valueOf(dollar));

            //Step2: disintegrated integer and decimal value


            int intValue = bigDecimal.intValue();
            String decimalPart = bigDecimal.subtract(new BigDecimal(intValue)).toPlainString();

            //Step 3: Get base by 32 value of the decimal value.

            newConvention = String.valueOf(Double.parseDouble(decimalPart) * PRICING_CONSTANT);
            int index = newConvention.indexOf(".");
            newConventionSubString = newConvention.substring(0, index);
            

            if (Integer.parseInt(newConventionSubString) < 10){
                newConventionSubString = "0" + newConventionSubString;
            }
            logger.info("Check substring value: {}", newConventionSubString);
            //Step 4: Integrate with integerPart with "-"

            finalConvertedValue = intValue + "-" + newConventionSubString;

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return finalConvertedValue;
    }

}
