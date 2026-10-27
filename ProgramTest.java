public class ProgramTest {
    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    public static void main(String[] args) {
        assertTrue(Program.getOPattern().length == 5, "O pattern should have five rows");
        assertTrue(Program.getPPattern().length == 5, "P pattern should have five rows");
        assertTrue(Program.getSPattern().length == 5, "S pattern should have five rows");

        for (String row : Program.getOPattern()) {
            assertTrue(row.length() == 5, "O pattern rows should be five characters wide");
        }
        for (String row : Program.getPPattern()) {
            assertTrue(row.length() == 5, "P pattern rows should be five characters wide");
        }
        for (String row : Program.getSPattern()) {
            assertTrue(row.length() == 6, "S pattern rows should be six characters wide");
        }

        String[] banner = Program.renderBanner();
        assertTrue(banner.length == 5, "Banner should have five rows");
        assertTrue(banner[0].equals("***** ***** ***** ******"),
                "First banner row should combine OOPS patterns");
        System.out.println("All banner tests passed.");
    }
}
