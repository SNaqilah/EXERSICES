package Test2;


import java.util.Scanner;



public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        	System.out.println();
		
		
		        printExersice1();
		        printExersice2();
		        printExersice3();
		        printExersice4();
		        printExersice5();
		        printExersice6();
		        printExersice7();
		        printExersice8();
		        printExersice9();
		        printExersice10();
		        
		        
      }
	       public static void printExersice1() {
	        Scanner in = new Scanner(System.in); 
		        
	        System.out.print("Input first number: ");
	        int num1 = in.nextInt();
	         
	        System.out.print("Input second number: ");
	        int num2 = in.nextInt();
	         
	        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
	       
    
	  }  
	        public static void printExersice2() {
		        Scanner in = new Scanner(System.in);   
		           
	        System.out.print("Input first number: ");
	        int num1 = in.nextInt();
	        
	        System.out.print("Input second number: ");
	        int num2 = in.nextInt();
	        
	        System.out.println(num1 + " / " + num2 + " = " + num1/num2);
	        
	  }      
	        public static void printExersice3() {
	            Scanner in = new Scanner(System.in);
	            
	        System.out.println("Input the Number: ");
	        int n = in .nextInt();
	   	    for (int i = 1; i <= 10; i++) {
       	    System.out.println(n + "*" + i + " = " + (n * i));
	   	 
	   
	   	    }
   }        public static void printExersice4() {
	            Scanner in = new Scanner(System.in);
	            
	         System.out.println("IAVA: ");
	         System.out.println("   I    a   v     v  a ");
	         System.out.println("   I   a a   v   v  a a");
	         System.out.println("   I  aaaaa   V V  aaaaa");
	         System.out.println("   I a     a   V  a     a");
	        
  }      
           public static void printExersice5() {
               Scanner in = new Scanner(System.in);
               
               System.out.println("Specified Formula: ");
               double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
               System.out.println(pi); //
               
}         public static void printExersice6() {
               Scanner in = new Scanner(System.in);
            
               final double width = 8.9;
               final double height = 10.7;

               double perimeter = 2*(height + width);
       		
               double area = width * height;			
       		
       		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

               System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
               
}        
          public static void printExersice7() {
                Scanner in = new Scanner(System.in);
                
                System.out.println(" +\"\"\"\"\"+ ");
                System.out.println("[| o o |]");
                System.out.println(" |  ^  | ");
                System.out.println(" | --- | ");
                System.out.println(" +-----+ ");

}
          public static void printExersice8() {
              Scanner in = new Scanner(System.in);
          
          
         
               int number1; // first number to compare       
               int number2; // second number to compare  
        
               System.out.print( "Input first integer: " ); // prompt        
               number1 = in.nextInt(); // read first number from user   
   
               System.out.print( "Input second integer: " ); // prompt        
               number2 = in.nextInt(); // read second number from user               
            
               if ( number1 == number2 )           
               System.out.printf( "%d == %d\n", number1, number2 );  
               if ( number1 != number2 )          
               System.out.printf( "%d != %d\n", number1, number2 );  
               if ( number1 < number2 )          
               System.out.printf( "%d < %d\n", number1, number2 );  
               if ( number1 > number2 )                   
               System.out.printf( "%d > %d\n", number1, number2 ); 
               if ( number1 <= number2 )          
               System.out.printf( "%d <= %d\n", number1, number2 );  
               if ( number1 >= number2 )          
               System.out.printf( "%d >= %d\n", number1, number2 );  
        
 }  
         
              
              
         public static void printExersice9() {
             Scanner scanner = new Scanner(System.in);
             System.out.print("Input a string: ");
             char[] letters = scanner.nextLine().toCharArray();
             System.out.print("Reverse string: ");
             for (int i = letters.length - 1; i >= 0; i--) {
             System.out.print(letters[i]);
     }
             System.out.print("\n");

        
         } public static void printExersice10() {
        
        	 int n;
        	  char s1, s2, s3;
        	  Scanner in = new Scanner(System.in);
        	  System.out.print("Input number: ");
        	  n = in .nextInt();
        	  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
         }
              }
             
                  


