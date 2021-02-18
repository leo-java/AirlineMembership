public class Membership {
    public int registerPoints(int bonusPointBalance,int newPoints){
        int pointsTotal = Math.round(bonusPointBalance+newPoints);
        return pointsTotal;
    }
    public String getMembershipName(){
        return "Membership";
    }
}
