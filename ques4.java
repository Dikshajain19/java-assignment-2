class studentdashboard{
    String name;
    int rollno;
    int marks;
    studentdashboard(){
        System.out.println("welcome to student dashboard of IT branch");
    }
    studentdashboard(String n,int r){
        System.out.println("Name of student = "+n);
        System.out.println("Roll no of student = "+r);
    }
    studentdashboard(int m){
        marks=m;
        if(marks>35){
            System.err.println("passed the exam");
        }
        else{
            System.out.println("failed in exams");
        }
    }
}
class ques4{
    public static void main(String a[]){
        studentdashboard s1=new studentdashboard();
        studentdashboard s2=new studentdashboard("diksha ",19);
        studentdashboard s3=new studentdashboard(82);

    }
}