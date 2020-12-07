package Chapter3;


public class HeartRates {

   private String firstName;
    private String lastName;
    private int year;
    private int day;
    private int month;

    public HeartRates(String firstName, String lastName, int day, int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.day = day;
         this.month= month;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int calculateAge() {
        return 2020 - year;
    }
    public String dateOfBirth(){
        return String.format("%d-%d-%d",day,month,year);
    }

    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    public double calculateMaximumTargetHeartRate() {
        return 0.85 * calculateMaximumHeartRate();
    }


    public double calculateMinimumTargetHeartRate() {
        return 0.5 * calculateMaximumHeartRate();
    }
}
