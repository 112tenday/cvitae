function redirectToWhatsApp(whatsappNumber) {
    var whatsappLink = 'https://wa.me/' + whatsappNumber;
    window.open(whatsappLink, '_blank');
}