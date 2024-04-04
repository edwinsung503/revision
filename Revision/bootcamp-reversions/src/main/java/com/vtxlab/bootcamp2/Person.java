

public class Person {
  
  private double weight;


  public Person(double weight){
    this.weight = weight;
    //this object weigth is 65.0 at runtime
  }

  //this object weigth is 65.0
  public static void main(String[] args) {
    Person person = new Person(65.0);
  }
}
