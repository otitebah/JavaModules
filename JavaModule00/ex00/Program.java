public class Program{
    
    public static void main(String[] args){
        System.out.println(CalculateSum(555));
    }

    public static int CalculateSum(int num){
        int res = 0;
        while(num > 0){
            res += num % 10;
            num = num / 10;
        }
        return res;
    }
}