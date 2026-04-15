import java.io.*;

public class StudentFileDemo {
    public static void main(String[] args) {

        File file = new File("students.txt");
        BufferedWriter writer = null;
        BufferedReader reader = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("101, John, 85\n");
            writer.write("102, Alice, 90\n");
            writer.write("103, Bob, 78\n");
            System.out.println("Student records written to file.\n");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error closing writer: " + e.getMessage());
            }
        }

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Reading student records:\n");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}