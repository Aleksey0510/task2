public class Main {
    public static void main(String[] args) {
        int onTheAccount = 500; // на счету
        int upTheAccount = 1700; // пополнение счета
        int bonus;
        if (upTheAccount > 1000) {
            bonus = upTheAccount / 100;
        } else {
            bonus = 0;
        }
int result = onTheAccount + upTheAccount + bonus;
        System.out.println(result + " рублей на счету, включая " + bonus + " бонусных рублей ");
    }
}