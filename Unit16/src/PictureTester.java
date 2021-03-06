/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
	String beachS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\beach.jpg";
    Picture beach = new Picture(beachS);
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /* Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	String beachS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\beach.jpg";
	Picture beach = new Picture(beachS);
	beach.explore();
    beach.keepOnlyBlue();	
    beach.explore();
  }
  
  /* Method to test negate */
  public static void testNegate()
  {
	String beachS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\beach.jpg";
	Picture beach = new Picture(beachS);
	beach.explore();
    beach.negate();	
    beach.explore();
  }
  
  /* Method to test grayscale */
  public static void testGrayscale()
  {
	String beachS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\beach.jpg";
	Picture beach = new Picture(beachS);
	beach.explore();
    beach.grayscale();	
    beach.explore();
  }
  
  /* Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
	  String waterS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\water.jpg";
	  Picture beach = new Picture(waterS);
	  beach.explore();
	  beach.fixUnderwater();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
	String caterpillarS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\caterpillar.jpg";
    Picture caterpillar = new Picture(caterpillarS);
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVertical Right to left */
  public static void testMirrorVerticalRightToLeft()
  {
	  String caterpillarS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\caterpillar.jpg";
	  Picture caterpillar = new Picture(caterpillarS);
	  caterpillar.explore();
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
  }
  
  /* Method to test mirrorHorizontal() */
  public static void testMirrorHorizontal()
  {
	  String caterpillarS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\caterpillar.jpg";
	  Picture caterpillar = new Picture(caterpillarS);
	  caterpillar.explore();
	  caterpillar.mirrorHorizontal();
	  caterpillar.explore();
  }
  
  /* Method to test mirror bottom to top */
  public static void testMirrorHorizontalBotToTop()
  {
	  String caterpillarS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\caterpillar.jpg";
	  Picture caterpillar = new Picture(caterpillarS);
	  caterpillar.explore();
	  caterpillar.mirrorHorizontalBotToTop();
	  caterpillar.explore();
  }
  
  /** Method to test mirror diagonal */
  public static void testMirrorDiagonal()
  {
	  String beachS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\beach.jpg";
	  Picture caterpillar = new Picture(beachS);
	  caterpillar.explore();
	  caterpillar.mirrorDiagonal();
	  caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    String templeS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\temple.jpg";
	Picture temple = new Picture(templeS);
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    String snowmanS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\snowman.jpg";
	Picture temple = new Picture(snowmanS);
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
    String gullS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\gull.jpg";
	Picture temple = new Picture(gullS);
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  
  /** Method to test the collage method */
  public static void testCollage()
  {
	String canvasS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\640x480.jpg";
    Picture canvas = new Picture(canvasS);
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test the collage method */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    String swanS = "C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\swan.jpg";
	Picture swan = new Picture(swanS);
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test the most updated edge detection */
  public static void testEdgeDetectionHV()
  {
    Picture swan = new Picture("C:\\Users\\anish\\Documents\\GitHub\\jayant_anish_apcsa-2021\\Unit16\\src\\images\\swan.jpg");
    swan.edgeDetectionHV(10);
    swan.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    testEdgeDetectionHV();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}