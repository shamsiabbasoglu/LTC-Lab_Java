package lesson20.Mentor.CustomerDesk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Abraham", true));
        customers.add(new Customer("Moses", false));
        customers.add(new Customer("Jonas", true));
        customers.add(new Customer("David", false));

        List<String> senders = new LinkedList<>();
        List<String> receivers = new LinkedList<>();

        for (Customer customer : customers) {
            if (customer.isSending()) {
                senders.add(customer.getName());
            } else {
                receivers.add(customer.getName());
            }
        }

        System.out.println("Senders: " + senders);
        System.out.println("Receivers: " + receivers);
    }
}
