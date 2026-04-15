 import java.io.*;

public class Q26 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide a file name as command-line argument.");
            return;
        }

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String words[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
