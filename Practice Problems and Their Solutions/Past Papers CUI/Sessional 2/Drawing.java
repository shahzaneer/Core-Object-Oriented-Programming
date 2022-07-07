public class Drawing {
    // Drawing will use the Concept of `has a relationship`
    // Composition in classes
    private GeometricObject geometricObject[] = new GeometricObject[5];


    public Drawing() {
    }
    
    public Drawing(GeometricObject [] geometricObject) {
        this.geometricObject = geometricObject;
    }


    public void add(GeometricObject obj) {
        for (int i = 0; i < geometricObject.length; i++) {
            if (geometricObject[i] == null) {
                geometricObject[i] = obj;
                break;
            }
        }
    }

    public double calculateArea() {
        double totalArea = 0;
        for (int i = 0; i < geometricObject.length; i++) {
            totalArea += geometricObject[i].calculateArea();
        }
        return totalArea;
    }

    public int countNoOfFilledShapes() {
        int counter = 0;
        for (int i = 0; i < geometricObject.length; i++) {
            if (geometricObject[i].getIsFilled() == true) {
                counter++;
            }
        }

        return counter;
    }


}
