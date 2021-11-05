import java.util.Scanner;

public class CarSelector {
    public static void main(String [] args){
        System.out.println("Do you want Car?? \nY for Yes or N for no.");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        if(a.equals("Y")) {
            System.out.println("What is your favorite color\n1.Red\n2.Blue\n3.Yellow");
            String a2 = scan.next();

                  if (a2.equals("1")) {
                      System.out.println("we have it in stock would you like to see it?\nYes or No.");
                      String a3 = scan.next();

                      if (a3.equals("Yes")) {
                          System.out.println("Great! Let's check the car.");
                      }
                      else {
                          System.out.println("No worries we will check something else.");
                      }
                  }
                              else if (a2.equals("2")) {
                                System.out.println("We can order it.");
                              }
                   else{
                       System.out.println("Sorry we don't have it in stock");
                                }
                   }
        else{
            System.out.println("No worries have a good day.");
        }
    }
}
