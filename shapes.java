
import java.util.*;
public class shapes {
    public static void main(String [] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("enter size of your shape:");
            int n = scanner.nextInt();

            System.out.println("==========================\n total diamond shape \n==========================");
            for (int i = 0; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Print the bottom half of the diamond
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("==========================\n Empty diamond shape \n==========================");
            for (int i = 0; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    if (k == 0 || k == 2 * i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    if (k == 0 || k == 2 * i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n sand clock shape \n==========================");
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }

            System.out.println("==========================\n empty sand clock shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == (n - i - 1) || j ==  i ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            } 

            System.out.println("==========================\n square shape \n==========================");
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("==========================\n empty square shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  "); 
                    }
                }
                System.out.println(); 
            }

            System.out.println("==========================\n character 'A' shape \n==========================");
            for(int i = 0 ; i< n ; i++){
                for(int j =0 ; j<n ; j++){
                    if(i==0 || i == n/2  || j == 0 || j == n - 1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n character 'E' shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n / 2 || i == n-1 || j == 0 ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n character 'F' shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n / 2 || j == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n number '6' shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n / 2 || i==n-1 || j == 0 || (j == n-1 && i > n/2)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n number '8' shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n / 2 || i == n - 1 || j == 0 || j == n - 1 ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n number '9' shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n / 2 || i == n - 1 || j == n-1 || (j == 0 && i < n / 2)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("==========================\n character 'Z' shape \n==========================");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0  || i == n - 1 || j == (n-i-1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }


        }
    }
}
