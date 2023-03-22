<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/">
         <table>
            <tr>
                <th>Id</th>
                <th>Izenburua</th>
                <th>Egilea</th>
                <th>Urtea</th>
            </tr>
            <xsl:for-each select="kantak/kanta[urtea &gt;= 1960 and urtea &lt;= 1969]">
                <tr>
                    <td><xsl:value-of select="id"/></td>
                    <td><xsl:value-of select="izenburua"/></td>
                    <td><xsl:value-of select="egilea"/></td>
                    <td><xsl:value-of select="urtea"/></td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>