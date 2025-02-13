package anonymousTest;

public class Starbucks extends Store {
	public void register(Form form) {
		String[] menu = form.getMenus();
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
	}
//		판매 중인 곳인지, 무료나눔하는 곳 인지 판별
		
		public void checkStore(Store[] arStore) {
			for(int i =0; i < arStore.length; i++) {
				if(arStore[i] instanceof SellingStore) {
					System.out.println("판매");
				}else(arStore[i] instanceof FreeEventStore) {
					System.out.println("무료나눔");
				}
			}
		}
		public static void main(String[] args) {
			new Starbucks().checkStore(new Starbucks[] {
				new Gangnam(),
				new Jamsil()
			});
		}
		form.sell("아메리카노");
		form.freeService("");
			
}
