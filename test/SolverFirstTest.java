package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import solver.Solver;
import solver.Strategy;

public class SolverFirstTest {

    @Test
    public void testDFS1() {
        Solver solver = new Solver("oooGoooFoGBBEFAAHJEoCCHJEDDDIJooooIo", 20, Strategy.DFS, false);
        solver.gameSolver();

        assertEquals(getExpectedDFS1(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS2() {
        Solver solver = new Solver("oooGoooFoGBBEFAAHJEoCCHJEDDDIJooooIo", 20, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS2(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS3() {
        Solver solver = new Solver("IBBoooIooLDDJAALooJoKEEMFFKooMGGHHHM", 10, Strategy.DFS, false);
        solver.gameSolver();

        assertEquals(getExpectedDFS3(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS4() {
        Solver solver = new Solver("IBBoooIooLDDJAALooJoKEEMFFKooMGGHHHM", 10, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS4(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS1() {
        Solver solver = new Solver("ooJBBMCCJKoMIAAKooIDDLEEFFFLooooHHHo", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS1(), solver.showSolutionWay(false));
    }

    @Test
    public void testUC1() {
        Solver solver = new Solver("ooJBBMCCJKoMIAAKooIDDLEEFFFLooooHHHo", 0, Strategy.UC, true);
        solver.gameSolver();

        assertEquals(getExpectedUC1(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS5() {
        Solver solver = new Solver("BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo", 30, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS5(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS6() {
        Solver solver = new Solver("BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo", 40, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS6(), solver.showSolutionWay(false));
    }

    @Test
    public void testUC2() {
        Solver solver = new Solver("BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo", 0, Strategy.UC, true);
        solver.gameSolver();

        assertEquals(getExpectedUC2(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS2() {
        Solver solver = new Solver("BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS2(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS3() {
        Solver solver = new Solver("oEBBBooEGCCoAAGHoooFGHIooFDDIooooooo", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS3(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS7() {
        Solver solver = new Solver("oEBBBooEGCCoAAGHoooFGHIooFDDIooooooo", 10, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS7(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS4() {
        Solver solver = new Solver("HBBBCCHJDDEEHJAAKLIFFFKLIoGGGMoooooM", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS4(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS8() {
        Solver solver = new Solver("HBBBCCHJDDEEHJAAKLIFFFKLIoGGGMoooooM", 12, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS8(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS5() {
        Solver solver = new Solver("oooooJBBCCoJoAAIoJoGHIoooGHDDDoEEFFF", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS5(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS9() {
        Solver solver = new Solver("oooooJBBCCoJoAAIoJoGHIoooGHDDDoEEFFF", 10, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS9(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS6() {
        Solver solver = new Solver("ooJBBBoHJoCCoHKAAMGIKLoMGIKLDDGIEEFF", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS6(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS10() {
        Solver solver = new Solver("ooJBBBoHJoCCoHKAAMGIKLoMGIKLDDGIEEFF", 10, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS10(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS7() {
        Solver solver = new Solver("ooHIBBooHIJKAAooJKCCCoJLGDDDoLGEEFFL", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS7(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS11() {
        Solver solver = new Solver("ooHIBBooHIJKAAooJKCCCoJLGDDDoLGEEFFL", 12, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS11(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS8() {
        Solver solver = new Solver("GIBBCCGIoooLGAAoKLHDDoKoHoJEEoFFJooo", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS8(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS12() {
        Solver solver = new Solver("GIBBCCGIoooLGAAoKLHDDoKoHoJEEoFFJooo", 13, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS12(), solver.showSolutionWay(false));

    }

    @Test
    public void testBFS9() {
        Solver solver = new Solver("oooGoooooGHIAAoGHIEBBCCJEoFooJEoFDDD", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS9(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS13() {
        Solver solver = new Solver("oooGoooooGHIAAoGHIEBBCCJEoFooJEoFDDD", 11, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS13(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS10() {
        Solver solver = new Solver("BBoooKCCCooKAAoooKJDDEEEJFFGGGJHHIII", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS10(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS14() {
        Solver solver = new Solver("BBoooKCCCooKAAoooKJDDEEEJFFGGGJHHIII", 12, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS14(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS11() {
        Solver solver = new Solver("ooFoooooFBBBAAFooHoECCoHoEoGoHDDDGoo", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS11(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS15() {
        Solver solver = new Solver("ooFoooooFBBBAAFooHoECCoHoEoGoHDDDGoo", 14, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS15(), solver.showSolutionWay(false));
    }

    @Test
    public void testBFS12() {
        Solver solver = new Solver("oBBHCCDDDHIJAAFoIJooFooKooGooKooGoEE", 0, Strategy.BFS, true);
        solver.gameSolver();

        assertEquals(getExpectedBFS12(), solver.showSolutionWay(false));
    }

    @Test
    public void testDFS16() {
        Solver solver = new Solver("oBBHCCDDDHIJAAFoIJooFooKooGooKooGoEE", 14, Strategy.DFS, true);
        solver.gameSolver();

        assertEquals(getExpectedDFS16(), solver.showSolutionWay(false));
    }

    private String getExpectedDFS1() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooGoooFoGBBEFAAHJEoCCHJEDDDIJooooIo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,C-1,oooGoooFoGBBEFAAHJECCoHJEDDDIJooooIo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[9,1,E+1,oooGooEFoGBBEFAAHJECCoHJoDDDIJooooIo,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[14,9,C+1,oooGooEFoGBBEFAAHJEoCCHJoDDDIJooooIo,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[22,14,D-1,oooGooEFoGBBEFAAHJEoCCHJDDDoIJooooIo,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[29,22,C-1,oooGooEFoGBBEFAAHJECCoHJDDDoIJooooIo,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[37,29,E+1,EooGooEFoGBBEFAAHJoCCoHJDDDoIJooooIo,30,6,0,-6]").append(System.lineSeparator());
        expected.append("[40,37,C+1,EooGooEFoGBBEFAAHJooCCHJDDDoIJooooIo,35,7,0,-7]").append(System.lineSeparator());
        expected.append("[47,40,C-2,EooGooEFoGBBEFAAHJCCooHJDDDoIJooooIo,39,8,0,-8]").append(System.lineSeparator());
        expected.append("[55,47,D+1,EooGooEFoGBBEFAAHJCCooHJoDDDIJooooIo,44,9,0,-9]").append(System.lineSeparator());
        expected.append("[58,55,C+1,EooGooEFoGBBEFAAHJoCCoHJoDDDIJooooIo,49,10,0,-10]").append(System.lineSeparator());
        expected.append("[63,58,C+1,EooGooEFoGBBEFAAHJooCCHJoDDDIJooooIo,54,11,0,-11]").append(System.lineSeparator());
        expected.append("[77,63,F+1,EFoGooEFoGBBEoAAHJooCCHJoDDDIJooooIo,59,12,0,-12]").append(System.lineSeparator());
        expected.append("[4826,77,A-1,EFoGooEFoGBBEAAoHJooCCHJoDDDIJooooIo,64,13,0,-13]").append(System.lineSeparator());
        expected.append("[4837,4826,C-1,EFoGooEFoGBBEAAoHJoCCoHJoDDDIJooooIo,69,14,0,-14]").append(System.lineSeparator());
        expected.append("[4848,4837,D-1,EFoGooEFoGBBEAAoHJoCCoHJDDDoIJooooIo,74,15,0,-15]").append(System.lineSeparator());
        expected.append("[5576,4848,G-3,EFooooEFooBBEAAoHJoCCGHJDDDGIJooooIo,77,16,0,-16]").append(System.lineSeparator());
        expected.append("[6837,5576,B-2,EFooooEFBBooEAAoHJoCCGHJDDDGIJooooIo,81,17,0,-17]").append(System.lineSeparator());
        expected.append("[7049,6837,H+2,EFooHoEFBBHoEAAooJoCCGoJDDDGIJooooIo,85,18,0,-18]").append(System.lineSeparator());
        expected.append("[7119,7049,J-1,EFooHoEFBBHoEAAooooCCGoJDDDGIJooooIJ,90,19,0,-19]").append(System.lineSeparator());
        expected.append("[7180,7119,A+3,EFooHoEFBBHoEoooAAoCCGoJDDDGIJooooIJ,93,20,0,-20]");
        return expected.toString();
    }

    private String getExpectedDFS2() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooGoooFoGBBEFAAHJEoCCHJEDDDIJooooIo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,C-1,oooGoooFoGBBEFAAHJECCoHJEDDDIJooooIo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[9,1,E+1,oooGooEFoGBBEFAAHJECCoHJoDDDIJooooIo,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[14,9,C+1,oooGooEFoGBBEFAAHJEoCCHJoDDDIJooooIo,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[22,14,D-1,oooGooEFoGBBEFAAHJEoCCHJDDDoIJooooIo,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[29,22,C-1,oooGooEFoGBBEFAAHJECCoHJDDDoIJooooIo,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[37,29,E+1,EooGooEFoGBBEFAAHJoCCoHJDDDoIJooooIo,30,6,0,-6]").append(System.lineSeparator());
        expected.append("[40,37,C+1,EooGooEFoGBBEFAAHJooCCHJDDDoIJooooIo,35,7,0,-7]").append(System.lineSeparator());
        expected.append("[47,40,C-2,EooGooEFoGBBEFAAHJCCooHJDDDoIJooooIo,39,8,0,-8]").append(System.lineSeparator());
        expected.append("[55,47,D+1,EooGooEFoGBBEFAAHJCCooHJoDDDIJooooIo,44,9,0,-9]").append(System.lineSeparator());
        expected.append("[58,55,C+1,EooGooEFoGBBEFAAHJoCCoHJoDDDIJooooIo,49,10,0,-10]").append(System.lineSeparator());
        expected.append("[63,58,C+1,EooGooEFoGBBEFAAHJooCCHJoDDDIJooooIo,54,11,0,-11]").append(System.lineSeparator());
        expected.append("[77,63,F+1,EFoGooEFoGBBEoAAHJooCCHJoDDDIJooooIo,59,12,0,-12]").append(System.lineSeparator());
        expected.append("[4826,77,A-1,EFoGooEFoGBBEAAoHJooCCHJoDDDIJooooIo,64,13,0,-13]").append(System.lineSeparator());
        expected.append("[4837,4826,C-1,EFoGooEFoGBBEAAoHJoCCoHJoDDDIJooooIo,69,14,0,-14]").append(System.lineSeparator());
        expected.append("[4848,4837,D-1,EFoGooEFoGBBEAAoHJoCCoHJDDDoIJooooIo,74,15,0,-15]").append(System.lineSeparator());
        expected.append("[5576,4848,G-3,EFooooEFooBBEAAoHJoCCGHJDDDGIJooooIo,77,16,0,-16]").append(System.lineSeparator());
        expected.append("[6837,5576,B-2,EFooooEFBBooEAAoHJoCCGHJDDDGIJooooIo,81,17,0,-17]").append(System.lineSeparator());
        expected.append("[7049,6837,H+2,EFooHoEFBBHoEAAooJoCCGoJDDDGIJooooIo,85,18,0,-18]").append(System.lineSeparator());
        expected.append("[7119,7049,J-1,EFooHoEFBBHoEAAooooCCGoJDDDGIJooooIJ,90,19,0,-19]").append(System.lineSeparator());
        expected.append("[7180,7119,A+3,EFooHoEFBBHoEoooAAoCCGoJDDDGIJooooIJ,93,20,0,-20]").append(System.lineSeparator());
        expected.append("TN: 7192").append(System.lineSeparator());
        expected.append("EN: 866").append(System.lineSeparator());
        expected.append("CN: 6226").append(System.lineSeparator());
        expected.append("DF: 20");
        return expected.toString();
    }

    private String getExpectedDFS3() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,IBBoooIooLDDJAALooJoKEEMFFKooMGGHHHM,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,B+1,IoBBooIooLDDJAALooJoKEEMFFKooMGGHHHM,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[6,1,B+1,IooBBoIooLDDJAALooJoKEEMFFKooMGGHHHM,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[10,6,B+1,IoooBBIooLDDJAALooJoKEEMFFKooMGGHHHM,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[17,10,L+1,IooLBBIooLDDJAAoooJoKEEMFFKooMGGHHHM,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[19,17,A+1,IooLBBIooLDDJoAAooJoKEEMFFKooMGGHHHM,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[24,19,A+1,IooLBBIooLDDJooAAoJoKEEMFFKooMGGHHHM,30,6,0,-6]").append(System.lineSeparator());
        expected.append("[28,24,A+1,IooLBBIooLDDJoooAAJoKEEMFFKooMGGHHHM,35,7,0,-7]");
        return expected.toString();
    }

    private String getExpectedDFS4() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,IBBoooIooLDDJAALooJoKEEMFFKooMGGHHHM,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,B+1,IoBBooIooLDDJAALooJoKEEMFFKooMGGHHHM,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[6,1,B+1,IooBBoIooLDDJAALooJoKEEMFFKooMGGHHHM,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[10,6,B+1,IoooBBIooLDDJAALooJoKEEMFFKooMGGHHHM,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[17,10,L+1,IooLBBIooLDDJAAoooJoKEEMFFKooMGGHHHM,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[19,17,A+1,IooLBBIooLDDJoAAooJoKEEMFFKooMGGHHHM,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[24,19,A+1,IooLBBIooLDDJooAAoJoKEEMFFKooMGGHHHM,30,6,0,-6]").append(System.lineSeparator());
        expected.append("[28,24,A+1,IooLBBIooLDDJoooAAJoKEEMFFKooMGGHHHM,35,7,0,-7]").append(System.lineSeparator());
        expected.append("TN: 35").append(System.lineSeparator());
        expected.append("EN: 7").append(System.lineSeparator());
        expected.append("CN: 3").append(System.lineSeparator());
        expected.append("DF: 7");
        return expected.toString();
    }

    private String getExpectedBFS1() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooJBBMCCJKoMIAAKooIDDLEEFFFLooooHHHo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[3,0,H-2,ooJBBMCCJKoMIAAKooIDDLEEFFFLooHHHooo,4,1,0,1]").append(System.lineSeparator());
        expected.append("[16,3,L-1,ooJBBMCCJKoMIAAKooIDDoEEFFFLooHHHLoo,9,2,0,2]").append(System.lineSeparator());
        expected.append("[34,16,E-1,ooJBBMCCJKoMIAAKooIDDEEoFFFLooHHHLoo,14,3,0,3]").append(System.lineSeparator());
        expected.append("[64,34,M-3,ooJBBoCCJKooIAAKooIDDEEMFFFLoMHHHLoo,17,4,0,4]").append(System.lineSeparator());
        expected.append("[115,64,B+1,ooJoBBCCJKooIAAKooIDDEEMFFFLoMHHHLoo,22,5,0,5]").append(System.lineSeparator());
        expected.append("[212,115,K+1,ooJKBBCCJKooIAAoooIDDEEMFFFLoMHHHLoo,27,6,0,6]").append(System.lineSeparator());
        expected.append("[362,212,A+3,ooJKBBCCJKooIoooAAIDDEEMFFFLoMHHHLoo,30,7,0,7]").append(System.lineSeparator());
        expected.append("TN: 614").append(System.lineSeparator());
        expected.append("EN: 101").append(System.lineSeparator());
        expected.append("CN: 261").append(System.lineSeparator());
        expected.append("DF: 8");
        return expected.toString();
    }

    private String getExpectedUC1() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooJBBMCCJKoMIAAKooIDDLEEFFFLooooHHHo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[3,0,H-2,ooJBBMCCJKoMIAAKooIDDLEEFFFLooHHHooo,4,1,0,4]").append(System.lineSeparator());
        expected.append("[8,3,L-1,ooJBBMCCJKoMIAAKooIDDoEEFFFLooHHHLoo,9,2,0,9]").append(System.lineSeparator());
        expected.append("[24,8,E-1,ooJBBMCCJKoMIAAKooIDDEEoFFFLooHHHLoo,14,3,0,14]").append(System.lineSeparator());
        expected.append("[55,24,M-4,ooJBBoCCJKooIAAKooIDDEEoFFFLoMHHHLoM,16,4,0,16]").append(System.lineSeparator());
        expected.append("[87,55,B+1,ooJoBBCCJKooIAAKooIDDEEoFFFLoMHHHLoM,21,5,0,21]").append(System.lineSeparator());
        expected.append("[163,87,K+1,ooJKBBCCJKooIAAoooIDDEEoFFFLoMHHHLoM,26,6,0,26]").append(System.lineSeparator());
        expected.append("[295,163,A+3,ooJKBBCCJKooIoooAAIDDEEoFFFLoMHHHLoM,29,7,0,29]").append(System.lineSeparator());
        expected.append("TN: 450").append(System.lineSeparator());
        expected.append("EN: 78").append(System.lineSeparator());
        expected.append("CN: 190").append(System.lineSeparator());
        expected.append("DF: 7");
        return expected.toString();
    }

    private String getExpectedDFS5() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,B+1,oBBJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[8,1,G+1,oBBJooGHoJKLGHAAKLoDDDKMooIEEMFFIooo,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[14,8,B-1,BBoJooGHoJKLGHAAKLoDDDKMooIEEMFFIooo,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[23,14,D-1,BBoJooGHoJKLGHAAKLDDDoKMooIEEMFFIooo,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[29,23,B+1,oBBJooGHoJKLGHAAKLDDDoKMooIEEMFFIooo,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[36,29,G+1,GBBJooGHoJKLoHAAKLDDDoKMooIEEMFFIooo,30,6,0,-6]").append(System.lineSeparator());
        expected.append("[40,36,D+1,GBBJooGHoJKLoHAAKLoDDDKMooIEEMFFIooo,35,7,0,-7]").append(System.lineSeparator());
        expected.append("[48,40,G-3,oBBJoooHoJKLoHAAKLGDDDKMGoIEEMFFIooo,38,8,0,-8]").append(System.lineSeparator());
        expected.append("[52,48,B-1,BBoJoooHoJKLoHAAKLGDDDKMGoIEEMFFIooo,43,9,0,-9]").append(System.lineSeparator());
        expected.append("[62,52,K+1,BBoJKooHoJKLoHAAKLGDDDoMGoIEEMFFIooo,48,10,0,-10]").append(System.lineSeparator());
        expected.append("[65,62,B+1,oBBJKooHoJKLoHAAKLGDDDoMGoIEEMFFIooo,53,11,0,-11]").append(System.lineSeparator());
        expected.append("[73,65,D+1,oBBJKooHoJKLoHAAKLGoDDDMGoIEEMFFIooo,58,12,0,-12]").append(System.lineSeparator());
        expected.append("[80,73,B-1,BBoJKooHoJKLoHAAKLGoDDDMGoIEEMFFIooo,63,13,0,-13]").append(System.lineSeparator());
        expected.append("[91,80,G+1,BBoJKooHoJKLGHAAKLGoDDDMooIEEMFFIooo,68,14,0,-14]").append(System.lineSeparator());
        expected.append("[97,91,B+1,oBBJKooHoJKLGHAAKLGoDDDMooIEEMFFIooo,73,15,0,-15]").append(System.lineSeparator());
        expected.append("[106,97,D-1,oBBJKooHoJKLGHAAKLGDDDoMooIEEMFFIooo,78,16,0,-16]").append(System.lineSeparator());
        expected.append("[114,106,B-1,BBoJKooHoJKLGHAAKLGDDDoMooIEEMFFIooo,83,17,0,-17]").append(System.lineSeparator());
        expected.append("[127,114,L+1,BBoJKLoHoJKLGHAAKoGDDDoMooIEEMFFIooo,88,18,0,-18]").append(System.lineSeparator());
        expected.append("[152837,127,G-1,BBoJKLoHoJKLoHAAKoGDDDoMGoIEEMFFIooo,93,19,0,-19]").append(System.lineSeparator());
        expected.append("[168248,152837,M-1,BBoJKLoHoJKLoHAAKoGDDDooGoIEEMFFIooM,98,20,0,-20]").append(System.lineSeparator());
        expected.append("[168292,168248,D+2,BBoJKLoHoJKLoHAAKoGooDDDGoIEEMFFIooM,102,21,0,-21]").append(System.lineSeparator());
        expected.append("[168306,168292,H-2,BBoJKLoooJKLooAAKoGHoDDDGHIEEMFFIooM,106,22,0,-22]").append(System.lineSeparator());
        expected.append("[168443,168306,A-2,BBoJKLoooJKLAAooKoGHoDDDGHIEEMFFIooM,110,23,0,-23]").append(System.lineSeparator());
        expected.append("[168779,168443,I+4,BBIJKLooIJKLAAooKoGHoDDDGHoEEMFFoooM,112,24,0,-24]").append(System.lineSeparator());
        expected.append("[172738,168779,A+2,BBIJKLooIJKLooAAKoGHoDDDGHoEEMFFoooM,116,25,0,-25]").append(System.lineSeparator());
        expected.append("[175849,172738,E-1,BBIJKLooIJKLooAAKoGHoDDDGHEEoMFFoooM,121,26,0,-26]").append(System.lineSeparator());
        expected.append("[178843,175849,H+2,BBIJKLoHIJKLoHAAKoGooDDDGoEEoMFFoooM,125,27,0,-27]").append(System.lineSeparator());
        expected.append("[179621,178843,D-2,BBIJKLoHIJKLoHAAKoGDDDooGoEEoMFFoooM,129,28,0,-28]").append(System.lineSeparator());
        expected.append("[179643,179621,K-3,BBIJoLoHIJoLoHAAooGDDDKoGoEEKMFFooKM,132,29,0,-29]").append(System.lineSeparator());
        expected.append("[179676,179643,A+2,BBIJoLoHIJoLoHooAAGDDDKoGoEEKMFFooKM,136,30,0,-30]").append(System.lineSeparator());
        expected.append("TN: 179689").append(System.lineSeparator());
        expected.append("EN: 16541").append(System.lineSeparator());
        expected.append("CN: 162987").append(System.lineSeparator());
        expected.append("DF: 30");
        return expected.toString();
    }

    private String getExpectedDFS6() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,B+1,oBBJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[8,1,G+1,oBBJooGHoJKLGHAAKLoDDDKMooIEEMFFIooo,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[14,8,B-1,BBoJooGHoJKLGHAAKLoDDDKMooIEEMFFIooo,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[23,14,D-1,BBoJooGHoJKLGHAAKLDDDoKMooIEEMFFIooo,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[29,23,B+1,oBBJooGHoJKLGHAAKLDDDoKMooIEEMFFIooo,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[36,29,G+1,GBBJooGHoJKLoHAAKLDDDoKMooIEEMFFIooo,30,6,0,-6]").append(System.lineSeparator());
        expected.append("[40,36,D+1,GBBJooGHoJKLoHAAKLoDDDKMooIEEMFFIooo,35,7,0,-7]").append(System.lineSeparator());
        expected.append("[48,40,G-3,oBBJoooHoJKLoHAAKLGDDDKMGoIEEMFFIooo,38,8,0,-8]").append(System.lineSeparator());
        expected.append("[52,48,B-1,BBoJoooHoJKLoHAAKLGDDDKMGoIEEMFFIooo,43,9,0,-9]").append(System.lineSeparator());
        expected.append("[62,52,K+1,BBoJKooHoJKLoHAAKLGDDDoMGoIEEMFFIooo,48,10,0,-10]").append(System.lineSeparator());
        expected.append("[65,62,B+1,oBBJKooHoJKLoHAAKLGDDDoMGoIEEMFFIooo,53,11,0,-11]").append(System.lineSeparator());
        expected.append("[73,65,D+1,oBBJKooHoJKLoHAAKLGoDDDMGoIEEMFFIooo,58,12,0,-12]").append(System.lineSeparator());
        expected.append("[80,73,B-1,BBoJKooHoJKLoHAAKLGoDDDMGoIEEMFFIooo,63,13,0,-13]").append(System.lineSeparator());
        expected.append("[91,80,G+1,BBoJKooHoJKLGHAAKLGoDDDMooIEEMFFIooo,68,14,0,-14]").append(System.lineSeparator());
        expected.append("[97,91,B+1,oBBJKooHoJKLGHAAKLGoDDDMooIEEMFFIooo,73,15,0,-15]").append(System.lineSeparator());
        expected.append("[106,97,D-1,oBBJKooHoJKLGHAAKLGDDDoMooIEEMFFIooo,78,16,0,-16]").append(System.lineSeparator());
        expected.append("[114,106,B-1,BBoJKooHoJKLGHAAKLGDDDoMooIEEMFFIooo,83,17,0,-17]").append(System.lineSeparator());
        expected.append("[124,114,G+1,BBoJKoGHoJKLGHAAKLoDDDoMooIEEMFFIooo,88,18,0,-18]").append(System.lineSeparator());
        expected.append("[129,124,B+1,oBBJKoGHoJKLGHAAKLoDDDoMooIEEMFFIooo,93,19,0,-19]").append(System.lineSeparator());
        expected.append("[138,129,D+1,oBBJKoGHoJKLGHAAKLooDDDMooIEEMFFIooo,98,20,0,-20]").append(System.lineSeparator());
        expected.append("[146,138,B-1,BBoJKoGHoJKLGHAAKLooDDDMooIEEMFFIooo,103,21,0,-21]").append(System.lineSeparator());
        expected.append("[158,146,D-2,BBoJKoGHoJKLGHAAKLDDDooMooIEEMFFIooo,107,22,0,-22]").append(System.lineSeparator());
        expected.append("[165,158,B+1,oBBJKoGHoJKLGHAAKLDDDooMooIEEMFFIooo,112,23,0,-23]").append(System.lineSeparator());
        expected.append("[174,165,G+1,GBBJKoGHoJKLoHAAKLDDDooMooIEEMFFIooo,117,24,0,-24]").append(System.lineSeparator());
        expected.append("[178,174,D+1,GBBJKoGHoJKLoHAAKLoDDDoMooIEEMFFIooo,122,25,0,-25]").append(System.lineSeparator());
        expected.append("[184,178,D+1,GBBJKoGHoJKLoHAAKLooDDDMooIEEMFFIooo,127,26,0,-26]").append(System.lineSeparator());
        expected.append("[198,184,H-2,GBBJKoGooJKLooAAKLoHDDDMoHIEEMFFIooo,131,27,0,-27]").append(System.lineSeparator());
        expected.append("[228338,198,G-3,oBBJKooooJKLooAAKLGHDDDMGHIEEMFFIooo,134,28,0,-28]").append(System.lineSeparator());
        expected.append("[249672,228338,A-2,oBBJKooooJKLAAooKLGHDDDMGHIEEMFFIooo,138,29,0,-29]").append(System.lineSeparator());
        expected.append("[249683,249672,B-1,BBoJKooooJKLAAooKLGHDDDMGHIEEMFFIooo,143,30,0,-30]").append(System.lineSeparator());
        expected.append("[249691,249683,L+1,BBoJKLoooJKLAAooKoGHDDDMGHIEEMFFIooo,148,31,0,-31]").append(System.lineSeparator());
        expected.append("[257578,249691,M-1,BBoJKLoooJKLAAooKoGHDDDoGHIEEMFFIooM,153,32,0,-32]").append(System.lineSeparator());
        expected.append("[257594,257578,D+1,BBoJKLoooJKLAAooKoGHoDDDGHIEEMFFIooM,158,33,0,-33]").append(System.lineSeparator());
        expected.append("[257607,257594,I+4,BBIJKLooIJKLAAooKoGHoDDDGHoEEMFFoooM,160,34,0,-34]").append(System.lineSeparator());
        expected.append("[259402,257607,A+2,BBIJKLooIJKLooAAKoGHoDDDGHoEEMFFoooM,164,35,0,-35]").append(System.lineSeparator());
        expected.append("[261558,259402,E-1,BBIJKLooIJKLooAAKoGHoDDDGHEEoMFFoooM,169,36,0,-36]").append(System.lineSeparator());
        expected.append("[264552,261558,H+2,BBIJKLoHIJKLoHAAKoGooDDDGoEEoMFFoooM,173,37,0,-37]").append(System.lineSeparator());
        expected.append("[265330,264552,D-2,BBIJKLoHIJKLoHAAKoGDDDooGoEEoMFFoooM,177,38,0,-38]").append(System.lineSeparator());
        expected.append("[265352,265330,K-3,BBIJoLoHIJoLoHAAooGDDDKoGoEEKMFFooKM,180,39,0,-39]").append(System.lineSeparator());
        expected.append("[265385,265352,A+2,BBIJoLoHIJoLoHooAAGDDDKoGoEEKMFFooKM,184,40,0,-40]").append(System.lineSeparator());
        expected.append("TN: 265398").append(System.lineSeparator());
        expected.append("EN: 24742").append(System.lineSeparator());
        expected.append("CN: 240441").append(System.lineSeparator());
        expected.append("DF: 40");
        return expected.toString();
    }

    private String getExpectedUC2() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[4,0,K+1,BBoJKooHoJKLGHAAKLGDDDoMooIEEMFFIooo,5,1,0,5]").append(System.lineSeparator());
        expected.append("[33,4,M-1,BBoJKooHoJKLGHAAKLGDDDooooIEEMFFIooM,10,2,0,10]").append(System.lineSeparator());
        expected.append("[162,33,D+2,BBoJKooHoJKLGHAAKLGooDDDooIEEMFFIooM,14,3,0,14]").append(System.lineSeparator());
        expected.append("[234,162,I+1,BBoJKooHoJKLGHAAKLGoIDDDooIEEMFFoooM,19,4,0,19]").append(System.lineSeparator());
        expected.append("[687,234,F+2,BBoJKooHoJKLGHAAKLGoIDDDooIEEMooFFoM,23,5,0,23]").append(System.lineSeparator());
        expected.append("[1203,687,H-3,BBoJKooooJKLGoAAKLGoIDDDoHIEEMoHFFoM,26,6,0,26]").append(System.lineSeparator());
        expected.append("[2030,1203,G-2,BBoJKooooJKLooAAKLooIDDDGHIEEMGHFFoM,30,7,0,30]").append(System.lineSeparator());
        expected.append("[3404,2030,A-2,BBoJKooooJKLAAooKLooIDDDGHIEEMGHFFoM,34,8,0,34]").append(System.lineSeparator());
        expected.append("[5424,3404,I+3,BBIJKoooIJKLAAooKLoooDDDGHoEEMGHFFoM,37,9,0,37]").append(System.lineSeparator());
        expected.append("[7582,5424,D-3,BBIJKoooIJKLAAooKLDDDoooGHoEEMGHFFoM,40,10,0,40]").append(System.lineSeparator());
        expected.append("[11089,7582,E-1,BBIJKoooIJKLAAooKLDDDoooGHEEoMGHFFoM,45,11,0,45]").append(System.lineSeparator());
        expected.append("[20923,11089,K-3,BBIJooooIJoLAAoooLDDDoKoGHEEKMGHFFKM,48,12,0,48]").append(System.lineSeparator());
        expected.append("[31100,20923,L+1,BBIJoLooIJoLAAooooDDDoKoGHEEKMGHFFKM,53,13,0,53]").append(System.lineSeparator());
        expected.append("[57849,31100,A+4,BBIJoLooIJoLooooAADDDoKoGHEEKMGHFFKM,55,14,0,55]").append(System.lineSeparator());
        expected.append("TN: 74119").append(System.lineSeparator());
        expected.append("EN: 6480").append(System.lineSeparator());
        expected.append("CN: 36183").append(System.lineSeparator());
        expected.append("DF: 15");
        return expected.toString();
    }

    private String getExpectedBFS2() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBoJoooHoJKLGHAAKLGDDDKMooIEEMFFIooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[3,0,G-1,BBoJoooHoJKLoHAAKLGDDDKMGoIEEMFFIooo,5,1,0,1]").append(System.lineSeparator());
        expected.append("[24,3,K+1,BBoJKooHoJKLoHAAKLGDDDoMGoIEEMFFIooo,10,2,0,2]").append(System.lineSeparator());
        expected.append("[128,24,L+1,BBoJKLoHoJKLoHAAKoGDDDoMGoIEEMFFIooo,15,3,0,3]").append(System.lineSeparator());
        expected.append("[413,128,M-1,BBoJKLoHoJKLoHAAKoGDDDooGoIEEMFFIooM,20,4,0,4]").append(System.lineSeparator());
        expected.append("[958,413,D+2,BBoJKLoHoJKLoHAAKoGooDDDGoIEEMFFIooM,24,5,0,5]").append(System.lineSeparator());
        expected.append("[1786,958,H-2,BBoJKLoooJKLooAAKoGHoDDDGHIEEMFFIooM,28,6,0,6]").append(System.lineSeparator());
        expected.append("[2931,1786,A-2,BBoJKLoooJKLAAooKoGHoDDDGHIEEMFFIooM,32,7,0,7]").append(System.lineSeparator());
        expected.append("[4615,2931,I+4,BBIJKLooIJKLAAooKoGHoDDDGHoEEMFFoooM,34,8,0,8]").append(System.lineSeparator());
        expected.append("[7156,4615,A+2,BBIJKLooIJKLooAAKoGHoDDDGHoEEMFFoooM,38,9,0,9]").append(System.lineSeparator());
        expected.append("[11064,7156,E-1,BBIJKLooIJKLooAAKoGHoDDDGHEEoMFFoooM,43,10,0,10]").append(System.lineSeparator());
        expected.append("[17681,11064,H+2,BBIJKLoHIJKLoHAAKoGooDDDGoEEoMFFoooM,47,11,0,11]").append(System.lineSeparator());
        expected.append("[29043,17681,D-2,BBIJKLoHIJKLoHAAKoGDDDooGoEEoMFFoooM,51,12,0,12]").append(System.lineSeparator());
        expected.append("[47800,29043,K-3,BBIJoLoHIJoLoHAAooGDDDKoGoEEKMFFooKM,54,13,0,13]").append(System.lineSeparator());
        expected.append("[76420,47800,A+2,BBIJoLoHIJoLoHooAAGDDDKoGoEEKMFFooKM,58,14,0,14]").append(System.lineSeparator());
        expected.append("TN: 114087").append(System.lineSeparator());
        expected.append("EN: 9883").append(System.lineSeparator());
        expected.append("CN: 66537").append(System.lineSeparator());
        expected.append("DF: 15");
        return expected.toString();
    }

    private String getExpectedBFS3() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oEBBBooEGCCoAAGHoooFGHIooFDDIooooooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[4,0,I+1,oEBBBooEGCCoAAGHIooFGHIooFDDoooooooo,5,1,0,1]").append(System.lineSeparator());
        expected.append("[26,4,D+2,oEBBBooEGCCoAAGHIooFGHIooFooDDoooooo,9,2,0,2]").append(System.lineSeparator());
        expected.append("[117,26,G-2,oEBBBooEoCCoAAoHIooFGHIooFGoDDooGooo,13,3,0,3]").append(System.lineSeparator());
        expected.append("[296,117,C-1,oEBBBooECCooAAoHIooFGHIooFGoDDooGooo,18,4,0,4]").append(System.lineSeparator());
        expected.append("[707,296,H-1,oEBBBooECCooAAooIooFGHIooFGHDDooGooo,23,5,0,5]").append(System.lineSeparator());
        expected.append("[1370,707,A+2,oEBBBooECCooooAAIooFGHIooFGHDDooGooo,27,6,0,6]").append(System.lineSeparator());
        expected.append("[2158,1370,E-1,ooBBBooECCoooEAAIooFGHIooFGHDDooGooo,32,7,0,7]").append(System.lineSeparator());
        expected.append("[2822,2158,B-1,oBBBoooECCoooEAAIooFGHIooFGHDDooGooo,37,8,0,8]").append(System.lineSeparator());
        expected.append("[3407,2822,I+2,oBBBIooECCIooEAAoooFGHoooFGHDDooGooo,41,9,0,9]").append(System.lineSeparator());
        expected.append("[3933,3407,A+2,oBBBIooECCIooEooAAoFGHoooFGHDDooGooo,45,10,0,10]").append(System.lineSeparator());
        expected.append("TN: 4313").append(System.lineSeparator());
        expected.append("EN: 527").append(System.lineSeparator());
        expected.append("CN: 3406").append(System.lineSeparator());
        expected.append("DF: 11");
        return expected.toString();
    }

    private String getExpectedDFS7() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oEBBBooEGCCoAAGHoooFGHIooFDDIooooooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[4,0,I+1,oEBBBooEGCCoAAGHIooFGHIooFDDoooooooo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[13092,4,D+2,oEBBBooEGCCoAAGHIooFGHIooFooDDoooooo,9,2,0,-2]").append(System.lineSeparator());
        expected.append("[13318,13092,G-2,oEBBBooEoCCoAAoHIooFGHIooFGoDDooGooo,13,3,0,-3]").append(System.lineSeparator());
        expected.append("[13393,13318,C-1,oEBBBooECCooAAoHIooFGHIooFGoDDooGooo,18,4,0,-4]").append(System.lineSeparator());
        expected.append("[13479,13393,H-1,oEBBBooECCooAAooIooFGHIooFGHDDooGooo,23,5,0,-5]").append(System.lineSeparator());
        expected.append("[13483,13479,A+2,oEBBBooECCooooAAIooFGHIooFGHDDooGooo,27,6,0,-6]").append(System.lineSeparator());
        expected.append("[13497,13483,E-1,ooBBBooECCoooEAAIooFGHIooFGHDDooGooo,32,7,0,-7]").append(System.lineSeparator());
        expected.append("[13503,13497,B-1,oBBBoooECCoooEAAIooFGHIooFGHDDooGooo,37,8,0,-8]").append(System.lineSeparator());
        expected.append("[13519,13503,I+2,oBBBIooECCIooEAAoooFGHoooFGHDDooGooo,41,9,0,-9]").append(System.lineSeparator());
        expected.append("[13528,13519,A+2,oBBBIooECCIooEooAAoFGHoooFGHDDooGooo,45,10,0,-10]").append(System.lineSeparator());
        expected.append("TN: 13534").append(System.lineSeparator());
        expected.append("EN: 1655").append(System.lineSeparator());
        expected.append("CN: 11840").append(System.lineSeparator());
        expected.append("DF: 10");
        return expected.toString();
    }

    private String getExpectedBFS4() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,HBBBCCHJDDEEHJAAKLIFFFKLIoGGGMoooooM,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,G-1,HBBBCCHJDDEEHJAAKLIFFFKLIGGGoMoooooM,5,1,0,1]").append(System.lineSeparator());
        expected.append("[4,1,I-1,HBBBCCHJDDEEHJAAKLoFFFKLIGGGoMIooooM,10,2,0,2]").append(System.lineSeparator());
        expected.append("[13,4,H-1,oBBBCCHJDDEEHJAAKLHFFFKLIGGGoMIooooM,15,3,0,3]").append(System.lineSeparator());
        expected.append("[35,13,B-1,BBBoCCHJDDEEHJAAKLHFFFKLIGGGoMIooooM,20,4,0,4]").append(System.lineSeparator());
        expected.append("[77,35,C-1,BBBCCoHJDDEEHJAAKLHFFFKLIGGGoMIooooM,25,5,0,5]").append(System.lineSeparator());
        expected.append("[129,77,K-2,BBBCCoHJDDEEHJAAoLHFFFoLIGGGKMIoooKM,29,6,0,6]").append(System.lineSeparator());
        expected.append("[180,129,F+1,BBBCCoHJDDEEHJAAoLHoFFFLIGGGKMIoooKM,34,7,0,7]").append(System.lineSeparator());
        expected.append("[235,180,J-1,BBBCCoHoDDEEHJAAoLHJFFFLIGGGKMIoooKM,39,8,0,8]").append(System.lineSeparator());
        expected.append("[281,235,D-1,BBBCCoHDDoEEHJAAoLHJFFFLIGGGKMIoooKM,44,9,0,9]").append(System.lineSeparator());
        expected.append("[332,281,E-1,BBBCCoHDDEEoHJAAoLHJFFFLIGGGKMIoooKM,49,10,0,10]").append(System.lineSeparator());
        expected.append("[382,332,L+2,BBBCCLHDDEELHJAAooHJFFFoIGGGKMIoooKM,53,11,0,11]").append(System.lineSeparator());
        expected.append("[428,382,A+2,BBBCCLHDDEELHJooAAHJFFFoIGGGKMIoooKM,57,12,0,12]").append(System.lineSeparator());
        expected.append("TN: 477").append(System.lineSeparator());
        expected.append("EN: 104").append(System.lineSeparator());
        expected.append("CN: 324").append(System.lineSeparator());
        expected.append("DF: 13");
        return expected.toString();
    }

    private String getExpectedDFS8() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,HBBBCCHJDDEEHJAAKLIFFFKLIoGGGMoooooM,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,G-1,HBBBCCHJDDEEHJAAKLIFFFKLIGGGoMoooooM,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[4,1,I-1,HBBBCCHJDDEEHJAAKLoFFFKLIGGGoMIooooM,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[9,4,H-1,oBBBCCHJDDEEHJAAKLHFFFKLIGGGoMIooooM,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[1298,9,B-1,BBBoCCHJDDEEHJAAKLHFFFKLIGGGoMIooooM,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[1304,1298,C-1,BBBCCoHJDDEEHJAAKLHFFFKLIGGGoMIooooM,25,5,0,-5]").append(System.lineSeparator());
        expected.append("[1311,1304,K-2,BBBCCoHJDDEEHJAAoLHFFFoLIGGGKMIoooKM,29,6,0,-6]").append(System.lineSeparator());
        expected.append("[1330,1311,F+1,BBBCCoHJDDEEHJAAoLHoFFFLIGGGKMIoooKM,34,7,0,-7]").append(System.lineSeparator());
        expected.append("[1357,1330,J-1,BBBCCoHoDDEEHJAAoLHJFFFLIGGGKMIoooKM,39,8,0,-8]").append(System.lineSeparator());
        expected.append("[1360,1357,D-1,BBBCCoHDDoEEHJAAoLHJFFFLIGGGKMIoooKM,44,9,0,-9]").append(System.lineSeparator());
        expected.append("[1365,1360,E-1,BBBCCoHDDEEoHJAAoLHJFFFLIGGGKMIoooKM,49,10,0,-10]").append(System.lineSeparator());
        expected.append("[1370,1365,L+2,BBBCCLHDDEELHJAAooHJFFFoIGGGKMIoooKM,53,11,0,-11]").append(System.lineSeparator());
        expected.append("[1378,1370,A+2,BBBCCLHDDEELHJooAAHJFFFoIGGGKMIoooKM,57,12,0,-12]").append(System.lineSeparator());
        expected.append("TN: 1384").append(System.lineSeparator());
        expected.append("EN: 292").append(System.lineSeparator());
        expected.append("CN: 1070").append(System.lineSeparator());
        expected.append("DF: 12");
        return expected.toString();
    }

    private String getExpectedBFS5() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooooJBBCCoJoAAIoJoGHIoooGHDDDoEEFFF,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A-1,oooooJBBCCoJAAoIoJoGHIoooGHDDDoEEFFF,5,1,0,1]").append(System.lineSeparator());
        expected.append("[6,1,C+1,oooooJBBoCCJAAoIoJoGHIoooGHDDDoEEFFF,10,2,0,2]").append(System.lineSeparator());
        expected.append("[28,6,E-1,oooooJBBoCCJAAoIoJoGHIoooGHDDDEEoFFF,15,3,0,3]").append(System.lineSeparator());
        expected.append("[89,28,F-1,oooooJBBoCCJAAoIoJoGHIoooGHDDDEEFFFo,20,4,0,4]").append(System.lineSeparator());
        expected.append("[216,89,H+3,ooHooJBBHCCJAAoIoJoGoIoooGoDDDEEFFFo,23,5,0,5]").append(System.lineSeparator());
        expected.append("[420,216,D-1,ooHooJBBHCCJAAoIoJoGoIoooGDDDoEEFFFo,28,6,0,6]").append(System.lineSeparator());
        expected.append("[668,420,J-3,ooHoooBBHCCoAAoIoooGoIoJoGDDDJEEFFFJ,31,7,0,7]").append(System.lineSeparator());
        expected.append("[902,668,C+1,ooHoooBBHoCCAAoIoooGoIoJoGDDDJEEFFFJ,36,8,0,8]").append(System.lineSeparator());
        expected.append("[1076,902,I+2,ooHIooBBHICCAAoooooGoooJoGDDDJEEFFFJ,40,9,0,9]").append(System.lineSeparator());
        expected.append("[1248,1076,A+4,ooHIooBBHICCooooAAoGoooJoGDDDJEEFFFJ,42,10,0,10]").append(System.lineSeparator());
        expected.append("TN: 1370").append(System.lineSeparator());
        expected.append("EN: 220").append(System.lineSeparator());
        expected.append("CN: 1028").append(System.lineSeparator());
        expected.append("DF: 11");
        return expected.toString();
    }

    private String getExpectedDFS9() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooooJBBCCoJoAAIoJoGHIoooGHDDDoEEFFF,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A-1,oooooJBBCCoJAAoIoJoGHIoooGHDDDoEEFFF,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[6,1,C+1,oooooJBBoCCJAAoIoJoGHIoooGHDDDoEEFFF,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[13,6,E-1,oooooJBBoCCJAAoIoJoGHIoooGHDDDEEoFFF,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[2037,13,F-1,oooooJBBoCCJAAoIoJoGHIoooGHDDDEEFFFo,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[2218,2037,H+3,ooHooJBBHCCJAAoIoJoGoIoooGoDDDEEFFFo,23,5,0,-5]").append(System.lineSeparator());
        expected.append("[2558,2218,D-1,ooHooJBBHCCJAAoIoJoGoIoooGDDDoEEFFFo,28,6,0,-6]").append(System.lineSeparator());
        expected.append("[2613,2558,J-3,ooHoooBBHCCoAAoIoooGoIoJoGDDDJEEFFFJ,31,7,0,-7]").append(System.lineSeparator());
        expected.append("[2655,2613,C+1,ooHoooBBHoCCAAoIoooGoIoJoGDDDJEEFFFJ,36,8,0,-8]").append(System.lineSeparator());
        expected.append("[2666,2655,I+2,ooHIooBBHICCAAoooooGoooJoGDDDJEEFFFJ,40,9,0,-9]").append(System.lineSeparator());
        expected.append("[2677,2666,A+4,ooHIooBBHICCooooAAoGoooJoGDDDJEEFFFJ,42,10,0,-10]").append(System.lineSeparator());
        expected.append("TN: 2683").append(System.lineSeparator());
        expected.append("EN: 423").append(System.lineSeparator());
        expected.append("CN: 2227").append(System.lineSeparator());
        expected.append("DF: 10");
        return expected.toString();
    }

    private String getExpectedBFS6() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooJBBBoHJoCCoHKAAMGIKLoMGIKLDDGIEEFF,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,C-1,ooJBBBoHJCCooHKAAMGIKLoMGIKLDDGIEEFF,5,1,0,1]").append(System.lineSeparator());
        expected.append("[7,1,G+1,ooJBBBoHJCCoGHKAAMGIKLoMGIKLDDoIEEFF,10,2,0,2]").append(System.lineSeparator());
        expected.append("[37,7,H+1,oHJBBBoHJCCoGoKAAMGIKLoMGIKLDDoIEEFF,15,3,0,3]").append(System.lineSeparator());
        expected.append("[92,37,I+1,oHJBBBoHJCCoGIKAAMGIKLoMGIKLDDooEEFF,20,4,0,4]").append(System.lineSeparator());
        expected.append("[166,92,E-2,oHJBBBoHJCCoGIKAAMGIKLoMGIKLDDEEooFF,24,5,0,5]").append(System.lineSeparator());
        expected.append("[297,166,K-1,oHJBBBoHJCCoGIoAAMGIKLoMGIKLDDEEKoFF,29,6,0,6]").append(System.lineSeparator());
        expected.append("[533,297,J-1,oHoBBBoHJCCoGIJAAMGIKLoMGIKLDDEEKoFF,34,7,0,7]").append(System.lineSeparator());
        expected.append("[805,533,B-1,oHBBBooHJCCoGIJAAMGIKLoMGIKLDDEEKoFF,39,8,0,8]").append(System.lineSeparator());
        expected.append("[1096,805,M+2,oHBBBMoHJCCMGIJAAoGIKLooGIKLDDEEKoFF,43,9,0,9]").append(System.lineSeparator());
        expected.append("[1307,1096,A+1,oHBBBMoHJCCMGIJoAAGIKLooGIKLDDEEKoFF,48,10,0,10]").append(System.lineSeparator());
        expected.append("TN: 1444").append(System.lineSeparator());
        expected.append("EN: 217").append(System.lineSeparator());
        expected.append("CN: 1090").append(System.lineSeparator());
        expected.append("DF: 11");
        return expected.toString();
    }

    private String getExpectedDFS10() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooJBBBoHJoCCoHKAAMGIKLoMGIKLDDGIEEFF,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,C-1,ooJBBBoHJCCooHKAAMGIKLoMGIKLDDGIEEFF,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[7,1,G+1,ooJBBBoHJCCoGHKAAMGIKLoMGIKLDDoIEEFF,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[16,7,H+1,oHJBBBoHJCCoGoKAAMGIKLoMGIKLDDoIEEFF,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[2460,16,I+1,oHJBBBoHJCCoGIKAAMGIKLoMGIKLDDooEEFF,20,4,0,-4]").append(System.lineSeparator());
        expected.append("[2527,2460,E-2,oHJBBBoHJCCoGIKAAMGIKLoMGIKLDDEEooFF,24,5,0,-5]").append(System.lineSeparator());
        expected.append("[2750,2527,K-1,oHJBBBoHJCCoGIoAAMGIKLoMGIKLDDEEKoFF,29,6,0,-6]").append(System.lineSeparator());
        expected.append("[2830,2750,J-1,oHoBBBoHJCCoGIJAAMGIKLoMGIKLDDEEKoFF,34,7,0,-7]").append(System.lineSeparator());
        expected.append("[2858,2830,B-1,oHBBBooHJCCoGIJAAMGIKLoMGIKLDDEEKoFF,39,8,0,-8]").append(System.lineSeparator());
        expected.append("[2873,2858,M+2,oHBBBMoHJCCMGIJAAoGIKLooGIKLDDEEKoFF,43,9,0,-9]").append(System.lineSeparator());
        expected.append("[2888,2873,A+1,oHBBBMoHJCCMGIJoAAGIKLooGIKLDDEEKoFF,48,10,0,-10]").append(System.lineSeparator());
        expected.append("TN: 2895").append(System.lineSeparator());
        expected.append("EN: 417").append(System.lineSeparator());
        expected.append("CN: 2444").append(System.lineSeparator());
        expected.append("DF: 10");
        return expected.toString();
    }

    private String getExpectedBFS7() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooHIBBooHIJKAAooJKCCCoJLGDDDoLGEEFFL,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,ooHIBBooHIJKoAAoJKCCCoJLGDDDoLGEEFFL,5,1,0,1]").append(System.lineSeparator());
        expected.append("[11,1,C+1,ooHIBBooHIJKoAAoJKoCCCJLGDDDoLGEEFFL,10,2,0,2]").append(System.lineSeparator());
        expected.append("[70,11,G+3,ooHIBBGoHIJKGAAoJKoCCCJLoDDDoLoEEFFL,13,3,0,3]").append(System.lineSeparator());
        expected.append("[252,70,C-1,ooHIBBGoHIJKGAAoJKCCCoJLoDDDoLoEEFFL,18,4,0,4]").append(System.lineSeparator());
        expected.append("[735,252,D-1,ooHIBBGoHIJKGAAoJKCCCoJLDDDooLoEEFFL,23,5,0,5]").append(System.lineSeparator());
        expected.append("[1804,735,E-1,ooHIBBGoHIJKGAAoJKCCCoJLDDDooLEEoFFL,28,6,0,6]").append(System.lineSeparator());
        expected.append("[3689,1804,F-1,ooHIBBGoHIJKGAAoJKCCCoJLDDDooLEEFFoL,33,7,0,7]").append(System.lineSeparator());
        expected.append("[6552,3689,I-3,ooHoBBGoHoJKGAAoJKCCCIJLDDDIoLEEFFoL,36,8,0,8]").append(System.lineSeparator());
        expected.append("[10478,6552,B-1,ooHBBoGoHoJKGAAoJKCCCIJLDDDIoLEEFFoL,41,9,0,9]").append(System.lineSeparator());
        expected.append("[15705,10478,J-2,ooHBBoGoHooKGAAooKCCCIJLDDDIJLEEFFJL,45,10,0,10]").append(System.lineSeparator());
        expected.append("[22368,15705,K+1,ooHBBKGoHooKGAAoooCCCIJLDDDIJLEEFFJL,50,11,0,11]").append(System.lineSeparator());
        expected.append("[30377,22368,A+3,ooHBBKGoHooKGoooAACCCIJLDDDIJLEEFFJL,53,12,0,12]").append(System.lineSeparator());
        expected.append("TN: 39004").append(System.lineSeparator());
        expected.append("EN: 4152").append(System.lineSeparator());
        expected.append("CN: 26225").append(System.lineSeparator());
        expected.append("DF: 13");
        return expected.toString();
    }

    private String getExpectedDFS11() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooHIBBooHIJKAAooJKCCCoJLGDDDoLGEEFFL,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,ooHIBBooHIJKoAAoJKCCCoJLGDDDoLGEEFFL,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[11,1,C+1,ooHIBBooHIJKoAAoJKoCCCJLGDDDoLGEEFFL,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[47663,11,G+3,ooHIBBGoHIJKGAAoJKoCCCJLoDDDoLoEEFFL,13,3,0,-3]").append(System.lineSeparator());
        expected.append("[65644,47663,C-1,ooHIBBGoHIJKGAAoJKCCCoJLoDDDoLoEEFFL,18,4,0,-4]").append(System.lineSeparator());
        expected.append("[65657,65644,D-1,ooHIBBGoHIJKGAAoJKCCCoJLDDDooLoEEFFL,23,5,0,-5]").append(System.lineSeparator());
        expected.append("[65667,65657,E-1,ooHIBBGoHIJKGAAoJKCCCoJLDDDooLEEoFFL,28,6,0,-6]").append(System.lineSeparator());
        expected.append("[65678,65667,F-1,ooHIBBGoHIJKGAAoJKCCCoJLDDDooLEEFFoL,33,7,0,-7]").append(System.lineSeparator());
        expected.append("[65692,65678,I-3,ooHoBBGoHoJKGAAoJKCCCIJLDDDIoLEEFFoL,36,8,0,-8]").append(System.lineSeparator());
        expected.append("[65888,65692,B-1,ooHBBoGoHoJKGAAoJKCCCIJLDDDIoLEEFFoL,41,9,0,-9]").append(System.lineSeparator());
        expected.append("[65949,65888,J-2,ooHBBoGoHooKGAAooKCCCIJLDDDIJLEEFFJL,45,10,0,-10]").append(System.lineSeparator());
        expected.append("[65977,65949,K+1,ooHBBKGoHooKGAAoooCCCIJLDDDIJLEEFFJL,50,11,0,-11]").append(System.lineSeparator());
        expected.append("[65986,65977,A+3,ooHBBKGoHooKGoooAACCCIJLDDDIJLEEFFJL,53,12,0,-12]").append(System.lineSeparator());
        expected.append("TN: 65994").append(System.lineSeparator());
        expected.append("EN: 7263").append(System.lineSeparator());
        expected.append("CN: 58675").append(System.lineSeparator());
        expected.append("DF: 12");
        return expected.toString();
    }

    private String getExpectedBFS8() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,GIBBCCGIoooLGAAoKLHDDoKoHoJEEoFFJooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,GIBBCCGIoooLGoAAKLHDDoKoHoJEEoFFJooo,5,1,0,1]").append(System.lineSeparator());
        expected.append("[11,1,I-1,GoBBCCGIoooLGIAAKLHDDoKoHoJEEoFFJooo,10,2,0,2]").append(System.lineSeparator());
        expected.append("[76,11,K+1,GoBBCCGIooKLGIAAKLHDDoooHoJEEoFFJooo,15,3,0,3]").append(System.lineSeparator());
        expected.append("[302,76,D+2,GoBBCCGIooKLGIAAKLHooDDoHoJEEoFFJooo,19,4,0,4]").append(System.lineSeparator());
        expected.append("[799,302,J+1,GoBBCCGIooKLGIAAKLHoJDDoHoJEEoFFoooo,24,5,0,5]").append(System.lineSeparator());
        expected.append("[1651,799,F+1,GoBBCCGIooKLGIAAKLHoJDDoHoJEEooFFooo,29,6,0,6]").append(System.lineSeparator());
        expected.append("[3221,1651,H-1,GoBBCCGIooKLGIAAKLooJDDoHoJEEoHFFooo,34,7,0,7]").append(System.lineSeparator());
        expected.append("[6202,3221,G-1,ooBBCCGIooKLGIAAKLGoJDDoHoJEEoHFFooo,39,8,0,8]").append(System.lineSeparator());
        expected.append("[11824,6202,B-2,BBooCCGIooKLGIAAKLGoJDDoHoJEEoHFFooo,43,9,0,9]").append(System.lineSeparator());
        expected.append("[20967,11824,C-2,BBCCooGIooKLGIAAKLGoJDDoHoJEEoHFFooo,47,10,0,10]").append(System.lineSeparator());
        expected.append("[34365,20967,K+1,BBCCKoGIooKLGIAAoLGoJDDoHoJEEoHFFooo,52,11,0,11]").append(System.lineSeparator());
        expected.append("[51580,34365,L+1,BBCCKLGIooKLGIAAooGoJDDoHoJEEoHFFooo,57,12,0,12]").append(System.lineSeparator());
        expected.append("[71192,51580,A+2,BBCCKLGIooKLGIooAAGoJDDoHoJEEoHFFooo,61,13,0,13]").append(System.lineSeparator());
        expected.append("TN: 89208").append(System.lineSeparator());
        expected.append("EN: 7473").append(System.lineSeparator());
        expected.append("CN: 63719").append(System.lineSeparator());
        expected.append("DF: 14");
        return expected.toString();
    }

    private String getExpectedDFS12() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,GIBBCCGIoooLGAAoKLHDDoKoHoJEEoFFJooo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,GIBBCCGIoooLGoAAKLHDDoKoHoJEEoFFJooo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[11,1,I-1,GoBBCCGIoooLGIAAKLHDDoKoHoJEEoFFJooo,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[187208,11,K+1,GoBBCCGIooKLGIAAKLHDDoooHoJEEoFFJooo,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[192819,187208,D+2,GoBBCCGIooKLGIAAKLHooDDoHoJEEoFFJooo,19,4,0,-4]").append(System.lineSeparator());
        expected.append("[192835,192819,J+1,GoBBCCGIooKLGIAAKLHoJDDoHoJEEoFFoooo,24,5,0,-5]").append(System.lineSeparator());
        expected.append("[192842,192835,F+1,GoBBCCGIooKLGIAAKLHoJDDoHoJEEooFFooo,29,6,0,-6]").append(System.lineSeparator());
        expected.append("[192860,192842,H-1,GoBBCCGIooKLGIAAKLooJDDoHoJEEoHFFooo,34,7,0,-7]").append(System.lineSeparator());
        expected.append("[192873,192860,G-1,ooBBCCGIooKLGIAAKLGoJDDoHoJEEoHFFooo,39,8,0,-8]").append(System.lineSeparator());
        expected.append("[192882,192873,B-2,BBooCCGIooKLGIAAKLGoJDDoHoJEEoHFFooo,43,9,0,-9]").append(System.lineSeparator());
        expected.append("[192898,192882,C-2,BBCCooGIooKLGIAAKLGoJDDoHoJEEoHFFooo,47,10,0,-10]").append(System.lineSeparator());
        expected.append("[192982,192898,K+1,BBCCKoGIooKLGIAAoLGoJDDoHoJEEoHFFooo,52,11,0,-11]").append(System.lineSeparator());
        expected.append("[192996,192982,L+1,BBCCKLGIooKLGIAAooGoJDDoHoJEEoHFFooo,57,12,0,-12]").append(System.lineSeparator());
        expected.append("[193015,192996,A+2,BBCCKLGIooKLGIooAAGoJDDoHoJEEoHFFooo,61,13,0,-13]").append(System.lineSeparator());
        expected.append("TN: 193028").append(System.lineSeparator());
        expected.append("EN: 16469").append(System.lineSeparator());
        expected.append("CN: 176471").append(System.lineSeparator());
        expected.append("DF: 13");
        return expected.toString();
    }

    private String getExpectedBFS9() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooGoooooGHIAAoGHIEBBCCJEoFooJEoFDDD,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,oooGoooooGHIoAAGHIEBBCCJEoFooJEoFDDD,5,1,0,1]").append(System.lineSeparator());
        expected.append("[7,1,E+3,EooGooEooGHIEAAGHIoBBCCJooFooJooFDDD,8,2,0,2]").append(System.lineSeparator());
        expected.append("[27,7,B-1,EooGooEooGHIEAAGHIBBoCCJooFooJooFDDD,13,3,0,3]").append(System.lineSeparator());
        expected.append("[77,27,F+1,EooGooEooGHIEAAGHIBBFCCJooFooJoooDDD,18,4,0,4]").append(System.lineSeparator());
        expected.append("[138,77,D-3,EooGooEooGHIEAAGHIBBFCCJooFooJDDDooo,21,5,0,5]").append(System.lineSeparator());
        expected.append("[216,138,H+1,EooGHoEooGHIEAAGoIBBFCCJooFooJDDDooo,26,6,0,6]").append(System.lineSeparator());
        expected.append("[314,216,I+1,EooGHIEooGHIEAAGooBBFCCJooFooJDDDooo,31,7,0,7]").append(System.lineSeparator());
        expected.append("[447,314,J-1,EooGHIEooGHIEAAGooBBFCCoooFooJDDDooJ,36,8,0,8]").append(System.lineSeparator());
        expected.append("[584,447,C+1,EooGHIEooGHIEAAGooBBFoCCooFooJDDDooJ,41,9,0,9]").append(System.lineSeparator());
        expected.append("[700,584,G-3,EoooHIEoooHIEAAoooBBFGCCooFGoJDDDGoJ,44,10,0,10]").append(System.lineSeparator());
        expected.append("[787,700,A+3,EoooHIEoooHIEoooAABBFGCCooFGoJDDDGoJ,47,11,0,11]").append(System.lineSeparator());
        expected.append("TN: 818").append(System.lineSeparator());
        expected.append("EN: 136").append(System.lineSeparator());
        expected.append("CN: 651").append(System.lineSeparator());
        expected.append("DF: 12");
        return expected.toString();
    }

    private String getExpectedDFS13() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oooGoooooGHIAAoGHIEBBCCJEoFooJEoFDDD,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,oooGoooooGHIoAAGHIEBBCCJEoFooJEoFDDD,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[7,1,E+3,EooGooEooGHIEAAGHIoBBCCJooFooJooFDDD,8,2,0,-2]").append(System.lineSeparator());
        expected.append("[2120,7,B-1,EooGooEooGHIEAAGHIBBoCCJooFooJooFDDD,13,3,0,-3]").append(System.lineSeparator());
        expected.append("[2128,2120,F+1,EooGooEooGHIEAAGHIBBFCCJooFooJoooDDD,18,4,0,-4]").append(System.lineSeparator());
        expected.append("[2191,2128,D-3,EooGooEooGHIEAAGHIBBFCCJooFooJDDDooo,21,5,0,-5]").append(System.lineSeparator());
        expected.append("[2506,2191,H+1,EooGHoEooGHIEAAGoIBBFCCJooFooJDDDooo,26,6,0,-6]").append(System.lineSeparator());
        expected.append("[2513,2506,I+1,EooGHIEooGHIEAAGooBBFCCJooFooJDDDooo,31,7,0,-7]").append(System.lineSeparator());
        expected.append("[2521,2513,J-1,EooGHIEooGHIEAAGooBBFCCoooFooJDDDooJ,36,8,0,-8]").append(System.lineSeparator());
        expected.append("[2528,2521,C+1,EooGHIEooGHIEAAGooBBFoCCooFooJDDDooJ,41,9,0,-9]").append(System.lineSeparator());
        expected.append("[2541,2528,G-3,EoooHIEoooHIEAAoooBBFGCCooFGoJDDDGoJ,44,10,0,-10]").append(System.lineSeparator());
        expected.append("[2560,2541,A+3,EoooHIEoooHIEoooAABBFGCCooFGoJDDDGoJ,47,11,0,-11]").append(System.lineSeparator());
        expected.append("TN: 2566").append(System.lineSeparator());
        expected.append("EN: 432").append(System.lineSeparator());
        expected.append("CN: 2102").append(System.lineSeparator());
        expected.append("DF: 11");
        return expected.toString();
    }

    private String getExpectedBFS10() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBoooKCCCooKAAoooKJDDEEEJFFGGGJHHIII,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,BBoooKCCCooKoAAooKJDDEEEJFFGGGJHHIII,5,1,0,1]").append(System.lineSeparator());
        expected.append("[12,1,B+1,oBBooKCCCooKoAAooKJDDEEEJFFGGGJHHIII,10,2,0,2]").append(System.lineSeparator());
        expected.append("[82,12,C+1,oBBooKoCCCoKoAAooKJDDEEEJFFGGGJHHIII,15,3,0,3]").append(System.lineSeparator());
        expected.append("[302,82,J+3,JBBooKJCCCoKJAAooKoDDEEEoFFGGGoHHIII,18,4,0,4]").append(System.lineSeparator());
        expected.append("[745,302,D-1,JBBooKJCCCoKJAAooKDDoEEEoFFGGGoHHIII,23,5,0,5]").append(System.lineSeparator());
        expected.append("[1629,745,E-1,JBBooKJCCCoKJAAooKDDEEEooFFGGGoHHIII,28,6,0,6]").append(System.lineSeparator());
        expected.append("[3041,1629,F-1,JBBooKJCCCoKJAAooKDDEEEoFFoGGGoHHIII,33,7,0,7]").append(System.lineSeparator());
        expected.append("[4912,3041,G-1,JBBooKJCCCoKJAAooKDDEEEoFFGGGooHHIII,38,8,0,8]").append(System.lineSeparator());
        expected.append("[6713,4912,H-1,JBBooKJCCCoKJAAooKDDEEEoFFGGGoHHoIII,43,9,0,9]").append(System.lineSeparator());
        expected.append("[8337,6713,I-1,JBBooKJCCCoKJAAooKDDEEEoFFGGGoHHIIIo,48,10,0,10]").append(System.lineSeparator());
        expected.append("[9707,8337,K-3,JBBoooJCCCooJAAoooDDEEEKFFGGGKHHIIIK,51,11,0,11]").append(System.lineSeparator());
        expected.append("[10783,9707,A+3,JBBoooJCCCooJoooAADDEEEKFFGGGKHHIIIK,54,12,0,12]").append(System.lineSeparator());
        expected.append("TN: 11661").append(System.lineSeparator());
        expected.append("EN: 1176").append(System.lineSeparator());
        expected.append("CN: 9607").append(System.lineSeparator());
        expected.append("DF: 13");
        return expected.toString();
    }

    private String getExpectedDFS14() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,BBoooKCCCooKAAoooKJDDEEEJFFGGGJHHIII,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,A+1,BBoooKCCCooKoAAooKJDDEEEJFFGGGJHHIII,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[12,1,B+1,oBBooKCCCooKoAAooKJDDEEEJFFGGGJHHIII,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[40951,12,C+1,oBBooKoCCCoKoAAooKJDDEEEJFFGGGJHHIII,15,3,0,-3]").append(System.lineSeparator());
        expected.append("[43214,40951,J+3,JBBooKJCCCoKJAAooKoDDEEEoFFGGGoHHIII,18,4,0,-4]").append(System.lineSeparator());
        expected.append("[44316,43214,D-1,JBBooKJCCCoKJAAooKDDoEEEoFFGGGoHHIII,23,5,0,-5]").append(System.lineSeparator());
        expected.append("[44328,44316,E-1,JBBooKJCCCoKJAAooKDDEEEooFFGGGoHHIII,28,6,0,-6]").append(System.lineSeparator());
        expected.append("[44337,44328,F-1,JBBooKJCCCoKJAAooKDDEEEoFFoGGGoHHIII,33,7,0,-7]").append(System.lineSeparator());
        expected.append("[44347,44337,G-1,JBBooKJCCCoKJAAooKDDEEEoFFGGGooHHIII,38,8,0,-8]").append(System.lineSeparator());
        expected.append("[44357,44347,H-1,JBBooKJCCCoKJAAooKDDEEEoFFGGGoHHoIII,43,9,0,-9]").append(System.lineSeparator());
        expected.append("[44368,44357,I-1,JBBooKJCCCoKJAAooKDDEEEoFFGGGoHHIIIo,48,10,0,-10]").append(System.lineSeparator());
        expected.append("[44381,44368,K-3,JBBoooJCCCooJAAoooDDEEEKFFGGGKHHIIIK,51,11,0,-11]").append(System.lineSeparator());
        expected.append("[44406,44381,A+3,JBBoooJCCCooJoooAADDEEEKFFGGGKHHIIIK,54,12,0,-12]").append(System.lineSeparator());
        expected.append("TN: 44415").append(System.lineSeparator());
        expected.append("EN: 4485").append(System.lineSeparator());
        expected.append("CN: 39892").append(System.lineSeparator());
        expected.append("DF: 12");
        return expected.toString();
    }

    private String getExpectedBFS11() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooFoooooFBBBAAFooHoECCoHoEoGoHDDDGoo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,C+1,ooFoooooFBBBAAFooHoEoCCHoEoGoHDDDGoo,5,1,0,1]").append(System.lineSeparator());
        expected.append("[5,1,F-2,oooooooooBBBAAFooHoEFCCHoEFGoHDDDGoo,9,2,0,2]").append(System.lineSeparator());
        expected.append("[14,5,B-3,ooooooBBBoooAAFooHoEFCCHoEFGoHDDDGoo,12,3,0,3]").append(System.lineSeparator());
        expected.append("[41,14,H+2,oooooHBBBooHAAFooHoEFCCooEFGooDDDGoo,16,4,0,4]").append(System.lineSeparator());
        expected.append("[90,41,C+1,oooooHBBBooHAAFooHoEFoCCoEFGooDDDGoo,21,5,0,5]").append(System.lineSeparator());
        expected.append("[116,90,G+4,oooGoHBBBGoHAAFooHoEFoCCoEFoooDDDooo,23,6,0,6]").append(System.lineSeparator());
        expected.append("[171,116,C-1,oooGoHBBBGoHAAFooHoEFCCooEFoooDDDooo,28,7,0,7]").append(System.lineSeparator());
        expected.append("[352,171,D+3,oooGoHBBBGoHAAFooHoEFCCooEFooooooDDD,31,8,0,8]").append(System.lineSeparator());
        expected.append("[589,352,F-1,oooGoHBBBGoHAAoooHoEFCCooEFoooooFDDD,36,9,0,9]").append(System.lineSeparator());
        expected.append("[922,589,A+3,oooGoHBBBGoHoooAAHoEFCCooEFoooooFDDD,39,10,0,10]").append(System.lineSeparator());
        expected.append("[1273,922,F+1,oooGoHBBBGoHooFAAHoEFCCooEFooooooDDD,44,11,0,11]").append(System.lineSeparator());
        expected.append("[1577,1273,D-1,oooGoHBBBGoHooFAAHoEFCCooEFoooooDDDo,49,12,0,12]").append(System.lineSeparator());
        expected.append("[1879,1577,H-3,oooGooBBBGooooFAAooEFCCHoEFooHooDDDH,52,13,0,13]").append(System.lineSeparator());
        expected.append("[2076,1879,A+1,oooGooBBBGooooFoAAoEFCCHoEFooHooDDDH,57,14,0,14]").append(System.lineSeparator());
        expected.append("TN: 2332").append(System.lineSeparator());
        expected.append("EN: 340").append(System.lineSeparator());
        expected.append("CN: 1736").append(System.lineSeparator());
        expected.append("DF: 15");
        return expected.toString();
    }

    private String getExpectedDFS15() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,ooFoooooFBBBAAFooHoECCoHoEoGoHDDDGoo,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,C+1,ooFoooooFBBBAAFooHoEoCCHoEoGoHDDDGoo,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[5,1,F-2,oooooooooBBBAAFooHoEFCCHoEFGoHDDDGoo,9,2,0,-2]").append(System.lineSeparator());
        expected.append("[6825,5,B-3,ooooooBBBoooAAFooHoEFCCHoEFGoHDDDGoo,12,3,0,-3]").append(System.lineSeparator());
        expected.append("[7566,6825,H+2,oooooHBBBooHAAFooHoEFCCooEFGooDDDGoo,16,4,0,-4]").append(System.lineSeparator());
        expected.append("[7575,7566,C+1,oooooHBBBooHAAFooHoEFoCCoEFGooDDDGoo,21,5,0,-5]").append(System.lineSeparator());
        expected.append("[7585,7575,G+4,oooGoHBBBGoHAAFooHoEFoCCoEFoooDDDooo,23,6,0,-6]").append(System.lineSeparator());
        expected.append("[8178,7585,C-1,oooGoHBBBGoHAAFooHoEFCCooEFoooDDDooo,28,7,0,-7]").append(System.lineSeparator());
        expected.append("[8189,8178,D+3,oooGoHBBBGoHAAFooHoEFCCooEFooooooDDD,31,8,0,-8]").append(System.lineSeparator());
        expected.append("[8283,8189,F-1,oooGoHBBBGoHAAoooHoEFCCooEFoooooFDDD,36,9,0,-9]").append(System.lineSeparator());
        expected.append("[8428,8283,A+3,oooGoHBBBGoHoooAAHoEFCCooEFoooooFDDD,39,10,0,-10]").append(System.lineSeparator());
        expected.append("[8501,8428,F+1,oooGoHBBBGoHooFAAHoEFCCooEFooooooDDD,44,11,0,-11]").append(System.lineSeparator());
        expected.append("[8574,8501,D-1,oooGoHBBBGoHooFAAHoEFCCooEFoooooDDDo,49,12,0,-12]").append(System.lineSeparator());
        expected.append("[8590,8574,H-3,oooGooBBBGooooFAAooEFCCHoEFooHooDDDH,52,13,0,-13]").append(System.lineSeparator());
        expected.append("[8607,8590,A+1,oooGooBBBGooooFoAAoEFCCHoEFooHooDDDH,57,14,0,-14]").append(System.lineSeparator());
        expected.append("TN: 8615").append(System.lineSeparator());
        expected.append("EN: 1239").append(System.lineSeparator());
        expected.append("CN: 7330").append(System.lineSeparator());
        expected.append("DF: 14");
        return expected.toString();
    }

    private String getExpectedBFS12() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oBBHCCDDDHIJAAFoIJooFooKooGooKooGoEE,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,B-1,BBoHCCDDDHIJAAFoIJooFooKooGooKooGoEE,5,1,0,1]").append(System.lineSeparator());
        expected.append("[10,1,E-1,BBoHCCDDDHIJAAFoIJooFooKooGooKooGEEo,10,2,0,2]").append(System.lineSeparator());
        expected.append("[87,10,H-3,BBooCCDDDoIJAAFoIJooFHoKooGHoKooGEEo,13,3,0,3]").append(System.lineSeparator());
        expected.append("[422,87,C-1,BBoCCoDDDoIJAAFoIJooFHoKooGHoKooGEEo,18,4,0,4]").append(System.lineSeparator());
        expected.append("[1347,422,I-2,BBoCCoDDDooJAAFooJooFHIKooGHIKooGEEo,22,5,0,5]").append(System.lineSeparator());
        expected.append("[3064,1347,K-1,BBoCCoDDDooJAAFooJooFHIoooGHIKooGEEK,27,6,0,6]").append(System.lineSeparator());
        expected.append("[5378,3064,J-1,BBoCCoDDDoooAAFooJooFHIJooGHIKooGEEK,32,7,0,7]").append(System.lineSeparator());
        expected.append("[7673,5378,D+3,BBoCCooooDDDAAFooJooFHIJooGHIKooGEEK,35,8,0,8]").append(System.lineSeparator());
        expected.append("[9054,7673,F+2,BBFCCoooFDDDAAoooJoooHIJooGHIKooGEEK,39,9,0,9]").append(System.lineSeparator());
        expected.append("[9473,9054,A+3,BBFCCoooFDDDoooAAJoooHIJooGHIKooGEEK,42,10,0,10]").append(System.lineSeparator());
        expected.append("[10128,9473,F-2,BBoCCooooDDDooFAAJooFHIJooGHIKooGEEK,46,11,0,11]").append(System.lineSeparator());
        expected.append("[11505,10128,D-1,BBoCCoooDDDoooFAAJooFHIJooGHIKooGEEK,51,12,0,12]").append(System.lineSeparator());
        expected.append("[13242,11505,J+2,BBoCCJooDDDJooFAAoooFHIoooGHIKooGEEK,55,13,0,13]").append(System.lineSeparator());
        expected.append("[14898,13242,A+1,BBoCCJooDDDJooFoAAooFHIoooGHIKooGEEK,60,14,0,14]").append(System.lineSeparator());
        expected.append("TN: 17093").append(System.lineSeparator());
        expected.append("EN: 1777").append(System.lineSeparator());
        expected.append("CN: 13121").append(System.lineSeparator());
        expected.append("DF: 15");
        return expected.toString();
    }

    private String getExpectedDFS16() {
        StringBuilder expected = new StringBuilder();
        expected.append("[0,none,___,oBBHCCDDDHIJAAFoIJooFooKooGooKooGoEE,0,0,0,0]").append(System.lineSeparator());
        expected.append("[1,0,B-1,BBoHCCDDDHIJAAFoIJooFooKooGooKooGoEE,5,1,0,-1]").append(System.lineSeparator());
        expected.append("[10,1,E-1,BBoHCCDDDHIJAAFoIJooFooKooGooKooGEEo,10,2,0,-2]").append(System.lineSeparator());
        expected.append("[21,10,H-3,BBooCCDDDoIJAAFoIJooFHoKooGHoKooGEEo,13,3,0,-3]").append(System.lineSeparator());
        expected.append("[70459,21,C-1,BBoCCoDDDoIJAAFoIJooFHoKooGHoKooGEEo,18,4,0,-4]").append(System.lineSeparator());
        expected.append("[70925,70459,I-2,BBoCCoDDDooJAAFooJooFHIKooGHIKooGEEo,22,5,0,-5]").append(System.lineSeparator());
        expected.append("[71994,70925,K-1,BBoCCoDDDooJAAFooJooFHIoooGHIKooGEEK,27,6,0,-6]").append(System.lineSeparator());
        expected.append("[72099,71994,J-1,BBoCCoDDDoooAAFooJooFHIJooGHIKooGEEK,32,7,0,-7]").append(System.lineSeparator());
        expected.append("[72106,72099,D+3,BBoCCooooDDDAAFooJooFHIJooGHIKooGEEK,35,8,0,-8]").append(System.lineSeparator());
        expected.append("[72120,72106,F+2,BBFCCoooFDDDAAoooJoooHIJooGHIKooGEEK,39,9,0,-9]").append(System.lineSeparator());
        expected.append("[72198,72120,A+3,BBFCCoooFDDDoooAAJoooHIJooGHIKooGEEK,42,10,0,-10]").append(System.lineSeparator());
        expected.append("[72323,72198,F-2,BBoCCooooDDDooFAAJooFHIJooGHIKooGEEK,46,11,0,-11]").append(System.lineSeparator());
        expected.append("[72380,72323,D-1,BBoCCoooDDDoooFAAJooFHIJooGHIKooGEEK,51,12,0,-12]").append(System.lineSeparator());
        expected.append("[72419,72380,J+2,BBoCCJooDDDJooFAAoooFHIoooGHIKooGEEK,55,13,0,-13]").append(System.lineSeparator());
        expected.append("[72428,72419,A+1,BBoCCJooDDDJooFoAAooFHIoooGHIKooGEEK,60,14,0,-14]").append(System.lineSeparator());
        expected.append("TN: 72437").append(System.lineSeparator());
        expected.append("EN: 7454").append(System.lineSeparator());
        expected.append("CN: 64925").append(System.lineSeparator());
        expected.append("DF: 14");
        return expected.toString();
    }
}