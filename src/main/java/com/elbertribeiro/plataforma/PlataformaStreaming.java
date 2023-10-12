package com.elbertribeiro.plataforma;

public enum PlataformaStreaming {
    INITIAL(0, "Initial", ""),
    NETFLIX(1, "Netflix", "https://i.postimg.cc/k5BxWq1f/netflix-logo.png"),
    DISNEY_PLUS(2, "Disney Plus", "https://i.postimg.cc/ZRH8tHqD/disneyplus-logo.jpg"),
    HBO_MAX(3, "Hbo Max", "https://i.postimg.cc/ZRH8tHqD/disneyplus-logo.jpg"),
    PRIMEVIDEO(4, "Prime Video", "https://i.postimg.cc/Bbw2tvHT/primevideo-logo.png"),
    APPLE_TV(5, "Apple TV", "https://i.postimg.cc/BQ494cCc/appletv-logo.jpg"),
    ARGO(6, "Argo", "https://i.postimg.cc/jdcV5wgV/argo-logo.png"),
    DISCOVERY_PLUS(7, "Discovery PLus", "https://i.postimg.cc/59wdhk82/discoveryplus-logo.jpg"),
    ITAU_CULTURA(8, "Itaú Cultura", "https://i.postimg.cc/vZZJ6Yk4/itauculturaplay-logo.jpg"),
    CRUNCHYROLL(9, "Crunhyroll", "https://i.postimg.cc/1ts2syGR/crunchyroll-logo.jpg"),
    FACEBOOK_GAMING(10, "Facebook Gaming", "https://i.postimg.cc/mg10SXZ4/facebookgaming-logo.jpg"),
    FUNIMATION(11, "Funimation", "https://i.postimg.cc/dVCxChnt/funimation-logo.png"),
    GLOBO_PLAY(12, "Globo Play", "https://i.postimg.cc/MG8rmzr0/globoplay-logo.png"),
    LIONSGATE(13, "Lionsgate", "https://i.postimg.cc/BZhkf9Xs/lionsgateplus-logo.jpg"),
    LOOKE(14, "Looke", "https://i.postimg.cc/wT7P6fmN/looke-lgo.jpg"),
    MUBI(15, "Mubi", "https://i.postimg.cc/sDqL1YYN/mubi-logo.png"),
    PARAMOUNT_PLUS(16, "Paramount Plus", "https://i.postimg.cc/5ytrQpKZ/paramountplus-logo.png"),
    PLUTO_TV(17, "Pluto TV", "https://i.postimg.cc/L50btfrh/plutotv-logo.png"),
    STARPLUS(18, "Star PLus", "https://i.postimg.cc/HLQRqr7P/starplus-logo.png"),
    TAMANDUA_TV(19, "Tamanduá TV", "https://i.postimg.cc/kXGr2MkB/tamanduatv-logo.jpg"),
    TWITCH(20, "Twitch", "https://i.postimg.cc/kXGr2MkB/tamanduatv-logo.jpg"),
    XBOX_GAMING_PASS(21, "Xbox Gaming Pass", "https://i.postimg.cc/PrRgYsjK/xboxgamingpass-logo.png"),
    YOUTUBE(22, "YouTube", "https://i.postimg.cc/PqG0VWNw/youtubepremium-logo.png");

    private final Integer id;
    private final String nome;
    private final String logo;

    PlataformaStreaming(Integer id, String nome, String logo) {
        this.id = id;
        this.nome = nome;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public String getLogo() {
        return logo;
    }

    public Integer getId() {
        return id;
    }
}
