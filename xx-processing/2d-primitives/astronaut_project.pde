PShape square;
PShape square2;
PShape circle;
void setup() {
  size(500, 500);
  // Creating the PShape as a square. The
  // numeric arguments are similar to rect().
  square = createShape(RECT, 0, 0, 50, 50);
  square.setFill(color(220, 120, 0));
  square.setStroke(false);
  circle = createShape(ELLIPSE,25, -25, 56, 46);
  circle.setFill(color(0, 0, 0));
  circle.setStroke(false);
  square2 = createShape(RECT, -25, 0, 50, 50);
  square2.setFill(color(192, 192, 192));
  square2.setStroke(false);
}


void draw() {
  shape(square, 25, 25);
  shape(circle, 25, 25);
  shape(square2, 50, 75);
}
