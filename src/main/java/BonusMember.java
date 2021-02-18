import java.time.LocalDate;

public class BonusMember {
    private int memberNumber;
    private LocalDate enrolledDate;
    private int bonusPointsBalance = 0;
    private String name;
    private String eMailAddress;
    private String password;
    private Membership membership;
    private static final int SILVER_LIMIT = 25000;
    private static final int GOLD_LIMIT = 75000;

    public BonusMember(int memberNumber,LocalDate enrolledDate, int bonusPointsBalance, String name, String eMailAddress, String password, Membership membership){
        this.memberNumber = memberNumber;
        this.enrolledDate = enrolledDate;
        this.bonusPointsBalance = bonusPointsBalance;
        this.name = name;
        this.eMailAddress = eMailAddress;
        this.password = password;
        this.membership = new BasicMembership();
        checkAndSetMembership();
    }
    public int getMemberNumber() {
        return memberNumber;
    }

    public LocalDate getEnrolledDate() {
        return enrolledDate;
    }

    public int getBonusPointsBalance() {
        return bonusPointsBalance;
    }

    public String getName() {
        return name;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public String getPassword() {
        return password;
    }

    public Membership getMembership() {
        return membership;
    }

    public String getMembershipLevel(){
        return membership.getMembershipName();
    }
    public Boolean checkPassword(String password){
        if(password.equalsIgnoreCase(getPassword())){
            return true;
        }else{
            return false;
        }
    }
    public void registerBonusPoints(int newPoints){
        bonusPointsBalance += membership.registerPoints(this.bonusPointsBalance, newPoints);
        checkAndSetMembership();
    }
    private void checkAndSetMembership() {
        if (getBonusPointsBalance() >= GOLD_LIMIT) {
            this.membership = new GoldMembership();
        } else if (getBonusPointsBalance() >= SILVER_LIMIT) {
            this.membership = new SilverMembership();
        } else {
            this.membership = new BasicMembership();
        }
    }
    public String toString(){
        return "Member number: "+getMemberNumber()+
                "Member name: "+getName()+
                "Member points balance: "+getBonusPointsBalance()+
                "Membership level: "+getMembershipLevel();
    }
}
