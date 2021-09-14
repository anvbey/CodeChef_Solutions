import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Main{

    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
int t=sc.nextInt();

while(t-->0){
int n=sc.nextInt();
int x=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
boolean found=false;

for(int i=1;i<n;i++){
if(arr[i]==arr[0]){found=true;}
else{found=false;}
}
        
if(found){System.out.println(n+" "+0);return;}

HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();               
HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();

for(int i=0;i<n;i++){

    if(map1.keySet().contains(arr[i])){
    int a=map1.get(arr[i]);
    map1.replace(arr[i], a+1);
    }
    else
    map1.put(arr[i],1);
            
   }
    
map2.putAll(map1);

for(int i=0;i<n;i++){
if(map2.keySet().contains(arr[i]^x)){
int a=map2.get(arr[i]^x);
map2.replace(arr[i]^x, a+1);
}
else{
map2.put(arr[i]^x, 1);
}

}
   
  //  System.out.println(map2.values());

  
Map.Entry<Integer, Integer> max=null;

for(Map.Entry<Integer,Integer>val:map2.entrySet()){
  if(max==null || val.getValue().compareTo(max.getValue())>0){max=val;}
 }

   int k=0;
   boolean find=false;
   
   for(int i=0;i<n;i++){
   if(map2.get(arr[i])==max.getValue() && max.getValue()==map1.get(arr[i])){
    k=arr[i];
    find=true;
   break;
   }
   }
   if(find==true){
       if(map1.containsKey(k)){
        int ans=map2.get(k)-map1.get(k);
        System.out.println(max.getValue()+" "+ ans);
    }
    else{
        System.out.println(max.getValue()+" "+map2.get(k));
    }
   }
   
   if(find==false){ 
    HashSet<Integer> hs=new HashSet<>(); 
   for(Entry<Integer,Integer> entry: map2.entrySet()){
   if(entry.getValue()==max.getValue()){
   hs.add(entry.getKey());
   
    }
   }
    
//    System.out.println(k);
    
    /*if(map1.containsKey(k)){
        int ans=map2.get(k)-map1.get(k);
        System.out.println(max.getValue()+" "+ ans);
    }
    else{
        System.out.println(max.getValue()+" "+map2.get(k));
    }*/
    
   Object [] map2max=hs.toArray();
   int res[]=new int [map2max.length];
   int f=0;
     for(int i=0;i<map2max.length;i++){
      if(map1.containsKey(map2max[i])){
          res[f]=max.getValue()-map1.get(map2max[i]);
          f++;
      } 
     }

     if(res!=null){
     int p=res[0];
         for(int i=1;i<res.length;i++){
           if(p>res[i]){p=res[i];}
     }
         System.out.println(max.getValue()+" "+p);
     }
     else{
         System.out.println(max.getValue()+" "+max.getValue());
     }
   }
   }
  }  
}