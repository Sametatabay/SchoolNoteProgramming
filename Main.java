public class Main {

    public static void main(String[] args) {
	Course Mat=new Course("Matematik","Mat101","Mat");
    Course Fzk=new Course("Fizik","Fzk102","Fzk");
    Course Bio=new Course("Biyoloji","Bio101","Bio");

    Teacher t1=new Teacher("Hakkı","555","Mat");
    Teacher t2=new Teacher("Müzeyyen","111","Fzk");
    Teacher t3=new Teacher("Feraye","000","Bio");

        Mat.addTeacher(t1);
        Fzk.addTeacher(t2);
        Bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", Mat, Fzk, Bio);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", Mat, Fzk, Bio);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", Mat,Fzk,Bio);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
    }
}
