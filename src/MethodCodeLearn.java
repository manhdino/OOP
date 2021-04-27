import java.util.Scanner;
public class MethodCodeLearn {
    public static void InputArray(int[] arr,int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void ChiaHet(int[] arr,int n){
        for(int i = 0;i < n;i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        InputArray(arr,n);
        ChiaHet(arr,n);

    }
}
