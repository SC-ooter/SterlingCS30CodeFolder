ArrayList<Ball> ballGroup;
//Ball[] ballGroup;
//int pos = 0;

void setup() { // Happens once at launch
    size(1600, 900);
    background(200,200,200);
    //ballGroup = new Ball[10000];
    ballGroup =  new ArrayList<Ball>();
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);
    //for (int i = 0; i < ballGroup.size(); i++) {
    //    ballGroup.get(i).display();
    //    ballGroup.get(i).move();
    //}
    
    for (Ball theBall : ballGroup) {
      theBall.move(); 
      
      for (Ball otherBall : ballGroup) {
        if (theBall != otherBall) {
            theBall.checkCollision(otherBall);
          }
      }
      
      theBall.display();
      
    }
}

void mousePressed(){
    //if(pos < ballGroup.length){
        // ballGroup[pos] = new Ball(mouseX, mouseY, 10);
        ballGroup.add(new Ball(mouseX, mouseY, 20, false));
        //pos++; //next empty position
    //}
}

void keyPressed() {
   if ( key == 'c') {
    for (int i =  ballGroup.size() -1; i >= 0; i--) {
        ballGroup.remove(i);
      }
   }
   
   //inject infected object
   else if (key == 'j') {
     ballGroup.add(new Ball(width/2,height/2, 10, true));
   }
}

class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; //RGB Values
    int Grav;
    boolean infected;

    //Constructor
    Ball(int tempx, int tempy, int tempr, boolean tempinf) {
        x = tempx; //set x coord
        y = tempy; //set y coord
        r = tempr; //set the radius
        infected = tempinf;

        //set the colour values
        cr = int( random(0,255));
        cg = int( random(0,255));
        cb = int( random(0,255));

        //set velocity
        dx =int(random(1,10));
        dy =int(random(1,10));
        Grav = 0;
    }

    void display() {
      if (infected == true) { 
         cr =255;
         cb = 0;
         cg = 0;
      }
      
        fill(cr,cg,cb);
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - Grav;

        if (y >= height - r || y <= 0+r) {
            dy = dy * -1;
        }
        if (x >= width-r || x <= 0+r) {
            dx = dx * -1;
        }
    }
    
    void checkCollision(Ball otherBall) {
       double distanceApart = dist(x, y, otherBall.x, otherBall.y);
       double threshold = r +otherBall.r;
       
       //bouce the ball
       if (distanceApart < threshold) {
           // store the first velocity
           int tempdx = dx;
           int tempdy = dy;
           
           
           //Ball 1 gets  Velocity 2
           dx = otherBall.dx;
           dy = otherBall.dy;
           
           //Ball 2 gets Velocity 1
           otherBall.dx = tempdx;
           otherBall.dy = tempdy;
           
           //pass on infection
           if (otherBall.infected == true) {
             infected = true;
             Grav = -1;
           }
           
           else if (otherBall.infected == false && infected == true) {
             otherBall.infected = true;
           }
           
       }
       
       
    }
}
