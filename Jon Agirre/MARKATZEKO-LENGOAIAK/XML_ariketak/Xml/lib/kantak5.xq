<html>
<head>
<title>50 urte edo gehiago dituzten kantak</title>
</head>
<body>
<h1>50 urte edo gehiago dituzten kantak</h1>
<ul>
{
    for $kanta in doc("file:///C:\Users\Lea Artibai\Desktop\DAW22_Klase_artxiboak\
    Jon Agirre\MARKATZEKO-LENGOAIAK\XML_ariketak\Xml\lib\kantak.xml")/kantak/kanta
    let $urteak := year-from-date(current-date()) - $kanta/urtea
    order by $kanta/izenburua
    where $urteak >= 50
    return <li>{data($kanta/izenburua)} ({data($kanta/urtea)})</li>
}
</ul>
</body>
</html>