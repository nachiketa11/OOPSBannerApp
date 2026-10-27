public class Program {
    public static String[] getOPattern() {
        return new String[] {
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            "*****",
            "*   *",
            "*****",
            "*    ",
            "*    "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "******",
            "*     ",
            "******",
            "     *",
            "******"
        };
    }

    public static String[] renderBanner() {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        String[] banner = new String[oPattern.length];

        for (int i = 0; i < banner.length; i++) {
            banner[i] = oPattern[i] + " " + oPattern[i] + " "
                    + pPattern[i] + " " + sPattern[i];
        }
        return banner;
    }

    public static void main(String[] args) {
        for (String line : renderBanner()) {
            System.out.println(line);
        }
    }
}
