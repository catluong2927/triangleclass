

public class TriangleClassifier {
    public static String isTriangleType(int a, int b, int c){
        String text = "";
        if(a > 0 && b > 0 && c > 0) {
            if(a<b+c && b<a+c && c<a+b) {
                if (a == b && a == c) {
                    text = "Tam giác đều";
                } else if (a == b & a != c) {
                    text = "Tam giác cân";
                } else {
                    text = "Tam giác thường";
                }
            } else {
                text = "Không phải là tam giác";
            }
        } else {
            text = "Không phải là tam giác";
        }
        return text;
    }
}