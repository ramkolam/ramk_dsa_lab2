package com.greatlearning.traveller;

import java.util.*;

public class DenominationDriver {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of denominations:");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Enter valid number of denominations!");
                System.exit(-1);
            }
            Integer denominations[] = new Integer[n];

            System.out.println("Enter the denominations:");

            for (int i = 0; i < n; i++) {
                denominations[i] = sc.nextInt();
                if (denominations[i] <= 0) {
                    System.out.println("Denomination entered "+ denominations[i]+ " is not valid" );
                    System.exit(-1);
                }

            }
            System.out.println("Enter the Amount:");
            int sum = sc.nextInt();

            if (sum <= 0) {
                System.out.println("Enter a valid amount!");
                System.exit(-1);
            }

            //sort the denominations in descending order
            Arrays.sort(denominations, Collections.reverseOrder());
            Integer count[] = new Integer[denominations.length];

            for (int i = 0; i < denominations.length; i++) {
                if (sum >= denominations[i]) {
                    int x = sum / denominations[i];
                    sum = sum - (denominations[i] * x);
                    count[i] = x;
                }
            }
            if (sum > 0) {
                System.out.println("Not possible to pay the amount");
            } else {
                System.out.println("Your payment is done with minimum number of notes as below");
                for (int i = 0; i < count.length; i++) {
                    if (count[i] != null)
                        System.out.println(denominations[i] + ":" + count[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred!. please try again!");
        }
    }
}