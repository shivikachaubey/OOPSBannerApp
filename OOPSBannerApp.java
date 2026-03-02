

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declaration + initialization in one statement
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*      ", "*      ", "      *"),
                String.join("   ", "*     *", "*      ", "*      ", "      *"),
                String.join("   ", " ***** ", "*      ", " ***** ", " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}