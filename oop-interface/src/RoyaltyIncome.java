
/**
 * 稿费收入税率是20%
 */
class RoyaltyIncome implements Income{
	protected double income ;
	public RoyaltyIncome(double income ){
		this.income=income;
	}
	// TODO
	@Override
	public double getTax(){
		return this.income*0.2;
	}

	
}
