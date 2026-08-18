public class Day2DataTypes {
    public static void main(String[] args){
        //Bài 1
        int age = 25;
        Integer ageWrapper = 25;

        System.out.println("Primitive age: " + age);
        System.out.println("Wrapper age: "+ ageWrapper);

        //Bài 2
        Integer number = 100;
        int primitiveNumber = number;

        System.out.println("After unboxing: " + primitiveNumber);

        //Bài 3
        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);          // true: 127 nằm trong Integer Cache
        System.out.println(c == d);          // false: 128 nằm ngoài vùng cache được đảm bảo
        System.out.println(a.equals(b));     // true: equals() so sánh value
        System.out.println(c.equals(d));     // true: equals() so sánh value

        //Bài 4
        Integer x = 1000;
        Integer y = 1000;

        System.out.println(x == y); //false vì 2 biến trỏ 2 object khác nhau
        System.out.println(x.equals(y)); //true vì so sánh giá trị của 2 biến

        //bài 5
        Integer value = null;
        // int primitiveValue = value;
        // Lỗi NullPointerException vì value là null,
        // Java không thể unbox null từ Integer thành int.


    }
}
