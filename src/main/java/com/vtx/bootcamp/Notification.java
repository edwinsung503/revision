package com.vtx.bootcamp;

public class Notification implements SMS, Email{

  private String target ;

  public Notification(){ // empty constructor
    this.target = "default"; // 俾一個default target 個客
  }

  public Notification(String target){
    this.target = target; //個target 由客人選
  }
  
  @Override
  public void sms(){
    System.out.println("Sending sms.... ");
  }

  @Override
  public void email(){
    System.out.println("Sending email.... ");
  }

  public static void main(String[] args) {
    
    
    Notification notification = new Notification();
    notification.sms();
    notification.email();

    //Polymorphism -> 用唔同的型態去顯示 (用email 型態, 只可以用依個Email 內的method 去做)
    Email emailSender = new Notification();
    emailSender.email();
    //emailSender.sms(); Email interface restricted

    //emailSender = new Dog();
    //SMS smsSender = emailSender;
    //cannot convert from Email to SMSJava
    SMS smsSender = (SMS) emailSender; //risk if some one amend on above (emailSender = new Dog();)
    smsSender.sms();
    //smsSender.email();
  }
}
