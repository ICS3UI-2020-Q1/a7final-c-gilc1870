/**
 * calculate the sum of an integer parameter called number
 * @author Cesar Gil
 */
public class Main {
  // Creates a method 
  public static boolean checkCode(int num){
    // declares variables
    int sum = 0;
    int remainder = 0;
    // Using the while loop it gets the last digit of the number and adds them together
    while(num >= 1){
      remainder = num % 10;
      num = num / 10;
      sum = sum + remainder;
    }
    // using the if statment if the sum of digits are divisable without remainder it will return true if else it  will return false
    if(sum % 7 == 0){
      return true;
    }else{
      return false;
    }
   }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // declares a boolean variable using the method so that it will print out the intial value that was put in
    boolean answer = checkCode(51);
    // prints out the answer
    System.out.println(answer);

  }
}
