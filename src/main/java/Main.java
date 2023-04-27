import ru.netology.services.VacationService;

public class Main {

    public static void main(String[] args) {

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        VacationService service = new VacationService();

        System.out.println();
        int count = service.calcVacation(income, expenses, threshold);
        System.out.println("Месяцев отдыха в году " + count);

    }
}
