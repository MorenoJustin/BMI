import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    final double METRIC_CONVERSION = 703;
    
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter your weight in lbs: ");
      double weight = input.nextDouble();
      input.nextLine();
      
      System.out.println("Enter your height in inches: ");
      double height = input.nextDouble();
      
      System.out.printf("Weight: %3.2f%n", weight);
      System.out.printf("Height: %3.2f%n", height);
      
      // Calculate the BMI
      // weight (lb) / [height (in)]2 x 703
      double bmi = weight / (height*height) * METRIC_CONVERSION;
                            // Math.pow(height, 2)
      System.out.printf("BMI: %3.2f%n", bmi);
      
      // If less than 18.5, then underweight
      if (bmi < 18.5) {
        System.out.println("You're underweight. Eat something...");
      }
      // If less than 24.9, but greater than or equal to 18.5 
      // then normal or healthy
      else if (bmi < 24.9) {
        System.out.println("You're normal and healthy. Lucky you... :(");
      }
      // If less than 29.9, but greater than or equal to 25.0 
      // then overweight
      else if (bmi < 29.9) {
        System.out.println("You're overweight. No more supersize that fry for you.");
      }
      // If less than 39.9, but greater than or equal to 30.0 then obese
      else if (bmi < 39.9) {
        System.out.println("You're obese.");
      }
      // If greater than or equal to 40, then morbidly obese
      else {
        System.out.println("You're morbidly obese. That's not good.");
      }
    }
  }
  
}
