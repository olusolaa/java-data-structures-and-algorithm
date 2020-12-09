public class Applicant {

    String applicantName;
    int age;

    public Applicant(String name, int age) {
        this.applicantName = name;
        this.age = age;
    }


    public void admissionStatus(){
        if (this.age > 9) {
            System.out.println(applicantName + " is admitted");
        } else {
            System.out.println(applicantName + " is not admitted");
        }
    }

}