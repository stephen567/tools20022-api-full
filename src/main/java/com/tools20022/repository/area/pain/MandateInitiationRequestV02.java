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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.PaymentsInitiationArchive;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.Mandate2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The MandateInitiationRequest message is sent by the initiator of the request
 * to his agent. The initiator can either be the debtor or the creditor.<br>
 * The MandateInitiationRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty.<br>
 * The MandateInitiationRequest message is used to set-up the instruction that
 * allows the debtor agent to accept instructions from the creditor, through the
 * creditor agent, to debit the account of the debtor.<br>
 * <b>Usage</b><br>
 * The MandateInitiationRequest message can contain only one request to set-up
 * one specific mandate.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor or debtor.<br>
 * The MandateInitiationRequest message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MndtInitnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV02#GroupHeader
 * MandateInitiationRequestV02.GroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV02#Mandate
 * MandateInitiationRequestV02.Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV02#SupplementaryData
 * MandateInitiationRequestV02.SupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV02#identifier
 * MandateInitiationRequestV02.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateInitiationRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nThe MandateInitiationRequest message is used to set-up the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.\r\nUsage\r\nThe MandateInitiationRequest message can contain only one request to set-up one specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateInitiationRequest message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV03
 * MandateInitiationRequestV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.MandateInitiationRequestV01
 * MandateInitiationRequestV01}</li>
 * </ul>
 */
public class MandateInitiationRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the mandate initiation, but which are not part of the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader47
	 * GroupHeader47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics to identify the message and parties playing a role in the mandate initiation, but which are not part of the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock GroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate initiation, but which are not part of the mandate.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}
	};
	/**
	 * Set of elements used to provide the details of the mandate signed between
	 * the (ultimate) creditor and the (ultimate) debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Mandate2
	 * Mandate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the details of the mandate signed between the (ultimate) creditor and the (ultimate) debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Mandate = new MMMessageBuildingBlock() {
		{
			xmlTag = "Mndt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Set of elements used to provide the details of the mandate signed between the (ultimate) creditor and the (ultimate) debtor.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> Mandate2.mmObject();
		}
	};
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock SupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "pain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "pain";
			messageFunctionality = "009";
			version = "02";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MandateInitiationRequestV02";
				definition = "Scope\r\nThe MandateInitiationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateInitiationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nThe MandateInitiationRequest message is used to set-up the instruction that allows the debtor agent to accept instructions from the creditor, through the creditor agent, to debit the account of the debtor.\r\nUsage\r\nThe MandateInitiationRequest message can contain only one request to set-up one specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateInitiationRequest message can be used in domestic and cross-border scenarios.";
				previousVersion_lazy = () -> MandateInitiationRequestV01.mmObject();
				nextVersions_lazy = () -> Arrays.asList(MandateInitiationRequestV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MndtInitnReq";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateInitiationRequestV02.GroupHeader, com.tools20022.repository.area.pain.MandateInitiationRequestV02.Mandate,
						com.tools20022.repository.area.pain.MandateInitiationRequestV02.SupplementaryData);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.pain.MandateInitiationRequestV02.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}