public class People{


    private String getPrincipalName;


//    @Override
//    public String getName() {
//        String getNameOfPerson = firstName + " " + lastName;
//        return getNameOfPerson;
//    }


//    public void addApplicant (String firstName, String lastName, int age){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }

    public void addPrincipal (String firstName, String lastName){
        this.getPrincipalName = firstName + " " + lastName;
        System.out.println("Principals Name is " + getPrincipalName)
    }

    public void addPrincipal (String firstName, String lastName, Applicant applicant){
        this.getPrincipalName = firstName + " " + lastName;
        applicant.admissionStatus();
    }

    public void addPrincipal (String firstName, String lastName, Student student) {
        this.getPrincipalName = firstName + " " + lastName;


    }

}
