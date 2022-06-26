package com.company;

import java.util.*;

// to run this file https://beginnersbook.com/2013/05/first-java-program/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How much do you want to invest yearly?: ");
        float yearlyInvestment = in.nextFloat();

        System.out.println("How much % interest for each year?: ");
        int yearlyInterest = in.nextInt();

        calculateInterest(yearlyInvestment, yearlyInterest);
    }

    public static void calculateInterest(float yearlyInvestment, int yearlyInterest) {
        LinkedList<Float> amountPerYear = new LinkedList<>();
        float interestPercentage = (float) (1 + (yearlyInterest / 100.0));
        float firstYearInterest = yearlyInvestment * interestPercentage;

        amountPerYear.add(firstYearInterest);

        for (int i = 1; i < 10; i++) {
            float lastYear = amountPerYear.getLast();
            float yearInterest = ((lastYear + yearlyInvestment) * interestPercentage);
            amountPerYear.add(yearInterest);
        }

        System.out.println("Your interest over the years: " + amountPerYear);
    }
}
