import java.util.Scanner;

public class Pefectpet {
    public static void main(String[] args){
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter your favorite color (Either red, blue or green):");
        String color = scannerobj.nextLine().toLowerCase();
        System.out.println("Enter your favorite season (Either fall, spring, winter, or summer):");
        String season = scannerobj.nextLine().toLowerCase();
        if (color.contains("blue") && season.contains("fall")){
            System.out.println("Alligator");
        }
        if (color.contains("blue") && season.contains("spring")){
            System.out.println("ostrich");
        }
        
        scannerobj.close();
    }
}
