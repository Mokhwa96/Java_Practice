class String_class_method {
    public static void main(String[] args){
//length() 메서드----------------------------------------------------------------------------
//        String str = "codestates";
//        System.out.println(str.length());
//charAt() 메서드-----------------------------------------------------------------------
//        String str = new String("Java");
//        System.out.println(str.charAt(0)); // 'J'
//        System.out.println(str.charAt(1)); // 'a'
//        System.out.println(str.charAt(2)); // 'v'
//        System.out.println(str.charAt(3)); // 'a'
//        System.out.println(str.length()); // 4
//
//        System.out.println("\\ncharAt() 메서드 호출 후 문자열 : " + str);
//compareTo() 메서드----------------------------------------------------------------------
//        String str = new String("abcd");
//        System.out.println("문자열" + str);
//        System.out.println(str.compareTo("bcef"));
//        System.out.println(str.compareTo("abcd") + "\\n");
//        System.out.println(str.compareTo("Abcd"));
//        System.out.println(str.compareToIgnoreCase("Abcd"));
//        System.out.println("compareTo() 메서드 호출 후 문자열 : " + str);;
//concat() 메서드----------------------------------------------------------------------
//        String str = new String("Java");
//        System.out.println("문자열 : " + str);
//        System.out.println(str.concat("수업"));
//        System.out.println("concat() 메서드 호출후 문자열 : " + str );
//indexOf() 메서드----------------------------------------------------------------------
//        String str = new String("Oracle Java");
//        System.out.println("문자열 : " + str);
//        System.out.println(str.indexOf('o'));
//        System.out.println(str.indexOf('a'));
//        System.out.println(str.indexOf("Java"));
//        System.out.println("indexOf() 메서드 호출 후 원본 문자열 : " + str);
//trim() 메서드----------------------------------------------------------------------
//        String str = new String(" Java     ");
//        System.out.println("문자열 : " + str);
//        System.out.println(str + '|');
//        System.out.println(str.trim() + '|');
//        System.out.println("trim() 메서드 호출 후 문자열 : " + str);
//toLowerCase()와 toUpperCase() 메서드----------------------------------------------------------------------
        String str = new String("Java");
        System.out.println("문자열 : " + str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("두 메서드 호출 후 문자열 : " + str);
    }
}