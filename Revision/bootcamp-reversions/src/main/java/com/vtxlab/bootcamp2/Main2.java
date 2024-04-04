package com.vtxlab.bootcamp2;

public class Main2 {
  
  public final int x =3;

  public static int y =3; //belong to class

  public static final int z =10;

  public static void main(String[] args) {
    
    Main2 main2 = new Main2();
    //x belong to main2 object
    //main2.x = 2;

    Main2.y = 2; // y belong to class Main2
    //no final, so the value can be updated

    //Main2.z = 11 ; // y belong Class Main2, but final. Value cannot be updated

  }

}
