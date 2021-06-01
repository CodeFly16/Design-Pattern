import java.sql.Connection;

public class UserDao {
    private DBUtil db;

    public UserDao(DBUtil db) {
        this.db = db;
    }

    public boolean findUser(String userName, String userPassword) {
        String message;
        Boolean pass;
        db.getConnection();
        System.out.println("账号为:" + userName + "\n" + "密码为:" + userPassword);
        if (userName.equals("") || userName.equals(null) || userPassword.equals("") || userPassword.equals(null)) {
            message = "请输入用户名或密码";
            pass = false;
        }
        if (userName.equals("username")) {
            if (userPassword.equals("password")) {
                message = "登录成功";
                pass = true;
            } else {
                System.out.println("");
                message = "密码错误";
                pass = false;
            }
        } else {
            message = "用户名错误";
            pass = false;
        }
        System.out.println(message);
        if (!pass) {
            System.out.println("请重新输入账号或密码");
        }
        return pass;
    }
}
