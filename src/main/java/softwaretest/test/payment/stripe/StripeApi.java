package softwaretest.test.payment.stripe;


import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.net.RequestOptions;
import org.springframework.stereotype.Service;

import java.util.Map;

// we create this class in order to d a unit test in the StripeService because this one is calling the real API service with "create"
// therefore we are creating  this class to encapsulate and mock
@Service
public class StripeApi  {

    public Charge create(Map<String, Object> requestMap, RequestOptions options) throws StripeException {
        return Charge.create(requestMap, options);
    }
}
