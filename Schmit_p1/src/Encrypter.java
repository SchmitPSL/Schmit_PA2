//To Encrypt:
		//Take the number and encrypt it:
			//Replace each digit with the result of adding 7 and
			//mod the new value with 10
			//Then swap the first digit with the third digit
			//And the second with the fourth digit.
			//Save the encrypted number
		//Print the encrypted integer
public class Encrypter {

	public String encrypt(int numberInt) {
		int digit1 = numberInt / 1000;
		int digit2 = (numberInt / 100) % 10;
		int digit3 = (numberInt / 10) % 10;
		int digit4 = numberInt % 10;

		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		digit4 = (digit4 + 7) % 10;

		String encryptedInt = "" + digit3 + digit4 + digit1 + digit2;

		return encryptedInt;

	}
}
