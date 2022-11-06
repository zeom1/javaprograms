import java.util.*;
class happynumber
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int temp =n;
        int digit; int sum =0;
        while (temp>9)
        { 
            sum=0;
            while(temp!=0)
            {
            digit=temp%10;
            sum=sum+(digit*digit);
            temp=temp/10;
        }
         temp= sum;
        }
        
            if (sum==1)
            System.out.println("HAPPY NUMBER");
            else
            System.out.println("NOT A HAPPY NUMBER");
        }
    }