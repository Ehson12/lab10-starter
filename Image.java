import java.awt.Color;                      class Image
  {
private final int width;
            private final int height;
 private final Color[] pixels;
      Image(int width,
      int height, Color[] pixels)
     {this.width = width;



       this.height = height;
this.pixels = pixels;
}
  public String toString(){int w = this.width;int h = this.height;
String pixelRef = this.pixels.toString();
       String p = pixelRef.substring(pixelRef.indexOf("@"));return "Image[width=" + w + ",height=" + h + ",pixels=" + p + "]";}

       Color getColorAtPos(int col, int row) {
  return this.pixels[this.width*row + col];} int getWidth() {return this.width;}
  int getHeight()



  {return this.height;}

              Color[] getPixels() {return this.pixels;}int size()
  {return pixels.length;}}
