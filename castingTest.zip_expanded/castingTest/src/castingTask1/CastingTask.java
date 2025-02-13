package castingTask1;

public class CastingTask {
//	넷플릭스
//	애니메이션, 영화, 드라마 클래스, 필요시 +@ 클래스
//	사용자가 선택한 영상이 
//	각각 자식 클래스의 메서드
//	애니메이션이라면 "자막 지원" 기능 사용 (출력) 
//	영화라면 "4D" 기능 사용 (출력)
//	드라마라면 "굿즈" 기능 사용 (출력)
	
	public void checkVideo(Video video) {
//		분류
		if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.sellGoods();
		} else if(video instanceof Animation) {
			Animation animation = (Animation)video;
			animation.showSubTitle();
		} else if(video instanceof Film) {
			Film film = (Film)video;
			film.shakeChair();
		}
	}
	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		ct.checkVideo(new Drama());
		ct.checkVideo(new Film());
		ct.checkVideo(new Animation());
		
	}
	
}






