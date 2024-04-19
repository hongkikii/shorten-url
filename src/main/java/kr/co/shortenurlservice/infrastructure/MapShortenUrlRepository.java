package kr.co.shortenurlservice.infrastructure;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kr.co.shortenurlservice.domain.ShortenUrl;
import kr.co.shortenurlservice.domain.ShortenUrlRespository;
import org.springframework.stereotype.Repository;

@Repository
public class MapShortenUrlRepository implements ShortenUrlRespository {

    private Map<String, ShortenUrl> shortenUrls = new ConcurrentHashMap<>();

    @Override
    public void saveShortenUrl(ShortenUrl shortenUrl) {
        shortenUrls.put(shortenUrl.getShortenUrlKey(), shortenUrl);
    }
}
