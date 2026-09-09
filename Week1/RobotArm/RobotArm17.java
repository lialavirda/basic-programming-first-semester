public class RobotArm17 {
    public static void main(String[] args) {
        String trayA =  "Star Ball";
        String trayB = "Moon Ball";
        String trayC = "Empty";

        //Step 1
        trayC = trayA;
        trayA = "Empty";

        System.out.println("After step 1: Tray A = " + trayA
            +", Tray B = " + trayB
            +", Tray C = " + trayC);
        
        //Step 2
        trayA = trayB;
        trayB = "Empty";

        System.out.println("After step 2: Tray A = " + trayA
            +", Tray B = " + trayB
            +", Tray C = " + trayC);

        //Step 3
        trayB = trayC;
        trayC = "Empty";

        System.out.println("After step 3: Tray A = " + trayA
            +", Tray B = " + trayB
            +", Tray C = " + trayC);

        System.out.println("Conclusion: the correct statement are \"(a) The two balls have swapped places\" and \"(e) Tray C is empty\"");
    }
}