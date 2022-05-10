package hospital;

public class Patient {


    private int healthLevel;

// default constructor
    public Patient(){
        this.healthLevel = 10; //default patient healthLevel
    }

    public int getHealthLevel() {
      
        return healthLevel;
        
    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;

    }
}
