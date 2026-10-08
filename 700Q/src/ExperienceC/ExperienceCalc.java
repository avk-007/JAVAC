package ExperienceC;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class ExperienceCalc {
    // Company data class
    static class Company {
        String name;
        LocalDate startDate;
        LocalDate endDate;
        Company(String name, LocalDate startDate, LocalDate endDate) {
            this.name = name;
            this.startDate = startDate;
            this.endDate = endDate;
        }
    }
    // Holiday list (India + Maharashtra) for relevant years
    static Map<LocalDate, String> holidays = new HashMap<>();
    static {
        // 2022
        holidays.put(LocalDate.of(2022, 1, 26), "Republic Day");
        holidays.put(LocalDate.of(2022, 3, 1), "Maha Shivratri");
        holidays.put(LocalDate.of(2022, 3, 18), "Holi");
        holidays.put(LocalDate.of(2022, 4, 14), "Dr. Ambedkar Jayanti / Good Friday");
        holidays.put(LocalDate.of(2022, 5, 1), "Maharashtra Day");
        holidays.put(LocalDate.of(2022, 5, 3), "Eid-ul-Fitr");
        holidays.put(LocalDate.of(2022, 8, 9), "Muharram");
        holidays.put(LocalDate.of(2022, 8, 15), "Independence Day");
        holidays.put(LocalDate.of(2022, 8, 16), "Parsi New Year (Shahenshahi)");
        holidays.put(LocalDate.of(2022, 8, 31), "Ganesh Chaturthi");
        holidays.put(LocalDate.of(2022, 10, 2), "Gandhi Jayanti");
        holidays.put(LocalDate.of(2022, 10, 5), "Dussehra");
        holidays.put(LocalDate.of(2022, 10, 26), "Diwali");
        holidays.put(LocalDate.of(2022, 11, 8), "Guru Nanak Jayanti");
        holidays.put(LocalDate.of(2022, 12, 25), "Christmas");

        // 2023
        holidays.put(LocalDate.of(2023, 1, 26), "Republic Day");
        holidays.put(LocalDate.of(2023, 3, 8), "Holi");
        holidays.put(LocalDate.of(2023, 4, 14), "Dr. Ambedkar Jayanti");
        holidays.put(LocalDate.of(2023, 4, 22), "Eid-ul-Fitr");
        holidays.put(LocalDate.of(2023, 5, 1), "Maharashtra Day");
        holidays.put(LocalDate.of(2023, 6, 29), "Bakri Eid");
        holidays.put(LocalDate.of(2023, 7, 29), "Muharram");
        holidays.put(LocalDate.of(2023, 8, 15), "Independence Day");
        holidays.put(LocalDate.of(2023, 9, 19), "Ganesh Chaturthi");
        holidays.put(LocalDate.of(2023, 10, 2), "Gandhi Jayanti");
        holidays.put(LocalDate.of(2023, 10, 24), "Dussehra");
        holidays.put(LocalDate.of(2023, 11, 14), "Diwali");
        holidays.put(LocalDate.of(2023, 11, 27), "Guru Nanak Jayanti");
        holidays.put(LocalDate.of(2023, 12, 25), "Christmas");

        // 2024
        holidays.put(LocalDate.of(2024, 1, 1), "New Year");
        holidays.put(LocalDate.of(2024, 1, 26), "Republic Day");
        holidays.put(LocalDate.of(2024, 3, 8), "Maha Shivratri");
        holidays.put(LocalDate.of(2024, 3, 25), "Holi");
        holidays.put(LocalDate.of(2024, 4, 11), "Eid-ul-Fitr");
        holidays.put(LocalDate.of(2024, 4, 14), "Dr. Ambedkar Jayanti");
        holidays.put(LocalDate.of(2024, 5, 1), "Maharashtra Day");
        holidays.put(LocalDate.of(2024, 8, 15), "Independence Day");
        holidays.put(LocalDate.of(2024, 10, 2), "Gandhi Jayanti");
        holidays.put(LocalDate.of(2024, 12, 25), "Christmas");

        // 2025
        holidays.put(LocalDate.of(2025, 1, 26), "Republic Day");
        holidays.put(LocalDate.of(2025, 5, 1), "Maharashtra Day");
        holidays.put(LocalDate.of(2025, 8, 15), "Independence Day");
        holidays.put(LocalDate.of(2025, 10, 2), "Gandhi Jayanti");
        holidays.put(LocalDate.of(2025, 12, 25), "Christmas");

        // 2026
        holidays.put(LocalDate.of(2026, 1, 26), "Republic Day");
        holidays.put(LocalDate.of(2026, 5, 1), "Maharashtra Day");
        holidays.put(LocalDate.of(2026, 8, 15), "Independence Day");
        holidays.put(LocalDate.of(2026, 10, 2), "Gandhi Jayanti");
        holidays.put(LocalDate.of(2026, 12, 25), "Christmas");
    }
    // Check if a date is a weekend
    static String checkWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        if (day == DayOfWeek.SATURDAY) return "SATURDAY (Weekend)";
        if (day == DayOfWeek.SUNDAY) return "SUNDAY (Weekend)";
        return null;
    }
    // Check if a date is a holiday
    static String checkHoliday(LocalDate date) {
        return holidays.get(date);
    }
    // Check if date is a valid working day
    static void checkWorkingDay(LocalDate date, String label) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println("\n--- " + label + " ---");
        System.out.println("Date      : " + date.format(fmt));
        String weekend = checkWeekend(date);
        String holiday = checkHoliday(date);
        if (weekend != null) {
            System.out.println("Status    : ❌ " + weekend);
        } else if (holiday != null) {
            System.out.println("Status    : ❌ Public Holiday - " + holiday);
        } else {
            System.out.println("Status    : ✅ Working Day");
        }
    }
    // Calculate duration between two dates (inclusive)
    static Period calculateDuration(LocalDate start, LocalDate end) {
        // Add 1 day to make it inclusive
        LocalDate inclusiveEnd = end.plusDays(1);
        return Period.between(start, inclusiveEnd);
    }
    // Format period as "X months, Y days" (total months + days)
    static String formatMonthsDays(Period period) {
        int totalMonths = period.getYears() * 12 + period.getMonths();
        int days = period.getDays();
        return totalMonths + " months, " + days + " days";
    }
    // Format period as "X years, Y months, Z days"
    static String formatYearsMonthsDays(Period period) {
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }

    // Format period as "X years, Y months, Z days" using total months normalization
    static String formatYearsMonthsDaysFromPeriod(Period period) {
        int totalMonths = period.getYears() * 12 + period.getMonths();
        int years = totalMonths / 12;
        int months = totalMonths % 12;
        int days = period.getDays();
        return years + " years, " + months + " months, " + days + " days";
    }

    // Convert period to total months + days (assuming 30 days = 1 month)
    static int[] normalizeMonthsDays(int months, int days) {
        if (days >= 30) {
            months += days / 30;
            days = days % 30;
        }
        return new int[]{months, days};
    }

    // Main calculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

        System.out.println("     EXPERIENCE CALCULATOR   ");

        // Define companies
        //you can add specific date and other companies as well here
        List<Company> companies = new ArrayList<>();

        companies.add(new Company("1st Company",
                LocalDate.of(2022, 5, 17),
                LocalDate.of(2024, 1, 8)));

        companies.add(new Company("2nd Last Company",
                LocalDate.of(2024, 1, 12),
                LocalDate.of(2025, 6, 30)));

        companies.add(new Company("Last Company",
                LocalDate.of(2025, 10, 10),
                LocalDate.of(2026, 10, 16)));

        // Print each company details
        System.out.println("           COMPANY DETAILS");
        System.out.println("==============================================");

        int totalMonths = 0;
        int totalDays = 0;

        for (Company c : companies) {
            System.out.println("\n>>> " + c.name);
            System.out.println("Start     : " + c.startDate.format(fmt));
            System.out.println("End       : " + c.endDate.format(fmt));

            // Check working day for start date
            checkWorkingDay(c.startDate, c.name + " - Joining Day");

            // Check working day for end date
            checkWorkingDay(c.endDate, c.name + " - Release Day");

            // Calculate duration (inclusive)
            Period p = calculateDuration(c.startDate, c.endDate);
            int months = p.getYears() * 12 + p.getMonths();
            int days = p.getDays();

            System.out.println("Duration  : " + formatMonthsDays(p) + " (inclusive)");

            totalMonths += months;
            totalDays += days;
        }

        // Normalize totals
        int[] normalized = normalizeMonthsDays(totalMonths, totalDays);
        totalMonths = normalized[0];
        totalDays = normalized[1];

        // Calculate gaps
        System.out.println("\n==============================================");
        System.out.println("           GAP BETWEEN COMPANIES");
        System.out.println("==============================================");

        for (int i = 0; i < companies.size() - 1; i++) {
            Company current = companies.get(i);
            Company next = companies.get(i + 1);
            long gapDays = ChronoUnit.DAYS.between(current.endDate, next.startDate) - 1;

            System.out.println("\n" + current.name + " → " + next.name);
            System.out.println("Gap       : " + gapDays + " days");
        }

        // Total experience
        int years = totalMonths / 12;
        int remainingMonths = totalMonths % 12;

        System.out.println("\n==============================================");
        System.out.println("           TOTAL EXPERIENCE");
        System.out.println("==============================================");
        System.out.println("Total     : " + years + " years, " + remainingMonths + " months, " + totalDays + " days");
        System.out.println("(Inclusive of both start and end dates)");

        // Calculate time needed to reach 4 years
        System.out.println("\n==============================================");
        System.out.println("     TIME NEEDED TO REACH 4 YEARS");
        System.out.println("==============================================");

        int targetYears = 4;
        int targetMonths = 1;
        int targetDays = 19;
        int currentTotalMonths = years * 12 + remainingMonths;
        int targetTotalMonths = targetYears * 12 + targetMonths;
        int diffMonths = targetTotalMonths - currentTotalMonths;
        int diffDays = targetDays - totalDays;

        if (diffDays < 0) {
            diffMonths -= 1;
            diffDays += 30;
        }
        System.out.println("Current   : " + years + " years, " + remainingMonths + " months, " + totalDays + " days");
        System.out.println("Target    : 4 years+");
        System.out.println("Need      : " + diffMonths + " months, " + diffDays + " days more");
        // Final summary table - WITH BOTH DURATION AND YEARS FORMAT
        System.out.println("\n======================================================================================================");
        System.out.println("FINAL TIMELINE SUMMARY");
        System.out.println("======================================================================================================");
        System.out.printf("%-20s %-15s %-15s %-30s %-30s%n",
                "Company", "Start Date", "End Date", "Duration", "Years Format");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (Company c : companies) {
            Period p = calculateDuration(c.startDate, c.endDate);
            System.out.printf("%-20s %-15s %-15s %-30s %-30s%n",
                    c.name,
                    c.startDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")),
                    c.endDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")),
                    formatMonthsDays(p),
                    formatYearsMonthsDaysFromPeriod(p));
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
        String totalDuration = years + " years, " + remainingMonths + " months, " + totalDays + " days";
        String totalYearsFmt = years + " years, " + remainingMonths + " months, " + totalDays + " days";
        System.out.printf("%-20s %-15s %-15s %-30s %-30s%n",
                "TOTAL", "", "", totalDuration, totalYearsFmt);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("\n✅ Done!");
        scanner.close();
    }
}