//   output : ayerhs,ihskas,eerhsanahd
class Reverse1 {
    public static void main(String[] args) {
        String str = "dhanashree,sakshi,shreya";
        reverse(str);
    }

    static void reverse(String str) {
        String newString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        str = newString;

        System.out.println(str);
    }
}