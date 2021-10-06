package Javapoint;

class Student12{
    int rollno;
    String name,course;
    float fee;
    Student12(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student12(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String args[]){
        Student12 s1=new Student12(111,"ankit","java");
        Student12 s2=new Student12(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}