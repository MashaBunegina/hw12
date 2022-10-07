import java.time.LocalDate;

    public class Main {
        public static void main(String[] args) {

            printIsEvenYear(2022);
            printOs(1, 2015);
            int deliveryDays = calculateDeliveryDays(60);
            System.out.println("Потребуется дней:" + deliveryDays);
        }

        private static int calculateDeliveryDays(int deliveryDistance) {
            if (deliveryDistance <= 20) {
                return 1;
            } else {
                return (int) Math.round((double) deliveryDistance / 40) + 1;
            }
        }


        private static void printIsEvenYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + "високосный год");
            } else {
                System.out.println(year + "не високосный год");
            }
        }

        public static int printOs(int clientOs, int printDeviceYear) {
            int currentYear = 2022;
            currentYear = LocalDate.now().getYear();
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    if (printDeviceYear < currentYear) {
                        System.out.println(" Установите облегченную версию приложения для IOS по ссылке");
                        break;
                    }
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    if (printDeviceYear < currentYear) {
                        System.out.println(" установите облегченную версию приложения для Android по ссылке.");
                    }

                    break;
            }
            return currentYear;
        }
    }
