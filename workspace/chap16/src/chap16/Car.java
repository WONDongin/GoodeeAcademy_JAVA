package chap16;

public class Car {
		private int month;
		private int con;
		private String car;
		private int qty;
		private String remark;
		public Car() {}
		public Car(int month, int con, String car, int qty, String remark) {
			super();
			this.month = month;
			this.con = con;
			this.car = car;
			this.qty = qty;
			this.remark = remark;
		}
		public int getMonth() {
			return month;
		}
		public int getCon() {
			return con;
		}
		public String getCar() {
			return car;
		}
		public int getQty() {
			return qty;
		}
		public String getRemark() {
			return remark;
		}
		@Override
		public String toString() {
			return "[month=" + month + ", con=" + con + ", car=" + car +
					", qty=" + qty + ", remark=" + remark + "]";
		
	}
}
