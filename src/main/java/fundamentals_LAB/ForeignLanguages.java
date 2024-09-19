package fundamentals_LAB;
import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      String country = scan.nextLine();

      String language = "";

      switch(country){
          case "England":
          case "USA":

          language = "English";

          break;
          case "Spain":
          case "Argentina":
          case "Mexico":

          language = "Spanish";
          break;

          default:
              System.out.println("unknown");
      }

      System.out.println(language);
        scan.close();
    }
}
