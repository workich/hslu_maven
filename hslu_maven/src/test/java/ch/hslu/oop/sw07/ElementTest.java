package ch.hslu.oop.sw07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Objects;
import org.junit.jupiter.api.Test;

public class ElementTest {
    @Test
    public void equals() throws Exception {
        Pb pb = new Pb(30f);
        N n = new N(30f);
        assertEquals(false, pb.equals(n));
    }

    @Test
    public void compareHaschCode() throws Exception {
        Pb pb = new Pb(30f);
        Pb pb2 = new Pb(30f);
        assertEquals(true, Objects.equals(pb.hashCode(), pb2.hashCode()));
    }

   
}