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

public void setup()
{
  size(700,600);
}
public void draw()
{
  stadium();
}
public void stadium()
{
  background(150);
  noStroke();
  fill(0,255,0);
  rect(0,100,700,400);
  fill(255,0,0);
  rect(0,40,700,7);
  rect(0,53,700,7);
  rect(0,540,700,7);
  rect(0,553,700,7);
  kezarTrack();
}
public void kezarTrack()
{
  smooth();
  noStroke();
  fill(0,0,255);
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
  noStroke();
  fill(255,0,0);
  rect(200,230,300,140);
  
  
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