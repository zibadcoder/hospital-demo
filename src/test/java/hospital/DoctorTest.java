package hospital;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {
    Doctor underTest = new Doctor("1", "name","speciality");
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20AfterProvidingCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
      assertEquals(20, patientHealthLevel);

    }

}
