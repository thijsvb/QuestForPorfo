int levelThree(){
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