package hospital;

public class Nurse {
    private String employeeNumber;
    private String name;
    private int numPatients;


    public Nurse(String employeeNumber, String name, int numPatients) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.numPatients = numPatients;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);

    }
}
