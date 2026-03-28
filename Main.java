public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder names = new StringBuilder();

        for (String name : args) {
            names.append(name).append(", ");
        }

        names.setLength(names.length() - 2);

        System.out.println("Hello, " + names + "!");
    }
}