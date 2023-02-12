import java.util.Scanner;
public class arrayproducts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Products[]={"Mobiles","Laptops","Speakers","Earphones"};
        int ProductCount[]={10,20,30,40};
        String ProductDetails[]={"amerald display,6gb and 4gb ram, 120mprearcam and 15mpselfiecam ","1tb & 256 gb storage,Intelcore i3,i5","BOAT STONE 90Db","realme pods"};
        int Price[]={80000,21000,3500,1000};

        while(true){
            management();
            int n= sc.nextInt();
             sc.nextLine();
            if(n==1){
                P1(Products);
            }
            if(n==2){
                P2(Products,ProductCount);
            }
            if(n==3){
                P3(ProductCount,ProductDetails,Price);
            }
            if(n==4){
                int num=sc.nextInt();
                sc.nextLine();
                String EditProduct=sc.nextLine();
                P4(Products,ProductDetails,num,EditProduct);
            }
            if(n==5){
                P1(Products);
                int nums= sc.nextInt();
                sc.nextLine();
                P2(Products,ProductCount);
                int count=sc.nextInt();
                sc.nextLine();
                P5(Products,ProductCount,nums,count);
            }
            System.out.println("Press 1- ");
            char ch=sc.nextLine().charAt(0);
            if(ch=='1'){
                continue;
            }
            else{
                System.exit(0);
            }
            sc.close();
        }
       
    }
    

     public static void P5(String[] Products, int[] ProductCount, int nums, int count) {
        ProductCount[nums-1]=ProductCount[nums-1]+count;
        System.out.println("updated - "+Products[nums-1]+" updated details are- "+ProductCount[nums-1]);
    }

     public static void P4(String[] Products, String[] ProductDetails, int num, String EditProduct) {
           ProductDetails[num-1]=EditProduct;
            System.out.println("Type - "+Products[num-1]+" Productdetais are Edited as - "+ProductDetails[num-1]);
    }

     public static void P3( int[] ProductCount,String[]ProductDetails, int[] Price) {
        for(int i=0;i<4;i++){
            System.out.println("ProductDetails- "+ProductDetails[i]+",ProductCount -"+ProductCount[i]+",Costs - "+Price[i]);
        }
    }
     public  static void P2(String[] Products, int[] ProductCount) {
        for(int i=0;i<4;i++){
            System.out.println("Type - "+Products[i]+",Count-"+ProductCount[i]);
        }
    }
     public  static void P1(String[] Products) {
        for(int i=0;i<4;i++){
            System.out.println(Products[i]);
        }
    }

    public static void management() {
        System.out.println("1.List Of Products:");
        System.out.println("2.ProductCount of Products:");
        System.out.println("3.ProductDetails of Products:");
        System.out.println("4.EditProduct:");
        System.out.println("5.Update");
    }

}
