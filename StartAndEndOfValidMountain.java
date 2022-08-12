public class MyClass {
    public static void main(String args[]) {
   int[]  a={-1,2,4,6,-1,-2,2,3,-5};
   boolean rise=false,fall=false;
int[] s=new int[5];
int c=0;

int[] e=new int[5];
   
   for(int i=0;i<a.length-1;i++)
   { 
       
       if(i==a.length-2&&a[i]>a[i+1]) e[c]=i+1;
       if(a[i]<a[i+1])
       {
           if(fall==true)
           {
               e[c++]=i;
               fall=false;
               rise=false;
               continue;
           }
         if(rise==true) continue;
         
           
           rise=true;
           s[c]=i;
       }
       if(a[i]>a[i+1]&&rise==true)
       {
           
           if(fall==true)
           {
               continue;
           }
           
           fall=true;
       }
       
       
   }
   System.out.print(s[1]+","+e[1]);
   
   
    }
}
