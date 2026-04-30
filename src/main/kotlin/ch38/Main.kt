package com.back.ch38

class Person(
    private var _name: String
) {

    var name: String
        get() {
            if(_name.isEmpty()) {
                return "noname"
            }

            return _name
        }
        set(value) {
            if(value.isEmpty()) {
                println("이름은 공백일 수 없습니다.")
                _name = "noname"
            }
        }
}

fun main() {

    val p = Person("")

//        p.name = ""
    println(p.name)

}