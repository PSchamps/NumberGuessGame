import java.security.SecureRandom;
import java.util.Scanner;
class Numb_guess
{
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    void range()
    {
        System.out.println("Enter the range of numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    int random()
    {
        SecureRandom rand = new SecureRandom();
        int int_random1 = rand.nextInt(a, b);
        return int_random1;
    }
    void guess(int s, int random)
    {
        if(s<=5)
        {
            System.out.println(s+" attempt");
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num == random) {
                System.out.println("Congratulations! You guessed the correct number");
            } else if (num < random) {
                System.out.println("Guess Higher");
                System.out.println();
                guess(s + 1, random);
            } else {
                System.out.println("Guess Lower");
                System.out.println();
                guess(s + 1, random);
            }
        }
        else
        {
            System.out.println("Sorry! You are out of chances");
            System.out.println("The Correct answer was:"+random);
            System.out.println("Better Luck Next Time");
        }
    }
    public static void main(String args[])
    {
        Numb_guess obj = new Numb_guess();
        System.out.println("Welcome!");
        System.out.println("The rules of the game are simple. You need to guess the random generated number within 5 attempts.");
        System.out.println("Each time the computer will tell you if the number is Higher or Lower.");
        System.out.println("Try to guess the number with least number of attempts");
        System.out.println("Let's START");
        obj.range();
        int ran = obj.random();
        obj.guess(1, ran);
    }
}
