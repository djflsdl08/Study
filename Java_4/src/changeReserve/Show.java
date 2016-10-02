package Reserve;

public class Show {
	public void show(SeatLevel[] seat){
		for(int i=0;i<seat.length;i++)
			seat[i].show();
		System.out.println(" <<< 조회를 완료하였습니다. >>> \n");
	}
}