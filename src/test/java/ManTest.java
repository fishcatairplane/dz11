import com.Person.Man;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Person.Woman;

public class ManTest {
    private Man man;

    @Test(description = "Test getter/setter Last name")
    public void testGetSetLastName() {
        Man man = new Man("Petro", "Chaika", 31);
        Assert.assertEquals(man.getLastName(), "Chaika");
        man.setLastName("Shur");
        Assert.assertEquals(man.getLastName(), "Shur");
    }

    @Test(description = "Test getter/setter First name")
    public void testGetSetFirstName() {
        Man man = new Man("Petro", "Chaika", 31);
        Assert.assertEquals(man.getFirstName(), "Petro");
        man.setFirstName("Ihor");
        Assert.assertEquals(man.getFirstName(), "Ihor");
    }

    @Test(description = "Test getter/setter Age")
    public void testGetSetAge() {
        Man man = new Man("Petro", "Chaika", 31);
        Assert.assertEquals(man.getAge(), 31);
        man.setAge(61);
        Assert.assertEquals(man.getAge(), 61);
    }

    @Test(description = "Test if man not on retirement")
    public void testIsRetire() {
        Man man = new Man("Petro", "Chaika", 31);
        Assert.assertFalse(man.isRetired());
    }

    @Test(description = "Test get/set partner")
    public void testGetSetPartner() {
        Man man = new Man("Petro", "Chaika", 31);
        Woman woman = new Woman("Zoe", "Reno", 53);
        Assert.assertNull(man.getPartner());
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman);
    }
}


