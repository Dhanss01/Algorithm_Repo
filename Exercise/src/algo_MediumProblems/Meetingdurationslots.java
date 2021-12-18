package algo_MediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Meetingdurationslots {
	
	@Test
	public void example() {
		// Slot1 Start and End
		List<Integer> slot1ScheduleStart = new ArrayList<>(Arrays.asList(10, 60, 140));
		List<Integer> slot1scheduleEnd = new ArrayList<>(Arrays.asList(50, 120, 210));

		// Slot2 Start and End
		List<Integer> slot2ScheduleStart = new ArrayList<>(Arrays.asList(0, 60));
		List<Integer> slot2scheduleEnd = new ArrayList<>(Arrays.asList(15, 70));

		int duration = 5;

		 PossibitlityOfAttendingMeeting(slot1ScheduleStart, slot1scheduleEnd, slot2ScheduleStart,
				slot2scheduleEnd, duration);
	}
	@Test

	public void example1() {
		// Slot1 Start and End
		List<Integer> slot1ScheduleStart = new ArrayList<>(Arrays.asList(10, 60, 140));
		List<Integer> slot1scheduleEnd = new ArrayList<>(Arrays.asList(50, 120, 210));

		// Slot2 Start and End
		List<Integer> slot2ScheduleStart = new ArrayList<>(Arrays.asList(10, 60));
		List<Integer> slot2scheduleEnd = new ArrayList<>(Arrays.asList(15, 75));

		int duration = 10;

		 PossibitlityOfAttendingMeeting(slot1ScheduleStart, slot1scheduleEnd, slot2ScheduleStart,
				slot2scheduleEnd, duration);
	}

	public int[] PossibitlityOfAttendingMeeting(List<Integer> slot1ScheduleStart, List<Integer> slot1scheduleEnd,
			List<Integer> slot2ScheduleStart, List<Integer> slot2scheduleEnd, int duration) {

		// slot1 ---------------------------------------------------------------

		// Create 2 dimensional array to start comparision with start and end at once
		int[][] conferneceTimes1 = new int[slot1ScheduleStart.size()][2];

		// Push the start and end time to 2 dimensional array for sorting
		for (int i = 0; i < conferneceTimes1.length; i++) {
			conferneceTimes1[i][0] = slot1ScheduleStart.get(i);
			// .out.println("i" + i + "0" + " " + slot1ScheduleStart.get(i));
			conferneceTimes1[i][1] = slot1scheduleEnd.get(i);
			// System.out.println("i" + i + "1" + " " + slot1scheduleEnd.get(i));

		}
		// ---------------------------------------------------------------------------------------
		// slot2

		int[][] conferneceTimes2 = new int[slot2ScheduleStart.size()][2];
		for (int i = 0; i < conferneceTimes2.length; i++) {
			conferneceTimes2[i][0] = slot2ScheduleStart.get(i);
			conferneceTimes2[i][1] = slot2scheduleEnd.get(i);
		}
		int k = 0;
		for (int i = 0; i < conferneceTimes1.length; i++) {
			for (int j = 0; j <= i; j++) {
				if ((k < conferneceTimes2.length)) {
					int slot1 = conferneceTimes1[i][0];
					int slot2 = conferneceTimes2[i][0];

					int max = Math.max(slot1, slot2);
					int slot11 = conferneceTimes1[i][1];
					int slot21 = conferneceTimes2[i][1];
					int min = Math.min(slot11, slot21);
					int abs = Math.abs(max - min);
					int diff = max - min;
					if (Math.abs(diff) >= duration) {
						System.out.println(max+" "+(max+duration));
						return new int[] {max,max + duration};
					}
					k++;
				}
			}

		}
		return new int[] {-1,-1};

	}

}
