import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Encrypter Encrypter = new Encrypter();
		Decrypter Decrypter = new Decrypter();

		// Ask user to input an integer to encrypt/decrypt
		System.out.print("Enter integer to encrypt/decrypt: ");
		Scanner input = new Scanner(System.in);
		String numberStr = input.nextLine();
//        System.out.println(numberStr); 
		int numberInt = Integer.parseInt(numberStr);

		System.out.println("Encrypted Value is: " + Encrypter.encrypt(numberInt));
		System.out.println("Decrypted Value is: " + Decrypter.decrypt(numberInt));
	}

}
