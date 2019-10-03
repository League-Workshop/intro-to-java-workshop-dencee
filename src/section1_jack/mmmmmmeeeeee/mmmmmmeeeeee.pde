void setup(){
  size(859,859);
}

void draw(){
  if(mousePressed){
fill(random(242),random(242),random(242));
ellipse(mouseX,mouseY,75,75);
  }
}
