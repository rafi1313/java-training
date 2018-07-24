import java.util.Scanner;
public class J14_2 {
    public static void main(String[] args) {
        System.out.println("Podaj wysokość drzewka:");
        Scanner userInput = new Scanner(System.in);
        int height = userInput.nextInt();
        for (int i = 0; i<height;i++){
            for (int j =0; j<(height-i);j++){
                System.out.print(" ");
            }
            for (int k =0;k<((i*2)+1);k+=1){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
