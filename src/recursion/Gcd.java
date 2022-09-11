package recursion;

public class Gcd {
    
    public static void main(String[] args) {
        System.out.println(new Gcd().gcd(64, 320));
    }

    public int gcd(int a, int b) {

        int sNum;
        int lNum;

        if(a < 0 || b < 0){
            return -1;
        }

        if(a > b){
            lNum = a;
            sNum = b;
        } else {
            sNum = a;
            lNum = b;
        }

        if(lNum % sNum == 0){
            return sNum;
        }

        return gcd(sNum , lNum%sNum);

    }

}
