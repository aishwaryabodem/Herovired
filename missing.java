import java.util.Scanner;
public class missing {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum=0;
      int sumofnums = (n*(n+1))/2;
      int arr[] = new int[n];
      for(int i=0; i<=n-1; i++) {
         arr[i] = sc.nextInt();
      }
      for(int i=0; i<=n-2; i++) {
         sum = sum+arr[i];
      }
      int missingNumber = sumofnums-sum;
      System.out.println(missingNumber);
     sc.close();
   }
}