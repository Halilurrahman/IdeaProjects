package com.example.helloworld;


public class TextBox extends UIControl {
    private String text="";

@Override
public String toString() {
    return text;
}
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        this.text= "";
    }



}