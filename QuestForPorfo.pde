PImage player;
PImage playerCool;
PImage bground;
PImage Caldy;
PImage CaldyEvolved;
PImage Nate;
PImage NateEvolved;
PImage Drop;
PImage DropOMG;
PImage bground2;
PImage Devourer;
PImage bground3;
PImage bground4;
PImage Porfo;
int level = 1;
int question = 0;
int x;
int i;
boolean intro = true;
boolean fight = false;
boolean talk = false;
boolean cool = false;
boolean drawga = true;
float time;
float time2;
float playerHp = 5;
float drawfeeBoysHp = 5;
float devourerHp = 10;

void setup(){
  player = loadImage("0.Player.png");
  playerCool = loadImage("0.PlayerCool.png");
  bground = loadImage("0.Background.png");
  Caldy = loadImage("1.Caldy.png");
  CaldyEvolved = loadImage("1.CaldyEvolved.png");
  Nate = loadImage("1.Nate.png");
  NateEvolved = loadImage("1.NateEvolved.png");
  Drop = loadImage("1.DropBeat.png");
  DropOMG = loadImage("1.DropOMG.png");
  bground2 = loadImage("2.Background.png");
  Devourer = loadImage("3a.GreatDevourer.png");
  bground3 = loadImage("3b.Background.png");
  bground4 = loadImage("3a.Background.png");
  Porfo = loadImage("4.Porfo!.jpg");
  
  size(995,638);
  noStroke();
}

void draw(){
  switch(level){
   case 1:
   level = levelOne();
   break;
   
   case 2:
   level = levelTwo();
   break;
   
   case 3:
   level = levelThree();
   break;
   
   case 4:
   level = levelFour();
   break;
   
   case 5:
   level = levelFive();
   break;
   
   case 6:
   level = levelSix();
   break;
  }
}