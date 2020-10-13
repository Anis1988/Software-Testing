package softwaretest.test.payment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class CardPaymentCharge {

    private final boolean isCardDebited;
}
