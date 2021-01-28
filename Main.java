import java.util.Scanner;

class Main {
  public static void main(String[] args) 
   {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What year is it?");
    int currentYear = scan.nextInt();
    System.out.println("What is your birthyear");
    int birthYear =  scan.nextInt();
    

    System.out.println(greeting(name));
    int age = getAge(birthYear, currentYear);
    System.out.println("Your age is " + age);

    
    System.out.println("How much money do you have?");
    int dollarAmount = scan.nextInt();
    System.out.println("How much are your taxes this month?");
    int taxMoney =  scan.nextInt();

    System.out.println(greeting(name));
    int dollar = getMoney(dollarAmount, taxMoney);
    System.out.println("Your money left is " + dollar);
   }

   //getAge method calculates age
   static int getAge(int birthYear, int currentYear)
   {
     int age = currentYear - birthYear;
     return age;
   }
   //greeting method returns a personalized greeting 
   static String greeting(String name)
   {
     String hello = "Hello. Welcome back," + name;
     return hello;
   }
    //Create a method that takes in at least 1 parameter and returns some type
    static int getMoney(int dollarAmount, int taxMoney)
    {
      int dollar = dollarAmount - taxMoney;
      return dollar;
    }
    //Call this new method within your main method==just like we did with getAge and greeting.
    
  }