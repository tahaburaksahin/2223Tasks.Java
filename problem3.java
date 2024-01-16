//Write a program which reads four integer numbers and prints the difference between the
//largest and the smallest of them. Don’t use arrays, strings or collections.
//taha burak sahin pjatk

package PDF3;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read four integer numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        System.out.println("Enter the fourth number:");
        int num4 = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the largest and smallest numbers
        int largest = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int smallest = Math.min(Math.min(num1, num2), Math.min(num3, num4));

        // Calculate and print the difference
        int difference = largest - smallest;
        System.out.println("The difference between the largest and smallest numbers is: " + difference);
    }
}
//English explanation
//This program receives four integers from the user,
// finds the largest and smallest numbers, and calculates
// the difference between these two numbers.
// Additionally, it accomplishes this task without using arrays, strings, or collections.
//
//The basic steps of the program are:
//Creating a Scanner: An object of the Scanner class is created to receive input from the user.

//Four Integer Inputs: Four integer inputs are received from the user respectively.

//Finding the Largest and Smallest Numbers: Using the Math.max and Math.min functions,
// the largest and smallest numbers among the four inputs are found.

//Calculating and Printing the Difference: The difference between the
// largest and smallest numbers is calculated and printed on the screen.
//
//Scanner Closing: The Scanner object in use is closed to prevent resource leakage.
//
//These steps allow the program to receive four integers from the user,
// determine the largest and smallest numbers between these numbers,
// and then calculate the difference between these two numbers and
// print them to the screen. The program represents a simple approach without the use of arrays or other data structures.


//turkce aciklama
//Bu program kullanıcıdan dört tamsayı alır,
// en büyük ve en küçük sayıları bulup hesaplıyoruz
//bu iki sayı arasındaki fark.
// Ayrıca bu görevi diziler, dizeler veya koleksiyonlar kullanmadan gerçekleştirir.
//
//Programın temel adımları şunlardır:
//Tarayıcı Oluşturma: Kullanıcıdan girdi almak için Tarayıcı sınıfının bir nesnesi oluşturulur.

//Dört Tamsayı Girişi: Kullanıcıdan sırasıyla dört tamsayı girişi alınır.

//En Büyük ve En Küçük Sayıları Bulma: Math.max ve Math.min fonksiyonlarını kullanarak,
// dört girdiden en büyüğü ve en küçüğü bulunur.

//Farkın Hesaplanması ve Yazdırılması : Aradaki fark
// en büyük ve en küçük sayılar hesaplanıp ekrana yazdırılır.
//
//Tarayıcı Kapanıyor: Kaynak sızıntısını önlemek için kullanılan Tarayıcı nesnesi kapatılır.
//
//Bu adımlar programın kullanıcıdan dört tam sayı almasını sağlar,
// bu sayılar arasındaki en büyük ve en küçük sayıları belirliyoruz,
// ve sonra bu iki sayı arasındaki farkı hesaplayalım ve
// bunları ekrana yazdırıyoruz. Program, diziler veya diğer veri yapılarını kullanmadan basit bir yaklaşımı temsil eder.