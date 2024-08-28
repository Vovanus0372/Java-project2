package bridge;


public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new TVRemoteControl(tv);

        Device radio = new Radio();
        RemoteControl radioRemote = new RadioRemoteControl(radio);

        radioRemote.togglePower();// Включаем Radio
        remote.togglePower();  // Включаем TV

    }
}
