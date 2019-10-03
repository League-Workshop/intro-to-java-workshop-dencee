PImage rainbow;

PImage unicorn;
void setup() {
  rainbow = loadImage("hello.jpg");

  size(800, 600);

  rainbow.resize(width, height);

  unicorn = loadImage("hello my friend.png");
}

void draw() { 
  background(rainbow); 
  image(unicorn, mouseX, mouseY);
}
