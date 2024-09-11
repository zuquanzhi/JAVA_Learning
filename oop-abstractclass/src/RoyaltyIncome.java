
/**
 * 稿费收入税率是20%
 */
class RoyaltyIncome extends Income {
	public RoyaltyIncome(double income) {
		super(income);
	}
	// TODO
	@Override
	public double getTax() {
		return income * 0.2;
	}

}
