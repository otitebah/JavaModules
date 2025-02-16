import java.util.Scanner;


public class Program{

    public static int CalculateSum(int num){
        int res = 0;
        while(num > 0){
            res += num % 10;
            num = num / 10;
        }
        return res;
    }

    public static boolean  isPrime(int nbr){
        if (nbr <= 1){
            System.out.println("IllegalArgument");
            System.exit(0);
        }
        boolean isprime = true;
        int i = 2; 
        while(i < nbr){
            if (nbr % i == 0){
                isprime = false;
                break;
            }
            i++;
        }
        return isprime;
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int nbr = 0;
        int count = 0;
        while (nbr != 42){
            nbr = obj.nextInt();
            if(isPrime(CalculateSum(nbr)))
                count++;
        }
        System.out.println("Count of coffee-request : " + count);
    }
}