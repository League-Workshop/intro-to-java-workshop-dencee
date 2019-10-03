 void setup(){
  size(2000,2000);
}

void draw(){
  if(mousePressed){
    if(mouseButton==RIGHT){
      background(#FFFFFF);
    }
  fill(random(256),random(256),random(256));
  rect(mouseX,mouseY,500,500);
  ellipse(mouseX,mouseY,400,400);
  }
}
