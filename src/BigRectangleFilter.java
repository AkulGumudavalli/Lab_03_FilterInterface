import java.awt.*;
import java.util.ArrayList;


public class BigRectangleFilter implements Filter{
    @Override
    public boolean accept(Object x) {
        Rectangle sides = (Rectangle) x;
        double perimeter = 2*(sides.getHeight()+sides.getWidth());
        return perimeter > 10;
    }
}
