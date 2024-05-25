package lesson1;

public class ArraysCyclesExample {
    public static void main(String[] args) {
        while(true){
            break;
        }

        int[] a = {1,2,3};
        int[] b = new int[5];
        //new - ключевое слово, но вот что оно делает мы узнаем дальше

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        // Немножко синтаксического сахара
        for(int i:a){
            System.out.println(i);
        }

        //Многомерные тоже можно!
        int[][] c = new int[3][5];
    }
}
