package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/income.csv")
    public void testLowIncome(int expected, int income, int expenses, int threshold){
        VacationService service = new VacationService();

        int actual = service.calcVacation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
