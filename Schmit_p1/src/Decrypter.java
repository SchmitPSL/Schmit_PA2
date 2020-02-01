/* To Decrypt:
 * 		Take the 4 digit number and break into 4 separate numbers
 * 		Add 3 to each individual number
 * 		Mod the new number by 10 to get the original value 
 * 		Swap the first value with the third value
 * 		Swap the second value with the fourth value
 * 		Put the 4 values together to create the decrypted 4 digit number
 * 
 * 
 */

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
