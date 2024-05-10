public class StringBuilder_StringBuffer {

    public static void main (String[] args){
//    StringBuilder :
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("문자열 ").append("연결");
//        String str = stringBuilder.toString();
//        System.out.println(stringBuilder);
//        System.out.println(str);
//    StringBuffer : 값을 변경 및 추가가 가능하다.
//        StringBuffer str = new StringBuffer("Java");
//        System.out.println("문자열 : " + str);
//        System.out.println(str.append(" programming"));
//        System.out.println("append() 메서드 호출 후 문자열 : " + str);
//    append()
//        StringBuffer str01 = new StringBuffer();
//        StringBuffer str02 = new StringBuffer("Java");
//        System.out.println(str01.capacity());
//        System.out.println(str02.capacity());
//    delete()
//        StringBuffer str = new StringBuffer("Java Oracle");
//        System.out.println("문자열 : " + str);
//        System.out.println(str.delete(4, 8));
//        System.out.println(str.deleteCharAt(1));
//        System.out.println("deleteCharAt() 메소드 호출 후 문자열 : " + str);
//    insert()
        StringBuffer str = new StringBuffer("Java Programming!!");
        System.out.println("문자열 : " + str);
        System.out.println(str.insert(4, "Script"));
        System.out.println("insert() 메서드 호출 후 문자열 : " + str);
    }
}
