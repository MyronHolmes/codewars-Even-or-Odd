public class Kata {

//    Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
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