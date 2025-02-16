import java.util.Scanner;


public class Program{

    public static void main(String[] args){
        //Take the user input and save it
        Scanner obj = new Scanner(System.in);
        int nbr = obj.nextInt();

        if (nbr <= 1){
            System.out.println("IllegalArgument");
            System.exit(0);
        }
        
        boolean isprime = true;
        int i = 2;
        int steps = 0;
        while(i < nbr){
            steps++;
            if (nbr % i == 0){
                isprime = false;
                break;
            }
            i++;
        }
        System.out.println(isprime + " " + steps);
    }
    
}