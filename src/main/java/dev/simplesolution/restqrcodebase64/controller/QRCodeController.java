package dev.simplesolution.restqrcodebase64.controller;

import dev.simplesolution.restqrcodebase64.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRCodeController {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    @Autowired
    private QRCodeService qrCodeService;

    @GetMapping("/generate-qr-code-base64")
    public ResponseEntity<String> generateQRCodeBase64() {
        String contentToGenerateQrCode = "Simple Solution";
        String qrCodeBase64 = qrCodeService.generateQRCodeBase64(contentToGenerateQrCode, WIDTH, HEIGHT);
        return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body(qrCodeBase64);
    }
}