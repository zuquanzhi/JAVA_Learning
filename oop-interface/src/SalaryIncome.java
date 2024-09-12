class SalaryIncome implements Income{
    protected double income;

    public SalaryIncome(double income){
             this.income=income;
    }
     @Override
    public double getTax(){
      return this.income*0.1;
    }
}
