package scott.entities;

public class Profile {
	private final String averageEliminations;
	private final String averageDamegeDone;
	private final String averageDeaths;
	private final String averageFinalBlows;
	private final String averageHealingDone;
	private final String averageObjectiveKills;
	private final String averageObjectiveTime;
	private final String averageSoloKills;
	private final String url;
	private final String battletag;

	public Profile(String averageEliminations, String averageDamegeDone, String averageDeaths, String averageFinalBlows,
			String averageHealingDone, String averageObjectiveKills, String averageObjectiveTime,
			String averageSoloKills, String url, String battletag) {
		super();
		this.averageEliminations = averageEliminations;
		this.averageDamegeDone = averageDamegeDone;
		this.averageDeaths = averageDeaths;
		this.averageFinalBlows = averageFinalBlows;
		this.averageHealingDone = averageHealingDone;
		this.averageObjectiveKills = averageObjectiveKills;
		this.averageObjectiveTime = averageObjectiveTime;
		this.averageSoloKills = averageSoloKills;
		this.url = url;
		this.battletag = battletag;
	}

	public String getAverageEliminations() {
		return averageEliminations;
	}

	public String getAverageDamegeDone() {
		return averageDamegeDone;
	}

	public String getAverageDeaths() {
		return averageDeaths;
	}

	public String getAverageFinalBlows() {
		return averageFinalBlows;
	}

	public String getAverageHealingDone() {
		return averageHealingDone;
	}

	public String getAverageObjectiveKills() {
		return averageObjectiveKills;
	}

	public String getAverageObjectiveTime() {
		return averageObjectiveTime;
	}

	public String getAverageSoloKills() {
		return averageSoloKills;
	}

	public String getUrl() {
		return url;
	}

	public String getBattletag() {
		return battletag;
	}

}
