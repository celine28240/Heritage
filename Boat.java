public class Boat extends Vehicle {

	private boolean floating;

		public Boat(String brand) {
			super(brand);
			this.floating = false;
		}

	@Override
	public String doStuff() {
		return "Je suis " + getBrand() + " et je fais Gloup gloup !";
	}

	public boolean isFloating() {
		return floating;
	}

	public void setFloating(boolean floating) {
		this.floating = floating;
	}
}
