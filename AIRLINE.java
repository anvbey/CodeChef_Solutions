import java.util.*;
public class AIRLINE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
            int max=a>b?a>c?a:c:b>c?b:c;
            int lowest=a<b?a<c?a:c:b<c?b:c;
            if(max<=e && a+b+c-max<=d)
            {
                System.out.println("Yes");
            }
            else if(lowest<=e && a+b+c-lowest<=d)
            {
                System.out.println("Yes");
            }
            else if(a+b+c-(lowest+max)<=e && a+b+c-(lowest+max)<=d)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }

        }
    }
}