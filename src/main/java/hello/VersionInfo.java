package hello;

import java.util.Properties;

public class VersionInfo {

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDirty() {
		return dirty;
	}

	public void setDirty(String dirty) {
		this.dirty = dirty;
	}

	public String getRemoteOriginUrl() {
		return remoteOriginUrl;
	}

	public void setRemoteOriginUrl(String remoteOriginUrl) {
		this.remoteOriginUrl = remoteOriginUrl;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public String getCommitIdAbbrev() {
		return commitIdAbbrev;
	}

	public void setCommitIdAbbrev(String commitIdAbbrev) {
		this.commitIdAbbrev = commitIdAbbrev;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getDescribeShort() {
		return describeShort;
	}

	public void setDescribeShort(String describeShort) {
		this.describeShort = describeShort;
	}

	public String getCommitUserName() {
		return commitUserName;
	}

	public void setCommitUserName(String commitUserName) {
		this.commitUserName = commitUserName;
	}

	public String getCommitUserEmail() {
		return commitUserEmail;
	}

	public void setCommitUserEmail(String commitUserEmail) {
		this.commitUserEmail = commitUserEmail;
	}

	public String getCommitMessageFull() {
		return commitMessageFull;
	}

	public void setCommitMessageFull(String commitMessageFull) {
		this.commitMessageFull = commitMessageFull;
	}

	public String getCommitMessageShort() {
		return commitMessageShort;
	}

	public void setCommitMessageShort(String commitMessageShort) {
		this.commitMessageShort = commitMessageShort;
	}

	public String getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}

	public String getClosestTagName() {
		return closestTagName;
	}

	public void setClosestTagName(String closestTagName) {
		this.closestTagName = closestTagName;
	}

	public String getClosestTagCommitCount() {
		return closestTagCommitCount;
	}

	public void setClosestTagCommitCount(String closestTagCommitCount) {
		this.closestTagCommitCount = closestTagCommitCount;
	}

	public String getBuildUserName() {
		return buildUserName;
	}

	public void setBuildUserName(String buildUserName) {
		this.buildUserName = buildUserName;
	}

	public String getBuildUserEmail() {
		return buildUserEmail;
	}

	public void setBuildUserEmail(String buildUserEmail) {
		this.buildUserEmail = buildUserEmail;
	}

	public String getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}

	public String getBuildHost() {
		return buildHost;
	}

	public void setBuildHost(String buildHost) {
		this.buildHost = buildHost;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	private String tags;
	private String branch;
	private String dirty;
	private String remoteOriginUrl;
	private String commitId;
	private String commitIdAbbrev;
	private String describe;
	private String describeShort;
	private String commitUserName;
	private String commitUserEmail;
	private String commitMessageFull;
	private String commitMessageShort;
	private String commitTime;
	private String closestTagName;
	private String closestTagCommitCount;
	private String buildUserName;
	private String buildUserEmail;
	private String buildTime;
	private String buildHost;
	private String buildVersion;
	public String getBuildNumber() {
		return jenkinsBuildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.jenkinsBuildNumber = buildNumber;
	}

	public String getBuildTimeStamp() {
		return jenkinsBuildTimeStamp;
	}

	public void setBuildTimeStamp(String buildTimeStamp) {
		this.jenkinsBuildTimeStamp = buildTimeStamp;
	}

	private String jenkinsBuildNumber;
	private String jenkinsBuildTimeStamp;
    
	public VersionInfo(Properties properties)
	{
	  this.tags = properties.get("git.tags") + "";
	  this.branch = properties.get("git.branch")+ "";
	  this.dirty = properties.get("git.dirty")+ "";
	  this.remoteOriginUrl = properties.get("git.remote.origin.url")+ "";

	  this.commitId = properties.get("git.commit.id")+ "";
	  this.commitIdAbbrev = properties.get("git.commit.id.abbrev")+ "";
	  this.describe = properties.get("git.commit.id.describe")+ "";
	  this.describeShort = properties.get("git.commit.id.describe-short")+ "";
	  this.commitUserName = properties.get("git.commit.user.name")+ "";
	  this.commitUserEmail = properties.get("git.commit.user.email")+ "";
	  this.commitMessageFull = properties.get("git.commit.message.full")+ "";
	  this.commitMessageShort = properties.get("git.commit.message.short")+ "";
	  this.commitTime = properties.get("git.commit.time")+ "";
	  this.closestTagName = properties.get("git.closest.tag.name")+ "";
	  this.closestTagCommitCount = properties.get("git.closest.tag.commit.count")+ "";

	  this.buildUserName = properties.get("git.build.user.name")+ "";
	  this.buildUserEmail = properties.get("git.build.user.email")+ "";
	  this.buildTime = properties.get("git.build.time")+ "";
	  this.buildHost = properties.get("git.build.host")+ "";
	  this.buildVersion = properties.get("git.build.version")+ "";
	  
	  this.jenkinsBuildNumber = properties.get("jenkins.build.number")+ "";
	  this.jenkinsBuildTimeStamp = properties.get("jenkins.build.time")+ "";
	  
	}
	
	
}
