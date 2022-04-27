import java.io.File;
import java.io.FileFilter;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//
public class Main {
    public static void main(String[] args) {

//
//        NumericTest isFactor = (n, d) -> (n % d) == 0;
//        if(isFactor.test(10, 2)) System.out.println("2 is a factor of 10");
//        if(!isFactor.test(10, 3)) System.out.println("3 is not a factor of 10");
//                NumericTest lessThan = (n, m) -> (n < m);
//        if(lessThan.test(2, 10)) System.out.println("2 is less than 10");



//        NumericFunc smallestF = (n) -> {
//            int result = 1;
//            n = n < 0 ? -n : n;
//            for (int i = 2; i <= n / i; i++)
//                if ((n % i) == 0) {
//                    result = i;
//                    break;
//                }
//            return result;
//        };
//        System.out.println("Smallest factor of 12 is " +
//                smallestF.func(12));
//        System.out.println("Smallest factor of 11 is " +
//                smallestF.func(11));


//        File fObj = new File(".");
//        File[] directories = fObj.listFiles(new FileFilter(){
//            public boolean accept(File file) {
//                return file.isDirectory(); }
//        });

//        File[] directories= new File(".").listFiles(File::isDirectory);

        String s = "TestITI";
// SomeClass::staticMethod
        String result1 = Utils.transform(s, Utils::makeExciting);
        System.out.println("\n1 Static "+result1);
// someObject::instanceMethod
        String prefix = "Blah @@ ";
        String result2 = Utils.transform(s, prefix::concat);
        System.out.println("\n2- object::instance method: "+result2);

// SomeClass::instanceMethod

    String result3 = Utils.transform(s, String::toUpperCase);
System.out.println("\n3- Class::instance Method:"+result3);

// SomeClass::Constructor

    String result4 = Utils.transform("hi - > "+s, String::new);
    System.out.println("\n\n\n4- Class::constructor: "+result4);

        Set<String> s1 = new HashSet<>();
        s1.add("lion");
        s1.add("tiger");
        s1.add("bear");
        s1.forEach( (s2)-> System.out.println(s2) );


        String s3 = "JAVA";
        s3 = s3 + "rocks";
        s3 = s3.substring(4,8); /// JAVArocks
        s3.toUpperCase();
        System.out.println(s3);
}
        }



//        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
//
//        System.out.printf("Odd Values Mul by ...");
//        IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach((value -> System.out.println(value)));


//        System.out.println(Main.sequentialSum(123));
//        System.out.println(Main.parallelSum(123));

//      Date Sucksssssss
//        Date date = new Date(12, 12, 12);
//        System.out.println(date);
////
////
////      Normal Date
//        LocalDate ld = LocalDate.of(1931, Month.OCTOBER, 15);
//        System.out.println(ld);
//
//        LocalDate ld1 = LocalDate.ofYearDay(2017, 21);
//        System.out.println(ld1);
//        LocalDate ld2 = LocalDate.ofYearDay(2017, 90);
//        System.out.println(ld2);
////
//        LocalDate ld3 = LocalDate.ofEpochDay(1);
//        System.out.println(ld3);
//        LocalDate ld4 = LocalDate.ofEpochDay(90);
//        System.out.println(ld4);



//            List<String> threeHighCalorieDishNames
//            menu.stream()
//            filter (d -> d.getcalories () > 300)
//            .map(Dish:: getName).

//    }
//
//
//    public static long sequentialSum(long n) {return Stream.iterate(1L, i-> i+1).limit(n).reduce(0L, Long::sum);}
//    public static long parallelSum(long n) { return Stream.iterate(1L, i-> i+1).limit(n).parallel().reduce(0L, Long::sum);}
//
//
//
//    }
//


















//
//import javafx.beans.Observable;
//import javafx.beans.property.IntegerProperty;
//import javafx.beans.property.SimpleIntegerProperty;
//
//public class Main {
//    public static void main(String[] args) {
//        // Create a property
//        IntegerProperty counter = new SimpleIntegerProperty(100);
//
//        counter.addListener(Main::invalidated);
//
//        System.out.println("A");
//        counter.set(1);//from   ww  w.j a  va  2  s.  c o  m
//        System.out.println("B");
//
//
//        // Make the counter property valid by calling its get() method
//        int value = counter.get();
//        System.out.println("Counter value = " + value);
//
//        // Try setting the same value
//        System.out.println("C");
//        counter.set(102);
//        System.out.println("D");
//
//    }
//
//    public static void invalidated(Observable prop) {
//        System.out.println("Counter is invalid.");
//    }
//}
//
//
//
//
//
//
//
