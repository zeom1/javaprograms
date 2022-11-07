import java.util.*;
class magicno
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num =n;
        int digit; int sum=0 ,reverse=0;
        while (num>9)
        { 
            sum=0;
            while(num!=0)
            {
               digit=num%10;
               sum=sum+digit;
               num=num/10;
            }
            num = sum;
        }
        
            if (sum==1 || n==1)
            System.out.println("MAGIC NUMBER");
            else
            System.out.println("NOT A MAGIC NUMBER");
        }
    }
