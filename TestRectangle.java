public class TestRectangle {

    public static void main(String[]args) {



        Rectangle firstRectangle = new Rectangle(4,40);
        Rectangle secondRectangle = new Rectangle(3.5,35.9);
        Rectangle thirdRectangle = new Rectangle(78, 322);



        //Rectangles 1,2,and 3

        System.out.println("First Rectangle: " + firstRectangle.toString());
        System.out.println();
        System.out.println("Second Rectangle: " + secondRectangle.toString());
        System.out.println();
        System.out.println("Third Rectangle: " + thirdRectangle.toString());
        System.out.println();
        System.out.println("The number of rectangles created is: " + Rectangle.getNumberOfObjects());



    }
}
