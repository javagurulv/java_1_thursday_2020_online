package student_aleksey_kodin.lesson3.day6.task_24;

class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(false);
        GamingConsole gamingConsole = new GamingConsole(false);

        String onStatus = (computer.isOn()) ? "On" : "Off";
        System.out.println("Computer is: " + onStatus);
        System.out.println("Turn On");
        computer.setOn(true);
        String turnOnStatus = (computer.isOn()) ? "On" : "Off";
        System.out.println("Computer is: " + turnOnStatus);
        computer.bootOS();
        computer.showScreen();
        computer.startEditor();
        System.out.println("Turn Off");
        computer.setOn(false);
        String turnOffStatus = (computer.isOn()) ? "On" : "Off";
        System.out.println("Computer is: " + turnOffStatus);
        System.out.println();
        String consoleOnStatus = (computer.isOn()) ? "On" : "Off";
        System.out.println("Gaming console is: " + consoleOnStatus);
        System.out.println("Turn On");
        gamingConsole.setOn(true);
        gamingConsole.bootOS();
        gamingConsole.showScreen();
        gamingConsole.playGame();
        System.out.println("Turn Off");
        gamingConsole.setOn(true);
        String consoleOffStatus = (computer.isOn()) ? "On" : "Off";
        System.out.println("Gaming console is: " + consoleOffStatus);
    }
}
