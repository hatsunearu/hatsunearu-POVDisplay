import java.util.ArrayList;


public class CharacterFont {

	private final String c_a = 
			"  ******  \n" +
			" *      * \n" +
			"*        *\n" +
			"**********\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *";
	private final String c_b = 
			"********  \n" +
			"*       * \n" +
			"*       * \n" +
			"********  \n" +
			"*       * \n" +
			"*        *\n" +
			"*       * \n" +
			"********  ";
	private final String c_c =
			"   *******\n" +
			"  *       \n" +
			" *        \n" +
			"*         \n" +
			"*         \n" +
			" *        \n" +
			"  *       \n" +
			"   *******";
	private final String c_d =
			"******    \n" +
			"*     *   \n" +
			"*       * \n" +
			"*        *\n" +
			"*        *\n" +
			"*       * \n" +
			"*     **  \n" +
			"******    ";
	private final String c_e =
			"**********\n" +
			"*         \n" +
			"*         \n" +
			"**********\n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"**********";
	private final String c_f =
			"**********\n" +
			"*         \n" +
			"*         \n" +
			"**********\n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"*         ";
	private final String c_g =
			"**********\n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"*    *****\n" +
			"*        *\n" +
			"*        *\n" +
			"**********";
	private final String c_h =
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"**********\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *";
	private final String c_i = 
			"********* \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"********* ";
	private final String c_j =
			"**********\n" +
			"      *   \n" +
			"      *   \n" +
			"      *   \n" +
			"      *   \n" +
			"      *   \n" +
			" *   *    \n" +
			"  ***     ";

	private final String c_k =
			"*      ***\n" +
			"*     *   \n" +
			"*    *    \n" +
			"*****     \n" +
			"*    *    \n" +
			"*    *    \n" +
			"*     **  \n" +
			"*       **\n";
	
	private final String c_l =
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"*         \n" +
			"**********";
	
	private final String c_m = 
			"*        *\n" +
			"**      **\n" +
			"* *    * *\n" +
			"*  *  *  *\n" +
			"*   **   *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *";
	
	private final String c_n =
			"**       *\n" +
			"* *      *\n" +
			"*  *     *\n" +
			"*   *    *\n" +
			"*    *   *\n" +
			"*     *  *\n" +
			"*      * *\n" +
			"*       **";
	
	private final String c_o =
			"  ******  \n" +
			" *      * \n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			" *      * \n" +
			"  ******  ";
	
	private final String c_p = 
			"********  \n" +
			"*       * \n" +
			"*        *\n" +
			"*       * \n" +
			"********  \n" +
			"*         \n" +
			"*         \n" +
			"*         ";
	
	private final String c_q =
			"  ******  \n" +
			" *      * \n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*    **  *\n" +
			" *     ** \n" +
			"  ****** *";
	
	private final String c_r = 
			"********* \n" +
			"*        *\n" +
			"*        *\n" +
			"********* \n" +
			"* *       \n" +
			"*  **     \n" +
			"*    **   \n" +
			"*      ** ";
	
	private final String c_s = 
			"  ********\n" +
			" *        \n" +
			"*         \n" +
			" *******  \n" +
			"        * \n" +
	        "         *\n" +
			"        * \n" +
	        "********  ";
	
	private final String c_t =
			"********* \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     \n" +
			"    *     ";
	
	private final String c_u = 
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			" *      * \n" +
			"  ******  ";
	
	private final String c_v =
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			"*        *\n" +
			" *      * \n" +
			"  *    *  \n" +
			"   *  *   \n" +
			"    **    ";
	
	private final String c_w =
			"*       * \n" +
			"*       * \n" +
			"*       * \n" +
			"*       * \n" +
			"*       * \n" +
			"*   *   * \n" +
			" *  *  *  \n" +
			"  ** **   ";
	
	private final String c_x =
			"**      **\n" +
			"  *    *  \n" +
			"   *  *   \n" +
			"    **    \n" +
			"    **    \n" +
			"   *  *   \n" +
			"  *    *  \n" +
			"**      **";
	
	private final String c_y =
			"*       * \n" +	
			" *     *  \n" +	
			"  *   *   \n" +	
			"   * *    \n" +	
			"    *     \n" +	
			"    *     \n" +	
			"    *     \n" +	
			"    *     \n";
	
	private final String c_z = 
			"********* \n" +
			"       *  \n" +
			"      *   \n" +
			"     *    \n" +
			"    *     \n" +
			"   *      \n" +
			"  *       \n" +
			"********* ";
	
	

	public CharacterFont() {
		
		
	}
	
	public LEDLine[] charToLines(char c) {
		LEDLine[] lines = new LEDLine[11];
		String fontString = new String();
		switch (c) {
		case 'a':
			fontString = c_a;
			break;
		case 'b':
			fontString = c_b;
			break;
		case 'c':
			fontString = c_c;
			break;
		case 'd':
			fontString = c_d;
			break;
		case 'e':
			fontString = c_e;
			break;
		case 'f':
			fontString = c_f;
			break;
		case 'g':
			fontString = c_g;
			break;
		case 'h':
			fontString = c_h;
			break;
		case 'i':
			fontString = c_i;
			break;
		case 'j':
			fontString = c_j;
			break;
		case 'k':
			fontString = c_k;
			break;
		case 'l':
			fontString = c_l;
			break;
		case 'm':
			fontString = c_m;
			break;
		case 'n':
			fontString = c_n;
			break;
		case 'o':
			fontString = c_o;
			break;
		case 'p':
			fontString = c_p;
			break;
		case 'q':
			fontString = c_q;
			break;
		case 'r':
			fontString = c_r;
			break;
		case 's':
			fontString = c_s;
			break;
		case 't':
			fontString = c_t;
			break;
		case 'u':
			fontString = c_u;
			break;
		case 'v':
			fontString = c_v;
			break;
		case 'w':
			fontString = c_w;
			break;
		case 'x':
			fontString = c_x;
			break;
		case 'y':
			fontString = c_y;
			break;
		case 'z':
			fontString = c_z;
			break;
		}
		String[] fontStringArray = fontString.split("[\\r\\n]+");
		
		/* DEBUG
		for(String s:fontStringArray)
			System.out.println(s);
		*/
		for(int i = 0; i < 10; i++) {
			
			boolean[] ledBooleanLine = new boolean[8];
			
			for(int j = 0; j < ledBooleanLine.length; j++) {
				ledBooleanLine[ledBooleanLine.length - 1 - j] = ( fontStringArray[j].substring(i,i+1) ).equals("*");
			}
			
			lines[i] = new LEDLine(ledBooleanLine);
		}
		
		lines[10] = new LEDLine();
		
		return lines;
	}
	
	public ArrayList<LEDLine> stringToLines(String s) {
		ArrayList<LEDLine> lines = new ArrayList<LEDLine>();
		
		char[] charMessage = s.toLowerCase().toCharArray();
		
		for( char c : charMessage ) {
			
			LEDLine[] LEDMessage = charToLines(c);
			for ( LEDLine l : LEDMessage )
				lines.add(l);
			
		}
		return lines;
		
	}
	
	
}
