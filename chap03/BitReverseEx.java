public class BitReverseEx {
    public static void main(String[] args) {
        // TODO 비트 반전 연산
        // 비트 반전 연산으로 음수로 바꿀 시에는 +1을 추가해 주어야 한다.
        int v1 = 10;
        int v2 = ~10 + 1;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1 + v2);
        // 이진수로 변환하는 메소드 (Integer.toBinaryString)
        // Integer ~ int 타입의 Wrapper Class 
        System.out.println(Integer.toBinaryString(v1)); 
        System.out.println(Integer.toBinaryString(v2)); 

    }
    
}
