CREATE TABLE Artikuluak (
    ARTIKULUA VARCHAR(20) NOT NULL,
    HOR_KODEA NUMERIC(3) NOT NULL,
    PISUA NUMERIC(3) NOT NULL,
    KATEGORIA VARCHAR(10) NOT NULL,
    SALMENTA_PREZIOA NUMERIC(4),
    SALMENTA_KOSTUA NUMERIC(4),
    STOCK NUMERIC(5),
    PRIMARY KEY (ARTIKULUA, HOR_KODEA, PISUA, KATEGORIA),
    foreign key (HOR_KODEA) references hornitzaileak(HOR_KODEA),
    check (salmenta_prezioa > 0), 
    check ( salmenta_kostua > 0),
    check (stock > 0),
    check (kategoria = 'Lehen' or 'Bigarren' or 'Hirugarren')
);