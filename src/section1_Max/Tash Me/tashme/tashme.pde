PImage mustache;
PImage friend;
int X;
int Y;
void setup() {
  friend=loadImage("ronald.jpeg");
  size(800, 600);
  friend.resize(width, height);
  mustache=loadImage("mustache4.png");
}
void draw() {
  background(friend);
  image(mustache,X,Y);
  if (mousePressed) {
    X=mouseX;
    Y=mouseY;  
  }
}
