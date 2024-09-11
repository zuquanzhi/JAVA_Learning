
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome extends Income {

	public RoyaltyIncome(double income) {
		super(income);
	}

	@Override
	public double getTax() {
		return income * 0.2;
	}

}
