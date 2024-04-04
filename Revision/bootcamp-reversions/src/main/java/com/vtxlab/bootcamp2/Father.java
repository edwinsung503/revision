

public class Father extends Person{ //can inheritance / attribute / method 
                                    // cannot constructor (such as need use Super())
  
  private int age ;

  private String name;

  public Father(int age, String name,double weight){
    super(weight);// calling parenet's consturctor
    this.age = age;
    this.name = name;
    //Person 係寄生係Father 依個object 入面
  }

  //implement 1種能力-> driving or cooking
  //extends -> after java 8 ->father 抽象 -> human/person

  public static void main(String[] args) {
    Father father = new Father(20, "John",70);
    String y = 'a'; // local varaible y within main{}
    //
    for (int i =0 ; i< 10 ;i++){
      String x = "abc"; // 可以係因為java 當i =0/ i =1 係一生一死
      x = x.concat("def");
      System.out.println(x);
    }
  }
}
