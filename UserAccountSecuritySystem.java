

class UserAccount {
    private String username;
    private String password;
    private String email;
    private int loginattempts;

    public UserAccount(String username, String password, String email, int loginattempts) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loginattempts = loginattempts;

    }

    public String getUsername() {
        return username;
    }

    public String getemail() {
        return email;
    }

    public void login(String password) {
        if (loginattempts >= 3) {
            System.out.println("Cannot Login");
        } else {
            if (this.password.equals(password)) {
                System.out.println("Login Successful");
            } else {
                loginattempts++;
                System.out.println("Invalid Password");
                if (loginattempts == 3) {
                    System.out.println("Account Locked ");
                    return;
                } else {
                    loginattempts++;
                    System.out.println("Invalid Passsword");
                    if (loginattempts == 3) {
                        System.out.println("Account Locked ");
                        return;
                    }
                }
            }
        }
    }

    public void resetPassword(String oldP, String newP) {
        if (this.password.equals(oldP)) {
            this.password = newP;
            System.out.println("Password reset successfully");
            loginattempts=0;
        } else {
            System.out.println("Invalid Password");
        }
    }

}

class UserAccountSecuritySystem {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("Jagadesh", "Jaga123", "jagadeshrvs@gmail.com", 0);
        user.login("Jaga1234");
        user.login("Jaga1234");
        user.login("Jaga1234");
        user.login("Jaga1234");
        user.resetPassword("Jaga123", "Jag12344");
        user.login("Jag12344");
    }
}