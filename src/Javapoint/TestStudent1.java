package Javapoint;

class Student1 {
    int id = 55;
    char ch = 'M';
    String name = "My class outside";

/*
        class StudentInside{
            int idInside=60;
            char chInside = "M";
            String nameInside=" My class Inside";


        }*/
    static class TestStudent1 {
        public static void main(String[] args) {
            Student1 st1 = new Student1();
            System.out.println(st1.name);
        }
    }
}

