public class Main {
    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "World";
        } else {
            StringBuilder names = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            message = names.toString();
        }

        System.out.println("Hello " + message);
    }
}