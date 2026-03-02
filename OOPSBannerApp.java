/**
 * OOPSBannerApp
 * UC4: Display OOPS Banner using Array and Loop
 *
 * @author Shivika Chaubey
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Creating banner lines using String.join()
        String[] banner = {

                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*      ", "*      ", "      *"),
                String.join("   ", "*     *", "*      ", "*      ", "      *"),
                String.join("   ", " ***** ", "*      ", " ***** ", " ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}