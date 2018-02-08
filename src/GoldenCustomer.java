
public class GoldenCustomer implements Customer{
    private String companyName = "Arrabica";
    private String name;
    private User role;
    public GoldenCustomer(String name, User role){
        this.name = name;
        this.role = role;
    }
    @Override
    public void buy() {
        System.out.println("I am golden customer. Where is my gold?");
    }
}
