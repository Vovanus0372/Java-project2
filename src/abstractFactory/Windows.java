package abstractFactory;

    class WindowsButton implements Button {
        public String render() {
            return "Rendered Windows Button";
        }
    }

    class WindowsCheckbox implements Checkbox {
        public String render() {
            return "Rendered Windows Checkbox";
        }
    }

    class WindowsFactory implements GUIFactory {
        public Button createButton() {
            return new WindowsButton();
        }

        public Checkbox createCheckbox() {
            return new WindowsCheckbox();
        }
    }

