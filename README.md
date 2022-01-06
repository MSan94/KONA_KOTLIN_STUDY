# 변수 & 자료형
- val : 최초로 지정한 변수의 값으로 초기화 하고 더 이상 바꿀 수 없는 읽기 전용 변수
- var : 최초로 지정한 변수의 초깃값이 있어도 값을 바꿀 수 있는 변수

# 자료형
- 코틀린 자료형은 ``참조형`` 자료형을 사용
- 참조형 : 객체를 생성하고 동적 메모리 영역에 데이터를 둔 다음 참조하는 자료형
- 코틀린은 기본타입을 사용하지 않고 참조형 타입만 사용
- 힙 영역에 저장
- 코틀린은 컴파일러가 자동으로 최적화를 수행하기때문에 컴파일 과정을 거치면서 참조형이 기본형으로 바뀐다.
```
--- 부호가 있는 자료형 ---
Long : 8Byte : -2^63 ~ 2^63-1
Int : 4Byte : -2^31 ~ 2^31-1
Short : 2Byte : -2^15 ~ 2^15-1
Byte : 1Byte : -2^7 ~ 2^7-1

--- 부호가 없는 자료형 ---
ULong : 8Byte : 0 ~ 2^64-1
UInt : 4Byte : 0 ~ 2^32-1
UShort : 2Byte : 0 ~ 2^16-1
UByte : 1Byte : 0 ~ 2^8-1

--- 실수 자료형 ---
Double : 8Byte
Float : 4Byte

--- 기타 ---
Boolean , Char , String
```

# nullCheck
- 코틀린은 ?키워드로 null을 허용 가능
- ${str1?.length ?: -1}  // null이면 -1 출력

# 형변환
```
toByte, toFloat, toLong, toDouble, toShort, toShort, toChar, toInt
```

# 비교연산
- == : 단순 값만 비교
- === : 참조 주소 비교 ex) equals
```
    val a : Int = 128
    val b : Int = 128

    val a1 : Int = 129
    val b1 : Int? = 129
    println(a == b) //true
    println(a === b) //true
    println(a1 == b1) //true
    println(a1 === b1) //false // Int는 기본형으로 stack에 저장되지만, int?는 참조형으로 힙에 저장
```
```
fun main(){
    val a : Int = 128
    val b = a
    println(a === b) // 자료형아 기본형인 int가 되어 true

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c == d) // 값만 비교하므로 true
    println(c === d) // 값의 내용은 같지만 참조 주소를 비교해 다른 객체이므로 false
    println(c === e) // c,e는 값도 값고 참조된 객체도 같아서 true , c -> a , e -> c
}
```
