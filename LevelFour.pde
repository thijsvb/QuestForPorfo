int levelFour(){
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