public class BannerAppUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization using String.join()
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", "WELCOME", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", "TO", " ", "OOPS", " ", " ", "*"),
            String.join("", "*", " ", "BANNER", " ", "APPLICATION", " ", "*"),
            String.join("", "*", " ", "USING", " ", "ARRAYS", " ", "*"),
            String.join("", "*", " ", "AND", " ", "STRING.JOIN()", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
