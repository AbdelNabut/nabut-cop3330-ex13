package org.example;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class App 
{
    public static void main( String[] args )
    {
        BigDecimal principle, interestRate, interestRatePercent, years, timesCompounded, totalAmount;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principle amount? ");
        principle = input.nextBigDecimal();
        System.out.print("What is the rate? ");
        interestRatePercent = input.nextBigDecimal();
        interestRate = interestRatePercent.divide(BigDecimal.valueOf(100));
        System.out.print("What is the number of years? ");
        years = input.nextBigDecimal();
        System.out.print("What is the number of times the interest is compounded per year? ");
        timesCompounded = input.nextBigDecimal();
        totalAmount = principle.multiply((BigDecimal.valueOf(1)
                .add(interestRate
                        .divide(timesCompounded)))
                .pow(timesCompounded.intValue() * years.intValue()));
        System.out.println("$" + principle + " invested at " + interestRatePercent + "% for " + years + " years compounded " + timesCompounded + " times per year is " + formatter.format(totalAmount));


    }
}
