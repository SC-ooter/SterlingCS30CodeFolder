grid g;
void setup() {
  size(1700,800);
  g = new grid(20,20);
}

void draw() {
  background(255,0,0);
  g.displaygrid();
}

  
void mousePressed(){
  g.click(mouseX,mouseY);
}

void keyPressed() {
  if (key == 'c') {
    g.clear();
  }
  else if (key == '1') {
    g.one();
  }
  else if (key == '2') {
    g.two();
  }
  else if (key == '3') {
    g.three();
  }
  else if (key == '4') {
    g.four();
  }
  else if (key == '5') {
    g.five();
  }
  else if (key == '6') {
    g.six();
  }
  else if (key == '7') {
    g.seven();
  }
  else if (key == '9') {
    g.nine();
  }
  else if (key == 'a') {
    g.eh();
  }

}

class grid {
  int ROWS, COLS;
  boolean [][] gridarray;
  
  //constructor
  grid(int tempr, int tempc) {
    ROWS = tempr;
    COLS = tempc;
    gridarray = new boolean[ROWS][COLS];
    
    clear(); 
      }

  
  void displaygrid(){
    gridarray[4][3] = true;
    
    for (int y = 0; y<ROWS; y++) {
      for (int x = 0; x < COLS; x++) {
        if (gridarray[y][x] == false) {
          fill(255); //fill white
        }
        else {
          fill(0); // fill black
        }
        
        int cellwidth = width /COLS;
        int cellheight = height/ROWS;
        
        //Starts drawing from top left corner of Rectangle
        
        rect(x * cellwidth, y  * cellheight, cellwidth, cellheight);
        
      }
    }
  }
    
  void click(int mx, int my) {
    int cellwidth = width / COLS;
    int cellheight = height / ROWS;
    
    int x = mx / cellwidth;
    int y = my / cellheight;
    
    if (gridarray[y][x]==false) {
      gridarray[y][x]=true; // make it true if false
    }
    else {
      gridarray[y][x]=false; //makes it false if it was true
  }
    
}
void clear() {
  for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        gridarray[y][x] = false;
      }
    }
}
void one() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 1 || x == 1) {
          gridarray[y][x] = true;
        }
      }
      }
}
void two() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 17 || x == 17) {
          gridarray[y][x] = true;
        }
      }
      }
}
void three() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 3 || x == 3) {
          gridarray[y][x] = true;
        }
      }
      }
}
void four() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 15||x == 15) {
          gridarray[y][x] = true;
        }
      }
      }
}
void five() {
    for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 5 || x == 5) {
          gridarray[y][x] = true;
        }
      }
    }
}
void six() {
    for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y ==13 || x == 13) {
          gridarray[y][x] = true;
        }
      }
    }
}
void seven() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 7 || x == 7) {
          gridarray[y][x] = true;
        }
      }
      }
}
void nine() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (y == 9 || x == 9) {
          gridarray[y][x] = true;
        }
      }
      }
}

void eh() {
      for (int y = 0; y < ROWS;y++) {
      for (int x = 0; x < COLS;x++){
        if (gridarray[y][x] == false){
          gridarray[y][x] = true;
        }
      }
    }
  }
}
