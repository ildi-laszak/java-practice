public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int totalHoursInSeconds = 24 * 3600;
        int currentTimeInSeconds = (currentHours * 3600) + (currentMinutes * 60) + currentSeconds;
        int remainingTimeInSeconds = totalHoursInSeconds - currentTimeInSeconds;
        System.out.println(remainingTimeInSeconds);
    }
}
// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by the variables above