// CreditCardValidator.cs
// Copyright © 2020 Wonderful Widgets. All rights reserved.
//

package com.wonderfulwidgets.retail;

/**
 * Supports validting credit card numbers as strings of digits using the Luhn algorithm.
 */
public class CreditCardValidator {

    /**
     * Accepts a string of digits and validates the credit card number using the Luhn algorithm.
     * @param cardNumber The string of digits in the card number; digits only, no spaces or dashes.
     * @return true if the card number is valid.
     */
    public boolean validateCardNumber(String cardNumber) throws NullPointerException {

        boolean result = false;

        int sum = 0;

        for (int i = cardNumber.length() - 1; i >= 0; --i) {

            int digit = Character.getNumericValue(cardNumber.charAt(i)) * (((i % 2) == (cardNumber.length() % 2)) ? 2 : 1);

            sum += (digit > 9) ? digit - 9 : digit;
        }

        if (sum > 0 && sum % 10 == 0) {

            result = true;
        }

        return result;
    }
}
