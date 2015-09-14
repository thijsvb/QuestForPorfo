int levelSix(){
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
          color c = color(random(255),random(255),random(255));
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