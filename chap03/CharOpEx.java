public class CharOpEx {
    public static void main(String[] args) {
        // TODO 문자 연산
        // a에서 z까지 출력
        for(char i = 'a'; i <= 'z'; i++){
            System.out.println(i);
        }
        char cvar1 = 'a';
        System.out.println(cvar1+5); // f를 기대 실제 102
        for(char i ='Z'; i >= 'A'; i--){
            System.out.println(i+"\t");
        }
        System.out.println();
    }
    
}
