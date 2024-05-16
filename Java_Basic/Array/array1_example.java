package Java_Basic.Array;

public class array1_example {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        // 문자열 배열 선언 및 초기화
        String[] favoriteThings = {"독서", "음악 감상", "여행", "요리"};

        // boolean형 배열 선언 및 초기화
        boolean[] isRainy = {true, false, true, false, false, true, true};

        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }

        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println("favoriteThings[" + i + "] = " + favoriteThings[i]);
        }

        for (int i = 0; i < isRainy.length; i++) {
            System.out.println("isRainy[" + i + "] = " + isRainy[i]);
    }
}}
