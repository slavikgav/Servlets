public class Admin implements User {

    @Override
    public void login() {
        System.out.println("I am an administrator. I have all rights!");
    }
}
