package LoginFormButton;

public class CircleButton extends AbstractButton {
	public CircleButton(){
		super("圆形");
	}
	public void display() {
		System.out.println("设置为"+super.getName());
	}
}
