PImage plants;
PImage creeper; 
boolean clicked = false;
int x =mouseX;
int y = mouseY;
void setup() {
 size (800,500);
 plants = loadImage("plants.jpg"); 
    //in setup method
plants.resize(width, height);
background(plants);
creeper=loadImage("creeper.png");    
 
creeper.resize(20,20); 

}

void draw() {
  background(plants);       
  
  image(creeper,510,280);    
  
 
  
  if (mousePressed){
  clicked = true;
  x = mouseX;
  y = mouseY;
}


if(clicked == true){
   if (x > 510 && x < 530 && y > 280 && y < 300){
     println("you found it!");
   
   }else if (x > 450 && x < 600 && y > 250 && y < 500){
  noStroke();
  fill(#49F256);
  }else{
   fill(#F25249);
  }
   ellipse(x, y, 20,20);    
    
  }







}
