
class SalaryIncome extends Income {
	public SalaryIncome(double income) {
		super(income);
	}
	// TODO
	@Override
	public double getTax() {
		if (income <= 5000) {
			return 0;
		} else {
			return (income - 5000) * 0.2;
		}
	}

}
