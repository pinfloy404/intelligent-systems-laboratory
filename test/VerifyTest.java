package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import level.Verify;

public class VerifyTest {

    @Test
    public void testError0x1() {
        Verify verify = new Verify("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIGGLoo");
        assertEquals(0, verify.verifyLevel());
    }

    @Test
    public void testError1x1() {
        Verify verify = new Verify("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIGGLo");
        assertEquals(1, verify.verifyLevel());
    }

    @Test
    public void testError1x2() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJo");
        assertEquals(1, verify.verifyLevel());
    }

    @Test
    public void testError1x3() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooM");
        assertEquals(1, verify.verifyLevel());
    }

    @Test
    public void testError1x4() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHH");
        assertEquals(1, verify.verifyLevel());
    }

    @Test
    public void testError1x5() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHMX");
        assertEquals(1, verify.verifyLevel());
    }

    @Test
    public void testError1x6() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHH");
        assertEquals(1, verify.verifyLevel());
    }

    @Test
    public void testError2x1() {
        Verify verify = new Verify("*BBoooIoooDDJAAoooJoKEEMooKooMGGHHHM");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x2() {
        Verify verify = new Verify("IBBoooIooo*DJAAoooJoKEEMooKooMGGHHHM");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x3() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJo*EEMooKooMGGHHHM");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x4() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHH*");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x5() {
        Verify verify = new Verify("8BBoooIoooDDJAAoooJoKEEMooKooMGGHHHM");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x6() {
        Verify verify = new Verify("IBBoooIooo8DJAAoooJoKEEMooKooMGGHHHM");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x7() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJo8EEMooKooMGGHHHM");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError2x8() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHH8");
        assertEquals(2, verify.verifyLevel());
    }

    @Test
    public void testError3x1() {
        Verify verify = new Verify("IBBoooIoooDDJoooooJoKEEMooKooMGGHHHM");
        assertEquals(3, verify.verifyLevel());
    }

    @Test
    public void testError4x1() {
        Verify verify = new Verify("IBBAAoIoooDDJoooooJoKEEMooKooMGGHHHM");
        assertEquals(4, verify.verifyLevel());
    }

    @Test
    public void testError4x2() {
        Verify verify = new Verify("IBBoooIAAoDDJoooooJoKEEMooKooMGGHHHM");
        assertEquals(4, verify.verifyLevel());
    }

    @Test
    public void testError4x3() {
        Verify verify = new Verify("IBBoooIoAADDJoooooJoKEEMooKooMGGHHHM");
        assertEquals(4, verify.verifyLevel());
    }

    @Test
    public void testError4x4() {
        Verify verify = new Verify("IBBoooIoooDDJoooooJoKEEMAAKooMGGHHHM");
        assertEquals(4, verify.verifyLevel());
    }

    @Test
    public void testError5x1() {
        Verify verify = new Verify("ooooooooooooAoooooAooooooooooooooooo");
        assertEquals(5, verify.verifyLevel());
    }

    @Test
    public void testError5x2() {
        Verify verify = new Verify("ooooooooooooooAoooooAooooooooooooooo");
        assertEquals(5, verify.verifyLevel());
    }

    @Test
    public void testError5x3() {
        Verify verify = new Verify("oooooooooooooooAoooooAoooooooooooooo");
        assertEquals(5, verify.verifyLevel());
    }

    @Test
    public void testError5x4() {
        Verify verify = new Verify("oooooooooooooooooAoooooAoooooooooooo");
        assertEquals(5, verify.verifyLevel());
    }

    @Test
    public void testError6x1() {
        Verify verify = new Verify("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIoGLoo");
        assertEquals(6, verify.verifyLevel());
    }

    @Test
    public void testError6x2() {
        Verify verify = new Verify("IBBZooIoooDDJAAoooJoKEEMooKooMGGHHHM");
        assertEquals(6, verify.verifyLevel());
    }

    @Test
    public void testError6x3() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHH");
        assertEquals(6, verify.verifyLevel());
    }

    @Test
    public void testError7x1() {
        Verify verify = new Verify("BBJoooHoJDDMHAAooMHoKEEMIoKoFFIGGKoo");
        assertEquals(7, verify.verifyLevel());
    }

    @Test
    public void testError7x2() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMBBKooMGGHHHM");
        assertEquals(7, verify.verifyLevel());
    }

    @Test
    public void testError7x3() {
        Verify verify = new Verify("IBBoooIoooDDJAAoooJoKEEMoKKooMGGHHHM");
        assertEquals(7, verify.verifyLevel());
    }
}