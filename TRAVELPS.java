import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String w=sc.next();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if(w.charAt(i)=='0')
                {
                    sum=sum+a;
                }
                else
                {
                    sum=sum+b;
                }
            }
            System.out.println(sum);
        }
    }   
}
