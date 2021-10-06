package MRBOOL;

    class sample {

        float calculation(float x, float y) //float type parameterized function
        {
            return x + y;
        }

        void calculation(int x, float y) // void type parameterized function

        {
            double sm = x + y;
            System.out.println("Sum of the value.. = " + sm);

        }

        int calculation(int x, int y) { //int type parameterized function, formal parameter

            return x + y;
        }


        static class Func {

            public static void main(String args[]) {


                sample ob = new sample(); //Object creation part
                int s = ob.calculation(145, 125); //Actual function call integer method
                float f = ob.calculation((float) 14.5, 1.25f); //Actual function float method } }

                // Read more: http://mrbool.com/user-defined-functions-in-java/29889#ixzz6ZwNmoyT5


            }
        }
    }