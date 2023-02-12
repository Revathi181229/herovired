import java.util.*;
public class Unique{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Arr[]=new int[N];
        for(int i=0;i<N;i++)
        Arr[i]=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(!l.contains(Arr[i]))
            l.add(Arr[i]);
        }
        System.out.print(l);
    }
}