/**
  * Java 1. HomeWork 2
  *
  * @author Anton
  * version 27.03.2022
  */
  
  public class HomeWork2 {
	  
	  public static void main(String[] args) {
		  System.out.println(intervalOfNumbers(12, 9));
		  integerNumber();
		  System.out.println(comparison(-15));
		  stringsAndNumbers("exercise 4", 10);
	    }
	    
		static String intervalOfNumbers(int a, int b) {
			return (a + b >= 10 && a + b <= 20)? "True" : "False"; 
		}
		
		static void integerNumber() {
			int a = -5;
				System.out.println(a >= 0? "positive number":"negative number");
			} 
			
		static boolean comparison(int a) {
			if (a <= 0) {
				return true;
			} else {
				return false; 
			}
		}
		static void stringsAndNumbers(String str, int n) {
			for (int i = 1; i <= n; i++) {
				System.out.println("[" +i+ "]" + "" + str);
			}
		}
	}
  