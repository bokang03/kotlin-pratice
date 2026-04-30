package com.back.ch37

class Person {
    private var _name: String = "Unknown" // 내부 변수

    var name: String // 가상 필드
        get() = throw IllegalAccessException("읽을 수 없습니다.") // Getter 호출 시 예외 발생
        set(value) {

            if (value != "") { // 빈 문자열이 아닌 경우에만 값 설정
                _name = value
            } else {
                throw IllegalArgumentException("이름은 빈 문자열일 수 없습니다.")
            }
            _name = value

        } // Setter 제공 (쓰기 가능)

//    var name: String
//        get() = throw IllegalAccessException("읽을 수 없습니다.") // Getter 호출 시 예외 발생
//        set(value) { _name = value } // Setter 제공 (쓰기 가능)
}

fun main() {
    val p1 = Person()
    p1.name = ""
}