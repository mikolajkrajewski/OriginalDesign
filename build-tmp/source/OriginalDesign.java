import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int red;
int green;
int blue;
public void setup()
{
  size(700,600);

}
public void draw()
{
  stadium();
  man();
}
public void stadium()
{
  background(150);
  noStroke();
  fill(2,115,9);
  rect(0,100,700,400);
  fill(250,236,40);
  rect(0,40,700,7);
  rect(0,53,700,7);
  rect(0,540,700,7);
  rect(0,553,700,7);
  kezarTrack();
  noStroke();
  fill(32,165,11);
  rect(200,230,300,140);
  stroke(255);
  strokeWeight(5);
  line(205,235,495,235);
  line(205,235,205,365);
  line(205,365,495,365);
  line(495,235,495,365);
  line(350,235,350,365);
  noFill();
  ellipse(350,300,50,50);
  rect(205,270,30,60);
  rect(465,270,30,60);
}
public void kezarTrack()
{
  smooth();
  noStroke();
  fill(239,49,20);
  stroke(255);
  strokeWeight(5);
  rect(200,150,300,300);
  for(int r=300; r>=150; r-=35)
  {
    ellipse(200,300,r,r);
    ellipse(500,300,r,r);
  }
  noStroke();
  rect(200,153,300,295);
  stroke(255);
  strokeWeight(5);
  //space varies between lines, so while loop wouldn't work
  line(200,167,500,167);
  line(200,185,500,185);
  line(200,202,500,202);
  line(200,220,500,220);
  line(200,380,500,380);
  line(200,397,500,397);
  line(200,415,500,415);
  line(200,432,500,432);
}
public void man()
{
	noStroke();
	if(mousePressed == true)
	{
		red = 255;
		green = 0;
		blue = 0;

	}
	else if(mousePressed == false) 
	{
		red = 0;
		green = 0;
		blue = 255;
	}
	fill(red,green,blue);
	ellipse(mouseX,mouseY,20,20);
	rect(mouseX-10,mouseY+10,20,30);
	rect(mouseX-10,mouseY+40,5,20);
	rect(mouseX+5,mouseY+40,5,20);
	quad(mouseX-10,mouseY+10,mouseX-8,mouseY+12,mouseX-23,mouseY+27,mouseX-25,mouseY+25);
	quad(mouseX+10,mouseY+10,mouseX+8,mouseY+12,mouseX+23,mouseY+27,mouseX+25,mouseY+25);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
