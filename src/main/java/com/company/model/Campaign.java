package main.java.com.company.model;

public class Campaign {
    private String campaignName;
    private int campaignTime;

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getCampaignTime() {
        return campaignTime;
    }

    public void setCampaignTime(int campaignTime) {
        this.campaignTime = campaignTime;
    }

    public Campaign(String campaignName, int campaignTime) {
        this.campaignName = campaignName;
        this.campaignTime = campaignTime;
    }
}
