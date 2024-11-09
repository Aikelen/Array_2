public class Main {
    public static void main(String[] args) {
        //1
        int[] wastes = {52_000, 55_000, 45_000, 65_000, 66_000};
        for (int i = 0; i<wastes.length;i++){
            System.out.println("1)Сумма трат за месяц составила "+ wastes[i] +" рублей");
        }
        System.out.println();

        //2
        int MaxSalary = 0, MinSalary = 1_000_000;
        for (int i = 0; i<wastes.length;i++){
            if (MaxSalary < wastes[i]){
                MaxSalary = wastes[i];
            }
            else {
                continue;
            }
        }
        for (int i = 0; i<wastes.length;i++){
            if (MinSalary > wastes[i]){
                MinSalary = wastes[i];
            }
            else {
                continue;
            }
        }
        System.out.println("2)Минимальная сумма трат за неделю составила "+MinSalary+" рублей. Максимальная сумма трат за неделю составила "+MaxSalary+" рублей");
        System.out.println();
        //3

        float AvarageValue;
        int sum=0;
        for (int i=0; i<wastes.length;i++){
            sum += wastes[i];
        }
        AvarageValue = sum / wastes.length;
        System.out.println("3) Средняя сумма трат за месяц составила "+AvarageValue+" рублей");

        //4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };

        // Разворачиваем массив
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(reverseFullName);

    }
}