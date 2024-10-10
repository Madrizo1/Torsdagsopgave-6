package Task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Jeppe", "Kaufmann", "JeppeK"));
        customers.add(new Customer("Rasmus", "Svendsen", "RSvendsen"));
        customers.add(new Customer("Andreas", "Williams", "AWilliams"));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }

    }
}
