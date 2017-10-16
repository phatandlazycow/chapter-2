
import java.util.Random;
public class rollingdice
{
    public static void main(String[] args){
        Random roll1 = new Random();
        Random roll2 = new Random();
        
        int dice1 = roll1.nextInt(6);
        int dice2 = roll2.nextInt(6);
        
        System.out.println("your first roll was "+dice1);
        System.out.println("your second roll was"+dice2);
        System.out.println("your total is "+(dice1+dice2));
       
    }
}
