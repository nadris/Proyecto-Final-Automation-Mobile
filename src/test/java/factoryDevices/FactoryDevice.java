package factoryDevices;

public class FactoryDevice {

    public static IDevice make (String typeDevice){
        IDevice device;

        switch (typeDevice.toLowerCase()){
            case "android":
                device = new Android();
                break;
            default:
                device = new Ios();
                break;
        }

        return device;
    }

}