import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void testObjectEquality()
    {
        Person person1 = new Person("James",18 );
        Person person2 = new Person("James",18 );
        // Person person2;

        // person2 = person1;





        assertEquals(person1, person2);

    }


    @Test(timeout = 1000)
    public void testObjectIdentity()
    {

        Person person1 = new Person("James",18 );
        Person person2 = person1;
        Person person3 = new Person("James", 18 );


        assertSame(person1,person2);
        assertNotSame(person1, person3);
    }

    @Test
    public void fail()
    {
        Person person1 = new Person("James",18 );
        Person person3 = person1;



        assertNotSame(person1,person3);

        Person person2 = new Person("James", 18 );
        assertSame(person1, person2);
    }


    @Ignore("Not Yet Implemented")
    @Test
    public void testIsAdult()
    {



    }












}
