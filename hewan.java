class hewan {

	public void makan() {
		System.out.println("hewan bisa makan");
		}
}

class ayam extends hewan {

	@Override
	public void makan () {
		System.out.println("ayam bisa makan");
		super.makan();
	}
}