
public class mobileCustomer {
    // mobile plan information
    private String name; // First Middle Last
    private String deviceType;
    mobilePlan personalPlan;

    // Constructor:

    // Creates a customer account when the customer hasn't specified their
    // account type or the account minutes.
    // Default Setting for a plan is the unlimited plan.
    mobileCustomer(String name) {
        this.name = name;
        personalPlan = new mobilePlan('c', 0);
    }

    // Creates a customer account given the account type and sets the minutes
    // to zero
    mobileCustomer(String name, char plantType) {
        this.name = name;
        personalPlan = new mobilePlan(plantType, 0);
    }

    // Creates the users account with their name, device type, and the plan
    // type. Sets teh minutes to zero
    mobileCustomer(String name, String deviceType, char plantType) {
        this.name = name;
        this.deviceType = deviceType;
        personalPlan = new mobilePlan(plantType, 0);
    }

    // Getters:
    public String getName() {
        return name;
    }

    public int getMinutes() {
        return personalPlan.getMinutes();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public double getFinalCharge() {
        return personalPlan.monthlyBill();
    }

    public double getFinalCharge(int minutes) {
        personalPlan.setMinutes(minutes);
        return personalPlan.monthlyBill();
    }


    // Setters:
    public void updateName(String name) {
        this.name = name;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setMinutes(int minutes) {
        personalPlan.setMinutes(minutes);
    }
}
