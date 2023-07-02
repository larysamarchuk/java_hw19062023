package Homework.New;

public class HomeWork19062023 {
    public static void main(String[] args) {
        int initialDiameter = 24; // Диаметр исходной пиццы (в см)
        int newDiameter = 28; // Диаметр новой пиццы (в см)
        int caloriePerSquareCm = 40; // Количество калорий на каждый квадратный сантиметр пиццы

        int initialCalories = calculateCalories(initialDiameter, caloriePerSquareCm);
        int newCalories = calculateCalories(newDiameter, caloriePerSquareCm);

        int extraCalories = newCalories - initialCalories;

        System.out.println("При увеличении диаметра пиццы с " + initialDiameter + " см до " + newDiameter + " см");
        System.out.println("лишние калории составят: " + extraCalories + " калорий.");
    }

    public static int calculateCalories(int diameter, int caloriePerSquareCm) {
        double radius = diameter / 2.0;
        double area = Math.PI * Math.pow(radius, 2);
        int calories = (int) (area * caloriePerSquareCm);
        return calories;
    }
}
//При увеличении диаметра пиццы с 24 см до 28 см
//лишние калории составят: 1185 калорий.

