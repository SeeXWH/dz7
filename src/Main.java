public class Main {
    public static void main(String[] args) {
        // task 1
        var money = 0;
        var month = 0;
        while (money < 2459000) {
            money += 15000;
            money *= 1.1;
            month += 1;
        }
        System.out.println(month);
        // task 2
        var i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        // task 3
        var people = 12_000_000;
        for (i = 1; i <= 10; i++) {
            people = (people + (people / 1000) * 17) - 8;
            System.out.println("Год " + i + ", численность населения составляет" + people);
        }
        // task 4
        i = 0;
        var sum = 15_000;
        while (sum <= 12_000_000) {
            sum *= 1.7;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum);
        }
        // task 5
        i = 0;
        sum = 15_000;
        while (sum <= 12_000_000) {
            sum *= 1.7;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sum);
            }
        }
        // task 6
        sum = 15_000;
        for (i = 1; i <= 9 * 12; i++) {
            sum *= 1.7;
            if (i % 6 == 0 || i == 1) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sum);
            }
        }
        // task 7
        int pt = 7;
        int day = 0;
        for (day+=pt; day <=31; day+=7){
            System.out.println("Сегодня пятница, "+ day+"-е число. Необходимо подготовить отчет");
        }
        // task 8
        for (i = 0; i<=2124; i+=79){
            if (i>=1824){
                System.out.println(i);
            }
        }
    }
}