package SourceTransformer;

public class TextSource extends AbstractSource {
	public void sourceName() {
		System.out.println("从文本获取数据");
	}
	public void openFile() {
		System.out.println("从文本获取数据");
	}
	public void getSource() {
		openFile();
		System.out.println("从文本获取数据");
	}
}
