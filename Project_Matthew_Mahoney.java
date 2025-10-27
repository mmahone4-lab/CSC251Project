import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Matthew_Mahoney {
    public static void main(String[] args) throws IOException {
        ArrayList<Policy> policies = new ArrayList<>();
        Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"));
        
        while (fileScanner.hasNext()) {
            String policyNumber = fileScanner.nextLine();
            String providerName = fileScanner.nextLine();
            String firstName = fileScanner.nextLine();
            String lastName = fileScanner.nextLine();
            int age = Integer.parseInt(fileScanner.nextLine());
            String smokingStatus = fileScanner.nextLine();
            double height = Double.parseDouble(fileScanner.nextLine());
            double weight = Double.parseDouble(fileScanner.nextLine());
            
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);
            
            if (fileScanner.hasNext()) {
                fileScanner.nextLine();
            }
        }
        fileScanner.close();
        
        int smokerCount = 0;
        int nonSmokerCount = 0;
        
        for (Policy policy : policies) {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
            System.out.print("Policy claim status: Denied\n\n");
            
            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }
        
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}