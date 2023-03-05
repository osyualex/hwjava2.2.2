public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int total = service.calculate(65, 177);
        System.out.println("Индекс массы тела соответствует: " + total);
    }
}