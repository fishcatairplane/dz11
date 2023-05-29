import com.Person.Man;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Person.Woman;

public class WomanTest {
    private Woman Woman;

    @Test(description = "Test wrong First name")
    public void testGetWrongFirstName() {
        Woman woman = new Woman("Alla", "Nos", 61);
        Assert.assertNotEquals(woman.getFirstName(), "Nadiia");
    }

    @Test(description = "Test if woman  on retirement")
    public void testIsRetire() {
        Woman woman = new Woman("Alla", "Nos", 61);
        Assert.assertTrue(woman.isRetired());
    }

    @Test(description = "Test get/set woman partner")
    public void testGetSetWomanPartner() {
        Woman woman = new Woman("Alla", "Nos", 61);
        Man man = new Man("Stepan", "Petrovich", 33);
        Assert.assertNull(woman.getPartner());
        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man);
    }

    @Test(description = "Test changing last name after register partnership")
    public void testLastNameAfterRegisterPartnership() {
        Woman woman = new Woman("Alla", "Nos", 61);
        Man man = new Man("Stepan", "Petrovich", 33);
        Assert.assertNull(woman.getPartner());
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getPartner(), man);
        woman.setLastName(man.getLastName());
        Assert.assertEquals(woman.getLastName(), "Petrovich");
    }

    @Test(description = "Test changing last name after DEregistering partnership")
    public void testLastNameAfterDeRegisterPartnership() {
        Woman woman = new Woman("Alla", "Nos", 61);
        Man man = new Man("Stepan", "Petrovich", 33);
        woman.registerPartnership(man);
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), woman.getGirlishLastName());
    }
}
