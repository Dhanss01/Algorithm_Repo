package Assesment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;



public class SortCars {
	

	@Test
	public void sortUsingCompare() {
		
		List<ZoomCars> cars = new ArrayList<ZoomCars>();
		cars.add(new ZoomCars("Maruti Swift AT", "Diesel", 1258));
		cars.add(new ZoomCars("Toyoto Glanza", "Petrol", 1208));
		cars.add(new ZoomCars("Ford Ecosport", "Diesel", 1359));
		cars.add(new ZoomCars("Maruti Swift", "Diesel", 1153));
		cars.add(new ZoomCars("Tata Tiago", "Diesel", 978));
		
		Collections.sort(cars, new Comparator<ZoomCars>() {

			@Override
			public int compare(ZoomCars car1, ZoomCars car2) {
				if(car1.getPrice() > car2.getPrice())
					return -1; //decending
				else if(car1.getPrice() < car2.getPrice())
					return 1; //ascending
				else return 0;
			}
		});
		
		
		
		List<ZoomCars> dieselCars = cars.stream().filter(c -> c.getType().equals("Diesel"))
				.collect(Collectors.toList());
		Collections.sort(dieselCars, (car1, car2) -> {
			if (car1.getPrice() > car2.getPrice())
				return -1;
			else if (car1.getPrice() < car2.getPrice())
				return 1;
			else
				return 0;
		}

		);
		System.out.println(dieselCars.toString());
	
		
		
		//Collections.sort(cars, (car1,car2) -> car1.getPrice()>car2.getPrice() ? -1:1);
		//Comparator<ZoomCars> carpbyPrice = Comparator
        //     .comparing(ZoomCars::getPrice);
		
		System.out.println(cars.toString());
		System.out.println(cars.get(0).toString());
	}


}
