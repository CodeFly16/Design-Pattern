package client;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plainText = "abcdefg";

		System.out.println("使用A加密");
		Cipher cipherA = new CipherA();
		DataOperator operatorA = new DataOperator();
		operatorA.setCipherA(cipherA);
		System.out.println("加密前字符串: "+plainText);
		System.out.print("加密后字符串: ");
		System.out.println(operatorA.encrypt(plainText));

		System.out.println("使用B加密");
		Cipher cipherB = new CipherB();
		DataOperator operatorB = new DataOperator();
		operatorB.setCipherA(cipherB);
		System.out.println("加密前字符串: "+plainText);
		System.out.print("加密后字符串: ");
		System.out.println(operatorB.encrypt(plainText));
	}

}
