package Step_semester_3.src.oop.class_problems;

class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {
        // Storing multiple objects in an array
        PlacementRecord[] records = new PlacementRecord[] {
            new PlacementRecord("Ravi", "TCS", 4.5),
            new PlacementRecord("Anitha", "Zoho", 6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };

        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
    
}
