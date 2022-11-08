import java.util.*;
class palindromestr
{
    String wrd;
    int len;
    palindromestr()
    {
        wrd="";
        len=0;
    }
    void acceptword()
    {
        Scanner pb = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd=pb.next();
    }
    boolean palindrome()
    {
        String s="";
        len=wrd.length();
        for(int i=wrd.length()-1;i>=0;i--)
        s=s+wrd.charAt(i);
        if(s.equals(wrd))
        return true;
        return false;
    }
    void display()
    {
        System.out.println("The word was- " +wrd);
        if(palindrome())
        System.out.println("PALINDROME");
        else
        System.out.println("NOT A PALINDROME");
    }
    public static void main()
    {
        palindromestr ob = new palindromestr();
        ob.acceptword();
        ob.display();
    }
}
