package softwaretest.test.payment;


import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface CardCharger {

    CardPaymentCharge chargeCard(String cardSource, BigDecimal amount, Currency currency, String description);
}
