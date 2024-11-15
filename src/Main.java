import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        int[] wastes = {52_000, 55_000, 45_000, 65_000, 66_000};
        int Sum = 0;
        for (int i = 0; i<wastes.length;i++){
            System.out.println("1)Сумма трат за "+ (i+1) +" месяц составила "+ wastes[i] +" рублей");
            Sum += wastes[i];

        }
        System.out.println("1) Всего было потрачено "+Sum);//помениял
        System.out.println();

        //2
        int MaxSalary = 0, MinSalary = wastes[0];//помениял
        for (int i = 0; i<wastes.length;i++){//помениял
            if (MaxSalary < wastes[i] ){
                MaxSalary = wastes[i];

            }
            else if (MinSalary > wastes[i]){
                MinSalary = wastes[i];
            }
            else {
                continue;
            }
        }

        System.out.println("2)Минимальная сумма трат за неделю составила "+MinSalary+" рублей. Максимальная сумма трат за неделю составила "+MaxSalary+" рублей");
        System.out.println();
        //3

        double AvarageValue;
        double sum=0;
        for (int i=0; i<wastes.length;i++){
            sum += wastes[i];
        }
        sum += 111_111.10;
        AvarageValue = sum / wastes.length;
        System.out.println("3) Средняя сумма трат за месяц составила "+AvarageValue+" рублей");

        //4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        for (int i = reverseFullName.length - 1;i>=0;i--){
            System.out.print(reverseFullName[i]);


        }


    }
}