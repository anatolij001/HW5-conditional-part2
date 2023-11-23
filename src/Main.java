public class Main {
    public static void main(String[] args) {
        //---   Задача № 1   ---
        System.out.println("   ---   Задача № 1   ---");
        boolean clientOS = false;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Установите версию приложения для iOS по ссылке\n");

        //---   Задача № 2   ---
        System.out.println("   ---   Задача № 2   ---");
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else System.out.println("Установите версию приложения для iOS по ссылке\n");


        //---   Задача № 3 Високосный год   ---
        //Вариант 1
        System.out.println("   ---   Задача № 3 Високосный год вариант 1   ---");
        int year = 1988;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Год " + year + " високосный.\n");
            } else if (year % 400 == 0) {
                System.out.println("Год " + year + " високосный.\n");
            } else System.out.println("Год " + year + " не високосный.\n");
        } else System.out.println("Год " + year + " не високосный.\n");

        //Вариант 2
        System.out.println("   ---   Задача № 3 Високосный год вариант 2   ---");
        if (year % 400 == 0) {
            System.out.println("Год " + year + " високосный.\n");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Год " + year + " високосный.\n");
        } else System.out.println("Год " + year + " не високосный.\n");


        //---   Задача № 4   ---
        System.out.println("   ---   Задача № 4   ---");
        int deliveryDistance = 95;
        int estimatedDeliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + estimatedDeliveryTime + "\n");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (estimatedDeliveryTime + 1) + "\n");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (estimatedDeliveryTime + 2) + "\n");
        } else System.out.println("На расстояние " + deliveryDistance + " км. доставка не осуществляется.\n");

        //---   Задача № 5   ---
        System.out.println("   ---   Задача № 5   ---");
        byte monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Указан некорректный номер месяца! Работа программы завершена.\n");
        } else switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц " + monthNumber + " относится к зиме.\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " относится к весне.\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " относится к лету.\n");
                break;
            default:
                System.out.println("Месяц " + monthNumber + " относится к осени.\n");
                break;
        }

    }
}