/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcceptorDiagnosticRequest6;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header30;
import com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20162017;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent) , to check the end-to-end communication, to
 * test the availability of this acquirer, or to validate the security
 * environment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20162017
 * CAPEAcceptortoAcquirerMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrDgnstcReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#Header
 * AcceptorDiagnosticRequestV06.Header}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#DiagnosticRequest
 * AcceptorDiagnosticRequestV06.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#SecurityTrailer
 * AcceptorDiagnosticRequestV06.SecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#identifier
 * AcceptorDiagnosticRequestV06.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorDiagnosticRequestV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent) , to check the end-to-end communication, to test the availability of this acquirer, or to validate the security environment."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05
 * AcceptorDiagnosticRequestV05}</li>
 * </ul>
 */
public class AcceptorDiagnosticRequestV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Diagnostic request message management information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header30
	 * Header30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Diagnostic request message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05#Header
	 * AcceptorDiagnosticRequestV05.Header}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Header = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Diagnostic request message management information.";
			previousVersion_lazy = () -> com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05.Header;
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Header30.mmObject();
		}
	};
	/**
	 * Information related to the diagnostic request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticRequest6
	 * AcceptorDiagnosticRequest6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgnstcReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the diagnostic request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05#DiagnosticRequest
	 * AcceptorDiagnosticRequestV05.DiagnosticRequest}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock DiagnosticRequest = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgnstcReq";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			definition = "Information related to the diagnostic request.";
			previousVersion_lazy = () -> com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05.DiagnosticRequest;
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AcceptorDiagnosticRequest6.mmObject();
		}
	};
	/**
	 * Trailer of the message containing a MAC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05#SecurityTrailer
	 * AcceptorDiagnosticRequestV05.SecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			previousVersion_lazy = () -> com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV05.SecurityTrailer;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "06"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "caaa"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "013"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "caaa";
			messageFunctionality = "013";
			version = "06";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorDiagnosticRequestV06";
				definition = "The AcceptorDiagnosticRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent) , to check the end-to-end communication, to test the availability of this acquirer, or to validate the security environment.";
				previousVersion_lazy = () -> AcceptorDiagnosticRequestV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(CAPEAcceptortoAcquirerMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrDgnstcReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06.Header, com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06.DiagnosticRequest,
						com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06.SecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}