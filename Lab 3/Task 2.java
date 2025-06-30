import java.util.Scanner;
public class PrimeNumbersArray {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Starting Number: ");
int start = sc.nextInt();
System.out.print("Enter Ending Number: ");
int end = sc.nextInt();
int[] primeNumbers = new int[end - start];
int index = 0;
for (int i = start; i <= end; i++) {
if (isPrime(i)) {
primeNumbers[index] = i;
index++;
}
}
System.out.println("Prime Numbers in the Given Range:");
for (int i = 0; i < index; i++) {
System.out.print(primeNumbers[i] + " ");
}
sc.close();
}
public static boolean isPrime(int num) {
if (num < 2) return false;
for (int i = 2; i <= num / 2; i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}
