package bridge;

class Radio implements  Device{
        private boolean isOn;

        public String turnOn() {
            isOn = true;
            return "Radio is ON";
        }

        public String turnOff() {
            isOn = false;
            return "Radio is OFF";
        }
    }
    class RadioRemoteControl extends RemoteControl {

        public RadioRemoteControl(Device device) {
            super(device);
        }

        @Override
        public void togglePower() {
            if (device instanceof Radio) {
                System.out.println(((Radio) device).turnOn());
            }
        }
    }

