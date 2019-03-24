PImage donkey;
PImage tail;
void setup(){
size(500, 500);
donkey = loadImage("donkey.jpeg");
tail = loadImage("tail.jpg");
donkey.resize(500, 500);
}

void draw(){
background(donkey);
}