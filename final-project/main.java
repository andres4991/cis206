import java.util.ArrayList; 

class Main {

    // #3 Write minElevation, returns minimum elevation.
    public static Double minElevation(ArrayList<Mountain> mountainList) {
        Mountain smallestMountain = getSmallestMountain(mountainList); // Returns smallest mountain.
        return smallestMountain.getElevation(); // Returns the Elevation.
    }

    // #6 Requires me to print the name of the shortest mountain, so this prevents repetative code.
    public static Mountain getSmallestMountain(ArrayList<Mountain> mountainList) {
        Mountain currentMountain = mountainList.get(0);
        Double minElevation = currentMountain.getElevation();
        Mountain smallestMountain = currentMountain;

        for (int i = 0; i < mountainList.size(); i++) {
            currentMountain = mountainList.get(i);
            Double currElevation = currentMountain.getElevation();

            if (currElevation < minElevation) {
                minElevation = currElevation;
                smallestMountain = currentMountain;
            }
        }

        return smallestMountain;
    }

    public static void main(String[] args) {
        // #2 Create 7 mountain objects with the info from the table.
        // #3 Put the mountain objects into an appropriate data structure.
        ArrayList<Mountain> Mountains = new ArrayList<Mountain>(); 

        Mountains.add(new Mountain("Chimborazo", "Ecudado", 20549.0));
        Mountains.add(new Mountain("Matterhorn", "Switzerland", 14692.0));
        Mountains.add(new Mountain("Olympus", "Greece (Macedonia)", 9573.0));
        Mountains.add(new Mountain("Everest", "Nepal", 29029.0));
        Mountains.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344.0));
        Mountains.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684.0));
        Mountains.add(new Mountain("Zugspitze", "Switzerland", 9719.0));
        
        
        // #5 Print out all the mountain details, with the additional meter field.
        System.out.printf("%-27s | %-18s | %-8s | %7s\n", "Mountain", "Country", "Elevation (ft)", "Elevation (m)");
        for (Mountain mtn : Mountains) {
            mtn.print();
        }
        
        // #6 Print the Elevation and name of shortest Mountain. 
        // Don't hard code (hahaha)
        Mountain smallestMountain = getSmallestMountain(Mountains);
        System.out.println("\nShortest Mountain Name and Elevation: " + smallestMountain.getName() + ", " + smallestMountain.getElevation() + " ft.");

    }
}