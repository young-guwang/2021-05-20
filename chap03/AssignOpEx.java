public class AssignOpEx {
    public static void main(String[] args) {
        // TODO 대입연산자의 활욜
        int some = 10;
        some += 20; // some = some + 20;
        
        for(int i = 0; i <= 100; i+=5){
            System.out.println(i);
        }
        
        // 문자열 결합에도 사용할 수 있음.
        String gugudan ="";

        for(int i = 1; i <= 9; i++) {
            gugudan += 9 + "*" + i + "=" + 9*i + "\n"; 
        }
        System.out.println(gugudan);
    }
}
