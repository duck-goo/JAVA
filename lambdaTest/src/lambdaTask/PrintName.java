package lambdaTask;
// 성과 이름 전달하면 전체 이름 만들어주는 메서드
@FunctionalInterface
public interface PrintName {
	public String makeFullName(String firstName, String lastName);
}
