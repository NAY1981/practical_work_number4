
fun main(args: Array<String>) {

    val list = mutableListOf<Any>()
   var goat = Herbivore ( 50, 4,"a ruminant mammal",  "plants")
    var crocodile = Carnivorous ( 700,  4,  "predatory reptil", "vertical")
    list.add (goat)
    list.add (crocodile)
    print (list)
}
open class Animal (var weight: Int, var limbs: Int, var type: String){

    override fun toString(): String {
        return "weight=$weight, limbs=$limbs, type=$type"
    }
}
class Herbivore(weight: Int, limbs: Int, type: String, var meal: String): Animal (weight, limbs, type){
    override fun toString(): String {
        return "goat(meal='$meal' ${super.toString()})"
    }
}
class Carnivorous (weight: Int, limbs: Int, type: String, var pupils: String): Animal (weight, limbs, type){
    override fun toString(): String {
        return "crocodile(pupils='$pupils' ${super.toString()})"
    }
}