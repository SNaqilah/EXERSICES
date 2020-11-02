package test;
import java.util.Scanner; 
public class test {

    public static void main(String [] args) {
    	System.out.println();
    
    	printFahrenheit();
    	printInch();
    	printNum();
    	printMinutesInYear();
    	printGMT();
    	printWeight();
    	printDistance();
    	printValue();
    	printInteger();
    	printDigits();
    	
    	
    }
    public static void printFahrenheit() {
        Scanner input = new Scanner(System.in);
        
    	   System.out.print("Input a degree in Fahrenheit:");
    	   double fahrenheit = input.nextDouble();
    	   double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0); 	   
    	   System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in celsius");
    		
    		
    }	
	 public static void printInch() {
	    Scanner input = new Scanner(System.in);
	    
    	   System.out.print("Input a value for inch: ");
    	   double inch = input.nextDouble();
    		
    	   double meters = inch * 0.0254;
    	   System.out.println(inch + " inch is " + meters + " meters");
   
    }	
	 public static void printNum() {
	    Scanner input = new Scanner(System.in);
    	   
    	   System.out.print("Input an integer between 0 and 1000: ");
    	   int num = input.nextInt();

    	   int firstDigit = num % 10;
    	   int remainingNumber = num / 10;
    	   int SecondDigit = remainingNumber % 10;
    	   remainingNumber = remainingNumber / 10;
    	   int thirdDigit = remainingNumber % 10;
    	   remainingNumber = remainingNumber / 10;
    	   int fourthDigit = remainingNumber % 10;
    	   int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
    	   System.out.println("The sum of all digits in " + num + " is " + sum);

	 }	
	 public static void printMinutesInYear() {
	    Scanner input = new Scanner(System.in);
	    
    	   System.out.println("Input a minutes for years and days: ");
    	   double minutesInYear = 60 * 24* 365;
    	   double min = input.nextDouble();
    	  
    	   long years =(long) ( min / minutesInYear);
    	   int days = (int)(min / 60/ 24) % 365;	
    	   System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days ");
    	
	 }	
	 public static void printGMT() {
	    Scanner input = new Scanner(System.in);
	    
    	   System.out.println("Input the time zon offset to GMT: ");
    	   long timeZonChange = input.nextInt();
    	   long totalMilliseconds = System.currentTimeMillis();
    	   long totalSeconds = totalMilliseconds / 1000;
    	   long currentSecond = totalSeconds % 60;
    	   long totalMinutes = totalSeconds / 60;
    	   long currentMinutes = totalMinutes % 60;
    	   long totalHours = totalMinutes / 60;
    	   
    	   long currentHour = ((totalHours + timeZonChange) % 24);
    	   System.out.println("Current time is" + currentHour + ":" + currentMinutes + ":" + currentSecond);
    	   
	 }	
	 public static void printWeight() {
	    Scanner input = new Scanner(System.in);
	    
    	   System.out.println("Input weight in pounds: ");
    	   double weight = input.nextDouble();
    	   
    	   System.out.print("input height in inches: ");
    	   double inches = input.nextDouble();
    	   
    	   double BMI= weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
    	   System.out.print("Body Mass Index is " + BMI + "\n");
    	   
	 }	
	 public static void printDistance() {
	    Scanner input = new Scanner(System.in);
	    
    	   float timeSeconds;
    	   float mps,kph, mph;

    	   System.out.print("Input distance in meters: ");
    	   float distance = input.nextFloat();

    	   System.out.print("Input hour: ");
    	   float hr = input.nextFloat();

    	   System.out.print("Input minutes: ");
    	   float minutes = input.nextFloat();

    	   System.out.print("Input seconds: ");
    	   float sec = input.nextFloat();

    	   timeSeconds = (hr*3600) + (minutes*60) + sec;
    	   mps = distance / timeSeconds;
    	   kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
    	   mph = kph / 1.609f;

    	   System.out.println("Your speed in meters/second is "+mps);
    	   System.out.println("Your speed in km/h is "+kph);
    	   System.out.println("Your speed in miles/h is "+mph);
    		
	 }	
	 public static void printValue() {
	    Scanner input = new Scanner(System.in);
	    
    	   System.out.print("Input the side length value: ");
    	   double val = input.nextDouble();
    	   
    	   int x = 10; double y = 5.373123;
    	   System.out.printf("Value of x is %d and value of by y is %6.2f %n", x, y);
    	   
    	   System.out.printf("Square: %12.2f\n", val * val);
           System.out.printf("Cube: %14.2f\n", val * val * val);
           System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));

	 }	
	 public static void printInteger() {
	    Scanner input = new Scanner(System.in);	
	    
           System.out.print("Input 1st integer: ");
           int firstInt = input.nextInt();
           System.out.print("Input 2nd integer: ");
           int secondInt = input.nextInt();
           System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
           System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
           System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
           System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
           System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
           System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
           System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));

	 }	
	 public static void printDigits() {
	    Scanner input = new Scanner(System.in);
	    
           System.out.print("Input six non-negative digits: ");
           int input1 = input.nextInt();
           int n1 = input1 / 100000 % 10;
           int n2 = input1 / 10000 % 10;
           int n3 = input1 / 1000 % 10;
           int n4 = input1 / 100 % 10;
           int n5 = input1 / 10 % 10;
           int n6 = input1 % 10;
           System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);


    	   
    	
    	
    	
    	
    }
}
	

	
