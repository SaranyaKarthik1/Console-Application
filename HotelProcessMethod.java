package Assignments;

import java.util.Arrays;
import java.util.Scanner;

//import Assignments.HotelRoomBooking.Room;

public class HotelProcessMethod {
	
	  void initialise(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            myHotel[x].setName("Not-Available");
        }
    }

    void CheckIfEmpty(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            if (myHotel[x].getName().equals("Not-Available")) {
                System.out.println("Room " + (x + 1) + " is empty");
            }
        }
    }

     void BookaRoom(Room[] myHotel, int roomNum) {
        String roomName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number (1-10):");
        roomNum = input.nextInt() - 1;
        System.out.println("Enter name for room " + (roomNum + 1) + " :");
        roomName = input.next();
        myHotel[roomNum].setName(roomName);
        System.out.println("Room Booked!");
    }

      void ViewAllRooms(Room[] myHotel) {
        for (int x = 0; x < myHotel.length; x++) {
            System.out.println("room " + (x + 1) + " occupied by " + myHotel[x].getName());
        }
    }

    void DeleteCustomerFromRoom(Room[] myHotel, int roomNum) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room number to delete(1-10):");
        roomNum = input.nextInt() - 1;
        myHotel[roomNum].setName("nobody");
        System.out.println("Entry Deleted :)");
    }

    void FindRoomFromCustomerName(Room[] myHotel) {
        Scanner input = new Scanner(System.in);
        String roomName;
        System.out.println("Enter name to Search for:");
        roomName = input.next();
        int x;
        boolean Checker = false;
        for (x = 0; x < myHotel.length; x++) {
            if (roomName.equals(myHotel[x].getName())) {
                System.out.println("The name that Matches with room number : " + x);
                Checker = true;
            }
        }
        if (Checker == false) {
            System.out.println("There are no Rooms Booked with that name\n(make sure you've used the correct CAP's)");
        }
    }

   /* private static void StoreProgramDataInToFile(Room[] myHotel) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter("/home/unix/student12/w1387769/outputfile.txt"))) {
            int x;
            for (x = 0; x < myHotel.length; x++) {
                out.println("Name and Room number is: " + myHotel[x].getName() + "at: " + x);
            }

        }
        System.out.println("All Room Names have been Saved.");
    }
*/
   

     void ViewRoomsAlphabeticallyByName(Room[] myHotel) {
        String[] myStrArray = new String[myHotel.length];
        for (int i = 0; i < myHotel.length; i++) {
            myStrArray[i] = myHotel[1].getName();
        }

        Arrays.sort(myStrArray);
        for (int a = 0; a < myStrArray.length; a++) {
            System.out.println(myStrArray[a]);
        }

    }

    public  class Room {

        //protected String mainName;
        private String mainName;
        int guestsInRoom;

        public Room() {
            mainName = "k";

        }

        public void setName(String aName) {
            //  System.out.println("add name class method ");
            mainName = aName;
        }

        public String getName() {
            return mainName;
        }
    }

//	public void initialise(Object myHotel) {
//		// TODO Auto-generated method stub
//		
//	}

}
