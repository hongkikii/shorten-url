package kr.co.shortenurlservice.domain;

import org.springframework.stereotype.Service;

@Service
public interface ShortenUrlRespository {
    void saveShortenUrl(ShortenUrl shortenUrl);
    ShortenUrl findShortenUrlByShortenUrlKey(String shortenUrlKey);
}
