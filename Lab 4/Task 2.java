class IDCard {
String name;
int id;
String department;
String institution;
IDCard(String name, int id, String department, String institution) {
this.name = name;
this.id = id;
this.department = department;
this.institution = institution;
}
void showID() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Department: " + department);
System.out.println("Institution: " + institution);
}
public static void main(String[] args) {
IDCard myID = new IDCard("Maher", 17, "Computer Science", "IIUC");
myID.showID();
}
}
