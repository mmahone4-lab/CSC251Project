public class Policy {

    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;
    
    public Policy() {
        policyNumber = "";
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        smokingStatus = "";
        policyholderHeight = 0.0;
        policyholderWeight = 0.0;
    }
    
    public Policy(String pNumber, String pName, String firstName, String lastName, 
                  int age, String smoking, double height, double weight) {
        policyNumber = pNumber;
        providerName = pName;
        policyholderFirstName = firstName;
        policyholderLastName = lastName;
        policyholderAge = age;
        smokingStatus = smoking;
        policyholderHeight = height;
        policyholderWeight = weight;
    }
    
    public void setPolicyNumber(String number) {
        policyNumber = number;
    }
    
    public void setProviderName(String name) {
        providerName = name;
    }
    
    public void setPolicyholderFirstName(String firstName) {
        policyholderFirstName = firstName;
    }
    
    public void setPolicyholderLastName(String lastName) {
        policyholderLastName = lastName;
    }
    
    public void setPolicyholderAge(int age) {
        policyholderAge = age;
    }
    
    public void setSmokingStatus(String status) {
        smokingStatus = status;
    }
    
    public void setPolicyholderHeight(double height) {
        policyholderHeight = height;
    }
    
    public void setPolicyholderWeight(double weight) {
        policyholderWeight = weight;
    }
    
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    public String getProviderName() {
        return providerName;
    }
    
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }
    
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }
    
    public int getPolicyholderAge() {
        return policyholderAge;
    }
    
    public String getSmokingStatus() {
        return smokingStatus;
    }
    
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }
    
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }
    
    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }
    
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;
        
        if (policyholderAge > 50) {
            additionalFee += 75.0;
        }
        
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            additionalFee += 100.0;
        }
        
        double bmi = calculateBMI();
        if (bmi > 35.0) {
            additionalFee += (bmi - 35.0) * 20.0;
        }
        
        return baseFee + additionalFee;
    }
}