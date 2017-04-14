public class penggunaansuperchild extend penggunaan super {
	int num = 10;
		public void tampilkan() {
			System.out.println("ini tampilan dari sub kelas");
		}
		public void penggunaan super() {
			tampilkan();
			super.tampilkan();
			System.out.println("nilai variabel num pada sub kelas:' + num");
			System.out.println("nilai variabel num pada super kelas" + super.num);
		}
		public static void main(String args[]) {
		penggunaansuperchild obj = penggunaansuperchild();
		obj.penggunaansuper();
		}
		
	}