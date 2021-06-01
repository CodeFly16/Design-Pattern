package client;

public class DataOperator {
	private Cipher cipher;
	
	public DataOperator() {
		
	}
	
	public void setCipherA(Cipher cipher) {
		this.cipher = cipher;
	}
	public String encrypt(String plainText) {

		String string = this.cipher.encrypt(plainText);
		
		return string;
	}
}
