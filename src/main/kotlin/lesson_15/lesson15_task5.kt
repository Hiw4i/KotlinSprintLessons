package org.example.lesson_15

interface Drivable {
    fun drive()
}

interface PassengerTransportation {
    var currentNumberOfPassengers: Int
    val maxNumberOfPassengers: Int

    fun loadPassengers(count: Int) {
        if (currentNumberOfPassengers + count <= maxNumberOfPassengers) {
            currentNumberOfPassengers += count
            println("Loaded $count passengers. Current number of passengers: $currentNumberOfPassengers.")
        } else {
            println("Load $count passengers Failed. Max number of passengers: $maxNumberOfPassengers.")
        }
    }
    fun unloadPassengers() {
        println("Unloaded $currentNumberOfPassengers passengers.")
        currentNumberOfPassengers = 0
    }
}

interface CargoTransportation {
    var currentNumberOfCargo: Int
    val maxNumberOfCargo: Int

    fun loadCargo(count: Int) {
        if (currentNumberOfCargo + count <= maxNumberOfCargo) {
            currentNumberOfCargo += count

            println("Loaded $count tons of cargo. Current number of tons of cargo: $currentNumberOfCargo.")
        } else {
            println("Load $count tons of cargo Failed. Max number of tons of cargo: $maxNumberOfCargo.")
        }

    }
    fun unloadCargo() {
        println("Unloaded $currentNumberOfCargo tons of cargo.")
        currentNumberOfCargo = 0
    }
}

class Car(
    val name: String,
    override var currentNumberOfPassengers: Int = 0,
    override val maxNumberOfPassengers: Int = 3,
) : Drivable, PassengerTransportation {
    override fun drive() { println("Car $name is driving...") }
}

class Truck(
    val name: String,
    override var currentNumberOfPassengers: Int = 0,
    override val maxNumberOfPassengers: Int = 1,
    override var currentNumberOfCargo: Int = 0,
    override val maxNumberOfCargo: Int = 3,
) : Drivable, PassengerTransportation, CargoTransportation {
    override fun drive() { println("Track $name is driving...") }
}

fun main() {
    val car1 = Car("BMW X6")
    val car2 = Car("BMW X9")
    val truck = Truck("Volvo FH16 Aero")

    println("Loading...")
    car1.loadPassengers(3)
    car2.loadPassengers(2)
    truck.loadPassengers(1)
    truck.loadCargo(2)

    println("\nDriving...")
    car1.drive()
    car2.drive()
    truck.drive()

    println("\nUnloading...")
    car1.unloadPassengers()
    car2.unloadPassengers()
    truck.unloadPassengers()
    truck.unloadCargo()
}