package Rizeq.learning;

public class Dealership {
    public static void main(String[] args) {

        Customer customer1 = new Customer("John", "123 Main St", 20000);

        Vehicle vehicle1 = new Vehicle("Japan", "Subaro", 15000);

        Vehicle vehicle2 = new Vehicle("Japan", "Subaro", 15000);

        Employee employee1 = new Employee();

        customer1.purchaseCar(vehicle1, employee1, false);

        boolean value = vehicle2.equals(vehicle1);
        System.out.println("Is it equal? " + value);

    }
}