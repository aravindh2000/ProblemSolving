public class MyClass {
    public static void main(String args[]) {
       int[] a={5,8,8};
       int rise=0,fall=0;
       for(int i=0;i<a.length-1;i++)
       {
           if(a[i]<a[i+1])
           {
               rise++;
           }
           if(a[i]>a[i+1])
           {
               fall++;
           }
         if(rise<1)
         {
             break;
             
         }
          
           
       }
       if((a.length-1)-rise==fall)
       {
           System.out.print("true");
       }
       else{
           System.out.println("False");
       }
    }
}


Output :

test case 1 :  i/p--> [5,8,8] o/p---> false
test case 2 :  i/p--> [1,2,4,2] o/p--->true
test case 3 :  i/p--> [5,2,1,4] o/p---->false
