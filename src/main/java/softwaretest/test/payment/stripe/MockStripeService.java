package softwaretest.test.payment.stripe;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import softwaretest.test.payment.CardCharger;
import softwaretest.test.payment.CardPaymentCharge;
import softwaretest.test.payment.Currency;

import java.math.BigDecimal;

@Service
@ConditionalOnProperty(value = "stripe.enabled", havingValue = "false")
public class MockStripeService implements CardCharger {

    @Override
    public CardPaymentCharge chargeCard(String cardSource,
                                        BigDecimal amount,
                                        Currency currency,
                                        String description) {
        return new CardPaymentCharge(true);
    }
}
