package com.company.palindrome;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrom();
    }


    public static void isPalindrom() {
        int reverseNumber = 0, sum = 0;
        boolean result = true;
        int count = 1;
        for (int i = 10; i <= 100; i++) {
            reverseNumber = getReverseNumber(i);   //i sayısının tersini aldık
            sum = reverseNumber + i;     // i sayısını tersi ile topladık;
            result = isValidPalindrom(sum);
            while (!result) {
                reverseNumber = getReverseNumber(sum);
                sum += reverseNumber;
                result = isValidPalindrom(sum);
            }
            System.out.println(i + " sayısının polindromu : " + sum);
        }
    }

    // bu method parametre olarak gelen sayının tersini alır
    public static int getReverseNumber(int number) {
        int temp, reverseNumber = 0, kalan;
        int count = 0;
        temp = number;

        while (temp != 0) {
            kalan = temp % 10;
            reverseNumber = reverseNumber * 10 + kalan;
            temp /= 10;
        }
        return reverseNumber;
    }

    //sayının polindrom olup olmadığının kontrolu
    public static boolean isValidPalindrom(int number) {
        int newNumber = getReverseNumber(number);  // Parametre olarak gelen sayının tersini aldım.
        if (number == newNumber) {   // parametre olarak gelen sayı ile sayının tersininin birbirine eşit olup olmadığını kontrol ettim
            return true;
        } else {
            return false;
        }
    }
}
