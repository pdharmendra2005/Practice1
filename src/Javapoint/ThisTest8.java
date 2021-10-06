package Javapoint;


class Student13{
    int rollno;
    String name,course;
    float fee;
    Student13(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student13(int rollno,String name,String course,float fee){
        //this.fee=fee;
        this(rollno,name,course);//C.T.Error
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis8{
    public static void main(String args[]){
        Student13 s1=new Student13(111,"ankit","java");
        Student13 s2=new Student13(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}