import java.security.*;
import java.util.Base64;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// Get public and private keys
		RSAKeyPairGenerator keyPairGenerator = new RSAKeyPairGenerator();
		KeyPair keyPair = keyPairGenerator.generateKeyPair();
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();
		
		// Message to encrypt
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a message to encrypt: ");
		String message = scanner.nextLine();
		
		// Encrypt and decrypt the message
		RSAEncryptor encryptor = new RSAEncryptor();
		byte[] encryptedBytes = encryptor.encrypt(message, publicKey);
		byte[] decryptedBytes = encryptor.decrypt(encryptedBytes, privateKey);
		
		// Output the message
		System.out.println("The encypted message is: " + Base64.getEncoder().encodeToString(encryptedBytes));
		System.out.println("The decrypted message is: " + new String(decryptedBytes));
	}

}
