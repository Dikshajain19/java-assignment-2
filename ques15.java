class Student{
    String name;
    int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void showdata(){
        System.out.println("the name of the student is "+name);
        System.out.println("the rollno of the student is "+rollno);
    }
}
class ques15{
    public static void main(String a[]){
        Student stu=new Student("abc",101);
        stu.showdata();
    }
}