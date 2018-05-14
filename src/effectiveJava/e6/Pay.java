package effectiveJava.e6;

public class Pay {
	
	
	public enum PayrollDay{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
		
		private static final int Hours_pre_shift = 8;
		double pay(double hoursWorked, double payRate){
			double basePay = hoursWorked * payRate;
			
			double overtimePay ;
			switch(this){
			case SATURDAY:case SUNDAY:
				overtimePay = hoursWorked * payRate /2;
			default:
				overtimePay = hoursWorked < Hours_pre_shift ? 0 : (hoursWorked - Hours_pre_shift)* payRate/2;
				break;
			}
			return basePay + overtimePay;
		}
	}
	//如果要表达一个假期特殊天数。添加元素在枚举当中，但是忘记在switch中添加，导致错误。
	
	public enum PayrollDay2{
		MONDAY(PayType.WEEKDAY),
		TUESDAY(PayType.WEEKDAY),
		WEDNESDAY(PayType.WEEKDAY),
		THURSDAY(PayType.WEEKDAY),
		FRIDAY(PayType.WEEKDAY),
		SATURDAY(PayType.WEEKEND),
		SUNDAY(PayType.WEEKEND);
		
		private final PayType payType;
		PayrollDay2(PayType payType){
			this.payType = payType;
		}
		
		double pay(double hoursWorked,double payRate){
			return payType.pay(hoursWorked, payRate);
		}
		
		private enum PayType{
			WEEKDAY{
				@Override
				double overtimePay(double hrs, double payRate) {
					return hrs < Hours_pre_shift?0: (hrs-Hours_pre_shift)* payRate/2;
				}
				
			},
			WEEKEND{
				@Override
				double overtimePay(double hrs, double payRate) {
					return hrs*payRate/2;
				}
			};
			private static final int Hours_pre_shift = 8;
			abstract double overtimePay(double hrs,double payRate);
			
			double pay(double hoursWorked,double payRate){
				double basePay = hoursWorked * payRate;
				return basePay + overtimePay(hoursWorked, payRate);
			}
		}
	}
	
	public static void main(String[] args) {
		double sum1 = PayrollDay2.MONDAY.pay(9, 20);
		System.out.println(sum1);
	}
	
}
