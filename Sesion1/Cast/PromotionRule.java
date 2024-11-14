package Cast;

public class PromotionRule {
    public static void main(String[] args){

        int in = 10;
        float flo = 10.5f;
        double dob = 20.5;
        long lo = 1000L;
        long lo2 = 2000L;

        long result1 = in + lo; // rule 1: int promoted to long
        float result2 = flo * in; // rule 2: int promoted to float
        double result3 = dob / flo; // rule 2: float promoted to double
        long result4 = lo + lo2; // no promotion required

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println(Sum(10,20));

    }

    static int Sum(int param, int param2){
        return param + param2;
    }
}
