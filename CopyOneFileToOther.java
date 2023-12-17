import java.util.*;
import java.io.*;
public class CopyOneFileToOther{
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("input.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        Scanner sc = new Scanner(new File("input.txt"));

        FileWriter fw = new FileWriter("output.txt");

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            
            
            fw.write(s +"\n");
        }
         sc.close();
        fw.close();
    }
}