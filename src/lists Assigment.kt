fun main() {
    println(evenIndices(listOf("Maldives","Miami","Bali","Durban","Zanzibar","Seychelles","Dubai","Malawi","Rwanda","Congo")))
    println(Total(listOf(12,23,53,17,13,29,40,65)))
    var people=(mutableListOf(
        Human("Jackia",40,5.7,55.70),
        Human("Winky",23,5.4,54.60),
        Human("Mickey",17,5.6,48.90),
        Human("Mel",3,3.0,17.80)
    ))
    personObject(people)
    personObjects2(people)
    var car=(listOf(
        Vehicles("KDC 001B",5000),
        Vehicles("KBC 017M",7600),
        Vehicles("KCA 009W",4000),
        Vehicles("KDC 004J",2600)
    ))
    println(averageMileage(car))

}
fun evenIndices(places:List<String>):List<String> {
    var characters = mutableListOf<String>()
//   places.forEachIndexed { index, element ->
//      if (index % 2 == 0) {
//         characters += element
//      }
//   }
//   return characters

    for (place in places)
        if (places.indexOf(place)%2==0){
            characters.add(place)
        }
    return characters

}
fun Total(height:List<Int>):Pair<Int,Double>{
    var total=height.sum()
    var average=height.average()
    return Pair(total,average)
}

data class  Human(var name:String,var age:Int,var height:Double,var weight:Double)
fun personObject(people:List<Human>){
    var sortedAge=people.sortedByDescending { person->person.age }
    println(sortedAge)
}
fun personObjects2(person:List<Human>) {
    var people=(mutableListOf(
        Human("Jackia",40,5.7,55.70),
        Human("Winky",23,5.4,54.60),
        Human("Mickey",17,5.6,48.90),
        Human("Mel",3,3.0,17.80)
    ))
    people.addAll(listOf(
        Human("Mitch",25,5.7,75.70),
        Human("Lavign",47,5.9,65.70),
    ))
    println(people)
}
data class Vehicles(var registration:String,var mileage:Int)
fun averageMileage(car:List<Vehicles>):Double{
    var totalMileage=0.0
    car.forEach{car->
        totalMileage+=car.mileage
    }
    var totalAverage=totalMileage/car.size
    return totalAverage

}
