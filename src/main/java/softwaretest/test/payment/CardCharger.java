package softwaretest.test.payment;


import java.math.BigDecimal;


public interface CardCharger {

    CardPaymentCharge chargeCard(String cardSource, BigDecimal amount, Currency currency, String description);
}
