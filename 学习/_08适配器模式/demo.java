package _08适配器模式;

public class demo {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        ElectricMotor electricMotor = new ElectricMotor();
        Motor motor = new ElectricAdapter(electricMotor);
        motor.drive();
    }
}

//发动机接口
interface Motor {
    void drive();
}

//电力发动机
class ElectricMotor {
    void electricDrive() {
        System.out.println("电能发动机  发电啦");
    }
}

//光能发动机
class OpticalMotor {
    void opticalDrive() {
        System.out.println("光能发动机  发电啦");
    }
}

class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void drive() {

        electricMotor.electricDrive();
    }
}

class OpticalAdapter implements Motor {
    private OpticalMotor opticalMotor;

    public OpticalAdapter(OpticalMotor opticalMotor) {
        this.opticalMotor = opticalMotor;
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}