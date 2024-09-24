class studentdashboard{
    String name;
    int rollno;
    studentdashboard(String n,int r){
        System.out.println("welcome to student dashboard of IT branch");
        System.out.println("Name of student = "+n);
        System.out.println("Roll no of student = "+r);
    }
}
class ques3{
    public static void main(String a[]){
        studentdashboard IT =new studentdashboard("diksha ",19);
    }
}