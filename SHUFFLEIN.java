import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            t--;
            int n=sc.nextInt();
            int even_count=0, odd_count=0;
            int arr[]=new int[n];
            for(int i=0; i<n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0) {
                    even_count++;
                }
                else
                {
                    odd_count++;
                }
            }
            int sum=even_count+odd_count;
            int max=even_count>odd_count?even_count:odd_count;
            if((n==even_count||n==odd_count) && n%2==0) 
            {
                System.out.println(n/2);
            }
            else if((n==even_count||n==odd_count) && n%2==1)
            {
                if(n==even_count)
                System.out.println(n/2+1);
                else
                System.out.println(n/2);
            }
            else if(n%2==0) {
                System.out.println((sum-max)*2);
            }
            else
            {
                if(max== even_count)
                {
                    System.out.println(n);
                }
                else
                {
                    System.out.println(even_count*2);
                }
            }
    }
}
}

