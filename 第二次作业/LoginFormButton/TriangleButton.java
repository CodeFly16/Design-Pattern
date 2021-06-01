package LoginFormButton;

public class TriangleButton extends AbstractButton{
	public TriangleButton() {
		super("三角形");
	}
	public void display() {
		System.out.println("设置为"+super.getName());
	}
}
