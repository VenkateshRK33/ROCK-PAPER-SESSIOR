    import java.util.*;
    import java.util.Random;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("LET'S BEGIN THE GAME");
        System.out.println("choose between -rock,paper,sessior");

        String playermove= sc.nextLine();

        Random random=new Random();
        int randomnumber=random.nextInt(3);

        String computermove;
        if (randomnumber==0) {
            computermove="rock";
            
        }
        else if (randomnumber==1) {
            computermove="paper";
            
        }
        else{
            computermove="sessior";
        }
        System.out.println("computer choose this: " +computermove);

        if (playermove .equals(computermove)) {
            System.out.println("THIS MATCH IS DRAW");
            
        }
       else {
            System.out.println("YOU LOOSE");
        }
        
    }

