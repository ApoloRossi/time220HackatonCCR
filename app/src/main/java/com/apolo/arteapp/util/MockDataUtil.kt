package com.apolo.arteapp.util

import com.apolo.arteapp.data.model.OficinaView

object MockDataUtil {

    fun getOficinasList() =
            listOf(
                    OficinaView(
                      title =  "Grafite - Oficio Cultura",
                      ongName =  "Arte & Vida",
                      description =  "A partir de diálogos com o público da Oficina Cultural e demais interessados neste trabalho, será construído de maneira coletiva um painel artístico. Moradores e comerciários também serão ouvidos em suas sugestões e críticas para o Coletivamente Hip Hop, grupo que irá realizar o grafite ao final. Com o objetivo de trazer alegria e irreverência, este espaço funcionará como vitrine cultural de uma construção realizada através do diálogo.",
                      eventLink =   "https://www.youtube.com/watch?v=i86P1947J7s",
                      artType =   "Grafite",
                      pictures =  listOf("https://static.todamateria.com.br/upload/54/f9/54f9f8efdc4dd-grafite-arte-urbana-large.jpg", "https://static.todamateria.com.br/upload/54/f9/54f9f8efdc4dd-grafite-arte-urbana-large.jpg")
                    ),
                    OficinaView(
                            title = "Cinema ao ar livre",
                            ongName ="Arte & Vida",
                            description = "Durante o mês de janeiro, a parte externa da Oficina Cultural Juan Serrano será “transformada” em uma grande sala de Cinema ao Ar Livre. Como uma alternativa emergente de democratização do acesso à sétima arte, todas as exibições serão realizadas gratuitamente. Com classificação livre, os filmes serão selecionados a partir da licença guarda-chuva e seguirão protocolos rígidos como: público sentado com distanciamento, área aberta, utilização de máscaras e higienização das mãos, entre outros.",
                            eventLink =  "https://www.youtube.com/watch?v=DL5wu-MFJ-o",
                            artType = "Cinema",
                            pictures = listOf("https://oficinasculturais.org.br/wp-content/uploads/2020/12/OCMJS_CINEMA-AO-AR-LIVRE_cr%C3%A9dito-Foto-OCJS_site-e1609279312192.jpg")
                    ),
                    OficinaView(
                            "Selfie sobre tela",
                            "Mais Amor",
                            "Os participantes serão conduzidos em um processo de estudo de suas autoimagens para a criação de autorretratos. Durante o processo, serão propostos exercícios de composição de imagens, exercícios de desenho de observação e noções básicas de proporção para o desenho da figura humana e de pintura com tinta acrílica. Além de apresentar um breve panorama de obras de artistas que trabalham com a produção de autorretratos. Ao final da oficina, será feita uma exposição com os trabalhos dos participantes.",
                            "https://www.youtube.com/watch?v=cZl1H_tPxvU",
                            "Fotografia",
                            listOf("https://oficinasculturais.org.br/wp-content/uploads/2020/12/OCAV_SELFIE-SOBRE-TELA_cr%C3%A9dito-Foto-Divulga%C3%A7%C3%A3o-e1608312167878.jpg")
                    ),
                    OficinaView(
                            "Maternagem",
                            "Mais Amor",
                            "Maternagem é uma exposição da artista Bárbara Milano pensada para ocupar o espaço expositivo e o jardim da O.C. Alfredo Volpi.\n" +
                                    "\n" +
                                    "“Minha pesquisa se desdobra numa relação intrínseca entre vida e obra, propícia ao nosso tempo e indiscutivelmente vital no que se refere a minha trajetória. Trago para Maternagem, uma entrega visceral das minhas relações amorosas mais intensas e íntimas”, conceitua Bárbara.\n" +
                                    "A exposição fica em cartaz no período de 19/1 até 27/2.",
                            "https://www.youtube.com/watch?v=jVHgUc2zQSw",
                            "Cuidados",
                            listOf("https://oficinasculturais.org.br/wp-content/uploads/2020/12/OCAV_Exposi%C3%A7%C3%A3o-Maternagem_Cr%C3%A9dito-Foto-Gabriel-Vieira_-e1608236461264.jpg")
                    ),
                    OficinaView(
                            "Horta vertical e sementeiras",
                            "Mais Amor",
                            "A partir da manutenção dos canteiros já existentes, a horta vertical será incorporada aos espaços da Oficina Cultural Alfredo Volpi e expandida a outros pontos da unidade. Nesses encontros além das hortaliças, e PANC’S (Plantas Alimentícias não Convencionais), será também confeccionado um canteiro de ervas, abordando e ampliando para questões sobre a medicina natural.",
                            "https://www.youtube.com/watch?v=4gWocS4oQrk",
                            "Horticultura",
                            listOf("https://oficinasculturais.org.br/wp-content/uploads/2020/12/OCAV_HORTA-VERTICAL-E-SEMENTEIRAS_cr%C3%A9dito-Foto-Divulga%C3%A7%C3%A3o-e1608314569848.jpg")
                    ),
                    OficinaView(
                            "Vivência de capoeira angola “Vamos Vadiá”",
                            "Mais Amor",
                            "O Núcleo Menos 1 Invisível e o mestre Pedro Peu realizam um treino aberto de Capoeira Angola, com muito ritmo e cantoria numa só ginga. Esta ação gratuita faz parte do projeto “Mergulho” contemplado pelo 28º edital de Fomento à Dança para Cidade de São Paulo e tem o apoio da Oficina Cultural Oswald de Andrade.\n" +
                                    "\n" +
                                    "Observações:\n" +
                                    "\n" +
                                    "Aulas presenciais em espaços abertos da Oficina Cultural Oswald de Andrade.\n" +
                                    "\n" +
                                    "Vagas limitadas respeitando o distanciamento coletivo e as normas sanitárias.\n" +
                                    "\n" +
                                    "É obrigatório o uso de máscara.",
                            "https://oficinasculturais.org.br/atividade/aulas-abertas-vive%cc%82ncia-de-capoeira-angola-vamos-vadia/",
                            "Luta",
                            listOf("https://oficinasculturais.org.br/wp-content/uploads/2021/01/OCOA_VIVE%CC%82NCIA-DE-CAPOEIRA-ANGOLA-VAMOS-VADIA%CC%81_Cr%C3%A9dito-Foto-Divulga%C3%A7%C3%A3o-e1609895399162.jpeg")
                    )
            )

    fun getArtistsList() =
            listOf(
                    OficinaView(
                            title = "Escrevendo poesia",
                            ongName = "Manoel Fonseca",
                            description = "A partir de diálogos com o público da Oficina Cultural e demais interessados neste trabalho, será construído de maneira coletiva um painel artístico. Moradores e comerciários também serão ouvidos em suas sugestões e críticas para o Coletivamente Hip Hop, grupo que irá realizar o grafite ao final. Com o objetivo de trazer alegria e irreverência, este espaço funcionará como vitrine cultural de uma construção realizada através do diálogo.",
                            eventLink = "https://www.youtube.com/watch?v=i86P1947J7s",
                            artType = "Poesia",
                            pictures = listOf("https://www.luso-poemas.net/modules/news/images/big/escrever.jpg"),
                            instagram = "apolorossi"

                    ),
                    OficinaView(
                            "Ilustração de Animes",
                            "Rodrigo Santos",
                            "Durante o mês de janeiro, a parte externa da Oficina Cultural Juan Serrano será “transformada” em uma grande sala de Cinema ao Ar Livre. Como uma alternativa emergente de democratização do acesso à sétima arte, todas as exibições serão realizadas gratuitamente. Com classificação livre, os filmes serão selecionados a partir da licença guarda-chuva e seguirão protocolos rígidos como: público sentado com distanciamento, área aberta, utilização de máscaras e higienização das mãos, entre outros.",
                            "https://www.youtube.com/watch?v=DL5wu-MFJ-o",
                            "Desenho",
                            listOf("https://scontent.fpoo1-1.fna.fbcdn.net/v/t1.0-9/39558031_219956938866048_5525804639842205696_o.jpg?_nc_cat=102&ccb=2&_nc_sid=e3f864&_nc_ohc=xTIc_6wWqccAX_naZ_1&_nc_ht=scontent.fpoo1-1.fna&oh=cd5479c77d8751b8f49afc688535f113&oe=602ABE85"),
                            "apolorossi",
                    "19912345678"
                    ),
                    OficinaView(
                            "Escultura de vidro",
                            "Raissa de Oliveira",
                            "Os participantes serão conduzidos em um processo de estudo de suas autoimagens para a criação de autorretratos. Durante o processo, serão propostos exercícios de composição de imagens, exercícios de desenho de observação e noções básicas de proporção para o desenho da figura humana e de pintura com tinta acrílica. Além de apresentar um breve panorama de obras de artistas que trabalham com a produção de autorretratos. Ao final da oficina, será feita uma exposição com os trabalhos dos participantes.",
                            "https://www.youtube.com/watch?v=cZl1H_tPxvU",
                            "Escultura",
                            listOf("https://i0.wp.com/somentecoisaslegais.com.br/wp-content/uploads/2015/06/Esculturas-de-vidro-formas-marinhas-1.jpg?w=721"),
                            "apolorossi",
                            "19912345678"
                    ),
                    OficinaView(
                            "Escultura de ceramica",
                            "Carolina Bastos",
                            "Maternagem é uma exposição da artista Bárbara Milano pensada para ocupar o espaço expositivo e o jardim da O.C. Alfredo Volpi.\n" +
                                    "\n" +
                                    "“Minha pesquisa se desdobra numa relação intrínseca entre vida e obra, propícia ao nosso tempo e indiscutivelmente vital no que se refere a minha trajetória. Trago para Maternagem, uma entrega visceral das minhas relações amorosas mais intensas e íntimas”, conceitua Bárbara.\n" +
                                    "A exposição fica em cartaz no período de 19/1 até 27/2.",
                            "https://www.youtube.com/watch?v=jVHgUc2zQSw",
                            "Escultura",
                            listOf("https://cdn.shopify.com/s/files/1/0356/0233/3836/products/TATU4-escultura-ceramica-duas-faces-artes-plasticas-decoracao-brasileira-design-tatu-florianopolis-artesintonia-1_1024x1024.jpg?v=1590571452"),
                            "apolorossi",
                            "19912345678"
                    ),
                    OficinaView(
                            "Pintura em guardanapos",
                            "Rose Martins",
                            "A partir da manutenção dos canteiros já existentes, a horta vertical será incorporada aos espaços da Oficina Cultural Alfredo Volpi e expandida a outros pontos da unidade. Nesses encontros além das hortaliças, e PANC’S (Plantas Alimentícias não Convencionais), será também confeccionado um canteiro de ervas, abordando e ampliando para questões sobre a medicina natural.",
                            "https://www.youtube.com/watch?v=4gWocS4oQrk",
                            "Pintura",
                            listOf("https://i.ytimg.com/vi/o33M3IDWCug/hqdefault.jpg"),
                            "apolorossi",
                            "19912345678"

                    ),
                    OficinaView(
                            "Compondo música",
                            "Aline Moraes",
                            "O Núcleo Menos 1 Invisível e o mestre Pedro Peu realizam um treino aberto de Capoeira Angola, com muito ritmo e cantoria numa só ginga. Esta ação gratuita faz parte do projeto “Mergulho” contemplado pelo 28º edital de Fomento à Dança para Cidade de São Paulo e tem o apoio da Oficina Cultural Oswald de Andrade.\n" +
                                    "\n" +
                                    "Observações:\n" +
                                    "\n" +
                                    "Aulas presenciais em espaços abertos da Oficina Cultural Oswald de Andrade.\n" +
                                    "\n" +
                                    "Vagas limitadas respeitando o distanciamento coletivo e as normas sanitárias.\n" +
                                    "\n" +
                                    "É obrigatório o uso de máscara.",
                            "https://oficinasculturais.org.br/atividade/aulas-abertas-vive%cc%82ncia-de-capoeira-angola-vamos-vadia/",
                            "Musica",
                            listOf("https://lh3.googleusercontent.com/proxy/L1r_PR3jkGdgcGmL_jmGedJJwgwwIPrWHndOYClhlWw2fgC11lLhASGJINr2_XU6sqvZ_UwP5LpYoQxxMuY-yMC98_kzgjms3bC9rCRr4V3g-TE4PLiZ_WJjt6NHqGebTZw"),
                            "apolorossi",
                            "19912345678"
                    )
            )

}