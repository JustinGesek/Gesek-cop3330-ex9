package ex9;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
//You will need to purchase 2 gallons of paint to cover 360 square feet.
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many square feet do you need to cover? ");
        int area = scanner.nextInt();


        int wholeGallons = area / 350;
        int paintLeftover = area % 350;
        if(paintLeftover > 0)
        {
            wholeGallons+= 1;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n", wholeGallons, area);
    }
}
