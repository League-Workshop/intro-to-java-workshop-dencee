PImage rainbow;
PImage unicorn;
void setup() {
  rainbow=loadImage("UU.jpg");
  size(800, 600);
  rainbow.resize(width, height);
  background(rainbow);
  unicorn=loadImage("UNIII.png");
  unicorn.resize(200,150);
}
void draw() {
  background(rainbow);
image(unicorn, mouseX,mouseY);
}
