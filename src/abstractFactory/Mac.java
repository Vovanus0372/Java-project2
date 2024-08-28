package abstractFactory;

    class MacOSButton implements Button {
        public String render() {
            return "Rendered MacOS Button";
        }
    }

    class MacOSCheckbox implements Checkbox {
        public String render() {
            return "Rendered MacOS Checkbox";
        }
    }

    class MacOSFactory implements GUIFactory {
        public Button createButton() {
            return new MacOSButton();
        }

        public Checkbox createCheckbox() {
            return new MacOSCheckbox();
        }
    }

