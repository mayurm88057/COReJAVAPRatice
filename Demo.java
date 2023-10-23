package OOps;

public class Demo {
    public static void main(String[] args) {

        // create the object in demo

        Student s1 = new Student();
        s1.studentName="Shivani";
        s1.studentID=1;
        s1.studentCity="pune";



        s1.Study();
        s1.showFullDetails();

        Student st2= new Student();
        st2.studentName="shyam";
        st2.studentID=2;
        st2.studentCity="pune";

        st2.Study();
        st2.showFullDetails();




    }
}
