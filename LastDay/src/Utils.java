public class Utils {

    public static String transform(String st,StringFunction f)
    {
        return(f.applyFunction(st));
    }
    public static void byebye(String st, StringConsumer f)
    {
        f.consumeFunction(st);
    }
    public static String makeExciting(String s)
    {
        return(s + " ** !!");
    }
    private Utils() {}
}
