Ball[] ballGroup;
int pos = 0;

void setup() { // Happens once at launch
    size(1280, 720);
    background(200,200,200);
    ballGroup = new Ball[10000];
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);
    for (int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }
}

void mousePressed(){
    if(pos < ballGroup.length){
        ballGroup[pos] = new Ball(mouseX, mouseY, 10);
        pos++; //next empty position
    }
}


class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; //RGB Values
    int Grav;

    //Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx; //set x coord
        y = tempy; //set y coord
        r = tempr; //set the radius

        //set the colour values
        cr = int( random(0,255));
        cg = int( random(0,255));
        cb = int( random(0,255));

        //set velocity
        dx =int(random(1,10));
        dy =int(random(1,10));
        // Grav = -3;
    }

    void display() {
        fill(cr,cg,cb);
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        // dy = dy - Grav;

        if (y >= height - r || y <= 0+r) {
            dy = dy * -1;
        }
        if (x >= width-r || x <= 0+r) {
            dx = dx * -1;
        }
    }
}