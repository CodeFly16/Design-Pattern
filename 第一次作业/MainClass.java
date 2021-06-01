public class MainClass {
    public static void main(String[] args) {
//        LoginForm loginForm = new LoginForm();
        DBUtil dbUtil = new DBUtil();
        UserDao userDao = new UserDao(dbUtil);
        LoginForm loginForm = new LoginForm(userDao, "username", "password");
        loginForm.validate();
    }
}
