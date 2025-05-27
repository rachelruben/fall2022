package netpresentvalue;

public class NPV {

	/**
	 * How much will the specified number of dollars be worth at the
	 * end of the specified time using interest rate r?
	 * 
	 * @param dollars initial investment
	 * @param years   time period of accumulation
	 * @param r       The interest rate, computed at the end of each year
	 * @return the future value of the investment
	 */
	public static double futureValue(double dollars, int years, double r) {
		
		return dollars * Math.pow(1 + r, years); // FIXME
	}

	/**
	 * Given the specified number of dollars some years from now,
	 * how much are those dollars worth presently using the specified
	 * discount rate?
	 * 
	 * @param dollars amount of money available in the future
	 * @param years   number of years in the future
	 * @param r       the discount rate, computed annually
	 * @return the present value of the future money
	 */
	public static double presentValue(double dollars, int years, double r) {
		
		return dollars / Math.pow(1 + r, years); // FIXME
	}

	/**
	 * Compute the net present value of an investment as described on
	 * the web page for this assignment.
	 * 
	 * @param investment the money placed into the investment in year 0, never
	 *                   returned
	 * @param years      the number of payouts
	 * @param payout     the amount of the payout, paid at the end of years 1, 2,
	 *                   ...
	 * @param r          the discount rate of money per year
	 * @return the net present value after all payouts are made
	 */
	public static double netPresentValue(double investment, int years, double payout, double r) {
		
		//return presentValue(-investment, years, r); // this one works only for story
		//double nPV = ((presentValue(payout, years, r)/ Math.pow(1 + r, years)) - investment);
		double nPV = -investment;
		
		for(int i = 1; i <= years; i++) {
			nPV = nPV + presentValue(payout, i, r);
		}
		return nPV;
//		double nPV = 0;
//		if(years == 0)
//			return -investment;
//			nPV += presentValue(payout, years, r) - investment;
//			return nPV;
//  		nPV = presentValue(presentValue(presentValue(payout, years, r), years, r), years - 1, r);
//			double nPV = presentValue(payout, years, r);
//			return nPV;
//			presentValue(payout, years - 1, r) + presentValue(payout, years, r); // FIXME
	}
}	
