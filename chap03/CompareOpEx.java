public class CompareOpEx {
    public static void main(String[] args) {
        // TODO 비교연산자 ~ 연산결과는 boolean 타입
        // 연산결과 대입하려면 boolean type으로 선언해야 함.
        boolean res = 10 > 20;
        System.out.println(res); // false
        // 즐겨사용하는 장소
        // if( 이자리 )   else if( 이자리  )
        // for(;( 이자리 );)    while ( 이자리 )     ( 이자리 ) ?x:y 
        // 논리연산을 사용하는 장소도 마찬가지다.

        double pia = 3.14d; // d 생략 가능           double형이 float형보다 더 많은 자릿수를 담는다. (그래서 같지 않음) false
        float pib = 3.14f; // f 생략 불가능

        res = pia == pib ;
        System.out.println(res);

        long lv1 = 10L;
        int iv1 = 10;
        res = lv1 == iv1;
        System.out.println(res);
        
        // 문자열 비교
        res = "성주원" == "성주원";
        System.out.println("문자열 비교 결과1: " + res);

        String name1 = new String("홍길동");
        String name2 = "홍길동";

        System.out.println("문자열 비교 결과2: " + (name1 == name2)); // 객체를 비교할때는 그 객체가 가지는 값을 비교할건지 or 저장장소(공간)를 비교할건지를 결정해야함.
        System.out.println("문자열 비교 결과3: " + (name1.equals(name2))); // 객체를 비교할때는 그 객체가 가지는 값을 비교할건지 or 저장장소(공간)를 비교할건지를 결정해야함.
                                            // 객체를 비교할 때는 주로 .equals 사용
                                            // 숫자 동등 비교는 == 을 사용
                                            
        System.out.println(name1);          
        System.out.println(name2);


    }
}
