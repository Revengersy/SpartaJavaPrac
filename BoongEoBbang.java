
public class BoongEoBbang {
    public static void main(String args[]) {
        String s = "a Z z";
        int n = 1;
        String result = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                char c = s.charAt(i);
                result += c;
                continue;
            }

            char c = (char) (s.charAt(i) + n);

            if (c - n <= 90 && c > 90){
                c = (char) (c - (90 - 64));
            }

            if (c >122){
                c = (char) (c - (122 - 96));
            }

            result += c;
        }

        System.out.println(result);

    }
}
