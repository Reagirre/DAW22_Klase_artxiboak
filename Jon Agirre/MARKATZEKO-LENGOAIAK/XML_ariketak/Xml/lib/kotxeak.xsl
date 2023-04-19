<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/">
         <table>
            <tr>
                <th>Kodea</th>
                <th>Fabrikatzailea</th>
                <th>Modeloa</th>
                <th>Kolorea</th>
                <th>Prezioa</th>
                <th>Deskontua</th>
            </tr>
            <xsl:for-each select="kotxeak/kotxea">
            <xsl:sort select="egilea"/>
                <tr>
                    <td><xsl:value-of select="@kodea"/></td>
                    <td><xsl:value-of select="fabrikatzailea"/></td>
                    <td><xsl:value-of select="modeloa"/></td>
                    <td><xsl:value-of select="kolorea"/></td>
                    <td><xsl:value-of select="prezioa"/></td>
                    <td><xsl:value-of select="deskontua"/></td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>