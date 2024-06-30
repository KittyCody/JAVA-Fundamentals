package FundamentalsExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine().toLowerCase();
        String day = scan.nextLine().toLowerCase();

        double totalPrice = 0;

        switch (groupType) {
            case "students":
                totalPrice = switch (day) {
                    case "friday" -> numOfStudents * 8.45;
                    case "saturday" -> numOfStudents * 9.80;
                    case "sunday" -> numOfStudents * 10.46;
                    default -> 0;
                };

                if (numOfStudents >= 30) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;

            case "business":
                if (numOfStudents >= 100) {
                    totalPrice = switch (day) {
                        case "friday" -> (numOfStudents - 10) * 10.90;
                        case "saturday" -> (numOfStudents - 10) * 15.60;
                        case "sunday" -> (numOfStudents - 10) * 16;
                        default -> 0;
                    };
                } else {
                    totalPrice = switch (day) {
                        case "friday" -> numOfStudents * 10.90;
                        case "saturday" -> numOfStudents * 15.60;
                        case "sunday" -> numOfStudents * 16;
                        default -> 0;
                    };
                }
                break;

            case "regular":
                totalPrice = switch (day) {
                    case "friday" -> numOfStudents * 15;
                    case "saturday" -> numOfStudents * 20;
                    case "sunday" -> numOfStudents * 22.50;
                    default -> 0;
                };

                if (numOfStudents >= 10 && numOfStudents <= 20) {
                    totalPrice -= totalPrice * 0.05;
                }
                break;

            default:
                System.out.println("Invalid group type");
                return;
        }

        String formattedSum = String.format("%.2f", totalPrice);
        System.out.printf("Total price: %s%n", formattedSum);

        scan.close();
    }
}
