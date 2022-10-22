CREATE TABLE tanfolyam (
tkod INT,  ar INT, tipus CHAR(30), megnevezesVARCHAR2(100), PRIMARY KEY (tkod));

CREATE TABLE resztvevo (tajszam CHAR(13),  nev CHAR(30), lakcimVARCHAR2(100), PRIMARY KEY (tajszam));

CREATE TABLE befizetes (
diak INT, 
kurzus INT, 
befizetes INT,
FOREIGN KEY (diak) REFERENCES resztvevo, 
FOREIGN KEY (kurzus)REFERENCES (tanfolyam));


