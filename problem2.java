//Task 2
//Create a program, which will check how the mathematical operations (+,-,*,/,%) will function
//with variables of:
//• integer numbers
//• real numbers
//• character values


//taha burak sahin pjatk
package PDF3;

public class problem2 {
    public static void main(String[] args) {
                // Integer numbers
                int num1 = 10;
                int num2 = 5;

                System.out.println("Integer Operations:");
                System.out.println("Addition: " + (num1 + num2));
                System.out.println("Subtraction: " + (num1 - num2));
                System.out.println("Multiplication: " + (num1 * num2));
                System.out.println("Division: " + (num1 / num2));
                System.out.println("Modulus: " + (num1 % num2));

                // Real numbers
                double realNum1 = 10.5;
                double realNum2 = 2.5;

                System.out.println("\nReal Number Operations:");
                System.out.println("Addition: " + (realNum1 + realNum2));
                System.out.println("Subtraction: " + (realNum1 - realNum2));
                System.out.println("Multiplication: " + (realNum1 * realNum2));
                System.out.println("Division: " + (realNum1 / realNum2));
                // Modulus is not applicable for real numbers

                // Character values (considering their ASCII values)
                char char1 = 'A';
                char char2 = 'B';

                System.out.println("\nCharacter Operations:");
                System.out.println("Addition: " + (char1 + char2));
                System.out.println("Subtraction: " + (char2 - char1));
                System.out.println("Multiplication: " + (char1 * char2));
                System.out.println("Division: " + (char2 / char1));
                System.out.println("Modulus: " + (char2 % char1));
            }
        }
//English explanation
//Integer Numbers:Two integer variables (num1 and num2) are defined of type int.
//Addition, subtraction, multiplication, division and modulation operations were
// performed and the results were printed on the screen.
//Modification gives the remainder after dividing two numbers.

//Real Numbers (Decimal Numbers): Two decimal variables (realNum1 and realNum2) of type double are defined.
//Addition, subtraction, multiplication and division operations were performed.
// Modification does not apply to decimal numbers.

//Character Values:Two character variables (char1 and char2) are defined of type char.
//Characters are processed based on ASCII values. Addition, subtraction, multiplication, division
// and modal operations were performed.

//The program shows us how to perform mathematical operations with variables
// of different data types. Mathematical operations between different data types may
// differ depending on the characteristics of that data type. For example, characters
// are processed by converting them into ASCII values, and therefore character addition
// means adding the ASCII values of the characters.


//Turkce açıklama
//Tamsayı Sayılar: int türünde iki tamsayı değişken (num1 ve num2) tanımlanır.
//Toplama, çıkarma, çarpma, bölme ve modülasyon işlemleri yapıldı
// yapıldı ve sonuçlar ekrana yazdırıldı.
//Değişiklik iki sayıyı böldükten sonra kalanı verir.

//Gerçek Sayılar (Ondalık Sayılar): Double tipinde iki ondalık değişken (realNum1 ve realNum2) tanımlanır.
//Toplama, çıkarma, çarpma ve bölme işlemleri yapıldı.
// Değişiklik ondalık sayılara uygulanmaz.

//Karakter Değerleri: Char türünde iki karakter değişkeni (char1 ve char2) tanımlanır.
//Karakterler ASCII değerlerine göre işlenir. Toplama, çıkarma, çarpma, bölme
// ve modal işlemler gerçekleştirildi.

//Program bize değişkenlerle matematiksel işlemlerin nasıl yapılacağını gösteriyor
//farklı veri türleri. Farklı veri türleri arasındaki matematiksel işlemler
// o veri tipinin özelliklerine göre farklılık gösterir. Örneğin karakterler
// ASCII değerlerine dönüştürülerek işlenir ve dolayısıyla karakter eklenir
// karakterlerin ASCII değerlerinin eklenmesi anlamına gelir.

