import java.io.*; 
  
public class Counting { 
    public static void main(String[] args) 
        throws IOException 
    { 
        File file = new File("C:\\Users\\DELL\\Desktop\\Manish\\IO and Exception Assignment\\input.txt"); 
        FileInputStream fileInputStream = new FileInputStream(file); 
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
  
        String line; 
        int wordCount = 0; 
        int characterCount = 0; 
        int paraCount = 0; 
        int whiteSpaceCount = 0; 
        int lineCount = 0; 
  
        while ((line = bufferedReader.readLine()) != null) { 
            if (line.equals("")) { 
                paraCount += 1; 
            } 
            else { 
                characterCount += line.length(); 
                String words[] = line.split("\\s+"); 
                wordCount += words.length; 
                whiteSpaceCount += wordCount - 1; 
                String sentence[] = line.split("[!?.:]+"); 
                lineCount += sentence.length; 
            } 
        } 
        if (lineCount >= 1) { 
            paraCount++; 
        } 
        System.out.println("Total word count = "+ wordCount); 
        System.out.println("Total number of lines = "+ lineCount); 
        System.out.println("Total number of characters = "+ characterCount); 
        
    } 
}