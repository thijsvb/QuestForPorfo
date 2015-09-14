int levelOne(){
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