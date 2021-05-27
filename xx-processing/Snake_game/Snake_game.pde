int w = 30;
int h = 30;
int bs = 20;
int dir = 2;
int score = 3;
int[] dx = {0, 0, 1, -1};
int[] dy = {1, -1, 0, 0};
int applex = (int) random(0, h/2);
int appley = (int) random(0, w/2);
boolean inGame = true;
ArrayList<Integer> x = new ArrayList<Integer>();
ArrayList<Integer> y = new ArrayList<Integer>();
void setup() {
  size(600, 600);
  x.add(9);
  x.add(8);
  x.add(7);
  y.add(10);
  y.add(10);
  y.add(10);
}

void draw() {
  background(255);
  for(int i = 0; i < w; i++) {
    line(i * bs, 0, i*bs, height);
  }
  for(int i = 0; i < h; i++) {
    line(0, i * bs, width, i * bs);
  }
  for(int i = 0; i < x.size(); i++) {
    fill(10, 198, 10);
    rect(x.get(i) * bs, y.get(i) * bs, bs, bs);
  }
  if(inGame) {
  fill(242, 13, 13);
  rect(applex * bs, appley * bs, bs, bs);
  if(frameCount % 5 == 0) {
    x.add(0, x.get(0) + dx[dir]);
    y.add(0, y.get(0) + dy[dir]);
    if(x.get(0) < 0 || y.get(0) < 0 || x.get(0) >= h || y.get(0) >= w) {
      inGame = false;
    }
    for(int i = 1; i < x.size(); i++) {
      if(x.get(0) == x.get(i) && y.get(0) == y.get(i)) 
      inGame = false;
    }
    if(x.get(0) == applex && y.get(0) == appley) {
      applex = (int)random(0, w);
      appley = (int)random(0, h);
      score++;
    }
     else{
      x.remove(x.size()-1);
      y.remove(y.size()-1);
    }
  }
  }
  else {
    fill(0);
    background(255);
    textSize(30);
    text("Game over",width/3.5, height/2.5);
    text("Press 'enter' to play again",width/5, height/2.5 + 50);
    text("Your score is " + score ,width/3.5, height/2.5 + 100);
    if(keyPressed && key == ' ') {
      x.clear();
      y.clear();
      x.add(9);
      x.add(8);
      x.add(7);
      y.add(10);
      y.add(10);
      y.add(10);
      inGame = true;
    }
    
  }
}

void keyPressed() {
  int newdir = -1;
  if(key == 's') {
    if(dir != 1)
    newdir = 0;
  }
  else if(key == 'w') {
    if(dir != 0)
    newdir = 1;
  }
  else if(key == 'd') {
    if(dir != 3)
    newdir = 2;
  }
   else if(key == 'a')  {
     if(dir != 2)
     newdir = 3;
   }
  if(newdir != -1) {
    dir = newdir;
  }
}
