import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;
int donkeyX = 0;
int donkeyY = 0;
PImage donkey;
PImage tail;
void setup(){
size(500, 500);
donkey = loadImage("donkey.jpeg");
tail = loadImage("DonkeyTail.png");
donkey.resize(500, 500);
tail.resize(0, 100);
Minim minim = new Minim(this);
woohooSound = minim.loadSample("victory.wav");
}

void draw(){
background(10);
rect(0, 0, 30, 30);
rect(425, 100, 40, 40);
if(mousePressed){
background(donkey);
image(tail, donkeyX, donkeyY);
if(dist(425, 100, donkeyX, donkeyY) < 40){
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
}else{
donkeyX=mouseX;
donkeyY = mouseY;
image(tail, mouseX, mouseY);
}
}