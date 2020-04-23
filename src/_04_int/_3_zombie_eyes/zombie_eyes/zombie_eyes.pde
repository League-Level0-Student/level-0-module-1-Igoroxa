
void setup() {
  size(750, 750);
PImage face = loadImage("face.jpg");

face.resize(width, height);
image(face, 0, 0);
}
void draw() {
  fill(mouseX, mouseY, 50);
ellipse(300, 300, 100, 50);
ellipse(465, 300, 100, 50);










}
