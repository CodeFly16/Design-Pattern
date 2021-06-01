package client;

public class CipherA extends Cipher{
	public CipherA() {
		
	}
	public String encrypt(String plainText) {
		return "123"+plainText;
	}
}
