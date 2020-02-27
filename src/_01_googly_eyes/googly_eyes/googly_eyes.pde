

int x = 0;
int y = 0;

PImage face;
void setup() {
  face = loadImage("face.png");
  size(800, 600);
  face.resize(width, height);
  background(face);
}

void draw() {
  noStroke();
  background(face); 

  x = mouseX;
  y = mouseY;

  // checking x bounds

  if (x > 326) {
    x = 326;
  } else if (x < 310) {
    x = 310;
  } 

  //checking y bounds
  if (y > 230) {
    y = 230;
  } else if (y <210) {
    y = 210;
  } 


  fill(#FFFFFF);
  // right eye
  ellipse(320, 220, 60, 60);
  fill(#5F2A2A);
  //right pupil
  ellipse(x, y, 40, 40);

  fill(#FFFFFF);

  //left eye
  ellipse(170, 220, 60, 60);
  fill(#5F2A2A);
  //left pupil
  ellipse(x - 150, y,40,40);
}
