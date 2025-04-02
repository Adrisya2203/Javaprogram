class Animal
{
String name;
void makesound(){
System.out.println("some genetic sound");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println(name+"says:woof!wooof");
}
}
public class Inheritance 
{
public static void main(String args[])
{
Dog myDog=new Dog();
myDog.name="buddy";
myDog.makesound();
myDog.bark();
}
}
