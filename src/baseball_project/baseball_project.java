package baseball_project;

import java.util.Random;
import java.util.Scanner;

public class baseball_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] n = new int[3];
        int[] guess = new int[3];
        boolean[] already = new boolean[10];
        int strike, ball;

        for (int i = 0; i < 10; i++) {
            already[i] = false;
        }
        int count = 0;
        while (count < 3) {
            int trial = rand.nextInt(10);
            if (!already[trial]) {
                n[count] = trial;
                already[trial] = true;
                count++;
            }
        }
        boolean finish = false;
        while (!finish) {
            strike = ball = 0;
            System.out.println("0~9사이의 3가지 정수값을 입력하셈. >>");
            for (int k = 0; k < 3; ++k) {
                guess[k] = sc.nextInt();
                for (int j = 0; j < 3; ++j)
                    if (guess[k] == n[j]) {
                        if (k == j) strike++;
                        else ball++;
                    }
            }
            System.out.println(strike + "스트라이크" + ball + "볼");
            if (strike == 3)
                finish = true;
        }
        sc.close();
        for (int j = 0; j < 3; ++j)
            System.out.print(n[j] + " ");
        System.out.println(" : PERFECT!");
    }
}
