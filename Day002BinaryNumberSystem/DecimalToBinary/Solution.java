import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter any to convert into Binary number");
        x=sc.nextInt();
        int ans=0, mul=1;
        while(x>=1)
        {
            int curr=x%2;
            ans=ans+curr*mul;
            mul*=10;
            x/=2;
        }
        System.out.println("binary of your desire number is "+ ans);
    }
}