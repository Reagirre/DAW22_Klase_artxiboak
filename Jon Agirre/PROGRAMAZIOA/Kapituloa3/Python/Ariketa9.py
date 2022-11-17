u = input("Sartu urtea: ")

posi4 = u % 4;
posi100 = u % 100;
posi400 = u % 400;

if(posi4 > 0.0 and posi100 == 0.0):
    print(f"{u} bisurtea da")
else:
    print(f"{u} ez da bisurtea")