package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoneyDriver {

    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the transaction:");
            int size = sc.nextInt();

            if (size <= 0) {
                System.out.println("Enter valid size for transaction!");
                System.exit(-1);
            }
            int arr[] = new int[size];
            System.out.println("Enter the transaction values:");
            for (int i = 0; i < size; i++)
                arr[i] = sc.nextInt();
            System.out.println("Enter the total number of targets that needed to be achevied:");
            int targetNo = sc.nextInt();
            while (targetNo-- != 0) {
                int flag = 0;
                long target;
                System.out.println("Enter the target value:");
                target = sc.nextInt();
                long sum = 0;
                for (int i = 0; i < size; i++) {
                    sum += arr[i];
                    if (sum >= target) {
                        System.out.println("Target was acheieved after " + (i + 1) + " transcations");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("Target was not achevied");
                }
            }
        } catch (Exception e) {
            System.out.println("error occurred! please try again");
        }

    }
}

