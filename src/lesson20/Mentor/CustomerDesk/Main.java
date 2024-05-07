package lesson20.Mentor.CustomerDesk;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer[] customers = new Customer[4];

        customers[0] = new Customer("Abraham", true);
        customers[1] = new Customer("Moses", false);
        customers[2] = new Customer("Jonas", true);
        customers[3] = new Customer("David", false);

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
