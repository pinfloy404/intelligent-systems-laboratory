package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import solver.Solver;
import solver.Strategy;

public class SolverTestT4 {

    @Test
    public void testGBF1() {
        Solver solver = new Solver("BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo", Strategy.GBF, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF1(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar1() {
        Solver solver = new Solver("HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo", Strategy.AStar, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar1(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar2() {
        Solver solver = new Solver("IoBBCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar2(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF2() {
        Solver solver = new Solver("IoBBCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo", Strategy.GBF, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF2(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar3() {
        Solver solver = new Solver("oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar3(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF3() {
        Solver solver = new Solver("oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo", Strategy.GBF, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF3(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar4() {
        Solver solver = new Solver("EBBBIKEoFGIKAAFGJKoCCHJooooHDDoooooo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar4(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF4() {
        Solver solver = new Solver("EBBBIKEoFGIKAAFGJKoCCHJooooHDDoooooo", Strategy.GBF, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF4(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar5() {
        Solver solver = new Solver("BBBKooHJoKCCHJAALoHDDoLMIEEoLMIFFGGM", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar5(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF5() {
        Solver solver = new Solver("BBBKooHJoKCCHJAALoHDDoLMIEEoLMIFFGGM", Strategy.GBF, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF5(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar6() {
        Solver solver = new Solver("FBBBJKFooHJKAAGHoKCCGIoooooIDDEEEooo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar6(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF6() {
        Solver solver = new Solver("FBBBJKFooHJKAAGHoKCCGIoooooIDDEEEooo", Strategy.GBF, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF6(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar7() {
        Solver solver = new Solver("BBHooKFGHoJKFGAAJLFCCIoLoooIDDEEEIoo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar7(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF7() {
        Solver solver = new Solver("BBHooKFGHoJKFGAAJLFCCIoLoooIDDEEEIoo", Strategy.GBF, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF7(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar8() {
        Solver solver = new Solver("BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar8(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF8() {
        Solver solver = new Solver("BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo", Strategy.GBF, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF8(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar9() {
        Solver solver = new Solver("oooIBBooHICCAAHJKMDDoJKMGEEELNGFFFLN", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar9(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF9() {
        Solver solver = new Solver("oooIBBooHICCAAHJKMDDoJKMGEEELNGFFFLN", Strategy.GBF, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF9(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar10() {
        Solver solver = new Solver("oooHBBooGHCCAAGIJLFooIJLFDDDKMooEEKM", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar10(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF10() {
        Solver solver = new Solver("oooHBBooGHCCAAGIJLFooIJLFDDDKMooEEKM", Strategy.GBF, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF10(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar11() {
        Solver solver = new Solver("HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo", Strategy.AStar, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar11(), solver.showSolutionWay(false));
    }

    @Test
    public void testGBF11() {
        Solver solver = new Solver("HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo", Strategy.GBF, 0, true);
        solver.gameSolver();

        assertEquals(getExpectedGBF11(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar12() {
        Solver solver = new Solver("IoBBCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo", Strategy.AStar, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar12(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar13() {
        Solver solver = new Solver("oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo", Strategy.AStar, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar13(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar14() {
        Solver solver = new Solver("EBBBIKEoFGIKAAFGJKoCCHJooooHDDoooooo", Strategy.AStar, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar14(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar15() {
        Solver solver = new Solver("BBBKooHJoKCCHJAALoHDDoLMIEEoLMIFFGGM", Strategy.AStar, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar15(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar16() {
        Solver solver = new Solver("FBBBJKFooHJKAAGHoKCCGIoooooIDDEEEooo", Strategy.AStar, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar16(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar17() {
        Solver solver = new Solver("BBHooKFGHoJKFGAAJLFCCIoLoooIDDEEEIoo", Strategy.AStar, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar17(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar18() {
        Solver solver = new Solver("BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo", Strategy.AStar, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar18(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar19() {
        Solver solver = new Solver("oooIBBooHICCAAHJKMDDoJKMGEEELNGFFFLN", Strategy.AStar, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar19(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar20() {
        Solver solver = new Solver("oooHBBooGHCCAAGIJLFooIJLFDDDKMooEEKM", Strategy.AStar, 1, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar20(), solver.showSolutionWay(false));
    }

    @Test
    public void testAStar21() {
        Solver solver = new Solver("HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo", Strategy.AStar, 2, true);
        solver.gameSolver();

        assertEquals(getExpectedAStar21(), solver.showSolutionWay(false));
    }

    private String getExpectedGBF1() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,A+1,BBBIKLCCoIKLoAAJKMGDDJoMGoHEEMFFHooo,5,1,3,3]").append(System.lineSeparator());
        expected.append("[6,1,C+1,BBBIKLoCCIKLoAAJKMGDDJoMGoHEEMFFHooo,10,2,3,3]").append(System.lineSeparator());
        expected.append("[13,6,G+2,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMFFHooo,14,3,3,3]").append(System.lineSeparator());
        expected.append("[36,13,D-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMFFHooo,19,4,3,3]").append(System.lineSeparator());
        expected.append("[86,36,H+1,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMFFoooo,24,5,3,3]").append(System.lineSeparator());
        expected.append("[140,86,F+3,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMoooFFo,27,6,3,3]").append(System.lineSeparator());
        expected.append("[196,140,H-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMooHFFo,32,7,3,3]").append(System.lineSeparator());
        expected.append("[257,196,D+1,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMooHFFo,37,8,3,3]").append(System.lineSeparator());
        expected.append("[329,257,G-3,BBBIKLoCCIKLoAAJKMoDDJoMGoHEEMGoHFFo,40,9,3,3]").append(System.lineSeparator());
        expected.append("[398,329,D-1,BBBIKLoCCIKLoAAJKMDDoJoMGoHEEMGoHFFo,45,10,3,3]").append(System.lineSeparator());
        expected.append("[516,398,H+1,BBBIKLoCCIKLoAAJKMDDHJoMGoHEEMGooFFo,50,11,3,3]").append(System.lineSeparator());
        expected.append("[680,516,F-2,BBBIKLoCCIKLoAAJKMDDHJoMGoHEEMGFFooo,54,12,3,3]").append(System.lineSeparator());
        expected.append("[845,680,M-1,BBBIKLoCCIKLoAAJKoDDHJoMGoHEEMGFFooM,59,13,3,3]").append(System.lineSeparator());
        expected.append("[990,845,L-1,BBBIKooCCIKLoAAJKLDDHJoMGoHEEMGFFooM,64,14,3,3]").append(System.lineSeparator());
        expected.append("[1089,990,A-1,BBBIKooCCIKLAAoJKLDDHJoMGoHEEMGFFooM,69,15,4,4]").append(System.lineSeparator());
        expected.append("[1783,1089,H+1,BBBIKooCCIKLAAHJKLDDHJoMGooEEMGFFooM,74,16,4,4]").append(System.lineSeparator());
        expected.append("[2313,1783,E-2,BBBIKooCCIKLAAHJKLDDHJoMGEEooMGFFooM,78,17,4,4]").append(System.lineSeparator());
        expected.append("[3527,2313,J-2,BBBIKooCCIKLAAHoKLDDHooMGEEJoMGFFJoM,82,18,4,4]").append(System.lineSeparator());
        expected.append("[5657,3527,I-2,BBBoKooCCoKLAAHIKLDDHIoMGEEJoMGFFJoM,86,19,4,4]").append(System.lineSeparator());
        expected.append("[8446,5657,K-2,BBBooooCCooLAAHIKLDDHIKMGEEJKMGFFJoM,90,20,4,4]").append(System.lineSeparator());
        expected.append("[12339,8446,B+3,oooBBBoCCooLAAHIKLDDHIKMGEEJKMGFFJoM,93,21,4,4]").append(System.lineSeparator());
        expected.append("[17693,12339,C+2,oooBBBoooCCLAAHIKLDDHIKMGEEJKMGFFJoM,97,22,4,4]").append(System.lineSeparator());
        expected.append("[21406,17693,H+2,ooHBBBooHCCLAAoIKLDDoIKMGEEJKMGFFJoM,101,23,4,4]").append(System.lineSeparator());
        expected.append("[23696,21406,A+1,ooHBBBooHCCLoAAIKLDDoIKMGEEJKMGFFJoM,106,24,3,3]").append(System.lineSeparator());
        expected.append("[23702,23696,D+1,ooHBBBooHCCLoAAIKLoDDIKMGEEJKMGFFJoM,111,25,3,3]").append(System.lineSeparator());
        expected.append("[23709,23702,G+4,GoHBBBGoHCCLoAAIKLoDDIKMoEEJKMoFFJoM,113,26,3,3]").append(System.lineSeparator());
        expected.append("[23737,23709,D-1,GoHBBBGoHCCLoAAIKLDDoIKMoEEJKMoFFJoM,118,27,3,3]").append(System.lineSeparator());
        expected.append("[23811,23737,E-1,GoHBBBGoHCCLoAAIKLDDoIKMEEoJKMoFFJoM,123,28,3,3]").append(System.lineSeparator());
        expected.append("[23895,23811,A-1,GoHBBBGoHCCLAAoIKLDDoIKMEEoJKMoFFJoM,128,29,4,4]").append(System.lineSeparator());
        expected.append("[24984,23895,H-3,GooBBBGooCCLAAoIKLDDHIKMEEHJKMoFFJoM,131,30,4,4]").append(System.lineSeparator());
        expected.append("[25300,24984,A+1,GooBBBGooCCLoAAIKLDDHIKMEEHJKMoFFJoM,136,31,3,3]").append(System.lineSeparator());
        expected.append("[25314,25300,C-2,GooBBBGCCooLoAAIKLDDHIKMEEHJKMoFFJoM,140,32,3,3]").append(System.lineSeparator());
        expected.append("[25351,25314,G-1,oooBBBGCCooLGAAIKLDDHIKMEEHJKMoFFJoM,145,33,3,3]").append(System.lineSeparator());
        expected.append("[25547,25351,B-3,BBBoooGCCooLGAAIKLDDHIKMEEHJKMoFFJoM,148,34,3,3]").append(System.lineSeparator());
        expected.append("[26160,25547,I+2,BBBIooGCCIoLGAAoKLDDHoKMEEHJKMoFFJoM,152,35,3,3]").append(System.lineSeparator());
        expected.append("[27417,26160,A+1,BBBIooGCCIoLGoAAKLDDHoKMEEHJKMoFFJoM,157,36,2,2]").append(System.lineSeparator());
        expected.append("[27432,27417,K-1,BBBIooGCCIoLGoAAoLDDHoKMEEHJKMoFFJKM,162,37,2,2]").append(System.lineSeparator());
        expected.append("[27465,27432,A+1,BBBIooGCCIoLGooAALDDHoKMEEHJKMoFFJKM,167,38,1,1]").append(System.lineSeparator());
        expected.append("[27478,27465,L+1,BBBIoLGCCIoLGooAAoDDHoKMEEHJKMoFFJKM,172,39,1,1]").append(System.lineSeparator());
        expected.append("[27498,27478,A+1,BBBIoLGCCIoLGoooAADDHoKMEEHJKMoFFJKM,177,40,0,0]").append(System.lineSeparator());
        expected.append("TN: 27506").append(System.lineSeparator());
        expected.append("EN: 3014").append(System.lineSeparator());
        expected.append("CN: 22781").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }

    private String getExpectedAStar1() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo,0,0,7,7]").append(System.lineSeparator());
        expected.append("[1,0,J-1,HBBCCCHDDKoMAAoKoMEEJFFMoIJoLooIGGLo,5,1,6,11]").append(System.lineSeparator());
        expected.append("[7,1,A+1,HBBCCCHDDKoMoAAKoMEEJFFMoIJoLooIGGLo,10,2,5,15]").append(System.lineSeparator());
        expected.append("[19,7,H-1,oBBCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,15,3,5,20]").append(System.lineSeparator());
        expected.append("[30,19,B-1,BBoCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,20,4,5,25]").append(System.lineSeparator());
        expected.append("[43,30,C-1,BBCCCoHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,25,5,5,30]").append(System.lineSeparator());
        expected.append("[55,43,M+1,BBCCCMHDDKoMHAAKoMEEJFFooIJoLooIGGLo,30,6,5,35]").append(System.lineSeparator());
        expected.append("[66,55,F+1,BBCCCMHDDKoMHAAKoMEEJoFFoIJoLooIGGLo,35,7,5,40]").append(System.lineSeparator());
        expected.append("[76,66,K-2,BBCCCMHDDooMHAAooMEEJKFFoIJKLooIGGLo,39,8,4,43]").append(System.lineSeparator());
        expected.append("[78,76,A+2,BBCCCMHDDooMHooAAMEEJKFFoIJKLooIGGLo,43,9,2,45]").append(System.lineSeparator());
        expected.append("[90,78,D+2,BBCCCMHooDDMHooAAMEEJKFFoIJKLooIGGLo,47,10,2,49]").append(System.lineSeparator());
        expected.append("[114,90,J+2,BBCCCMHoJDDMHoJAAMEEoKFFoIoKLooIGGLo,51,11,2,53]").append(System.lineSeparator());
        expected.append("[134,114,E+1,BBCCCMHoJDDMHoJAAMoEEKFFoIoKLooIGGLo,56,12,2,58]").append(System.lineSeparator());
        expected.append("[147,134,H-3,BBCCCMooJDDMooJAAMoEEKFFHIoKLoHIGGLo,59,13,2,61]").append(System.lineSeparator());
        expected.append("[148,147,E-1,BBCCCMooJDDMooJAAMEEoKFFHIoKLoHIGGLo,64,14,2,66]").append(System.lineSeparator());
        expected.append("[160,148,J-2,BBCCCMoooDDMoooAAMEEJKFFHIJKLoHIGGLo,68,15,2,70]").append(System.lineSeparator());
        expected.append("[166,160,D-3,BBCCCMDDoooMoooAAMEEJKFFHIJKLoHIGGLo,71,16,2,73]").append(System.lineSeparator());
        expected.append("[176,166,A-3,BBCCCMDDoooMAAoooMEEJKFFHIJKLoHIGGLo,74,17,5,79]").append(System.lineSeparator());
        expected.append("[255,176,J+2,BBCCCMDDJooMAAJooMEEoKFFHIoKLoHIGGLo,78,18,6,84]").append(System.lineSeparator());
        expected.append("[336,255,K+2,BBCCCMDDJKoMAAJKoMEEooFFHIooLoHIGGLo,82,19,7,89]").append(System.lineSeparator());
        expected.append("[441,336,F-2,BBCCCMDDJKoMAAJKoMEEFFooHIooLoHIGGLo,86,20,7,93]").append(System.lineSeparator());
        expected.append("[547,441,L+3,BBCCCMDDJKLMAAJKLMEEFFooHIooooHIGGoo,89,21,8,97]").append(System.lineSeparator());
        expected.append("[687,547,F+2,BBCCCMDDJKLMAAJKLMEEooFFHIooooHIGGoo,93,22,8,101]").append(System.lineSeparator());
        expected.append("[926,687,G+2,BBCCCMDDJKLMAAJKLMEEooFFHIooooHIooGG,97,23,8,105]").append(System.lineSeparator());
        expected.append("[1323,926,J-3,BBCCCMDDoKLMAAoKLMEEooFFHIJoooHIJoGG,100,24,7,107]").append(System.lineSeparator());
        expected.append("[1658,1323,K-3,BBCCCMDDooLMAAooLMEEooFFHIJKooHIJKGG,103,25,6,109]").append(System.lineSeparator());
        expected.append("[2011,1658,A+2,BBCCCMDDooLMooAALMEEooFFHIJKooHIJKGG,107,26,4,111]").append(System.lineSeparator());
        expected.append("[2525,2011,D+2,BBCCCMooDDLMooAALMEEooFFHIJKooHIJKGG,111,27,4,115]").append(System.lineSeparator());
        expected.append("[3958,2525,E+2,BBCCCMooDDLMooAALMooEEFFHIJKooHIJKGG,115,28,4,119]").append(System.lineSeparator());
        expected.append("[6186,3958,H+3,BBCCCMHoDDLMHoAALMooEEFFoIJKoooIJKGG,118,29,4,122]").append(System.lineSeparator());
        expected.append("[8268,6186,I+3,BBCCCMHIDDLMHIAALMooEEFFooJKooooJKGG,121,30,4,125]").append(System.lineSeparator());
        expected.append("[10475,8268,E-2,BBCCCMHIDDLMHIAALMEEooFFooJKooooJKGG,125,31,4,129]").append(System.lineSeparator());
        expected.append("[13679,10475,J+1,BBCCCMHIDDLMHIAALMEEJoFFooJKoooooKGG,130,32,4,134]").append(System.lineSeparator());
        expected.append("[16824,13679,K+1,BBCCCMHIDDLMHIAALMEEJKFFooJKooooooGG,135,33,4,139]").append(System.lineSeparator());
        expected.append("[19078,16824,G-4,BBCCCMHIDDLMHIAALMEEJKFFooJKooGGoooo,137,34,4,141]").append(System.lineSeparator());
        expected.append("[19959,19078,J-1,BBCCCMHIDDLMHIAALMEEoKFFooJKooGGJooo,142,35,4,146]").append(System.lineSeparator());
        expected.append("[21383,19959,K-1,BBCCCMHIDDLMHIAALMEEooFFooJKooGGJKoo,147,36,4,151]").append(System.lineSeparator());
        expected.append("[22465,21383,F-2,BBCCCMHIDDLMHIAALMEEFFooooJKooGGJKoo,151,37,4,155]").append(System.lineSeparator());
        expected.append("[23199,22465,L-3,BBCCCMHIDDoMHIAAoMEEFFooooJKLoGGJKLo,154,38,3,157]").append(System.lineSeparator());
        expected.append("[23466,23199,M-3,BBCCCoHIDDooHIAAooEEFFoMooJKLMGGJKLM,157,39,2,159]").append(System.lineSeparator());
        expected.append("[23735,23466,A+2,BBCCCoHIDDooHIooAAEEFFoMooJKLMGGJKLM,161,40,0,161]").append(System.lineSeparator());
        expected.append("TN: 23977").append(System.lineSeparator());
        expected.append("EN: 3062").append(System.lineSeparator());
        expected.append("CN: 20329").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }

    private String getExpectedAStar2() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,IoBBCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[2,0,E-1,IoBBCCIoJDDLAAJooLEEoFFMGGGKoMHHoKoo,5,1,4,9]").append(System.lineSeparator());
        expected.append("[14,2,J-1,IoBBCCIooDDLAAJooLEEJFFMGGGKoMHHoKoo,10,2,4,14]").append(System.lineSeparator());
        expected.append("[62,14,D-2,IoBBCCIDDooLAAJooLEEJFFMGGGKoMHHoKoo,14,3,4,18]").append(System.lineSeparator());
        expected.append("[96,62,M-1,IoBBCCIDDooLAAJooLEEJFFoGGGKoMHHoKoM,19,4,4,23]").append(System.lineSeparator());
        expected.append("[302,96,F+1,IoBBCCIDDooLAAJooLEEJoFFGGGKoMHHoKoM,24,5,4,28]").append(System.lineSeparator());
        expected.append("[739,302,K+3,IoBBCCIDDKoLAAJKoLEEJoFFGGGooMHHoooM,27,6,4,31]").append(System.lineSeparator());
        expected.append("[1240,739,H+3,IoBBCCIDDKoLAAJKoLEEJoFFGGGooMoooHHM,30,7,4,34]").append(System.lineSeparator());
        expected.append("[1885,1240,B-1,IBBoCCIDDKoLAAJKoLEEJoFFGGGooMoooHHM,35,8,4,39]").append(System.lineSeparator());
        expected.append("[2787,1885,C-1,IBBCCoIDDKoLAAJKoLEEJoFFGGGooMoooHHM,40,9,4,44]").append(System.lineSeparator());
        expected.append("[3788,2787,F-1,IBBCCoIDDKoLAAJKoLEEJFFoGGGooMoooHHM,45,10,4,49]").append(System.lineSeparator());
        expected.append("[4800,3788,L+1,IBBCCLIDDKoLAAJKooEEJFFoGGGooMoooHHM,50,11,4,54]").append(System.lineSeparator());
        expected.append("[5720,4800,M+2,IBBCCLIDDKoLAAJKoMEEJFFMGGGooooooHHo,54,12,4,58]").append(System.lineSeparator());
        expected.append("[6247,5720,G+3,IBBCCLIDDKoLAAJKoMEEJFFMoooGGGoooHHo,57,13,4,61]").append(System.lineSeparator());
        expected.append("[6504,6247,J-2,IBBCCLIDDKoLAAoKoMEEoFFMooJGGGooJHHo,61,14,4,65]").append(System.lineSeparator());
        expected.append("[6669,6504,A+1,IBBCCLIDDKoLoAAKoMEEoFFMooJGGGooJHHo,66,15,3,69]").append(System.lineSeparator());
        expected.append("[6739,6669,E+1,IBBCCLIDDKoLoAAKoMoEEFFMooJGGGooJHHo,71,16,3,74]").append(System.lineSeparator());
        expected.append("[6819,6739,I-4,oBBCCLoDDKoLoAAKoMoEEFFMIoJGGGIoJHHo,73,17,3,76]").append(System.lineSeparator());
        expected.append("[6885,6819,B-1,BBoCCLoDDKoLoAAKoMoEEFFMIoJGGGIoJHHo,78,18,3,81]").append(System.lineSeparator());
        expected.append("[7061,6885,D-1,BBoCCLDDoKoLoAAKoMoEEFFMIoJGGGIoJHHo,83,19,3,86]").append(System.lineSeparator());
        expected.append("[7317,7061,E-1,BBoCCLDDoKoLoAAKoMEEoFFMIoJGGGIoJHHo,88,20,3,91]").append(System.lineSeparator());
        expected.append("[7599,7317,A-1,BBoCCLDDoKoLAAoKoMEEoFFMIoJGGGIoJHHo,93,21,4,97]").append(System.lineSeparator());
        expected.append("[8028,7599,J+4,BBJCCLDDJKoLAAoKoMEEoFFMIooGGGIooHHo,95,22,4,99]").append(System.lineSeparator());
        expected.append("[8304,8028,A+1,BBJCCLDDJKoLoAAKoMEEoFFMIooGGGIooHHo,100,23,3,103]").append(System.lineSeparator());
        expected.append("[8988,8304,E+1,BBJCCLDDJKoLoAAKoMoEEFFMIooGGGIooHHo,105,24,3,108]").append(System.lineSeparator());
        expected.append("[10721,8988,I+2,BBJCCLDDJKoLIAAKoMIEEFFMoooGGGoooHHo,109,25,3,112]").append(System.lineSeparator());
        expected.append("[13290,10721,G-3,BBJCCLDDJKoLIAAKoMIEEFFMGGGooooooHHo,112,26,3,115]").append(System.lineSeparator());
        expected.append("[16209,13290,M-2,BBJCCLDDJKoLIAAKooIEEFFoGGGooMoooHHM,116,27,3,119]").append(System.lineSeparator());
        expected.append("[21485,16209,F+1,BBJCCLDDJKoLIAAKooIEEoFFGGGooMoooHHM,121,28,3,124]").append(System.lineSeparator());
        expected.append("[29677,21485,K-2,BBJCCLDDJooLIAAoooIEEKFFGGGKoMoooHHM,125,29,3,128]").append(System.lineSeparator());
        expected.append("[37151,29677,A+3,BBJCCLDDJooLIoooAAIEEKFFGGGKoMoooHHM,128,30,0,128]").append(System.lineSeparator());
        expected.append("TN: 37265").append(System.lineSeparator());
        expected.append("EN: 3888").append(System.lineSeparator());
        expected.append("CN: 24661").append(System.lineSeparator());
        expected.append("DF: 31");
        return expected.toString();
    }

    private String getExpectedGBF2() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,IoBBCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,B-1,IBBoCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo,5,1,4,4]").append(System.lineSeparator());
        expected.append("[6,1,C-1,IBBCCoIoJDDLAAJooLoEEFFMGGGKoMHHoKoo,10,2,4,4]").append(System.lineSeparator());
        expected.append("[27,6,E-1,IBBCCoIoJDDLAAJooLEEoFFMGGGKoMHHoKoo,15,3,4,4]").append(System.lineSeparator());
        expected.append("[96,27,J-1,IBBCCoIooDDLAAJooLEEJFFMGGGKoMHHoKoo,20,4,4,4]").append(System.lineSeparator());
        expected.append("[273,96,D-2,IBBCCoIDDooLAAJooLEEJFFMGGGKoMHHoKoo,24,5,4,4]").append(System.lineSeparator());
        expected.append("[654,273,L+1,IBBCCLIDDooLAAJoooEEJFFMGGGKoMHHoKoo,29,6,4,4]").append(System.lineSeparator());
        expected.append("[1266,654,M-1,IBBCCLIDDooLAAJoooEEJFFoGGGKoMHHoKoM,34,7,4,4]").append(System.lineSeparator());
        expected.append("[2036,1266,F+1,IBBCCLIDDooLAAJoooEEJoFFGGGKoMHHoKoM,39,8,4,4]").append(System.lineSeparator());
        expected.append("[2935,2036,K+3,IBBCCLIDDKoLAAJKooEEJoFFGGGooMHHoooM,42,9,4,4]").append(System.lineSeparator());
        expected.append("[3944,2935,F-1,IBBCCLIDDKoLAAJKooEEJFFoGGGooMHHoooM,47,10,4,4]").append(System.lineSeparator());
        expected.append("[4965,3944,M+2,IBBCCLIDDKoLAAJKoMEEJFFMGGGoooHHoooo,51,11,4,4]").append(System.lineSeparator());
        expected.append("[5795,4965,G+3,IBBCCLIDDKoLAAJKoMEEJFFMoooGGGHHoooo,54,12,4,4]").append(System.lineSeparator());
        expected.append("[6385,5795,J-1,IBBCCLIDDKoLAAoKoMEEJFFMooJGGGHHoooo,59,13,4,4]").append(System.lineSeparator());
        expected.append("[6653,6385,A+1,IBBCCLIDDKoLoAAKoMEEJFFMooJGGGHHoooo,64,14,3,3]").append(System.lineSeparator());
        expected.append("[6663,6653,H+3,IBBCCLIDDKoLoAAKoMEEJFFMooJGGGoooHHo,67,15,3,3]").append(System.lineSeparator());
        expected.append("[6685,6663,J-1,IBBCCLIDDKoLoAAKoMEEoFFMooJGGGooJHHo,72,16,3,3]").append(System.lineSeparator());
        expected.append("[6725,6685,E+1,IBBCCLIDDKoLoAAKoMoEEFFMooJGGGooJHHo,77,17,3,3]").append(System.lineSeparator());
        expected.append("[6794,6725,I-4,oBBCCLoDDKoLoAAKoMoEEFFMIoJGGGIoJHHo,79,18,3,3]").append(System.lineSeparator());
        expected.append("[6902,6794,B-1,BBoCCLoDDKoLoAAKoMoEEFFMIoJGGGIoJHHo,84,19,3,3]").append(System.lineSeparator());
        expected.append("[7032,6902,D-1,BBoCCLDDoKoLoAAKoMoEEFFMIoJGGGIoJHHo,89,20,3,3]").append(System.lineSeparator());
        expected.append("[7188,7032,E-1,BBoCCLDDoKoLoAAKoMEEoFFMIoJGGGIoJHHo,94,21,3,3]").append(System.lineSeparator());
        expected.append("[7329,7188,A-1,BBoCCLDDoKoLAAoKoMEEoFFMIoJGGGIoJHHo,99,22,4,4]").append(System.lineSeparator());
        expected.append("[7892,7329,J+4,BBJCCLDDJKoLAAoKoMEEoFFMIooGGGIooHHo,101,23,4,4]").append(System.lineSeparator());
        expected.append("[8297,7892,A+1,BBJCCLDDJKoLoAAKoMEEoFFMIooGGGIooHHo,106,24,3,3]").append(System.lineSeparator());
        expected.append("[8310,8297,E+1,BBJCCLDDJKoLoAAKoMoEEFFMIooGGGIooHHo,111,25,3,3]").append(System.lineSeparator());
        expected.append("[8325,8310,I+2,BBJCCLDDJKoLIAAKoMIEEFFMoooGGGoooHHo,115,26,3,3]").append(System.lineSeparator());
        expected.append("[8437,8325,G-3,BBJCCLDDJKoLIAAKoMIEEFFMGGGooooooHHo,118,27,3,3]").append(System.lineSeparator());
        expected.append("[8807,8437,M-2,BBJCCLDDJKoLIAAKooIEEFFoGGGooMoooHHM,122,28,3,3]").append(System.lineSeparator());
        expected.append("[9592,8807,F+1,BBJCCLDDJKoLIAAKooIEEoFFGGGooMoooHHM,127,29,3,3]").append(System.lineSeparator());
        expected.append("[10910,9592,K-2,BBJCCLDDJooLIAAoooIEEKFFGGGKoMoooHHM,131,30,3,3]").append(System.lineSeparator());
        expected.append("[20785,10910,A+3,BBJCCLDDJooLIoooAAIEEKFFGGGKoMoooHHM,134,31,0,0]").append(System.lineSeparator());
        expected.append("TN: 20792").append(System.lineSeparator());
        expected.append("EN: 2332").append(System.lineSeparator());
        expected.append("CN: 15425").append(System.lineSeparator());
        expected.append("DF: 39");
        return expected.toString();
    }

    private String getExpectedAStar3() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,A+1,oBBBKMCCoIKMoAAILoGDDJLoGoHJEEFFHooo,5,1,3,8]").append(System.lineSeparator());
        expected.append("[9,1,C+1,oBBBKMoCCIKMoAAILoGDDJLoGoHJEEFFHooo,10,2,3,13]").append(System.lineSeparator());
        expected.append("[67,9,G+3,GBBBKMGCCIKMoAAILooDDJLoooHJEEFFHooo,13,3,3,16]").append(System.lineSeparator());
        expected.append("[181,67,D-1,GBBBKMGCCIKMoAAILoDDoJLoooHJEEFFHooo,18,4,3,21]").append(System.lineSeparator());
        expected.append("[520,181,H+1,GBBBKMGCCIKMoAAILoDDHJLoooHJEEFFoooo,23,5,3,26]").append(System.lineSeparator());
        expected.append("[1155,520,F+4,GBBBKMGCCIKMoAAILoDDHJLoooHJEEooooFF,25,6,3,28]").append(System.lineSeparator());
        expected.append("[1877,1155,H-1,GBBBKMGCCIKMoAAILoDDoJLoooHJEEooHoFF,30,7,3,33]").append(System.lineSeparator());
        expected.append("[2935,1877,D+1,GBBBKMGCCIKMoAAILooDDJLoooHJEEooHoFF,35,8,3,38]").append(System.lineSeparator());
        expected.append("[4043,2935,G-4,oBBBKMoCCIKMoAAILooDDJLoGoHJEEGoHoFF,37,9,3,40]").append(System.lineSeparator());
        expected.append("[4546,4043,D-1,oBBBKMoCCIKMoAAILoDDoJLoGoHJEEGoHoFF,42,10,3,45]").append(System.lineSeparator());
        expected.append("[5752,4546,A-1,oBBBKMoCCIKMAAoILoDDoJLoGoHJEEGoHoFF,47,11,4,51]").append(System.lineSeparator());
        expected.append("[7374,5752,H+2,oBBBKMoCCIKMAAHILoDDHJLoGooJEEGoooFF,51,12,4,55]").append(System.lineSeparator());
        expected.append("[9398,7374,F-3,oBBBKMoCCIKMAAHILoDDHJLoGooJEEGFFooo,54,13,4,58]").append(System.lineSeparator());
        expected.append("[10999,9398,B-1,BBBoKMoCCIKMAAHILoDDHJLoGooJEEGFFooo,59,14,4,63]").append(System.lineSeparator());
        expected.append("[14133,10999,I+1,BBBIKMoCCIKMAAHoLoDDHJLoGooJEEGFFooo,64,15,4,68]").append(System.lineSeparator());
        expected.append("[17345,14133,J+1,BBBIKMoCCIKMAAHJLoDDHJLoGoooEEGFFooo,69,16,4,73]").append(System.lineSeparator());
        expected.append("[20147,17345,E-3,BBBIKMoCCIKMAAHJLoDDHJLoGEEoooGFFooo,72,17,4,76]").append(System.lineSeparator());
        expected.append("[21784,20147,M-4,BBBIKooCCIKoAAHJLoDDHJLoGEEooMGFFooM,74,18,4,78]").append(System.lineSeparator());
        expected.append("[23001,21784,J-2,BBBIKooCCIKoAAHoLoDDHoLoGEEJoMGFFJoM,78,19,4,82]").append(System.lineSeparator());
        expected.append("[25461,23001,I-2,BBBoKooCCoKoAAHILoDDHILoGEEJoMGFFJoM,82,20,4,86]").append(System.lineSeparator());
        expected.append("[28893,25461,L-2,BBBoKooCCoKoAAHIooDDHIooGEEJLMGFFJLM,86,21,4,90]").append(System.lineSeparator());
        expected.append("[33785,28893,K-2,BBBooooCCoooAAHIKoDDHIKoGEEJLMGFFJLM,90,22,4,94]").append(System.lineSeparator());
        expected.append("[40668,33785,B+3,oooBBBoCCoooAAHIKoDDHIKoGEEJLMGFFJLM,93,23,4,97]").append(System.lineSeparator());
        expected.append("[47058,40668,C+3,oooBBBooooCCAAHIKoDDHIKoGEEJLMGFFJLM,96,24,4,100]").append(System.lineSeparator());
        expected.append("[54481,47058,H+2,ooHBBBooHoCCAAoIKoDDoIKoGEEJLMGFFJLM,100,25,4,104]").append(System.lineSeparator());
        expected.append("[65643,54481,A+1,ooHBBBooHoCCoAAIKoDDoIKoGEEJLMGFFJLM,105,26,3,108]").append(System.lineSeparator());
        expected.append("[77104,65643,D+1,ooHBBBooHoCCoAAIKooDDIKoGEEJLMGFFJLM,110,27,3,113]").append(System.lineSeparator());
        expected.append("[88572,77104,G+4,GoHBBBGoHoCCoAAIKooDDIKooEEJLMoFFJLM,112,28,3,115]").append(System.lineSeparator());
        expected.append("[93806,88572,D-1,GoHBBBGoHoCCoAAIKoDDoIKooEEJLMoFFJLM,117,29,3,120]").append(System.lineSeparator());
        expected.append("[101954,93806,E-1,GoHBBBGoHoCCoAAIKoDDoIKoEEoJLMoFFJLM,122,30,3,125]").append(System.lineSeparator());
        expected.append("[107706,101954,A-1,GoHBBBGoHoCCAAoIKoDDoIKoEEoJLMoFFJLM,127,31,4,131]").append(System.lineSeparator());
        expected.append("[112002,107706,H-3,GooBBBGoooCCAAoIKoDDHIKoEEHJLMoFFJLM,130,32,4,134]").append(System.lineSeparator());
        expected.append("[114098,112002,C-3,GooBBBGCCoooAAoIKoDDHIKoEEHJLMoFFJLM,133,33,4,137]").append(System.lineSeparator());
        expected.append("[115630,114098,A+1,GooBBBGCCooooAAIKoDDHIKoEEHJLMoFFJLM,138,34,3,141]").append(System.lineSeparator());
        expected.append("[118403,115630,G-1,oooBBBGCCoooGAAIKoDDHIKoEEHJLMoFFJLM,143,35,3,146]").append(System.lineSeparator());
        expected.append("[123718,118403,B-3,BBBoooGCCoooGAAIKoDDHIKoEEHJLMoFFJLM,146,36,3,149]").append(System.lineSeparator());
        expected.append("[129370,123718,I+2,BBBIooGCCIooGAAoKoDDHoKoEEHJLMoFFJLM,150,37,3,153]").append(System.lineSeparator());
        expected.append("[137965,129370,K+2,BBBIKoGCCIKoGAAoooDDHoooEEHJLMoFFJLM,154,38,3,157]").append(System.lineSeparator());
        expected.append("[149106,137965,A+3,BBBIKoGCCIKoGoooAADDHoooEEHJLMoFFJLM,157,39,0,157]").append(System.lineSeparator());
        expected.append("TN: 149344").append(System.lineSeparator());
        expected.append("EN: 13930").append(System.lineSeparator());
        expected.append("CN: 122664").append(System.lineSeparator());
        expected.append("DF: 39");
        return expected.toString();
    }

    private String getExpectedGBF3() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo,0,0,2,2]").append(System.lineSeparator());
        expected.append("[2,0,B-1,BBBoKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo,5,1,2,2]").append(System.lineSeparator());
        expected.append("[17,2,I+1,BBBIKMCCoIKMAAooLoGDDJLoGoHJEEFFHooo,10,2,1,1]").append(System.lineSeparator());
        expected.append("[21,17,A+1,BBBIKMCCoIKMoAAoLoGDDJLoGoHJEEFFHooo,15,3,1,1]").append(System.lineSeparator());
        expected.append("[31,21,C+1,BBBIKMoCCIKMoAAoLoGDDJLoGoHJEEFFHooo,20,4,1,1]").append(System.lineSeparator());
        expected.append("[67,31,G+2,BBBIKMGCCIKMGAAoLooDDJLoooHJEEFFHooo,24,5,1,1]").append(System.lineSeparator());
        expected.append("[141,67,D-1,BBBIKMGCCIKMGAAoLoDDoJLoooHJEEFFHooo,29,6,1,1]").append(System.lineSeparator());
        expected.append("[236,141,H+1,BBBIKMGCCIKMGAAoLoDDHJLoooHJEEFFoooo,34,7,1,1]").append(System.lineSeparator());
        expected.append("[316,236,F+3,BBBIKMGCCIKMGAAoLoDDHJLoooHJEEoooFFo,37,8,1,1]").append(System.lineSeparator());
        expected.append("[396,316,H-1,BBBIKMGCCIKMGAAoLoDDoJLoooHJEEooHFFo,42,9,1,1]").append(System.lineSeparator());
        expected.append("[468,396,D+1,BBBIKMGCCIKMGAAoLooDDJLoooHJEEooHFFo,47,10,1,1]").append(System.lineSeparator());
        expected.append("[520,468,G-3,BBBIKMoCCIKMoAAoLooDDJLoGoHJEEGoHFFo,50,11,1,1]").append(System.lineSeparator());
        expected.append("[592,520,A-1,BBBIKMoCCIKMAAooLooDDJLoGoHJEEGoHFFo,55,12,1,1]").append(System.lineSeparator());
        expected.append("[765,592,D-1,BBBIKMoCCIKMAAooLoDDoJLoGoHJEEGoHFFo,60,13,1,1]").append(System.lineSeparator());
        expected.append("[1077,765,H+2,BBBIKMoCCIKMAAHoLoDDHJLoGooJEEGooFFo,64,14,2,2]").append(System.lineSeparator());
        expected.append("[5003,1077,J+1,BBBIKMoCCIKMAAHJLoDDHJLoGoooEEGooFFo,69,15,3,3]").append(System.lineSeparator());
        expected.append("[13538,5003,E-2,BBBIKMoCCIKMAAHJLoDDHJLoGoEEooGooFFo,73,16,3,3]").append(System.lineSeparator());
        expected.append("[22926,13538,L-1,BBBIKMoCCIKMAAHJooDDHJLoGoEELoGooFFo,78,17,2,2]").append(System.lineSeparator());
        expected.append("[22932,22926,E-1,BBBIKMoCCIKMAAHJooDDHJLoGEEoLoGooFFo,83,18,2,2]").append(System.lineSeparator());
        expected.append("[22959,22932,J-1,BBBIKMoCCIKMAAHoooDDHJLoGEEJLoGooFFo,88,19,1,1]").append(System.lineSeparator());
        expected.append("[22969,22959,F-2,BBBIKMoCCIKMAAHoooDDHJLoGEEJLoGFFooo,92,20,1,1]").append(System.lineSeparator());
        expected.append("[23022,22969,J-1,BBBIKMoCCIKMAAHoooDDHoLoGEEJLoGFFJoo,97,21,1,1]").append(System.lineSeparator());
        expected.append("[23199,23022,L-1,BBBIKMoCCIKMAAHoooDDHoooGEEJLoGFFJLo,102,22,1,1]").append(System.lineSeparator());
        expected.append("[23489,23199,M-3,BBBIKooCCIKoAAHoooDDHooMGEEJLMGFFJLo,105,23,1,1]").append(System.lineSeparator());
        expected.append("[23850,23489,I-2,BBBoKooCCoKoAAHIooDDHIoMGEEJLMGFFJLo,109,24,2,2]").append(System.lineSeparator());
        expected.append("[30066,23850,K-2,BBBooooCCoooAAHIKoDDHIKMGEEJLMGFFJLo,113,25,3,3]").append(System.lineSeparator());
        expected.append("[49586,30066,B+3,oooBBBoCCoooAAHIKoDDHIKMGEEJLMGFFJLo,116,26,3,3]").append(System.lineSeparator());
        expected.append("[74768,49586,C+2,oooBBBoooCCoAAHIKoDDHIKMGEEJLMGFFJLo,120,27,3,3]").append(System.lineSeparator());
        expected.append("[84260,74768,H+2,ooHBBBooHCCoAAoIKoDDoIKMGEEJLMGFFJLo,124,28,2,2]").append(System.lineSeparator());
        expected.append("[84264,84260,A+1,ooHBBBooHCCooAAIKoDDoIKMGEEJLMGFFJLo,129,29,2,2]").append(System.lineSeparator());
        expected.append("[84274,84264,D+1,ooHBBBooHCCooAAIKooDDIKMGEEJLMGFFJLo,134,30,2,2]").append(System.lineSeparator());
        expected.append("[84314,84274,G+4,GoHBBBGoHCCooAAIKooDDIKMoEEJLMoFFJLo,136,31,2,2]").append(System.lineSeparator());
        expected.append("[84419,84314,A-1,GoHBBBGoHCCoAAoIKooDDIKMoEEJLMoFFJLo,141,32,2,2]").append(System.lineSeparator());
        expected.append("[84677,84419,D-1,GoHBBBGoHCCoAAoIKoDDoIKMoEEJLMoFFJLo,146,33,2,2]").append(System.lineSeparator());
        expected.append("[85154,84677,E-1,GoHBBBGoHCCoAAoIKoDDoIKMEEoJLMoFFJLo,151,34,2,2]").append(System.lineSeparator());
        expected.append("[85864,85154,H-3,GooBBBGooCCoAAoIKoDDHIKMEEHJLMoFFJLo,154,35,2,2]").append(System.lineSeparator());
        expected.append("[86644,85864,B-2,GBBBooGooCCoAAoIKoDDHIKMEEHJLMoFFJLo,158,36,2,2]").append(System.lineSeparator());
        expected.append("[87314,86644,C-1,GBBBooGoCCooAAoIKoDDHIKMEEHJLMoFFJLo,163,37,2,2]").append(System.lineSeparator());
        expected.append("[88051,87314,K+2,GBBBKoGoCCKoAAoIooDDHIoMEEHJLMoFFJLo,167,38,1,1]").append(System.lineSeparator());
        expected.append("[88056,88051,A+1,GBBBKoGoCCKooAAIooDDHIoMEEHJLMoFFJLo,172,39,1,1]").append(System.lineSeparator());
        expected.append("[88069,88056,C-1,GBBBKoGCCoKooAAIooDDHIoMEEHJLMoFFJLo,177,40,1,1]").append(System.lineSeparator());
        expected.append("[88144,88069,G-1,oBBBKoGCCoKoGAAIooDDHIoMEEHJLMoFFJLo,182,41,1,1]").append(System.lineSeparator());
        expected.append("[88366,88144,B-1,BBBoKoGCCoKoGAAIooDDHIoMEEHJLMoFFJLo,187,42,1,1]").append(System.lineSeparator());
        expected.append("[88866,88366,I+2,BBBIKoGCCIKoGAAoooDDHooMEEHJLMoFFJLo,191,43,0,0]").append(System.lineSeparator());
        expected.append("[88877,88866,A+3,BBBIKoGCCIKoGoooAADDHooMEEHJLMoFFJLo,194,44,0,0]").append(System.lineSeparator());
        expected.append("TN: 88915").append(System.lineSeparator());
        expected.append("EN: 8525").append(System.lineSeparator());
        expected.append("CN: 64501").append(System.lineSeparator());
        expected.append("DF: 45");
        return expected.toString();
    }

    private String getExpectedAStar4() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,EBBBIKEoFGIKAAFGJKoCCHJooooHDDoooooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,C-1,EBBBIKEoFGIKAAFGJKCCoHJooooHDDoooooo,5,1,4,9]").append(System.lineSeparator());
        expected.append("[7,1,F-3,EBBBIKEooGIKAAoGJKCCoHJoooFHDDooFooo,8,2,4,12]").append(System.lineSeparator());
        expected.append("[18,7,A+1,EBBBIKEooGIKoAAGJKCCoHJoooFHDDooFooo,13,3,3,16]").append(System.lineSeparator());
        expected.append("[62,18,C+1,EBBBIKEooGIKoAAGJKoCCHJoooFHDDooFooo,18,4,3,21]").append(System.lineSeparator());
        expected.append("[141,62,E-4,oBBBIKoooGIKoAAGJKoCCHJoEoFHDDEoFooo,20,5,3,23]").append(System.lineSeparator());
        expected.append("[225,141,C-1,oBBBIKoooGIKoAAGJKCCoHJoEoFHDDEoFooo,25,6,3,28]").append(System.lineSeparator());
        expected.append("[404,225,A-1,oBBBIKoooGIKAAoGJKCCoHJoEoFHDDEoFooo,30,7,4,34]").append(System.lineSeparator());
        expected.append("[776,404,F+3,oBBBIKooFGIKAAFGJKCCoHJoEooHDDEooooo,33,8,4,37]").append(System.lineSeparator());
        expected.append("[1134,776,B-1,BBBoIKooFGIKAAFGJKCCoHJoEooHDDEooooo,38,9,4,42]").append(System.lineSeparator());
        expected.append("[1790,1134,G+1,BBBGIKooFGIKAAFoJKCCoHJoEooHDDEooooo,43,10,4,47]").append(System.lineSeparator());
        expected.append("[2479,1790,H+1,BBBGIKooFGIKAAFHJKCCoHJoEoooDDEooooo,48,11,4,52]").append(System.lineSeparator());
        expected.append("[2993,2479,D-3,BBBGIKooFGIKAAFHJKCCoHJoEDDoooEooooo,51,12,4,55]").append(System.lineSeparator());
        expected.append("[3215,2993,K-3,BBBGIoooFGIoAAFHJoCCoHJKEDDooKEooooK,54,13,4,58]").append(System.lineSeparator());
        expected.append("[3378,3215,H-2,BBBGIoooFGIoAAFoJoCCooJKEDDHoKEooHoK,58,14,4,62]").append(System.lineSeparator());
        expected.append("[3797,3378,J-2,BBBGIoooFGIoAAFoooCCoooKEDDHJKEooHJK,62,15,4,66]").append(System.lineSeparator());
        expected.append("[4640,3797,C+3,BBBGIoooFGIoAAFooooooCCKEDDHJKEooHJK,65,16,4,69]").append(System.lineSeparator());
        expected.append("[5837,4640,G-1,BBBoIoooFGIoAAFGoooooCCKEDDHJKEooHJK,70,17,4,74]").append(System.lineSeparator());
        expected.append("[8517,5837,I-1,BBBoooooFGIoAAFGIooooCCKEDDHJKEooHJK,75,18,4,79]").append(System.lineSeparator());
        expected.append("[12063,8517,B+3,oooBBBooFGIoAAFGIooooCCKEDDHJKEooHJK,78,19,4,82]").append(System.lineSeparator());
        expected.append("[15008,12063,F+1,ooFBBBooFGIoAAoGIooooCCKEDDHJKEooHJK,83,20,4,87]").append(System.lineSeparator());
        expected.append("[18606,15008,A+1,ooFBBBooFGIooAAGIooooCCKEDDHJKEooHJK,88,21,3,91]").append(System.lineSeparator());
        expected.append("[20652,18606,E+4,EoFBBBEoFGIooAAGIooooCCKoDDHJKoooHJK,90,22,3,93]").append(System.lineSeparator());
        expected.append("[21308,20652,D-1,EoFBBBEoFGIooAAGIooooCCKDDoHJKoooHJK,95,23,3,98]").append(System.lineSeparator());
        expected.append("[23025,21308,A-1,EoFBBBEoFGIoAAoGIooooCCKDDoHJKoooHJK,100,24,4,104]").append(System.lineSeparator());
        expected.append("[25361,23025,F-4,EooBBBEooGIoAAoGIooooCCKDDFHJKooFHJK,102,25,4,106]").append(System.lineSeparator());
        expected.append("[26256,25361,A+1,EooBBBEooGIooAAGIooooCCKDDFHJKooFHJK,107,26,3,110]").append(System.lineSeparator());
        expected.append("[27848,26256,E-2,oooBBBoooGIoEAAGIoEooCCKDDFHJKooFHJK,111,27,3,114]").append(System.lineSeparator());
        expected.append("[30951,27848,B-3,BBBooooooGIoEAAGIoEooCCKDDFHJKooFHJK,114,28,3,117]").append(System.lineSeparator());
        expected.append("[35265,30951,G+1,BBBGoooooGIoEAAoIoEooCCKDDFHJKooFHJK,119,29,3,122]").append(System.lineSeparator());
        expected.append("[43051,35265,I+1,BBBGIooooGIoEAAoooEooCCKDDFHJKooFHJK,124,30,3,127]").append(System.lineSeparator());
        expected.append("[51065,43051,A+3,BBBGIooooGIoEoooAAEooCCKDDFHJKooFHJK,127,31,0,127]").append(System.lineSeparator());
        expected.append("TN: 52227").append(System.lineSeparator());
        expected.append("EN: 5080").append(System.lineSeparator());
        expected.append("CN: 39099").append(System.lineSeparator());
        expected.append("DF: 31");
        return expected.toString();
    }

    private String getExpectedGBF4() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,EBBBIKEoFGIKAAFGJKoCCHJooooHDDoooooo,0,0,8,8]").append(System.lineSeparator());
        expected.append("[1,0,C-1,EBBBIKEoFGIKAAFGJKCCoHJooooHDDoooooo,5,1,8,8]").append(System.lineSeparator());
        expected.append("[6,1,F-2,EBBBIKEooGIKAAoGJKCCFHJoooFHDDoooooo,9,2,7,7]").append(System.lineSeparator());
        expected.append("[10,6,A+1,EBBBIKEooGIKoAAGJKCCFHJoooFHDDoooooo,14,3,6,6]").append(System.lineSeparator());
        expected.append("[17,10,E-1,oBBBIKEooGIKEAAGJKCCFHJoooFHDDoooooo,19,4,6,6]").append(System.lineSeparator());
        expected.append("[21,17,B-1,BBBoIKEooGIKEAAGJKCCFHJoooFHDDoooooo,24,5,6,6]").append(System.lineSeparator());
        expected.append("[45,21,G+1,BBBGIKEooGIKEAAoJKCCFHJoooFHDDoooooo,29,6,5,5]").append(System.lineSeparator());
        expected.append("[51,45,H+1,BBBGIKEooGIKEAAHJKCCFHJoooFoDDoooooo,34,7,6,6]").append(System.lineSeparator());
        expected.append("[723,51,D-1,BBBGIKEooGIKEAAHJKCCFHJoooFDDooooooo,39,8,6,6]").append(System.lineSeparator());
        expected.append("[1523,723,K-3,BBBGIoEooGIoEAAHJoCCFHJKooFDDKoooooK,42,9,5,5]").append(System.lineSeparator());
        expected.append("[1524,1523,F-1,BBBGIoEooGIoEAAHJoCCoHJKooFDDKooFooK,47,10,5,5]").append(System.lineSeparator());
        expected.append("[1528,1524,C+1,BBBGIoEooGIoEAAHJooCCHJKooFDDKooFooK,52,11,5,5]").append(System.lineSeparator());
        expected.append("[1536,1528,E-3,BBBGIooooGIooAAHJooCCHJKEoFDDKEoFooK,55,12,5,5]").append(System.lineSeparator());
        expected.append("[1554,1536,C-1,BBBGIooooGIooAAHJoCCoHJKEoFDDKEoFooK,60,13,5,5]").append(System.lineSeparator());
        expected.append("[1561,1554,A-1,BBBGIooooGIoAAoHJoCCoHJKEoFDDKEoFooK,65,14,6,6]").append(System.lineSeparator());
        expected.append("[2099,1561,F+2,BBBGIooooGIoAAFHJoCCFHJKEooDDKEooooK,69,15,7,7]").append(System.lineSeparator());
        expected.append("[2849,2099,D-1,BBBGIooooGIoAAFHJoCCFHJKEoDDoKEooooK,74,16,7,7]").append(System.lineSeparator());
        expected.append("[2926,2849,J-1,BBBGIooooGIoAAFHooCCFHJKEoDDJKEooooK,79,17,6,6]").append(System.lineSeparator());
        expected.append("[2931,2926,D-1,BBBGIooooGIoAAFHooCCFHJKEDDoJKEooooK,84,18,6,6]").append(System.lineSeparator());
        expected.append("[2950,2931,H-1,BBBGIooooGIoAAFoooCCFHJKEDDHJKEooooK,89,19,5,5]").append(System.lineSeparator());
        expected.append("[2959,2950,G-1,BBBoIooooGIoAAFGooCCFHJKEDDHJKEooooK,94,20,6,6]").append(System.lineSeparator());
        expected.append("[3271,2959,I-1,BBBooooooGIoAAFGIoCCFHJKEDDHJKEooooK,99,21,7,7]").append(System.lineSeparator());
        expected.append("[5737,3271,B+3,oooBBBoooGIoAAFGIoCCFHJKEDDHJKEooooK,102,22,7,7]").append(System.lineSeparator());
        expected.append("[11180,5737,F+2,ooFBBBooFGIoAAoGIoCCoHJKEDDHJKEooooK,106,23,6,6]").append(System.lineSeparator());
        expected.append("[11185,11180,A+1,ooFBBBooFGIooAAGIoCCoHJKEDDHJKEooooK,111,24,5,5]").append(System.lineSeparator());
        expected.append("[11194,11185,C+1,ooFBBBooFGIooAAGIooCCHJKEDDHJKEooooK,116,25,5,5]").append(System.lineSeparator());
        expected.append("[11204,11194,E+4,EoFBBBEoFGIooAAGIooCCHJKoDDHJKoooooK,118,26,5,5]").append(System.lineSeparator());
        expected.append("[11253,11204,C-1,EoFBBBEoFGIooAAGIoCCoHJKoDDHJKoooooK,123,27,5,5]").append(System.lineSeparator());
        expected.append("[11407,11253,D-1,EoFBBBEoFGIooAAGIoCCoHJKDDoHJKoooooK,128,28,5,5]").append(System.lineSeparator());
        expected.append("[11713,11407,A-1,EoFBBBEoFGIoAAoGIoCCoHJKDDoHJKoooooK,133,29,6,6]").append(System.lineSeparator());
        expected.append("[13913,11713,F-3,EooBBBEooGIoAAoGIoCCFHJKDDFHJKoooooK,136,30,6,6]").append(System.lineSeparator());
        expected.append("[16181,13913,A+1,EooBBBEooGIooAAGIoCCFHJKDDFHJKoooooK,141,31,5,5]").append(System.lineSeparator());
        expected.append("[16194,16181,B-2,EBBBooEooGIooAAGIoCCFHJKDDFHJKoooooK,145,32,5,5]").append(System.lineSeparator());
        expected.append("[16217,16194,I+1,EBBBIoEooGIooAAGooCCFHJKDDFHJKoooooK,150,33,4,4]").append(System.lineSeparator());
        expected.append("[16223,16217,E-1,oBBBIoEooGIoEAAGooCCFHJKDDFHJKoooooK,155,34,4,4]").append(System.lineSeparator());
        expected.append("[16232,16223,B-1,BBBoIoEooGIoEAAGooCCFHJKDDFHJKoooooK,160,35,4,4]").append(System.lineSeparator());
        expected.append("[16277,16232,G+1,BBBGIoEooGIoEAAoooCCFHJKDDFHJKoooooK,165,36,3,3]").append(System.lineSeparator());
        expected.append("[16287,16277,A+3,BBBGIoEooGIoEoooAACCFHJKDDFHJKoooooK,168,37,0,0]").append(System.lineSeparator());
        expected.append("TN: 16298").append(System.lineSeparator());
        expected.append("EN: 1721").append(System.lineSeparator());
        expected.append("CN: 7506").append(System.lineSeparator());
        expected.append("DF: 37");
        return expected.toString();
    }

    private String getExpectedAStar5() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBKooHJoKCCHJAALoHDDoLMIEEoLMIFFGGM,0,0,2,2]").append(System.lineSeparator());
        expected.append("[1,0,D+1,BBBKooHJoKCCHJAALoHoDDLMIEEoLMIFFGGM,5,1,2,7]").append(System.lineSeparator());
        expected.append("[5,1,E+1,BBBKooHJoKCCHJAALoHoDDLMIoEELMIFFGGM,10,2,2,12]").append(System.lineSeparator());
        expected.append("[19,5,M+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIFFGGo,15,3,2,17]").append(System.lineSeparator());
        expected.append("[46,19,G+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIFFoGG,20,4,2,22]").append(System.lineSeparator());
        expected.append("[81,46,F+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIoFFGG,25,5,2,27]").append(System.lineSeparator());
        expected.append("[120,81,J-3,BBBKooHooKCCHoAALMHoDDLMIJEELMIJFFGG,28,6,2,30]").append(System.lineSeparator());
        expected.append("[130,120,D-1,BBBKooHooKCCHoAALMHDDoLMIJEELMIJFFGG,33,7,2,35]").append(System.lineSeparator());
        expected.append("[175,130,A-1,BBBKooHooKCCHAAoLMHDDoLMIJEELMIJFFGG,38,8,3,41]").append(System.lineSeparator());
        expected.append("[233,175,K-2,BBBoooHoooCCHAAKLMHDDKLMIJEELMIJFFGG,42,9,3,45]").append(System.lineSeparator());
        expected.append("[314,233,C-3,BBBoooHCCoooHAAKLMHDDKLMIJEELMIJFFGG,45,10,3,48]").append(System.lineSeparator());
        expected.append("[396,314,K+2,BBBKooHCCKooHAAoLMHDDoLMIJEELMIJFFGG,49,11,3,52]").append(System.lineSeparator());
        expected.append("[578,396,L+2,BBBKLoHCCKLoHAAoLMHDDooMIJEEoMIJFFGG,53,12,3,56]").append(System.lineSeparator());
        expected.append("[920,578,M+2,BBBKLMHCCKLMHAAoLMHDDoooIJEEooIJFFGG,57,13,3,60]").append(System.lineSeparator());
        expected.append("[1500,920,D+3,BBBKLMHCCKLMHAAoLMHoooDDIJEEooIJFFGG,60,14,3,63]").append(System.lineSeparator());
        expected.append("[2508,1500,E+2,BBBKLMHCCKLMHAAoLMHoooDDIJooEEIJFFGG,64,15,3,67]").append(System.lineSeparator());
        expected.append("[4003,2508,K-3,BBBoLMHCCoLMHAAoLMHooKDDIJoKEEIJFFGG,67,16,3,70]").append(System.lineSeparator());
        expected.append("[5082,4003,A+1,BBBoLMHCCoLMHoAALMHooKDDIJoKEEIJFFGG,72,17,2,74]").append(System.lineSeparator());
        expected.append("[7490,5082,C+1,BBBoLMHoCCLMHoAALMHooKDDIJoKEEIJFFGG,77,18,2,79]").append(System.lineSeparator());
        expected.append("[10711,7490,J+3,BBBoLMHJCCLMHJAALMHooKDDIooKEEIoFFGG,80,19,2,82]").append(System.lineSeparator());
        expected.append("[13030,10711,F-1,BBBoLMHJCCLMHJAALMHooKDDIooKEEIFFoGG,85,20,2,87]").append(System.lineSeparator());
        expected.append("[15822,13030,K-1,BBBoLMHJCCLMHJAALMHoooDDIooKEEIFFKGG,90,21,2,92]").append(System.lineSeparator());
        expected.append("[18007,15822,D-3,BBBoLMHJCCLMHJAALMHDDoooIooKEEIFFKGG,93,22,2,95]").append(System.lineSeparator());
        expected.append("[19061,18007,L-1,BBBooMHJCCLMHJAALMHDDoLoIooKEEIFFKGG,98,23,2,100]").append(System.lineSeparator());
        expected.append("[20727,19061,B+2,ooBBBMHJCCLMHJAALMHDDoLoIooKEEIFFKGG,102,24,2,104]").append(System.lineSeparator());
        expected.append("[21637,20727,J+1,oJBBBMHJCCLMHoAALMHDDoLoIooKEEIFFKGG,107,25,2,109]").append(System.lineSeparator());
        expected.append("[22318,21637,A-1,oJBBBMHJCCLMHAAoLMHDDoLoIooKEEIFFKGG,112,26,3,115]").append(System.lineSeparator());
        expected.append("[23090,22318,K+2,oJBBBMHJCCLMHAAKLMHDDKLoIoooEEIFFoGG,116,27,3,119]").append(System.lineSeparator());
        expected.append("[23756,23090,E-3,oJBBBMHJCCLMHAAKLMHDDKLoIEEoooIFFoGG,119,28,3,122]").append(System.lineSeparator());
        expected.append("[23989,23756,H+1,HJBBBMHJCCLMHAAKLMoDDKLoIEEoooIFFoGG,124,29,3,127]").append(System.lineSeparator());
        expected.append("[24575,23989,I+1,HJBBBMHJCCLMHAAKLMIDDKLoIEEooooFFoGG,129,30,3,132]").append(System.lineSeparator());
        expected.append("[25548,24575,F-1,HJBBBMHJCCLMHAAKLMIDDKLoIEEoooFFooGG,134,31,3,137]").append(System.lineSeparator());
        expected.append("[27417,25548,G-2,HJBBBMHJCCLMHAAKLMIDDKLoIEEoooFFGGoo,138,32,3,141]").append(System.lineSeparator());
        expected.append("[30233,27417,M-3,HJBBBoHJCCLoHAAKLoIDDKLMIEEooMFFGGoM,141,33,3,144]").append(System.lineSeparator());
        expected.append("[32117,30233,L-2,HJBBBoHJCCooHAAKooIDDKLMIEEoLMFFGGLM,145,34,3,148]").append(System.lineSeparator());
        expected.append("[36043,32117,K-1,HJBBBoHJCCooHAAoooIDDKLMIEEKLMFFGGLM,150,35,3,153]").append(System.lineSeparator());
        expected.append("[41578,36043,A+3,HJBBBoHJCCooHoooAAIDDKLMIEEKLMFFGGLM,153,36,0,153]").append(System.lineSeparator());
        expected.append("TN: 41656").append(System.lineSeparator());
        expected.append("EN: 4798").append(System.lineSeparator());
        expected.append("CN: 31493").append(System.lineSeparator());
        expected.append("DF: 36");
        return expected.toString();
    }

    private String getExpectedGBF5() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBKooHJoKCCHJAALoHDDoLMIEEoLMIFFGGM,0,0,2,2]").append(System.lineSeparator());
        expected.append("[1,0,D+1,BBBKooHJoKCCHJAALoHoDDLMIEEoLMIFFGGM,5,1,2,2]").append(System.lineSeparator());
        expected.append("[5,1,E+1,BBBKooHJoKCCHJAALoHoDDLMIoEELMIFFGGM,10,2,2,2]").append(System.lineSeparator());
        expected.append("[19,5,M+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIFFGGo,15,3,2,2]").append(System.lineSeparator());
        expected.append("[46,19,G+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIFFoGG,20,4,2,2]").append(System.lineSeparator());
        expected.append("[78,46,F+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIoFFGG,25,5,2,2]").append(System.lineSeparator());
        expected.append("[108,78,J-3,BBBKooHooKCCHoAALMHoDDLMIJEELMIJFFGG,28,6,2,2]").append(System.lineSeparator());
        expected.append("[123,108,D-1,BBBKooHooKCCHoAALMHDDoLMIJEELMIJFFGG,33,7,2,2]").append(System.lineSeparator());
        expected.append("[127,123,A-1,BBBKooHooKCCHAAoLMHDDoLMIJEELMIJFFGG,38,8,3,3]").append(System.lineSeparator());
        expected.append("[151,127,K-2,BBBoooHoooCCHAAKLMHDDKLMIJEELMIJFFGG,42,9,3,3]").append(System.lineSeparator());
        expected.append("[192,151,C-3,BBBoooHCCoooHAAKLMHDDKLMIJEELMIJFFGG,45,10,3,3]").append(System.lineSeparator());
        expected.append("[349,192,K+2,BBBKooHCCKooHAAoLMHDDoLMIJEELMIJFFGG,49,11,3,3]").append(System.lineSeparator());
        expected.append("[637,349,A+1,BBBKooHCCKooHoAALMHDDoLMIJEELMIJFFGG,54,12,2,2]").append(System.lineSeparator());
        expected.append("[648,637,L+2,BBBKLoHCCKLoHoAALMHDDooMIJEEoMIJFFGG,58,13,2,2]").append(System.lineSeparator());
        expected.append("[673,648,M+2,BBBKLMHCCKLMHoAALMHDDoooIJEEooIJFFGG,62,14,2,2]").append(System.lineSeparator());
        expected.append("[786,673,D+3,BBBKLMHCCKLMHoAALMHoooDDIJEEooIJFFGG,65,15,2,2]").append(System.lineSeparator());
        expected.append("[1043,786,E+2,BBBKLMHCCKLMHoAALMHoooDDIJooEEIJFFGG,69,16,2,2]").append(System.lineSeparator());
        expected.append("[1488,1043,A-1,BBBKLMHCCKLMHAAoLMHoooDDIJooEEIJFFGG,74,17,3,3]").append(System.lineSeparator());
        expected.append("[4383,1488,K-3,BBBoLMHCCoLMHAAoLMHooKDDIJoKEEIJFFGG,77,18,3,3]").append(System.lineSeparator());
        expected.append("[7155,4383,A+1,BBBoLMHCCoLMHoAALMHooKDDIJoKEEIJFFGG,82,19,2,2]").append(System.lineSeparator());
        expected.append("[7164,7155,C+1,BBBoLMHoCCLMHoAALMHooKDDIJoKEEIJFFGG,87,20,2,2]").append(System.lineSeparator());
        expected.append("[7178,7164,J+3,BBBoLMHJCCLMHJAALMHooKDDIooKEEIoFFGG,90,21,2,2]").append(System.lineSeparator());
        expected.append("[7230,7178,F-1,BBBoLMHJCCLMHJAALMHooKDDIooKEEIFFoGG,95,22,2,2]").append(System.lineSeparator());
        expected.append("[7328,7230,K-1,BBBoLMHJCCLMHJAALMHoooDDIooKEEIFFKGG,100,23,2,2]").append(System.lineSeparator());
        expected.append("[7489,7328,D-3,BBBoLMHJCCLMHJAALMHDDoooIooKEEIFFKGG,103,24,2,2]").append(System.lineSeparator());
        expected.append("[7749,7489,L-1,BBBooMHJCCLMHJAALMHDDoLoIooKEEIFFKGG,108,25,2,2]").append(System.lineSeparator());
        expected.append("[8145,7749,B+2,ooBBBMHJCCLMHJAALMHDDoLoIooKEEIFFKGG,112,26,2,2]").append(System.lineSeparator());
        expected.append("[8641,8145,J+1,oJBBBMHJCCLMHoAALMHDDoLoIooKEEIFFKGG,117,27,2,2]").append(System.lineSeparator());
        expected.append("[9210,8641,A-1,oJBBBMHJCCLMHAAoLMHDDoLoIooKEEIFFKGG,122,28,3,3]").append(System.lineSeparator());
        expected.append("[15220,9210,K+2,oJBBBMHJCCLMHAAKLMHDDKLoIoooEEIFFoGG,126,29,3,3]").append(System.lineSeparator());
        expected.append("[19729,15220,E-3,oJBBBMHJCCLMHAAKLMHDDKLoIEEoooIFFoGG,129,30,3,3]").append(System.lineSeparator());
        expected.append("[23037,19729,K-1,oJBBBMHJCCLMHAAoLMHDDKLoIEEKooIFFoGG,134,31,3,3]").append(System.lineSeparator());
        expected.append("[25763,23037,A+1,oJBBBMHJCCLMHoAALMHDDKLoIEEKooIFFoGG,139,32,2,2]").append(System.lineSeparator());
        expected.append("[25775,25763,H+1,HJBBBMHJCCLMHoAALMoDDKLoIEEKooIFFoGG,144,33,2,2]").append(System.lineSeparator());
        expected.append("[25801,25775,I+1,HJBBBMHJCCLMHoAALMIDDKLoIEEKoooFFoGG,149,34,2,2]").append(System.lineSeparator());
        expected.append("[25961,25801,F-1,HJBBBMHJCCLMHoAALMIDDKLoIEEKooFFooGG,154,35,2,2]").append(System.lineSeparator());
        expected.append("[26547,25961,G-2,HJBBBMHJCCLMHoAALMIDDKLoIEEKooFFGGoo,158,36,2,2]").append(System.lineSeparator());
        expected.append("[27980,26547,L-2,HJBBBMHJCCoMHoAAoMIDDKLoIEEKLoFFGGLo,162,37,2,2]").append(System.lineSeparator());
        expected.append("[30401,27980,A+1,HJBBBMHJCCoMHooAAMIDDKLoIEEKLoFFGGLo,167,38,1,1]").append(System.lineSeparator());
        expected.append("[30416,30401,M-3,HJBBBoHJCCooHooAAoIDDKLMIEEKLMFFGGLM,170,39,1,1]").append(System.lineSeparator());
        expected.append("[30448,30416,A+1,HJBBBoHJCCooHoooAAIDDKLMIEEKLMFFGGLM,175,40,0,0]").append(System.lineSeparator());
        expected.append("TN: 30458").append(System.lineSeparator());
        expected.append("EN: 3573").append(System.lineSeparator());
        expected.append("CN: 21546").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }

    private String getExpectedAStar6() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,FBBBJKFooHJKAAGHoKCCGIoooooIDDEEEooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[4,0,G+1,FBBBJKFoGHJKAAGHoKCCoIoooooIDDEEEooo,5,1,4,9]").append(System.lineSeparator());
        expected.append("[51,4,I-1,FBBBJKFoGHJKAAGHoKCCoooooooIDDEEEIoo,10,2,4,14]").append(System.lineSeparator());
        expected.append("[306,51,C+4,FBBBJKFoGHJKAAGHoKooooCCoooIDDEEEIoo,12,3,4,16]").append(System.lineSeparator());
        expected.append("[499,306,G-2,FBBBJKFooHJKAAoHoKooGoCCooGIDDEEEIoo,16,4,4,20]").append(System.lineSeparator());
        expected.append("[1220,499,A+1,FBBBJKFooHJKoAAHoKooGoCCooGIDDEEEIoo,21,5,3,24]").append(System.lineSeparator());
        expected.append("[2403,1220,F-3,oBBBJKoooHJKoAAHoKFoGoCCFoGIDDEEEIoo,24,6,3,27]").append(System.lineSeparator());
        expected.append("[3333,2403,A-1,oBBBJKoooHJKAAoHoKFoGoCCFoGIDDEEEIoo,29,7,4,33]").append(System.lineSeparator());
        expected.append("[5344,3333,G+2,oBBBJKooGHJKAAGHoKFoooCCFooIDDEEEIoo,33,8,4,37]").append(System.lineSeparator());
        expected.append("[7615,5344,C-3,oBBBJKooGHJKAAGHoKFCCoooFooIDDEEEIoo,36,9,4,40]").append(System.lineSeparator());
        expected.append("[9359,7615,B-1,BBBoJKooGHJKAAGHoKFCCoooFooIDDEEEIoo,41,10,4,45]").append(System.lineSeparator());
        expected.append("[12486,9359,H+1,BBBHJKooGHJKAAGooKFCCoooFooIDDEEEIoo,46,11,4,50]").append(System.lineSeparator());
        expected.append("[16528,12486,I+2,BBBHJKooGHJKAAGIoKFCCIooFoooDDEEEooo,50,12,4,54]").append(System.lineSeparator());
        expected.append("[20280,16528,D-3,BBBHJKooGHJKAAGIoKFCCIooFDDoooEEEooo,53,13,4,57]").append(System.lineSeparator());
        expected.append("[22493,20280,J-4,BBBHoKooGHoKAAGIoKFCCIooFDDoJoEEEoJo,55,14,4,59]").append(System.lineSeparator());
        expected.append("[23427,22493,K-3,BBBHooooGHooAAGIooFCCIoKFDDoJKEEEoJK,58,15,4,62]").append(System.lineSeparator());
        expected.append("[25681,23427,I-2,BBBHooooGHooAAGoooFCCooKFDDIJKEEEIJK,62,16,4,66]").append(System.lineSeparator());
        expected.append("[29883,25681,H-1,BBBoooooGHooAAGHooFCCooKFDDIJKEEEIJK,67,17,4,71]").append(System.lineSeparator());
        expected.append("[35618,29883,B+3,oooBBBooGHooAAGHooFCCooKFDDIJKEEEIJK,70,18,4,74]").append(System.lineSeparator());
        expected.append("[38699,35618,G+1,ooGBBBooGHooAAoHooFCCooKFDDIJKEEEIJK,75,19,4,79]").append(System.lineSeparator());
        expected.append("[44107,38699,A+1,ooGBBBooGHoooAAHooFCCooKFDDIJKEEEIJK,80,20,3,83]").append(System.lineSeparator());
        expected.append("[48326,44107,F+3,FoGBBBFoGHoooAAHoooCCooKoDDIJKEEEIJK,83,21,3,86]").append(System.lineSeparator());
        expected.append("[50020,48326,C+2,FoGBBBFoGHoooAAHoooooCCKoDDIJKEEEIJK,87,22,3,90]").append(System.lineSeparator());
        expected.append("[52452,50020,D-1,FoGBBBFoGHoooAAHoooooCCKDDoIJKEEEIJK,92,23,3,95]").append(System.lineSeparator());
        expected.append("[56806,52452,A-1,FoGBBBFoGHooAAoHoooooCCKDDoIJKEEEIJK,97,24,4,101]").append(System.lineSeparator());
        expected.append("[61605,56806,G-3,FooBBBFooHooAAoHooooGCCKDDGIJKEEEIJK,100,25,4,104]").append(System.lineSeparator());
        expected.append("[65791,61605,A+1,FooBBBFooHoooAAHooooGCCKDDGIJKEEEIJK,105,26,3,108]").append(System.lineSeparator());
        expected.append("[72436,65791,F-2,oooBBBoooHooFAAHooFoGCCKDDGIJKEEEIJK,109,27,3,112]").append(System.lineSeparator());
        expected.append("[81068,72436,B-3,BBBooooooHooFAAHooFoGCCKDDGIJKEEEIJK,112,28,3,115]").append(System.lineSeparator());
        expected.append("[87616,81068,H+1,BBBHoooooHooFAAoooFoGCCKDDGIJKEEEIJK,117,29,3,120]").append(System.lineSeparator());
        expected.append("[94610,87616,A+3,BBBHoooooHooFoooAAFoGCCKDDGIJKEEEIJK,120,30,0,120]").append(System.lineSeparator());
        expected.append("TN: 94860").append(System.lineSeparator());
        expected.append("EN: 8893").append(System.lineSeparator());
        expected.append("CN: 79540").append(System.lineSeparator());
        expected.append("DF: 30");
        return expected.toString();
    }

    private String getExpectedGBF6() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,FBBBJKFooHJKAAGHoKCCGIoooooIDDEEEooo,0,0,3,3]").append(System.lineSeparator());
        expected.append("[5,0,G-1,FBBBJKFooHJKAAoHoKCCGIooooGIDDEEEooo,5,1,2,2]").append(System.lineSeparator());
        expected.append("[10,5,A+1,FBBBJKFooHJKoAAHoKCCGIooooGIDDEEEooo,10,2,2,2]").append(System.lineSeparator());
        expected.append("[24,10,F-1,oBBBJKFooHJKFAAHoKCCGIooooGIDDEEEooo,15,3,2,2]").append(System.lineSeparator());
        expected.append("[100,24,B-1,BBBoJKFooHJKFAAHoKCCGIooooGIDDEEEooo,20,4,2,2]").append(System.lineSeparator());
        expected.append("[237,100,H+1,BBBHJKFooHJKFAAooKCCGIooooGIDDEEEooo,25,5,1,1]").append(System.lineSeparator());
        expected.append("[246,237,E+3,BBBHJKFooHJKFAAooKCCGIooooGIDDoooEEE,28,6,1,1]").append(System.lineSeparator());
        expected.append("[296,246,G-1,BBBHJKFooHJKFAAooKCCoIooooGIDDooGEEE,33,7,1,1]").append(System.lineSeparator());
        expected.append("[439,296,C+1,BBBHJKFooHJKFAAooKoCCIooooGIDDooGEEE,38,8,1,1]").append(System.lineSeparator());
        expected.append("[623,439,F-3,BBBHJKoooHJKoAAooKoCCIooFoGIDDFoGEEE,41,9,1,1]").append(System.lineSeparator());
        expected.append("[823,623,C-1,BBBHJKoooHJKoAAooKCCoIooFoGIDDFoGEEE,46,10,1,1]").append(System.lineSeparator());
        expected.append("[1167,823,G+1,BBBHJKoooHJKoAAooKCCGIooFoGIDDFooEEE,51,11,1,1]").append(System.lineSeparator());
        expected.append("[1562,1167,E-1,BBBHJKoooHJKoAAooKCCGIooFoGIDDFoEEEo,56,12,1,1]").append(System.lineSeparator());
        expected.append("[2015,1562,I+1,BBBHJKoooHJKoAAIoKCCGIooFoGoDDFoEEEo,61,13,2,2]").append(System.lineSeparator());
        expected.append("[4759,2015,D-1,BBBHJKoooHJKoAAIoKCCGIooFoGDDoFoEEEo,66,14,2,2]").append(System.lineSeparator());
        expected.append("[7005,4759,K-3,BBBHJooooHJooAAIooCCGIoKFoGDDKFoEEEK,69,15,1,1]").append(System.lineSeparator());
        expected.append("[7006,7005,A-1,BBBHJooooHJoAAoIooCCGIoKFoGDDKFoEEEK,74,16,1,1]").append(System.lineSeparator());
        expected.append("[7015,7006,G+1,BBBHJooooHJoAAGIooCCGIoKFooDDKFoEEEK,79,17,2,2]").append(System.lineSeparator());
        expected.append("[7955,7015,D-2,BBBHJooooHJoAAGIooCCGIoKFDDooKFoEEEK,83,18,2,2]").append(System.lineSeparator());
        expected.append("[8199,7955,I-1,BBBHJooooHJoAAGoooCCGIoKFDDIoKFoEEEK,88,19,1,1]").append(System.lineSeparator());
        expected.append("[8212,8199,J-3,BBBHoooooHooAAGoooCCGIJKFDDIJKFoEEEK,91,20,1,1]").append(System.lineSeparator());
        expected.append("[8240,8212,H-1,BBBooooooHooAAGHooCCGIJKFDDIJKFoEEEK,96,21,2,2]").append(System.lineSeparator());
        expected.append("[8897,8240,B+3,oooBBBoooHooAAGHooCCGIJKFDDIJKFoEEEK,99,22,2,2]").append(System.lineSeparator());
        expected.append("[10923,8897,G+2,ooGBBBooGHooAAoHooCCoIJKFDDIJKFoEEEK,103,23,1,1]").append(System.lineSeparator());
        expected.append("[10928,10923,A+1,ooGBBBooGHoooAAHooCCoIJKFDDIJKFoEEEK,108,24,1,1]").append(System.lineSeparator());
        expected.append("[10938,10928,C+1,ooGBBBooGHoooAAHoooCCIJKFDDIJKFoEEEK,113,25,1,1]").append(System.lineSeparator());
        expected.append("[10969,10938,F+4,FoGBBBFoGHoooAAHoooCCIJKoDDIJKooEEEK,115,26,1,1]").append(System.lineSeparator());
        expected.append("[11056,10969,A-1,FoGBBBFoGHooAAoHoooCCIJKoDDIJKooEEEK,120,27,1,1]").append(System.lineSeparator());
        expected.append("[11233,11056,C-1,FoGBBBFoGHooAAoHooCCoIJKoDDIJKooEEEK,125,28,1,1]").append(System.lineSeparator());
        expected.append("[11533,11233,D-1,FoGBBBFoGHooAAoHooCCoIJKDDoIJKooEEEK,130,29,1,1]").append(System.lineSeparator());
        expected.append("[11941,11533,G-3,FooBBBFooHooAAoHooCCGIJKDDGIJKooEEEK,133,30,1,1]").append(System.lineSeparator());
        expected.append("[12379,11941,A+1,FooBBBFooHoooAAHooCCGIJKDDGIJKooEEEK,138,31,1,1]").append(System.lineSeparator());
        expected.append("[12745,12379,F-1,oooBBBFooHooFAAHooCCGIJKDDGIJKooEEEK,143,32,1,1]").append(System.lineSeparator());
        expected.append("[13106,12745,B-3,BBBoooFooHooFAAHooCCGIJKDDGIJKooEEEK,146,33,1,1]").append(System.lineSeparator());
        expected.append("[13463,13106,H+1,BBBHooFooHooFAAoooCCGIJKDDGIJKooEEEK,151,34,0,0]").append(System.lineSeparator());
        expected.append("[13472,13463,A+3,BBBHooFooHooFoooAACCGIJKDDGIJKooEEEK,154,35,0,0]").append(System.lineSeparator());
        expected.append("TN: 13504").append(System.lineSeparator());
        expected.append("EN: 1441").append(System.lineSeparator());
        expected.append("CN: 7469").append(System.lineSeparator());
        expected.append("DF: 36");
        return expected.toString();
    }

    private String getExpectedAStar7() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBHooKFGHoJKFGAAJLFCCIoLoooIDDEEEIoo,0,0,2,2]").append(System.lineSeparator());
        expected.append("[2,0,J+1,BBHoJKFGHoJKFGAAoLFCCIoLoooIDDEEEIoo,5,1,2,7]").append(System.lineSeparator());
        expected.append("[7,2,A+1,BBHoJKFGHoJKFGoAALFCCIoLoooIDDEEEIoo,10,2,1,11]").append(System.lineSeparator());
        expected.append("[16,7,H-1,BBooJKFGHoJKFGHAALFCCIoLoooIDDEEEIoo,15,3,1,16]").append(System.lineSeparator());
        expected.append("[28,16,B+2,ooBBJKFGHoJKFGHAALFCCIoLoooIDDEEEIoo,19,4,1,20]").append(System.lineSeparator());
        expected.append("[33,28,F+1,FoBBJKFGHoJKFGHAALoCCIoLoooIDDEEEIoo,24,5,1,25]").append(System.lineSeparator());
        expected.append("[45,33,C-1,FoBBJKFGHoJKFGHAALCCoIoLoooIDDEEEIoo,29,6,1,30]").append(System.lineSeparator());
        expected.append("[69,45,H-2,FoBBJKFGooJKFGoAALCCHIoLooHIDDEEEIoo,33,7,1,34]").append(System.lineSeparator());
        expected.append("[83,69,G+1,FGBBJKFGooJKFooAALCCHIoLooHIDDEEEIoo,38,8,1,39]").append(System.lineSeparator());
        expected.append("[102,83,A-2,FGBBJKFGooJKFAAooLCCHIoLooHIDDEEEIoo,42,9,3,45]").append(System.lineSeparator());
        expected.append("[131,102,I+2,FGBBJKFGoIJKFAAIoLCCHIoLooHoDDEEEooo,46,10,3,49]").append(System.lineSeparator());
        expected.append("[159,131,E+3,FGBBJKFGoIJKFAAIoLCCHIoLooHoDDoooEEE,49,11,3,52]").append(System.lineSeparator());
        expected.append("[192,159,D-1,FGBBJKFGoIJKFAAIoLCCHIoLooHDDooooEEE,54,12,3,57]").append(System.lineSeparator());
        expected.append("[307,192,J-1,FGBBoKFGoIJKFAAIJLCCHIoLooHDDooooEEE,59,13,3,62]").append(System.lineSeparator());
        expected.append("[524,307,L-1,FGBBoKFGoIJKFAAIJoCCHIoLooHDDLoooEEE,64,14,3,67]").append(System.lineSeparator());
        expected.append("[901,524,K-1,FGBBooFGoIJKFAAIJKCCHIoLooHDDLoooEEE,69,15,3,72]").append(System.lineSeparator());
        expected.append("[1432,901,B+2,FGooBBFGoIJKFAAIJKCCHIoLooHDDLoooEEE,73,16,3,76]").append(System.lineSeparator());
        expected.append("[1957,1432,H-1,FGooBBFGoIJKFAAIJKCCoIoLooHDDLooHEEE,78,17,3,81]").append(System.lineSeparator());
        expected.append("[2373,1957,I+1,FGoIBBFGoIJKFAAIJKCCoooLooHDDLooHEEE,83,18,3,86]").append(System.lineSeparator());
        expected.append("[2601,2373,C+3,FGoIBBFGoIJKFAAIJKoooCCLooHDDLooHEEE,86,19,3,89]").append(System.lineSeparator());
        expected.append("[2670,2601,F-3,oGoIBBoGoIJKoAAIJKFooCCLFoHDDLFoHEEE,89,20,3,92]").append(System.lineSeparator());
        expected.append("[2779,2670,A-1,oGoIBBoGoIJKAAoIJKFooCCLFoHDDLFoHEEE,94,21,4,98]").append(System.lineSeparator());
        expected.append("[2917,2779,H+4,oGHIBBoGHIJKAAoIJKFooCCLFooDDLFooEEE,96,22,4,100]").append(System.lineSeparator());
        expected.append("[2959,2917,A+1,oGHIBBoGHIJKoAAIJKFooCCLFooDDLFooEEE,101,23,3,104]").append(System.lineSeparator());
        expected.append("[3081,2959,F+3,FGHIBBFGHIJKFAAIJKoooCCLoooDDLoooEEE,104,24,3,107]").append(System.lineSeparator());
        expected.append("[3280,3081,C-3,FGHIBBFGHIJKFAAIJKCCoooLoooDDLoooEEE,107,25,3,110]").append(System.lineSeparator());
        expected.append("[3734,3280,D-3,FGHIBBFGHIJKFAAIJKCCoooLDDoooLoooEEE,110,26,3,113]").append(System.lineSeparator());
        expected.append("[4511,3734,E-3,FGHIBBFGHIJKFAAIJKCCoooLDDoooLEEEooo,113,27,3,116]").append(System.lineSeparator());
        expected.append("[5971,4511,I-3,FGHoBBFGHoJKFAAoJKCCoIoLDDoIoLEEEIoo,116,28,3,119]").append(System.lineSeparator());
        expected.append("[8785,5971,J-3,FGHoBBFGHooKFAAooKCCoIoLDDoIJLEEEIJo,119,29,3,122]").append(System.lineSeparator());
        expected.append("[12941,8785,B-1,FGHBBoFGHooKFAAooKCCoIoLDDoIJLEEEIJo,124,30,3,127]").append(System.lineSeparator());
        expected.append("[24400,12941,K+1,FGHBBKFGHooKFAAoooCCoIoLDDoIJLEEEIJo,129,31,3,132]").append(System.lineSeparator());
        expected.append("[40179,24400,A+3,FGHBBKFGHooKFoooAACCoIoLDDoIJLEEEIJo,132,32,0,132]").append(System.lineSeparator());
        expected.append("TN: 40887").append(System.lineSeparator());
        expected.append("EN: 3734").append(System.lineSeparator());
        expected.append("CN: 22061").append(System.lineSeparator());
        expected.append("DF: 33");
        return expected.toString();
    }

    private String getExpectedGBF7() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBHooKFGHoJKFGAAJLFCCIoLoooIDDEEEIoo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[2,0,J+1,BBHoJKFGHoJKFGAAoLFCCIoLoooIDDEEEIoo,5,1,3,3]").append(System.lineSeparator());
        expected.append("[4,2,A+1,BBHoJKFGHoJKFGoAALFCCIoLoooIDDEEEIoo,10,2,2,2]").append(System.lineSeparator());
        expected.append("[10,4,H-1,BBooJKFGHoJKFGHAALFCCIoLoooIDDEEEIoo,15,3,2,2]").append(System.lineSeparator());
        expected.append("[15,10,B+2,ooBBJKFGHoJKFGHAALFCCIoLoooIDDEEEIoo,19,4,2,2]").append(System.lineSeparator());
        expected.append("[28,15,F+1,FoBBJKFGHoJKFGHAALoCCIoLoooIDDEEEIoo,24,5,2,2]").append(System.lineSeparator());
        expected.append("[45,28,C-1,FoBBJKFGHoJKFGHAALCCoIoLoooIDDEEEIoo,29,6,2,2]").append(System.lineSeparator());
        expected.append("[61,45,G+1,FGBBJKFGHoJKFoHAALCCoIoLoooIDDEEEIoo,34,7,2,2]").append(System.lineSeparator());
        expected.append("[78,61,H-2,FGBBJKFGooJKFooAALCCHIoLooHIDDEEEIoo,38,8,2,2]").append(System.lineSeparator());
        expected.append("[92,78,A-2,FGBBJKFGooJKFAAooLCCHIoLooHIDDEEEIoo,42,9,4,4]").append(System.lineSeparator());
        expected.append("[123,92,I+2,FGBBJKFGoIJKFAAIoLCCHIoLooHoDDEEEooo,46,10,5,5]").append(System.lineSeparator());
        expected.append("[180,123,D-1,FGBBJKFGoIJKFAAIoLCCHIoLooHDDoEEEooo,51,11,5,5]").append(System.lineSeparator());
        expected.append("[235,180,L-1,FGBBJKFGoIJKFAAIooCCHIoLooHDDLEEEooo,56,12,4,4]").append(System.lineSeparator());
        expected.append("[239,235,E+3,FGBBJKFGoIJKFAAIooCCHIoLooHDDLoooEEE,59,13,4,4]").append(System.lineSeparator());
        expected.append("[272,239,H-1,FGBBJKFGoIJKFAAIooCCoIoLooHDDLooHEEE,64,14,4,4]").append(System.lineSeparator());
        expected.append("[295,272,J-1,FGBBoKFGoIJKFAAIJoCCoIoLooHDDLooHEEE,69,15,5,5]").append(System.lineSeparator());
        expected.append("[578,295,K-1,FGBBooFGoIJKFAAIJKCCoIoLooHDDLooHEEE,74,16,6,6]").append(System.lineSeparator());
        expected.append("[1390,578,B+2,FGooBBFGoIJKFAAIJKCCoIoLooHDDLooHEEE,78,17,6,6]").append(System.lineSeparator());
        expected.append("[2347,1390,I+1,FGoIBBFGoIJKFAAIJKCCoooLooHDDLooHEEE,83,18,6,6]").append(System.lineSeparator());
        expected.append("[2655,2347,C+3,FGoIBBFGoIJKFAAIJKoooCCLooHDDLooHEEE,86,19,6,6]").append(System.lineSeparator());
        expected.append("[2733,2655,H+1,FGoIBBFGoIJKFAAIJKooHCCLooHDDLoooEEE,91,20,6,6]").append(System.lineSeparator());
        expected.append("[2794,2733,E-1,FGoIBBFGoIJKFAAIJKooHCCLooHDDLooEEEo,96,21,6,6]").append(System.lineSeparator());
        expected.append("[2828,2794,L-1,FGoIBBFGoIJKFAAIJKooHCCoooHDDLooEEEL,101,22,6,6]").append(System.lineSeparator());
        expected.append("[2896,2828,C+1,FGoIBBFGoIJKFAAIJKooHoCCooHDDLooEEEL,106,23,6,6]").append(System.lineSeparator());
        expected.append("[2987,2896,I-1,FGooBBFGoIJKFAAIJKooHICCooHDDLooEEEL,111,24,6,6]").append(System.lineSeparator());
        expected.append("[3118,2987,B-1,FGoBBoFGoIJKFAAIJKooHICCooHDDLooEEEL,116,25,6,6]").append(System.lineSeparator());
        expected.append("[3210,3118,K+1,FGoBBKFGoIJKFAAIJoooHICCooHDDLooEEEL,121,26,5,5]").append(System.lineSeparator());
        expected.append("[3216,3210,F-3,oGoBBKoGoIJKoAAIJoFoHICCFoHDDLFoEEEL,124,27,5,5]").append(System.lineSeparator());
        expected.append("[3327,3216,A-1,oGoBBKoGoIJKAAoIJoFoHICCFoHDDLFoEEEL,129,28,6,6]").append(System.lineSeparator());
        expected.append("[3708,3327,H+3,oGHBBKoGHIJKAAoIJoFooICCFooDDLFoEEEL,132,29,6,6]").append(System.lineSeparator());
        expected.append("[3771,3708,A+1,oGHBBKoGHIJKoAAIJoFooICCFooDDLFoEEEL,137,30,5,5]").append(System.lineSeparator());
        expected.append("[3781,3771,D-2,oGHBBKoGHIJKoAAIJoFooICCFDDooLFoEEEL,141,31,5,5]").append(System.lineSeparator());
        expected.append("[3799,3781,F+1,oGHBBKoGHIJKFAAIJoFooICCFDDooLooEEEL,146,32,5,5]").append(System.lineSeparator());
        expected.append("[3884,3799,E-2,oGHBBKoGHIJKFAAIJoFooICCFDDooLEEEooL,150,33,5,5]").append(System.lineSeparator());
        expected.append("[4074,3884,I-2,oGHBBKoGHoJKFAAoJoFooICCFDDIoLEEEIoL,154,34,4,4]").append(System.lineSeparator());
        expected.append("[4076,4074,A+1,oGHBBKoGHoJKFoAAJoFooICCFDDIoLEEEIoL,159,35,3,3]").append(System.lineSeparator());
        expected.append("[4087,4076,K-1,oGHBBooGHoJKFoAAJKFooICCFDDIoLEEEIoL,164,36,4,4]").append(System.lineSeparator());
        expected.append("[4183,4087,B+1,oGHoBBoGHoJKFoAAJKFooICCFDDIoLEEEIoL,169,37,4,4]").append(System.lineSeparator());
        expected.append("[4295,4183,A-1,oGHoBBoGHoJKFAAoJKFooICCFDDIoLEEEIoL,174,38,5,5]").append(System.lineSeparator());
        expected.append("[4573,4295,I+3,oGHIBBoGHIJKFAAIJKFoooCCFDDooLEEEooL,177,39,6,6]").append(System.lineSeparator());
        expected.append("[5237,4573,C-2,oGHIBBoGHIJKFAAIJKFoCCooFDDooLEEEooL,181,40,6,6]").append(System.lineSeparator());
        expected.append("[5837,5237,J-2,oGHIBBoGHIoKFAAIoKFoCCJoFDDoJLEEEooL,185,41,5,5]").append(System.lineSeparator());
        expected.append("[5841,5837,C-1,oGHIBBoGHIoKFAAIoKFCCoJoFDDoJLEEEooL,190,42,5,5]").append(System.lineSeparator());
        expected.append("[5872,5841,I-3,oGHoBBoGHooKFAAooKFCCIJoFDDIJLEEEIoL,193,43,4,4]").append(System.lineSeparator());
        expected.append("[5879,5872,A+2,oGHoBBoGHooKFooAAKFCCIJoFDDIJLEEEIoL,197,44,2,2]").append(System.lineSeparator());
        expected.append("[5893,5879,B-1,oGHBBooGHooKFooAAKFCCIJoFDDIJLEEEIoL,202,45,2,2]").append(System.lineSeparator());
        expected.append("[5909,5893,K+1,oGHBBKoGHooKFooAAoFCCIJoFDDIJLEEEIoL,207,46,1,1]").append(System.lineSeparator());
        expected.append("[5912,5909,A+1,oGHBBKoGHooKFoooAAFCCIJoFDDIJLEEEIoL,212,47,0,0]").append(System.lineSeparator());
        expected.append("TN: 5924").append(System.lineSeparator());
        expected.append("EN: 794").append(System.lineSeparator());
        expected.append("CN: 4338").append(System.lineSeparator());
        expected.append("DF: 47");
        return expected.toString();
    }

    private String getExpectedAStar8() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,A+1,BBBIKLCCoIKLoAAJKMGDDJoMGoHEEMFFHooo,5,1,3,8]").append(System.lineSeparator());
        expected.append("[6,1,C+1,BBBIKLoCCIKLoAAJKMGDDJoMGoHEEMFFHooo,10,2,3,13]").append(System.lineSeparator());
        expected.append("[26,6,G+2,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMFFHooo,14,3,3,17]").append(System.lineSeparator());
        expected.append("[62,26,D-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMFFHooo,19,4,3,22]").append(System.lineSeparator());
        expected.append("[119,62,H+1,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMFFoooo,24,5,3,27]").append(System.lineSeparator());
        expected.append("[178,119,F+4,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMooooFF,26,6,3,29]").append(System.lineSeparator());
        expected.append("[227,178,H-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMooHoFF,31,7,3,34]").append(System.lineSeparator());
        expected.append("[281,227,D+1,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMooHoFF,36,8,3,39]").append(System.lineSeparator());
        expected.append("[355,281,G-3,BBBIKLoCCIKLoAAJKMoDDJoMGoHEEMGoHoFF,39,9,3,42]").append(System.lineSeparator());
        expected.append("[421,355,D-1,BBBIKLoCCIKLoAAJKMDDoJoMGoHEEMGoHoFF,44,10,3,47]").append(System.lineSeparator());
        expected.append("[516,421,A-1,BBBIKLoCCIKLAAoJKMDDoJoMGoHEEMGoHoFF,49,11,4,53]").append(System.lineSeparator());
        expected.append("[708,516,H+2,BBBIKLoCCIKLAAHJKMDDHJoMGooEEMGoooFF,53,12,4,57]").append(System.lineSeparator());
        expected.append("[945,708,F-3,BBBIKLoCCIKLAAHJKMDDHJoMGooEEMGFFooo,56,13,4,60]").append(System.lineSeparator());
        expected.append("[1211,945,E-2,BBBIKLoCCIKLAAHJKMDDHJoMGEEooMGFFooo,60,14,4,64]").append(System.lineSeparator());
        expected.append("[1557,1211,K-3,BBBIoLoCCIoLAAHJoMDDHJKMGEEoKMGFFoKo,63,15,4,67]").append(System.lineSeparator());
        expected.append("[2022,1557,J-2,BBBIoLoCCIoLAAHooMDDHoKMGEEJKMGFFJKo,67,16,4,71]").append(System.lineSeparator());
        expected.append("[2967,2022,I-2,BBBooLoCCooLAAHIoMDDHIKMGEEJKMGFFJKo,71,17,4,75]").append(System.lineSeparator());
        expected.append("[4432,2967,M-1,BBBooLoCCooLAAHIooDDHIKMGEEJKMGFFJKM,76,18,4,80]").append(System.lineSeparator());
        expected.append("[7060,4432,L-1,BBBooooCCooLAAHIoLDDHIKMGEEJKMGFFJKM,81,19,4,85]").append(System.lineSeparator());
        expected.append("[10557,7060,B+3,oooBBBoCCooLAAHIoLDDHIKMGEEJKMGFFJKM,84,20,4,88]").append(System.lineSeparator());
        expected.append("[13379,10557,C+2,oooBBBoooCCLAAHIoLDDHIKMGEEJKMGFFJKM,88,21,4,92]").append(System.lineSeparator());
        expected.append("[16692,13379,H+2,ooHBBBooHCCLAAoIoLDDoIKMGEEJKMGFFJKM,92,22,4,96]").append(System.lineSeparator());
        expected.append("[19703,16692,A+1,ooHBBBooHCCLoAAIoLDDoIKMGEEJKMGFFJKM,97,23,3,100]").append(System.lineSeparator());
        expected.append("[21738,19703,D+1,ooHBBBooHCCLoAAIoLoDDIKMGEEJKMGFFJKM,102,24,3,105]").append(System.lineSeparator());
        expected.append("[23417,21738,G+4,GoHBBBGoHCCLoAAIoLoDDIKMoEEJKMoFFJKM,104,25,3,107]").append(System.lineSeparator());
        expected.append("[23824,23417,D-1,GoHBBBGoHCCLoAAIoLDDoIKMoEEJKMoFFJKM,109,26,3,112]").append(System.lineSeparator());
        expected.append("[24468,23824,E-1,GoHBBBGoHCCLoAAIoLDDoIKMEEoJKMoFFJKM,114,27,3,117]").append(System.lineSeparator());
        expected.append("[24949,24468,A-1,GoHBBBGoHCCLAAoIoLDDoIKMEEoJKMoFFJKM,119,28,4,123]").append(System.lineSeparator());
        expected.append("[25280,24949,H-3,GooBBBGooCCLAAoIoLDDHIKMEEHJKMoFFJKM,122,29,4,126]").append(System.lineSeparator());
        expected.append("[25431,25280,A+1,GooBBBGooCCLoAAIoLDDHIKMEEHJKMoFFJKM,127,30,3,130]").append(System.lineSeparator());
        expected.append("[25748,25431,G-1,oooBBBGooCCLGAAIoLDDHIKMEEHJKMoFFJKM,132,31,3,135]").append(System.lineSeparator());
        expected.append("[26609,25748,B-3,BBBoooGooCCLGAAIoLDDHIKMEEHJKMoFFJKM,135,32,3,138]").append(System.lineSeparator());
        expected.append("[27785,26609,C-2,BBBoooGCCooLGAAIoLDDHIKMEEHJKMoFFJKM,139,33,3,142]").append(System.lineSeparator());
        expected.append("[29842,27785,I+2,BBBIooGCCIoLGAAooLDDHoKMEEHJKMoFFJKM,143,34,3,146]").append(System.lineSeparator());
        expected.append("[32927,29842,L+1,BBBIoLGCCIoLGAAoooDDHoKMEEHJKMoFFJKM,148,35,3,151]").append(System.lineSeparator());
        expected.append("[37615,32927,A+3,BBBIoLGCCIoLGoooAADDHoKMEEHJKMoFFJKM,151,36,0,151]").append(System.lineSeparator());
        expected.append("TN: 37914").append(System.lineSeparator());
        expected.append("EN: 4079").append(System.lineSeparator());
        expected.append("CN: 29127").append(System.lineSeparator());
        expected.append("DF: 36");
        return expected.toString();
    }

    private String getExpectedGBF8() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,A+1,BBBIKLCCoIKLoAAJKMGDDJoMGoHEEMFFHooo,5,1,3,3]").append(System.lineSeparator());
        expected.append("[6,1,C+1,BBBIKLoCCIKLoAAJKMGDDJoMGoHEEMFFHooo,10,2,3,3]").append(System.lineSeparator());
        expected.append("[13,6,G+2,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMFFHooo,14,3,3,3]").append(System.lineSeparator());
        expected.append("[36,13,D-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMFFHooo,19,4,3,3]").append(System.lineSeparator());
        expected.append("[86,36,H+1,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMFFoooo,24,5,3,3]").append(System.lineSeparator());
        expected.append("[140,86,F+3,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMoooFFo,27,6,3,3]").append(System.lineSeparator());
        expected.append("[196,140,H-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMooHFFo,32,7,3,3]").append(System.lineSeparator());
        expected.append("[257,196,D+1,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMooHFFo,37,8,3,3]").append(System.lineSeparator());
        expected.append("[329,257,G-3,BBBIKLoCCIKLoAAJKMoDDJoMGoHEEMGoHFFo,40,9,3,3]").append(System.lineSeparator());
        expected.append("[398,329,D-1,BBBIKLoCCIKLoAAJKMDDoJoMGoHEEMGoHFFo,45,10,3,3]").append(System.lineSeparator());
        expected.append("[516,398,H+1,BBBIKLoCCIKLoAAJKMDDHJoMGoHEEMGooFFo,50,11,3,3]").append(System.lineSeparator());
        expected.append("[680,516,F-2,BBBIKLoCCIKLoAAJKMDDHJoMGoHEEMGFFooo,54,12,3,3]").append(System.lineSeparator());
        expected.append("[845,680,M-1,BBBIKLoCCIKLoAAJKoDDHJoMGoHEEMGFFooM,59,13,3,3]").append(System.lineSeparator());
        expected.append("[990,845,L-1,BBBIKooCCIKLoAAJKLDDHJoMGoHEEMGFFooM,64,14,3,3]").append(System.lineSeparator());
        expected.append("[1089,990,A-1,BBBIKooCCIKLAAoJKLDDHJoMGoHEEMGFFooM,69,15,4,4]").append(System.lineSeparator());
        expected.append("[1783,1089,H+1,BBBIKooCCIKLAAHJKLDDHJoMGooEEMGFFooM,74,16,4,4]").append(System.lineSeparator());
        expected.append("[2313,1783,E-2,BBBIKooCCIKLAAHJKLDDHJoMGEEooMGFFooM,78,17,4,4]").append(System.lineSeparator());
        expected.append("[3527,2313,J-2,BBBIKooCCIKLAAHoKLDDHooMGEEJoMGFFJoM,82,18,4,4]").append(System.lineSeparator());
        expected.append("[5657,3527,I-2,BBBoKooCCoKLAAHIKLDDHIoMGEEJoMGFFJoM,86,19,4,4]").append(System.lineSeparator());
        expected.append("[8446,5657,K-2,BBBooooCCooLAAHIKLDDHIKMGEEJKMGFFJoM,90,20,4,4]").append(System.lineSeparator());
        expected.append("[12339,8446,B+3,oooBBBoCCooLAAHIKLDDHIKMGEEJKMGFFJoM,93,21,4,4]").append(System.lineSeparator());
        expected.append("[17693,12339,C+2,oooBBBoooCCLAAHIKLDDHIKMGEEJKMGFFJoM,97,22,4,4]").append(System.lineSeparator());
        expected.append("[21406,17693,H+2,ooHBBBooHCCLAAoIKLDDoIKMGEEJKMGFFJoM,101,23,4,4]").append(System.lineSeparator());
        expected.append("[23696,21406,A+1,ooHBBBooHCCLoAAIKLDDoIKMGEEJKMGFFJoM,106,24,3,3]").append(System.lineSeparator());
        expected.append("[23702,23696,D+1,ooHBBBooHCCLoAAIKLoDDIKMGEEJKMGFFJoM,111,25,3,3]").append(System.lineSeparator());
        expected.append("[23709,23702,G+4,GoHBBBGoHCCLoAAIKLoDDIKMoEEJKMoFFJoM,113,26,3,3]").append(System.lineSeparator());
        expected.append("[23737,23709,D-1,GoHBBBGoHCCLoAAIKLDDoIKMoEEJKMoFFJoM,118,27,3,3]").append(System.lineSeparator());
        expected.append("[23811,23737,E-1,GoHBBBGoHCCLoAAIKLDDoIKMEEoJKMoFFJoM,123,28,3,3]").append(System.lineSeparator());
        expected.append("[23895,23811,A-1,GoHBBBGoHCCLAAoIKLDDoIKMEEoJKMoFFJoM,128,29,4,4]").append(System.lineSeparator());
        expected.append("[24984,23895,H-3,GooBBBGooCCLAAoIKLDDHIKMEEHJKMoFFJoM,131,30,4,4]").append(System.lineSeparator());
        expected.append("[25300,24984,A+1,GooBBBGooCCLoAAIKLDDHIKMEEHJKMoFFJoM,136,31,3,3]").append(System.lineSeparator());
        expected.append("[25314,25300,C-2,GooBBBGCCooLoAAIKLDDHIKMEEHJKMoFFJoM,140,32,3,3]").append(System.lineSeparator());
        expected.append("[25351,25314,G-1,oooBBBGCCooLGAAIKLDDHIKMEEHJKMoFFJoM,145,33,3,3]").append(System.lineSeparator());
        expected.append("[25547,25351,B-3,BBBoooGCCooLGAAIKLDDHIKMEEHJKMoFFJoM,148,34,3,3]").append(System.lineSeparator());
        expected.append("[26160,25547,I+2,BBBIooGCCIoLGAAoKLDDHoKMEEHJKMoFFJoM,152,35,3,3]").append(System.lineSeparator());
        expected.append("[27417,26160,A+1,BBBIooGCCIoLGoAAKLDDHoKMEEHJKMoFFJoM,157,36,2,2]").append(System.lineSeparator());
        expected.append("[27432,27417,K-1,BBBIooGCCIoLGoAAoLDDHoKMEEHJKMoFFJKM,162,37,2,2]").append(System.lineSeparator());
        expected.append("[27465,27432,A+1,BBBIooGCCIoLGooAALDDHoKMEEHJKMoFFJKM,167,38,1,1]").append(System.lineSeparator());
        expected.append("[27478,27465,L+1,BBBIoLGCCIoLGooAAoDDHoKMEEHJKMoFFJKM,172,39,1,1]").append(System.lineSeparator());
        expected.append("[27498,27478,A+1,BBBIoLGCCIoLGoooAADDHoKMEEHJKMoFFJKM,177,40,0,0]").append(System.lineSeparator());
        expected.append("TN: 27506").append(System.lineSeparator());
        expected.append("EN: 3014").append(System.lineSeparator());
        expected.append("CN: 22781").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }

    private String getExpectedAStar9() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooIBBooHICCAAHJKMDDoJKMGEEELNGFFFLN,0,0,4,4]").append(System.lineSeparator());
        expected.append("[2,0,H+1,ooHIBBooHICCAAoJKMDDoJKMGEEELNGFFFLN,5,1,4,9]").append(System.lineSeparator());
        expected.append("[7,2,A+1,ooHIBBooHICCoAAJKMDDoJKMGEEELNGFFFLN,10,2,3,13]").append(System.lineSeparator());
        expected.append("[14,7,D+1,ooHIBBooHICCoAAJKMoDDJKMGEEELNGFFFLN,15,3,3,18]").append(System.lineSeparator());
        expected.append("[27,14,G+4,GoHIBBGoHICCoAAJKMoDDJKMoEEELNoFFFLN,17,4,3,20]").append(System.lineSeparator());
        expected.append("[36,27,E-1,GoHIBBGoHICCoAAJKMoDDJKMEEEoLNoFFFLN,22,5,3,25]").append(System.lineSeparator());
        expected.append("[72,36,F-1,GoHIBBGoHICCoAAJKMoDDJKMEEEoLNFFFoLN,27,6,3,30]").append(System.lineSeparator());
        expected.append("[137,72,J-2,GoHIBBGoHICCoAAoKMoDDoKMEEEJLNFFFJLN,31,7,3,34]").append(System.lineSeparator());
        expected.append("[209,137,I-2,GoHoBBGoHoCCoAAIKMoDDIKMEEEJLNFFFJLN,35,8,3,38]").append(System.lineSeparator());
        expected.append("[367,209,D-1,GoHoBBGoHoCCoAAIKMDDoIKMEEEJLNFFFJLN,40,9,3,43]").append(System.lineSeparator());
        expected.append("[640,367,A-1,GoHoBBGoHoCCAAoIKMDDoIKMEEEJLNFFFJLN,45,10,4,49]").append(System.lineSeparator());
        expected.append("[941,640,H-2,GoooBBGoooCCAAHIKMDDHIKMEEEJLNFFFJLN,49,11,4,53]").append(System.lineSeparator());
        expected.append("[1191,941,B-3,GBBoooGoooCCAAHIKMDDHIKMEEEJLNFFFJLN,52,12,4,56]").append(System.lineSeparator());
        expected.append("[1464,1191,C-3,GBBoooGCCoooAAHIKMDDHIKMEEEJLNFFFJLN,55,13,4,59]").append(System.lineSeparator());
        expected.append("[1775,1464,I+2,GBBIooGCCIooAAHoKMDDHoKMEEEJLNFFFJLN,59,14,4,63]").append(System.lineSeparator());
        expected.append("[2086,1775,J+2,GBBIooGCCIooAAHJKMDDHJKMEEEoLNFFFoLN,63,15,4,67]").append(System.lineSeparator());
        expected.append("[2632,2086,K+2,GBBIKoGCCIKoAAHJoMDDHJoMEEEoLNFFFoLN,67,16,4,71]").append(System.lineSeparator());
        expected.append("[3571,2632,L+2,GBBIKoGCCIKoAAHJLMDDHJLMEEEooNFFFooN,71,17,4,75]").append(System.lineSeparator());
        expected.append("[4749,3571,M+2,GBBIKMGCCIKMAAHJLoDDHJLoEEEooNFFFooN,75,18,4,79]").append(System.lineSeparator());
        expected.append("[6155,4749,N+2,GBBIKMGCCIKMAAHJLNDDHJLNEEEoooFFFooo,79,19,4,83]").append(System.lineSeparator());
        expected.append("[7586,6155,E+3,GBBIKMGCCIKMAAHJLNDDHJLNoooEEEFFFooo,82,20,4,86]").append(System.lineSeparator());
        expected.append("[8710,7586,F+3,GBBIKMGCCIKMAAHJLNDDHJLNoooEEEoooFFF,85,21,4,89]").append(System.lineSeparator());
        expected.append("[9755,8710,H-2,GBBIKMGCCIKMAAoJLNDDoJLNooHEEEooHFFF,89,22,4,93]").append(System.lineSeparator());
        expected.append("[10836,9755,A+1,GBBIKMGCCIKMoAAJLNDDoJLNooHEEEooHFFF,94,23,3,97]").append(System.lineSeparator());
        expected.append("[11119,10836,D+1,GBBIKMGCCIKMoAAJLNoDDJLNooHEEEooHFFF,99,24,3,102]").append(System.lineSeparator());
        expected.append("[11150,11119,G-4,oBBIKMoCCIKMoAAJLNoDDJLNGoHEEEGoHFFF,101,25,3,104]").append(System.lineSeparator());
        expected.append("[11167,11150,B-1,BBoIKMoCCIKMoAAJLNoDDJLNGoHEEEGoHFFF,106,26,3,109]").append(System.lineSeparator());
        expected.append("[11216,11167,C-1,BBoIKMCCoIKMoAAJLNoDDJLNGoHEEEGoHFFF,111,27,3,114]").append(System.lineSeparator());
        expected.append("[11273,11216,D-1,BBoIKMCCoIKMoAAJLNDDoJLNGoHEEEGoHFFF,116,28,3,119]").append(System.lineSeparator());
        expected.append("[11330,11273,A-1,BBoIKMCCoIKMAAoJLNDDoJLNGoHEEEGoHFFF,121,29,4,125]").append(System.lineSeparator());
        expected.append("[11483,11330,H+4,BBHIKMCCHIKMAAoJLNDDoJLNGooEEEGooFFF,123,30,4,127]").append(System.lineSeparator());
        expected.append("[11532,11483,A+1,BBHIKMCCHIKMoAAJLNDDoJLNGooEEEGooFFF,128,31,3,131]").append(System.lineSeparator());
        expected.append("[11769,11532,D+1,BBHIKMCCHIKMoAAJLNoDDJLNGooEEEGooFFF,133,32,3,136]").append(System.lineSeparator());
        expected.append("[12427,11769,G+2,BBHIKMCCHIKMGAAJLNGDDJLNoooEEEoooFFF,137,33,3,140]").append(System.lineSeparator());
        expected.append("[13579,12427,E-3,BBHIKMCCHIKMGAAJLNGDDJLNEEEooooooFFF,140,34,3,143]").append(System.lineSeparator());
        expected.append("[15064,13579,J-1,BBHIKMCCHIKMGAAoLNGDDJLNEEEJoooooFFF,145,35,3,148]").append(System.lineSeparator());
        expected.append("[17746,15064,L-1,BBHIKMCCHIKMGAAooNGDDJLNEEEJLooooFFF,150,36,3,153]").append(System.lineSeparator());
        expected.append("[20965,17746,N-1,BBHIKMCCHIKMGAAoooGDDJLNEEEJLNoooFFF,155,37,3,158]").append(System.lineSeparator());
        expected.append("[24369,20965,A+3,BBHIKMCCHIKMGoooAAGDDJLNEEEJLNoooFFF,158,38,0,158]").append(System.lineSeparator());
        expected.append("TN: 24767").append(System.lineSeparator());
        expected.append("EN: 2885").append(System.lineSeparator());
        expected.append("CN: 18500").append(System.lineSeparator());
        expected.append("DF: 39");
        return expected.toString();
    }

    private String getExpectedGBF9() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooIBBooHICCAAHJKMDDoJKMGEEELNGFFFLN,0,0,4,4]").append(System.lineSeparator());
        expected.append("[2,0,H+1,ooHIBBooHICCAAoJKMDDoJKMGEEELNGFFFLN,5,1,3,3]").append(System.lineSeparator());
        expected.append("[4,2,A+1,ooHIBBooHICCoAAJKMDDoJKMGEEELNGFFFLN,10,2,3,3]").append(System.lineSeparator());
        expected.append("[9,4,D+1,ooHIBBooHICCoAAJKMoDDJKMGEEELNGFFFLN,15,3,3,3]").append(System.lineSeparator());
        expected.append("[17,9,G+2,ooHIBBooHICCGAAJKMGDDJKMoEEELNoFFFLN,19,4,3,3]").append(System.lineSeparator());
        expected.append("[30,17,E-1,ooHIBBooHICCGAAJKMGDDJKMEEEoLNoFFFLN,24,5,3,3]").append(System.lineSeparator());
        expected.append("[63,30,J-1,ooHIBBooHICCGAAoKMGDDJKMEEEJLNoFFFLN,29,6,2,2]").append(System.lineSeparator());
        expected.append("[65,63,F-1,ooHIBBooHICCGAAoKMGDDJKMEEEJLNFFFoLN,34,7,2,2]").append(System.lineSeparator());
        expected.append("[80,65,J-1,ooHIBBooHICCGAAoKMGDDoKMEEEJLNFFFJLN,39,8,2,2]").append(System.lineSeparator());
        expected.append("[134,80,I-2,ooHoBBooHoCCGAAIKMGDDIKMEEEJLNFFFJLN,43,9,3,3]").append(System.lineSeparator());
        expected.append("[465,134,B-1,ooHBBoooHoCCGAAIKMGDDIKMEEEJLNFFFJLN,48,10,3,3]").append(System.lineSeparator());
        expected.append("[811,465,C-1,ooHBBoooHCCoGAAIKMGDDIKMEEEJLNFFFJLN,53,11,3,3]").append(System.lineSeparator());
        expected.append("[1012,811,M+2,ooHBBMooHCCMGAAIKoGDDIKoEEEJLNFFFJLN,57,12,2,2]").append(System.lineSeparator());
        expected.append("[1014,1012,G+2,GoHBBMGoHCCMoAAIKooDDIKoEEEJLNFFFJLN,61,13,2,2]").append(System.lineSeparator());
        expected.append("[1026,1014,A-1,GoHBBMGoHCCMAAoIKooDDIKoEEEJLNFFFJLN,66,14,2,2]").append(System.lineSeparator());
        expected.append("[1052,1026,D-1,GoHBBMGoHCCMAAoIKoDDoIKoEEEJLNFFFJLN,71,15,2,2]").append(System.lineSeparator());
        expected.append("[1080,1052,H-2,GooBBMGooCCMAAHIKoDDHIKoEEEJLNFFFJLN,75,16,3,3]").append(System.lineSeparator());
        expected.append("[1299,1080,B-1,GoBBoMGooCCMAAHIKoDDHIKoEEEJLNFFFJLN,80,17,3,3]").append(System.lineSeparator());
        expected.append("[1433,1299,C-1,GoBBoMGoCCoMAAHIKoDDHIKoEEEJLNFFFJLN,85,18,3,3]").append(System.lineSeparator());
        expected.append("[1532,1433,K+2,GoBBKMGoCCKMAAHIooDDHIooEEEJLNFFFJLN,89,19,2,2]").append(System.lineSeparator());
        expected.append("[1537,1532,B-1,GBBoKMGoCCKMAAHIooDDHIooEEEJLNFFFJLN,94,20,2,2]").append(System.lineSeparator());
        expected.append("[1548,1537,C-1,GBBoKMGCCoKMAAHIooDDHIooEEEJLNFFFJLN,99,21,2,2]").append(System.lineSeparator());
        expected.append("[1589,1548,I+2,GBBIKMGCCIKMAAHoooDDHoooEEEJLNFFFJLN,103,22,1,1]").append(System.lineSeparator());
        expected.append("[1601,1589,J+2,GBBIKMGCCIKMAAHJooDDHJooEEEoLNFFFoLN,107,23,2,2]").append(System.lineSeparator());
        expected.append("[1859,1601,L+2,GBBIKMGCCIKMAAHJLoDDHJLoEEEooNFFFooN,111,24,3,3]").append(System.lineSeparator());
        expected.append("[3691,1859,N+2,GBBIKMGCCIKMAAHJLNDDHJLNEEEoooFFFooo,115,25,4,4]").append(System.lineSeparator());
        expected.append("[7856,3691,E+3,GBBIKMGCCIKMAAHJLNDDHJLNoooEEEFFFooo,118,26,4,4]").append(System.lineSeparator());
        expected.append("[10538,7856,H-1,GBBIKMGCCIKMAAoJLNDDHJLNooHEEEFFFooo,123,27,3,3]").append(System.lineSeparator());
        expected.append("[10539,10538,A+1,GBBIKMGCCIKMoAAJLNDDHJLNooHEEEFFFooo,128,28,3,3]").append(System.lineSeparator());
        expected.append("[10547,10539,F+3,GBBIKMGCCIKMoAAJLNDDHJLNooHEEEoooFFF,131,29,3,3]").append(System.lineSeparator());
        expected.append("[10580,10547,H-1,GBBIKMGCCIKMoAAJLNDDoJLNooHEEEooHFFF,136,30,3,3]").append(System.lineSeparator());
        expected.append("[10607,10580,D+1,GBBIKMGCCIKMoAAJLNoDDJLNooHEEEooHFFF,141,31,3,3]").append(System.lineSeparator());
        expected.append("[10638,10607,G-4,oBBIKMoCCIKMoAAJLNoDDJLNGoHEEEGoHFFF,143,32,3,3]").append(System.lineSeparator());
        expected.append("[10661,10638,A-1,oBBIKMoCCIKMAAoJLNoDDJLNGoHEEEGoHFFF,148,33,3,3]").append(System.lineSeparator());
        expected.append("[10699,10661,B-1,BBoIKMoCCIKMAAoJLNoDDJLNGoHEEEGoHFFF,153,34,3,3]").append(System.lineSeparator());
        expected.append("[10740,10699,C-1,BBoIKMCCoIKMAAoJLNoDDJLNGoHEEEGoHFFF,158,35,3,3]").append(System.lineSeparator());
        expected.append("[10783,10740,D-1,BBoIKMCCoIKMAAoJLNDDoJLNGoHEEEGoHFFF,163,36,3,3]").append(System.lineSeparator());
        expected.append("[10839,10783,H+4,BBHIKMCCHIKMAAoJLNDDoJLNGooEEEGooFFF,165,37,3,3]").append(System.lineSeparator());
        expected.append("[10904,10839,E-1,BBHIKMCCHIKMAAoJLNDDoJLNGoEEEoGooFFF,170,38,3,3]").append(System.lineSeparator());
        expected.append("[10986,10904,N-1,BBHIKMCCHIKMAAoJLoDDoJLNGoEEENGooFFF,175,39,2,2]").append(System.lineSeparator());
        expected.append("[10989,10986,E-1,BBHIKMCCHIKMAAoJLoDDoJLNGEEEoNGooFFF,180,40,2,2]").append(System.lineSeparator());
        expected.append("[11019,10989,L-1,BBHIKMCCHIKMAAoJooDDoJLNGEEELNGooFFF,185,41,1,1]").append(System.lineSeparator());
        expected.append("[11022,11019,A+1,BBHIKMCCHIKMoAAJooDDoJLNGEEELNGooFFF,190,42,1,1]").append(System.lineSeparator());
        expected.append("[11033,11022,D+1,BBHIKMCCHIKMoAAJoooDDJLNGEEELNGooFFF,195,43,1,1]").append(System.lineSeparator());
        expected.append("[11078,11033,G+2,BBHIKMCCHIKMGAAJooGDDJLNoEEELNoooFFF,199,44,1,1]").append(System.lineSeparator());
        expected.append("[11202,11078,E-1,BBHIKMCCHIKMGAAJooGDDJLNEEEoLNoooFFF,204,45,1,1]").append(System.lineSeparator());
        expected.append("[11415,11202,J-1,BBHIKMCCHIKMGAAoooGDDJLNEEEJLNoooFFF,209,46,0,0]").append(System.lineSeparator());
        expected.append("[11422,11415,A+3,BBHIKMCCHIKMGoooAAGDDJLNEEEJLNoooFFF,212,47,0,0]").append(System.lineSeparator());
        expected.append("TN: 11451").append(System.lineSeparator());
        expected.append("EN: 1403").append(System.lineSeparator());
        expected.append("CN: 7700").append(System.lineSeparator());
        expected.append("DF: 48");
        return expected.toString();
    }

    private String getExpectedAStar10() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooHBBooGHCCAAGIJLFooIJLFDDDKMooEEKM,0,0,4,4]").append(System.lineSeparator());
        expected.append("[4,0,G+1,ooGHBBooGHCCAAoIJLFooIJLFDDDKMooEEKM,5,1,4,9]").append(System.lineSeparator());
        expected.append("[19,4,A+1,ooGHBBooGHCCoAAIJLFooIJLFDDDKMooEEKM,10,2,3,13]").append(System.lineSeparator());
        expected.append("[44,19,F+3,FoGHBBFoGHCCoAAIJLoooIJLoDDDKMooEEKM,13,3,3,16]").append(System.lineSeparator());
        expected.append("[73,44,E-2,FoGHBBFoGHCCoAAIJLoooIJLoDDDKMEEooKM,17,4,3,20]").append(System.lineSeparator());
        expected.append("[121,73,D-1,FoGHBBFoGHCCoAAIJLoooIJLDDDoKMEEooKM,22,5,3,25]").append(System.lineSeparator());
        expected.append("[199,121,I-2,FoGHBBFoGHCCoAAoJLooooJLDDDIKMEEoIKM,26,6,3,29]").append(System.lineSeparator());
        expected.append("[293,199,H-2,FoGoBBFoGoCCoAAHJLoooHJLDDDIKMEEoIKM,30,7,3,33]").append(System.lineSeparator());
        expected.append("[484,293,A-1,FoGoBBFoGoCCAAoHJLoooHJLDDDIKMEEoIKM,35,8,4,39]").append(System.lineSeparator());
        expected.append("[798,484,G-2,FoooBBFoooCCAAGHJLooGHJLDDDIKMEEoIKM,39,9,4,43]").append(System.lineSeparator());
        expected.append("[1074,798,B-3,FBBoooFoooCCAAGHJLooGHJLDDDIKMEEoIKM,42,10,4,46]").append(System.lineSeparator());
        expected.append("[1329,1074,C-3,FBBoooFCCoooAAGHJLooGHJLDDDIKMEEoIKM,45,11,4,49]").append(System.lineSeparator());
        expected.append("[1708,1329,H+2,FBBHooFCCHooAAGoJLooGoJLDDDIKMEEoIKM,49,12,4,53]").append(System.lineSeparator());
        expected.append("[2296,1708,I+2,FBBHooFCCHooAAGIJLooGIJLDDDoKMEEooKM,53,13,4,57]").append(System.lineSeparator());
        expected.append("[3357,2296,J+2,FBBHJoFCCHJoAAGIoLooGIoLDDDoKMEEooKM,57,14,4,61]").append(System.lineSeparator());
        expected.append("[5236,3357,K+2,FBBHJoFCCHJoAAGIKLooGIKLDDDooMEEoooM,61,15,4,65]").append(System.lineSeparator());
        expected.append("[7801,5236,L+2,FBBHJLFCCHJLAAGIKoooGIKoDDDooMEEoooM,65,16,4,69]").append(System.lineSeparator());
        expected.append("[10691,7801,M+2,FBBHJLFCCHJLAAGIKMooGIKMDDDoooEEoooo,69,17,4,73]").append(System.lineSeparator());
        expected.append("[13534,10691,D+3,FBBHJLFCCHJLAAGIKMooGIKMoooDDDEEoooo,72,18,4,76]").append(System.lineSeparator());
        expected.append("[15422,13534,G-2,FBBHJLFCCHJLAAoIKMoooIKMooGDDDEEGooo,76,19,4,80]").append(System.lineSeparator());
        expected.append("[17533,15422,A+1,FBBHJLFCCHJLoAAIKMoooIKMooGDDDEEGooo,81,20,3,84]").append(System.lineSeparator());
        expected.append("[18585,17533,F-3,oBBHJLoCCHJLoAAIKMFooIKMFoGDDDEEGooo,84,21,3,87]").append(System.lineSeparator());
        expected.append("[18819,18585,B-1,BBoHJLoCCHJLoAAIKMFooIKMFoGDDDEEGooo,89,22,3,92]").append(System.lineSeparator());
        expected.append("[19198,18819,C-1,BBoHJLCCoHJLoAAIKMFooIKMFoGDDDEEGooo,94,23,3,97]").append(System.lineSeparator());
        expected.append("[19764,19198,A-1,BBoHJLCCoHJLAAoIKMFooIKMFoGDDDEEGooo,99,24,4,103]").append(System.lineSeparator());
        expected.append("[20401,19764,G+4,BBGHJLCCGHJLAAoIKMFooIKMFooDDDEEoooo,101,25,4,105]").append(System.lineSeparator());
        expected.append("[20855,20401,A+1,BBGHJLCCGHJLoAAIKMFooIKMFooDDDEEoooo,106,26,3,109]").append(System.lineSeparator());
        expected.append("[22051,20855,F+1,BBGHJLCCGHJLFAAIKMFooIKMoooDDDEEoooo,111,27,3,114]").append(System.lineSeparator());
        expected.append("[25160,22051,D-3,BBGHJLCCGHJLFAAIKMFooIKMDDDoooEEoooo,114,28,3,117]").append(System.lineSeparator());
        expected.append("[28349,25160,I-2,BBGHJLCCGHJLFAAoKMFoooKMDDDIooEEoIoo,118,29,3,121]").append(System.lineSeparator());
        expected.append("[34010,28349,K-2,BBGHJLCCGHJLFAAooMFooooMDDDIKoEEoIKo,122,30,3,125]").append(System.lineSeparator());
        expected.append("[40237,34010,M-2,BBGHJLCCGHJLFAAoooFoooooDDDIKMEEoIKM,126,31,3,129]").append(System.lineSeparator());
        expected.append("[45618,40237,A+3,BBGHJLCCGHJLFoooAAFoooooDDDIKMEEoIKM,129,32,0,129]").append(System.lineSeparator());
        expected.append("TN: 45705").append(System.lineSeparator());
        expected.append("EN: 4518").append(System.lineSeparator());
        expected.append("CN: 34833").append(System.lineSeparator());
        expected.append("DF: 33");
        return expected.toString();
    }

    private String getExpectedGBF10() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooHBBooGHCCAAGIJLFooIJLFDDDKMooEEKM,0,0,8,8]").append(System.lineSeparator());
        expected.append("[4,0,G+1,ooGHBBooGHCCAAoIJLFooIJLFDDDKMooEEKM,5,1,7,7]").append(System.lineSeparator());
        expected.append("[6,4,A+1,ooGHBBooGHCCoAAIJLFooIJLFDDDKMooEEKM,10,2,6,6]").append(System.lineSeparator());
        expected.append("[15,6,F+1,ooGHBBooGHCCFAAIJLFooIJLoDDDKMooEEKM,15,3,6,6]").append(System.lineSeparator());
        expected.append("[32,15,D-1,ooGHBBooGHCCFAAIJLFooIJLDDDoKMooEEKM,20,4,6,6]").append(System.lineSeparator());
        expected.append("[112,32,I-1,ooGHBBooGHCCFAAoJLFooIJLDDDIKMooEEKM,25,5,5,5]").append(System.lineSeparator());
        expected.append("[113,112,A+1,ooGHBBooGHCCFoAAJLFooIJLDDDIKMooEEKM,30,6,4,4]").append(System.lineSeparator());
        expected.append("[121,113,E-1,ooGHBBooGHCCFoAAJLFooIJLDDDIKMoEEoKM,35,7,4,4]").append(System.lineSeparator());
        expected.append("[130,121,I-1,ooGHBBooGHCCFoAAJLFoooJLDDDIKMoEEIKM,40,8,4,4]").append(System.lineSeparator());
        expected.append("[161,130,A-1,ooGHBBooGHCCFAAoJLFoooJLDDDIKMoEEIKM,45,9,5,5]").append(System.lineSeparator());
        expected.append("[259,161,H-2,ooGoBBooGoCCFAAHJLFooHJLDDDIKMoEEIKM,49,10,6,6]").append(System.lineSeparator());
        expected.append("[477,259,B-1,ooGBBoooGoCCFAAHJLFooHJLDDDIKMoEEIKM,54,11,6,6]").append(System.lineSeparator());
        expected.append("[621,477,C-1,ooGBBoooGCCoFAAHJLFooHJLDDDIKMoEEIKM,59,12,6,6]").append(System.lineSeparator());
        expected.append("[747,621,L+2,ooGBBLooGCCLFAAHJoFooHJoDDDIKMoEEIKM,63,13,5,5]").append(System.lineSeparator());
        expected.append("[750,747,F+2,FoGBBLFoGCCLoAAHJooooHJoDDDIKMoEEIKM,67,14,5,5]").append(System.lineSeparator());
        expected.append("[769,750,A-1,FoGBBLFoGCCLAAoHJooooHJoDDDIKMoEEIKM,72,15,6,6]").append(System.lineSeparator());
        expected.append("[944,769,G-2,FooBBLFooCCLAAGHJoooGHJoDDDIKMoEEIKM,76,16,7,7]").append(System.lineSeparator());
        expected.append("[1367,944,B-1,FoBBoLFooCCLAAGHJoooGHJoDDDIKMoEEIKM,81,17,7,7]").append(System.lineSeparator());
        expected.append("[1506,1367,C-1,FoBBoLFoCCoLAAGHJoooGHJoDDDIKMoEEIKM,86,18,7,7]").append(System.lineSeparator());
        expected.append("[1710,1506,J+2,FoBBJLFoCCJLAAGHooooGHooDDDIKMoEEIKM,90,19,6,6]").append(System.lineSeparator());
        expected.append("[1715,1710,B-1,FBBoJLFoCCJLAAGHooooGHooDDDIKMoEEIKM,95,20,6,6]").append(System.lineSeparator());
        expected.append("[1727,1715,C-1,FBBoJLFCCoJLAAGHooooGHooDDDIKMoEEIKM,100,21,6,6]").append(System.lineSeparator());
        expected.append("[1784,1727,H+2,FBBHJLFCCHJLAAGoooooGoooDDDIKMoEEIKM,104,22,5,5]").append(System.lineSeparator());
        expected.append("[1797,1784,I+2,FBBHJLFCCHJLAAGIooooGIooDDDoKMoEEoKM,108,23,6,6]").append(System.lineSeparator());
        expected.append("[2243,1797,K+2,FBBHJLFCCHJLAAGIKoooGIKoDDDooMoEEooM,112,24,7,7]").append(System.lineSeparator());
        expected.append("[5505,2243,M+2,FBBHJLFCCHJLAAGIKMooGIKMDDDooooEEooo,116,25,8,8]").append(System.lineSeparator());
        expected.append("[12958,5505,D+3,FBBHJLFCCHJLAAGIKMooGIKMoooDDDoEEooo,119,26,8,8]").append(System.lineSeparator());
        expected.append("[17941,12958,G-1,FBBHJLFCCHJLAAoIKMooGIKMooGDDDoEEooo,124,27,7,7]").append(System.lineSeparator());
        expected.append("[17942,17941,A+1,FBBHJLFCCHJLoAAIKMooGIKMooGDDDoEEooo,129,28,6,6]").append(System.lineSeparator());
        expected.append("[17955,17942,F-3,oBBHJLoCCHJLoAAIKMFoGIKMFoGDDDoEEooo,132,29,6,6]").append(System.lineSeparator());
        expected.append("[18015,17955,B-1,BBoHJLoCCHJLoAAIKMFoGIKMFoGDDDoEEooo,137,30,6,6]").append(System.lineSeparator());
        expected.append("[18239,18015,C-1,BBoHJLCCoHJLoAAIKMFoGIKMFoGDDDoEEooo,142,31,6,6]").append(System.lineSeparator());
        expected.append("[18606,18239,A-1,BBoHJLCCoHJLAAoIKMFoGIKMFoGDDDoEEooo,147,32,7,7]").append(System.lineSeparator());
        expected.append("[19225,18606,G+3,BBGHJLCCGHJLAAoIKMFooIKMFooDDDoEEooo,150,33,7,7]").append(System.lineSeparator());
        expected.append("[19428,19225,A+1,BBGHJLCCGHJLoAAIKMFooIKMFooDDDoEEooo,155,34,6,6]").append(System.lineSeparator());
        expected.append("[19440,19428,D-1,BBGHJLCCGHJLoAAIKMFooIKMFoDDDooEEooo,160,35,6,6]").append(System.lineSeparator());
        expected.append("[19457,19440,M-1,BBGHJLCCGHJLoAAIKoFooIKMFoDDDMoEEooo,165,36,5,5]").append(System.lineSeparator());
        expected.append("[19460,19457,D-1,BBGHJLCCGHJLoAAIKoFooIKMFDDDoMoEEooo,170,37,5,5]").append(System.lineSeparator());
        expected.append("[19489,19460,K-1,BBGHJLCCGHJLoAAIooFooIKMFDDDKMoEEooo,175,38,4,4]").append(System.lineSeparator());
        expected.append("[19499,19489,F+1,BBGHJLCCGHJLFAAIooFooIKMoDDDKMoEEooo,180,39,4,4]").append(System.lineSeparator());
        expected.append("[19567,19499,D-1,BBGHJLCCGHJLFAAIooFooIKMDDDoKMoEEooo,185,40,4,4]").append(System.lineSeparator());
        expected.append("[19787,19567,I-1,BBGHJLCCGHJLFAAoooFooIKMDDDIKMoEEooo,190,41,3,3]").append(System.lineSeparator());
        expected.append("[19797,19787,A+3,BBGHJLCCGHJLFoooAAFooIKMDDDIKMoEEooo,193,42,0,0]").append(System.lineSeparator());
        expected.append("TN: 19811").append(System.lineSeparator());
        expected.append("EN: 2126").append(System.lineSeparator());
        expected.append("CN: 13543").append(System.lineSeparator());
        expected.append("DF: 42");
        return expected.toString();
    }

    private String getExpectedAStar11() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,J-1,HBBCCCHDDKoMAAoKoMEEJFFMoIJoLooIGGLo,5,1,4,9]").append(System.lineSeparator());
        expected.append("[7,1,A+1,HBBCCCHDDKoMoAAKoMEEJFFMoIJoLooIGGLo,10,2,3,13]").append(System.lineSeparator());
        expected.append("[19,7,H-1,oBBCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,15,3,3,18]").append(System.lineSeparator());
        expected.append("[30,19,B-1,BBoCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,20,4,3,23]").append(System.lineSeparator());
        expected.append("[43,30,C-1,BBCCCoHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,25,5,3,28]").append(System.lineSeparator());
        expected.append("[55,43,M+1,BBCCCMHDDKoMHAAKoMEEJFFooIJoLooIGGLo,30,6,3,33]").append(System.lineSeparator());
        expected.append("[66,55,F+1,BBCCCMHDDKoMHAAKoMEEJoFFoIJoLooIGGLo,35,7,3,38]").append(System.lineSeparator());
        expected.append("[76,66,K-2,BBCCCMHDDooMHAAooMEEJKFFoIJKLooIGGLo,39,8,3,42]").append(System.lineSeparator());
        expected.append("[78,76,A+2,BBCCCMHDDooMHooAAMEEJKFFoIJKLooIGGLo,43,9,1,44]").append(System.lineSeparator());
        expected.append("[90,78,D+2,BBCCCMHooDDMHooAAMEEJKFFoIJKLooIGGLo,47,10,1,48]").append(System.lineSeparator());
        expected.append("[117,90,J+2,BBCCCMHoJDDMHoJAAMEEoKFFoIoKLooIGGLo,51,11,1,52]").append(System.lineSeparator());
        expected.append("[134,117,E+1,BBCCCMHoJDDMHoJAAMoEEKFFoIoKLooIGGLo,56,12,1,57]").append(System.lineSeparator());
        expected.append("[147,134,H-3,BBCCCMooJDDMooJAAMoEEKFFHIoKLoHIGGLo,59,13,1,60]").append(System.lineSeparator());
        expected.append("[148,147,E-1,BBCCCMooJDDMooJAAMEEoKFFHIoKLoHIGGLo,64,14,1,65]").append(System.lineSeparator());
        expected.append("[160,148,J-2,BBCCCMoooDDMoooAAMEEJKFFHIJKLoHIGGLo,68,15,1,69]").append(System.lineSeparator());
        expected.append("[166,160,D-3,BBCCCMDDoooMoooAAMEEJKFFHIJKLoHIGGLo,71,16,1,72]").append(System.lineSeparator());
        expected.append("[176,166,A-3,BBCCCMDDoooMAAoooMEEJKFFHIJKLoHIGGLo,74,17,4,78]").append(System.lineSeparator());
        expected.append("[255,176,J+2,BBCCCMDDJooMAAJooMEEoKFFHIoKLoHIGGLo,78,18,4,82]").append(System.lineSeparator());
        expected.append("[336,255,K+2,BBCCCMDDJKoMAAJKoMEEooFFHIooLoHIGGLo,82,19,4,86]").append(System.lineSeparator());
        expected.append("[431,336,F-2,BBCCCMDDJKoMAAJKoMEEFFooHIooLoHIGGLo,86,20,4,90]").append(System.lineSeparator());
        expected.append("[514,431,L+3,BBCCCMDDJKLMAAJKLMEEFFooHIooooHIGGoo,89,21,4,93]").append(System.lineSeparator());
        expected.append("[634,514,F+2,BBCCCMDDJKLMAAJKLMEEooFFHIooooHIGGoo,93,22,4,97]").append(System.lineSeparator());
        expected.append("[847,634,G+2,BBCCCMDDJKLMAAJKLMEEooFFHIooooHIooGG,97,23,4,101]").append(System.lineSeparator());
        expected.append("[1201,847,J-3,BBCCCMDDoKLMAAoKLMEEooFFHIJoooHIJoGG,100,24,4,104]").append(System.lineSeparator());
        expected.append("[1637,1201,K-3,BBCCCMDDooLMAAooLMEEooFFHIJKooHIJKGG,103,25,4,107]").append(System.lineSeparator());
        expected.append("[2275,1637,A+2,BBCCCMDDooLMooAALMEEooFFHIJKooHIJKGG,107,26,2,109]").append(System.lineSeparator());
        expected.append("[2805,2275,D+2,BBCCCMooDDLMooAALMEEooFFHIJKooHIJKGG,111,27,2,113]").append(System.lineSeparator());
        expected.append("[4451,2805,E+2,BBCCCMooDDLMooAALMooEEFFHIJKooHIJKGG,115,28,2,117]").append(System.lineSeparator());
        expected.append("[6613,4451,H+3,BBCCCMHoDDLMHoAALMooEEFFoIJKoooIJKGG,118,29,2,120]").append(System.lineSeparator());
        expected.append("[8480,6613,I+3,BBCCCMHIDDLMHIAALMooEEFFooJKooooJKGG,121,30,2,123]").append(System.lineSeparator());
        expected.append("[10829,8480,E-2,BBCCCMHIDDLMHIAALMEEooFFooJKooooJKGG,125,31,2,127]").append(System.lineSeparator());
        expected.append("[13859,10829,J+1,BBCCCMHIDDLMHIAALMEEJoFFooJKoooooKGG,130,32,2,132]").append(System.lineSeparator());
        expected.append("[16852,13859,K+1,BBCCCMHIDDLMHIAALMEEJKFFooJKooooooGG,135,33,2,137]").append(System.lineSeparator());
        expected.append("[19104,16852,G-4,BBCCCMHIDDLMHIAALMEEJKFFooJKooGGoooo,137,34,2,139]").append(System.lineSeparator());
        expected.append("[19962,19104,J-1,BBCCCMHIDDLMHIAALMEEoKFFooJKooGGJooo,142,35,2,144]").append(System.lineSeparator());
        expected.append("[21329,19962,K-1,BBCCCMHIDDLMHIAALMEEooFFooJKooGGJKoo,147,36,2,149]").append(System.lineSeparator());
        expected.append("[22397,21329,F-2,BBCCCMHIDDLMHIAALMEEFFooooJKooGGJKoo,151,37,2,153]").append(System.lineSeparator());
        expected.append("[23152,22397,L-3,BBCCCMHIDDoMHIAAoMEEFFooooJKLoGGJKLo,154,38,2,156]").append(System.lineSeparator());
        expected.append("[23574,23152,M-3,BBCCCoHIDDooHIAAooEEFFoMooJKLMGGJKLM,157,39,2,159]").append(System.lineSeparator());
        expected.append("[23912,23574,A+2,BBCCCoHIDDooHIooAAEEFFoMooJKLMGGJKLM,161,40,0,161]").append(System.lineSeparator());
        expected.append("TN: 24091").append(System.lineSeparator());
        expected.append("EN: 3078").append(System.lineSeparator());
        expected.append("CN: 20542").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }

    private String getExpectedGBF11() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,J-1,HBBCCCHDDKoMAAoKoMEEJFFMoIJoLooIGGLo,5,1,4,4]").append(System.lineSeparator());
        expected.append("[4,1,A+1,HBBCCCHDDKoMoAAKoMEEJFFMoIJoLooIGGLo,10,2,3,3]").append(System.lineSeparator());
        expected.append("[9,4,H-1,oBBCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,15,3,3,3]").append(System.lineSeparator());
        expected.append("[12,9,B-1,BBoCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,20,4,3,3]").append(System.lineSeparator());
        expected.append("[25,12,C-1,BBCCCoHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,25,5,3,3]").append(System.lineSeparator());
        expected.append("[37,25,M+1,BBCCCMHDDKoMHAAKoMEEJFFooIJoLooIGGLo,30,6,3,3]").append(System.lineSeparator());
        expected.append("[48,37,F+1,BBCCCMHDDKoMHAAKoMEEJoFFoIJoLooIGGLo,35,7,3,3]").append(System.lineSeparator());
        expected.append("[62,48,K-2,BBCCCMHDDooMHAAooMEEJKFFoIJKLooIGGLo,39,8,3,3]").append(System.lineSeparator());
        expected.append("[68,62,A+2,BBCCCMHDDooMHooAAMEEJKFFoIJKLooIGGLo,43,9,1,1]").append(System.lineSeparator());
        expected.append("[76,68,D+2,BBCCCMHooDDMHooAAMEEJKFFoIJKLooIGGLo,47,10,1,1]").append(System.lineSeparator());
        expected.append("[88,76,J+2,BBCCCMHoJDDMHoJAAMEEoKFFoIoKLooIGGLo,51,11,1,1]").append(System.lineSeparator());
        expected.append("[99,88,E+1,BBCCCMHoJDDMHoJAAMoEEKFFoIoKLooIGGLo,56,12,1,1]").append(System.lineSeparator());
        expected.append("[105,99,H-3,BBCCCMooJDDMooJAAMoEEKFFHIoKLoHIGGLo,59,13,1,1]").append(System.lineSeparator());
        expected.append("[112,105,E-1,BBCCCMooJDDMooJAAMEEoKFFHIoKLoHIGGLo,64,14,1,1]").append(System.lineSeparator());
        expected.append("[118,112,J-2,BBCCCMoooDDMoooAAMEEJKFFHIJKLoHIGGLo,68,15,1,1]").append(System.lineSeparator());
        expected.append("[129,118,D-3,BBCCCMDDoooMoooAAMEEJKFFHIJKLoHIGGLo,71,16,1,1]").append(System.lineSeparator());
        expected.append("[160,129,A-2,BBCCCMDDoooMoAAooMEEJKFFHIJKLoHIGGLo,75,17,3,3]").append(System.lineSeparator());
        expected.append("[258,160,K+2,BBCCCMDDoKoMoAAKoMEEJoFFHIJoLoHIGGLo,79,18,3,3]").append(System.lineSeparator());
        expected.append("[288,258,F-1,BBCCCMDDoKoMoAAKoMEEJFFoHIJoLoHIGGLo,84,19,3,3]").append(System.lineSeparator());
        expected.append("[300,288,M-1,BBCCCoDDoKoMoAAKoMEEJFFMHIJoLoHIGGLo,89,20,3,3]").append(System.lineSeparator());
        expected.append("[322,300,C+1,BBoCCCDDoKoMoAAKoMEEJFFMHIJoLoHIGGLo,94,21,3,3]").append(System.lineSeparator());
        expected.append("[357,322,A-1,BBoCCCDDoKoMAAoKoMEEJFFMHIJoLoHIGGLo,99,22,4,4]").append(System.lineSeparator());
        expected.append("[583,357,J+3,BBJCCCDDJKoMAAoKoMEEoFFMHIooLoHIGGLo,102,23,4,4]").append(System.lineSeparator());
        expected.append("[847,583,A+1,BBJCCCDDJKoMoAAKoMEEoFFMHIooLoHIGGLo,107,24,3,3]").append(System.lineSeparator());
        expected.append("[857,847,F-1,BBJCCCDDJKoMoAAKoMEEFFoMHIooLoHIGGLo,112,25,3,3]").append(System.lineSeparator());
        expected.append("[870,857,L+3,BBJCCCDDJKLMoAAKLMEEFFoMHIooooHIGGoo,115,26,3,3]").append(System.lineSeparator());
        expected.append("[921,870,F+1,BBJCCCDDJKLMoAAKLMEEoFFMHIooooHIGGoo,120,27,3,3]").append(System.lineSeparator());
        expected.append("[1017,921,A-1,BBJCCCDDJKLMAAoKLMEEoFFMHIooooHIGGoo,125,28,4,4]").append(System.lineSeparator());
        expected.append("[1673,1017,J-3,BBoCCCDDoKLMAAoKLMEEJFFMHIJoooHIGGoo,128,29,4,4]").append(System.lineSeparator());
        expected.append("[2322,1673,A+1,BBoCCCDDoKLMoAAKLMEEJFFMHIJoooHIGGoo,133,30,3,3]").append(System.lineSeparator());
        expected.append("[2335,2322,C-1,BBCCCoDDoKLMoAAKLMEEJFFMHIJoooHIGGoo,138,31,3,3]").append(System.lineSeparator());
        expected.append("[2353,2335,M+1,BBCCCMDDoKLMoAAKLMEEJFFoHIJoooHIGGoo,143,32,3,3]").append(System.lineSeparator());
        expected.append("[2458,2353,F+1,BBCCCMDDoKLMoAAKLMEEJoFFHIJoooHIGGoo,148,33,3,3]").append(System.lineSeparator());
        expected.append("[2729,2458,K-2,BBCCCMDDooLMoAAoLMEEJKFFHIJKooHIGGoo,152,34,3,3]").append(System.lineSeparator());
        expected.append("[3115,2729,A+1,BBCCCMDDooLMooAALMEEJKFFHIJKooHIGGoo,157,35,2,2]").append(System.lineSeparator());
        expected.append("[3126,3115,D+2,BBCCCMooDDLMooAALMEEJKFFHIJKooHIGGoo,161,36,2,2]").append(System.lineSeparator());
        expected.append("[3140,3126,G+2,BBCCCMooDDLMooAALMEEJKFFHIJKooHIooGG,165,37,2,2]").append(System.lineSeparator());
        expected.append("[3184,3140,J-1,BBCCCMooDDLMooAALMEEoKFFHIJKooHIJoGG,170,38,2,2]").append(System.lineSeparator());
        expected.append("[3244,3184,K-1,BBCCCMooDDLMooAALMEEooFFHIJKooHIJKGG,175,39,2,2]").append(System.lineSeparator());
        expected.append("[3348,3244,E+2,BBCCCMooDDLMooAALMooEEFFHIJKooHIJKGG,179,40,2,2]").append(System.lineSeparator());
        expected.append("[3616,3348,H+3,BBCCCMHoDDLMHoAALMooEEFFoIJKoooIJKGG,182,41,2,2]").append(System.lineSeparator());
        expected.append("[4315,3616,I+3,BBCCCMHIDDLMHIAALMooEEFFooJKooooJKGG,185,42,2,2]").append(System.lineSeparator());
        expected.append("[5185,4315,E-2,BBCCCMHIDDLMHIAALMEEooFFooJKooooJKGG,189,43,2,2]").append(System.lineSeparator());
        expected.append("[5853,5185,J+1,BBCCCMHIDDLMHIAALMEEJoFFooJKoooooKGG,194,44,2,2]").append(System.lineSeparator());
        expected.append("[6493,5853,K+1,BBCCCMHIDDLMHIAALMEEJKFFooJKooooooGG,199,45,2,2]").append(System.lineSeparator());
        expected.append("[7414,6493,G-4,BBCCCMHIDDLMHIAALMEEJKFFooJKooGGoooo,201,46,2,2]").append(System.lineSeparator());
        expected.append("[8176,7414,J-1,BBCCCMHIDDLMHIAALMEEoKFFooJKooGGJooo,206,47,2,2]").append(System.lineSeparator());
        expected.append("[8520,8176,K-1,BBCCCMHIDDLMHIAALMEEooFFooJKooGGJKoo,211,48,2,2]").append(System.lineSeparator());
        expected.append("[8577,8520,F-2,BBCCCMHIDDLMHIAALMEEFFooooJKooGGJKoo,215,49,2,2]").append(System.lineSeparator());
        expected.append("[8647,8577,L-2,BBCCCMHIDDoMHIAAoMEEFFLoooJKLoGGJKoo,219,50,2,2]").append(System.lineSeparator());
        expected.append("[8763,8647,A+1,BBCCCMHIDDoMHIoAAMEEFFLoooJKLoGGJKoo,224,51,1,1]").append(System.lineSeparator());
        expected.append("[8776,8763,M-3,BBCCCoHIDDooHIoAAoEEFFLMooJKLMGGJKoM,227,52,1,1]").append(System.lineSeparator());
        expected.append("[8806,8776,A+1,BBCCCoHIDDooHIooAAEEFFLMooJKLMGGJKoM,232,53,0,0]").append(System.lineSeparator());
        expected.append("TN: 8815").append(System.lineSeparator());
        expected.append("EN: 1215").append(System.lineSeparator());
        expected.append("CN: 5615").append(System.lineSeparator());
        expected.append("DF: 54");
        return expected.toString();
    }

    private String getExpectedAStar12() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,IoBBCCIoJDDLAAJooLoEEFFMGGGKoMHHoKoo,0,0,2,2]").append(System.lineSeparator());
        expected.append("[2,0,E-1,IoBBCCIoJDDLAAJooLEEoFFMGGGKoMHHoKoo,5,1,2,7]").append(System.lineSeparator());
        expected.append("[14,2,J-1,IoBBCCIooDDLAAJooLEEJFFMGGGKoMHHoKoo,10,2,2,12]").append(System.lineSeparator());
        expected.append("[62,14,D-2,IoBBCCIDDooLAAJooLEEJFFMGGGKoMHHoKoo,14,3,2,16]").append(System.lineSeparator());
        expected.append("[101,62,M-1,IoBBCCIDDooLAAJooLEEJFFoGGGKoMHHoKoM,19,4,2,21]").append(System.lineSeparator());
        expected.append("[306,101,F+1,IoBBCCIDDooLAAJooLEEJoFFGGGKoMHHoKoM,24,5,2,26]").append(System.lineSeparator());
        expected.append("[733,306,K+3,IoBBCCIDDKoLAAJKoLEEJoFFGGGooMHHoooM,27,6,3,30]").append(System.lineSeparator());
        expected.append("[1269,733,H+3,IoBBCCIDDKoLAAJKoLEEJoFFGGGooMoooHHM,30,7,3,33]").append(System.lineSeparator());
        expected.append("[1885,1269,B-1,IBBoCCIDDKoLAAJKoLEEJoFFGGGooMoooHHM,35,8,3,38]").append(System.lineSeparator());
        expected.append("[2804,1885,C-1,IBBCCoIDDKoLAAJKoLEEJoFFGGGooMoooHHM,40,9,3,43]").append(System.lineSeparator());
        expected.append("[3830,2804,L+1,IBBCCLIDDKoLAAJKooEEJoFFGGGooMoooHHM,45,10,2,47]").append(System.lineSeparator());
        expected.append("[4841,3830,F-1,IBBCCLIDDKoLAAJKooEEJFFoGGGooMoooHHM,50,11,2,52]").append(System.lineSeparator());
        expected.append("[5740,4841,M+2,IBBCCLIDDKoLAAJKoMEEJFFMGGGooooooHHo,54,12,3,57]").append(System.lineSeparator());
        expected.append("[6266,5740,G+3,IBBCCLIDDKoLAAJKoMEEJFFMoooGGGoooHHo,57,13,3,60]").append(System.lineSeparator());
        expected.append("[6512,6266,J-2,IBBCCLIDDKoLAAoKoMEEoFFMooJGGGooJHHo,61,14,2,63]").append(System.lineSeparator());
        expected.append("[6660,6512,A+1,IBBCCLIDDKoLoAAKoMEEoFFMooJGGGooJHHo,66,15,2,68]").append(System.lineSeparator());
        expected.append("[6739,6660,E+1,IBBCCLIDDKoLoAAKoMoEEFFMooJGGGooJHHo,71,16,2,73]").append(System.lineSeparator());
        expected.append("[6819,6739,I-4,oBBCCLoDDKoLoAAKoMoEEFFMIoJGGGIoJHHo,73,17,2,75]").append(System.lineSeparator());
        expected.append("[6884,6819,A-1,oBBCCLoDDKoLAAoKoMoEEFFMIoJGGGIoJHHo,78,18,2,80]").append(System.lineSeparator());
        expected.append("[7064,6884,B-1,BBoCCLoDDKoLAAoKoMoEEFFMIoJGGGIoJHHo,83,19,2,85]").append(System.lineSeparator());
        expected.append("[7319,7064,D-1,BBoCCLDDoKoLAAoKoMoEEFFMIoJGGGIoJHHo,88,20,2,90]").append(System.lineSeparator());
        expected.append("[7606,7319,E-1,BBoCCLDDoKoLAAoKoMEEoFFMIoJGGGIoJHHo,93,21,2,95]").append(System.lineSeparator());
        expected.append("[7966,7606,J+4,BBJCCLDDJKoLAAoKoMEEoFFMIooGGGIooHHo,95,22,2,97]").append(System.lineSeparator());
        expected.append("[8197,7966,A+1,BBJCCLDDJKoLoAAKoMEEoFFMIooGGGIooHHo,100,23,2,102]").append(System.lineSeparator());
        expected.append("[9065,8197,E+1,BBJCCLDDJKoLoAAKoMoEEFFMIooGGGIooHHo,105,24,2,107]").append(System.lineSeparator());
        expected.append("[10869,9065,I+2,BBJCCLDDJKoLIAAKoMIEEFFMoooGGGoooHHo,109,25,2,111]").append(System.lineSeparator());
        expected.append("[13791,10869,G-3,BBJCCLDDJKoLIAAKoMIEEFFMGGGooooooHHo,112,26,2,114]").append(System.lineSeparator());
        expected.append("[16852,13791,M-2,BBJCCLDDJKoLIAAKooIEEFFoGGGooMoooHHM,116,27,1,117]").append(System.lineSeparator());
        expected.append("[20807,16852,F+1,BBJCCLDDJKoLIAAKooIEEoFFGGGooMoooHHM,121,28,1,122]").append(System.lineSeparator());
        expected.append("[28794,20807,K-2,BBJCCLDDJooLIAAoooIEEKFFGGGKoMoooHHM,125,29,0,125]").append(System.lineSeparator());
        expected.append("[34360,28794,A+3,BBJCCLDDJooLIoooAAIEEKFFGGGKoMoooHHM,128,30,0,128]").append(System.lineSeparator());
        expected.append("TN: 39723").append(System.lineSeparator());
        expected.append("EN: 4134").append(System.lineSeparator());
        expected.append("CN: 27029").append(System.lineSeparator());
        expected.append("DF: 31");
        return expected.toString();
    }

    private String getExpectedAStar13() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oBBBKMCCoIKMAAoILoGDDJLoGoHJEEFFHooo,0,0,6,6]").append(System.lineSeparator());
        expected.append("[1,0,A+1,oBBBKMCCoIKMoAAILoGDDJLoGoHJEEFFHooo,5,1,5,10]").append(System.lineSeparator());
        expected.append("[9,1,C+1,oBBBKMoCCIKMoAAILoGDDJLoGoHJEEFFHooo,10,2,5,15]").append(System.lineSeparator());
        expected.append("[60,9,G+3,GBBBKMGCCIKMoAAILooDDJLoooHJEEFFHooo,13,3,5,18]").append(System.lineSeparator());
        expected.append("[188,60,D-1,GBBBKMGCCIKMoAAILoDDoJLoooHJEEFFHooo,18,4,5,23]").append(System.lineSeparator());
        expected.append("[541,188,H+1,GBBBKMGCCIKMoAAILoDDHJLoooHJEEFFoooo,23,5,5,28]").append(System.lineSeparator());
        expected.append("[1185,541,F+4,GBBBKMGCCIKMoAAILoDDHJLoooHJEEooooFF,25,6,5,30]").append(System.lineSeparator());
        expected.append("[1754,1185,H-1,GBBBKMGCCIKMoAAILoDDoJLoooHJEEooHoFF,30,7,5,35]").append(System.lineSeparator());
        expected.append("[2833,1754,D+1,GBBBKMGCCIKMoAAILooDDJLoooHJEEooHoFF,35,8,5,40]").append(System.lineSeparator());
        expected.append("[3976,2833,G-4,oBBBKMoCCIKMoAAILooDDJLoGoHJEEGoHoFF,37,9,5,42]").append(System.lineSeparator());
        expected.append("[4429,3976,D-1,oBBBKMoCCIKMoAAILoDDoJLoGoHJEEGoHoFF,42,10,5,47]").append(System.lineSeparator());
        expected.append("[5662,4429,A-1,oBBBKMoCCIKMAAoILoDDoJLoGoHJEEGoHoFF,47,11,6,53]").append(System.lineSeparator());
        expected.append("[7277,5662,H+2,oBBBKMoCCIKMAAHILoDDHJLoGooJEEGoooFF,51,12,7,58]").append(System.lineSeparator());
        expected.append("[9631,7277,F-3,oBBBKMoCCIKMAAHILoDDHJLoGooJEEGFFooo,54,13,7,61]").append(System.lineSeparator());
        expected.append("[11315,9631,B-1,BBBoKMoCCIKMAAHILoDDHJLoGooJEEGFFooo,59,14,7,66]").append(System.lineSeparator());
        expected.append("[14429,11315,I+1,BBBIKMoCCIKMAAHoLoDDHJLoGooJEEGFFooo,64,15,6,70]").append(System.lineSeparator());
        expected.append("[17091,14429,J+1,BBBIKMoCCIKMAAHJLoDDHJLoGoooEEGFFooo,69,16,7,76]").append(System.lineSeparator());
        expected.append("[20290,17091,E-3,BBBIKMoCCIKMAAHJLoDDHJLoGEEoooGFFooo,72,17,7,79]").append(System.lineSeparator());
        expected.append("[21781,20290,M-4,BBBIKooCCIKoAAHJLoDDHJLoGEEooMGFFooM,74,18,7,81]").append(System.lineSeparator());
        expected.append("[23053,21781,J-2,BBBIKooCCIKoAAHoLoDDHoLoGEEJoMGFFJoM,78,19,6,84]").append(System.lineSeparator());
        expected.append("[24746,23053,L-2,BBBIKooCCIKoAAHoooDDHoooGEEJLMGFFJLM,82,20,5,87]").append(System.lineSeparator());
        expected.append("[27219,24746,I-2,BBBoKooCCoKoAAHIooDDHIooGEEJLMGFFJLM,86,21,6,92]").append(System.lineSeparator());
        expected.append("[32771,27219,K-2,BBBooooCCoooAAHIKoDDHIKoGEEJLMGFFJLM,90,22,7,97]").append(System.lineSeparator());
        expected.append("[41079,32771,B+3,oooBBBoCCoooAAHIKoDDHIKoGEEJLMGFFJLM,93,23,7,100]").append(System.lineSeparator());
        expected.append("[47650,41079,C+3,oooBBBooooCCAAHIKoDDHIKoGEEJLMGFFJLM,96,24,7,103]").append(System.lineSeparator());
        expected.append("[54973,47650,H+2,ooHBBBooHoCCAAoIKoDDoIKoGEEJLMGFFJLM,100,25,6,106]").append(System.lineSeparator());
        expected.append("[62902,54973,A+1,ooHBBBooHoCCoAAIKoDDoIKoGEEJLMGFFJLM,105,26,5,110]").append(System.lineSeparator());
        expected.append("[74278,62902,D+1,ooHBBBooHoCCoAAIKooDDIKoGEEJLMGFFJLM,110,27,5,115]").append(System.lineSeparator());
        expected.append("[86337,74278,G+4,GoHBBBGoHoCCoAAIKooDDIKooEEJLMoFFJLM,112,28,5,117]").append(System.lineSeparator());
        expected.append("[91086,86337,D-1,GoHBBBGoHoCCoAAIKoDDoIKooEEJLMoFFJLM,117,29,5,122]").append(System.lineSeparator());
        expected.append("[100194,91086,E-1,GoHBBBGoHoCCoAAIKoDDoIKoEEoJLMoFFJLM,122,30,5,127]").append(System.lineSeparator());
        expected.append("[106584,100194,A-1,GoHBBBGoHoCCAAoIKoDDoIKoEEoJLMoFFJLM,127,31,6,133]").append(System.lineSeparator());
        expected.append("[111582,106584,H-3,GooBBBGoooCCAAoIKoDDHIKoEEHJLMoFFJLM,130,32,6,136]").append(System.lineSeparator());
        expected.append("[113697,111582,C-3,GooBBBGCCoooAAoIKoDDHIKoEEHJLMoFFJLM,133,33,6,139]").append(System.lineSeparator());
        expected.append("[115157,113697,A+1,GooBBBGCCooooAAIKoDDHIKoEEHJLMoFFJLM,138,34,5,143]").append(System.lineSeparator());
        expected.append("[117512,115157,G-1,oooBBBGCCoooGAAIKoDDHIKoEEHJLMoFFJLM,143,35,5,148]").append(System.lineSeparator());
        expected.append("[122461,117512,B-3,BBBoooGCCoooGAAIKoDDHIKoEEHJLMoFFJLM,146,36,5,151]").append(System.lineSeparator());
        expected.append("[127872,122461,I+2,BBBIooGCCIooGAAoKoDDHoKoEEHJLMoFFJLM,150,37,4,154]").append(System.lineSeparator());
        expected.append("[134362,127872,K+2,BBBIKoGCCIKoGAAoooDDHoooEEHJLMoFFJLM,154,38,3,157]").append(System.lineSeparator());
        expected.append("[142055,134362,A+3,BBBIKoGCCIKoGoooAADDHoooEEHJLMoFFJLM,157,39,0,157]").append(System.lineSeparator());
        expected.append("TN: 142104").append(System.lineSeparator());
        expected.append("EN: 13330").append(System.lineSeparator());
        expected.append("CN: 117496").append(System.lineSeparator());
        expected.append("DF: 39");
        return expected.toString();
    }

    private String getExpectedAStar14() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,EBBBIKEoFGIKAAFGJKoCCHJooooHDDoooooo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[1,0,C-1,EBBBIKEoFGIKAAFGJKCCoHJooooHDDoooooo,5,1,4,9]").append(System.lineSeparator());
        expected.append("[7,1,F-3,EBBBIKEooGIKAAoGJKCCoHJoooFHDDooFooo,8,2,3,11]").append(System.lineSeparator());
        expected.append("[18,7,A+1,EBBBIKEooGIKoAAGJKCCoHJoooFHDDooFooo,13,3,3,16]").append(System.lineSeparator());
        expected.append("[62,18,C+1,EBBBIKEooGIKoAAGJKoCCHJoooFHDDooFooo,18,4,3,21]").append(System.lineSeparator());
        expected.append("[145,62,E-4,oBBBIKoooGIKoAAGJKoCCHJoEoFHDDEoFooo,20,5,3,23]").append(System.lineSeparator());
        expected.append("[224,145,B-1,BBBoIKoooGIKoAAGJKoCCHJoEoFHDDEoFooo,25,6,3,28]").append(System.lineSeparator());
        expected.append("[407,224,G+1,BBBGIKoooGIKoAAoJKoCCHJoEoFHDDEoFooo,30,7,2,32]").append(System.lineSeparator());
        expected.append("[681,407,A-1,BBBGIKoooGIKAAooJKoCCHJoEoFHDDEoFooo,35,8,2,37]").append(System.lineSeparator());
        expected.append("[1149,681,C-1,BBBGIKoooGIKAAooJKCCoHJoEoFHDDEoFooo,40,9,2,42]").append(System.lineSeparator());
        expected.append("[1804,1149,F+3,BBBGIKooFGIKAAFoJKCCoHJoEooHDDEooooo,43,10,3,46]").append(System.lineSeparator());
        expected.append("[2455,1804,H+1,BBBGIKooFGIKAAFHJKCCoHJoEoooDDEooooo,48,11,4,52]").append(System.lineSeparator());
        expected.append("[2990,2455,D-3,BBBGIKooFGIKAAFHJKCCoHJoEDDoooEooooo,51,12,4,55]").append(System.lineSeparator());
        expected.append("[3246,2990,K-3,BBBGIoooFGIoAAFHJoCCoHJKEDDooKEooooK,54,13,3,57]").append(System.lineSeparator());
        expected.append("[3354,3246,H-2,BBBGIoooFGIoAAFoJoCCooJKEDDHoKEooHoK,58,14,2,60]").append(System.lineSeparator());
        expected.append("[3686,3354,J-2,BBBGIoooFGIoAAFoooCCoooKEDDHJKEooHJK,62,15,1,63]").append(System.lineSeparator());
        expected.append("[4199,3686,C+3,BBBGIoooFGIoAAFooooooCCKEDDHJKEooHJK,65,16,1,66]").append(System.lineSeparator());
        expected.append("[5010,4199,G-1,BBBoIoooFGIoAAFGoooooCCKEDDHJKEooHJK,70,17,2,72]").append(System.lineSeparator());
        expected.append("[7496,5010,I-1,BBBoooooFGIoAAFGIooooCCKEDDHJKEooHJK,75,18,3,78]").append(System.lineSeparator());
        expected.append("[11221,7496,B+3,oooBBBooFGIoAAFGIooooCCKEDDHJKEooHJK,78,19,3,81]").append(System.lineSeparator());
        expected.append("[14494,11221,F+1,ooFBBBooFGIoAAoGIooooCCKEDDHJKEooHJK,83,20,2,85]").append(System.lineSeparator());
        expected.append("[17693,14494,A+1,ooFBBBooFGIooAAGIooooCCKEDDHJKEooHJK,88,21,2,90]").append(System.lineSeparator());
        expected.append("[20382,17693,E+4,EoFBBBEoFGIooAAGIooooCCKoDDHJKoooHJK,90,22,2,92]").append(System.lineSeparator());
        expected.append("[21157,20382,A-1,EoFBBBEoFGIoAAoGIooooCCKoDDHJKoooHJK,95,23,2,97]").append(System.lineSeparator());
        expected.append("[22763,21157,D-1,EoFBBBEoFGIoAAoGIooooCCKDDoHJKoooHJK,100,24,2,102]").append(System.lineSeparator());
        expected.append("[24789,22763,F-4,EooBBBEooGIoAAoGIooooCCKDDFHJKooFHJK,102,25,2,104]").append(System.lineSeparator());
        expected.append("[25853,24789,A+1,EooBBBEooGIooAAGIooooCCKDDFHJKooFHJK,107,26,2,109]").append(System.lineSeparator());
        expected.append("[27620,25853,E-2,oooBBBoooGIoEAAGIoEooCCKDDFHJKooFHJK,111,27,2,113]").append(System.lineSeparator());
        expected.append("[30753,27620,B-3,BBBooooooGIoEAAGIoEooCCKDDFHJKooFHJK,114,28,2,116]").append(System.lineSeparator());
        expected.append("[34814,30753,G+1,BBBGoooooGIoEAAoIoEooCCKDDFHJKooFHJK,119,29,1,120]").append(System.lineSeparator());
        expected.append("[41189,34814,I+1,BBBGIooooGIoEAAoooEooCCKDDFHJKooFHJK,124,30,0,124]").append(System.lineSeparator());
        expected.append("[47864,41189,A+3,BBBGIooooGIoEoooAAEooCCKDDFHJKooFHJK,127,31,0,127]").append(System.lineSeparator());
        expected.append("TN: 53215").append(System.lineSeparator());
        expected.append("EN: 5168").append(System.lineSeparator());
        expected.append("CN: 40146").append(System.lineSeparator());
        expected.append("DF: 31");
        return expected.toString();
    }

    private String getExpectedAStar15() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBKooHJoKCCHJAALoHDDoLMIEEoLMIFFGGM,0,0,3,3]").append(System.lineSeparator());
        expected.append("[1,0,D+1,BBBKooHJoKCCHJAALoHoDDLMIEEoLMIFFGGM,5,1,3,8]").append(System.lineSeparator());
        expected.append("[5,1,E+1,BBBKooHJoKCCHJAALoHoDDLMIoEELMIFFGGM,10,2,3,13]").append(System.lineSeparator());
        expected.append("[19,5,M+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIFFGGo,15,3,4,19]").append(System.lineSeparator());
        expected.append("[46,19,G+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIFFoGG,20,4,4,24]").append(System.lineSeparator());
        expected.append("[81,46,F+1,BBBKooHJoKCCHJAALMHoDDLMIoEELMIoFFGG,25,5,4,29]").append(System.lineSeparator());
        expected.append("[120,81,J-3,BBBKooHooKCCHoAALMHoDDLMIJEELMIJFFGG,28,6,4,32]").append(System.lineSeparator());
        expected.append("[130,120,D-1,BBBKooHooKCCHoAALMHDDoLMIJEELMIJFFGG,33,7,4,37]").append(System.lineSeparator());
        expected.append("[169,130,A-1,BBBKooHooKCCHAAoLMHDDoLMIJEELMIJFFGG,38,8,5,43]").append(System.lineSeparator());
        expected.append("[227,169,K-2,BBBoooHoooCCHAAKLMHDDKLMIJEELMIJFFGG,42,9,6,48]").append(System.lineSeparator());
        expected.append("[308,227,C-3,BBBoooHCCoooHAAKLMHDDKLMIJEELMIJFFGG,45,10,6,51]").append(System.lineSeparator());
        expected.append("[396,308,K+2,BBBKooHCCKooHAAoLMHDDoLMIJEELMIJFFGG,49,11,5,54]").append(System.lineSeparator());
        expected.append("[540,396,L+2,BBBKLoHCCKLoHAAoLMHDDooMIJEEoMIJFFGG,53,12,5,58]").append(System.lineSeparator());
        expected.append("[848,540,M+2,BBBKLMHCCKLMHAAoLMHDDoooIJEEooIJFFGG,57,13,5,62]").append(System.lineSeparator());
        expected.append("[1463,848,D+3,BBBKLMHCCKLMHAAoLMHoooDDIJEEooIJFFGG,60,14,5,65]").append(System.lineSeparator());
        expected.append("[2179,1463,E+2,BBBKLMHCCKLMHAAoLMHoooDDIJooEEIJFFGG,64,15,5,69]").append(System.lineSeparator());
        expected.append("[3462,2179,K-3,BBBoLMHCCoLMHAAoLMHooKDDIJoKEEIJFFGG,67,16,5,72]").append(System.lineSeparator());
        expected.append("[4961,3462,A+1,BBBoLMHCCoLMHoAALMHooKDDIJoKEEIJFFGG,72,17,4,76]").append(System.lineSeparator());
        expected.append("[7379,4961,C+1,BBBoLMHoCCLMHoAALMHooKDDIJoKEEIJFFGG,77,18,4,81]").append(System.lineSeparator());
        expected.append("[10603,7379,J+3,BBBoLMHJCCLMHJAALMHooKDDIooKEEIoFFGG,80,19,4,84]").append(System.lineSeparator());
        expected.append("[12445,10603,F-1,BBBoLMHJCCLMHJAALMHooKDDIooKEEIFFoGG,85,20,4,89]").append(System.lineSeparator());
        expected.append("[15297,12445,K-1,BBBoLMHJCCLMHJAALMHoooDDIooKEEIFFKGG,90,21,4,94]").append(System.lineSeparator());
        expected.append("[17535,15297,D-3,BBBoLMHJCCLMHJAALMHDDoooIooKEEIFFKGG,93,22,4,97]").append(System.lineSeparator());
        expected.append("[18788,17535,L-1,BBBooMHJCCLMHJAALMHDDoLoIooKEEIFFKGG,98,23,4,102]").append(System.lineSeparator());
        expected.append("[20542,18788,B+2,ooBBBMHJCCLMHJAALMHDDoLoIooKEEIFFKGG,102,24,4,106]").append(System.lineSeparator());
        expected.append("[21631,20542,J+1,oJBBBMHJCCLMHoAALMHDDoLoIooKEEIFFKGG,107,25,4,111]").append(System.lineSeparator());
        expected.append("[22318,21631,A-1,oJBBBMHJCCLMHAAoLMHDDoLoIooKEEIFFKGG,112,26,5,117]").append(System.lineSeparator());
        expected.append("[23090,22318,K+2,oJBBBMHJCCLMHAAKLMHDDKLoIoooEEIFFoGG,116,27,6,122]").append(System.lineSeparator());
        expected.append("[23790,23090,E-3,oJBBBMHJCCLMHAAKLMHDDKLoIEEoooIFFoGG,119,28,6,125]").append(System.lineSeparator());
        expected.append("[24101,23790,H+1,HJBBBMHJCCLMHAAKLMoDDKLoIEEoooIFFoGG,124,29,6,130]").append(System.lineSeparator());
        expected.append("[24688,24101,I+1,HJBBBMHJCCLMHAAKLMIDDKLoIEEooooFFoGG,129,30,6,135]").append(System.lineSeparator());
        expected.append("[25660,24688,F-1,HJBBBMHJCCLMHAAKLMIDDKLoIEEoooFFooGG,134,31,6,140]").append(System.lineSeparator());
        expected.append("[27525,25660,G-2,HJBBBMHJCCLMHAAKLMIDDKLoIEEoooFFGGoo,138,32,6,144]").append(System.lineSeparator());
        expected.append("[30408,27525,M-3,HJBBBoHJCCLoHAAKLoIDDKLMIEEooMFFGGoM,141,33,5,146]").append(System.lineSeparator());
        expected.append("[32082,30408,L-2,HJBBBoHJCCooHAAKooIDDKLMIEEoLMFFGGLM,145,34,4,149]").append(System.lineSeparator());
        expected.append("[35011,32082,K-1,HJBBBoHJCCooHAAoooIDDKLMIEEKLMFFGGLM,150,35,3,153]").append(System.lineSeparator());
        expected.append("[39633,35011,A+3,HJBBBoHJCCooHoooAAIDDKLMIEEKLMFFGGLM,153,36,0,153]").append(System.lineSeparator());
        expected.append("TN: 39658").append(System.lineSeparator());
        expected.append("EN: 4576").append(System.lineSeparator());
        expected.append("CN: 29739").append(System.lineSeparator());
        expected.append("DF: 36");
        return expected.toString();
    }

    private String getExpectedAStar16() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,FBBBJKFooHJKAAGHoKCCGIoooooIDDEEEooo,0,0,3,3]").append(System.lineSeparator());
        expected.append("[4,0,G+1,FBBBJKFoGHJKAAGHoKCCoIoooooIDDEEEooo,5,1,3,8]").append(System.lineSeparator());
        expected.append("[51,4,I-1,FBBBJKFoGHJKAAGHoKCCoooooooIDDEEEIoo,10,2,3,13]").append(System.lineSeparator());
        expected.append("[287,51,C+4,FBBBJKFoGHJKAAGHoKooooCCoooIDDEEEIoo,12,3,3,15]").append(System.lineSeparator());
        expected.append("[478,287,G-2,FBBBJKFooHJKAAoHoKooGoCCooGIDDEEEIoo,16,4,2,18]").append(System.lineSeparator());
        expected.append("[1033,478,A+1,FBBBJKFooHJKoAAHoKooGoCCooGIDDEEEIoo,21,5,2,23]").append(System.lineSeparator());
        expected.append("[2213,1033,F-3,oBBBJKoooHJKoAAHoKFoGoCCFoGIDDEEEIoo,24,6,2,26]").append(System.lineSeparator());
        expected.append("[3067,2213,A-1,oBBBJKoooHJKAAoHoKFoGoCCFoGIDDEEEIoo,29,7,2,31]").append(System.lineSeparator());
        expected.append("[4971,3067,G+2,oBBBJKooGHJKAAGHoKFoooCCFooIDDEEEIoo,33,8,3,36]").append(System.lineSeparator());
        expected.append("[7311,4971,C-3,oBBBJKooGHJKAAGHoKFCCoooFooIDDEEEIoo,36,9,3,39]").append(System.lineSeparator());
        expected.append("[9105,7311,B-1,BBBoJKooGHJKAAGHoKFCCoooFooIDDEEEIoo,41,10,3,44]").append(System.lineSeparator());
        expected.append("[12204,9105,H+1,BBBHJKooGHJKAAGooKFCCoooFooIDDEEEIoo,46,11,2,48]").append(System.lineSeparator());
        expected.append("[15646,12204,I+2,BBBHJKooGHJKAAGIoKFCCIooFoooDDEEEooo,50,12,3,53]").append(System.lineSeparator());
        expected.append("[19953,15646,D-3,BBBHJKooGHJKAAGIoKFCCIooFDDoooEEEooo,53,13,3,56]").append(System.lineSeparator());
        expected.append("[22412,19953,J-4,BBBHoKooGHoKAAGIoKFCCIooFDDoJoEEEoJo,55,14,3,58]").append(System.lineSeparator());
        expected.append("[23368,22412,K-3,BBBHooooGHooAAGIooFCCIoKFDDoJKEEEoJK,58,15,2,60]").append(System.lineSeparator());
        expected.append("[24738,23368,I-2,BBBHooooGHooAAGoooFCCooKFDDIJKEEEIJK,62,16,1,63]").append(System.lineSeparator());
        expected.append("[27385,24738,H-1,BBBoooooGHooAAGHooFCCooKFDDIJKEEEIJK,67,17,2,69]").append(System.lineSeparator());
        expected.append("[34090,27385,B+3,oooBBBooGHooAAGHooFCCooKFDDIJKEEEIJK,70,18,2,72]").append(System.lineSeparator());
        expected.append("[37509,34090,G+1,ooGBBBooGHooAAoHooFCCooKFDDIJKEEEIJK,75,19,1,76]").append(System.lineSeparator());
        expected.append("[41320,37509,A+1,ooGBBBooGHoooAAHooFCCooKFDDIJKEEEIJK,80,20,1,81]").append(System.lineSeparator());
        expected.append("[46760,41320,F+3,FoGBBBFoGHoooAAHoooCCooKoDDIJKEEEIJK,83,21,1,84]").append(System.lineSeparator());
        expected.append("[49455,46760,C+2,FoGBBBFoGHoooAAHoooooCCKoDDIJKEEEIJK,87,22,1,88]").append(System.lineSeparator());
        expected.append("[51457,49455,A-1,FoGBBBFoGHooAAoHoooooCCKoDDIJKEEEIJK,92,23,1,93]").append(System.lineSeparator());
        expected.append("[55376,51457,D-1,FoGBBBFoGHooAAoHoooooCCKDDoIJKEEEIJK,97,24,1,98]").append(System.lineSeparator());
        expected.append("[59939,55376,G-3,FooBBBFooHooAAoHooooGCCKDDGIJKEEEIJK,100,25,1,101]").append(System.lineSeparator());
        expected.append("[63230,59939,A+1,FooBBBFooHoooAAHooooGCCKDDGIJKEEEIJK,105,26,1,106]").append(System.lineSeparator());
        expected.append("[69876,63230,F-2,oooBBBoooHooFAAHooFoGCCKDDGIJKEEEIJK,109,27,1,110]").append(System.lineSeparator());
        expected.append("[78692,69876,B-3,BBBooooooHooFAAHooFoGCCKDDGIJKEEEIJK,112,28,1,113]").append(System.lineSeparator());
        expected.append("[85478,78692,H+1,BBBHoooooHooFAAoooFoGCCKDDGIJKEEEIJK,117,29,0,117]").append(System.lineSeparator());
        expected.append("[91847,85478,A+3,BBBHoooooHooFoooAAFoGCCKDDGIJKEEEIJK,120,30,0,120]").append(System.lineSeparator());
        expected.append("TN: 95692").append(System.lineSeparator());
        expected.append("EN: 8971").append(System.lineSeparator());
        expected.append("CN: 80770").append(System.lineSeparator());
        expected.append("DF: 31");
        return expected.toString();
    }

    private String getExpectedAStar17() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBHooKFGHoJKFGAAJLFCCIoLoooIDDEEEIoo,0,0,4,4]").append(System.lineSeparator());
        expected.append("[2,0,J+1,BBHoJKFGHoJKFGAAoLFCCIoLoooIDDEEEIoo,5,1,3,8]").append(System.lineSeparator());
        expected.append("[4,2,A+1,BBHoJKFGHoJKFGoAALFCCIoLoooIDDEEEIoo,10,2,2,12]").append(System.lineSeparator());
        expected.append("[16,4,H-1,BBooJKFGHoJKFGHAALFCCIoLoooIDDEEEIoo,15,3,2,17]").append(System.lineSeparator());
        expected.append("[28,16,B+2,ooBBJKFGHoJKFGHAALFCCIoLoooIDDEEEIoo,19,4,2,21]").append(System.lineSeparator());
        expected.append("[33,28,F+1,FoBBJKFGHoJKFGHAALoCCIoLoooIDDEEEIoo,24,5,2,26]").append(System.lineSeparator());
        expected.append("[45,33,C-1,FoBBJKFGHoJKFGHAALCCoIoLoooIDDEEEIoo,29,6,2,31]").append(System.lineSeparator());
        expected.append("[69,45,H-2,FoBBJKFGooJKFGoAALCCHIoLooHIDDEEEIoo,33,7,2,35]").append(System.lineSeparator());
        expected.append("[83,69,G+1,FGBBJKFGooJKFooAALCCHIoLooHIDDEEEIoo,38,8,2,40]").append(System.lineSeparator());
        expected.append("[102,83,A-2,FGBBJKFGooJKFAAooLCCHIoLooHIDDEEEIoo,42,9,4,46]").append(System.lineSeparator());
        expected.append("[126,102,I+2,FGBBJKFGoIJKFAAIoLCCHIoLooHoDDEEEooo,46,10,5,51]").append(System.lineSeparator());
        expected.append("[155,126,E+3,FGBBJKFGoIJKFAAIoLCCHIoLooHoDDoooEEE,49,11,5,54]").append(System.lineSeparator());
        expected.append("[192,155,D-1,FGBBJKFGoIJKFAAIoLCCHIoLooHDDooooEEE,54,12,5,59]").append(System.lineSeparator());
        expected.append("[300,192,L-1,FGBBJKFGoIJKFAAIooCCHIoLooHDDLoooEEE,59,13,4,63]").append(System.lineSeparator());
        expected.append("[490,300,J-1,FGBBoKFGoIJKFAAIJoCCHIoLooHDDLoooEEE,64,14,5,69]").append(System.lineSeparator());
        expected.append("[840,490,K-1,FGBBooFGoIJKFAAIJKCCHIoLooHDDLoooEEE,69,15,6,75]").append(System.lineSeparator());
        expected.append("[1441,840,B+2,FGooBBFGoIJKFAAIJKCCHIoLooHDDLoooEEE,73,16,6,79]").append(System.lineSeparator());
        expected.append("[1986,1441,H-1,FGooBBFGoIJKFAAIJKCCoIoLooHDDLooHEEE,78,17,6,84]").append(System.lineSeparator());
        expected.append("[2395,1986,I+1,FGoIBBFGoIJKFAAIJKCCoooLooHDDLooHEEE,83,18,6,89]").append(System.lineSeparator());
        expected.append("[2608,2395,C+3,FGoIBBFGoIJKFAAIJKoooCCLooHDDLooHEEE,86,19,6,92]").append(System.lineSeparator());
        expected.append("[2675,2608,F-3,oGoIBBoGoIJKoAAIJKFooCCLFoHDDLFoHEEE,89,20,6,95]").append(System.lineSeparator());
        expected.append("[2779,2675,A-1,oGoIBBoGoIJKAAoIJKFooCCLFoHDDLFoHEEE,94,21,7,101]").append(System.lineSeparator());
        expected.append("[2917,2779,H+4,oGHIBBoGHIJKAAoIJKFooCCLFooDDLFooEEE,96,22,7,103]").append(System.lineSeparator());
        expected.append("[2959,2917,A+1,oGHIBBoGHIJKoAAIJKFooCCLFooDDLFooEEE,101,23,6,107]").append(System.lineSeparator());
        expected.append("[3081,2959,F+3,FGHIBBFGHIJKFAAIJKoooCCLoooDDLoooEEE,104,24,6,110]").append(System.lineSeparator());
        expected.append("[3266,3081,C-3,FGHIBBFGHIJKFAAIJKCCoooLoooDDLoooEEE,107,25,6,113]").append(System.lineSeparator());
        expected.append("[3643,3266,D-3,FGHIBBFGHIJKFAAIJKCCoooLDDoooLoooEEE,110,26,6,116]").append(System.lineSeparator());
        expected.append("[4497,3643,E-3,FGHIBBFGHIJKFAAIJKCCoooLDDoooLEEEooo,113,27,6,119]").append(System.lineSeparator());
        expected.append("[5928,4497,I-3,FGHoBBFGHoJKFAAoJKCCoIoLDDoIoLEEEIoo,116,28,5,121]").append(System.lineSeparator());
        expected.append("[7719,5928,J-3,FGHoBBFGHooKFAAooKCCoIoLDDoIJLEEEIJo,119,29,4,123]").append(System.lineSeparator());
        expected.append("[10031,7719,B-1,FGHBBoFGHooKFAAooKCCoIoLDDoIJLEEEIJo,124,30,4,128]").append(System.lineSeparator());
        expected.append("[19834,10031,K+1,FGHBBKFGHooKFAAoooCCoIoLDDoIJLEEEIJo,129,31,3,132]").append(System.lineSeparator());
        expected.append("[32372,19834,A+3,FGHBBKFGHooKFoooAACCoIoLDDoIJLEEEIJo,132,32,0,132]").append(System.lineSeparator());
        expected.append("TN: 32510").append(System.lineSeparator());
        expected.append("EN: 3013").append(System.lineSeparator());
        expected.append("CN: 15816").append(System.lineSeparator());
        expected.append("DF: 33");
        return expected.toString();
    }

    private String getExpectedAStar18() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBBIKLCCoIKLAAoJKMGDDJoMGoHEEMFFHooo,0,0,3,3]").append(System.lineSeparator());
        expected.append("[1,0,A+1,BBBIKLCCoIKLoAAJKMGDDJoMGoHEEMFFHooo,5,1,3,8]").append(System.lineSeparator());
        expected.append("[11,1,C+1,BBBIKLoCCIKLoAAJKMGDDJoMGoHEEMFFHooo,10,2,3,13]").append(System.lineSeparator());
        expected.append("[46,11,G+2,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMFFHooo,14,3,3,17]").append(System.lineSeparator());
        expected.append("[85,46,D-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMFFHooo,19,4,3,22]").append(System.lineSeparator());
        expected.append("[143,85,H+1,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMFFoooo,24,5,3,27]").append(System.lineSeparator());
        expected.append("[200,143,F+4,BBBIKLGCCIKLGAAJKMDDHJoMooHEEMooooFF,26,6,3,29]").append(System.lineSeparator());
        expected.append("[227,200,H-1,BBBIKLGCCIKLGAAJKMDDoJoMooHEEMooHoFF,31,7,3,34]").append(System.lineSeparator());
        expected.append("[281,227,D+1,BBBIKLGCCIKLGAAJKMoDDJoMooHEEMooHoFF,36,8,3,39]").append(System.lineSeparator());
        expected.append("[355,281,G-3,BBBIKLoCCIKLoAAJKMoDDJoMGoHEEMGoHoFF,39,9,3,42]").append(System.lineSeparator());
        expected.append("[419,355,A-1,BBBIKLoCCIKLAAoJKMoDDJoMGoHEEMGoHoFF,44,10,3,47]").append(System.lineSeparator());
        expected.append("[511,419,D-1,BBBIKLoCCIKLAAoJKMDDoJoMGoHEEMGoHoFF,49,11,3,52]").append(System.lineSeparator());
        expected.append("[682,511,H+2,BBBIKLoCCIKLAAHJKMDDHJoMGooEEMGoooFF,53,12,4,57]").append(System.lineSeparator());
        expected.append("[947,682,F-3,BBBIKLoCCIKLAAHJKMDDHJoMGooEEMGFFooo,56,13,4,60]").append(System.lineSeparator());
        expected.append("[1226,947,E-2,BBBIKLoCCIKLAAHJKMDDHJoMGEEooMGFFooo,60,14,4,64]").append(System.lineSeparator());
        expected.append("[1595,1226,K-3,BBBIoLoCCIoLAAHJoMDDHJKMGEEoKMGFFoKo,63,15,3,66]").append(System.lineSeparator());
        expected.append("[1936,1595,J-2,BBBIoLoCCIoLAAHooMDDHoKMGEEJKMGFFJKo,67,16,2,69]").append(System.lineSeparator());
        expected.append("[2539,1936,M-1,BBBIoLoCCIoLAAHoooDDHoKMGEEJKMGFFJKM,72,17,1,73]").append(System.lineSeparator());
        expected.append("[3834,2539,I-2,BBBooLoCCooLAAHIooDDHIKMGEEJKMGFFJKM,76,18,2,78]").append(System.lineSeparator());
        expected.append("[6251,3834,L-1,BBBooooCCooLAAHIoLDDHIKMGEEJKMGFFJKM,81,19,3,84]").append(System.lineSeparator());
        expected.append("[10179,6251,B+3,oooBBBoCCooLAAHIoLDDHIKMGEEJKMGFFJKM,84,20,3,87]").append(System.lineSeparator());
        expected.append("[13228,10179,C+2,oooBBBoooCCLAAHIoLDDHIKMGEEJKMGFFJKM,88,21,3,91]").append(System.lineSeparator());
        expected.append("[16398,13228,H+2,ooHBBBooHCCLAAoIoLDDoIKMGEEJKMGFFJKM,92,22,2,94]").append(System.lineSeparator());
        expected.append("[18605,16398,A+1,ooHBBBooHCCLoAAIoLDDoIKMGEEJKMGFFJKM,97,23,2,99]").append(System.lineSeparator());
        expected.append("[21462,18605,D+1,ooHBBBooHCCLoAAIoLoDDIKMGEEJKMGFFJKM,102,24,2,104]").append(System.lineSeparator());
        expected.append("[23165,21462,G+4,GoHBBBGoHCCLoAAIoLoDDIKMoEEJKMoFFJKM,104,25,2,106]").append(System.lineSeparator());
        expected.append("[23758,23165,A-1,GoHBBBGoHCCLAAoIoLoDDIKMoEEJKMoFFJKM,109,26,2,111]").append(System.lineSeparator());
        expected.append("[24432,23758,D-1,GoHBBBGoHCCLAAoIoLDDoIKMoEEJKMoFFJKM,114,27,2,116]").append(System.lineSeparator());
        expected.append("[24931,24432,E-1,GoHBBBGoHCCLAAoIoLDDoIKMEEoJKMoFFJKM,119,28,2,121]").append(System.lineSeparator());
        expected.append("[25236,24931,H-3,GooBBBGooCCLAAoIoLDDHIKMEEHJKMoFFJKM,122,29,2,124]").append(System.lineSeparator());
        expected.append("[25413,25236,A+1,GooBBBGooCCLoAAIoLDDHIKMEEHJKMoFFJKM,127,30,2,129]").append(System.lineSeparator());
        expected.append("[25760,25413,G-1,oooBBBGooCCLGAAIoLDDHIKMEEHJKMoFFJKM,132,31,2,134]").append(System.lineSeparator());
        expected.append("[26626,25760,B-3,BBBoooGooCCLGAAIoLDDHIKMEEHJKMoFFJKM,135,32,2,137]").append(System.lineSeparator());
        expected.append("[27834,26626,C-2,BBBoooGCCooLGAAIoLDDHIKMEEHJKMoFFJKM,139,33,2,141]").append(System.lineSeparator());
        expected.append("[29857,27834,I+2,BBBIooGCCIoLGAAooLDDHoKMEEHJKMoFFJKM,143,34,1,144]").append(System.lineSeparator());
        expected.append("[32099,29857,L+1,BBBIoLGCCIoLGAAoooDDHoKMEEHJKMoFFJKM,148,35,0,148]").append(System.lineSeparator());
        expected.append("[35713,32099,A+3,BBBIoLGCCIoLGoooAADDHoKMEEHJKMoFFJKM,151,36,0,151]").append(System.lineSeparator());
        expected.append("TN: 38850").append(System.lineSeparator());
        expected.append("EN: 4166").append(System.lineSeparator());
        expected.append("CN: 29750").append(System.lineSeparator());
        expected.append("DF: 36");
        return expected.toString();
    }

    private String getExpectedAStar19() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooIBBooHICCAAHJKMDDoJKMGEEELNGFFFLN,0,0,8,8]").append(System.lineSeparator());
        expected.append("[2,0,H+1,ooHIBBooHICCAAoJKMDDoJKMGEEELNGFFFLN,5,1,7,12]").append(System.lineSeparator());
        expected.append("[4,2,A+1,ooHIBBooHICCoAAJKMDDoJKMGEEELNGFFFLN,10,2,6,16]").append(System.lineSeparator());
        expected.append("[14,4,D+1,ooHIBBooHICCoAAJKMoDDJKMGEEELNGFFFLN,15,3,6,21]").append(System.lineSeparator());
        expected.append("[27,14,G+4,GoHIBBGoHICCoAAJKMoDDJKMoEEELNoFFFLN,17,4,6,23]").append(System.lineSeparator());
        expected.append("[36,27,E-1,GoHIBBGoHICCoAAJKMoDDJKMEEEoLNoFFFLN,22,5,6,28]").append(System.lineSeparator());
        expected.append("[72,36,F-1,GoHIBBGoHICCoAAJKMoDDJKMEEEoLNFFFoLN,27,6,6,33]").append(System.lineSeparator());
        expected.append("[145,72,J-2,GoHIBBGoHICCoAAoKMoDDoKMEEEJLNFFFJLN,31,7,5,36]").append(System.lineSeparator());
        expected.append("[211,145,D-1,GoHIBBGoHICCoAAoKMDDooKMEEEJLNFFFJLN,36,8,5,41]").append(System.lineSeparator());
        expected.append("[389,211,I-2,GoHoBBGoHoCCoAAIKMDDoIKMEEEJLNFFFJLN,40,9,6,46]").append(System.lineSeparator());
        expected.append("[632,389,A-1,GoHoBBGoHoCCAAoIKMDDoIKMEEEJLNFFFJLN,45,10,7,52]").append(System.lineSeparator());
        expected.append("[929,632,H-2,GoooBBGoooCCAAHIKMDDHIKMEEEJLNFFFJLN,49,11,8,57]").append(System.lineSeparator());
        expected.append("[1231,929,B-3,GBBoooGoooCCAAHIKMDDHIKMEEEJLNFFFJLN,52,12,8,60]").append(System.lineSeparator());
        expected.append("[1502,1231,C-3,GBBoooGCCoooAAHIKMDDHIKMEEEJLNFFFJLN,55,13,8,63]").append(System.lineSeparator());
        expected.append("[1780,1502,I+2,GBBIooGCCIooAAHoKMDDHoKMEEEJLNFFFJLN,59,14,7,66]").append(System.lineSeparator());
        expected.append("[2050,1780,K+2,GBBIKoGCCIKoAAHooMDDHooMEEEJLNFFFJLN,63,15,6,69]").append(System.lineSeparator());
        expected.append("[2426,2050,M+2,GBBIKMGCCIKMAAHoooDDHoooEEEJLNFFFJLN,67,16,5,72]").append(System.lineSeparator());
        expected.append("[2997,2426,J+2,GBBIKMGCCIKMAAHJooDDHJooEEEoLNFFFoLN,71,17,6,77]").append(System.lineSeparator());
        expected.append("[4361,2997,L+2,GBBIKMGCCIKMAAHJLoDDHJLoEEEooNFFFooN,75,18,7,82]").append(System.lineSeparator());
        expected.append("[6041,4361,N+2,GBBIKMGCCIKMAAHJLNDDHJLNEEEoooFFFooo,79,19,8,87]").append(System.lineSeparator());
        expected.append("[7889,6041,E+3,GBBIKMGCCIKMAAHJLNDDHJLNoooEEEFFFooo,82,20,8,90]").append(System.lineSeparator());
        expected.append("[8972,7889,F+3,GBBIKMGCCIKMAAHJLNDDHJLNoooEEEoooFFF,85,21,8,93]").append(System.lineSeparator());
        expected.append("[10013,8972,H-2,GBBIKMGCCIKMAAoJLNDDoJLNooHEEEooHFFF,89,22,7,96]").append(System.lineSeparator());
        expected.append("[10775,10013,A+1,GBBIKMGCCIKMoAAJLNDDoJLNooHEEEooHFFF,94,23,6,100]").append(System.lineSeparator());
        expected.append("[11111,10775,D+1,GBBIKMGCCIKMoAAJLNoDDJLNooHEEEooHFFF,99,24,6,105]").append(System.lineSeparator());
        expected.append("[11150,11111,G-4,oBBIKMoCCIKMoAAJLNoDDJLNGoHEEEGoHFFF,101,25,6,107]").append(System.lineSeparator());
        expected.append("[11167,11150,B-1,BBoIKMoCCIKMoAAJLNoDDJLNGoHEEEGoHFFF,106,26,6,112]").append(System.lineSeparator());
        expected.append("[11216,11167,C-1,BBoIKMCCoIKMoAAJLNoDDJLNGoHEEEGoHFFF,111,27,6,117]").append(System.lineSeparator());
        expected.append("[11273,11216,D-1,BBoIKMCCoIKMoAAJLNDDoJLNGoHEEEGoHFFF,116,28,6,122]").append(System.lineSeparator());
        expected.append("[11330,11273,A-1,BBoIKMCCoIKMAAoJLNDDoJLNGoHEEEGoHFFF,121,29,7,128]").append(System.lineSeparator());
        expected.append("[11452,11330,H+4,BBHIKMCCHIKMAAoJLNDDoJLNGooEEEGooFFF,123,30,7,130]").append(System.lineSeparator());
        expected.append("[11505,11452,A+1,BBHIKMCCHIKMoAAJLNDDoJLNGooEEEGooFFF,128,31,6,134]").append(System.lineSeparator());
        expected.append("[11740,11505,D+1,BBHIKMCCHIKMoAAJLNoDDJLNGooEEEGooFFF,133,32,6,139]").append(System.lineSeparator());
        expected.append("[12334,11740,G+2,BBHIKMCCHIKMGAAJLNGDDJLNoooEEEoooFFF,137,33,6,143]").append(System.lineSeparator());
        expected.append("[13642,12334,E-3,BBHIKMCCHIKMGAAJLNGDDJLNEEEooooooFFF,140,34,6,146]").append(System.lineSeparator());
        expected.append("[15049,13642,J-1,BBHIKMCCHIKMGAAoLNGDDJLNEEEJoooooFFF,145,35,5,150]").append(System.lineSeparator());
        expected.append("[17287,15049,L-1,BBHIKMCCHIKMGAAooNGDDJLNEEEJLooooFFF,150,36,4,154]").append(System.lineSeparator());
        expected.append("[19994,17287,N-1,BBHIKMCCHIKMGAAoooGDDJLNEEEJLNoooFFF,155,37,3,158]").append(System.lineSeparator());
        expected.append("[22931,19994,A+3,BBHIKMCCHIKMGoooAAGDDJLNEEEJLNoooFFF,158,38,0,158]").append(System.lineSeparator());
        expected.append("TN: 23027").append(System.lineSeparator());
        expected.append("EN: 2692").append(System.lineSeparator());
        expected.append("CN: 16816").append(System.lineSeparator());
        expected.append("DF: 39");
        return expected.toString();
    }

    private String getExpectedAStar20() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooHBBooGHCCAAGIJLFooIJLFDDDKMooEEKM,0,0,4,4]").append(System.lineSeparator());
        expected.append("[4,0,G+1,ooGHBBooGHCCAAoIJLFooIJLFDDDKMooEEKM,5,1,3,8]").append(System.lineSeparator());
        expected.append("[10,4,A+1,ooGHBBooGHCCoAAIJLFooIJLFDDDKMooEEKM,10,2,3,13]").append(System.lineSeparator());
        expected.append("[44,10,F+3,FoGHBBFoGHCCoAAIJLoooIJLoDDDKMooEEKM,13,3,3,16]").append(System.lineSeparator());
        expected.append("[73,44,E-2,FoGHBBFoGHCCoAAIJLoooIJLoDDDKMEEooKM,17,4,3,20]").append(System.lineSeparator());
        expected.append("[121,73,D-1,FoGHBBFoGHCCoAAIJLoooIJLDDDoKMEEooKM,22,5,3,25]").append(System.lineSeparator());
        expected.append("[205,121,I-2,FoGHBBFoGHCCoAAoJLooooJLDDDIKMEEoIKM,26,6,2,28]").append(System.lineSeparator());
        expected.append("[288,205,A-1,FoGHBBFoGHCCAAooJLooooJLDDDIKMEEoIKM,31,7,2,33]").append(System.lineSeparator());
        expected.append("[488,288,G-2,FooHBBFooHCCAAGoJLooGoJLDDDIKMEEoIKM,35,8,3,38]").append(System.lineSeparator());
        expected.append("[783,488,H-2,FoooBBFoooCCAAGHJLooGHJLDDDIKMEEoIKM,39,9,4,43]").append(System.lineSeparator());
        expected.append("[1059,783,B-3,FBBoooFoooCCAAGHJLooGHJLDDDIKMEEoIKM,42,10,4,46]").append(System.lineSeparator());
        expected.append("[1336,1059,C-3,FBBoooFCCoooAAGHJLooGHJLDDDIKMEEoIKM,45,11,4,49]").append(System.lineSeparator());
        expected.append("[1735,1336,H+2,FBBHooFCCHooAAGoJLooGoJLDDDIKMEEoIKM,49,12,3,52]").append(System.lineSeparator());
        expected.append("[2215,1735,J+2,FBBHJoFCCHJoAAGooLooGooLDDDIKMEEoIKM,53,13,2,55]").append(System.lineSeparator());
        expected.append("[2941,2215,L+2,FBBHJLFCCHJLAAGoooooGoooDDDIKMEEoIKM,57,14,1,58]").append(System.lineSeparator());
        expected.append("[4051,2941,I+2,FBBHJLFCCHJLAAGIooooGIooDDDoKMEEooKM,61,15,2,63]").append(System.lineSeparator());
        expected.append("[6980,4051,K+2,FBBHJLFCCHJLAAGIKoooGIKoDDDooMEEoooM,65,16,3,68]").append(System.lineSeparator());
        expected.append("[10484,6980,M+2,FBBHJLFCCHJLAAGIKMooGIKMDDDoooEEoooo,69,17,4,73]").append(System.lineSeparator());
        expected.append("[13916,10484,D+3,FBBHJLFCCHJLAAGIKMooGIKMoooDDDEEoooo,72,18,4,76]").append(System.lineSeparator());
        expected.append("[15927,13916,G-2,FBBHJLFCCHJLAAoIKMoooIKMooGDDDEEGooo,76,19,3,79]").append(System.lineSeparator());
        expected.append("[17431,15927,A+1,FBBHJLFCCHJLoAAIKMoooIKMooGDDDEEGooo,81,20,3,84]").append(System.lineSeparator());
        expected.append("[18614,17431,F-3,oBBHJLoCCHJLoAAIKMFooIKMFoGDDDEEGooo,84,21,3,87]").append(System.lineSeparator());
        expected.append("[18818,18614,A-1,oBBHJLoCCHJLAAoIKMFooIKMFoGDDDEEGooo,89,22,3,92]").append(System.lineSeparator());
        expected.append("[19197,18818,B-1,BBoHJLoCCHJLAAoIKMFooIKMFoGDDDEEGooo,94,23,3,97]").append(System.lineSeparator());
        expected.append("[19766,19197,C-1,BBoHJLCCoHJLAAoIKMFooIKMFoGDDDEEGooo,99,24,3,102]").append(System.lineSeparator());
        expected.append("[20332,19766,G+4,BBGHJLCCGHJLAAoIKMFooIKMFooDDDEEoooo,101,25,3,104]").append(System.lineSeparator());
        expected.append("[20754,20332,A+1,BBGHJLCCGHJLoAAIKMFooIKMFooDDDEEoooo,106,26,3,109]").append(System.lineSeparator());
        expected.append("[22131,20754,F+1,BBGHJLCCGHJLFAAIKMFooIKMoooDDDEEoooo,111,27,3,114]").append(System.lineSeparator());
        expected.append("[25496,22131,D-3,BBGHJLCCGHJLFAAIKMFooIKMDDDoooEEoooo,114,28,3,117]").append(System.lineSeparator());
        expected.append("[29657,25496,I-2,BBGHJLCCGHJLFAAoKMFoooKMDDDIooEEoIoo,118,29,2,120]").append(System.lineSeparator());
        expected.append("[33955,29657,K-2,BBGHJLCCGHJLFAAooMFooooMDDDIKoEEoIKo,122,30,1,123]").append(System.lineSeparator());
        expected.append("[38757,33955,M-2,BBGHJLCCGHJLFAAoooFoooooDDDIKMEEoIKM,126,31,0,126]").append(System.lineSeparator());
        expected.append("[42904,38757,A+3,BBGHJLCCGHJLFoooAAFoooooDDDIKMEEoIKM,129,32,0,129]").append(System.lineSeparator());
        expected.append("TN: 46774").append(System.lineSeparator());
        expected.append("EN: 4612").append(System.lineSeparator());
        expected.append("CN: 35958").append(System.lineSeparator());
        expected.append("DF: 33");
        return expected.toString();
    }

    private String getExpectedAStar21() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,HBBCCCHDDKoMAAJKoMEEJFFMoIooLooIGGLo,0,0,7,7]").append(System.lineSeparator());
        expected.append("[1,0,J-1,HBBCCCHDDKoMAAoKoMEEJFFMoIJoLooIGGLo,5,1,6,11]").append(System.lineSeparator());
        expected.append("[7,1,A+1,HBBCCCHDDKoMoAAKoMEEJFFMoIJoLooIGGLo,10,2,5,15]").append(System.lineSeparator());
        expected.append("[19,7,H-1,oBBCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,15,3,5,20]").append(System.lineSeparator());
        expected.append("[30,19,B-1,BBoCCCHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,20,4,5,25]").append(System.lineSeparator());
        expected.append("[43,30,C-1,BBCCCoHDDKoMHAAKoMEEJFFMoIJoLooIGGLo,25,5,5,30]").append(System.lineSeparator());
        expected.append("[55,43,M+1,BBCCCMHDDKoMHAAKoMEEJFFooIJoLooIGGLo,30,6,5,35]").append(System.lineSeparator());
        expected.append("[66,55,F+1,BBCCCMHDDKoMHAAKoMEEJoFFoIJoLooIGGLo,35,7,5,40]").append(System.lineSeparator());
        expected.append("[76,66,K-2,BBCCCMHDDooMHAAooMEEJKFFoIJKLooIGGLo,39,8,4,43]").append(System.lineSeparator());
        expected.append("[78,76,A+2,BBCCCMHDDooMHooAAMEEJKFFoIJKLooIGGLo,43,9,2,45]").append(System.lineSeparator());
        expected.append("[90,78,D+2,BBCCCMHooDDMHooAAMEEJKFFoIJKLooIGGLo,47,10,2,49]").append(System.lineSeparator());
        expected.append("[114,90,J+2,BBCCCMHoJDDMHoJAAMEEoKFFoIoKLooIGGLo,51,11,2,53]").append(System.lineSeparator());
        expected.append("[134,114,E+1,BBCCCMHoJDDMHoJAAMoEEKFFoIoKLooIGGLo,56,12,2,58]").append(System.lineSeparator());
        expected.append("[147,134,H-3,BBCCCMooJDDMooJAAMoEEKFFHIoKLoHIGGLo,59,13,2,61]").append(System.lineSeparator());
        expected.append("[148,147,E-1,BBCCCMooJDDMooJAAMEEoKFFHIoKLoHIGGLo,64,14,2,66]").append(System.lineSeparator());
        expected.append("[160,148,J-2,BBCCCMoooDDMoooAAMEEJKFFHIJKLoHIGGLo,68,15,2,70]").append(System.lineSeparator());
        expected.append("[166,160,D-3,BBCCCMDDoooMoooAAMEEJKFFHIJKLoHIGGLo,71,16,2,73]").append(System.lineSeparator());
        expected.append("[176,166,A-3,BBCCCMDDoooMAAoooMEEJKFFHIJKLoHIGGLo,74,17,5,79]").append(System.lineSeparator());
        expected.append("[255,176,J+2,BBCCCMDDJooMAAJooMEEoKFFHIoKLoHIGGLo,78,18,6,84]").append(System.lineSeparator());
        expected.append("[336,255,K+2,BBCCCMDDJKoMAAJKoMEEooFFHIooLoHIGGLo,82,19,7,89]").append(System.lineSeparator());
        expected.append("[441,336,F-2,BBCCCMDDJKoMAAJKoMEEFFooHIooLoHIGGLo,86,20,7,93]").append(System.lineSeparator());
        expected.append("[547,441,L+3,BBCCCMDDJKLMAAJKLMEEFFooHIooooHIGGoo,89,21,8,97]").append(System.lineSeparator());
        expected.append("[687,547,F+2,BBCCCMDDJKLMAAJKLMEEooFFHIooooHIGGoo,93,22,8,101]").append(System.lineSeparator());
        expected.append("[926,687,G+2,BBCCCMDDJKLMAAJKLMEEooFFHIooooHIooGG,97,23,8,105]").append(System.lineSeparator());
        expected.append("[1323,926,J-3,BBCCCMDDoKLMAAoKLMEEooFFHIJoooHIJoGG,100,24,7,107]").append(System.lineSeparator());
        expected.append("[1658,1323,K-3,BBCCCMDDooLMAAooLMEEooFFHIJKooHIJKGG,103,25,6,109]").append(System.lineSeparator());
        expected.append("[2011,1658,A+2,BBCCCMDDooLMooAALMEEooFFHIJKooHIJKGG,107,26,4,111]").append(System.lineSeparator());
        expected.append("[2525,2011,D+2,BBCCCMooDDLMooAALMEEooFFHIJKooHIJKGG,111,27,4,115]").append(System.lineSeparator());
        expected.append("[3958,2525,E+2,BBCCCMooDDLMooAALMooEEFFHIJKooHIJKGG,115,28,4,119]").append(System.lineSeparator());
        expected.append("[6186,3958,H+3,BBCCCMHoDDLMHoAALMooEEFFoIJKoooIJKGG,118,29,4,122]").append(System.lineSeparator());
        expected.append("[8268,6186,I+3,BBCCCMHIDDLMHIAALMooEEFFooJKooooJKGG,121,30,4,125]").append(System.lineSeparator());
        expected.append("[10475,8268,E-2,BBCCCMHIDDLMHIAALMEEooFFooJKooooJKGG,125,31,4,129]").append(System.lineSeparator());
        expected.append("[13679,10475,J+1,BBCCCMHIDDLMHIAALMEEJoFFooJKoooooKGG,130,32,4,134]").append(System.lineSeparator());
        expected.append("[16824,13679,K+1,BBCCCMHIDDLMHIAALMEEJKFFooJKooooooGG,135,33,4,139]").append(System.lineSeparator());
        expected.append("[19078,16824,G-4,BBCCCMHIDDLMHIAALMEEJKFFooJKooGGoooo,137,34,4,141]").append(System.lineSeparator());
        expected.append("[19959,19078,J-1,BBCCCMHIDDLMHIAALMEEoKFFooJKooGGJooo,142,35,4,146]").append(System.lineSeparator());
        expected.append("[21383,19959,K-1,BBCCCMHIDDLMHIAALMEEooFFooJKooGGJKoo,147,36,4,151]").append(System.lineSeparator());
        expected.append("[22465,21383,F-2,BBCCCMHIDDLMHIAALMEEFFooooJKooGGJKoo,151,37,4,155]").append(System.lineSeparator());
        expected.append("[23199,22465,L-3,BBCCCMHIDDoMHIAAoMEEFFooooJKLoGGJKLo,154,38,3,157]").append(System.lineSeparator());
        expected.append("[23466,23199,M-3,BBCCCoHIDDooHIAAooEEFFoMooJKLMGGJKLM,157,39,2,159]").append(System.lineSeparator());
        expected.append("[23735,23466,A+2,BBCCCoHIDDooHIooAAEEFFoMooJKLMGGJKLM,161,40,0,161]").append(System.lineSeparator());
        expected.append("TN: 23977").append(System.lineSeparator());
        expected.append("EN: 3062").append(System.lineSeparator());
        expected.append("CN: 20329").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }
}