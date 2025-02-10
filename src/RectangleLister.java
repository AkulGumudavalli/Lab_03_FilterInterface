import java.awt.*;
import java.util.ArrayList;

public class RectangleLister {
    public static void main(String[] args){
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 10));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(6, 4));
        rectangles.add(new Rectangle(7, 2));
        rectangles.add(new Rectangle(8, 3));
        rectangles.add(new Rectangle(4, 6));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(9, 2));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(12, 1));
        rectangles.add(new Rectangle(3, 7));
        rectangles.add(new Rectangle(6, 6));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(10, 5));
        rectangles.add(new Rectangle(7, 7));
        rectangles.add(new Rectangle(8, 6));
        rectangles.add(new Rectangle(9, 9));
        rectangles.add(new Rectangle(11, 4));
        rectangles.add(new Rectangle(12, 6));
        BigRectangleFilter checker = new BigRectangleFilter();
        for(Rectangle rectangle:rectangles){
            if(checker.accept(rectangle))
                System.out.println("("+rectangle.getWidth()+","+rectangle.getHeight()+")");
        }

    }
}
