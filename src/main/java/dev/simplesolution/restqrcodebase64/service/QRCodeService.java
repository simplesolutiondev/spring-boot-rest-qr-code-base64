package dev.simplesolution.restqrcodebase64.service;

public interface QRCodeService {
    String generateQRCodeBase64(String qrCodeContent, int width, int height);
}
