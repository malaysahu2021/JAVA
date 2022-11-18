// public class singledimentionarray 
//  {
//         public static void main(String args[])
//          {
//         int a[]=new int[5]; 
//         a[0]=10;
//         a[1]=20;
//         a[2]=70;
//         a[3]=40;
//         a[4]=50;
        
//         for(int i=0;i<a.length;i++)
//         {
//         System.out.println(a[i]);
//         }
//         }
        
    
// }
// class TestArray1 {
//     public static void main(String args[]) 
//     {
//     int a[]={33,3,4,5};

//     for(int i=0;i<a.length;i++)//length is the property
//     {
//      System.out.println(a[i]);
//     }
//     }
// }  
// class singledimentionarray
// {
// public static void main(String args[]){
// int arr[]={33,3,4,5};
// //printing array using for-each loop
// for(int i:arr)
// {
// System.out.println(i);

// }
// }
// }
class singledimentionarray
{
static void min(int arr[]) {
int min=arr[0];
for(int i=1;i<arr.length;i++)
if(min>arr[i])
min=arr[i];
System.out.println(min);
}
public static void main(String args[]) 
{
int a[]={33,3,4,5};
min(a); 
}
}
