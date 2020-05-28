package student_aleksey_kodin.lesson7.dayx.supertask1;

class VirtualDiskDemo {

    public static void main(String[] args) {
        System.out.println("[ Создаём виртуальный диск: ]");
        VirtualDisk  virtualDisk = new VirtualDisk("A",45);
        System.out.println("Диск - " + virtualDisk.getVirtualDiskName());
        System.out.println("Размер - " + virtualDisk.getVirtualDiskSize());
        System.out.println("Занято - " + virtualDisk.getVirtualDiskUsedSize());
        System.out.println("Свободно - " + virtualDisk.getVirtualDiskFreeSize());

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Subfolder subfolder1 = new Subfolder("subfolder1");
        Folder folder3 = new Folder("folder3");
        File file1 = new File("file1",5,"txt");
        File file2 = new File("file2",5,"exe");

        System.out.println("[ Добовляем 4 элемента: ]");
        virtualDisk.addToVirtualDisk(folder1);
        virtualDisk.addToVirtualDisk(folder2);
        virtualDisk.addToVirtualDisk(subfolder1);
        virtualDisk.addToVirtualDisk(file1);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Удаляем 3 элемент: ]");
        virtualDisk.deleteFromVirtualDisk(3);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Добовляем удаленный 3 элемент: ]");
        System.out.println("[ 3 элемент появляется в конце ]");
        virtualDisk.addToVirtualDisk(subfolder1);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Добовляем 5 элемент: ]");
        virtualDisk.addToVirtualDisk(folder3);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Добовляем 6 элемент: ]");
        virtualDisk.addToVirtualDisk(file2);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Удаляем 4 элемент: ]");
        virtualDisk.deleteFromVirtualDisk(4);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Добовляем 4 элемент: ]");
        System.out.println("Происходит дефрагминтация");
        virtualDisk.addToVirtualDisk(file1);

        virtualDisk.print();
        virtualDisk.printInformation();

        System.out.println("[ Добовляем 7 элемент: ]");
        Folder folder5 = new Folder("folder 5");
        virtualDisk.addToVirtualDisk(folder5);

        virtualDisk.print();
        virtualDisk.printInformation();
    }
}
