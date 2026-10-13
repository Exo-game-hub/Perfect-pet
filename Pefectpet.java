import java.util.Scanner;

public class Pefectpet {
    public static void main(String[] args){
        Scanner scannerobj = new Scanner(System.in);
       
        System.out.println("Enter your favorite color (Either red, blue or green):");
        String color = scannerobj.nextLine().toLowerCase();
        
        System.out.println("Enter your favorite season (Either fall, spring, winter, or summer):");
        String season = scannerobj.nextLine().toLowerCase();
        
        System.out.println("Enter your name:");
        String name = scannerobj.nextLine().toLowerCase();
         

         if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0,1).toLowerCase()) >= 0) {
                System.out.println("Not A Real Name! Try Again");
        }

            else if (color.contains("blue") && season.contains("fall")){
                System.out.println("Alligator");
            }
            
                else if (color.contains("blue") && season.contains("spring")){
                    System.out.println("ostrich");
                }
                    else if ("bcdfghjklmnopqrstvwxz".indexOf(name.substring(0,1)) != -1 && color.contains("blue") && season.contains("winter")){
                        System.out.println("giraffe");
                    }
                        else if (!season.contains("fall")&& color.contains("green")){
                            System.out.println("dog");
                        }
                            else if (color.contains("red")){
                                System.out.println("panda");
                            }
                                else if ("aeiou".indexOf(name.substring(0,1)) !=1){
                                    System.out.println("porcupine");
                                }
                                    else if (season.contains("summer")){
                                        System.out.println("Ponie");
                                    }
                                        else if ("bcdfghjklmnopqrstvwxz".indexOf(name.substring(0,1)) != -1 && color.contains("blue") && !season.contains("summer")||!season.contains("fall")){
                                            System.out.println("axolotl");
                                        }
                                            else{
                                                System.out.println("pet rock");
                                            }
        scannerobj.close();
    }
}
