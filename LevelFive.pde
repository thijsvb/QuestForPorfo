int levelFive(){
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
          color c = color(random(255),random(255),random(255));
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