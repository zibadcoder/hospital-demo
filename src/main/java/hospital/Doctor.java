package hospital;

public class Doctor {
    private String employeeNumber;
    private String name;
    private String speciality;
    public Doctor(String employeeNumber, String name, String speciality) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.speciality = speciality;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);


    }

    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);

    }
}
