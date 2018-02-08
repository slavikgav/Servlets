import java.util.List;

public class LeadCustomer implements Customer {
    private List<Customer> subordinates;

    public LeadCustomer(){}

    public void setSubordinates(List<Customer> subordinates){
        this.subordinates = subordinates;
    }
    @Override
    public void buy() {
        System.out.println("I am a lead of managers group in a few companies");
        for (Customer customer:subordinates){
            customer.buy();
            System.out.println("");
        }
    }
}
