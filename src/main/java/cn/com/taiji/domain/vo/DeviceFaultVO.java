package cn.com.taiji.domain.vo;

import cn.com.taiji.domain.DeviceFault;

public class DeviceFaultVO extends DeviceFault {
	
	private String deviceName;
	
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
}