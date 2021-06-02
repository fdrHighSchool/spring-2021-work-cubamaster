int rectX1, rectY1;
int rectX2, rectY2;
int rectX3, rectY3;
int rectSize = 90;
color rectColor, circleColor, baseColor;
color currentColor;
color rectHighlight;
boolean rectOver1 = false;
boolean rectOver2 = false;
boolean rectOver3 = false;
String[] arr = {"rock", "paper", "scissors"};
boolean inGame = true;
void setup() {
  size(640, 360);
  rectColor = color(0);
  rectHighlight = color(255);
  baseColor = color(102);
  currentColor = baseColor;
  rectX1 = width/2-rectSize-110;
  rectY1 = height/2-rectSize/2;
  rectX2 = width/2-rectSize+30;
  rectY2 = height/2-rectSize/2;
  rectX3 = width/2-rectSize+170;
  rectY3 = height/2-rectSize/2;
}

void draw() {
  update(mouseX, mouseY);
  background(currentColor);
  textSize(30);
  fill(255);
  text("ROCK",rectX1, rectY1-50, 255);
  text("PAPER",rectX2, rectY2-50, 255);
  text("SCISSORS",rectX3, rectY3-50, 255);
  if(inGame) {
  if(rectOver1) {
    fill(rectHighlight);
  }
  else{
    fill(rectColor);
  }
  stroke(255);
  rect(rectX1, rectY1, rectSize, rectSize);
  if(rectOver2) {
    fill(rectHighlight);
  }
  else{
    fill(rectColor);
  }
  stroke(255);
  rect(rectX2, rectY2, rectSize, rectSize);
  if(rectOver3) {
    fill(rectHighlight);
  }
  else{
    fill(rectColor);
  }
  stroke(255);
  rect(rectX3, rectY3, rectSize, rectSize);
  }
  else{
    fill(0);
    background(255);
    textSize(30);
    text("Game over, you loose",width/3.5, height/2.5);
    text("Press 'enter' to play again",width/5, height/2.5 + 50);
    if(keyPressed && key == ' ') { 
      inGame = true;
    }
  }
}

void update(int x, int y) {
  if(OverRect(rectX1, rectY1, rectSize, rectSize)) {
    rectOver1 = true;
  }
  else if(OverRect(rectX2, rectY2, rectSize, rectSize)) {
    rectOver2 = true;
  }
  else if(OverRect(rectX3, rectY3, rectSize, rectSize)) {
    rectOver3 = true;
  }
  else {
    rectOver1 = rectOver2 = rectOver3 = false;
  }
}

void mousePressed() {
  int random = (int)Math.random() * arr.length;
  if(rectOver1) {
    println("rectangle 1 pressed ");
    String comp = arr[random];
    if(!comp.equals("scissors")) {
      inGame = false;
    }
  }
  if(rectOver2) {
    println("rectangle 2 pressed ");
    String comp = arr[random];
    if(!comp.equals("rock")) {
      inGame = false;
    }
  }
  if(rectOver3) {
    println("rectangle 3 pressed ");
    String comp = arr[random];
    if(!comp.equals("paper")) {
      inGame = false;
    }
  }
  
}

boolean OverRect(int x, int y, int width, int height) {
  if(mouseX >= x && mouseX <= x+width && mouseY >= y && mouseY <= y+height) {
    return true;
  }
  else {
  return false;
  }
}
