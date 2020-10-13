package softwaretest.test.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import softwaretest.test.utils.PhoneNumberValidator;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;


    @BeforeEach
     void setUp() {
        underTest =  new PhoneNumberValidator();
    }

    @Test
    @DisplayName("Validated Phone Number")
    void itShouldValidatePhoneNumber() {
        // Given
        String phoneNumber = "+447567890567";
        // When
        System.out.println(phoneNumber.length());
        //Then
        assertThat(underTest.test(phoneNumber)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"+447567890567,TRUE","+1234567890123,FALSE","12345,FALSE"})
    void itShouldName(String phoneNumber , Boolean expected) {
        boolean isValid = underTest.test(phoneNumber);
        assertThat(isValid).isEqualTo((expected));
    }
}
