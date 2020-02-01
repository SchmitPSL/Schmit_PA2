
public class Decrypter {

	public String decrypt(int numberInt) {
		int digit1 = numberInt / 1000;
		int digit2 = (numberInt / 100) % 10;
		int digit3 = (numberInt / 10) % 10;
		int digit4 = numberInt % 10;

		digit1 = (digit1 + 3) % 10;
		digit2 = (digit2 + 3) % 10;
		digit3 = (digit3 + 3) % 10;
		digit4 = (digit4 + 3) % 10;

		String decryptedInt = "" + digit3 + digit4 + digit1 + digit2;

		return decryptedInt;
	}

}
