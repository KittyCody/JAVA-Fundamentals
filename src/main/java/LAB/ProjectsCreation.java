package LAB;
import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String architectName = scan.nextLine();
        int projectsNum = Integer.parseInt(scan.nextLine());

        int hoursNum = projectsNum * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s." , architectName, hoursNum, projectsNum);
    }
}
