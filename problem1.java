//Create a program Underscore.java which will print out two literals: • 1000000 • 1_000_000
//Do not use ""marks. Did the number printed change?
//taha burak sahin pjatk

package PDF3;


public class problem1 {
    public static void main(String[] args) {
        int Underscore=1000000;
        int Underscorewith_= 1_000_000;

        System.out.println(Underscore);
        System.out.println(Underscorewith_);
    }


}
//English explanation
//The feature of using underscores in numeric constants, introduced in Java 7,
// was added to make large numeric constants more readable.
// This feature is used to group numbers and make numbers more readable.
//For example, there is no mathematical difference between 1000000 and 1_000_000.
// However, the use of underscores breaks the number into parts, providing a more readable form.
// This feature is especially useful for visually separating large numbers and reducing the chance of errors.


//turkce aciklamasi ;
//Java 7'de tanıtılan alt çizgilerin sayısal sabitlerde kullanılması özelliği,
// büyük sayısal sabitleri daha okunabilir hale getirmek amacıyla eklenmiştir.
// Bu özellik, sayıları gruplandırmak ve sayıları daha rahat okunabilir hale getirmek için kullanılır.
//Örneğin, 1000000 ile 1_000_000 arasında matematiksel bir fark yoktur.
// Ancak alt çizgilerin kullanımı, sayıyı parçalara ayırarak daha okunabilir bir form sağlar.
// Bu özellik özellikle büyük sayıları görsel olarak ayırmak ve hata yapma olasılığını azaltmak için yararlıdır.