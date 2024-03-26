import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  public void draw() {

    // Quadrant 1 Output
    strokeWeight(3);
    for (int lineX = 0; lineX <= 250; lineX += width / 19){
      line(lineX, 0, lineX, width / 2);
    }
    for (int lineY = 250; lineY >= 0; lineY -= height / 19){
      line(height / 2, lineY, 0, lineY);
    }
 
    // Quadrant 2 Output
    fill(196, 53, 106);
    stroke(0);
    strokeWeight(1);
    for (int circleX = 300; circleX <= width * 19/20; circleX +=  width / 160 * 13) {
      for (int circleY = height / 32 * 13; circleY >= height / 160 * 13; circleY -= height / 160 * 13) {
        ellipse(circleX, circleY, width / 20, width / 20);
      }
    } 

    // Quadrant 3 Output
    int strokeColor = 0;
    strokeWeight(1);
    for (int lineX = 0; lineX <=500; lineX += 1){
      stroke(strokeColor);
      line(lineX, height / 2, lineX, width);
      strokeColor += 1;
}
    // Quadrant 4 Output
    // Drawing petals
    strokeWeight(1);
    stroke(0);
    fill(214, 127, 4);
    for (int intDegrees = 0; intDegrees < 360; intDegrees += 45){ 
      pushMatrix ();
      translate (+250+125,+250+125);
      rotate (radians(intDegrees));
      translate (-250-125,-250-125);
      ellipse (+250+125, +250+125, 130, 20);
      popMatrix ();
    }
    
    // Drawing center
    strokeWeight(0);
    fill(80, 125, 42);
    ellipse(373,375,40,40);
  }
  
  // define other methods down here.
}