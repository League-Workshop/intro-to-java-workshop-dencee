void setup () {
  size(1000, 1000);
}
void draw() { 
  ellipse(mouseX, mouseY, 100,1900,);
  if (mousePressed) {
    if (mouseButton==RIGHT) {
      background(#FFFFFF);
    }
    fill(random(256), random(256), random(256));
  }
}
