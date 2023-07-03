import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class RSAKeyPairGenerator {	
	public KeyPair generateKeyPair() throws NoSuchAlgorithmException {
		// Generate RSA key pair
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		keyPairGen.initialize(2048);  // Key size of 2048 bits
		return keyPairGen.generateKeyPair();
	}
}
