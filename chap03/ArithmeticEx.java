public class ArithmeticEx {
    public static void main(String[] args) {
        // TODO 자바 산술 연산 시 주의 사항
        int v1 = 7;
        int v2 = 2;
        System.out.println(v1/v2); // 기대 3.5 실제 3
        double v3 = 7;
        double v4 = 2;
        System.out.println(v3/v4);
        
        long v5 = 7;
        long v6 = 2L;
        System.out.println(v5/v6);
        // 해결방법 ~ 둘 중 하나를 캐스팅연산 (강제형변환)
        System.out.println((double)v5/v6);
        
    }
}
    