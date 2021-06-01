package SourceTransformer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractSource source = new DatabaseSource();
		AbstractTransformer transformer=new XLSTransformer();
		source.sourceName();
		transformer.transformer(source);
	}

}
