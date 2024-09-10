import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        String str = "         ";
        printField(str);
        boolean flag = true;
        while (flag) {
            str = Coordinate.coordinate(str, 0);
            if (WinXO.winX(str)) {
                printField(str);
                System.out.println("X wins");
                flag = false;
                break;
            } else if (draw(str)) {
                printField(str);
                System.out.println("Draw");
                flag = false;
                break;
            }
            printField(str);
            str = Coordinate.coordinate(str, 1);
            if (WinXO.winO(str)) {
                printField(str);
                System.out.println("O wins");
                flag = false;
                break;
            } else if (draw(str)) {
                printField(str);
                System.out.println("Draw");
                flag = false;
                break;
            }
            printField(str);
        }

    }
    public static void printField(String str) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%c ", str.charAt(j + 3 * i));
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
    public static boolean draw(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 'X' && str.charAt(i) != 'O') {
                return false;
            }
        }
        return true;
    }

}