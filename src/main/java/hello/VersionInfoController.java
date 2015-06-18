package hello;

import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionInfoController {

	private VersionInfo versionInfo;

	@RequestMapping(value = "/versionInfo", method = RequestMethod.GET)
	public VersionInfo getGitRepositoryState() throws IOException {
		if (versionInfo == null) {
			Properties gitProperties = new Properties();
			gitProperties.load(getClass().getClassLoader().getResourceAsStream(
					"git.properties"));

			
		
			
		
			
			Properties buildProperties = new Properties();
			buildProperties.load(getClass().getClassLoader().getResourceAsStream(
					"buildVersion.properties"));

			buildProperties.putAll(gitProperties);
			versionInfo = new VersionInfo(buildProperties);
			
		}
		return versionInfo;
	}

}
