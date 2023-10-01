package BrightnessControl;

import java.io.IOException;

public class BrightnessDemo {

	public static void setBrightness(int brightness) throws IOException
	{
		String s=String.format("$brightness = %d;", brightness)
				+"$delay = 0;"
				+"$myMonitor = Get-wmiObject -Namespace root\\wmi -Class WmiMonitorBrightnessMethods;"
                +"$myMonitor.wmisetbrightness($delay , $brightness)";
		String Command="powershell.exe " + s;
		Process powershellProcess=Runtime.getRuntime().exec(Command);
		powershellProcess.getOutputStream().close();
	}
	
	public static void main(String[] args) throws IOException {
		BrightnessDemo br=new BrightnessDemo();
		br.setBrightness(30);
	}
}
