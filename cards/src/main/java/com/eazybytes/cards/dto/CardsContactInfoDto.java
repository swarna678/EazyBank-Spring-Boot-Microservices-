package com.eazybytes.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
@RefreshScope

public class CardsContactInfoDto{
	private String message;
	private Map<String, String> contactDetails;
	private List<String> onCallSupport;
}