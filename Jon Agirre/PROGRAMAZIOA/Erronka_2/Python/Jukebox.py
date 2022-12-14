from Kanta import Kanta
from Erreproduktorea import Erreproduktorea

Kantua1 = Kanta(1,'Ya No Me Muero Por Nadie', 'Antoñito Molina','2022',0)
Kantua2 = Kanta(2,'Abuela Maitea','ETS','2022',0)
Kantua3 = Kanta(3,'Zurekin Batera','ETS','2020',0)
Kantua4 = Kanta(4,'Por la boca vive el pez','Fito & Fitipaldis','2006',0)
Kantua5 = Kanta(5,'Eztanda egin arte','Gatibu','2008',0)
Kantua6 = Kanta(6,'Aitormena','Ertzainak','1989',0)
Kantua7 = Kanta(7,'Rayando el sol','Maná','1990',0)
Kantua8 = Kanta(8,'The Show Must Go On','Queen','1991',0)
Kantua9 = Kanta(9,'Jo Ta Ke','Su Ta Gar','1991',0)
Kantua10 = Kanta(10,'With Or Without You','U2','1987',0)
irteera = 1;

while(irteera == 1):
    print('\n- Menua -\n---------\n')
    Kantua1.MenuanErakutsi()
    Kantua2.MenuanErakutsi()
    Kantua3.MenuanErakutsi()
    Kantua4.MenuanErakutsi()
    Kantua5.MenuanErakutsi()
    Kantua6.MenuanErakutsi()
    Kantua7.MenuanErakutsi()
    Kantua8.MenuanErakutsi()
    Kantua9.MenuanErakutsi()
    Kantua10.MenuanErakutsi()
    
    aukera = input('Aukeratu bat (Itzaltzeko sartu 0): ')
    
    if aukera == '1':
        Kantua1.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua1.getIzena())
    elif aukera == '2':
        Kantua2.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua2.getIzena())
    elif aukera == '3':
        Kantua3.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua3.getIzena())
    elif aukera == '4':
        Kantua4.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua4.getIzena())
    elif aukera == '5':
        Kantua5.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua5.getIzena())
    elif aukera == '6':
        Kantua6.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua6.getIzena())
    elif aukera == '7':
        Kantua7.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua7.getIzena())
    elif aukera == '8':
        Kantua8.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua8.getIzena())
    elif aukera == '9':
        Kantua9.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua9.getIzena())
    elif aukera == '10':
        Kantua10.Entzuten()
        Erreproduktorea.KantuaEntzun(Kantua10.getIzena())
    elif aukera == '0':
        irteera = 0
    else:
        print('\nAukera ez da zuzena, mesedez sartu 1-etik 10-erako zenbaki bat\n\n')
