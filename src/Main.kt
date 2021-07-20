/*
추상 Class
 - 구현되지 않은 Method 를 추상 Method 라고 부르며 추상 Method 를 가지고 있는 Class 를 추상 Class 라고 부릅니다.
 - 추상 Class 는 자식 Class 에서 Method 를 Overriding 하게 하기 위함입니다.
 - 자식 Class 에서 부모 Class 를 무조건 Overriding 하게 하기 위해 만들어진 Class 입니다.
 - 설계도가 완벽하지 않은 Class 이기 때문에 직접적으로 객체 (Method, Variable) 를 생성하는 것은 불가능 합니다.
 */

fun main() {
    //val obj1 = Super1()
    //testFun1(obj1)

    val obj2 = Sub1() // obj2 는 Sub1() Class 입니다. // Sub1() Class 는 Super1 Class 를 상속 받습니다.
    testFun1(obj2) // testFun1 Method 를 실행 시킵니다. // 매개변수에는 Sub1 Class 를 넣습니다.

    val obj3 = Sub2()
    testFun1(obj3)
}

open abstract class Super1 {
    fun method1() {
        println("Super1 의 method1 입니다.")
    }
    open abstract fun method2()
}

class Sub1 : Super1() {
    override fun method2() {
        println("Sub1 의 method2 입니다.")
    }
}

class Sub2 : Super1() {
    override fun method2() {
        println("Sub2의 method2 입니다.")
    }
}

fun testFun1 (obj1:Super1) {
    obj1.method1()
    obj1.method2()
}