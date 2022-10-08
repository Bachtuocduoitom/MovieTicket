import java.sql.SQLOutput;
import java.util.Scanner;

public class MovieTicket {
    public static final String CHILDREN = "children";
    public static final String  MAN = "man";
    public static final String  WOMAN = "woman";


    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            Thread.sleep(200);
            System.out.println("Gender: ");
            String type = scan.next();
            double height;//by centimeters

            switch (type) {
                case CHILDREN -> {
                    System.out.println("Free" + "\n");
                }
                case MAN -> {
                    System.out.println("Height: ");
                    height = scan.nextDouble();
                    System.out.println(manPrice(height) + "\n");
                }
                case WOMAN -> {
                    System.out.println("Height: ");
                    height = scan.nextDouble();
                    System.out.println(womanPrice(height) + "\n");
                }
                default -> throw new IllegalArgumentException("unknown type " + "\"" + type + "\"");

            }
        }

    }

    public static String manPrice(double height) {
        if (height > 165 ) {
            return "No discount";
        } else if (height > 0 && height <= 165) {
            return "Discount 50%";
        } else {
            return "Invalid height";
        }
    }

    public static String womanPrice(double height) {
        if (height > 155 ) {
            return "No discount";
        } else if (height > 0 && height <= 155) {
            return "Discount 50%";
        } else {
            return "Invalid height";
        }
    }

}
