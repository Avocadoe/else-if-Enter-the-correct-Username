import java.util.Scanner;

class Username {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                //Asks user to verify their name
                System.out.println("Please verify by typing your name:" );
                String Username = sc.nextLine();

                //Checks if the users name is "Emsha"
                if(Username.equals("Emsha")) {
                        System.out.println("Welcome Emsha");
                }

                //If the wrong name is typed, user is told to leave
                else {
                        System.out.println("Please leave.");
                }


        }
}