
/**
 * This is a simple program involving
 * the use of shapes to create a drawing
 * of a building with details in the background. 
 * 
 * @author Andrew Krause
 * CS120 Section 02
 * Fall 2019
 * 
 * Programming Assignment 1
 * September 13, 2019
 */

public class Building
{
    public static void main( String[] args )
    {
    	
    // Background
    	
        // Window Parameters: Sky Background
    	Window win;
    	win = new Window();
    	win.setSize( 700, 750 );
    	win.setTitle( "Charles Greene is the King" );
    	win.setBackground(java.awt.Color.cyan);
    	
    	// Rectangle Parameters: Green Grass Background
    	Rectangle rec = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec );
    	rec.setLocation( 0, 450 );
    	rec.setSize( 700, 250);
    	rec.setBackground(java.awt.Color.green);
    	
    	// Oval Parameters: Bluffs1
    	Oval oval = new Oval( 50, 50, 35, 40 );
    	win.add( oval );
    	oval.setLocation( 100, 200 );
    	oval.setSize( 400, 600 );
    	oval.setBackground(java.awt.Color.green);
    	
    	// Oval2 Parameters: Bluffs2
    	Oval oval2 = new Oval( 50, 50, 35, 40 );
    	win.add( oval2 );
    	oval2.setLocation( 50, 200 );
    	oval2.setSize( 400, 800 );
    	oval2.setBackground(java.awt.Color.green);
    	
    	// Oval3 Parameters: Bluffs3
    	Oval oval3 = new Oval( 50, 50, 35, 40 );
    	win.add( oval3 );
    	oval3.setLocation( 25, 100 );
    	oval3.setSize( 300, 800 );
    	oval3.setBackground(java.awt.Color.green);
    	
    	// Oval4 Parameters: Bluffs4
    	Oval oval4 = new Oval( 50, 50, 35, 40 );
    	win.add( oval4 );
    	oval4.setLocation( -50, 200 );
    	oval4.setSize( 300, 800 );
    	oval4.setBackground(java.awt.Color.green);
    	
    	// Oval5 Parameters: Bluffs5
    	Oval oval5 = new Oval( 50, 50, 35, 40 );
    	win.add( oval5 );
    	oval5.setLocation( 200, 350 );
    	oval5.setSize( 800, 300 );
    	oval5.setBackground(java.awt.Color.green);
    	
    // Pathway
    	
    	// Oval6 Parameters: Main Plaza
    	Oval oval6 = new Oval( 50, 50, 35, 40 );
    	win.add( oval6 );
    	oval6.setLocation( -75, 600 );
    	oval6.setSize( 850, 200 );
    	oval6.setBackground(java.awt.Color.orange);
    	
    	// Rectangle2 Parameters: Walkway
    	Rectangle rec2 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec2 );
    	rec2.setLocation( 270, 400 );
    	rec2.setSize( 175, 500);
    	rec2.setBackground(java.awt.Color.orange);
    	
    // Background Building1 Parts
    	
    	// Triangle Parameters: Roof Part1
    	Triangle tri = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri ); 
    	tri.setLocation( 495, 395 );
    	tri.setSize( 30, 30 );
    	tri.setBackground(java.awt.Color.lightGray);
    	
    	// Triangle2 Parameters: Roof Part2
    	Triangle tri2 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri2 ); 
    	tri2.setLocation( 520, 395 );
    	tri2.setSize( 30, 30 );
    	tri2.setBackground(java.awt.Color.lightGray);
    	
    	// Trianlge3 Parameters: Roof Part3
    	Triangle tri3 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri3 ); 
    	tri3.setLocation( 545, 395 );
    	tri3.setSize( 30, 30 );
    	tri3.setBackground(java.awt.Color.lightGray);
    	
    	// Triangle4 Parameters: Roof Part4
    	Triangle tri4 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri4 ); 
    	tri4.setLocation( 570, 395 );
    	tri4.setSize( 30, 30 );
    	tri4.setBackground(java.awt.Color.lightGray);
    	
    	// Triangle5 Parameters: Roof Part5
    	Triangle tri5 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri5 ); 
    	tri5.setLocation( 595, 395 );
    	tri5.setSize( 30, 30 );
    	tri5.setBackground(java.awt.Color.lightGray);
    	
    	// Triangle6 Parameters: Roof Part6
    	Triangle tri6 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri6 ); 
    	tri6.setLocation( 620, 395 );
    	tri6.setSize( 30, 30 );
    	tri6.setBackground(java.awt.Color.lightGray);
    	
    	// Triangle7 Parameters: Roof Part7
    	Triangle tri7 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri7 ); 
    	tri7.setLocation( 645, 395 );
    	tri7.setSize( 30, 30 );
    	tri7.setBackground(java.awt.Color.lightGray);
    	
    	// Triangle8 Parameters: Roof Part8
    	Triangle tri8 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri8 ); 
    	tri8.setLocation( 670, 395 );
    	tri8.setSize( 30, 30 );
    	tri8.setBackground(java.awt.Color.lightGray);
    	
    	// Triangl9 Parameters: Roof Part9
    	Triangle tri9 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri9 ); 
    	tri9.setLocation( 695, 395 );
    	tri9.setSize( 30, 30 );
    	tri9.setBackground(java.awt.Color.lightGray);
    	
    	// Rectangle3 Parameters: Small Main Body
    	Rectangle rec3 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec3 );
    	rec3.setLocation( 500, 425 );
    	rec3.setSize( 300, 50);
    	rec3.setBackground(java.awt.Color.gray);
    	
    // Background Building2 Parts
    	
    	// Rectangle4 Parameters: Smokestack
    	Rectangle rec4 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec4 );
    	rec4.setLocation( 100, 225 );
    	rec4.setSize( 50, 100);
    	rec4.setBackground(java.awt.Color.gray);
    	
    	// Rectangle5 Parameters: Large Main Body
    	Rectangle rec5 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec5 );
    	rec5.setLocation( 0, 325 );
    	rec5.setSize( 500, 150);
    	rec5.setBackground(java.awt.Color.lightGray);
    	
    	// Oval7 Parameters: Large Main Body Top
    	Oval oval7 = new Oval( 50, 50, 35, 40 );
    	win.add( oval7 );
    	oval7.setLocation( 0, 275 );
    	oval7.setSize( 500, 100 );
    	oval7.setBackground(java.awt.Color.lightGray);
    	
    // Bell Tower Parts
    	
    	// Rectangle6 Parameters: Left Column Base
    	Rectangle rec6 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec6 );
    	rec6.setLocation( 272, 650 );
    	rec6.setSize( 50, 50);
    	rec6.setBackground(java.awt.Color.red);
    	
    	// Rectangle7 Parameters: Right Column Base
    	Rectangle rec7 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec7 );
    	rec7.setLocation( 393, 650 );
    	rec7.setSize( 50, 50);
    	rec7.setBackground(java.awt.Color.red);
    	
    	// Rectangle8 Parameters: Left Column 
    	Rectangle rec8 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec8 );
    	rec8.setLocation( 280, 400 );
    	rec8.setSize( 35, 300);
    	rec8.setBackground(java.awt.Color.red);
    	
    	// Rectangle9 Parameters: Right Column 
    	Rectangle rec9 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec9 );
    	rec9.setLocation( 400, 400 );
    	rec9.setSize( 35, 300);
    	rec9.setBackground(java.awt.Color.red);
    	
    	// Rectangle10 Parameters: Lower Body Section
    	Rectangle rec10 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec10 );
    	rec10.setLocation( 290, 390 );
    	rec10.setSize( 135, 100);
    	rec10.setBackground(java.awt.Color.red);
    	
    	// Rectangle11 Parameters: Middle Body Section
    	Rectangle rec11 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec11 );
    	rec11.setLocation( 297, 250 );
    	rec11.setSize( 120, 150);
    	rec11.setBackground(java.awt.Color.red);
    	
    	// Rectangle12 Parameters: Upper Body Section
    	Rectangle rec12 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec12 );
    	rec12.setLocation( 290, 245 );
    	rec12.setSize( 135, 15);
    	rec12.setBackground(java.awt.Color.red);
    	
    	// Rectangle13 Parameters: Upper Left Column
    	Rectangle rec13 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec13 );
    	rec13.setLocation( 282, 100 );
    	rec13.setSize( 14, 150);
    	rec13.setBackground(java.awt.Color.red);
    	
    	// Rectangle14 Parameters: Upper Right Column
    	Rectangle rec14 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec14 );
    	rec14.setLocation( 417, 100 );
    	rec14.setSize( 14, 150);
    	rec14.setBackground(java.awt.Color.red);
    	
    	// Rectangle15 Parameters: Upper Horizontal Part
    	Rectangle rec15 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec15 );
    	rec15.setLocation( 283, 100 );
    	rec15.setSize( 142, 14);
    	rec15.setBackground(java.awt.Color.red);
    	
    	// Rectangle16 Parameters: Lower Horizontal Part
    	Rectangle rec16 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec16 );
    	rec16.setLocation( 283, 236 );
    	rec16.setSize( 142, 14);
    	rec16.setBackground(java.awt.Color.red);
    	
    	// Rectangle17 Parameters: Base For Top Triangle
    	Rectangle rec17 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec17 );
    	rec17.setLocation( 289, 90 );
    	rec17.setSize( 135, 15);
    	rec17.setBackground(java.awt.Color.red);
    	
    	// Triangle10 Parameters: Top Triangle
    	Triangle tri10 = new Triangle ( 200, 200, 400, 400, 1 );
    	win.add( tri10 ); 
    	tri10.setLocation( 289, 40 );
    	tri10.setSize( 135, 50 );
    	tri10.setBackground(java.awt.Color.red);
    	
    	// Rectangle18 Parameters: Bell Part1
    	Rectangle rec18 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec18 );
    	rec18.setLocation( 318, 229 );
    	rec18.setSize( 75, 10);
    	rec18.setBackground(java.awt.Color.red);
    	
    	// Rectangle19 Parameters: Bell Part2
    	Rectangle rec19 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec19 );
    	rec19.setLocation( 325, 223 );
    	rec19.setSize( 60, 10);
    	rec19.setBackground(java.awt.Color.red);
    	
    	// Oval8 Parameters: Bell Part3
    	Oval oval8 = new Oval( 50, 50, 35, 40 );
    	win.add( oval8 );
    	oval8.setLocation( 330, 140 );
    	oval8.setSize( 50, 20 );
    	oval8.setBackground(java.awt.Color.red);
    	
    	// Rectangle20 Parameters: Bell Part4
    	Rectangle rec20 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec20 );
    	rec20.setLocation( 330, 150 );
    	rec20.setSize( 50, 80);
    	rec20.setBackground(java.awt.Color.red);
    	
    	// Rectangle21 Parameters: Bell Part5
    	Rectangle rec21 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec21 );
    	rec21.setLocation( 336, 155 );
    	rec21.setSize( 38, 50);
    	rec21.setBackground(java.awt.Color.orange);
    	
    	// Oval9 Parameters: Clock Border
    	Oval oval9 = new Oval( 50, 50, 35, 40 );
    	win.add( oval9 );
    	oval9.setLocation( 320, 270 );
    	oval9.setSize( 75, 75 );
    	oval9.setBackground(java.awt.Color.black);
    	
    	// Oval10 Parameters: Clock Face
    	Oval oval10 = new Oval( 50, 50, 35, 40 );
    	win.add( oval10 );
    	oval10.setLocation( 325, 275 );
    	oval10.setSize( 65, 65 );
    	oval10.setBackground(java.awt.Color.white);
    	
    	// Oval11 Parameters: Clock Center Piece
    	Oval oval11 = new Oval( 50, 50, 35, 40 );
    	win.add( oval11 );
    	oval11.setLocation( 353, 304 );
    	oval11.setSize( 10, 10 );
    	oval11.setBackground(java.awt.Color.black);
    	
    	// Rectangle22 Parameters: Clock Large Hand
    	Rectangle rec22 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec22 );
    	rec22.setLocation( 355, 280 );
    	rec22.setSize( 5, 30);
    	rec22.setBackground(java.awt.Color.black);
    	
    	// Rectangle23 Parameters: Clock Small Hand
    	Rectangle rec23 = new Rectangle ( 500, 500, 30, 30 );
    	win.add( rec23 );
    	rec23.setLocation( 355, 307 );
    	rec23.setSize( 25, 5);
    	rec23.setBackground(java.awt.Color.black);
    	
    // Sun and Clouds
    	
    	// Oval12 Parameters: Cloud1
    	Oval oval12 = new Oval( 50, 50, 35, 40 );
    	win.add( oval12 );
    	oval12.setLocation( 600, 118 );
    	oval12.setSize( 75, 25 );
    	oval12.setBackground(java.awt.Color.white);
    	
    	// Oval13 Parameters: Sun
    	Oval oval13 = new Oval( 50, 50, 35, 40 );
    	win.add( oval13 );
    	oval13.setLocation( 560, 50 );
    	oval13.setSize( 100, 100 );
    	oval13.setBackground(java.awt.Color.yellow);
    	
    	// Oval14 Parameters: Cloud2
    	Oval oval14 = new Oval( 50, 50, 35, 40 );
    	win.add( oval14 );
    	oval14.setLocation( 575, 130 );
    	oval14.setSize( 75, 25 );
    	oval14.setBackground(java.awt.Color.white);
    	
    	// Oval15 Parameters: Cloud3
    	Oval oval15 = new Oval( 50, 50, 35, 40 );
    	win.add( oval15 );
    	oval15.setLocation( 560, 110 );
    	oval15.setSize( 75, 25 );
    	oval15.setBackground(java.awt.Color.white);
    	
    	// Oval16 Parameters: Cloud4
    	Oval oval16 = new Oval( 50, 50, 35, 40 );
    	win.add( oval16 );
    	oval16.setLocation( 540, 125 );
    	oval16.setSize( 75, 25 );
    	oval16.setBackground(java.awt.Color.white);    
    }
}
