package ru.netology.services;

public class VacationService {

    public int calcVacation(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". Отдых. Потратил " + expenses + " и " + ((money - expenses) / 3 * 2) + " за отдых.");
                money = (money - expenses) / 3;
                count++;
            } else {
                System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". Опять работать. Заработал " + income + ". Потратил " + expenses + ".");
                money = money + income - expenses;
            }
        }
        System.out.println("Месяцев отдыха в году " + count);
        return count;
    }

}
