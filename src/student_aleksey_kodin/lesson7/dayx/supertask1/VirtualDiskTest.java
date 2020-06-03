package student_aleksey_kodin.lesson7.dayx.supertask1;

class VirtualDiskTest {
    static VirtualDisk virtualDisk = new VirtualDisk("C",27);
    static Folder folder = new Folder("folder_1#$%()*)((**&((*&^^");
    static Folder folder2 = new Folder("folder_2");
    static Subfolder subfolder = new Subfolder("subfolder_1");
    static Subfolder subfolder2 = new Subfolder("subfolder_2");
    static File file = new File("file_1",1,"exe");
    static File largeFile = new File("largeFile",2,"txt");

    public static void main(String[] args) {
        testCheckName();
        testAddElementToVirtualDisk();
        testDeleteElementFromVirtualDisk();
        testDefrag();
        testReturnElementsToVirtualDisk();
        testTryAddLargeFileToVirtualDisk();
        testAddLargeFileWithDefrag();
        testDeleteAll();
    }
    private static void testCheckName() {
        printTestResult(folder.getName().equals("folder_1"),"check name and name length");
        System.out.println();
    }
    private static void testAddElementToVirtualDisk() {
        System.out.println("[ Add elements to Virtual Disk ]");
        System.out.println("Before:");
        virtualDisk.print();
        boolean result1 = virtualDisk.addToVirtualDisk(folder);
        boolean result2 = virtualDisk.addToVirtualDisk(folder2);
        boolean result3 = virtualDisk.addToVirtualDisk(subfolder);
        boolean result4 = virtualDisk.addToVirtualDisk(subfolder2);
        boolean result5 = virtualDisk.addToVirtualDisk(file);

        System.out.println("After:");
        virtualDisk.print();
        virtualDisk.printInformation();
        printTestResult(result1 == result2 == result3 == result4 == result5,"add elements to Virtual Disk");
        System.out.println();
    }
    private static void testDefrag() {
        System.out.println("[ Defrag Virtual Disk ]");
        System.out.println("Before:");
        virtualDisk.print();
        virtualDisk.defrag();
        System.out.println("After:");
        virtualDisk.print();
        virtualDisk.printInformation();
        System.out.println();
    }
    private static void testDeleteElementFromVirtualDisk() {
        System.out.println("[ Delete 2 and 4 elements from Virtual Disk ]");
        System.out.println("Before:");
        virtualDisk.print();
        boolean result1 = virtualDisk.deleteFromVirtualDisk(2);
        boolean result2 =virtualDisk.deleteFromVirtualDisk(4);
        System.out.println("After:");
        virtualDisk.print();
        virtualDisk.printInformation();
        printTestResult(result1 == result2,"delete elements to Virtual Disk");
        System.out.println();
    }
    private static void testReturnElementsToVirtualDisk() {
        System.out.println("[ Return elements to Virtual Disk ]");
        System.out.println("Before:");
        virtualDisk.print();
        boolean result1 = virtualDisk.addToVirtualDisk(folder2);
        boolean result2 =virtualDisk.addToVirtualDisk(subfolder2);
        System.out.println("After:");
        virtualDisk.print();
        virtualDisk.printInformation();
        printTestResult(result1 == result2,"return elements to Virtual Disk");
        System.out.println();
    }
    private static void testTryAddLargeFileToVirtualDisk() {
        boolean result = virtualDisk.addToVirtualDisk(largeFile);
        printTestResult(!result,"large file no add to Virtual Disk");
        System.out.println();
    }
    private static void testAddLargeFileWithDefrag() {
        System.out.println("[ Delete index 5, defrag and Add large file to Virtual Disk ]");
        System.out.println("Before:");
        virtualDisk.print();
        System.out.println("Delete index 5:");
        virtualDisk.deleteFromVirtualDisk(5);
        virtualDisk.print();
        boolean result = virtualDisk.addToVirtualDisk(largeFile);
        System.out.println("Defrag and add large file to Virtual Disk:");
        virtualDisk.print();
        virtualDisk.printInformation();
        printTestResult(result,"large file add to Virtual Disk with defrag");
        System.out.println();
    }
    private static void testDeleteAll() {
        System.out.println("[ Delete all from Virtual Disk ]");
        System.out.println("Before:");
        virtualDisk.print();
        for (int count = 1; count <= 5;count++) {
            boolean result = virtualDisk.deleteFromVirtualDisk(count);
            printTestResult(result,"element with index " + count + " deleted");
        }
        System.out.println("After:");
        virtualDisk.print();
        virtualDisk.printInformation();
    }
    private static void printTestResult(boolean isResultOk,String virtualDisk) {
        if (isResultOk) {
            System.out.println("Virtual Disk test - " + virtualDisk + " = OK");
        } else {
            System.out.println("Virtual Disk test - " + virtualDisk + " = FAIL");
        }
    }
}
