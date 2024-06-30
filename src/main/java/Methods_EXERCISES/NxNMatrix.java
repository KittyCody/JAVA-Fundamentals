    package Methods_EXERCISES;

    import java.util.Scanner;

    public class NxNMatrix {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int number = Integer.parseInt(scan.nextLine());

            nxnMatrix(number);

            scan.close();
        }

        private static void nxnMatrix(int number) {
            for( int row = 1; row <= number; row++){
                for(int col = 1; col <= number; col++){
                    System.out.print(number + " ");
                }
                System.out.println();
                }
            }
        }

