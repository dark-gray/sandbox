package my.apps.sandbox;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aleksandr Morozov on 31.08.2016.
 */
@Controller
public class DeviceDetectionController {
    @RequestMapping("/detect-device")
    public @ResponseBody String detectDevice(Device device) {
        String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "normal";
        } else if (device.isMobile()) {
            deviceType = "mobile";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }
        return "Your device type is '" + deviceType + "'. Your platfosm is '" + device.getDevicePlatform().name() +"'.";
    }
}
