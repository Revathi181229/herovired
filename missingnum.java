import java.util.Scanner;
class MissingNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int k=arr[N-1];
        for(int j=1;j<=k;j++){
            if(arr[i]!=j){
              System.out.print(j+" ");
            }
            else 
             i++;
        }
    }
}