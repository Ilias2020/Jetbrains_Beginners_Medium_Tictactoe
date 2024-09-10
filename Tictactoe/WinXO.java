public class WinXO {
    public static boolean winX(String str) {
        if (winColX(str) || winRowX(str) || winDiagX(str)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean winO(String str) {
        if (winColO(str) || winRowO(str) || winDiagO(str)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean winRowX(String str) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i + i * 2) == str.charAt(i + 1 + i * 2) &&
                    str.charAt(i + 1 + i * 2) == str.charAt(i + 2 + i * 2) &&
                    str.charAt(i + 2 + i * 2) == 'X') {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static boolean winRowO(String str) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i + i * 2) == str.charAt(i + 1 + i * 2) &&
                    str.charAt(i + 1 + i * 2) == str.charAt(i + 2 + i * 2) &&
                    str.charAt(i + 2 + i * 2) == 'O') {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static boolean winColX(String str) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i) == str.charAt(i + 3) &&
                    str.charAt(i + 3) == str.charAt(i + 6) &&
                    str.charAt(i + 6) == 'X') {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static boolean winColO(String str) {
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (str.charAt(i) == str.charAt(i + 3) &&
                    str.charAt(i + 3) == str.charAt(i + 6) &&
                    str.charAt(i + 6) == 'O') {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static boolean winDiagX(String str) {
        boolean flag = false;
        if (str.charAt(0) == str.charAt(4) &&
                str.charAt(4) == str.charAt(8) &&
                str.charAt(8) == 'X') {
            flag = true;
        } else if (str.charAt(2) == str.charAt(4) &&
                str.charAt(4) == str.charAt(6) &&
                str.charAt(6) == 'X') {
            flag = true;
        }
        return flag;
    }
    public static boolean winDiagO(String str) {
        boolean flag = false;
        if (str.charAt(0) == str.charAt(4) &&
                str.charAt(4) == str.charAt(8) &&
                str.charAt(8) == 'O') {
            flag = true;
        } else if (str.charAt(2) == str.charAt(4) &&
                str.charAt(4) == str.charAt(6) &&
                str.charAt(6) == 'O') {
            flag = true;
        }
        return flag;
    }
}
