
public class Impossible {
    public static boolean impossible(String str) {
        if (compareWins(str) || compareQuantity(str)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean compareWins(String str) {
        if (WinXO.winRowX(str) && WinXO.winRowO(str)) {
            return true;
        } else if(WinXO.winColX(str) && WinXO.winColO(str)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean compareQuantity(String str) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                x++;
            } else if (str.charAt(i) == 'O') {
                o++;
            }
        }
        if (Math.max(x, o) - Math.min(x, o) > 1) {
            return true;
        } else {
            return false;
        }
    }

}
