package com.adobe.aem.guides.core.serviceImpl;

import org.osgi.service.component.annotations.Component;
import static com.adobe.aem.guides.core.AppConstents.AppConstants.URL;

import com.adobe.aem.guides.core.Network.Network;
import com.adobe.aem.guides.core.service.ReadJsonService;

/**

 * 
 * Implementation of ReadJsonService
 */
@Component(immediate = true, service = ReadJsonService.class)
public class ReadJsonDataImpl implements ReadJsonService {


	/**
	 * Overridden method which will read the JSON data via an HTTP GET call
	 */
	@Override
	public String getData() {
		
		String response = Network.readJson(URL);
		
		return response;
	}

}
