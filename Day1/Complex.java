import java.io.*;
class Complex{
int real;
int img;
int getReal(){
return this.real;
}
void setReal(int _real){
this.real=_real;
}
int getImg(){
return this.img;
}
void setImg(int _img){
this.img=_img;
}

Complex add(Complex x){
Complex temp=new Complex();
temp.setReal(this.getReal()+x.getReal());
temp.setImg(this.getImg()+x.getImg());
return temp;
}
Complex sub(Complex x){
Complex temp=new Complex();
temp.setReal(this.getReal()-x.getReal());
temp.setImg(this.getImg()-x.getImg());
return temp;
}
void print(){
System.out.println("real= "+this.getReal()+" img= "+this.getImg()+" i");
}
}
class Main{
public static void main(String[] args){
Complex c = new Complex();
c.setReal(10);
c.setImg(11);
c.print();
}
}
