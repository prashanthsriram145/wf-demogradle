print 'hello'
String message = 'hello world'
String processor = "intel"
String multiline = ''' this text is on line one
it is on second line
it is on third line '''

println message
println processor
println multiline

String name = 'Luke'
message = "Hello ${name}"
println message

count = "${name.length()}"
println count
println "name.toLowercase()"

2.times {
    println "twice"
}
println 7.next()

listWithDifferentItems = [1,2.5,'hello']
println listWithDifferentItems.get(2)

listWithDifferentItems.add('again')
listWithDifferentItems.each{println it}

map = ["red" : 1, "white":2, "blue":3]
println map.red
println map["white"]
println map.get("blue")

map.put "green", 4
map.each {println "key : ${it.key} value : ${it.value}"}

def intRange = 0..9
println intRange.size()
intRange.each {println it}

def greet = {my_name -> println "Hello ${my_name}"}
greet("Prashanth")

def greet1 = {println "Hello ${it}"}
greet1("Sriram")

def myRange = 0..10
println(myRange.size())
myRange.each {println(it)}