package OOps;

public class Student {

    int studentID;
    String studentName;  // instance variable
    String studentCity;

    //creating constructor

    public Student(){
        System.out.println("creating object");
    }


 // behaviour :member methods:methods(function)

    public void Study(){

        System.out.println(studentName + " is Studying ");

    }
    public void showFullDetails(){

        System.out.println(" my name is " + studentName);
        System.out.println(" my id is " + studentID);
        System.out.println(" my city is " + studentCity);
    }


}
