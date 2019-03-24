void setup(){
size(1000, 1000);
}

void draw(){
PImage face = loadImage("snake.jpg");
face.resize(1000, 1000);
image(face, 0, 0);
fill(255, 255, 0);
stroke(1000);
ellipse(560, 700, 150, 250);
fill(0, 0, 0);
if(mouseX>510 && mouseX<610 && mouseY>625 && mouseY<775){
ellipse(mouseX, mouseY, 50, 100);
}else if(mouseX>510 && mouseX<610 && mouseY<625){
ellipse(mouseX, 625, 50, 100);
}else if(mouseX>510 && mouseX<610 && mouseY>775){
ellipse(mouseX, 775, 50, 100);
}else if(mouseX<510 && mouseY>625 && mouseY<775){
ellipse(510, mouseY, 50, 100); 
}else if(mouseX>610 && mouseY>625 && mouseY<775){
ellipse(610, mouseY, 50, 100); 
}else if(mouseX>610 && mouseY<625){
ellipse(610, 625, 50, 100);
}else if(mouseX<510 && mouseY<625){
ellipse(510, 625, 50, 100);
}else if(mouseX>610 && mouseY>775){
ellipse(610, 775, 50, 100);
}else if(mouseX<510 && mouseY>775){
ellipse(510, 775, 50, 100);
}
}