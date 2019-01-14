package javaLearning;

class SmallestNum {

    SmallestNum(int a, int b) {
        if (a < b) {
            System.out.println("Smallest number among " + a + " and " + b + " is " + a);
        } else {
            System.out.println("Smallest number among " + a + " and " + b + " is " + b);
        }
    }


    SmallestNum(int a, int b, int c) {

        if( (a < b) && (a< c)){
               System.out.println("Smallest number among " + a + " , " + b + " and " + c + " is " + a);
            }
        if( (b < a) && (b< c)){
            System.out.println("Smallest number among " + a + " , " + b + " and " + c + " is " + b);
        }
        if( (c < a) && (c< b)){
            System.out.println("Smallest number among " + a + " , " + b + " and " + c + " is " + c);
        }
        }
}




public class SmallestNumConstructor {
    public static void main(String[] args) {
        SmallestNum sn= new SmallestNum(10,20);
        SmallestNum sn1= new SmallestNum(1000,200);
        SmallestNum sn2= new SmallestNum(10000,20202,30303);
        SmallestNum sn3= new SmallestNum(35,25,45);
        SmallestNum sn4= new SmallestNum(333,222,111);

    }
}
