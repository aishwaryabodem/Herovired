import java.util.*;
public class unique {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            hs.add(arr[i]);
        System.out.print(hs);
        sc.close();
        

     }
     
    
}
