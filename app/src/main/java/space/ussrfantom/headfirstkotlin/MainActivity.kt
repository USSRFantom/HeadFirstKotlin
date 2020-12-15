package space.ussrfantom.headfirstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            lessonTwo()
        lessonThree()
        lessonThreeFour(5, 4)

        var myArray = arrayOf("one", "two", "three")
        var b = lessonThreeFive(myArray)
        println(b)



    }

    private fun helloWorld (){
        println("HelloWorld")
    }

    private fun lessonOne(){
        //команды
        var x = 3
        var y = 2
        val name = "Cormoran"
        x = x * 10
        println("x is $x.")

        //циклы
        while (x > 20){
            x = x - 1
            println("x is $x.")
        }

        for (i in 1..10){
            x = x + 1
            println("x is $x.")
        }

        //Если
        if (x == 20){
            println("x must be 20.")
        }else{
            println("x isn't 20.")
        }

        if(name.equals("Cormoran")){
            println("$name Strike")
        }

        println(if (x > y) "пробуем упрощенный вид" else "не пробуем упрощенный вид")

        //развлечение с магнитом

        var i = 1
        while (i < 3){
            println(if(i == 1) "Yab" else "Dab")
            print("ba")
            i = i + 1

        }
        if (i == 3) print("Do")

    }

    fun lessonTwo(){
        //массив
        var myArray = arrayOf (1,2,3)
        print(myArray[0]);
        myArray.size

        var a = 0
        var myArray2 = arrayOf("Frodo", "Sam", "Marry", "Pippin")
        while (a < 4){
            println(myArray2[a] +  " "  + "good name hobbit")
            a++
        }

    }


    fun lessonThree(){
        lessonTreeOne(5, 7)
        var a = lessonThreeTwo(5, 4)
        println(a)
        Log.i("1231231231231", a.toString())
        lessonThreeThree(5, 4)
    }
    //вызов метода с 2 параметрами
    fun lessonTreeOne(a: Int, b: Int){
        val result = a + b
    }

    fun lessonThreeTwo(a1: Int, a2: Int): Int {

        return if (a1 < a2) a1 else a2
    }

    fun lessonThreeThree(a1: Int, a2: Int): Unit{
       var b =  if (a1 < a2) a1 else a2
        println(b)
    }

    fun lessonThreeFour(a1: Int, a2: Int): Int = if(a1 < a2) a1 else a2


    fun lessonThreeFive(meArray: Array<String>): String {
        meArray[(Math.random() * meArray.size).toInt()]
        return  meArray[(Math.random() * meArray.size).toInt()]
    }
}