import java.util.Scanner;

public class miniproject {
    public static void main(String[] args) {
        //mini project
        Scanner sc = new Scanner(System.in);
        int my_number = (int)(Math.random()*100);
        int your_number=0 ;
        do {
            System.out.println("YOUR GUESS(1-100):");
            your_number = sc.nextInt();

            if (your_number == my_number){
                System.out.println("YOU GUESS IT RIGHT!!!!!!!!");
                break;
            } else if (your_number < my_number) {
                System.out.println("NUMBER IS TOO SMALL");
            }
            else {
                System.out.println("NUMBER IS TOO LARGE ");
            }

        }while (your_number>=0);}
}