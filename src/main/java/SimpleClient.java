import java.time.LocalDate;

public class SimpleClient {
    public static void main(String[] args) {
        BonusMember Leo = new BonusMember(1, LocalDate.now(),25000,"Leo","leo@gmail.com","Password",new BasicMembership());
        System.out.println(Leo.toString());
        Leo.registerBonusPoints(100000);
        System.out.println(Leo.toString());
    }
}
