package MoreExercises;
import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double sideWall = x * y;
        double windowSize = 1.5 * 1.5;
        double twoSideWalls = sideWall * 2 - 2 * windowSize;
        double backWall = x * x;
        double enter = 1.2 * 2;
        double backAndFrontWall = 2 * backWall - enter;
        double totalArea = twoSideWalls + backAndFrontWall;
        double greenPaint = totalArea / 3.4;
        double twoRectangleRoof = 2 * (x * y);
        double twoTriangles = 2 * ((x * h) / 2);
        double totalRoofArea = twoRectangleRoof + twoTriangles;
        double redPaint = totalRoofArea / 4.3;

        String greenPaintFormated = String.format("%.2f" , greenPaint);
        String redPaintFormated = String.format("%.2f", redPaint);

        System.out.println(greenPaintFormated);
        System.out.println(redPaintFormated);

        scan.close();

    }
}

//function PaintLitresNeeded(input) {
 // const x = parseFloat(input[0]);
  //const y = parseFloat(input[1]);
  //const h = parseFloat(input[2]);

  //const sideWall = x * y;
  //const windowSize = 1.5 * 1.5;
  //const twoSideWalls = sideWall * 2 - 2 * windowSize;
  //const backWall = x * x;
  //const enter = 1.2 * 2;
  //const backAndFrontWall = 2 * backWall - enter;
  //const totalArea = twoSideWalls + backAndFrontWall;
  //const greenPaint = totalArea / 3.4;
  //const twoRectangleRoof = 2 * (x * y);
  //const twoTriangles = 2 * ((x * h) / 2);
  //const totalRoofArea = twoRectangleRoof + twoTriangles;
  //const redPaint = totalRoofArea / 4.3;
    //console.log(greenPaint.toFixed(2) + "\n" + redPaint.toFixed(2));
//}