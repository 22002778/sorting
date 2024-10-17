Main.java
public class Main {
public static void main(String[] args) {
int [] productIDs = {101,102,103, 104,105, 106,107};

int idFound = findProductIndex(productIDs, targetID: 107);
System.out.println(idFound);
public static int findProductIndex(int[] productIDs, int targetID) { 1usage
int Low = 0;
int high = productIDs.Length-1:
while (low<=high) {
int middle = (Low+high) /2;
int middleNum = productIDs[middle];
if (targetID==middLeNum) {
	return middle+1;
}
｝
1f(targetID<middleNum){
high = middle-1;
}
else {
Low = middle+1;}
}
return -1;
}
