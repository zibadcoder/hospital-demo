package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("1", "name", 5);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10To15WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(15, healthLevel);


    }
}
