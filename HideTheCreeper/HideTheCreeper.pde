import ddf.minim.*;
AudioSample woohooSound;
import ddf.minim.*;
AudioSample dohSound;
int textY = 10;
PImage creeper;
void setup(){
PImage minecraft = loadImage("minecraft.png");
size(600, 500);
minecraft.resize(600, 500);
background(minecraft);
creeper=loadImage("creeper.png");
creeper.resize(5, 5);
Minim minim = new Minim(this);
woohooSound = minim.loadSample("homer-woohoo.wav");
dohSound = minim.loadSample("homer-doh.wav");
}
void draw(){
image(creeper, 1, 237);
if(mousePressed && dist(1, 237, mouseX, mouseY) < 30){
fill(255, 0, 0);
noStroke();
ellipse(mouseX, mouseY, 10, 10);
fill(250, 250, 0);
text("You found the creeper!", 250, textY);
woohooSound.trigger();
textY = textY + 10;
}else if(mousePressed && dist(1, 237, mouseX, mouseY) > 30){
fill(255, 255, 255);
noStroke();
ellipse(mouseX, mouseY, 10, 10);
dohSound.trigger();
}
}