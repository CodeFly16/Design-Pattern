package SourceTransformer;

public class DatabaseSource extends AbstractSource {
	public DatabaseSource() {
		
	}
	
	public void sourceName() {
		System.out.println("从数据库获取数据");
	}
	public void getSource() {
		getConnection();
		System.out.println("获取数据库数据");
	}
	public  void getConnection() {
		System.out.println("数据库连接");
	}
}
