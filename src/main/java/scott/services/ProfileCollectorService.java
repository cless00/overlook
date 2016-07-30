package scott.services;

import java.io.IOException;

import scott.entities.Profile;

public interface ProfileCollectorService {
	public Profile getProfileAverage(String battletag) throws IOException;
}
