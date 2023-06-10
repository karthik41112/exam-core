package examSeating.controller;
import java.util.*;
import java.text.*;
public class Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy HH:mm");
		Date d1=sdf.parse("12/12/2001 00:42");
		Date d2=sdf.parse("11/12/2001 14:43");
//		System.out.println(sdf.format(sdf.parse("11/12/2001 14:42")));
		System.out.println(d1.compareTo(d2));
		

	}

}
//private List<Date> sdate;
//private List<Date> edate;

//public int addDate(Date d,Date ed) {
//	Date d1,d2;
//	for(int i=0;i<sdate.size();i++) {
//		d1=sdate.get(i);
//		d2=edate.get(i);
//		if(d1.compareTo(d)<0) {
//			if(d2.compareTo(d)<0) {
//				sdate.add(d);
//				edate.add(ed);
//				return 1;
//			}
//		}else if(d1.compareTo(d)>0) {
//			if(d1.compareTo(ed)>=0) {
//				sdate.add(d);
//				edate.add(ed);
//				return 1;
//			}
//		}
//	}
//	return 0;
//}
