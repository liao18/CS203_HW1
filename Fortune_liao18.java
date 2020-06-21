/* 
* Jonathan Liao
* Dr. Harrison
* HM 1 Fortune Teller
* 1.17.2015
*/

import java.util.Scanner;


public class Fortune_liao18
{
    public static void main(String args[]) 
    {
        Scanner userInput = new Scanner(System.in); //new scanner object before infinite loop
        
        String userName; //declaring variables that will be asked during Q&A
        double favNumber;
        int birthMonth;
        int birthDay;
        int birthYear;
        
        double income;
        
        String t;
        boolean todayE;
        
        String m;
        boolean married;
        
        int luckyNumber;
        String exit;
        
        while(true) //infinite loop that allows for infinite use of program; loop can be escaped by question at end
        {
            System.out.println("Welcome to the wacky fortune teller.".toUpperCase());
            System.out.println("Please enter you name:");
            
            userName = userInput.next();
            
            System.out.println("Good, good. Now what is your favorite number?");
            favNumber = userInput.nextDouble();
            
            System.out.println("What is your birth month? (Month #, not name)");
            birthMonth = userInput.nextInt();
            
            System.out.println("What is your birth day?");
            birthDay = userInput.nextInt();
            
            System.out.println("What is your birth year? (four digits)");
            birthYear = userInput.nextInt();
            
             System.out.println("How much money do you make a year?");
            income = userInput.nextDouble();
            
            System.out.println("Is today an even date? Enter \"Y\" or \"N\".");
            t = userInput.next();

            
            
                if(t.equalsIgnoreCase("Y"))
                
                {todayE = true;}
                else
                {todayE = false;}
            
            
            System.out.println("Are you married? Enter \"Y\" or \"N\".");
            m = userInput.next();
            
            
            
                if(m.equalsIgnoreCase("Y"))
                
                {married = true;}
                else
                {married = false;}
                
            luckyNumber = (int)(favNumber + (birthMonth % birthDay) + (income/birthYear)); //calculates the lucky number
            
                if(married = false) //not being married sets your lucky number to negative
                luckyNumber *= -1;
                
                if(todayE = false &&(luckyNumber % 2 == 0)) //if today is an odd day, your lucky number will inevitably become odd
                   luckyNumber += 1;
                else if(todayE = true &&(luckyNumber % 2 != 0)) //if today is an even day, your lucky number will inevitably become even
                    luckyNumber -= 1;
            
            System.out.println("Your lucky number is: " + luckyNumber);
            
            if(favNumber == 666 || (userName.equalsIgnoreCase("Satan")) || (userName.equalsIgnoreCase("Devil")))
            {
                   System.out.println("Because you are the devil, you shall return to your origins below the earth one day");
                   System.out.println("You will find much misery in your quest for suffering and satanic beliefs!");
            }
            else if(birthMonth == 8)
            {
                    if(income >= 100000)
                       {
                        if(married = true)
                           {
                               System.out.println("Because you were born in a good month, and married to a lovely husband/wife with a high income,");
                               System.out.println("you will become the boss of all peepol on earth. YOU RULE SUCKA!");
                           }
                           else
                           {
                               System.out.println("Because you were born in a good month, but NOT married to a lovely husband/wife with a high income,");
                               System.out.println("you will become a lonely little hobo in the coming future who never had a spouse!");
                           }
                       }
                    else
                    {
                        System.out.println("Because there is nothing special about you,");
                        System.out.println("you are are therefore nothing special. Go away.");
                    }
            }
                    
            else if(birthMonth == 6)
                    {
                            if(income >= 100000)
                               {
                                if(married = true)
                                   {
                                       System.out.println("Because you were born in a terrible month, and married to an okay husband/wife with a high income,");
                                       System.out.println("you will become a peasant one day for Jonathan Liao. Sorry!");
                                   }
                                   else
                                   {
                                       System.out.println("Because you were born in a terrible month, and NOT married to a husband/wife with a terrible income,");
                                       System.out.println("you will become a your worst nightmare.");
                                   }
                               }
                                else
                                {
                                    System.out.println("Because you were born in a terrible month and have no money,");
                                    System.out.println("you will face poverty in the coming future. Sorry!");
                                }
                           
                    }
            
            else if(birthMonth == 12)
            {
                if(birthDay == 25 && (userName.equalsIgnoreCase("Jesus")))
                {
                    System.out.println("Because you were born on the same day as Jesus Christ, have the same name as the Jesus Christ, you are therefore the SON OF GOD.");
                    System.out.println("LORD HAVE MERCY ON US ALL, OH GREAT AND POWERFUL.");
                }
                else
                {
                    System.out.println("Because there is nothing special about you,");
                    System.out.println("you are are therefore nothing special. Go away.");
                }
            }
            else
            {
                System.out.println("Because there is nothing special about you,");
                System.out.println("you are are therefore nothing special. Go away.");
            }
        
                System.out.println("");
                System.out.println("Thank you, " + userName + ", for using the customized fortune teller.");
                System.out.println("To continue and retry, enter any key. If you would like to quit, enter EXIT in input");
                exit = userInput.next();
                
                if(exit.equalsIgnoreCase("EXIT"))
                {System.exit(0);}
        
    }
}
}
                
            
            
            
            
			