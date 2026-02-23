public class Stringjoin {
    public static void main(String[] args) {
        String[] oops = {
            String.join(" ", "OOOOO", "OOOOO", "PPPPP", "SSSSS"),
            String.join(" ", "OO OO", "OO OO", "PP PP", "SS"),
            String.join(" ", "OO OO", "OO OO", "PP PP", "SS"),
            String.join(" ", "OO OO", "OO OO", "PPPPP", "SSSSS"),
            String.join(" ", "OO OO", "OO OO", "PP",   "SS"),
            String.join(" ", "OO OO", "OO OO", "PP",   "SS"),
            String.join(" ", "OOOOO", "OOOOO", "PP",   "SSSSS"),
            "",
            "          OOPS          "
        };

        for (String line : oops) {
            System.out.println(line);
        }
    }
}
