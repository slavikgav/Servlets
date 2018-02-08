
public class SilverCustomer  implements  Customer{
    private String companyName = "Lipton";
    private String name;
    public SilverCustomer(String name){
        this.name = name;
    }
    @Override
    public void buy() {
        System.out.println("I am a silver customer ! Where is my gold?)");
    }
}
