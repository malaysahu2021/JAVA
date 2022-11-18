import java.util.*;
class TRY2
{
    void main()
    {
        Scanner sc =new Scanner(System.in);
        int a[]=new int [10];
        int i;
        int even=0;
        int odd=0;
        for(i=0;i<10;i++)
        {
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]%2==0)
            even++;
            else
            odd++;
        }

        System.out.println("number of even elements present in the array is:"+even);
        System.out.println("number of odd elements present in the array is:"+odd);
    
    }

}