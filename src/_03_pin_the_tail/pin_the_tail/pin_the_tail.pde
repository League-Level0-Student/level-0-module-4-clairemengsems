 PImage donkey;
PImage tail;

int x =mouseX;
 int y = mouseY;
 boolean clicked = false;
 
void setup() {

 donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(800, 500);     //replace width, height with your picture's dimensions
donkey.resize(width,height);
tail.resize (80,100);
}

void draw() {
 background (donkey);
 
if ( dist(0,0,mouseX,mouseY) < 30){
background (donkey);  

 }else{
background(255,255,255);
 }
  rect(0,0,30,30);


if (mousePressed){
  clicked = true;
  x = mouseX;
  y = mouseY;
}

if (clicked == true){
   if (x > 710 && x < 730 && y > 168 && y < 190){
   background(donkey);
   println("you did it!");
 
 }
 image(tail,x,y);

}
 else{
   image(tail, mouseX, mouseY);
 }

 
 
}
