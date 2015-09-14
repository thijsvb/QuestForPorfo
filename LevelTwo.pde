int levelTwo(){
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