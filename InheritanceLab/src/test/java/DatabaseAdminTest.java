import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Simon", "ST001256A", 18000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Simon", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("ST001256A", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(18000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(19000.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canNotDecreaseSalary() {
        databaseAdmin.raiseSalary(-1);
        assertEquals(18000.0, databaseAdmin.getSalary(), 0.01);

    }

    @Test
    public void canGetBonus() {
        databaseAdmin.payBonus();
        assertEquals(18180.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotSetNameToNull() {
        databaseAdmin.setName(null);
        assertEquals("Simon", databaseAdmin.getName());
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Stevo");
        assertEquals("Stevo", databaseAdmin.getName());
    }
}
