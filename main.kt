open class TicketBooking(val name: String) {
    fun book() {
        println("Travels: $name")
    }
}

class PassengerName(name: String) : TicketBooking(name) {
    fun Name() {
        println("Passenger Name: $name")
    }
}

class SeatNo(name: String, val seatNo: Int) : TicketBooking(name) {
    fun SeatNo() {
        println("Seat Number: $seatNo")
    }
}

class ArrivalLocation(name: String, val location: String) : TicketBooking(name) {
    fun ArrivalLocation() {
        println("Arrival Location: $location")
    }
}

class DepartureLocation(name: String, val location: String) : TicketBooking(name) {
    fun DepartureLocation() {
        println("Departure Location: $location")
    }
}

class ArrivalTime(name: String, val time: String) : TicketBooking(name) {
    fun ArrivalTime() {
        println("Arrival Time: $time")
    }
}

class DepartureTime(name: String, val time: String) : TicketBooking(name) {
    fun DepartureTime() {
        println("Departure Time: $time")
    }
}


fun main() {
    val passengerName = PassengerName("Bob")
    val seatNo = SeatNo("Bob", 25)
    val arrivalLocation = ArrivalLocation("Bob", "Namakkal")
    val departureLocation = DepartureLocation("Bob", "Chennai")
    val arrivalTime = ArrivalTime("Bob", "10:00 AM")
    val departureTime = DepartureTime("Bob", "7:00 AM")

    passengerName.Name()
    seatNo.SeatNo()
    arrivalLocation.ArrivalLocation()
    departureLocation.DepartureLocation()
    arrivalTime.ArrivalTime()
    departureTime.DepartureTime()
    println("TICKET BOOKED")
}
