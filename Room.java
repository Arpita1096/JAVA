class Room
{
	int room_no;
    float roomarea;
	String ACmachine;
	String roomtype;
	Room(int room_no,float roomarea,String ACmachine,String roomtype){
		this.room_no=room_no;
		this.roomarea=roomarea;
		this.ACmachine=ACmachine;
		this.roomtype=roomtype;
	}
	void setData()
	{
		room_no=room_no;
		roomarea=roomarea;
		ACmachine=ACmachine;
		roomtype=roomtype;
	}
	void displayData() {
		System.out.println("The room no is:"+room_no);
		System.out.println("The room area is:"+roomarea);
		System.out.println("The Ac machine is:"+ACmachine);
		System.out.println("The room type is:"+roomtype);
	}
}

public class Assignment {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter room type:");
		String roomtype=s.nextLine();
		//Scanner sc = new Scanner(System.in);	
		System.out.println("Enter room no:");
		int room_no=s.nextInt();	
		System.out.println("Enter Ac machine:");
		String ACmachine=s.next();	
		System.out.println("Enter room area:");
		float roomarea=s.nextFloat();
		
		Room r = new Room(room_no,roomarea,ACmachine,roomtype);
		r.setData();
		r.displayData();
		}
}
