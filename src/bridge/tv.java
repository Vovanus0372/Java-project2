package bridge;

    class TV implements Device {
        private boolean isOn;

        public String turnOn() {
            isOn = true;
            return "TV is ON";
        }

        public String turnOff() {
            isOn = false;
            return "TV is OFF";
        }
    }
    class TVRemoteControl extends RemoteControl {

        public TVRemoteControl(Device device) {
            super(device);
        }

        @Override
        public void togglePower() {
            if (device instanceof TV) {
                System.out.println(((TV) device).turnOn());
            }
        }
    }

