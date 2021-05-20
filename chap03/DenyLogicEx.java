public class DenyLogicEx {
    public static void main(String[] args) {
        boolean goodboy = true;
        goodboy =! goodboy;
        System.out.println(goodboy); // false
        // 비트리버스연산과 혼돈하지 말것 ~ (틸드로 연산함)
    }
    
}
