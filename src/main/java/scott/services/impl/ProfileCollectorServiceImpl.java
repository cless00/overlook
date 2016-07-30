package scott.services.impl;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import scott.entities.Profile;
import scott.services.ProfileCollectorService;

@Service
public class ProfileCollectorServiceImpl implements ProfileCollectorService {

	@Value("${profileUrl}")
	private String profileUrl;

	@Override
	public Profile getProfileAverage(String battletag) throws IOException {
		String url = profileUrl + battletag;
		Document doc = Jsoup.connect(url).get();

		Elements elementList = doc.getElementsByClass("career-stats-section").get(0).firstElementSibling()
				.getElementsByTag("ul").get(0).getElementsByClass("card-heading");

		Profile profile = new Profile(elementList.get(0).text(), elementList.get(1).text(), elementList.get(2).text(),
				elementList.get(3).text(), elementList.get(4).text(), elementList.get(5).text(),
				elementList.get(6).text(), elementList.get(7).text(), url, battletag);

		return profile;
	}

}
