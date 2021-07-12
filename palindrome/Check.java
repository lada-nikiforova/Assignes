package hw.palindrome;

public class Check implements Inter{


    public boolean isPalindrome(int x){
        int pal = Math.abs(x);
        int reverse = 0;
        while (pal != 0){
                int x2 = pal % 10;
                reverse = reverse*10 + x2;
                pal = pal/10;
            }
        if (Math.abs(x) == reverse)
            return true;
        else
            return false;
    }




}
