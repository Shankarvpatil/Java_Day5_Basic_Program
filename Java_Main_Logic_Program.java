package com.bridgebaz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility() {
		scanner = new Scanner(System.in);
	}
	// get integer input
	public int getIntValue() {
		return scanner.nextInt();
	}
	//get characters as input
	public char getCharValue() {
		char alphabate = scanner.next().charAt(0);
		return alphabate;
	}
	// to check leap year
	public void checkLeapYear(int ValueOfYear) {
		int temp = ValueOfYear, noOfDigit=0;
		do {
			noOfDigit++;
			ValueOfYear = ValueOfYear/10;
			
		}while(ValueOfYear != 0);
		
		if(noOfDigit == 4) {
			
			if((temp % 4 == 0) && (temp % 400 == 0 || temp % 100 != 0)) 
				System.out.println(temp+" is a Leap Year");
			else 
				System.out.println(temp+" is not Leap Year");
		}
		else
			System.out.println(temp+" is not valid Year");
	}
	// to check power Two
	public void getPower( int N) {
    int power = 1;

    if (N>0 && N<31) {
      for (int i=1; i<=N; i++) {
        power = power * 2;
        System.out.println(2 + " to the power " + i + " : " + power);
       }
   } else {
      System.out.println("It exceeds the 'int' datatype limit");
    }
	// to check even and odd number
	public void getEvenOdd(int Number) {
		if(Number%2 == 0)
			System.out.println(Number+" is even number");
		else
			System.out.println(Number+" is odd number");
	}
	// to get prime number
	public void getPrimeFactor(int N) {
		int cnt;
		System.out.print("prime factor of "+N+" =");
		for (int i=2;i<=N/2;i++ ){
			   cnt=0;
			if ( N % i == 0 ) {
				   for( int j=2;j<=i/2;j++ ){
					   if( i%j ==0)
						   cnt = 1;
				   }
				   if(cnt == 0) 
					   System.out.print(" "+i);   
			} 
		}
	}
//Get Harmonic 
	public void getHarmonicNumber(int num) {
    int num = s.nextInt();
    double harmonicNum = 0;

    if (num>0) {
      for (int i=1; i<=num; i++) {
        harmonicNum = harmonicNum + (1.0/i);
          }
      System.out.printf("Harmonic number is: %.4f ", harmonicNum);
      } else {
          System.out.println("Number should be greater than 0.");
      }
	}
//Get Largest Number Among Three
	public void getLargestNumber(int num1, int num2, int num3) {
		int FirstCond, SecondCond;
		FirstCond = (num1>num2)? num1:num2; 
		SecondCond = (FirstCond>num3)? FirstCond:num3; 
		System.out.println(SecondCond+" is greatest among "+num1+", "+num2+", "+num3);
	}
		//Get Quotient And Reamainder
	public void getQuotientRemainder(int Divisor, int Dividend ) {
		int Quotient, Remainder;
		Remainder = Dividend % Divisor;
		Quotient = Dividend / Divisor;
		System.out.println("Remainder = " +Remainder+ " Quotient = " +Quotient);
		
	}
	//Two swap two number
	public void SwapNumber(int num1 ,int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = "+num1+" num2 = "+num2);
	}
	// To check flip coin percentage
	public static void FlipCoinPercent(int coinToss) {
		int coinToss = s.nextInt();
        if (coinToss > 0) {
            int i = 1;
            int headCount = 0;
            int tailCount = 0;
            while (i <= coinToss) {
                double random = Math.random();
                if (random < 0.5) {
                    //System.out.println("Tail");
                } else {
                    //System.out.println("Head");
                    headCount++;
                }
                i++;
            }
            System.out.println("Head count = " + headCount);
            tailCount = coinToss - headCount;
            System.out.println("Tail count = " + tailCount);
            double headPercentage = (headCount*100.0)/coinToss;
            System.out.printf("Head percentage = %.2f %n", headPercentage);
            double tailPercentage = 100 - headPercentage;
            System.out.printf("Tail percentage = %.2f %n ", tailPercentage);

        } else {
            System.out.println("Enter positive number.");
        }
	// To check vowel and consonant
	public void checkAlphabate(char alphabate) {
		char alphabet = s.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(alphabet + " is vovel");
                break;
            default:
                System.out.println(alphabet + " is consonant");
	}
	
}
