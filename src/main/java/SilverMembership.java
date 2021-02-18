public class SilverMembership extends Membership{
    private float POINTS_SCALING_FACTOR = 1.2f;
    @Override
    public int registerPoints(int bonusPointBalance,int newPoints){
        int pointsTotal = Math.round((bonusPointBalance+newPoints)*POINTS_SCALING_FACTOR);
        return pointsTotal;
    }
    @Override
    public String getMembershipName(){
        return "Silver";
    }
}
