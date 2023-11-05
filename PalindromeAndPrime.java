import java.util.*;

public class PalindromeAndPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the value ");
        num = sc.nextInt();
        int temp, rev, count;
        rev = 0;
        count = 0; 

        for (int i = 1; i <= num; i++) { 
            if (num % i == 0) {
                count++;
            }
        }

        temp = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

          

        if (count==2 && temp == rev) { 
            System.out.println("Prime and palindrome ");
        } else {
            System.out.println("Not prime and/or not a palindrome");
        }

        sc.close();
    }
}

/*
----------------------------- Output ---------------------------------------
C:\Users\Shree\Desktop\csj 35\logic Programming>java PalindromeAndPrime
Enter the value
131
Prime and palindrome
----------------------------------------------------------------------------
*/