public class GoldMembership extends Membership{
    private float POINTS_SCALING_FACTOR_LEVEL_1 = 1.3f;
    private float POINTS_SCALING_FACTOR_LEVEL_2 = 1.3f;
    @Override
    public int registerPoints(int bonusPointBalance,int newPoints){
        int pointsTotal = 0;
        float multiplier = 0;
        if(bonusPointBalance<90000){
            multiplier = POINTS_SCALING_FACTOR_LEVEL_1;
        }else{
            multiplier = POINTS_SCALING_FACTOR_LEVEL_2;
        }
        pointsTotal = Math.round((bonusPointBalance+newPoints)*multiplier);
        return pointsTotal;
    }
    @Override
    public String getMembershipName(){
        return "Gold";
    }
}
