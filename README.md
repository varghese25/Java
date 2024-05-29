                                                     BUS RESERVATION SYSTEM FLOW

**1. Class and Main Method**
The BusReservationSystem class is defined with a main method. The main method is the entry point of the program.

**2. Initial Setup**
A boolean array seats of size 10 is created to represent the bus seats. false means a seat is available, and true means it's reserved.
A Scanner object named scanner is created to read user input.

**3. Main Loop
**The program runs in an infinite loop using a while (true) construct, presenting the user with a menu of options:

Reserve a Seat
Cancel Reservation
View Available Seats
Exit

**4. User Choice Handling**
The program reads the user's choice using scanner.nextInt() and processes it using a switch statement.

**4.1 Reserve Seat**
If the user chooses to reserve a seat (choice 1), the reserveSeat method is called.
reserveSeat Method:
Prompts the user to enter a seat number between 1 and 10.
Validates the seat number to ensure it's within the valid range.
Checks if the seat is already reserved:
If yes, it displays "Seat Already Reserved".
If no, it reserves the seat (sets the corresponding array element to true) and displays "Seat Reserved Successfully".

**4.2 Cancel Reservation**
If the user chooses to cancel a reservation (choice 2), the cancelReservation method is called.
cancelReservation Method:
Prompts the user to enter a seat number between 1 and 10.
Validates the seat number to ensure it's within the valid range.
Checks if the seat is already reserved:
If no, it displays "Seat Not Reserved".
If yes, it cancels the reservation (sets the corresponding array element to false) and displays "Reservation Cancelled Successfully".

**4.3 View Available Seats**
If the user chooses to view available seats (choice 3), the viewAvailableSeats method is called.
viewAvailableSeats Method:
Displays a list of seat numbers that are currently available by iterating through the seats array and checking which seats are not reserved (false).

**4.4 Exit**
If the user chooses to exit (choice 4), the program exits using System.exit(0).
4.5 Invalid Choice
If the user enters an invalid choice, it displays "Invalid Choice" and returns to the menu.

**Overall Flow Summary**

Start Program -> Display Menu -> User Input (1, 2, 3, 4)
Choice 1 (Reserve Seat) -> Prompt for Seat Number -> Validate -> Reserve if Available
Choice 2 (Cancel Reservation) -> Prompt for Seat Number -> Validate -> Cancel if Reserved
Choice 3 (View Available Seats) -> Display Available Seats
Choice 4 (Exit) -> Terminate Program
Invalid Choice -> Display "Invalid Choice" -> Return to Menu
The program continuously loops, allowing the user to perform multiple operations until they choose to exit.



                                          FlowChart 
+------------------------+
|         Start          |
+-----------+------------+
            |
            v
+-----------+------------+
|    Display Menu        |
| 1. Reserve Seat        |
| 2. Cancel Reservation  |
| 3. View Available      |
|    Seats               |
| 4. Exit                |
+-----------+------------+
            |
            v
+-----------+------------+
|   Read User Choice     |
+-----------+------------+
            |
            v
+-----------+------------+
| Is Choice 1, 2, 3, or 4?|
+----+-------+-------+----+
     |       |       |     
    1|      2|      3|     4
     |       |       |     
     v       v       v     
+----+--+ +----+--+ +----+---+
|Reserve| |Cancel | |  Exit   |
| Seat  | |Reservation|       |
+----+--+ +----+--+ +----+---+
     |       |       |
     v       v       |
+----+--+ +----+--+  |
|Enter Seat| |Enter Seat|    |
|Number    | |Number    |    |
|(1-10)    | |(1-10)    |    |
+----+--+ +----+--+    |
     |       |         |
     v       v         |
+----+--+ +----+--+    |
|Validate| |Validate|   |
|Seat    | |Seat    |   |
|Number  | |Number  |   |
+----+--+ +----+--+    |
     |       |         |
     |       |         |
+----v--+ +--v-----+   |
|Invalid | |Invalid |  |
|Seat    | |Seat    |  |
|Number  | |Number  |  |
|(Error) | |(Error) |  |
+----+--+ +----+--+    |
     |       |         |
     v       v         |
+----+--+ +----+--+    |
|Already | |Seat   |   |
|Reserved| |Not    |   |
|(Error) | |Reserved|  |
+----+--+ +----+--+    |
     |       |         |
     v       v         |
+----+--+ +----+--+    |
|Reserve | |Cancel |   |
|Seat    | |Reservation|
|Success | |Success |  |
+----+--+ +----+--+    |
     |       |         |
     v       v         |
+----+--+ +----+--+    |
|Return  | |Return |   |
|to Menu | |to Menu|   |
+--------+ +--------+  |
            |          |
            |          v
            |   +------+------+
            |   |View Available|
            |   |Seats        |
            |   +------+------+
            |          |
            v          v
     +------+-----+  +---------+
     |Display      |  |Exit     |
     |Available    |  |Program  |
     |Seats        |  +---------+
     +-------------+


























