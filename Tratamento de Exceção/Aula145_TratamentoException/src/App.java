import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Position error");
        }catch(InputMismatchException error){
            System.out.println("Input error");
        }
        sc.close();
    }
}
