import Staff.Management.Manager;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Simon", "ST001256A", 100000.0,"Tech" );
    }

    @Test
    public void canGetName() {
        assertEquals("Simon", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("ST001256A", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDept() {
        assertEquals("Tech", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary() {
        manager.raiseSalary(2000.00);
        assertEquals(102000.00, manager.getSalary(), 0.01);

    }
    @Test
    public void canNotDecreaseSalary() {
        manager.raiseSalary(-1);
        assertEquals(100000.0, manager.getSalary(), 0.01);

    }

    @Test
    public void cannotSetNameToNull() {
        manager.setName(null);
        assertEquals("Simon", manager.getName());
    }

    @Test
    public void canChangeName() {
        manager.setName("Stevo");
        assertEquals("Stevo", manager.getName());
    }

    @Test
    public void canGetBonus() {
        manager.payBonus();
        assertEquals(101000.00, manager.getSalary(), 0.01);
    }
}
