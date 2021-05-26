void setup(){
  surface.setTitle("Strange ellipses");
  surface.setResizable(true);
  surface.setLocation(300, 200);
  size(640, 360);
  noSmooth();
  fill(126);
  background(200, 150, 150);
}
void draw() {
  if (mousePressed) {
    stroke(200);
    fill(220,20,60);
  } 
  else {
    stroke(0);
    fill(30,144,255);
  }
  ellipse(mouseX-66, mouseY, mouseX+66, mouseY);
  
  if(keyPressed) {
    clear();
    background(200, 150, 150);
  }
}
