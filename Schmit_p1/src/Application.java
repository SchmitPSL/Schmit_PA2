import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Encrypter Encrypter = new Encrypter();
		Decrypter Decrypter = new Decrypter();
		
		Scanner input = new Scanner(System.in);
		String numberStr;
		int numberInt;

		// Infinite loop asking the user what they would like to do until they want to
		// exit the program
		while (true) {
			System.out.print("1.Encrypt a 4 digit number\n" + "2.Decrypt a 4 digit number\n" + "3.Exit the program\n"
					+ "Select what you would like to do: ");
			int choice = input.nextInt();
			// Asking the user to input their number they want to encrypt
			if (choice == 1) {
				System.out.print("Enter number to be encrypted: ");
				numberStr = input.next();
				numberInt = Integer.parseInt(numberStr);
				System.out.println("Encrypted Value is: " + Encrypter.encrypt(numberInt) + "\n");
			}
			// Asking the user to input their number they want to decrypt
			if (choice == 2) {
				System.out.print("Enter number to be decrypted: ");
				numberStr = input.next();
				numberInt = Integer.parseInt(numberStr);
				System.out.println("Decrypted Value is: " + Decrypter.decrypt(numberInt) + "\n");
			}
			// Exit the program
			if (choice == 3) {
				System.exit(0);
			}

		}

	}
}