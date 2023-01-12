
public class Test {

	public static void main(String[] args) {
		Secret secret;
		String message = "This is a secret message";

		System.out.println("Test Secret");
		System.out.println("Original message: " + message);
		secret = new Secret(message);
		System.out.println("Encrypted? " + secret.isEncrypted());
		secret.encrypt();
		System.out.println("Encrypted? " + secret.isEncrypted());
		System.out.println("Encrypted message: " + secret.getMessage());
		secret.decrypt();
		System.out.println("Encrypted? " + secret.isEncrypted());
		System.out.println("Decrypted message: " + secret.getMessage());

	}

}
