
import java.util.Scanner;
public class project4 {
    private static final char PLAY = 'y' ;
   private static final int DO_NOT_PLAY = 'n';
   private static char choice = 'y' ;
    public static void dice(){
        int i;
        int min = 1;
        int max = 6;
        int dice = (min+max)+1;
        for(i=0; i<=dice; i++) {
        dice = (int)(Math.random()*max)+min;
        }
        if(dice==1) {
            System.out.println("You have rolled a 1");
        }
        else if(dice==2) {
            System.out.println("You have rolled a 2");
        }
        else if(dice==3) {
            System.out.println("You have rolled a 3");
        }
        else if(dice==4) {
            System.out.println("You have rolled a 4");
        }
        else if(dice==5) {
            System.out.println("You have rolled a 5");
        }
            else {
            System.out.println("You have rolled a 6");
        }
        
    }
    public static void dice2(){
        int i;
        int min = 1;
        int max = 6;
        int dice2 = (min+max)+1;
        for(i=0; i<=dice2; i++) {
        dice2 = (int)(Math.random()*max)+min;
        }
        if(dice2==1) {
            System.out.println("You have rolled a 1");
        }
        else if(dice2==2) {
            System.out.println("You have rolled a 2");
        }
        else if(dice2==3) {
            System.out.println("You have rolled a 3");
        }
        else if(dice2==4) {
            System.out.println("You have rolled a 4");
        }
        else if(dice2==5) {
            System.out.println("You have rolled a 5");
        }
            else {
            System.out.println("You have rolled a 6");
        }
        
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         //char c;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         //Scanner objScanner = new Scanner(System.in);
         //System.out.println("Enter a letter");
         //String inputString=objScanner.next();
         //char c1 = inputString.charAt(0);
         while(choice == PLAY) {
        project4.dice();
        project4.dice2();
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
