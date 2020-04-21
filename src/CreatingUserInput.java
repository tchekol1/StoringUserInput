import java.util.Scanner;

public class CreatingUserInput {
    public static void main(String[] args) {
        String firstInitial,lastName, streetName,streetType,city;
        int houseNumber;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your first name initial ");
        firstInitial= scanner.next();
        System.out.println("Please enter your last name last name ");
        lastName= scanner.next();
        System.out.println("Please enter your house number ");
        scanner.nextLine();
        houseNumber= scanner.nextInt();
        System.out.println("Please enter street type ");
        streetType = scanner.next();
        System.out.println("Please enter street name");
        streetName = scanner.next();
        System.out.println("Please enter ciy ");
        city= scanner.next();
        scanner.close();
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);


    }
}
