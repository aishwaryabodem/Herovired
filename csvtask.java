import java.io.BufferedReader;
import java.io.FileReader;
public class csvtask {
    public static void main(String[] args) {
        String a="";
        int count=0;
        float Billamount=0;
        try{
            float min=Float.MAX_VALUE;
            float max=Float.MIN_VALUE;
            BufferedReader Bufferobj=new BufferedReader(new FileReader("file.csv"));
            while((a=Bufferobj.readLine())!=null){
                String A[]=a.split(",");
                
                Billamount+=Float.parseFloat(A[3]);
                if(Billamount>max){
                    Billamount=max;
                }
                if(Billamount<min){
                    Billamount=min;
                }
                count++;
                
            }
            System.out.println(" Transaction : "+count);
            System.out.println("TotalBillAmount: "+Billamount);
            System.out.println("MaxBillAmount: "+max);
            System.out.println("MinBillAmount : "+min);
            Bufferobj.close();
        }
        catch (Exception e){
            System.out.println("Error");
        }
        
    }
}
