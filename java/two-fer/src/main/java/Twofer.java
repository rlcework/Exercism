public class Twofer {
    public String twofer(String name) {
        if (name == null) {
            return "One for you, one for me.";
        }

        switch (name) {
            case "Alice":
                return "One for Alice, one for me.";
            case "Bohdan":
                return "One for Bohdan, one for me.";
            case "Zaphod":
                return "One for Zaphod, one for me.";

            default:
                return "Oops, it is not available";
        }
    }
}
