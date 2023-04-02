package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType * CurrencyType.getTypeOfCurrency(currencyType);
//        return Double.MAX_VALUE;
    }
}
