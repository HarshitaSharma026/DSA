package CompanyQuestions;

// NETAPP EXTRANCE EXAM:
// given a character array, it it contains, atleast one of C, M, Y means it's a colored photo otherwise black and white photo

import java.util.Scanner;

public class ColoredBlackWhitePhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] photo = new char[2][3];
        for (int r = 0; r < photo.length; r++) {
            for (int c = 0; c < photo[0].length; c++) {
                photo[r][c] = sc.next().charAt(0);
            }
        }

        // check
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[0].length; j++) {
                if (photo[i][j] == 'C' || photo[i][j] == 'M' || photo[i][j] == 'Y'){
                    System.out.println("colorful");
                    return;
                }
            }
        }

        System.out.println("black and white");
    }
}
