package Chapter3;

public class HealthProfile {

        private String firstName;
        private String lastName;
        private String gender;
        private double height;
        private double weight;
        private int day;
        private int month;
        private int year;

  public HealthProfile (String firstName, String lastName, String gender,double height, double weight, int day, int month, int year){
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.height = height;
      this.weight = weight;
      this.day = day;
      this.month = month;
      this.year = year;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int calculateAge() {
        return 2020 - year;
    }
     public  String dateOfBirth(){
      return String.format("%d-%d-%d",day,month,year);
         }

    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    public double calculateMinimumTargetHeartRate() {
        return 0.5 * calculateMaximumHeartRate();
    }

    public double calculateMaximumTargetHeartRange() {
      return 0.85 * calculateMaximumHeartRate();
    }

    public double calculateBodyMassIndex() {
      double output = (weight / (height * height));
      return Double.parseDouble(String.format("%.2f", output));
    }






}














