package client;

public class CipherB extends Cipher{
	public CipherB() {
		
	}
	public String encrypt(String plainText) {
		return "321"+plainText;
	}
}
