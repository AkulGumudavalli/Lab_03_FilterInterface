public class ShortWordFilter implements Filter{

    @Override
    public boolean accept(Object x) {
        String b = x.toString();
        return b.length()<5;
    }
}
