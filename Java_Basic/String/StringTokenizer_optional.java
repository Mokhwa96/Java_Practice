import java.util.StringTokenizer;

class StringTokenizer_optional {
    public static void main(String[] args){
        String str = "This is a string example using StringTokenizer";
        StringTokenizer tokenizer = new StringTokenizer(str);
        System.out.println(str);
        System.out.println();

        System.out.println("total tokens:" + tokenizer.countTokens());
        // 아래의 while 코드는 반복문의 한 종류인데 어떻게 작동하는지 추후 반복문 챕터에서 공부할 예정이니 걱정하지 않으셔도 됩니다
        while(tokenizer.hasMoreTokens()){
            System.out.println("----");
            System.out.println(tokenizer.nextToken());
            System.out.println("total tokens:"+tokenizer.countTokens());
        }
        System.out.println("total tokens:"+tokenizer.countTokens());
//        int countToken() : 남아있는 token의 개수를 반환합니다. 전체 token의 개수가 아닌 현재 남아있는 token 개수입니다.

//        boolean hasMoreElements(), boolean hasMoreTokens() :
//        두 메서드의 성능적인 차이는 없습니다. 둘 다 동일한 값을 반환합니다.
//        메서드는 현재 위치 뒤에 있는 문자열에서 하나 이상의 토큰을 사용할 수 있는 경우
//        true를 반환하고 그렇지 않으면 false를 반환합니다.

//        Object nextElement(), String nextToken() :
//        이 두 메서드는 다음의 토큰을 반환합니다. 두 가지 메서드는 같은 객체를 반환하는데 반환형은 다릅니다.
//        nextElement는 Object를, nextToken은 String을 반환하고 있습니다.
    }
}
