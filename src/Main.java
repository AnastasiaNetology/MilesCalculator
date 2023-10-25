public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.println("Количество миль:");
        System.out.println(service.calculate(91_000));

        System.out.println("Количество миль:");
        System.out.println(service.calculate(4_500));
    }
}
