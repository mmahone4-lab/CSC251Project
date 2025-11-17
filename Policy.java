public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int numberOfPolicies = 0;
    
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyHolder = new PolicyHolder();
        numberOfPolicies++;
    }
    
    public Policy(String policyNumber, String providerName, String firstName, String lastName, 
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
        numberOfPolicies++;
    }
    
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(policyHolder);
        numberOfPolicies++;
    }
    
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    
    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = new PolicyHolder(policyHolder);
    }
    
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    public String getProviderName() {
        return providerName;
    }
    
    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder);
    }
    
    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }
    
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;
        
        if (policyHolder.getAge() > 50) {
            additionalFee += 75.0;
        }
        
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            additionalFee += 100.0;
        }
        
        double bmi = policyHolder.calculateBMI();
        if (bmi > 35.0) {
            additionalFee += (bmi - 35.0) * 20.0;
        }
        
        return baseFee + additionalFee;
    }
    
    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString() + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePolicyPrice());
    }
}