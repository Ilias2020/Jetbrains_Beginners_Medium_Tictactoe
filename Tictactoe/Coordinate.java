import java.util.Scanner;

public class Coordinate {
    public static String coordinate(String str, int i) {
        boolean flag = true;
        StringBuilder newStr = new StringBuilder(str);
        while (flag) {
            String input = new Scanner(System.in).nextLine();
            int x = 0;
            int y = 0;
            try {
                y = Character.getNumericValue(input.charAt(0));
                x = Character.getNumericValue(input.charAt(2));
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }
            if (x > 3 || y > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (isCellOccupied(x, y, str)) {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                switch (i) {
                    case 0:
                        newStr.setCharAt((x - 1) + 3 * (y -1), 'X');
                        break;
                    case 1:
                        newStr.setCharAt((x - 1) + 3 * (y -1), 'O');
                        break;
                }
                flag = false;
            }
        }
        return newStr.toString();
    }
    public static boolean isCellOccupied(int x, int y, String str) {
        x--;
        y--;
        int i = x + 3 * y;
        return str.charAt(i) == 'X' || str.charAt(i) == 'O';
    }

}