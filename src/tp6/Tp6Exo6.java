package tp6;

public class Tp6Exo6 {

	public static void main(String[] args) {
		char value_car;
		char value_car_two;
		for (int i = 128; i < 255; i++) {
			value_car = (char)i;
			System.out.println(i+" -> "+ value_car);
		}
		for (int i = 256; i < 351; i++) {
			value_car_two = (char)i;
			System.out.println(i+" -> "+ value_car_two);
		}
	}

}
