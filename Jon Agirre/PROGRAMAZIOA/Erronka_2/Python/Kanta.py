class Kanta:
    def __init__(Kanta,z,a,b,c,d):
        Kanta.izena = a
        Kanta.egilea = b
        Kanta.urtea = c
        Kanta.iraupena = d
        Kanta.zenbakia = z
    
    def getZenbakia():
        return Kanta.zenbakia
    def getIzena(Kanta):
        return Kanta.izena
    
    def MenuanErakutsi(Kanta):
        print(f'{Kanta.zenbakia}. {Kanta.izena} - {Kanta.egilea} ({Kanta.urtea})\n')
    
    def Entzuten(Kanta):
        print(f'\nOrain entzuten: {Kanta.izena} - {Kanta.egilea} ({Kanta.urtea})')