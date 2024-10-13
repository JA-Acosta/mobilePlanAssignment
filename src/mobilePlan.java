// Describe the class and the informaiton it contains.
public class mobilePlan {

    private int planType; // UPDATE TO USE AN ENUM IN THE FUTURE.
    private int minutes;
    private String[] planDescription = new String[]{
            "$39.99 base rate (450 minutes); $ .45 per additional minute.",
            "$59.99 base rate (900 minutes); $ .40 per additional minute.",
            "$69.99 base rate (unlimited)"
    };

    // Constructors:
    // Default constructor will set the user to the unlimited account and set
    // the minutes to zero.
    mobilePlan() {
        planType = 'c';
        minutes = 0;
    }

    // Constructor that assigns the account type and the total minutes used.
    mobilePlan(char planType, int minutes) {
        this.planType = planType;
        this.minutes = minutes;
    }

    // Setters:

    public void setPlanType(int planType) {
        this.planType = planType;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // Getters:

    public int getPlanType() {
        return planType;
    }

    public int getMinutes() {
        return minutes;
    }

    // Gets the list of plans offered by the company.
    // Return:
    //  - String[] planDescription: a list of all the plans available by the
    //  company.
    public String[] getPlanDescription() {
        return planDescription;
    }

    // Calculates the monthly bill fo the customer based on their plan and
    // the minutes they used.
    // Return:
    //  - double finalCharge: total for the month based on the customers plan
    //  and the minutes they used this month.
    public double monthlyBill() {
        double finalCharge = 0; // Flag
        if (planType == 'a') { // 39.99 mo (450 min) + .45 (450 < min)
            if (450 < minutes) {
                finalCharge = (minutes - 450) * .45;
            }
            finalCharge += 39.99;
        } else if (planType == 'b') { // $59.99 mo (900 min) + .40 (900 < min)
            if (900 < minutes) {
                finalCharge = (minutes - 900) * .40;
            }
            finalCharge += 59.99;
        } else { // 69.99 month (Unlimited min)
            finalCharge = 69.99;
        }
        return finalCharge;
    }
}
