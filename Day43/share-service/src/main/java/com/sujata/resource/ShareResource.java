package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.dto.entity.Share;
import com.sujata.dto.entity.ShareList;
import com.sujata.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;
	
	@GetMapping(path = "/shares",produces = MediaType.APPLICATION_JSON_VALUE)
	public ShareList getAllSharesResource() {
		return new ShareList(shareService.getAllShares());
	}
	
	@GetMapping(path = "/shares/{sId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Share ShareGetShareByIdResource(@PathVariable("sId") String shareId) {
		return shareService.getShareById(shareId);
	}
}
