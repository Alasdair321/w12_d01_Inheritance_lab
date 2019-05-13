import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director direct;

    @Before
    public void setUp() {
        direct = new Director("Simon", "ST001256A", 1000000.0,"Tech", 50.40);
    }

    @Test
    public void canGetName() {
        assertEquals("Simon", direct.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("ST001256A", direct.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000000.00, direct.getSalary(), 0.01);
    }

    @Test
    public void canGetDept() {
        assertEquals("Tech", direct.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(50.40, direct.getBudget(), 0);
    }

    @Test
    public void canIncreaseSalary() {
        direct.raiseSalary(2000.00);
        assertEquals(1002000.00, direct.getSalary(), 0.01);

    }
    @Test
    public void canNotDecreaseSalary() {
        direct.raiseSalary(-1);
        assertEquals(1000000, direct.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus() {
        direct.payBonus();
        assertEquals(1020000.00, direct.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        direct.setName(null);
        assertEquals("Simon", direct.getName());
    }

    @Test
    public void canChangeName() {
        direct.setName("Stevo");
        assertEquals("Stevo", direct.getName());
    }
}
