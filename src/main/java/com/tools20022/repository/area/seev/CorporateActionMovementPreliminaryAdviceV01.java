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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.AccountIdentification7Choice;
import com.tools20022.repository.choice.PartyIdentification10Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionMovementPreliminaryAdvice
 * message to an account owner or its designated agent to pre-advise upcoming
 * posting or reversal of securities and/or cash postings.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate). ISO 15022 - 20022 COEXISTENCE
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards
 * will coexist for a certain number of years. Until this coexistence period
 * ends, the usage of certain data types is restricted to ensure
 * interoperability between ISO 15022 and 20022 users. Compliance to these rules
 * is mandatory in a coexistence environment. The coexistence restrictions are
 * described in a Textual Rule linked to the Message Items they concern. These
 * coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.035.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmPreviousMovementPreliminaryAdviceIdentification
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmPreviousMovementPreliminaryAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmNotificationIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMovementConfirmationIdentification
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmMovementConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmInstructionIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmOtherDocumentIdentification
 * CorporateActionMovementPreliminaryAdviceV01.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmEventsLinkage
 * CorporateActionMovementPreliminaryAdviceV01.mmEventsLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmReversalReason
 * CorporateActionMovementPreliminaryAdviceV01.mmReversalReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmCorporateActionGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmAccountDetails
 * CorporateActionMovementPreliminaryAdviceV01.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmCorporateActionMovementDetails
 * CorporateActionMovementPreliminaryAdviceV01.mmCorporateActionMovementDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmAdditionalInformation
 * CorporateActionMovementPreliminaryAdviceV01.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMessageOriginator
 * CorporateActionMovementPreliminaryAdviceV01.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMessageRecipient
 * CorporateActionMovementPreliminaryAdviceV01.mmMessageRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmIssuerAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmPayingAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmSubPayingAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmSubPayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmRegistrar
 * CorporateActionMovementPreliminaryAdviceV01.mmRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmResellingAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmResellingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmPhysicalSecuritiesAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmPhysicalSecuritiesAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmDropAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmDropAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmSolicitationAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmSolicitationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmInformationAgent
 * CorporateActionMovementPreliminaryAdviceV01.mmInformationAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmExtension
 * CorporateActionMovementPreliminaryAdviceV01.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnMvmntPrlimryAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionMovementPreliminaryAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 COEXISTENCE\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule#for_seev_CorporateActionMovementPreliminaryAdviceV01
 * ConstraintSafekeepingAccount1Rule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule#for_seev_CorporateActionMovementPreliminaryAdviceV01
 * ConstraintSafekeepingAccount2Rule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherEventRule#for_seev_CorporateActionMovementPreliminaryAdviceV01
 * ConstraintOtherEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV01
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistributionRule#for_seev_CorporateActionMovementPreliminaryAdviceV01
 * ConstraintIntermediateSecuritiesDistributionRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_seev_CorporateActionMovementPreliminaryAdviceV01
 * ConstraintCoexistenceCharacterSetXRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_seev_CorporateActionMovementPreliminaryAdviceV01
 * ConstraintCoexistenceIdentificationRule.
 * for_seev_CorporateActionMovementPreliminaryAdviceV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02
 * CorporateActionMovementPreliminaryAdviceV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionMovementPreliminaryAdviceV01", propOrder = {"identification", "movementPreliminaryAdviceGeneralInformation", "previousMovementPreliminaryAdviceIdentification", "notificationIdentification",
		"movementConfirmationIdentification", "instructionIdentification", "otherDocumentIdentification", "eventsLinkage", "reversalReason", "corporateActionGeneralInformation", "accountDetails", "corporateActionMovementDetails",
		"additionalInformation", "messageOriginator", "messageRecipient", "issuerAgent", "payingAgent", "subPayingAgent", "registrar", "resellingAgent", "physicalSecuritiesAgent", "dropAgent", "solicitationAgent", "informationAgent",
		"extension"})
public class CorporateActionMovementPreliminaryAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification11 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification11
	 * DocumentIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies a CorporateActionMovementPreliminaryAdvice message as know by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::SEME</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, DocumentIdentification11> mmIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, DocumentIdentification11>() {
		{
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::SEME"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies a CorporateActionMovementPreliminaryAdvice message as know by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification11.mmObject();
		}

		@Override
		public DocumentIdentification11 getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, DocumentIdentification11 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "MvmntPrlimryAdvcGnlInf", required = true)
	protected CorporateActionPreliminaryAdviceType1 movementPreliminaryAdviceGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1
	 * CorporateActionPreliminaryAdviceType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntPrlimryAdvcGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementPreliminaryAdviceGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the movement preliminary advice document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, CorporateActionPreliminaryAdviceType1> mmMovementPreliminaryAdviceGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, CorporateActionPreliminaryAdviceType1>() {
		{
			xmlTag = "MvmntPrlimryAdvcGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementPreliminaryAdviceGeneralInformation";
			definition = "General information about the movement preliminary advice document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionPreliminaryAdviceType1.mmObject();
		}

		@Override
		public CorporateActionPreliminaryAdviceType1 getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getMovementPreliminaryAdviceGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, CorporateActionPreliminaryAdviceType1 value) {
			obj.setMovementPreliminaryAdviceGeneralInformation(value);
		}
	};
	@XmlElement(name = "PrvsMvmntPrlimryAdvcId")
	protected DocumentIdentification15 previousMovementPreliminaryAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsMvmntPrlimryAdvcId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousMovementPreliminaryAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement preliminary advice document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification15>> mmPreviousMovementPreliminaryAdviceIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "PrvsMvmntPrlimryAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousMovementPreliminaryAdviceIdentification";
			definition = "Identification of a previously sent movement preliminary advice document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getPreviousMovementPreliminaryAdviceIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<DocumentIdentification15> value) {
			obj.setPreviousMovementPreliminaryAdviceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnId")
	protected DocumentIdentification15 notificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent notification document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification15>> mmNotificationIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "NtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationIdentification";
			definition = "Identification of a previously sent notification document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getNotificationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<DocumentIdentification15> value) {
			obj.setNotificationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MvmntConfId")
	protected DocumentIdentification15 movementConfirmationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification15
	 * DocumentIdentification15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntConfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a previously sent movement confirmation document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification15>> mmMovementConfirmationIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification15>>() {
		{
			xmlTag = "MvmntConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementConfirmationIdentification";
			definition = "Identification of a previously sent movement confirmation document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification15.mmObject();
		}

		@Override
		public Optional<DocumentIdentification15> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getMovementConfirmationIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<DocumentIdentification15> value) {
			obj.setMovementConfirmationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrId")
	protected DocumentIdentification9 instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification9>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<DocumentIdentification9> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification13> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification13
	 * DocumentIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<DocumentIdentification13>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<DocumentIdentification13>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification13.mmObject();
		}

		@Override
		public List<DocumentIdentification13> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<DocumentIdentification13> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "EvtsLkg")
	protected List<CorporateActionEventReference1> eventsLinkage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
	 * CorporateActionEventReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtsLkg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventsLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<CorporateActionEventReference1>> mmEventsLinkage = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<CorporateActionEventReference1>>() {
		{
			xmlTag = "EvtsLkg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventsLinkage";
			definition = "Identification of an other corporate action event that needs to be closely linked to the processing of the event notified in this document.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventReference1.mmObject();
		}

		@Override
		public List<CorporateActionEventReference1> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getEventsLinkage();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<CorporateActionEventReference1> value) {
			obj.setEventsLinkage(value);
		}
	};
	@XmlElement(name = "RvslRsn")
	protected CorporateActionReversalReason1 reversalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionReversalReason1
	 * CorporateActionReversalReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<CorporateActionReversalReason1>> mmReversalReason = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<CorporateActionReversalReason1>>() {
		{
			xmlTag = "RvslRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReason";
			definition = "Reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionReversalReason1.mmObject();
		}

		@Override
		public Optional<CorporateActionReversalReason1> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getReversalReason();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<CorporateActionReversalReason1> value) {
			obj.setReversalReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation3 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3
	 * CorporateActionGeneralInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, CorporateActionGeneralInformation3> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, CorporateActionGeneralInformation3>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation3.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation3 getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, CorporateActionGeneralInformation3 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected AccountIdentification7Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification7Choice
	 * AccountIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account, owner and account balance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, AccountIdentification7Choice> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, AccountIdentification7Choice>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account, owner and account balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentification7Choice.mmObject();
		}

		@Override
		public AccountIdentification7Choice getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, AccountIdentification7Choice value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "CorpActnMvmntDtls")
	protected List<CorporateActionOption10> corporateActionMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10
	 * CorporateActionOption10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnMvmntDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<CorporateActionOption10>> mmCorporateActionMovementDetails = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<CorporateActionOption10>>() {
		{
			xmlTag = "CorpActnMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionMovementDetails";
			definition = "Information about the corporate action option.";
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption10.mmObject();
		}

		@Override
		public List<CorporateActionOption10> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getCorporateActionMovementDetails();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<CorporateActionOption10> value) {
			obj.setCorporateActionMovementDetails(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative6 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6
	 * CorporateActionNarrative6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E:ADTX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<CorporateActionNarrative6>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<CorporateActionNarrative6>>() {
		{
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E:ADTX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative6.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative6> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<CorporateActionNarrative6> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected PartyIdentification10Choice messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::MEOR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>> mmMessageOriginator = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgOrgtr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::MEOR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgRcpt")
	protected PartyIdentification10Choice messageRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::MERE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>> mmMessageRecipient = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "MsgRcpt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::MERE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getMessageRecipient();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setMessageRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<PartyIdentification10Choice> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ISAG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>> mmIssuerAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>>() {
		{
			xmlTag = "IssrAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ISAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Party appointed to administer the event on behalf of the issuer company/offeror. The party may be contacted for more information about the event.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public List<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<PartyIdentification10Choice> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "PngAgt")
	protected List<PartyIdentification10Choice> payingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::PAYA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>> mmPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>>() {
		{
			xmlTag = "PngAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::PAYA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			definition = "Agent (principal or fiscal paying agent) appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public List<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<PartyIdentification10Choice> value) {
			obj.setPayingAgent(value);
		}
	};
	@XmlElement(name = "SubPngAgt")
	protected List<PartyIdentification10Choice> subPayingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubPngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubPayingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::CODO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>> mmSubPayingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>>() {
		{
			xmlTag = "SubPngAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::CODO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubPayingAgent";
			definition = "Sub-agent appointed to execute the payment for the corporate action event on behalf of the issuer company/offeror.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public List<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getSubPayingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<PartyIdentification10Choice> value) {
			obj.setSubPayingAgent(value);
		}
	};
	@XmlElement(name = "Regar")
	protected PartyIdentification10Choice registrar;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Regar"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party/agent responsible for maintaining the register of a security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REGR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>> mmRegistrar = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "Regar";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REGR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			definition = "Party/agent responsible for maintaining the register of a security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getRegistrar();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setRegistrar(value.orElse(null));
		}
	};
	@XmlElement(name = "RsellngAgt")
	protected List<PartyIdentification10Choice> resellingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsellngAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResellingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::RESA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>> mmResellingAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>>() {
		{
			xmlTag = "RsellngAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::RESA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResellingAgent";
			definition = "A broker-dealer responsible for reselling to new investors securities (usually bonds) that have been tendered for purchase by their owner.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public List<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getResellingAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<PartyIdentification10Choice> value) {
			obj.setResellingAgent(value);
		}
	};
	@XmlElement(name = "PhysSctiesAgt")
	protected PartyIdentification10Choice physicalSecuritiesAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysSctiesAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::PSAG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>> mmPhysicalSecuritiesAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "PhysSctiesAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::PSAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to accept presentations of instruments, usually bonds, for transfer and or exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getPhysicalSecuritiesAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setPhysicalSecuritiesAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DrpAgt")
	protected PartyIdentification10Choice dropAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrpAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DropAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::DROP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>> mmDropAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "DrpAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::DROP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DropAgent";
			definition = "A trust company, bank or similar financial institution who acts on behalf of an out of town agent or event agent where securities can be delivered in person.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getDropAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setDropAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnAgt")
	protected List<PartyIdentification10Choice> solicitationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::SOLA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>> mmSolicitationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<PartyIdentification10Choice>>() {
		{
			xmlTag = "SlctnAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::SOLA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an issuer to maintain records of investors and account balances and transactions for the consent of a material change.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public List<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getSolicitationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<PartyIdentification10Choice> value) {
			obj.setSolicitationAgent(value);
		}
	};
	@XmlElement(name = "InfAgt")
	protected PartyIdentification10Choice informationAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification10Choice
	 * PartyIdentification10Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::INFA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>> mmInformationAgent = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, Optional<PartyIdentification10Choice>>() {
		{
			xmlTag = "InfAgt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::INFA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAgent";
			definition = "A trust company, bank or similar financial institution assigned by an Issuer to provide information and copies of the offering documentation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification10Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification10Choice> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getInformationAgent();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, Optional<PartyIdentification10Choice> value) {
			obj.setInformationAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<Extension2>> mmExtension = new MMMessageBuildingBlock<CorporateActionMovementPreliminaryAdviceV01, List<Extension2>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		@Override
		public List<Extension2> getValue(CorporateActionMovementPreliminaryAdviceV01 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(CorporateActionMovementPreliminaryAdviceV01 obj, List<Extension2> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSafekeepingAccount1Rule.for_seev_CorporateActionMovementPreliminaryAdviceV01,
						com.tools20022.repository.constraints.ConstraintSafekeepingAccount2Rule.for_seev_CorporateActionMovementPreliminaryAdviceV01,
						com.tools20022.repository.constraints.ConstraintOtherEventRule.for_seev_CorporateActionMovementPreliminaryAdviceV01,
						com.tools20022.repository.constraints.ConstraintIntermediateSecuritiesDistributionRule.for_seev_CorporateActionMovementPreliminaryAdviceV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_seev_CorporateActionMovementPreliminaryAdviceV01,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_seev_CorporateActionMovementPreliminaryAdviceV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionMovementPreliminaryAdviceV01";
				definition = "Scope\r\nAn account servicer sends the CorporateActionMovementPreliminaryAdvice message to an account owner or its designated agent to pre-advise upcoming posting or reversal of securities and/or cash postings.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).\nISO 15022 - 20022 COEXISTENCE\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CorpActnMvmntPrlimryAdvc";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmMovementPreliminaryAdviceGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmPreviousMovementPreliminaryAdviceIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmNotificationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmMovementConfirmationIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmInstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmOtherDocumentIdentification, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmEventsLinkage,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmReversalReason, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmCorporateActionMovementDetails,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmAdditionalInformation, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmMessageOriginator,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmMessageRecipient, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmIssuerAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmPayingAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmSubPayingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmRegistrar, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmResellingAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmPhysicalSecuritiesAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmDropAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmSolicitationAgent, com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmInformationAgent,
						com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "035";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionMovementPreliminaryAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification11 getIdentification() {
		return identification;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setIdentification(DocumentIdentification11 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CorporateActionPreliminaryAdviceType1 getMovementPreliminaryAdviceGeneralInformation() {
		return movementPreliminaryAdviceGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setMovementPreliminaryAdviceGeneralInformation(CorporateActionPreliminaryAdviceType1 movementPreliminaryAdviceGeneralInformation) {
		this.movementPreliminaryAdviceGeneralInformation = Objects.requireNonNull(movementPreliminaryAdviceGeneralInformation);
		return this;
	}

	public Optional<DocumentIdentification15> getPreviousMovementPreliminaryAdviceIdentification() {
		return previousMovementPreliminaryAdviceIdentification == null ? Optional.empty() : Optional.of(previousMovementPreliminaryAdviceIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setPreviousMovementPreliminaryAdviceIdentification(DocumentIdentification15 previousMovementPreliminaryAdviceIdentification) {
		this.previousMovementPreliminaryAdviceIdentification = previousMovementPreliminaryAdviceIdentification;
		return this;
	}

	public Optional<DocumentIdentification15> getNotificationIdentification() {
		return notificationIdentification == null ? Optional.empty() : Optional.of(notificationIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setNotificationIdentification(DocumentIdentification15 notificationIdentification) {
		this.notificationIdentification = notificationIdentification;
		return this;
	}

	public Optional<DocumentIdentification15> getMovementConfirmationIdentification() {
		return movementConfirmationIdentification == null ? Optional.empty() : Optional.of(movementConfirmationIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setMovementConfirmationIdentification(DocumentIdentification15 movementConfirmationIdentification) {
		this.movementConfirmationIdentification = movementConfirmationIdentification;
		return this;
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setInstructionIdentification(DocumentIdentification9 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification13> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setOtherDocumentIdentification(List<DocumentIdentification13> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public List<CorporateActionEventReference1> getEventsLinkage() {
		return eventsLinkage == null ? eventsLinkage = new ArrayList<>() : eventsLinkage;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setEventsLinkage(List<CorporateActionEventReference1> eventsLinkage) {
		this.eventsLinkage = Objects.requireNonNull(eventsLinkage);
		return this;
	}

	public Optional<CorporateActionReversalReason1> getReversalReason() {
		return reversalReason == null ? Optional.empty() : Optional.of(reversalReason);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setReversalReason(CorporateActionReversalReason1 reversalReason) {
		this.reversalReason = reversalReason;
		return this;
	}

	public CorporateActionGeneralInformation3 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setCorporateActionGeneralInformation(CorporateActionGeneralInformation3 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public AccountIdentification7Choice getAccountDetails() {
		return accountDetails;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setAccountDetails(AccountIdentification7Choice accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public List<CorporateActionOption10> getCorporateActionMovementDetails() {
		return corporateActionMovementDetails == null ? corporateActionMovementDetails = new ArrayList<>() : corporateActionMovementDetails;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setCorporateActionMovementDetails(List<CorporateActionOption10> corporateActionMovementDetails) {
		this.corporateActionMovementDetails = Objects.requireNonNull(corporateActionMovementDetails);
		return this;
	}

	public Optional<CorporateActionNarrative6> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setAdditionalInformation(CorporateActionNarrative6 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setMessageOriginator(PartyIdentification10Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return messageRecipient == null ? Optional.empty() : Optional.of(messageRecipient);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setMessageRecipient(PartyIdentification10Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
		return this;
	}

	public List<PartyIdentification10Choice> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setIssuerAgent(List<PartyIdentification10Choice> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<PartyIdentification10Choice> getPayingAgent() {
		return payingAgent == null ? payingAgent = new ArrayList<>() : payingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setPayingAgent(List<PartyIdentification10Choice> payingAgent) {
		this.payingAgent = Objects.requireNonNull(payingAgent);
		return this;
	}

	public List<PartyIdentification10Choice> getSubPayingAgent() {
		return subPayingAgent == null ? subPayingAgent = new ArrayList<>() : subPayingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setSubPayingAgent(List<PartyIdentification10Choice> subPayingAgent) {
		this.subPayingAgent = Objects.requireNonNull(subPayingAgent);
		return this;
	}

	public Optional<PartyIdentification10Choice> getRegistrar() {
		return registrar == null ? Optional.empty() : Optional.of(registrar);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setRegistrar(PartyIdentification10Choice registrar) {
		this.registrar = registrar;
		return this;
	}

	public List<PartyIdentification10Choice> getResellingAgent() {
		return resellingAgent == null ? resellingAgent = new ArrayList<>() : resellingAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setResellingAgent(List<PartyIdentification10Choice> resellingAgent) {
		this.resellingAgent = Objects.requireNonNull(resellingAgent);
		return this;
	}

	public Optional<PartyIdentification10Choice> getPhysicalSecuritiesAgent() {
		return physicalSecuritiesAgent == null ? Optional.empty() : Optional.of(physicalSecuritiesAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setPhysicalSecuritiesAgent(PartyIdentification10Choice physicalSecuritiesAgent) {
		this.physicalSecuritiesAgent = physicalSecuritiesAgent;
		return this;
	}

	public Optional<PartyIdentification10Choice> getDropAgent() {
		return dropAgent == null ? Optional.empty() : Optional.of(dropAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setDropAgent(PartyIdentification10Choice dropAgent) {
		this.dropAgent = dropAgent;
		return this;
	}

	public List<PartyIdentification10Choice> getSolicitationAgent() {
		return solicitationAgent == null ? solicitationAgent = new ArrayList<>() : solicitationAgent;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setSolicitationAgent(List<PartyIdentification10Choice> solicitationAgent) {
		this.solicitationAgent = Objects.requireNonNull(solicitationAgent);
		return this;
	}

	public Optional<PartyIdentification10Choice> getInformationAgent() {
		return informationAgent == null ? Optional.empty() : Optional.of(informationAgent);
	}

	public CorporateActionMovementPreliminaryAdviceV01 setInformationAgent(PartyIdentification10Choice informationAgent) {
		this.informationAgent = informationAgent;
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public CorporateActionMovementPreliminaryAdviceV01 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.01")
	static public class Document {
		@XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
		public CorporateActionMovementPreliminaryAdviceV01 messageBody;
	}
}