import java.util.Scanner;
public class project7 {
    private static final char PLAY = 'y' ;
   private static final int DO_NOT_PLAY = 'n';
   private static char choice = 'y' ;
   public static int dice;
   public static int dice1;
   public static int dice2;
   public static int dice3;
    public static void dice(){
        int i;
        int min = 1;
        int max = 6;
        dice = (min+max)+1;
        dice1 = (min+max)+1;
        for(i=0; i<=dice; i++) {
        dice = (int)(Math.random()*max)+min;
        dice1 = (int)(Math.random()*max)+min;
        }
        if(dice==1 && dice1==1) {
            System.out.println("You have rolled a 1 and 1 > Snake eyes");
        }
        else if(dice==1 && dice1==2) {
            System.out.println("You have rolled a 1 and 2 > Australian yo");
        }
        else if(dice==1 && dice1==3) {
            System.out.println("You have rolled a 1 and 3 > Little Joe From Kokomo");
        }
        else if(dice==1 && dice1==4) {
            System.out.println("You have rolled a 1 and 4 > No field five");
        }
        else if(dice==1 && dice1==5) {
            System.out.println("You have rolled a 1 and 5 > Easy six");
        }
        else if(dice==1 && dice1==6) {
            System.out.println("You have rolled a 1 and 6 > Six one you're done");
        }
        else if(dice==2 && dice1==1) {
            System.out.println("You have rolled a 2 and 1 > Ace caught a deuce");
        }
        else if(dice==2 && dice1==2) {
            System.out.println("You have rolled a 2 and 2 > Ballerina");
        }
        else if(dice==2 && dice1==3) {
            System.out.println("You have rolled a 2 and 3 > The fever");
        }
        else if(dice==2 && dice1==4) {
            System.out.println("You have rolled a 2 and 4 > Jimmie Hicks");
        }
        else if(dice==2 && dice1==5) {
            System.out.println("You have rolled a 2 and 5 > Benny Blue");
        }
        else if(dice==2 && dice1==6) {
            System.out.println("You have rolled a 2 and 6 > Easy eight");
        }
        else if(dice==3 && dice1==1) {
            System.out.println("You have rolled a 3 and 1 > Easy Four");
        }
        else if(dice==3 && dice1==2) {
            System.out.println("You have rolled a 3 and 2 > OJ");
        }
        else if(dice==3 && dice1==3) {
            System.out.println("You have rolled a 3 and 3 > Brooklyn Forest");
        }
        else if(dice==3 && dice1==4) {
            System.out.println("You have rolled a 3 and 4 > Big Red");
        }
        else if(dice==3 && dice1==5) {
            System.out.println("You have rolled a 3 and 5 > Eighter from Decatur");
        }
        else if(dice==3 && dice1==6) {
            System.out.println("You have rolled a 3 and 6 > Nina from Pasadena");
        }
        else if(dice==4 && dice1==1) {
            System.out.println("You have rolled a 4 and 1 > Little Phoebe");
        }
        else if(dice==4 && dice1==2) {
            System.out.println("You have rolled a 4 and 2 > Easy six");
        }
        else if(dice==4 && dice1==3) {
            System.out.println("You have rolled a 4 and 3 > Skinny McKinney");
        }
        else if(dice==4 && dice1==4) {
            System.out.println("You have rolled a 4 and 4 > Square pair");
        }
        else if(dice==4 && dice1==5) {
            System.out.println("You have rolled a 4 and 5 > Railroad nine");
        }
        else if(dice==4 && dice1==6) {
            System.out.println("You have rolled a 4 and 6 > Big one on the end");
        }
        else if(dice==5 && dice1==1) {
            System.out.println("You have rolled a 5 and 1 > Sixie from Dixie");
        }
        else if(dice==5 && dice1==2) {
            System.out.println("You have rolled a 5 and 2 > Skinny Dugan");
        }
        else if(dice==5 && dice1==3) {
            System.out.println("You have rolled a 5 and 3 > Easy eight");
        }
else if(dice==5 && dice1==4) {
            System.out.println("You have rolled a 5 and 4 > Jesse James");
        }
        else if(dice==5 && dice1==5) {
            System.out.println("You have rolled a 5 and 5 > Puppy paws");
        }
        else if(dice==5 && dice1==6) {
            System.out.println("You have rolled a 5 and 6 > Yo");
        }
        else if(dice==6 && dice1==1) {
            System.out.println("You have rolled a 6 and 1 > The Devil");
        }
        else if(dice==6 && dice1==2) {
            System.out.println("You have rolled a 6 and 2 > Easy eight");
        }
        else if(dice==6 && dice1==3) {
            System.out.println("You have rolled a 6 and 3 > Lou Brown");
        }
        else if(dice==6 && dice1==4) {
            System.out.println("You have rolled a 6 and 4 > Tennessee");
        }
        else if(dice==6 && dice1==5) {
            System.out.println("You have rolled a 6 and 5 > Six five no jive");
        }
        else if(dice==6 && dice1==6) {
            System.out.println("You have rolled a 6 and 6 > Midnight");
        }
    }
    public static void dice2(){
        int i;
        int min = 1;
        int max = 6;
        dice2 = (min+max)+1;
        dice3 = (min+max)+1;
        for(i=0; i<=dice2; i++) {
        dice2 = (int)(Math.random()*max)+min;
        dice3 = (int)(Math.random()*max)+min;
        }
        if(dice2==1 && dice3==1) {
            System.out.println("I have rolled a 1 and 1 > Snake eyes");
        }
        else if(dice2==1 && dice3==2) {
            System.out.println("I have rolled a 1 and 2 > Australian yo");
        }
        else if(dice2==1 && dice3==3) {
            System.out.println("I have rolled a 1 and 3 > Little Joe From Kokomo");
        }
        else if(dice2==1 && dice3==4) {
            System.out.println("I have rolled a 1 and 4 > No field five");
        }
        else if(dice2==1 && dice3==5) {
            System.out.println("I have rolled a 1 and 5 > Easy six");
        }
        else if(dice2==1 && dice3==6) {
            System.out.println("I have rolled a 1 and 6 > Six one you're done");
        }
        else if(dice2==2 && dice3==1) {
            System.out.println("I have rolled a 2 and 1 > Ace caught a deuce");
        }
        else if(dice2==2 && dice3==2) {
            System.out.println("I have rolled a 2 and 2 > Ballerina");
        }
        else if(dice2==2 && dice3==3) {
            System.out.println("I have rolled a 2 and 3 > The fever");
        }
        else if(dice2==2 && dice3==4) {
            System.out.println("I have rolled a 2 and 4 > Jimmie Hicks");
        }
        else if(dice2==2 && dice3==5) {
            System.out.println("I have rolled a 2 and 5 > Benny Blue");
        }
        else if(dice2==2 && dice3==6) {
            System.out.println("I have rolled a 2 and 6 > Easy eight");
        }
        else if(dice2==3 && dice3==1) {
            System.out.println("I have rolled a 3 and 1 > Easy Four");
        }
        else if(dice2==3 && dice3==2) {
            System.out.println("I have rolled a 3 and 2 > OJ");
        }
        else if(dice2==3 && dice3==3) {
            System.out.println("I have rolled a 3 and 3 > Brooklyn Forest");
        }
        else if(dice2==3 && dice3==4) {
            System.out.println("I have rolled a 3 and 4 > Big Red");
        }
        else if(dice2==3 && dice3==5) {
            System.out.println("I have rolled a 3 and 5 > Eighter from Decatur");
        }
        else if(dice2==3 && dice3==6) {
            System.out.println("I have rolled a 3 and 6 > Nina from Pasadena");
        }
        else if(dice2==4 && dice3==1) {
            System.out.println("I have rolled a 4 and 1 > Little Phoebe");
        }
        else if(dice2==4 && dice3==2) {
            System.out.println("I have rolled a 4 and 2 > Easy six");
        }
        else if(dice2==4 && dice3==3) {
            System.out.println("I have rolled a 4 and 3 > Skinny McKinney");
}
        else if(dice2==4 && dice3==4) {
            System.out.println("I have rolled a 4 and 4 > Square pair");
        }
        else if(dice2==4 && dice3==5) {
            System.out.println("I have rolled a 4 and 5 > Railroad nine");
        }
        else if(dice2==4 && dice3==6) {
            System.out.println("I have rolled a 4 and 6 > Big one on the end");
        }
        else if(dice2==5 && dice3==1) {
            System.out.println("I have rolled a 5 and 1 > Sixie from Dixie");
        }
        else if(dice2==5 && dice3==2) {
            System.out.println("I have rolled a 5 and 2 > Skinny Dugan");
        }
        else if(dice2==5 && dice3==3) {
            System.out.println("I have rolled a 5 and 3 > Easy eight");
        }
        else if(dice2==5 && dice3==4) {
            System.out.println("I have rolled a 5 and 4 > Jesse James");
        }
        else if(dice2==5 && dice3==5) {
            System.out.println("I have rolled a 5 and 5 > Puppy paws");
        }
        else if(dice2==5 && dice3==6) {
            System.out.println("I have rolled a 5 and 6 > Yo");
        }
        else if(dice2==6 && dice3==1) {
            System.out.println("I have rolled a 6 and 1 > The Devil");
        }
        else if(dice2==6 && dice3==2) {
            System.out.println("I have rolled a 6 and 2 > Easy eight");
        }
        else if(dice2==6 && dice3==3) {
            System.out.println("I have rolled a 6 and 3 > Lou Brown");
        }
        else if(dice2==6 && dice3==4) {
            System.out.println("I have rolled a 6 and 4 > Tennessee");
        }
        else if(dice2==6 && dice3==5) {
            System.out.println("I have rolled a 6 and 5 > Six five no jive");
        }
        else if(dice2==6 && dice3==6) {
            System.out.println("I have rolled a 6 and 6 > Midnight");
        }
    }
    
    public static void winner() {
     int sum1= dice + dice1;
     int sum2= dice2 + dice3;
     //System.out.println(sum1);
     //System.out.println(sum2);
     if(sum1 < sum2) {
        System.out.println("I win");
     }
     else if (sum2  <sum1) {
         System.out.println("You win");
     }
     else if (sum1 == sum2){
         if(dice==dice1 && dice2!=dice3) {
         System.out.println("You win");
         }
         else if (dice2==dice3 && dice!=dice1) {
             System.out.println("I win");
         }
         else {
             System.out.println("Tie");
         }
     }
         else {
             System.out.println("Congratulations Welcome to Hell Hahahaha!!!!!!");
         }
     }

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
         while(choice == PLAY) {
        project7.dice();
        project7.dice2();
        winner();
        choice = playAgainMessage();
        if(choice==DO_NOT_PLAY) {
            System.out.println("Good bye...");
        }
         }
        //System.out.println("Want to play again(y/n)");
        //objScanner.next();
        
}

    private static char playAgainMessage() {
       Scanner input = new Scanner(System.in);
       System.out.println("Would you like to play again? '1' for yes, '2' for no");
       String inputString=input.next();
       char choice = inputString.charAt(0);
if(choice == PLAY){
           System.out.println("Rolling...");
           return PLAY;
       } else {
           return DO_NOT_PLAY;
       }
   }
}