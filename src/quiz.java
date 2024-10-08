import java.util.Scanner;

public class quiz {


    public static class PasswordValidation {

        // Μέθοδος που ελέγχει αν το input είναι το ίδιο με τον προκαθορισμένο κωδικό
        public static boolean validatePassword(String input) {
            String predefinedPassword = "JavaRocks123"; // Ο προκαθορισμένος κωδικός πρόσβασης
            return input.equals(predefinedPassword);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ζήτηση κωδικού πρόσβασης από τον χρήστη
            System.out.print("Insert password: ");
            String userInput = scanner.nextLine();

            // Έλεγχος αν ο κωδικός είναι σωστός
            if (validatePassword(userInput)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }

            scanner.close();
        }
    }

}
