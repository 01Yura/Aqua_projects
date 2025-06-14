package no_bugs.practice9.kiss;

//2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код
//Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
//Исходный код:

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount = 0.0;

        if (isLoyalCustomer) {
            if (isFirstPurchase) {
                discount = price * 0.10;
            } else {
                discount = price * 0.05;
            }
        } else {
            if (hasCoupon) {
                discount = price * 0.07;
            } else {
                discount = price * 0.02;
            }
        }
        return price - discount;
    }
}

// Fixed code
class DiscountCalculatorFixed {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate = 0.0;
        if (isLoyalCustomer && isFirstPurchase) {
            discountRate = 0.1;
        } else if (isLoyalCustomer) {
            discountRate = 0.05;
        } else if (hasCoupon) {
            discountRate = 0.07;
        } else {
            discountRate = 0.02;
        }


        return price - (price * discountRate);
    }
}

class Main {
    public static void main(String[] args) {
        DiscountCalculatorFixed discountCalculatorFixed = new DiscountCalculatorFixed();
        System.out.println(discountCalculatorFixed.calculateDiscount(100, true, true, true));
        System.out.println(discountCalculatorFixed.calculateDiscount(100, true, false, true));
        System.out.println(discountCalculatorFixed.calculateDiscount(100, false, true, true));
        System.out.println(discountCalculatorFixed.calculateDiscount(100, false, false, true));
        System.out.println(discountCalculatorFixed.calculateDiscount(100, false, false, false));
    }
}

