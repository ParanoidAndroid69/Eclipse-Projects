package webpackages;

import webpackages.sei.src.net.webservicex.GeoIP;
import webpackages.sei.src.net.webservicex.GeoIPService;
import webpackages.sei.src.net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if (args.length !=1) { 
			System.out.println("you need to insert only one IP address");
		}
		else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap GeoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIp = GeoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryName());
		}
	}

}
