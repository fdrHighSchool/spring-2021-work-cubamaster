void setup(){
  size(640, 360);
  noSmooth();
  fill(126);
  background(102);
}
void draw() {
  if (mousePressed) {
    stroke(200);
    ellipse(mouseX-66, mouseY, mouseX+66, mouseY);
  } else {
    stroke(0);
  }
  
}

//void draw(){
// background(192, 64, 0);
//  ellipse(mouseX, mouseY, 20, 20);
//  if (mousePressed) {
//    stroke(255);
//  } else {
//    stroke(0);
//  }
  //ellipse(mouseX-66, mouseY, mouseX+66, mouseY);
//} 
