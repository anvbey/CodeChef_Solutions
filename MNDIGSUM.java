import java.util.*;
class Main {


    public static int cal(int n, int i)
    {
        int x=0;
        while(n!=0)
        {
            x=x + (n%i);
            n=n/i;
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- > 0) {
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int min=100;
            int count=0;
            // if(n<l)
            // {
            //     System.out.println(l);
            // }
            for(int i=l;i<=r;i++)
            {
            int ans=cal(n, i);
            if(ans<min)
            {
                min=ans;
                count=i;
                if(min==1)
                break;
            }
            // System.out.println(min);
        }
        System.out.println(count);

    }
}
}