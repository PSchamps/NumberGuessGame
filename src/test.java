import java.security.SecureRandom;
public class test
{
    public static void main(String args[])
    {
        SecureRandom rand = new SecureRandom();
        int int_random1 = rand.nextInt(100);
        System.out.println(int_random1);
    }
}
