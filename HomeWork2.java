/**
  * Java 1. HomeWork 2
  *
  * @author Anton
  * version 27.03.2022
  */
  
  public class HomeWork2 {
	  
	  public static void main(String[] args) {
		  System.out.println(intervalOfNumbers(12, 9));
		  integerNumber(10);
		  System.out.println(comparison(5));
		  stringsAndNumbers("exercise 4", 10);
	    }
	    
		static boolean intervalOfNumbers(int a, int b) {
			int sum = a + b;
                    if (sum >= 10 && sum <=20) {
                        return true;
                    }
                        return false;			
		}
		
		static void integerNumber(int x) {
			if (x >= 0) {
				System.out.println("positive number");
			} else {
				System.out.println("Negative number");
			}
		}		
			
		static boolean comparison(int a) {
			return a <= 0;
		} 				
		
		static void stringsAndNumbers(String str, int n) {
			for (int i = 1; i <= n; i++) {
				System.out.println(str);
			}
		}
	}
  