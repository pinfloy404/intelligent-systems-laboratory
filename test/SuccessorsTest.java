package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import successor.Successors;

public class SuccessorsTest {

    @Test
    public void testSuccessors() {
        Successors successors = new Successors("IBBoooIoooDDJoAAooJoKEEMooKooMGGHHHM");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors(), successors.showSuccessors());
    }

    @Test
    public void testSuccessors2() {
        Successors successors = new Successors("BBBIJKooGIJKAAGIooCCoDDoooHoEEooHFFo");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors2(), successors.showSuccessors());
    }

    @Test
    public void testSuccessors3() {
        Successors successors = new Successors("ooooooooHBBoAAHooJGoHCCJGDDDIKEEFFIK");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors3(), successors.showSuccessors());
    }

    @Test
    public void testSuccessors4() {
        Successors successors = new Successors("ooooIJBBBoIJAAGooKCCGooKoFHDDooFHoEE");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors4(), successors.showSuccessors());
    }

    @Test
    public void testSuccessors5() {
        Successors successors = new Successors("HBBBooHoCCCooAAIJKDDDIJKEEFFJKGGoooo");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors5(), successors.showSuccessors());
    }

    @Test
    public void testSuccessors6() {
        Successors successors = new Successors("oooooooBBBHJAAGoHJCCGoIKFDDoIKFEEEoK");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors6(), successors.showSuccessors());
    }

    @Test
    public void testSuccessors7() {
        Successors successors = new Successors("ooooIJoBBBIJAAGooKCCGooKoFHoDDoFHoEE");
        successors.buildSuccessorsList();

        assertEquals(getExpectedSuccessors7(), successors.showSuccessors());
    }

    private String getExpectedSuccessors() {
        StringBuilder expected = new StringBuilder();
        expected.append("[A+1,IBBoooIoooDDJooAAoJoKEEMooKooMGGHHHM,5]").append(System.lineSeparator());
        expected.append("[A+2,IBBoooIoooDDJoooAAJoKEEMooKooMGGHHHM,4]").append(System.lineSeparator());
        expected.append("[A-1,IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHM,5]").append(System.lineSeparator());
        expected.append("[B+1,IoBBooIoooDDJoAAooJoKEEMooKooMGGHHHM,5]").append(System.lineSeparator());
        expected.append("[B+2,IooBBoIoooDDJoAAooJoKEEMooKooMGGHHHM,4]").append(System.lineSeparator());
        expected.append("[B+3,IoooBBIoooDDJoAAooJoKEEMooKooMGGHHHM,3]").append(System.lineSeparator());
        expected.append("[D-1,IBBoooIooDDoJoAAooJoKEEMooKooMGGHHHM,5]").append(System.lineSeparator());
        expected.append("[D-2,IBBoooIoDDooJoAAooJoKEEMooKooMGGHHHM,4]").append(System.lineSeparator());
        expected.append("[D-3,IBBoooIDDoooJoAAooJoKEEMooKooMGGHHHM,3]").append(System.lineSeparator());
        expected.append("[J-1,IBBoooIoooDDooAAooJoKEEMJoKooMGGHHHM,5]").append(System.lineSeparator());
        expected.append("[M+1,IBBoooIoooDDJoAAoMJoKEEMooKooMGGHHHo,5]");
        return expected.toString();
    }

    private String getExpectedSuccessors2() {
        StringBuilder expected = new StringBuilder();
        expected.append("[C+1,BBBIJKooGIJKAAGIoooCCDDoooHoEEooHFFo,5]").append(System.lineSeparator());
        expected.append("[D+1,BBBIJKooGIJKAAGIooCCooDDooHoEEooHFFo,5]").append(System.lineSeparator());
        expected.append("[D-1,BBBIJKooGIJKAAGIooCCDDooooHoEEooHFFo,5]").append(System.lineSeparator());
        expected.append("[E-1,BBBIJKooGIJKAAGIooCCoDDoooHEEoooHFFo,5]").append(System.lineSeparator());
        expected.append("[F+1,BBBIJKooGIJKAAGIooCCoDDoooHoEEooHoFF,5]").append(System.lineSeparator());
        expected.append("[G-1,BBBIJKoooIJKAAGIooCCGDDoooHoEEooHFFo,5]").append(System.lineSeparator());
        expected.append("[H+1,BBBIJKooGIJKAAGIooCCHDDoooHoEEoooFFo,5]").append(System.lineSeparator());
        expected.append("[J-1,BBBIoKooGIJKAAGIJoCCoDDoooHoEEooHFFo,5]").append(System.lineSeparator());
        expected.append("[K-1,BBBIJoooGIJKAAGIoKCCoDDoooHoEEooHFFo,5]").append(System.lineSeparator());
        expected.append("[K-2,BBBIJoooGIJoAAGIoKCCoDDKooHoEEooHFFo,4]");
        return expected.toString();
    }

    private String getExpectedSuccessors3() {
        StringBuilder expected = new StringBuilder();
        expected.append("[B+1,ooooooooHoBBAAHooJGoHCCJGDDDIKEEFFIK,5]").append(System.lineSeparator());
        expected.append("[H+1,ooHoooooHBBoAAHooJGooCCJGDDDIKEEFFIK,5]").append(System.lineSeparator());
        expected.append("[J+1,ooooooooHBBJAAHooJGoHCCoGDDDIKEEFFIK,5]").append(System.lineSeparator());
        expected.append("[J+2,oooooJooHBBJAAHoooGoHCCoGDDDIKEEFFIK,4]");
        return expected.toString();
    }

    private String getExpectedSuccessors4() {
        StringBuilder expected = new StringBuilder();
        expected.append("[B+1,ooooIJoBBBIJAAGooKCCGooKoFHDDooFHoEE,5]").append(System.lineSeparator());
        expected.append("[D+1,ooooIJBBBoIJAAGooKCCGooKoFHoDDoFHoEE,5]").append(System.lineSeparator());
        expected.append("[E-1,ooooIJBBBoIJAAGooKCCGooKoFHDDooFHEEo,5]").append(System.lineSeparator());
        expected.append("[I-1,oooooJBBBoIJAAGoIKCCGooKoFHDDooFHoEE,5]").append(System.lineSeparator());
        expected.append("[I-2,oooooJBBBooJAAGoIKCCGoIKoFHDDooFHoEE,4]").append(System.lineSeparator());
        expected.append("[K-1,ooooIJBBBoIJAAGoooCCGooKoFHDDKoFHoEE,5]");
        return expected.toString();
    }

    private String getExpectedSuccessors5() {
        StringBuilder expected = new StringBuilder();
        expected.append("[A-1,HBBBooHoCCCoAAoIJKDDDIJKEEFFJKGGoooo,5]").append(System.lineSeparator());
        expected.append("[B+1,HoBBBoHoCCCooAAIJKDDDIJKEEFFJKGGoooo,5]").append(System.lineSeparator());
        expected.append("[B+2,HooBBBHoCCCooAAIJKDDDIJKEEFFJKGGoooo,4]").append(System.lineSeparator());
        expected.append("[C+1,HBBBooHooCCCoAAIJKDDDIJKEEFFJKGGoooo,5]").append(System.lineSeparator());
        expected.append("[C-1,HBBBooHCCCoooAAIJKDDDIJKEEFFJKGGoooo,5]").append(System.lineSeparator());
        expected.append("[G+1,HBBBooHoCCCooAAIJKDDDIJKEEFFJKoGGooo,5]").append(System.lineSeparator());
        expected.append("[G+2,HBBBooHoCCCooAAIJKDDDIJKEEFFJKooGGoo,4]").append(System.lineSeparator());
        expected.append("[G+3,HBBBooHoCCCooAAIJKDDDIJKEEFFJKoooGGo,3]").append(System.lineSeparator());
        expected.append("[G+4,HBBBooHoCCCooAAIJKDDDIJKEEFFJKooooGG,2]").append(System.lineSeparator());
        expected.append("[H-1,oBBBooHoCCCoHAAIJKDDDIJKEEFFJKGGoooo,5]").append(System.lineSeparator());
        expected.append("[J-1,HBBBooHoCCCooAAIoKDDDIJKEEFFJKGGooJo,5]").append(System.lineSeparator());
        expected.append("[K+1,HBBBooHoCCCKoAAIJKDDDIJKEEFFJoGGoooo,5]").append(System.lineSeparator());
        expected.append("[K+2,HBBBoKHoCCCKoAAIJKDDDIJoEEFFJoGGoooo,4]").append(System.lineSeparator());
        expected.append("[K-1,HBBBooHoCCCooAAIJoDDDIJKEEFFJKGGoooK,5]");
        return expected.toString();
    }

    private String getExpectedSuccessors6() {
        StringBuilder expected = new StringBuilder();
        expected.append("[B-1,ooooooBBBoHJAAGoHJCCGoIKFDDoIKFEEEoK,5]").append(System.lineSeparator());
        expected.append("[D+1,oooooooBBBHJAAGoHJCCGoIKFoDDIKFEEEoK,5]").append(System.lineSeparator());
        expected.append("[E+1,oooooooBBBHJAAGoHJCCGoIKFDDoIKFoEEEK,5]").append(System.lineSeparator());
        expected.append("[H+1,ooooHooBBBHJAAGooJCCGoIKFDDoIKFEEEoK,5]").append(System.lineSeparator());
        expected.append("[I-1,oooooooBBBHJAAGoHJCCGooKFDDoIKFEEEIK,5]").append(System.lineSeparator());
        expected.append("[J+1,oooooJoBBBHJAAGoHoCCGoIKFDDoIKFEEEoK,5]");
        return expected.toString();
    }

    private String getExpectedSuccessors7() {
        StringBuilder expected = new StringBuilder();
        expected.append("[B-1,ooooIJBBBoIJAAGooKCCGooKoFHoDDoFHoEE,5]").append(System.lineSeparator());
        expected.append("[D-1,ooooIJoBBBIJAAGooKCCGooKoFHDDooFHoEE,5]").append(System.lineSeparator());
        expected.append("[E-1,ooooIJoBBBIJAAGooKCCGooKoFHoDDoFHEEo,5]").append(System.lineSeparator());
        expected.append("[I-1,oooooJoBBBIJAAGoIKCCGooKoFHoDDoFHoEE,5]").append(System.lineSeparator());
        expected.append("[I-2,oooooJoBBBoJAAGoIKCCGoIKoFHoDDoFHoEE,4]");
        return expected.toString();
    }
}