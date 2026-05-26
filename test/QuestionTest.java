package test;

import org.junit.jupiter.api.Test;

import level.Question;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    @Test
    public void testHowMany1() {
        Question q = new Question("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIGGLoo", "--howmany", null);
        assertEquals("12", q.questionLevel());
    }

    @Test
    public void testHowMany2() {
        Question q = new Question("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHM", "--howmany", null);
        assertEquals("10", q.questionLevel());
    }

    @Test
    public void testHowMany3() {
        Question q = new Question("BBDDCoEoooCKEoAACKGoooooGoooooGoHHHo", "--howmany", null);
        assertEquals("8", q.questionLevel());
    }

    @Test
    public void testHowMany4() {
        Question q = new Question("IBBBoDIooJoDoAAJoooooJoMKKoooMooHHHo", "--howmany", null);
        assertEquals("8", q.questionLevel());
    }

    @Test
    public void testHowMany5() {
        Question q = new Question("IoBBCCIDooooIDoAAoooJooMKKJooMoooHHH", "--howmany", null);
        assertEquals("9", q.questionLevel());
    }

    @Test
    public void testSize1() {
        Question q = new Question("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIGGLoo", "--size", "F");
        assertEquals("2", q.questionLevel());
    }

    @Test
    public void testSize2() {
        Question q = new Question("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHM", "--size", "A");
        assertEquals("2", q.questionLevel());
    }

    @Test
    public void testSize3() {
        Question q = new Question("BBDDCoEoooCKEoAACKGoooooGoooooGoHHHo", "--size", "B");
        assertEquals("2", q.questionLevel());
    }

    @Test
    public void testSize4() {
        Question q = new Question("BBDDCoEoooCKEoAACKGoooooGoooooGoHHHo", "--size", "C");
        assertEquals("3", q.questionLevel());
    }

    @Test
    public void testSize5() {
        Question q = new Question("IBBBoDIooJoDoAAJoooooJoMKKoooMooHHHo", "--size", "H");
        assertEquals("3", q.questionLevel());
    }

    @Test
    public void testSize6() {
        Question q = new Question("IoBBCCIDooooIDoAAoooJooMKKJooMoooHHH", "--size", "M");
        assertEquals("2", q.questionLevel());
    }

    @Test
    public void testWhat1() {
        Question q = new Question("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIGGLoo", "--what", "5,3");
        assertEquals("L", q.questionLevel());
    }

    @Test
    public void testWhat2() {
        Question q = new Question("BBJoooHoJDDMHAAooMHoKEEMIoKLFFIGGLoo", "--what", "0,3");
        assertEquals("o", q.questionLevel());
    }

    @Test
    public void testWhat3() {
        Question q = new Question("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHM", "--what", "2,2");
        assertEquals("A", q.questionLevel());
    }

    @Test
    public void testWhat4() {
        Question q = new Question("BBDDCoEoooCKEoAACKGoooooGoooooGoHHHo", "--what", "0,0");
        assertEquals("B", q.questionLevel());
    }

    @Test
    public void testWhat5() {
        Question q = new Question("IoBBCCIDooooIDoAAoooJooMKKJooMoooHHH", "--what", "5,5");
        assertEquals("H", q.questionLevel());
    }

    @Test
    public void testWhat6() {
        Question q = new Question("IBBBoDIooJoDoAAJoooooJoMKKoooMooHHHo", "--what", "3,5");
        assertEquals("M", q.questionLevel());
    }

    @Test
    public void testWhat7() {
        Question q = new Question("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHM", "--what", "1,4");
        assertEquals("D", q.questionLevel());
    }

    @Test
    public void testWhereIs1() {
        Question q = new Question("IBBoooIoooDDJAAoooJoKEEMooKooMGGHHHM", "--whereis", "A");
        assertEquals("(2,1)(2,2)", q.questionLevel());
    }

    @Test
    public void testWhereIs2() {
        Question q = new Question("BBDDCoEoooCKEoAACKGoooooGoooooGoHHHo", "--whereis", "B");
        assertEquals("(0,0)(0,1)", q.questionLevel());
    }

    @Test
    public void testWhereIs3() {
        Question q = new Question("BBDDCoEoooCKEoAACKGoooooGoooooGoHHHo", "--whereis", "C");
        assertEquals("(0,4)(1,4)(2,4)", q.questionLevel());
    }

    @Test
    public void testWhereIs4() {
        Question q = new Question("IBBBoDIooJoDoAAJoooooJoMKKoooMooHHHo", "--whereis", "H");
        assertEquals("(5,2)(5,3)(5,4)", q.questionLevel());
    }

    @Test
    public void testWhereIs5() {
        Question q = new Question("IoBBCCIDooooIDoAAoooJooMKKJooMoooHHH", "--whereis", "J");
        assertEquals("(3,2)(4,2)", q.questionLevel());
    }

    @Test
    public void testGoal() {
        Question q = new Question("IBBoooIoooDDJoAAooJoKEEMooKooMGGHHHM", "--goal", null);
        assertEquals("FALSE", q.questionLevel());
    }

    @Test
    public void testGoal2() {
        Question q = new Question("BBCCCLHDDDoLHoooAAEEIJKMFFIJKMoooGGM", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testGoal3() {
        Question q = new Question("ooooIJBBHoIJooHoAAGoHCCKGoDDDKEEoFFo", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testGoal4() {
        Question q = new Question("HBBBKoHICCKooIJoAADDJooLEEFFFLooGGGL", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testGoal5() {
        Question q = new Question("BBBIooCCCIooHoooAAHDDDJKEEFFJKoGGoJK", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testGoal6() {
        Question q = new Question("FoGIKoFoGIKoooooAABBHCCLDDHJoLoEEJoL", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testGoal7() {
        Question q = new Question("oBBJoKFooJoKFoooAAoHICCLGHIDDLGoIEEE", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testGoal8() {
        Question q = new Question("BBHIKLFoHIKLFoooAAGooJoMGCCJoMGDDEEE", "--goal", null);
        assertEquals("TRUE", q.questionLevel());
    }

    @Test
    public void testMove() {
        Question q = new Question("IBBoooIoooDDJoAAooJoKEEMooKooMGGHHHM", "--move", "A+1,A+1");
        assertEquals("IBBoooIoooDDJoooAAJoKEEMooKooMGGHHHM", q.questionLevel());
    }

    @Test
    public void testMove2() {
        Question q = new Question("ooHoooooHBBoAAHoIJCCooIJGDDDoKGEEFFK", "--move", "J+2,K+2");
        assertEquals("ooHooJooHBBJAAHoIKCCooIKGDDDooGEEFFo", q.questionLevel());
    }

    @Test
    public void testMove3() {
        Question q = new Question("ooHoooooHBBoAAHoIJoCCoIJGDDDoKGEEFFK", "--move", "C-1,J+2,K+2,D+2");
        assertEquals("ooHooJooHBBJAAHoIKCCooIKGooDDDGEEFFo", q.questionLevel());
    }

    @Test
    public void testMove4() {
        Question q = new Question("oooGoooFoGBBEFAAHJECCoHJEDDDIJooooIo", "--move", "E+1,D-1,F+1,A-1");
        assertEquals("oFoGooEFoGBBEAAoHJECCoHJDDDoIJooooIo", q.questionLevel());
    }

    @Test
    public void testMove5() {
        Question q = new Question("oIBBBLoIoCCLAAJoKLDDJoKoHEEFFFHGGGoo", "--move", "G+1,L-1,B+1,J+2");
        assertEquals("oIJBBBoIJCCLAAooKLDDooKLHEEFFFHoGGGo", q.questionLevel());
    }

    @Test
    public void testMove6() {
        Question q = new Question("oFooooEFBBooEAAoHJECCGHJDDDGIJooooIo", "--move", "H+2,J-1,A+3");
        assertEquals("oFooHoEFBBHoEoooAAECCGoJDDDGIJooooIJ", q.questionLevel());
    }

    @Test
    public void testMove7() {
        Question q = new Question("ooGIKLooGIKLoAAJoLoBBJCCFoHDDoFoHEEo", "--move", "F+4,A-1,B-1,H+2");
        assertEquals("FoGIKLFoGIKLAAHJoLBBHJCCoooDDooooEEo", q.questionLevel());
    }

    @Test
    public void testMove8() {
        Question q = new Question("ooIJBBFoIJoKFoIAAKoHoCCLGHoDDLGooEEE", "--move", "I-3,A-2,J-1");
        assertEquals("ooooBBFooJoKFAAJoKoHICCLGHIDDLGoIEEE", q.questionLevel());
    }

    @Test
    public void testMove9() {
        Question q = new Question("FooIBBFooIoLGAAJKLGoHJKoGoHCCMDDEEEM", "--move", "K+1,M+1,E+1");
        assertEquals("FooIBBFooIKLGAAJKLGoHJoMGoHCCMDDoEEE", q.questionLevel());
    }

    @Test
    public void testMove10() {
        Question q = new Question("FoGIKLFoGIKLAAoooLBBHoCCDDHJoooEEJoo", "--move", "C-1,L-3");
        assertEquals("FoGIKoFoGIKoAAooooBBHCCLDDHJoLoEEJoL", q.questionLevel());
    }

    @Test
    public void testMove11() {
        Question q = new Question("FooIBBFooIKLAAoJKLGoHJoMGoHCCMGDDEEE", "--move", "H+1,C-2,J-1,I-1");
        assertEquals("FoooBBFooIKLAAHIKLGoHJoMGCCJoMGDDEEE", q.questionLevel());
    }

    @Test
    public void testMove12() {
        Question q = new Question("oHBBoKFHoooKFAAJoLCCIJoLGoIDDoGoIEEE", "--move", "L-1,K-1,B+2");
        assertEquals("oHooBBFHoooKFAAJoKCCIJoLGoIDDLGoIEEE", q.questionLevel());
    }

    @Test
    public void testMove13() {
        Question q = new Question("EFoGooEFoGBBEAAoHJoCCoHJoDDDIJooooIo", "--move", "D-1,G-3,B-2");
        assertEquals("EFooooEFBBooEAAoHJoCCGHJDDDGIJooooIo", q.questionLevel());
    }

    @Test
    public void testMove14() {
        Question q = new Question("oFGooooFGBBBoooAAJCCooIJDDHoIKooHEEK", "--move", "G-2,B-1");
        assertEquals("oFoooooFBBBoooGAAJCCGoIJDDHoIKooHEEK", q.questionLevel());
    }

    @Test
    public void testMove15() {
        Question q = new Question("HBBBKoHICCKLoIAAoLDDJooLEEJFFFooGGGo", "--move", "A+1,J+1,F-1,L-2");
        assertEquals("HBBBKoHICCKooIJAAoDDJooLEEFFFLooGGGL", q.questionLevel());
    }
}