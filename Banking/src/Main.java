public class Main {
    public static void main(String[] args) {

        // Your job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arrayList of Branches
        // Each Branch should have an arrayList of Customers
        // The Customer class should have an arrayList of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles
        // Branch:
        // Need to be able to add a new customer and initial transaction amount
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Tom", 170.34);
        bank.addCustomer("Adelaide", "John", 112.84);
        bank.addCustomer("Adelaide", "Katy", 199.17);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney", "Paul", 24.04);

        bank.addCustomerTransaction("Adelaide", "Tim", 15.45);
        bank.addCustomerTransaction("Adelaide", "Tim", 1.64);
        bank.addCustomerTransaction("Adelaide", "Tom", 17.55);

        bank.listCustomers("Adelaide",true);
        bank.listCustomers("Sydney",true);

        if(!bank.addCustomer("Melbourne","Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist.");
        }

    }

}
