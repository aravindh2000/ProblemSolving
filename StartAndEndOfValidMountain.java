public class MyClass {
    public static void main(String args[]) {
   int[]  a={-1,2,4,6,-1,-2,2,3,-5,1,3,5,6,7,0,-3,-5,2};
   boolean rise=false,fall=false;
int[] s=new int[100];
int c=0;

int[] e=new int[100];
   
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
 for(int k=0;k<s.length;k++)
 {
     if(s[k]==0&&e[k]==0)
     {
         break;
     }
     System.out.println("["+s[k]+","+e[k]+"]");
   
     
 }
         
   
    }
}
