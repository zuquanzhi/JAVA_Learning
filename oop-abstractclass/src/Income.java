
/**
 * 定义抽象类Income
 */
public abstract class Income {
	protected double income;
	// TODO
	public Income(double income) {
		this.income = income;
	}
	public abstract double getTax();
}
