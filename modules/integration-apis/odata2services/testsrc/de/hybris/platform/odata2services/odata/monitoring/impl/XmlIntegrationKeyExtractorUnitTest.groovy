/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.odata2services.odata.monitoring.impl

import de.hybris.bootstrap.annotations.UnitTest
import de.hybris.platform.odata2services.odata.monitoring.IntegrationKeyExtractionException
import org.apache.commons.lang.StringUtils
import org.apache.olingo.odata2.api.commons.HttpContentType
import org.apache.olingo.odata2.api.commons.HttpStatusCodes
import org.junit.Test
import spock.lang.Specification
import spock.lang.Unroll

@UnitTest
class XmlIntegrationKeyExtractorUnitTest extends Specification {

    private static final BAD_REQUEST = HttpStatusCodes.BAD_REQUEST.getStatusCode()
    private static final CREATED = HttpStatusCodes.CREATED.getStatusCode()
    private static final String INTEGRATION_KEY = "integrationKeyReturnedFromOdataEntry"

    def extractor = new XmlIntegrationKeyExtractor()

    @Test
    @Unroll
    def "test extract from #responseDesc "() {
        expect:
        extractor.extractIntegrationKey(response as String, responseCode) == extractedValue

        where:
        responseDesc                                  | response                                                                    | responseCode | extractedValue
        "response with null body"                     | null                                                                        | CREATED      | StringUtils.EMPTY
        "response with empty body"                    | ''                                                                          | CREATED      | StringUtils.EMPTY
        "error response without inner error"          | errorResponse('')                                                           | BAD_REQUEST  | StringUtils.EMPTY
        "error response with empty integration key"   | errorResponse('<d:innererror></d:innererror>')                              | BAD_REQUEST  | StringUtils.EMPTY
        "error response with integration key"         | errorResponse("<d:innererror>${INTEGRATION_KEY}</d:innererror>\n")          | BAD_REQUEST  | INTEGRATION_KEY
        "success response without integration key"    | entityResponse('')                                                          | CREATED      | StringUtils.EMPTY
        "success response with empty integration key" | entityResponse('<d:integrationKey></d:integrationKey>')                     | CREATED      | StringUtils.EMPTY
        "success response with integration key"       | entityResponse("<d:integrationKey>${INTEGRATION_KEY}</d:integrationKey>\n") | CREATED      | INTEGRATION_KEY
    }

    @Test
    def "exception is thrown when extract from malformed response body"() {
        when:
        extractor.extractIntegrationKey('<not-xml>', BAD_REQUEST)

        then:
        thrown(IntegrationKeyExtractionException)
    }

    @Test
    @Unroll
    def "isApplicable = #isApplicable when response is #responseType"() {
        expect:
        extractor.isApplicable(responseType) == isApplicable

        where:
        responseType                                    | isApplicable
        null                                            | false
        HttpContentType.APPLICATION_JSON                | false
        HttpContentType.APPLICATION_XML_UTF8            | true
        HttpContentType.APPLICATION_XML                 | true
        HttpContentType.APPLICATION_ATOM_XML_UTF8       | true
        HttpContentType.APPLICATION_ATOM_XML            | true
        HttpContentType.APPLICATION_ATOM_XML_ENTRY      | true
        HttpContentType.APPLICATION_ATOM_XML_ENTRY_UTF8 | true
        "application/atom+xml;charset=utf-8;type=entry" | true
    }

    def entityResponse(integrationKeyElement) {
        """<?xml version='1.0' encoding='utf-8'?>
		<entry xmlns="http://www.w3.org/2005/Atom" xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata" xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices" xml:base="https://localhost:9002/odata2webservices/Cereal/">
			<content type="application/xml">
				<m:properties>
				<d:code>trix</d:code>
			    <d:name>Trix</d:name>
				$integrationKeyElement
				</m:properties>
			</content>
		</entry>"""
    }

    def errorResponse(integrationKeyElement) {
        """<?xml version='1.0' encoding='utf-8'?>
		<entry xmlns="http://www.w3.org/2005/Atom" xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata" xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices" xml:base="https://localhost:9002/odataweb/odata2/Cereal/">
			<content type="application/xml">
				<m:error>
					<d:code> errorCode </d:code>
					<d:message> errorMsg </d:message>
					$integrationKeyElement +
				</m:error>
			</content>
		</entry>"""
    }
}