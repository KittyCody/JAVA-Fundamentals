package text_processing;

import java.util.Scanner;

public class Extract_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        //"C:\Internal\training-internal\Template.pptx"
        String [] elements = path.split("\\\\");

        String fileName = elements[elements.length - 1].split("\\.")[0];
        String fileExtension = elements[elements.length - 1].split("\\.")[1];

        System.out.println("file name: " + fileName);
        System.out.println("file extension: " + fileExtension);


        scanner.close();
    }
}
