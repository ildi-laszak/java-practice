public class CodingHours {
    public static void main(String[] args) {
        int numberOfWeeks = 17;
        int numberOfWorksDays = 5;
        int numberOfHours = 6;
        int totalCodingHours = numberOfWeeks * numberOfWorksDays * numberOfHours;
        System.out.println("The student is going to code " + totalCodingHours + " hours in a semester");

        int totalWorkHours = 52 * numberOfWeeks;
        int percentageOfCodingHours = (totalCodingHours * 100) / totalWorkHours;
        System.out.println("The percentage of coding hours in a semester is " + percentageOfCodingHours + "%");
    }
}

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52