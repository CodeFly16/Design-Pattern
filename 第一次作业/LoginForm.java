public class LoginForm {
    private String userPassword;
    private UserDao userDao;
    private String userName;


    public LoginForm(UserDao userDao, String userName, String userPassword) {
        this.userDao = userDao;
        this.userName = userName;
        this.userPassword = userPassword;
        this.init();
        this.display();
    }

    public void init() {
        System.out.println("界面初始化中");
    }

    public void display() {
        System.out.println("显示界面");
    }

    public void validate() {
        System.out.println("校验中");
        userDao.findUser(userName, userPassword);
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public String getUserName() {
        return userName;
    }
}
