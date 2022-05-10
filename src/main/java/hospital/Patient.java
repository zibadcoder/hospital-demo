package hospital;

public class Patient {


    private int healthLevel;
    private int bloodLevel;

    // default constructor
    public Patient() {
        this.healthLevel = 10; //default patient healthLevel
        this.bloodLevel = 20; //default blood level of patient
    }

    public int getHealthLevel() {

        return healthLevel;

    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;

    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;

    }
}
