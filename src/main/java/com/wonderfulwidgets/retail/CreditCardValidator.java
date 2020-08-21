// CreditCardValidator.cs
// Copyright © 2020 Wonderful Widgets. All rights reserved.
//

package com.wonderfulwidgets.retail;

public class CreditCardValidator {

    public boolean validateCardNumber(String cardNumber) {

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
