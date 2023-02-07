public class BmiService {
    public int calculate(int a, int b) {
        int c = b * b ;
        int f = a * 10000 ;
        int imb = f / c ;
        if ( 16 > imb ) {
            System.out.println(" Выраженный дефицит массы тела");
        }
        else if (19 >= imb && 16 < imb){
            System.out.println(" Недостаточная (дефицит) масса тела");
        } 
        else if (25 >= imb && 19 < imb ) {
            System.out.println(" Норма");
        }
        else if ( 30 >= imb && 25 < imb) {
            System.out.println(" Избыточная масса тела (предожирение)");
        }
        else if ( 35 >= imb && 30 < imb) {
            System.out.println(" Ожирение первой степени");
        }
        else if ( 40 >= imb && 35 < imb) {
            System.out.println(" Ожирение второй степени");
        }
        else if ( 40 <= imb) {
            System.out.println( imb + " Ожирение третьей степени (морбидное)");
        }
        return imb;


    }
}
