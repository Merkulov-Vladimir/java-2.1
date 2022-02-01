public class Main {
    public static void main(String[] args) {

        // Объявляние и инициализация переменных
        int price = 63; // цена билета
        int bonusRuR = 20; // цена для начисления бонусной мили

        // Логика
        int bonusMile;
        bonusMile = price / bonusRuR;
        System.out.println("Начислено бесплатных миль - " + bonusMile);
    }
}