package sandbox;

public class WeeklyTimetable {

	public static void main(String[] args) {
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		for(int i = 0; i<days.length; i++) {
			System.out.println(days[i] + ":");
			for(int j = 1; j<=2; j++) {
				System.out.println(" Period "+j);
			}
		}

	}

}
