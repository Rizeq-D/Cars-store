package Rizeq.learning;

public class Employee {
    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {

        if (finance == true) {
            double cost = vehicle.getPrice() - customer.getCashOnHand();
            runCreditHistory(customer, cost);

        }else if (vehicle.getPrice() <= customer.getCashOnHand()) {
            // customer pays in cash
            processTransaction(customer, vehicle);
        }else{

            System.out.println("The customer needs more many to purchase the vehicle model " +
                    "'" + vehicle.getModel() + "'");
        }

    }
    public void runCreditHistory(Customer customer, double cost) {

        System.out.println("Run credit history of the customer " + customer);
        System.out.println("The customer " + customer + " has been approved to purchase the vehicle");

    }
    public void processTransaction(Customer customer, Vehicle vehicle) {

        System.out.println("The customer " + customer + " has purchased the vehicle model " +
                "'"+ vehicle.getModel() +"'" + " for the price " + "(" + vehicle.getPrice() + ")");
    }

}
