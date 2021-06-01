package LoginFormButton;

public class ButtonTest {

	public static void main(String[] args) {
		AbstractButton btn = new TriangleButton();
		LoginForm form = new LoginForm(btn);
		form.display(btn);
	}

}
