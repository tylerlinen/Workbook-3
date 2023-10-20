package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        System.out.println(formatter.format(today));

        formatter = DateTimeFormatter.ofPattern("MM-YYYY-dd");
        System.out.println(formatter.format(today));

        formatter = DateTimeFormatter.ofPattern("LLLL,dd YYYY");
        System.out.println(formatter.format(today));

        formatter = DateTimeFormatter.ofPattern("EEEE, LLL dd, YYYY");
        System.out.println(formatter.format(today));
    }
}