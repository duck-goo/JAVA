package anonymousTest;

//가입 양식
//메뉴 받기, 판매
public interface Form {
	public String[] getMenus();
	public void sell(String menu);
	public void freeService(String freeMenu);
}
