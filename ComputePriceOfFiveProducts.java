import java.util.*;
import java.io.*;

class ComputePriceOfFiveProducts {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] productCode = new int[5];
        System.out.println("Enter the product code of five products : ");
        for ( int i =0 ; i < productCode.length ; i++){
            productCode[i]=sc.nextInt();
        } 
        double[] cost = new double[5];
        System.out.println("Enter the product cost of five products : ");
        for ( int i =0 ; i < cost.length ; i++){
            cost[i]= sc.nextDouble();
        }
        int[] quantity = new int[5];
        System.out.println("Enter the quantity of five products : ");
        for ( int i = 0 ; i < quantity.length ; i++){
            quantity[i] = sc.nextInt();
        }
        double[] totalPriceOfEachItem = new double[5];
        for ( int i = 0 ; i < totalPriceOfEachItem.length ; i++){
            totalPriceOfEachItem[i] = cost[i] * quantity[i] ;
        }

        FileWriter fw = new FileWriter("ProductDetails.txt");
        for ( int i =0 ; i < productCode.length ; i++){
            switch(i){
                case 0 :
                    fw.write("Product Code : "+ productCode[i]+"\n");
                    fw.write("Cost : Rs "+ cost[i]+" \n");
                    fw.write("Quantity : "+ quantity[i]+"\n");
                    fw.write("Total Cost : Rs "+ totalPriceOfEachItem[i]+" \n");
                    fw.write("\n");
                    fw.write("\n");
                    break;
                case 1 :
                    fw.write("Product Code : "+ productCode[i]+"\n");
                    fw.write("Cost : Rs "+ cost[i]+" \n");
                    fw.write("Quantity : "+ quantity[i]+"\n");
                    fw.write("Total Cost : Rs "+ totalPriceOfEachItem[i]+" \n");
                    fw.write("\n");
                    fw.write("\n");
                    break; 
                case 2 :
                    fw.write("Product Code : "+ productCode[i]+"\n");
                    fw.write("Cost : Rs "+ cost[i]+" \n");
                    fw.write("Quantity : "+ quantity[i]+"\n");
                    fw.write("Total Cost : Rs "+ totalPriceOfEachItem[i]+" \n");
                    fw.write("\n");
                    fw.write("\n");
                    break;
                case 3 :
                    fw.write("Product Code : "+ productCode[i]+"\n");
                    fw.write("Cost : Rs "+ cost[i]+" \n");
                    fw.write("Quantity : "+ quantity[i]+"\n");
                    fw.write("Total Cost : Rs "+ totalPriceOfEachItem[i]+" \n");
                    fw.write("\n");
                    fw.write("\n");
                    break; 
                case 4 :
                    fw.write("Product Code : "+ productCode[i]+"\n");
                    fw.write("Cost : Rs "+ cost[i]+" \n");
                    fw.write("Quantity : "+ quantity[i]+"\n");
                    fw.write("Total Cost : Rs "+ totalPriceOfEachItem[i]+" \n");
                    fw.write("\n");
                    fw.write("\n");
                    break; 
                default :
            }
        }
        double sum=0.0;
        for (int i = 0 ; i < totalPriceOfEachItem.length ; i++){
             sum += totalPriceOfEachItem[i];
        }
        fw.write("Total Value of All Products: Rs "+ sum);
        sc.close();
        fw.close();



    }
}