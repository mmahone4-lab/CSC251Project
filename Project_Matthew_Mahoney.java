import java.util.Scanner;

public class Project_Matthew_Mahoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the Policy Number: ");
        String policyNumber = scanner.nextLine();
        
        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();
        
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = scanner.nextDouble();
        
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = scanner.nextDouble();
        
        Policy myPolicy = new Policy(policyNumber, providerName, firstName, lastName, 
                                    age, smokingStatus, height, weight);
        
        System.out.println("\nPolicy Information:");
        System.out.println("Policy Number: " + myPolicy.getPolicyNumber());
        System.out.println("Provider Name: " + myPolicy.getProviderName());
        System.out.println("Policyholder's First Name: " + myPolicy.getPolicyholderFirstName());
        System.out.println("Policyholder's Last Name: " + myPolicy.getPolicyholderLastName());
        System.out.println("Policyholder's Age: " + myPolicy.getPolicyholderAge());
        System.out.println("Policyholder's Smoking Status: " + myPolicy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + myPolicy.getPolicyholderHeight() + " inches");
        System.out.println("Policyholder's Weight: " + myPolicy.getPolicyholderWeight() + " pounds");
        
        // Calculate and display BMI with 2 decimal places
        double bmi = myPolicy.calculateBMI();
        System.out.printf("Policyholder's BMI: %.2f\n", bmi);
        
        // Calculate and display policy price with 2 decimal places
        double policyPrice = myPolicy.calculatePolicyPrice();
        System.out.printf("Policy Price: $%.2f\n", policyPrice);
        
        
        System.out.print("Policy claim status: Denied");
        
        scanner.close();
    }
}