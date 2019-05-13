import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Simon", "ST001256A", 18000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Simon", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("ST001256A", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(18000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(19000.00, developer.getSalary(), 0.01);

    }
    @Test
    public void canNotDecreaseSalary() {
        developer.raiseSalary(-1);
        assertEquals(18000.0, developer.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus() {
        developer.payBonus();
        assertEquals(18180.00, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        developer.setName(null);
        assertEquals("Simon", developer.getName());
    }

    @Test
    public void canChangeName() {
        developer.setName("Stevo");
        assertEquals("Stevo", developer.getName());
    }
}
