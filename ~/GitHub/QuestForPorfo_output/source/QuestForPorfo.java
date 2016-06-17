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

public class QuestForPorfo extends PApplet {

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

public void setup(){
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
  
  
  noStroke();
}

public void draw(){
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
public int levelFive(){
  if(drawga){
    if(intro){
      x = -1069/3;
      time = millis();
      intro = false;
    }
    else{
      background(bground4);
      fill(0);
      image(player,x,height-240,1069/3,612/3);
      if(x != 10){
        ++x;
      }
      else{
        textAlign(LEFT);
        text("Devourer! We have come to save the great Porfo!", 30, 400);
        if(millis()-time > 8000 && millis()-time < 14000){
          text("Huh? Oh sure, take him. He was just a project of Martin. I'm the new devourer, I don't think I need him.", 30,30,width-60,height);
        }
        else if(millis()-time > 14000 && millis()-time < 20000){
          background(255);
          image(Porfo,width/6,0);
          image(player,10,height-240,1069/3,612/3);
        }
        else if(millis()-time > 20000 && millis()-time < 30000){
          String[] end = loadStrings("4.end.txt");
          background(0);
          fill(255);
          textSize(20);textAlign(CENTER);
          text(end[0]+'\n'+end[1]+'\n'+end[2],width/2,height/2);
        }
        else if(millis()-time > 30000){
          int c = color(random(255),random(255),random(255));
          background(c);
          tint(c);
          image(Porfo,width/6,0);
          tint(random(255),random(255),random(255));
          image(player,10,height-240,1069/3,612/3);
        }
      }
    }
    
   }
   else{
     if(intro){
      x = -1069/3;
      time2 = millis();
      question = 10;
      intro = false;
    }
    else{
      background(0);
      fill(255);
      image(Devourer,width-692/2,0,629/2,411/2);
      image(player,x,height-240,1069/3,612/3);
      if(x != 10){
        ++x;
      }
      else{
        textAlign(LEFT);
        text("Devourer! We have come to save the great Porfo!", 30, 400);
        if(millis()-time2 > 10000 && millis()-time2 < 15000){
          textAlign(RIGHT);
          text("Euhm, yeah. Sorry but I just can't find room for that in the budget.",width-30,236); 
        }
        else if(millis()-time2 > 15000){
          background(0);
          image(player,x,height-240,1069/3,612/3);
          image(Devourer,width-692/2,0,629/2,411/2);
          fill(128,0,0);
          rect(0,height/2,playerHp*60,10);
          rect(width-devourerHp*60,height/3,devourerHp*60,10);
            
          switch(question){
              case 10:
                if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Monster that just want to play",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Monsters that just want to dance",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 11:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Caldwell's Nap Time",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Nathan's Nap Time",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 12:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("The Dino Dance",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("The Dino Dudes",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 13:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Shy Lobster",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Secret Lobster",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 14:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("French Kissing Elephants",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("French Kissing Rhino's",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 15:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Coolest Wombat",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Coolest Rodent",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 16:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Ripped Burger",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Ripped Pizza",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 17:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Gummy Bear Fight",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Gummy Worm Fight",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 18:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Winter Sports Platypus",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Water Sports Platypus",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 19:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Hexacorns",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Pentacorns",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 20:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Evil Pants",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Evil Shirt",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 21:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Morgan Freeman Dragon",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Morgan Freeman Dinosaur",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 22:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Whale Assasins",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Orca Assasins",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 23:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Sassy Palm Trees",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Sassy Christmas Trees",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                }
              }
              break;
              case 24:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("What's in Caldwell's Mouth?",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("What's in Nathan's Mouth?",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 25:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Snakes with Arms",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Snakes with Legs",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
              case 26:
              if(millis()-time > 100){
                  textAlign(CENTER);
                if(mouseX < width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Die",width/4,height-10);
                if(mouseX > width/2 && mouseY > height-30){
                  fill(0,128,0);
                }else{fill(255);}
                text("Use your GTW!",width/4*3,height-10);
                if(mousePressed){
                  time = millis();
                  if(mouseX < width/2 && mouseY > height-30){
                    --playerHp;
                    ++question;
                  }
                  else if(mouseX > width/2 && mouseY > height-30){
                    --devourerHp;
                    ++question;
                  }
                }
              }
              break;
          }
          if(playerHp == 0){
            exit();
          }
          else if(devourerHp == 0){
            intro = true;
            time = millis();
            return 6;
          }
        }
      }
    }
   }
   return 5;
}
public int levelFour(){
  if(intro){
    x = -1069/3;
    intro = false;
  }
  else{
    background(bground3);
    fill(0);rect(0,height-30,width,30);
    image(player,x,height-240,1069/3,612/3);
    if(x != 10){
      ++x;
    }
    else{
      textAlign(LEFT);
      text("Look at all these cool dudes, man!", 30, 400);
      if(millis()-time > 8000 && millis()-time < 18000){
        if(drawga){
          String[] end = loadStrings("3b.good.txt");
          background(0);
          fill(255);
          textSize(20);textAlign(CENTER);
          text(end[0]+'\n'+end[1]+'\n'+end[2],width/2,height/2);
         }
        else{
          String[] end = loadStrings("3b.bad.txt");
          background(0);
          fill(255);
          textSize(20);textAlign(CENTER);
          text(end[0]+'\n'+end[1]+'\n'+end[2],width/2,height/2);
        }
      }
      else if(millis()-time > 18000){
        background(0);
        image(player,-80,height/16);
        tint(random(255),random(255),random(255));
      }
    }
  }
  return 4;
}
public int levelOne(){
  if(intro){
    x = -1069/3;
    
    String[] introText = loadStrings("intro.txt");
    background(0);
    fill(255);
    textSize(20);
    textAlign(LEFT);
    text(introText[0]+'\n'+introText[1]+'\n'+introText[2],5,25,width-10,height-10);
    if(mousePressed){
      intro = false;
    }
  }
  else{
    background(bground);
    fill(0);rect(0,height-30,width,30);
    image(player,x,height-240,1069/3,612/3);
    image(Caldy,width-(217/3+x),height-200,217/3,444/3);
    image(Nate,width-(217/3+380/4+x),height-170,380/4,496/4);
    if(x != 10){
      ++x;
    }
    else{
    if(!talk && !fight){
      textAlign(LEFT);
      text("Look! We've got company, what will you do?", 30, 400);
      textAlign(CENTER);
      if(mouseX < width/2 && mouseY > height-30){
        fill(0,128,0);
      }else{fill(255);}
      text("Fight",width/4,height-10);
      if(mouseX > width/2 && mouseY > height-30){
        fill(0,128,0);
      }else{fill(255);}
      text("Talk",width/4*3,height-10);
      if(mousePressed){
        if(mouseX < width/2 && mouseY > height-30){
          fight = true;
          drawga = false;
          time = millis();
        }
        else if(mouseX > width/2 && mouseY > height-30)
        {
          talk = true;
          drawga = true;
          time = millis();
        }
      }
    }
      if(talk){
        if(millis() - time < 1000){
          background(bground);
          fill(0);rect(0,height-30,width,30);
          image(player,x,height-240,1069/3,612/3);
          image(Caldy,width-(217/3+x),height-200,217/3,444/3);
          image(Nate,width-(217/3+380/4+x),height-170,380/4,496/4);
          textAlign(LEFT);
          text("Hey, wassup?", 30,400);
        }
        else if(millis() - time < 2000){
          background(bground);
          fill(0);rect(0,height-30,width,30);
          image(player,x,height-240,1069/3,612/3);
          image(Caldy,width-(217/3+x),height-200,217/3,444/3);
          image(Nate,width-(217/3+380/4+x),height-170,380/4,496/4);
          textAlign(LEFT);
          text("Not much, you?", width/3*2,400);
        }
        else if(millis() - time < 4000){
          background(bground);
          fill(0);rect(0,height-30,width,30);
          image(player,x,height-240,1069/3,612/3);
          image(Caldy,width-(217/3+x),height-200,217/3,444/3);
          image(Nate,width-(217/3+380/4+x),height-170,380/4,496/4);
          textAlign(LEFT);
          text("We're on an epic adventure to slay the Great Devourer.", 30,400);
        }
        else if(millis() - time < 5000){
          background(bground);
          fill(0);rect(0,height-30,width,30);
          image(player,x,height-240,1069/3,612/3);
          image(Caldy,width-(217/3+x),height-200,217/3,444/3);
          image(Nate,width-(217/3+380/4+x),height-170,380/4,496/4);
          textAlign(LEFT);
          text("Hmmm... That does sound epic.", width/3*2,400);
        }
        else if(millis() - time >= 5000){
          talk = false;
          intro = true;
          question =10;
          return 3;
        }
      }
      else if(fight && question < 10){
        background(bground);
        fill(0);rect(0,height-30,width,30);
        image(player,x,height-240,1069/3,612/3);
        image(CaldyEvolved,width-(624/3+x),height-250,624/3,592/3);
        image(NateEvolved,width-(624/3+615/4+x),height-250,615/4,762/4);
        fill(128,0,0);
        rect(0,height/2,playerHp*60,10);
        rect(width-drawfeeBoysHp*60,height/2,drawfeeBoysHp*60,10);
        if(millis() - time > 1000){
          textAlign(LEFT);fill(0);
          text("Click on the topic those Drawfee Boys have drawn to do damage!", 30,400);
          
          switch(question){
            case 0:
              textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Ferry to Heaven",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Ferry to Hell",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
              }
            break;
            case 1:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("KLEPP!",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("KLOPP!",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
              }
            }
            break;
            case 2:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Daring Dog Duelers",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Daring Dairy Duelers",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
              }
            }
            break;
            case 3:
            if(millis() - time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Mini Clown",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Mega Clown",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
              }
            }
            break;
            case 4:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Dumb Batman Villains",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Dumb Bond Villains",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
              }
            }
            break;
            case 5:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Zoo Animals Cosplay",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Farmer Animals Cosplay",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
              }
            }
            break;
            case 6:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Unrealistic Cartoons",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Realistic Cartoons",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
              }
            }
            break;
            case 7:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Pear Gang",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Banana Gang",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
              }
            }
            break;
            case 8:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Mickey's True Form",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("Santa's True Form",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
              }
            }
            break;
            case 9:
            if(millis()-time > 100){
            textAlign(CENTER);
              if(mouseX < width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("What's in Nathan's Mouth?",width/4,height-10);
              if(mouseX > width/2 && mouseY > height-30){
                fill(0,128,0);
              }else{fill(255);}
              text("What's in Caldwell's Mouth?",width/4*3,height-10);
              if(mousePressed){
                time = millis();
                if(mouseX < width/2 && mouseY > height-30){
                  --drawfeeBoysHp;
                  ++question;
                }
                else if(mouseX > width/2 && mouseY > height-30){
                  --playerHp;
                  ++question;
                }
              }
            }
            break;
          }   
          if(playerHp == 0){
            exit();
          }
          else if(drawfeeBoysHp == 0){
            fight =false;
            intro = true;
            return 2;
          }
        }
      }
    }
  }
  return 1;
}
public int levelSix(){
  if(intro){
      x = 10;
      time = millis();
      intro = false;
    }
    else{
      background(0);
      fill(255);
      image(Devourer,width-692/2,0,629/2,411/2);
      image(player,x,height-240,1069/3,612/3);
      if(x != 10){
        ++x;
      }
      else{
        textAlign(LEFT);
        text("Whoohoo!!!!!!", 30, 400);
        if(millis()-time > 10000 && millis()-time < 15000){
          textAlign(RIGHT);
          text("Well I guess Porfo has the curse now",width-30,236); 
        }
        else if(millis()-time > 15000 && millis()-time < 20000){
          background(0);
          fill(255);
          image(player,x,height-240,1069/3,612/3);
          text("What?...", 30, 400);
        }
        else if(millis()-time > 20000 && millis()-time < 30000){
          String[] end = loadStrings("5.end.txt");
          background(0);
          fill(255);
          textSize(20);textAlign(CENTER);
          text(end[0]+'\n'+end[1]+'\n'+end[2],width/2,height/2);
        }
        else if(millis()-time > 30000){
          int c = color(random(255),random(255),random(255));
          background(c);
          tint(c);
          image(Porfo,width/6,0);
          tint(random(255),random(255),random(255));
          image(player,10,height-240,1069/3,612/3);
        }
      }
    }
  return 6;
}
public int levelThree(){
  if(intro){
    x = -1069/3;
    
    String[] introText = loadStrings("level3.txt");
    background(0);
    fill(255);
    textSize(20);
    textAlign(LEFT);
    text(introText[0]+'\n'+introText[1]+'\n'+introText[2],5,25,width-10,height-10);
    if(mousePressed){
      intro = false;
    }
  }
  else{
    background(bground2);
    fill(0);rect(0,height-30,width,30);
    image(player,x,height-240,1069/3,612/3);
    if(x != 10){
      ++x;
    }
    else{
      image(player,10,height-240,1069/3,612/3);
      textAlign(LEFT);
      text("Huh? It looks like the animals are picking sides, except for that one that doesn't like 'lables'.", 30, 340,width/2,height);
      textAlign(CENTER);
      if(mouseX < width/2 && mouseY > height-30){
        fill(0,128,0);
      }else{fill(255);}
      text("#TeamJacob",width/4,height-10);
      if(mouseX > width/2 && mouseY > height-30){
        fill(0,128,0);
      }else{fill(255);}
      text("#TeamWillie",width/4*3,height-10);
      if(mousePressed){
        time = millis();
        if(mouseX < width/2 && mouseY > height-30){
          intro = true;
          time = millis();
          return 5;
        }
        else if(mouseX > width/2 && mouseY > height-30){
          if(cool){
            intro = true;
            time = millis();
            return 4;
          }
          else{
            if(millis()-time < 2000){
              background(0);
              text("Only for Cool Kidz",width/2,height/2);
            }
          }
        }
        else if(mouseX>680 && mouseX<850 && mouseY>348 && mouseY<575){
          cool =  true;
          player = playerCool;
        }
      }
    }
  }
  return 3;
}
public int levelTwo(){
  if(intro){
    intro = false;
  }
  if(millis()-time < 1000){
    time2 = millis();
    i = 250;
  }
  if(millis() - time2 >= 2){
    if(i>0){i-=4;}
    background(bground);
    fill(0);rect(0,height-30,width,30);
    image(player,x,height-240,1069/3,612/3);
    image(CaldyEvolved,width-(624/3+x),height-i,624/3,592/3);
    image(NateEvolved,width-(624/3+615/4+x),height-i,615/4,762/4);
    time2 = millis();
  }
  if(millis() - time > 3000){
    background(bground);
    fill(0);rect(0,height-30,width,30);
    image(player,x,height-240,1069/3,612/3);
    image(DropOMG,width+i,height-200,413/3,467/3);
    if(i > -413/3){
      i-=3;
    }
    else{
      textAlign(LEFT);
      text("That was brutal!", width/3*2,400);
    }
  }
  if(millis() - time > 6000){
    background(bground);
    fill(0);rect(0,height-30,width,30);
    image(player,x,height-240,1069/3,612/3);
    image(Drop,width-524/4,height-200,524/4,604/4);
    textAlign(CENTER);
    text("To reward you I'm giving you extra Hp!", width/3*2,400);
    playerHp = 8;
  }
  if(millis() - time > 8000){
    time = millis();
    intro = true;
    return 3;
  }
  return 2;
}
  public void settings() {  size(995,638); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "QuestForPorfo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
