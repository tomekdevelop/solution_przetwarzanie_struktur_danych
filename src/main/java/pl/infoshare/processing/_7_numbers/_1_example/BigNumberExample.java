package pl.infoshare.processing._7_numbers._1_example;

import java.math.BigDecimal;

public class BigNumberExample {

    public static void main(String[] args) {
        double x = 5.6;
        double y = 5.3;

        BigDecimal bigX = BigDecimal.valueOf(5.6);
        BigDecimal bigY = BigDecimal.valueOf(5.3);

        BigDecimal negated = bigX.negate();
        System.out.println(negated);

        BigDecimal add = bigX.add(bigY);
        System.out.println(add);

        BigDecimal first = BigDecimal.valueOf(168);
        BigDecimal second = BigDecimal.valueOf(168.00);

        if(first.compareTo(second) == 0){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }

    }



}
