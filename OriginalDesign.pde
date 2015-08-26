void setup()
{
  size(700,600);
}
void draw()
{
  stadium();
}
void stadium()
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
void kezarTrack()
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