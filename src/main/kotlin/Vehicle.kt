class Vehicle {
    var name: String = "";
    var model: String = "";
    var year: Int = 0;

    var vehicle_number: String = "";

    constructor(n: String, m: String, y: Int, vn: String){
        this.name = n
        this.model = m
        this.year = y
        this.vehicle_number = vn
    }


    fun print(){
        print(name+ " " +model + " "+year+ " "+ vehicle_number)
    }
}