package lesson1;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        //На день рождения Пете подарили набор карточек с буквами.
        // Теперь Петя с большим интересом составляет из них разные слова.
        // И вот, однажды, составив очередное слово, Петя заинтересовался вопросом:
        // "А сколько различных слов можно составить из тех же карточек, что и данное?".
        // solo - 12

        int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String b = new Scanner(System.in).nextLine();
        long c = factorial(b.length());
        for(int i=0;i<b.length();i++){
            a[b.charAt(i)-97]++;
        }
        for(int i = 0;i<26;i++){
            c/=factorial(a[i]);
        }
        System.out.println(c);


//        a=[]
//        for i in range(26):
//        a.append(0)
//        b=input()
//        for i in range(len(b)):
//        a[ord(b[i])-97]+=1
//        c=factorial(len(b))
//        for i in range(26):
//        c=c/factorial(a[i])
//        print(int(c))

    }
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
