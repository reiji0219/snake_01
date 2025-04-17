package leapYear;

/**
 * うるう年
 * @author reiji
 * 
 */
public class LeapYear
{

	/**
	 * うるう年の判定ロジック
	 * 400で割り切れる : うるう年
	 * 上記以外で100で割り切れる : うるう年ではない
	 * 上記以外で4で割り切れる : うるう年
	 * 上記以外 : うるう年ではない
	 *  @param year 西暦の年
	 * @return
	 */

	public boolean isLeapYear( int year ) {
		boolean result = false;
		
		if (year <= 0 ) {
			result = false;
		}else if (year % 400 == 0 ) {
			result = true;
		}else if ( year % 100 == 0 ) {
			result = false;
		}else if ( year % 4 == 0 ) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
}
