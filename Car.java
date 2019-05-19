public class Car extends Vehicle {

	private boolean driving;

		public Car(String brand) {
			super(brand);
			this.driving = true;
		}

	@Override
	public String doStuff() {
		return ("Je suis " + getBrand() + " et je fais Vroum vroum !");
	}

	public boolean isDriving() {
		return driving;
	}

	public void setDriving(boolean driving) {
		this.driving = driving;
	}
}
