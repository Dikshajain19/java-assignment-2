class student{
    public String name;
    public int rollno;
    public String branch;
    public student(String name,int rollno,String branch){
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
    }
    void studentdetails(String name){
        System.out.println("Naame of the student is "+name);
    }
    void studentdetails(String name,int rollno){
        System.out.println("Name of the student is "+name);
        System.out.println("the rollno of student is "+rollno);
    }
    void studentdetails(String name,int rollno,String branch){
        System.out.println("Name of the student is "+name);
        System.out.println("the rollno of student is "+rollno);
        System.out.println("the branch of student is "+branch);

    }
}
class ques6{
    public static void main(String a[]){
        student stu=new student("diksha",19,"IT");
        stu.studentdetails("diksha");
        stu.studentdetails("diksha",19);
        stu.studentdetails("diksha",19,"IT");

    }
}
