import java.util.Scanner;
public class sumnumber
{
    public static void main(String args[])
    {
        long number;
        long digit;
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor handphone anda: ");
        number = sc.nextLong();
        while(number > 0)
        {
//finds the last digit of the given number
            digit = number % 10;
//adds last digit to the variable sum
            sum = sum + digit;
//removes the last digit from the number
            number = number / 10;
        }
//prints the result
        System.out.println("Totalnya: "+sum);
    }
}  