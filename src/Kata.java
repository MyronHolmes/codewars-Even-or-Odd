public class Kata {
    public static String evenOrOdd(int number) {
        String answer = null;
        if(number % 2 == 0){
            answer = "Even";
        }else if(number % 2 != 0){
            answer = "Odd";
        }
        return answer;
    }
}