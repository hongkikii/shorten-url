package kr.co.shortenurlservice.presentation;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortenUrlRestController {
    // 생성
    @PostMapping( "/shortenUrl")
    public ResponseEntity<ShortenUrlCreateResponseDto> createShortenUrl(
            @Valid @RequestBody ShortenUrlCreateRequestDto shortenUrlCreateRequestDto
    ) {
        return ResponseEntity.ok().body(null);
    }
    // 리다이렉트
    @GetMapping("/{shortenUrlKey}")
    public ResponseEntity<?> redirectShortenUrl() {
        return ResponseEntity.ok().body(null);
    }

    // 정보 조회
    @GetMapping("/shortenUrl/{shortenUrlkey}")
    public ResponseEntity<?> getShortenUrlInformation() {
        return ResponseEntity.ok().body(null);
    }
}
