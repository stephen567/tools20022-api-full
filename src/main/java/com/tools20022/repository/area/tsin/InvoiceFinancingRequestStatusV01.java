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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.msg.FinancingInformationAndStatus1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.OriginalRequestInformation1;
import com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The InvoiceFinancingRequestStatus message is sent by the First Agent to the
 * Financing Requestor, alternatively through an Intermediary Agent (relay
 * scenario). It is used to inform the Financing Requestor about the positive or
 * negative status of a financing request or a financing cancellation request.<br>
 * <b>Usage</b><br>
 * The InvoiceFinancingRequestStatus message flows from the First Agent to the
 * Financing Requestor (alternatively through an Intermediary Agent) to provide
 * status information about a request previously sent.<br>
 * Its usage will always be governed by a bilateral agreement between the First
 * Agent and the Financing Requestor.<br>
 * The InvoiceFinancingRequestStatus message can be used two fold:<br>
 * - to provide information about the reception status (eg rejection,
 * acceptance) of a request message. In this case the status message is the
 * result of a technical validation performed by the First Agent on the request
 * message received;<br>
 * - to inform the Financing Requestor about the business status of the
 * financing process initiated. In this case the First Agent can:<br>
 * communicate that a single financing request has been granted, is pending or
 * has not been granted at all;<br>
 * inform that a financing cancellation request has been allowed or denied.<br>
 * Note.<br>
 * If the Financing Requestor requests financing for more than one instalment
 * related to the same invoice, the First Agent can decide to finance only some
 * of the instalments. In such case the status message contains details and
 * status of every single instalment (financed, not financed).<br>
 * The message can be used in a direct or in a relay scenario:<br>
 * - In a direct scenario, the message is sent directly by the First Agent to
 * the Financing Requestor;<br>
 * - In a relay scenario, the message is sent first by the First Agent to the
 * Intermediary Agent, who forwards it to the Financing Requestor.<br>
 * The InvoiceFinancingRequestStatus message refers to the original request(s)
 * by means of references and a set of data elements included into the original
 * request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion
 * InvoiceFinancingRequestISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcFincgReqSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#StatusIdentification
 * InvoiceFinancingRequestStatusV01.StatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#OriginalRequestInformationAndStatus
 * InvoiceFinancingRequestStatusV01.OriginalRequestInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#FinancingInformationAndStatus
 * InvoiceFinancingRequestStatusV01.FinancingInformationAndStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#identifier
 * InvoiceFinancingRequestStatusV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceFinancingRequestStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InvoiceFinancingRequestStatus message is sent by the First Agent to the Financing Requestor, alternatively through an Intermediary Agent (relay scenario). It is used to inform the Financing Requestor about the positive or negative status of a financing request or a financing cancellation request.\r\nUsage\r\nThe InvoiceFinancingRequestStatus message flows from the First Agent to the Financing Requestor (alternatively through an Intermediary Agent) to provide status information about a request previously sent.\r\nIts usage will always be governed by a bilateral agreement between the First Agent and the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message can be used two fold:\r\n- to provide information about the reception status (eg rejection, acceptance) of a request message. In this case the status message is the result of a technical validation performed by the First Agent on the request message received;\r\n- to inform the Financing Requestor about the business status of the financing process initiated. In this case the First Agent can:\r\n* communicate that a single financing request has been granted, is pending or has not been granted at all;\r\n* inform that a financing cancellation request has been allowed or denied.\r\nNote.\r\nIf the Financing Requestor requests financing for more than one instalment related to the same invoice, the First Agent can decide to finance only some of the instalments. In such case the status message contains details and status of every single instalment (financed, not financed).\r\nThe message can be used in a direct or in a relay scenario:\r\n- In a direct scenario, the message is sent directly by the First Agent to the Financing Requestor;\r\n- In a relay scenario, the message is sent first by the First Agent to the Intermediary Agent, who forwards it to the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message refers to the original request(s) by means of references and a set of data elements included into the original request."
 * </li>
 * </ul>
 */
public class InvoiceFinancingRequestStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * General information that unambiguously identify the invoice financing
	 * status report, such as status identification, creation date time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information that unambiguously identify the invoice financing status report, such as status identification, creation date time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock StatusIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIdentification";
			definition = "General information that unambiguously identify the invoice financing status report, such as status identification, creation date time.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	/**
	 * Set of summary information that unambiguously identifies the original
	 * invoice financing (or cancellation) request to which the status is
	 * referred. The status of the original request is also given in this block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlReqInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRequestInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of summary information that unambiguously identifies the original invoice financing (or cancellation) request to which the status is referred. The status of the original request is also given in this block.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock OriginalRequestInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlReqInfAndSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRequestInformationAndStatus";
			definition = "Set of summary information that unambiguously identifies the original invoice financing (or cancellation) request to which the status is referred. The status of the original request is also given in this block.\n";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> OriginalRequestInformation1.mmObject();
		}
	};
	/**
	 * Information concerning the business status of a financing request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1
	 * FinancingInformationAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the business status of a financing request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock FinancingInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "FincgInfAndSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingInformationAndStatus";
			definition = "Information concerning the business status of a financing request.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancingInformationAndStatus1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "tsin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "002"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "tsin";
			messageFunctionality = "002";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingRequestStatusV01";
				definition = "Scope\r\nThe InvoiceFinancingRequestStatus message is sent by the First Agent to the Financing Requestor, alternatively through an Intermediary Agent (relay scenario). It is used to inform the Financing Requestor about the positive or negative status of a financing request or a financing cancellation request.\r\nUsage\r\nThe InvoiceFinancingRequestStatus message flows from the First Agent to the Financing Requestor (alternatively through an Intermediary Agent) to provide status information about a request previously sent.\r\nIts usage will always be governed by a bilateral agreement between the First Agent and the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message can be used two fold:\r\n- to provide information about the reception status (eg rejection, acceptance) of a request message. In this case the status message is the result of a technical validation performed by the First Agent on the request message received;\r\n- to inform the Financing Requestor about the business status of the financing process initiated. In this case the First Agent can:\r\n* communicate that a single financing request has been granted, is pending or has not been granted at all;\r\n* inform that a financing cancellation request has been allowed or denied.\r\nNote.\r\nIf the Financing Requestor requests financing for more than one instalment related to the same invoice, the First Agent can decide to finance only some of the instalments. In such case the status message contains details and status of every single instalment (financed, not financed).\r\nThe message can be used in a direct or in a relay scenario:\r\n- In a direct scenario, the message is sent directly by the First Agent to the Financing Requestor;\r\n- In a relay scenario, the message is sent first by the First Agent to the Intermediary Agent, who forwards it to the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message refers to the original request(s) by means of references and a set of data elements included into the original request.";
				messageSet_lazy = () -> Arrays.asList(InvoiceFinancingRequestISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcFincgReqSts";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.StatusIdentification,
						com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.OriginalRequestInformationAndStatus, com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.FinancingInformationAndStatus);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}