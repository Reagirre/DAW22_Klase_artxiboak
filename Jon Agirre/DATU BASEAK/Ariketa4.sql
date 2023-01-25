use oracleariketa2;

CREATE TABLE Ikastaro (
    lan_zk NUMERIC(4),
    ikastaro_zk NUMERIC(4) PRIMARY KEY,
    ikastaro_izena VARCHAR(20),
    hasi DATE,
    bukatu DATE,
    orduak NUMERIC(4),
    kostua NUMERIC(5),
    FOREIGN KEY (lan_zk)
        REFERENCES langile (lan_zk)
        ON DELETE CASCADE
);