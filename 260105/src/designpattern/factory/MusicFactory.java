package designpattern.factory;

import designpattern.factory.music.Hoshinogen;
import designpattern.factory.music.OfficalHigeDandism;
import designpattern.factory.music.YonezuKenshi;
import designpattern.factory.music.Yorushika;

public class MusicFactory {
	public static Singer getName(String name) {
		if("Hoshinogen".equalsIgnoreCase(name)) {
			return new Hoshinogen();
		}
		if("OfficialHigeDandism".equalsIgnoreCase(name)) {
			return new OfficalHigeDandism();
		}
		if("YonezuKenshi".equalsIgnoreCase(name)) {
			return new YonezuKenshi();
		}
		if("Yorushika".equalsIgnoreCase(name)) {
			return new Yorushika();
		}
		return null;
	}
}
