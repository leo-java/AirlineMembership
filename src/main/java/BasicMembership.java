import java.lang.reflect.Member;

public class BasicMembership extends Membership {
    @Override
    public int registerPoints(int bonusPointBalance,int newPoints){
        int pointsTotal = Math.round(bonusPointBalance+newPoints);
        return pointsTotal;
    }
    @Override
    public String getMembershipName(){
        return "Basic";
    }
}
