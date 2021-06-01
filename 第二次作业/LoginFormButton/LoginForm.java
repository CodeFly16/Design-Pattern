package LoginFormButton;

public class LoginForm {
	private AbstractButton btn;
	public LoginForm(AbstractButton btn) {
		this.btn=btn;
	}
	public void display(AbstractButton btn) {
		btn.display();
	}
}
